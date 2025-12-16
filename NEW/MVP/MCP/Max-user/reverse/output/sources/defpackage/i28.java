package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.common.PlaybackException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public abstract class i28 {
    public static final hh7 a;

    static {
        String[] strArr = {MediaMetadataCompat.METADATA_KEY_COMPOSER, MediaMetadataCompat.METADATA_KEY_COMPILATION, MediaMetadataCompat.METADATA_KEY_DATE, MediaMetadataCompat.METADATA_KEY_YEAR, MediaMetadataCompat.METADATA_KEY_GENRE, MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER, MediaMetadataCompat.METADATA_KEY_NUM_TRACKS, MediaMetadataCompat.METADATA_KEY_DISC_NUMBER, MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, MediaMetadataCompat.METADATA_KEY_ART, MediaMetadataCompat.METADATA_KEY_ART_URI, MediaMetadataCompat.METADATA_KEY_ALBUM_ART, MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, MediaMetadataCompat.METADATA_KEY_USER_RATING, MediaMetadataCompat.METADATA_KEY_RATING, MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION, MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, MediaMetadataCompat.METADATA_KEY_MEDIA_ID, MediaMetadataCompat.METADATA_KEY_MEDIA_URI, MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE, MediaMetadataCompat.METADATA_KEY_ADVERTISEMENT, MediaMetadataCompat.METADATA_KEY_DOWNLOAD_STATUS, "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"};
        int i = hh7.c;
        Object[] objArr = new Object[32];
        objArr[0] = MediaMetadataCompat.METADATA_KEY_TITLE;
        objArr[1] = MediaMetadataCompat.METADATA_KEY_ARTIST;
        objArr[2] = MediaMetadataCompat.METADATA_KEY_DURATION;
        objArr[3] = MediaMetadataCompat.METADATA_KEY_ALBUM;
        objArr[4] = MediaMetadataCompat.METADATA_KEY_AUTHOR;
        objArr[5] = MediaMetadataCompat.METADATA_KEY_WRITER;
        System.arraycopy(strArr, 0, objArr, 6, 26);
        a = hh7.i(32, objArr);
    }

    public static long a(f3c f3cVar, x19 x19Var, long j) {
        long j2 = f3cVar == null ? 0L : f3cVar.c;
        long jC = c(f3cVar, x19Var, j);
        long jD = d(x19Var);
        return jD == -9223372036854775807L ? Math.max(jC, j2) : zxg.j(j2, jC, jD);
    }

    public static byte[] b(Bitmap bitmap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long c(f3c f3cVar, x19 x19Var, long j) {
        if (f3cVar == null) {
            return 0L;
        }
        long jMax = f3cVar.b;
        if (f3cVar.a == 3) {
            jMax = Math.max(0L, jMax + ((long) (f3cVar.d * ((j == -9223372036854775807L ? null : Long.valueOf(j)) != null ? r4.longValue() : SystemClock.elapsedRealtime() - f3cVar.Z))));
        }
        long j2 = jMax;
        long jD = d(x19Var);
        return jD == -9223372036854775807L ? Math.max(0L, j2) : zxg.j(j2, 0L, jD);
    }

    public static long d(x19 x19Var) {
        if (x19Var == null || !x19Var.a.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
            return -9223372036854775807L;
        }
        long jA = x19Var.a(MediaMetadataCompat.METADATA_KEY_DURATION);
        if (jA <= 0) {
            return -9223372036854775807L;
        }
        return jA;
    }

    public static long e(int i) {
        switch (i) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                throw new IllegalArgumentException(ho7.f(i, "Unrecognized FolderType: "));
        }
    }

    public static int f(long j) {
        if (j == 0) {
            return 0;
        }
        if (j == 1) {
            return 1;
        }
        if (j == 2) {
            return 2;
        }
        if (j == 3) {
            return 3;
        }
        if (j == 4) {
            return 4;
        }
        if (j == 5) {
            return 5;
        }
        return j == 6 ? 6 : 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.wy8 g(defpackage.k09 r16, android.graphics.Bitmap r17) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i28.g(k09, android.graphics.Bitmap):wy8");
    }

    public static k09 h(wy8 wy8Var) {
        wy8Var.getClass();
        String str = wy8Var.a;
        oz8 oz8Var = new oz8();
        t76 t76Var = wg7.b;
        zjd zjdVar = zjd.o;
        List list = Collections.EMPTY_LIST;
        wz8 wz8Var = new wz8();
        d09 d09Var = d09.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        u5i u5iVar = new u5i();
        u5iVar.a = wy8Var.Z;
        d09 d09Var2 = new d09(u5iVar);
        w19 w19VarJ = j(wy8Var, 0);
        sz8 sz8Var = new sz8(oz8Var);
        yz8 yz8Var = new yz8(wz8Var);
        if (w19VarJ == null) {
            w19VarJ = w19.K;
        }
        return new k09(str2, sz8Var, null, yz8Var, w19VarJ, d09Var2);
    }

    public static k09 i(String str, x19 x19Var, int i) {
        d09 d09Var;
        oz8 oz8Var = new oz8();
        t76 t76Var = wg7.b;
        zjd zjdVar = zjd.o;
        List list = Collections.EMPTY_LIST;
        zjd zjdVar2 = zjd.o;
        wz8 wz8Var = new wz8();
        d09 d09Var2 = d09.d;
        if (str == null) {
            str = null;
        }
        CharSequence charSequence = x19Var.a.getCharSequence(MediaMetadataCompat.METADATA_KEY_MEDIA_URI);
        String string = charSequence != null ? charSequence.toString() : null;
        if (string != null) {
            u5i u5iVar = new u5i();
            u5iVar.a = Uri.parse(string);
            d09Var = new d09(u5iVar);
        } else {
            d09Var = d09Var2;
        }
        w19 w19VarK = k(x19Var, i);
        if (str == null) {
            str = "";
        }
        String str2 = str;
        sz8 sz8Var = new sz8(oz8Var);
        yz8 yz8Var = new yz8(wz8Var);
        if (w19VarK == null) {
            w19VarK = w19.K;
        }
        return new k09(str2, sz8Var, null, yz8Var, w19VarK, d09Var);
    }

    public static w19 j(wy8 wy8Var, int i) {
        j8d j8dVar;
        byte[] bArrB;
        if (wy8Var == null) {
            return w19.K;
        }
        CharSequence charSequence = wy8Var.b;
        u19 u19Var = new u19();
        u19Var.f = wy8Var.c;
        u19Var.g = wy8Var.d;
        u19Var.m = wy8Var.X;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                j8dVar = new j8d(i, -1.0f);
                break;
            default:
                j8dVar = null;
                break;
        }
        u19Var.i = o(j8dVar);
        Bitmap bitmap = wy8Var.o;
        if (bitmap != null) {
            try {
                bArrB = b(bitmap);
            } catch (IOException e) {
                a8i.m("LegacyConversions", "Failed to convert iconBitmap to artworkData", e);
                bArrB = null;
            }
            u19Var.b(bArrB, 3);
        }
        Bundle bundle = wy8Var.Y;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : null;
        if (bundle2 != null && bundle2.containsKey(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE)) {
            u19Var.p = Integer.valueOf(f(bundle2.getLong(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE)));
            bundle2.remove(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE);
        }
        u19Var.q = Boolean.FALSE;
        if (bundle2 != null && bundle2.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            u19Var.G = Integer.valueOf((int) bundle2.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle2.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle2 != null && bundle2.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            u19Var.I = wg7.j(wg7.j(stringArrayList));
        }
        if (bundle2 == null || !bundle2.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            u19Var.a = charSequence;
        } else {
            u19Var.a = bundle2.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            u19Var.e = charSequence;
            bundle2.remove("androidx.media3.mediadescriptioncompat.title");
        }
        if (bundle2 != null && !bundle2.isEmpty()) {
            u19Var.H = bundle2;
        }
        u19Var.r = Boolean.TRUE;
        return new w19(u19Var);
    }

    public static w19 k(x19 x19Var, int i) {
        CharSequence charSequence;
        CharSequence charSequence2;
        j8d j8dVarA;
        j8d j8dVarA2;
        j8d j8dVar;
        String string;
        if (x19Var == null) {
            return w19.K;
        }
        Bundle bundle = x19Var.a;
        u19 u19Var = new u19();
        CharSequence charSequence3 = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE);
        int i2 = 0;
        if (charSequence3 != null) {
            charSequence2 = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE);
            charSequence = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION);
        } else {
            CharSequence[] charSequenceArr = new CharSequence[3];
            int i3 = 0;
            int i4 = 0;
            while (i3 < 3) {
                String[] strArr = x19.d;
                if (i4 >= strArr.length) {
                    break;
                }
                int i5 = i4 + 1;
                CharSequence charSequence4 = bundle.getCharSequence(strArr[i4]);
                if (!TextUtils.isEmpty(charSequence4)) {
                    charSequenceArr[i3] = charSequence4;
                    i3++;
                }
                i4 = i5;
            }
            CharSequence charSequence5 = charSequenceArr[0];
            CharSequence charSequence6 = charSequenceArr[1];
            charSequence = charSequenceArr[2];
            charSequence3 = charSequence5;
            charSequence2 = charSequence6;
        }
        CharSequence charSequence7 = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_TITLE);
        if (charSequence7 == null) {
            charSequence7 = charSequence3;
        }
        u19Var.a = charSequence7;
        u19Var.e = charSequence3;
        u19Var.f = charSequence2;
        u19Var.g = charSequence;
        u19Var.b = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_ARTIST);
        u19Var.c = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_ALBUM);
        u19Var.d = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST);
        Bitmap bitmap = null;
        try {
            j8dVarA = j8d.a(bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_RATING));
        } catch (Exception e) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", e);
            j8dVarA = null;
        }
        u19Var.j = o(j8dVarA);
        if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
            long jA = x19Var.a(MediaMetadataCompat.METADATA_KEY_DURATION);
            if (jA >= 0) {
                u19Var.c(Long.valueOf(jA));
            }
        }
        try {
            j8dVarA2 = j8d.a(bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_USER_RATING));
        } catch (Exception e2) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", e2);
            j8dVarA2 = null;
        }
        g8d g8dVarO = o(j8dVarA2);
        if (g8dVarO != null) {
            u19Var.i = g8dVarO;
        } else {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    j8dVar = new j8d(i, -1.0f);
                    break;
                default:
                    j8dVar = null;
                    break;
            }
            u19Var.i = o(j8dVar);
        }
        if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_YEAR)) {
            u19Var.s = Integer.valueOf((int) x19Var.a(MediaMetadataCompat.METADATA_KEY_YEAR));
        }
        String[] strArr2 = {MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, MediaMetadataCompat.METADATA_KEY_ART_URI};
        int i6 = 0;
        while (true) {
            if (i6 < 3) {
                String str = strArr2[i6];
                if (bundle.containsKey(str)) {
                    CharSequence charSequence8 = bundle.getCharSequence(str);
                    if (charSequence8 != null) {
                        string = charSequence8.toString();
                    }
                } else {
                    i6++;
                }
            }
        }
        string = null;
        if (string != null) {
            u19Var.m = Uri.parse(string);
        }
        String[] strArr3 = {MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, MediaMetadataCompat.METADATA_KEY_ALBUM_ART, MediaMetadataCompat.METADATA_KEY_ART};
        while (true) {
            if (i2 < 3) {
                String str2 = strArr3[i2];
                if (bundle.containsKey(str2)) {
                    try {
                        bitmap = (Bitmap) bundle.getParcelable(str2);
                    } catch (Exception e3) {
                        Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e3);
                    }
                } else {
                    i2++;
                }
            }
        }
        if (bitmap != null) {
            try {
                u19Var.b(b(bitmap), 3);
            } catch (IOException e4) {
                a8i.m("LegacyConversions", "Failed to convert artworkBitmap to artworkData", e4);
            }
        }
        boolean zContainsKey = bundle.containsKey(MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE);
        u19Var.q = Boolean.valueOf(zContainsKey);
        if (zContainsKey) {
            u19Var.p = Integer.valueOf(f(x19Var.a(MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE)));
        }
        if (bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            u19Var.G = Integer.valueOf((int) x19Var.a("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
        }
        u19Var.r = Boolean.TRUE;
        Bundle bundle2 = new Bundle(bundle);
        rrg it = a.iterator();
        while (it.hasNext()) {
            bundle2.remove((String) it.next());
        }
        if (!bundle2.isEmpty()) {
            u19Var.H = bundle2;
        }
        return new w19(u19Var);
    }

    public static x19 l(w19 w19Var, String str, Uri uri, long j, Bitmap bitmap) {
        Long l;
        mc5 mc5Var = new mc5(21);
        mc5Var.C(MediaMetadataCompat.METADATA_KEY_MEDIA_ID, str);
        CharSequence charSequence = w19Var.a;
        Bundle bundle = w19Var.I;
        Integer num = w19Var.p;
        Uri uri2 = w19Var.m;
        if (charSequence != null) {
            mc5Var.D(MediaMetadataCompat.METADATA_KEY_TITLE, charSequence);
        }
        CharSequence charSequence2 = w19Var.e;
        if (charSequence2 != null) {
            mc5Var.D(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, charSequence2);
        }
        CharSequence charSequence3 = w19Var.f;
        if (charSequence3 != null) {
            mc5Var.D(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, charSequence3);
        }
        CharSequence charSequence4 = w19Var.g;
        if (charSequence4 != null) {
            mc5Var.D(MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION, charSequence4);
        }
        CharSequence charSequence5 = w19Var.b;
        if (charSequence5 != null) {
            mc5Var.D(MediaMetadataCompat.METADATA_KEY_ARTIST, charSequence5);
        }
        CharSequence charSequence6 = w19Var.c;
        if (charSequence6 != null) {
            mc5Var.D(MediaMetadataCompat.METADATA_KEY_ALBUM, charSequence6);
        }
        CharSequence charSequence7 = w19Var.d;
        if (charSequence7 != null) {
            mc5Var.D(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, charSequence7);
        }
        if (w19Var.t != null) {
            mc5Var.A(r7.intValue(), MediaMetadataCompat.METADATA_KEY_YEAR);
        }
        if (uri != null) {
            mc5Var.C(MediaMetadataCompat.METADATA_KEY_MEDIA_URI, uri.toString());
        }
        if (uri2 != null) {
            mc5Var.C(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, uri2.toString());
            mc5Var.C(MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, uri2.toString());
            mc5Var.C(MediaMetadataCompat.METADATA_KEY_ART_URI, uri2.toString());
        }
        if (bitmap != null) {
            mc5Var.z(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, bitmap);
            mc5Var.z(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmap);
        }
        if (num != null && num.intValue() != -1) {
            mc5Var.A(e(num.intValue()), MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE);
        }
        if (j == -9223372036854775807L && (l = w19Var.h) != null) {
            j = l.longValue();
        }
        if (j == -9223372036854775807L) {
            j = -1;
        }
        mc5Var.A(j, MediaMetadataCompat.METADATA_KEY_DURATION);
        j8d j8dVarP = p(w19Var.i);
        if (j8dVarP != null) {
            mc5Var.B(MediaMetadataCompat.METADATA_KEY_USER_RATING, j8dVarP);
        }
        j8d j8dVarP2 = p(w19Var.j);
        if (j8dVarP2 != null) {
            mc5Var.B(MediaMetadataCompat.METADATA_KEY_RATING, j8dVarP2);
        }
        if (w19Var.H != null) {
            mc5Var.A(r6.intValue(), "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj == null || (obj instanceof CharSequence)) {
                    mc5Var.D(str2, (CharSequence) obj);
                } else if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                    mc5Var.A(((Number) obj).longValue(), str2);
                }
            }
        }
        return new x19((Bundle) mc5Var.b);
    }

    public static PlaybackException m(f3c f3cVar, Context context) {
        if (f3cVar != null) {
            int i = f3cVar.X;
            if (f3cVar.a == 7) {
                CharSequence charSequenceV = f3cVar.Y;
                if (charSequenceV == null) {
                    charSequenceV = v(context, r(i));
                }
                Bundle bundle = f3cVar.u0;
                String string = charSequenceV != null ? charSequenceV.toString() : null;
                int iR = r(i);
                if (iR == -5) {
                    iR = 2000;
                } else if (iR == -1) {
                    iR = 1000;
                }
                int i2 = iR;
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                return new PlaybackException(string, null, i2, bundle, SystemClock.elapsedRealtime());
            }
        }
        return null;
    }

    public static int n(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                a8i.l("LegacyConversions", "Unrecognized RepeatMode: " + i + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                return 0;
            }
        }
        return i2;
    }

    public static g8d o(j8d j8dVar) {
        if (j8dVar == null) {
            return null;
        }
        float f = j8dVar.b;
        int i = j8dVar.a;
        switch (i) {
            case 1:
                if (j8dVar.c()) {
                    return new a27(i == 1 && f == 1.0f);
                }
                return new a27();
            case 2:
                if (j8dVar.c()) {
                    return new i8g(i == 2 && f == 1.0f);
                }
                return new i8g();
            case 3:
                return j8dVar.c() ? new caf(3, j8dVar.b()) : new caf(3);
            case 4:
                return j8dVar.c() ? new caf(4, j8dVar.b()) : new caf(4);
            case 5:
                return j8dVar.c() ? new caf(5, j8dVar.b()) : new caf(5);
            case 6:
                if (!j8dVar.c()) {
                    return new eqb();
                }
                if (i != 6 || !j8dVar.c()) {
                    f = -1.0f;
                }
                return new eqb(f);
            default:
                return null;
        }
    }

    public static j8d p(g8d g8dVar) {
        if (g8dVar != null) {
            int iU = u(g8dVar);
            if (!g8dVar.b()) {
                switch (iU) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return new j8d(iU, -1.0f);
                    default:
                        return null;
                }
            }
            switch (iU) {
                case 1:
                    return new j8d(1, ((a27) g8dVar).c ? 1.0f : 0.0f);
                case 2:
                    return new j8d(2, ((i8g) g8dVar).c ? 1.0f : 0.0f);
                case 3:
                case 4:
                case 5:
                    return j8d.e(iU, ((caf) g8dVar).c);
                case 6:
                    return j8d.d(((eqb) g8dVar).b);
            }
        }
        return null;
    }

    public static int q(int i) {
        if (i == -1 || i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                a8i.l("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i + " was converted to `Player.REPEAT_MODE_OFF`");
                return 0;
            }
        }
        return i2;
    }

    public static int r(int i) {
        switch (i) {
            case 1:
                return -2;
            case 2:
                return -6;
            case 3:
                return -102;
            case 4:
                return -103;
            case 5:
                return -104;
            case 6:
                return -105;
            case 7:
                return -106;
            case 8:
                return -110;
            case 9:
                return -107;
            case 10:
                return 1;
            case 11:
                return -109;
            default:
                return -1;
        }
    }

    public static boolean s(int i) {
        if (i == -1 || i == 0) {
            return false;
        }
        if (i == 1 || i == 2) {
            return true;
        }
        throw new IllegalArgumentException(ho7.f(i, "Unrecognized ShuffleMode: "));
    }

    public static int t(k20 k20Var) {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setContentType(k20Var.a);
        builder.setFlags(k20Var.b);
        builder.setUsage(k20Var.c);
        AudioAttributes audioAttributesBuild = builder.build();
        audioAttributesBuild.getClass();
        int flags = audioAttributesBuild.getFlags();
        audioAttributesBuild.getClass();
        int usage = audioAttributesBuild.getUsage();
        int i = 1;
        if ((flags & 1) != 1) {
            if ((flags & 4) != 4) {
                switch (usage) {
                    case 2:
                        i = 0;
                        break;
                    case 3:
                        i = 8;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        i = 5;
                        break;
                    case 6:
                        i = 2;
                        break;
                    case 11:
                        i = 10;
                        break;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                    default:
                        i = 3;
                        break;
                    case 13:
                        break;
                }
            } else {
                i = 6;
            }
        } else {
            i = 7;
        }
        if (i == Integer.MIN_VALUE) {
            return 3;
        }
        return i;
    }

    public static int u(g8d g8dVar) {
        if (g8dVar instanceof a27) {
            return 1;
        }
        if (g8dVar instanceof i8g) {
            return 2;
        }
        if (!(g8dVar instanceof caf)) {
            return g8dVar instanceof eqb ? 6 : 0;
        }
        int i = ((caf) g8dVar).b;
        int i2 = 3;
        if (i != 3) {
            i2 = 4;
            if (i != 4) {
                i2 = 5;
                if (i != 5) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public static String v(Context context, int i) {
        if (i == -100) {
            return context.getString(y3d.error_message_disconnected);
        }
        if (i == 1) {
            return context.getString(y3d.error_message_info_cancelled);
        }
        if (i == -6) {
            return context.getString(y3d.error_message_not_supported);
        }
        if (i == -5) {
            return context.getString(y3d.error_message_io);
        }
        if (i == -4) {
            return context.getString(y3d.error_message_permission_denied);
        }
        if (i == -3) {
            return context.getString(y3d.error_message_bad_value);
        }
        if (i == -2) {
            return context.getString(y3d.error_message_invalid_state);
        }
        switch (i) {
            case -110:
                return context.getString(y3d.error_message_content_already_playing);
            case -109:
                return context.getString(y3d.error_message_end_of_playlist);
            case -108:
                return context.getString(y3d.error_message_setup_required);
            case -107:
                return context.getString(y3d.error_message_skip_limit_reached);
            case -106:
                return context.getString(y3d.error_message_not_available_in_region);
            case -105:
                return context.getString(y3d.error_message_parental_control_restricted);
            case -104:
                return context.getString(y3d.error_message_concurrent_stream_limit);
            case -103:
                return context.getString(y3d.error_message_premium_account_required);
            case -102:
                return context.getString(y3d.error_message_authentication_expired);
            default:
                return context.getString(y3d.error_message_fallback);
        }
    }

    public static boolean w(long j, long j2) {
        return (j & j2) != 0;
    }
}
