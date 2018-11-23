package com.example.aniqa.funtasticquizapp;

public class Questionnaire {



    public String questions[] = {
            "Happiness can be found even in the darkest of time,if only one remember to turn on the light-dialouge belongs to which movie?",
            "This song belongs to which movie?",
            "Which cartoon character is he?",
            "You maybe wrong,but you may be right",
            "Which is the largest bone in the human body?",
            "this picture remind you of which cartoon character?",
            "Swirl flag belongs to which country?",
            "Statue belongs to which country?",
            "Which two actress have we blended together here?",
            "Dailog belongs to which movie?",
            "Dailog belongs to which movie?",
            "this song of the vedio clip was originally sung by?",
            "Who was the first man to fly around the earth with a spaceship?",
            "Who is the only US President to serve more than two terms?",
            "How many heart does an Octopus have?",
            "Who wrote the famous book- WE THE PEOPLE?",
            "The gas used for artificial ripening of green fruit is?",
            "Who is the first indian woman to win an asian games gold in 400m run",
            "HAKUNA MATATA means?",
            "My greatest strength is the love for my people, my greatest weakness is that i love them too much- a quote by?",
    };

    public String choices[][] = {
            {"Beauty & The Beast", "Oz the Great", "Harry Potter", "Fantastic Beats & Where To Find Them"},
            {"Moana", "Frozen", "Tangled", "Shrek"},
            {"Patrick Star ", "Plankton ", "Benson ", "Sponge Bob"},
            {"Ability","Probability","Expectation","Possibility"},
            {"Skull","Spine","Femur","Ribs"},
            {"Homer Simpson","Bart Simpson","Maggie Simpson","Lisa Simpson"},
            {"United Kingdom","Australia","France","United States"},
            {"Rio De Generio","Cape Town","Hong Kong","Argentina"},
            {"Adele & Taylor Swift","Rebel Wilson & Margot Robie","Penney Fortnite & Zac Effron","Taylor Swift & Kate Winslet"},
            {"Dilwale Dulhania Le Jayenge","Dilwale","Kuch Kuch Hota Hai","Baazi_O_Baazigar"},
            {"The Man In The Iron","Romeo & Juliet","Titanic","Shutter Island"},
            {"Britney Spears","Celine Dion","Madonna","Mariah Caray"},
            {"Galileo","Gagarin","Neil Amstrong","Alan Shepard"},
            {"Abraham Lincon","George Washington","Donald Trump","Franklin D. Roosevelt"},
            {"1","3","2","6"},
            {"T N Kaul","J.R.D Ta Ta","Khushwant Singh","Nani Pulkhivala"},
            {"Ethylen","Ethane","Carbon Dioxide","Acctylene"},
            {"M L Valsamma","P T Usha","Kamaljit Sandhil","K Maleshwari"},
            {"Have a good day.","Have a good life.","Good Morning.","Have a good trip."},
            {"Sheikh Mujibur Rahman","Abraham Lincon","Barack Obama","Vladimir Putin"},

    };


    public String correctAnswer[] = {
            "Harry Potter",
            "Tangled",
            "Sponge Bob ",
            "Possibility",
            "Femur",
            "Bart Simpson",
            "United Kingdom",
            "Rio De Generio",
            "Rebel Wilson & Margot Robie",
            "Dilwale",
            "Titanic",
            "Madonna",
            "Gagarin",
            "Franklin D. Roosevelt",
            "3",
            "Nani Pulkhivala",
            "Ethylen",
            "Kamaljit Sandhil",
            "Have a good day.",
            "Sheikh Mujibur Rahman",
    };

    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }
}
