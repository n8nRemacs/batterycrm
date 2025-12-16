package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.id3.ApicFrame;
import com.yandex.mobile.ads.exo.metadata.id3.CommentFrame;
import com.yandex.mobile.ads.exo.metadata.id3.Id3Frame;
import com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame;

/* loaded from: classes8.dex */
final class jg0 {

    /* renamed from: a, reason: collision with root package name */
    @j.k0
    static final String[] f386853a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    @j.P
    private static CommentFrame a(int i12, pr0 pr0Var) {
        int iH2 = pr0Var.h();
        if (pr0Var.h() == 1684108385) {
            pr0Var.f(8);
            String strB = pr0Var.b(iH2 - 16);
            return new CommentFrame("und", strB, strB);
        }
        StringBuilder sbA = Cif.a("Failed to parse comment attribute: ");
        sbA.append(gc.a(i12));
        ka0.d("MetadataUtil", sbA.toString());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.yandex.mobile.ads.exo.metadata.id3.Id3Frame b(com.yandex.mobile.ads.impl.pr0 r13) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.jg0.b(com.yandex.mobile.ads.impl.pr0):com.yandex.mobile.ads.exo.metadata.id3.Id3Frame");
    }

    @j.P
    private static TextInformationFrame a(int i12, pr0 pr0Var, String str) {
        int iH2 = pr0Var.h();
        if (pr0Var.h() == 1684108385 && iH2 >= 22) {
            pr0Var.f(10);
            int iZ2 = pr0Var.z();
            if (iZ2 > 0) {
                String strA = ba.a("", iZ2);
                int iZ3 = pr0Var.z();
                if (iZ3 > 0) {
                    strA = strA + "/" + iZ3;
                }
                return new TextInformationFrame(str, null, strA);
            }
        }
        StringBuilder sbA = Cif.a("Failed to parse index/count attribute: ");
        sbA.append(gc.a(i12));
        ka0.d("MetadataUtil", sbA.toString());
        return null;
    }

    @j.P
    private static ApicFrame a(pr0 pr0Var) {
        String str;
        int iH2 = pr0Var.h();
        if (pr0Var.h() == 1684108385) {
            int iH3 = pr0Var.h() & 16777215;
            if (iH3 == 13) {
                str = "image/jpeg";
            } else {
                str = iH3 == 14 ? "image/png" : null;
            }
            if (str == null) {
                j90.a("Unrecognized cover art flags: ", iH3, "MetadataUtil");
                return null;
            }
            pr0Var.f(4);
            int i12 = iH2 - 16;
            byte[] bArr = new byte[i12];
            pr0Var.a(bArr, 0, i12);
            return new ApicFrame(str, null, 3, bArr);
        }
        ka0.d("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    @j.P
    private static Id3Frame a(int i12, String str, pr0 pr0Var, boolean z12, boolean z13) {
        int iMin;
        pr0Var.f(4);
        if (pr0Var.h() == 1684108385) {
            pr0Var.f(8);
            iMin = pr0Var.t();
        } else {
            ka0.d("MetadataUtil", "Failed to parse uint8 attribute value");
            iMin = -1;
        }
        if (z13) {
            iMin = Math.min(1, iMin);
        }
        if (iMin >= 0) {
            if (z12) {
                return new TextInformationFrame(str, null, Integer.toString(iMin));
            }
            return new CommentFrame("und", str, Integer.toString(iMin));
        }
        StringBuilder sbA = Cif.a("Failed to parse uint8 attribute: ");
        sbA.append(gc.a(i12));
        ka0.d("MetadataUtil", sbA.toString());
        return null;
    }

    @j.P
    private static TextInformationFrame b(int i12, pr0 pr0Var, String str) {
        int iH2 = pr0Var.h();
        if (pr0Var.h() == 1684108385) {
            pr0Var.f(8);
            return new TextInformationFrame(str, null, pr0Var.b(iH2 - 16));
        }
        StringBuilder sbA = Cif.a("Failed to parse text attribute: ");
        sbA.append(gc.a(i12));
        ka0.d("MetadataUtil", sbA.toString());
        return null;
    }
}
