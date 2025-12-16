package defpackage;

import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class tei {
    public static final String[] a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static final boolean a(int i, int i2, ynd yndVar) {
        return yndVar == null ? ((float) ((int) (((float) i) * 1.3333334f))) >= 2048.0f && ((int) (((float) i2) * 1.3333334f)) >= 2048 : ((int) (((float) i) * 1.3333334f)) >= yndVar.a && ((int) (((float) i2) * 1.3333334f)) >= yndVar.b;
    }

    public static final boolean b(ce5 ce5Var, ynd yndVar) throws IOException {
        if (ce5Var == null) {
            return false;
        }
        ce5Var.i0();
        int i = ce5Var.c;
        if (i == 90 || i == 270) {
            ce5Var.i0();
            int i2 = ce5Var.X;
            ce5Var.i0();
            return a(i2, ce5Var.o, yndVar);
        }
        ce5Var.i0();
        int i3 = ce5Var.o;
        ce5Var.i0();
        return a(i3, ce5Var.X, yndVar);
    }

    public static eg3 c(int i, qyg qygVar) {
        int iF = qygVar.f();
        if (qygVar.f() == 1684108385) {
            qygVar.F(8);
            String strO = qygVar.o(iF - 16);
            return new eg3("und", strO, strO);
        }
        String strValueOf = String.valueOf(oy.h(i));
        Log.w("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(strValueOf) : new String("Failed to parse comment attribute: "));
        return null;
    }

    public static xm d(qyg qygVar) {
        int iF = qygVar.f();
        if (qygVar.f() != 1684108385) {
            Log.w("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iF2 = qygVar.f() & 16777215;
        String str = iF2 == 13 ? "image/jpeg" : iF2 == 14 ? "image/png" : null;
        if (str == null) {
            az1.s("Unrecognized cover art flags: ", 41, iF2, "MetadataUtil");
            return null;
        }
        qygVar.F(4);
        int i = iF - 16;
        byte[] bArr = new byte[i];
        qygVar.e(0, bArr, i);
        return new xm(str, null, 3, bArr);
    }

    public static g4g e(int i, qyg qygVar, String str) {
        int iF = qygVar.f();
        if (qygVar.f() == 1684108385 && iF >= 22) {
            qygVar.F(10);
            int iX = qygVar.x();
            if (iX > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(iX);
                String string = sb.toString();
                int iX2 = qygVar.x();
                if (iX2 > 0) {
                    String strValueOf = String.valueOf(string);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 12);
                    sb2.append(strValueOf);
                    sb2.append("/");
                    sb2.append(iX2);
                    string = sb2.toString();
                }
                return new g4g(str, null, string);
            }
        }
        String strValueOf2 = String.valueOf(oy.h(i));
        Log.w("MetadataUtil", strValueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(strValueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    public static g4g f(int i, qyg qygVar, String str) {
        int iF = qygVar.f();
        if (qygVar.f() == 1684108385) {
            qygVar.F(8);
            return new g4g(str, null, qygVar.o(iF - 16));
        }
        String strValueOf = String.valueOf(oy.h(i));
        Log.w("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse text attribute: ".concat(strValueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    public static mc7 g(int i, String str, qyg qygVar, boolean z, boolean z2) {
        int iH = h(qygVar);
        if (z2) {
            iH = Math.min(1, iH);
        }
        if (iH >= 0) {
            return z ? new g4g(str, null, Integer.toString(iH)) : new eg3("und", str, Integer.toString(iH));
        }
        String strValueOf = String.valueOf(oy.h(i));
        Log.w("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(strValueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    public static int h(qyg qygVar) {
        qygVar.F(4);
        if (qygVar.f() == 1684108385) {
            qygVar.F(8);
            return qygVar.s();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
