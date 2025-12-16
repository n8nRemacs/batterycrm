package defpackage;

import android.media.AudioRecord;
import android.text.Spannable;
import android.util.Range;
import android.util.Rational;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public abstract class usi {
    public static int a(g90 g90Var) {
        int i = g90Var.c;
        if (i == -1) {
            gri.a("AudioConfigUtil", "Using default AUDIO source: 5");
            return 5;
        }
        gri.a("AudioConfigUtil", "Using provided AUDIO source: " + i);
        return i;
    }

    public static int b(g90 g90Var) {
        int i = g90Var.b;
        if (i == -1) {
            gri.a("AudioConfigUtil", "Using default AUDIO source format: 2");
            return 2;
        }
        gri.a("AudioConfigUtil", "Using provided AUDIO source format: " + i);
        return i;
    }

    public static int c(int i, int i2, int i3, int i4, int i5, Range range) {
        int iDoubleValue = (int) (new Rational(i4, i5).doubleValue() * new Rational(i2, i3).doubleValue() * i);
        String strConcat = gri.d(3, "AudioConfigUtil") ? String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(iDoubleValue)) : "";
        if (!g90.f.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            iDoubleValue = num.intValue();
            if (gri.d(3, "AudioConfigUtil")) {
                strConcat = strConcat.concat(String.format("\nClamped to range %s -> %dbps", range, num));
            }
        }
        gri.a("AudioConfigUtil", strConcat);
        return iDoubleValue;
    }

    public static int d(Range range, int i, int i2, int i3) {
        ArrayList arrayList = null;
        int i4 = i3;
        int i5 = 0;
        while (true) {
            if (range.contains((Range) Integer.valueOf(i4))) {
                int i6 = d60.n;
                if (i4 > 0 && i > 0) {
                    if (AudioRecord.getMinBufferSize(i4, i == 1 ? 16 : 12, i2) > 0) {
                        return i4;
                    }
                }
                StringBuilder sbK = wy1.k("Sample rate ", i4, "Hz is not supported by audio source with channel count ", i, " and source format ");
                sbK.append(i2);
                gri.a("AudioConfigUtil", sbK.toString());
            } else {
                gri.a("AudioConfigUtil", "Sample rate " + i4 + "Hz is not in target range " + range);
            }
            if (arrayList == null) {
                gri.a("AudioConfigUtil", "Trying common sample rates in proximity order to target " + i3 + "Hz");
                arrayList = new ArrayList(f90.e);
                Collections.sort(arrayList, new y20(i3, 0));
            }
            if (i5 >= arrayList.size()) {
                gri.a("AudioConfigUtil", "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return 44100;
            }
            int i7 = i5 + 1;
            int iIntValue = ((Integer) arrayList.get(i5)).intValue();
            i5 = i7;
            i4 = iIntValue;
        }
    }

    public static final void e(Spannable spannable, ep8 ep8Var, int i, int i2, int i3) {
        Object ipdVar;
        int iB = (i3 & (-16711681)) | ((ep8Var.b() & 255) << 16);
        if (i < 0) {
            i = 0;
        }
        if (i >= spannable.length()) {
            return;
        }
        int length = spannable.length();
        if (i2 > length) {
            i2 = length;
        }
        try {
            ipdVar = (ep8[]) spannable.getSpans(i, i2, ep8Var.getClass());
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (ipdVar instanceof ipd) {
            ipdVar = null;
        }
        ep8[] ep8VarArr = (ep8[]) ipdVar;
        if (ep8VarArr != null && ep8VarArr.length != 0) {
            for (ep8 ep8Var2 : ep8VarArr) {
                ssi.n(spannable, ep8Var2, i, i2);
            }
        }
        try {
            spannable.setSpan(ep8Var, i, i2, iB);
        } catch (Throwable th2) {
            wqi.e("Markdown", "error while try to set span", th2);
        }
    }

    public static final void f(esg esgVar) {
        esgVar.d(494, new b4e(25));
        esgVar.d(495, new b4e(26));
        esgVar.d(496, new b4e(27));
        esgVar.d(497, new b4e(28));
        esgVar.d(498, new b4e(29));
        esgVar.d(499, new rzg(9));
    }
}
