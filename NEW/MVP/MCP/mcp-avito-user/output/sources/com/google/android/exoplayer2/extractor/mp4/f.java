package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.util.F;
import j.P;
import j.k0;

/* compiled from: MetadataUtil.java */
/* loaded from: classes6.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    @k0
    public static final String[] f344828a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    @P
    public static TextInformationFrame a(int i12, F f12, String str) {
        int iD2 = f12.d();
        if (f12.d() == 1684108385 && iD2 >= 22) {
            f12.C(10);
            int iW2 = f12.w();
            if (iW2 > 0) {
                String strG = AK.c.g(iW2, "");
                int iW3 = f12.w();
                if (iW3 > 0) {
                    strG = strG + "/" + iW3;
                }
                return new TextInformationFrame(str, null, strG);
            }
        }
        a.a(i12);
        return null;
    }

    @P
    public static TextInformationFrame b(int i12, F f12, String str) {
        int iD2 = f12.d();
        if (f12.d() == 1684108385) {
            f12.C(8);
            return new TextInformationFrame(str, null, f12.n(iD2 - 16));
        }
        a.a(i12);
        return null;
    }

    @P
    public static Id3Frame c(int i12, String str, F f12, boolean z12, boolean z13) {
        int iMin;
        f12.C(4);
        if (f12.d() == 1684108385) {
            f12.C(8);
            iMin = f12.r();
        } else {
            iMin = -1;
        }
        if (z13) {
            iMin = Math.min(1, iMin);
        }
        if (iMin >= 0) {
            return z12 ? new TextInformationFrame(str, null, Integer.toString(iMin)) : new CommentFrame("und", str, Integer.toString(iMin));
        }
        a.a(i12);
        return null;
    }
}
