package androidx.media3.extractor.mp4;

import androidx.media3.common.util.s;
import androidx.media3.common.util.z;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.google.common.collect.AbstractC37401r1;
import j.P;
import j.k0;

/* compiled from: MetadataUtil.java */
/* loaded from: classes.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    @k0
    public static final String[] f51001a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    @P
    public static TextInformationFrame a(int i12, String str, z zVar) {
        int iG2 = zVar.g();
        if (zVar.g() == 1684108385 && iG2 >= 22) {
            zVar.G(10);
            int iZ2 = zVar.z();
            if (iZ2 > 0) {
                String strG = AK.c.g(iZ2, "");
                int iZ3 = zVar.z();
                if (iZ3 > 0) {
                    strG = strG + "/" + iZ3;
                }
                return new TextInformationFrame(str, null, AbstractC37401r1.E(strG));
            }
        }
        a.a(i12);
        s.g();
        return null;
    }

    @P
    public static TextInformationFrame b(int i12, String str, z zVar) {
        int iG2 = zVar.g();
        if (zVar.g() == 1684108385) {
            zVar.G(8);
            return new TextInformationFrame(str, null, AbstractC37401r1.E(zVar.q(iG2 - 16)));
        }
        a.a(i12);
        s.g();
        return null;
    }

    @P
    public static Id3Frame c(int i12, String str, z zVar, boolean z12, boolean z13) {
        int iD2 = d(zVar);
        if (z13) {
            iD2 = Math.min(1, iD2);
        }
        if (iD2 >= 0) {
            return z12 ? new TextInformationFrame(str, null, AbstractC37401r1.E(Integer.toString(iD2))) : new CommentFrame("und", str, Integer.toString(iD2));
        }
        a.a(i12);
        s.g();
        return null;
    }

    public static int d(z zVar) {
        zVar.G(4);
        if (zVar.g() == 1684108385) {
            zVar.G(8);
            return zVar.u();
        }
        s.g();
        return -1;
    }
}
