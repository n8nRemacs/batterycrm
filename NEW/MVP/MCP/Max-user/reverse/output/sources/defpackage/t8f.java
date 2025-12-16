package defpackage;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class t8f extends b2f {
    public static final Pattern r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean m;
    public final ye n;
    public LinkedHashMap o;
    public float p = -3.4028235E38f;
    public float q = -3.4028235E38f;

    public t8f(List list) throws NumberFormatException {
        if (list == null || list.isEmpty()) {
            this.m = false;
            this.n = null;
            return;
        }
        this.m = true;
        String strM = xxg.m((byte[]) list.get(0));
        fsi.b(strM.startsWith("Format:"));
        ye yeVarB = ye.b(strM);
        yeVarB.getClass();
        this.n = yeVarB;
        i(new qyg((byte[]) list.get(1)));
    }

    public static int h(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    public static long j(String str) {
        Matcher matcher = r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i = xxg.a;
        return (Long.parseLong(matcher.group(4)) * WorkRequest.MIN_BACKOFF_MILLIS) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    @Override // defpackage.b2f
    public final gof e(int i, boolean z, byte[] bArr) throws NumberFormatException {
        qyg qygVar;
        ye yeVar;
        float f;
        int i2;
        float f2;
        int i3;
        Layout.Alignment alignment;
        int i4;
        int i5;
        float f3;
        float f4;
        float f5;
        boolean z2;
        float f6;
        int i6;
        float f7;
        int i7;
        int i8;
        int iA;
        int i9;
        t8f t8fVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        qyg qygVar2 = new qyg(i, bArr);
        boolean z3 = t8fVar.m;
        if (!z3) {
            t8fVar.i(qygVar2);
        }
        ye yeVarB = z3 ? t8fVar.n : null;
        while (true) {
            String strG = qygVar2.g();
            if (strG == null) {
                return new vhb(arrayList, arrayList2, false, 10);
            }
            if (strG.startsWith("Format:")) {
                yeVarB = ye.b(strG);
            } else if (strG.startsWith("Dialogue:")) {
                if (yeVarB == null) {
                    Log.w("SsaDecoder", strG.length() != 0 ? "Skipping dialogue line before complete format: ".concat(strG) : new String("Skipping dialogue line before complete format: "));
                } else {
                    int i10 = yeVarB.e;
                    fsi.b(strG.startsWith("Dialogue:"));
                    String[] strArrSplit = strG.substring(9).split(",", i10);
                    if (strArrSplit.length != i10) {
                        Log.w("SsaDecoder", strG.length() != 0 ? "Skipping dialogue line with fewer columns than format: ".concat(strG) : new String("Skipping dialogue line with fewer columns than format: "));
                    } else {
                        long j = j(strArrSplit[yeVarB.a]);
                        if (j == -9223372036854775807L) {
                            Log.w("SsaDecoder", strG.length() != 0 ? "Skipping invalid timing: ".concat(strG) : new String("Skipping invalid timing: "));
                        } else {
                            long j2 = j(strArrSplit[yeVarB.b]);
                            if (j2 == -9223372036854775807L) {
                                Log.w("SsaDecoder", strG.length() != 0 ? "Skipping invalid timing: ".concat(strG) : new String("Skipping invalid timing: "));
                            } else {
                                LinkedHashMap linkedHashMap = t8fVar.o;
                                z8f z8fVar = (linkedHashMap == null || (i9 = yeVarB.c) == -1) ? null : (z8f) linkedHashMap.get(strArrSplit[i9].trim());
                                String str = strArrSplit[yeVarB.d];
                                Matcher matcher = x8f.a.matcher(str);
                                int i11 = -1;
                                PointF pointF = null;
                                while (matcher.find()) {
                                    qyg qygVar3 = qygVar2;
                                    String strGroup = matcher.group(1);
                                    strGroup.getClass();
                                    try {
                                        PointF pointFA = x8f.a(strGroup);
                                        if (pointFA != null) {
                                            pointF = pointFA;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    try {
                                        Matcher matcher2 = x8f.d.matcher(strGroup);
                                        if (matcher2.find()) {
                                            String strGroup2 = matcher2.group(1);
                                            strGroup2.getClass();
                                            iA = z8f.a(strGroup2);
                                        } else {
                                            iA = -1;
                                        }
                                        if (iA != -1) {
                                            i11 = iA;
                                        }
                                    } catch (RuntimeException unused2) {
                                    }
                                    qygVar2 = qygVar3;
                                }
                                qygVar = qygVar2;
                                String strReplace = x8f.a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                float f8 = t8fVar.p;
                                float f9 = t8fVar.q;
                                SpannableString spannableString = new SpannableString(strReplace);
                                if (z8fVar != null) {
                                    boolean z4 = z8fVar.f;
                                    Integer num = z8fVar.c;
                                    if (num != null) {
                                        z2 = z4;
                                        yeVar = yeVarB;
                                        f = f8;
                                        spannableString.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                    } else {
                                        z2 = z4;
                                        yeVar = yeVarB;
                                        f = f8;
                                    }
                                    float f10 = z8fVar.d;
                                    if (f10 == -3.4028235E38f || f9 == -3.4028235E38f) {
                                        f6 = -3.4028235E38f;
                                        i6 = Integer.MIN_VALUE;
                                    } else {
                                        f6 = f10 / f9;
                                        i6 = 1;
                                    }
                                    boolean z5 = z8fVar.e;
                                    if (z5 && z2) {
                                        f7 = f6;
                                        i7 = i6;
                                        i8 = 33;
                                        i2 = 0;
                                        spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                    } else {
                                        f7 = f6;
                                        i7 = i6;
                                        i8 = 33;
                                        i2 = 0;
                                        if (z5) {
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        } else if (z2) {
                                            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                        }
                                    }
                                    if (z8fVar.g) {
                                        spannableString.setSpan(new UnderlineSpan(), i2, spannableString.length(), i8);
                                    }
                                    if (z8fVar.h) {
                                        spannableString.setSpan(new StrikethroughSpan(), i2, spannableString.length(), i8);
                                    }
                                    i3 = i7;
                                    f2 = f7;
                                } else {
                                    yeVar = yeVarB;
                                    f = f8;
                                    i2 = 0;
                                    f2 = -3.4028235E38f;
                                    i3 = Integer.MIN_VALUE;
                                }
                                int i12 = -1;
                                if (i11 != -1) {
                                    i12 = i11;
                                } else if (z8fVar != null) {
                                    i12 = z8fVar.b;
                                }
                                switch (i12) {
                                    case 0:
                                    default:
                                        az1.s("Unknown alignment: ", 30, i12, "SsaDecoder");
                                    case -1:
                                        alignment = null;
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                        alignment = Layout.Alignment.ALIGN_NORMAL;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        alignment = Layout.Alignment.ALIGN_CENTER;
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                        break;
                                }
                                int i13 = Integer.MIN_VALUE;
                                switch (i12) {
                                    case 0:
                                    default:
                                        az1.s("Unknown alignment: ", 30, i12, "SsaDecoder");
                                    case -1:
                                        i2 = Integer.MIN_VALUE;
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        i2 = 1;
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        i2 = 2;
                                        break;
                                }
                                switch (i12) {
                                    case -1:
                                        break;
                                    case 0:
                                    default:
                                        az1.s("Unknown alignment: ", 30, i12, "SsaDecoder");
                                        break;
                                    case 1:
                                    case 2:
                                    case 3:
                                        i13 = 2;
                                        break;
                                    case 4:
                                    case 5:
                                    case 6:
                                        i13 = 1;
                                        break;
                                    case 7:
                                    case 8:
                                    case 9:
                                        i13 = 0;
                                        break;
                                }
                                if (pointF == null || f9 == -3.4028235E38f || f == -3.4028235E38f) {
                                    if (i2 != 0) {
                                        i5 = 1;
                                        if (i2 != 1) {
                                            i4 = 2;
                                            f3 = i2 != 2 ? -3.4028235E38f : 0.95f;
                                        } else {
                                            i4 = 2;
                                            f3 = 0.5f;
                                        }
                                    } else {
                                        i4 = 2;
                                        i5 = 1;
                                        f3 = 0.05f;
                                    }
                                    f4 = i13 != 0 ? i13 != i5 ? i13 != i4 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f;
                                    f5 = f3;
                                } else {
                                    f5 = pointF.x / f;
                                    f4 = pointF.y / f9;
                                }
                                gb4 gb4Var = new gb4(spannableString, alignment, null, null, f4, 0, i13, f5, i2, i3, f2, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                int iH = h(j2, arrayList2, arrayList);
                                for (int iH2 = h(j, arrayList2, arrayList); iH2 < iH; iH2++) {
                                    ((List) arrayList.get(iH2)).add(gb4Var);
                                }
                                t8fVar = this;
                                qygVar2 = qygVar;
                                yeVarB = yeVar;
                            }
                        }
                    }
                }
                qygVar = qygVar2;
                yeVar = yeVarB;
                t8fVar = this;
                qygVar2 = qygVar;
                yeVarB = yeVar;
            } else {
                qygVar = qygVar2;
                yeVar = yeVarB;
                t8fVar = this;
                qygVar2 = qygVar;
                yeVarB = yeVar;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(defpackage.qyg r28) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t8f.i(qyg):void");
    }
}
