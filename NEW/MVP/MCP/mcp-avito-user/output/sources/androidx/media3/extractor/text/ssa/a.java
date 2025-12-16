package androidx.media3.extractor.text.ssa;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.common.text.a;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.common.util.s;
import androidx.media3.common.util.z;
import androidx.media3.extractor.text.ssa.c;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.common.base.C37262f;
import j.P;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: SsaDecoder.java */
@J
/* loaded from: classes.dex */
public final class a extends androidx.media3.extractor.text.d {

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f51317t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: o, reason: collision with root package name */
    public final boolean f51318o;

    /* renamed from: p, reason: collision with root package name */
    @P
    public final b f51319p;

    /* renamed from: q, reason: collision with root package name */
    public LinkedHashMap f51320q;

    /* renamed from: r, reason: collision with root package name */
    public float f51321r;

    /* renamed from: s, reason: collision with root package name */
    public float f51322s;

    public a() {
        this(null);
    }

    public static int j(long j12, ArrayList arrayList, ArrayList arrayList2) {
        int i12;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i12 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j12) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j12) {
                i12 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i12, Long.valueOf(j12));
        arrayList2.add(i12, i12 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i12 - 1)));
        return i12;
    }

    public static long l(String str) {
        Matcher matcher = f51317t.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i12 = M.f47887a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    @Override // androidx.media3.extractor.text.d
    public final androidx.media3.extractor.text.e i(int i12, byte[] bArr, boolean z12) throws NumberFormatException {
        z zVar;
        Charset charset;
        b bVar;
        long j12;
        Layout.Alignment alignment;
        int i13;
        int i14;
        int i15;
        float f12;
        int i16;
        int i17;
        Integer num;
        int iA2;
        int i18;
        a aVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        z zVar2 = new z(bArr, i12);
        Charset charsetB = zVar2.B();
        if (charsetB == null) {
            charsetB = C37262f.f359034c;
        }
        boolean z13 = aVar.f51318o;
        if (!z13) {
            aVar.k(zVar2, charsetB);
        }
        b bVarA = z13 ? aVar.f51319p : null;
        while (true) {
            String strH = zVar2.h(charsetB);
            if (strH == null) {
                return new d(arrayList, arrayList2);
            }
            if (strH.startsWith("Format:")) {
                bVarA = b.a(strH);
            } else if (strH.startsWith("Dialogue:")) {
                if (bVarA == null) {
                    "Skipping dialogue line before complete format: ".concat(strH);
                    s.g();
                } else {
                    C23110a.b(strH.startsWith("Dialogue:"));
                    String strSubstring = strH.substring(9);
                    int i19 = bVarA.f51327e;
                    String[] strArrSplit = strSubstring.split(",", i19);
                    if (strArrSplit.length != i19) {
                        "Skipping dialogue line with fewer columns than format: ".concat(strH);
                        s.g();
                    } else {
                        long jL2 = l(strArrSplit[bVarA.f51323a]);
                        if (jL2 == -9223372036854775807L) {
                            "Skipping invalid timing: ".concat(strH);
                            s.g();
                        } else {
                            long jL3 = l(strArrSplit[bVarA.f51324b]);
                            if (jL3 == -9223372036854775807L) {
                                "Skipping invalid timing: ".concat(strH);
                                s.g();
                            } else {
                                LinkedHashMap linkedHashMap = aVar.f51320q;
                                c cVar = (linkedHashMap == null || (i18 = bVarA.f51325c) == -1) ? null : (c) linkedHashMap.get(strArrSplit[i18].trim());
                                String str = strArrSplit[bVarA.f51326d];
                                Matcher matcher = c.b.f51349a.matcher(str);
                                int i22 = -1;
                                PointF pointF = null;
                                while (matcher.find()) {
                                    z zVar3 = zVar2;
                                    String strGroup = matcher.group(1);
                                    strGroup.getClass();
                                    try {
                                        PointF pointFA = c.b.a(strGroup);
                                        if (pointFA != null) {
                                            pointF = pointFA;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    try {
                                        Matcher matcher2 = c.b.f51352d.matcher(strGroup);
                                        if (matcher2.find()) {
                                            String strGroup2 = matcher2.group(1);
                                            strGroup2.getClass();
                                            iA2 = c.a(strGroup2);
                                        } else {
                                            iA2 = -1;
                                        }
                                        if (iA2 != -1) {
                                            i22 = iA2;
                                        }
                                    } catch (RuntimeException unused2) {
                                    }
                                    zVar2 = zVar3;
                                }
                                zVar = zVar2;
                                String strReplace = c.b.f51349a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                float f13 = aVar.f51321r;
                                float f14 = aVar.f51322s;
                                SpannableString spannableString = new SpannableString(strReplace);
                                a.c cVar2 = new a.c();
                                cVar2.f47839a = spannableString;
                                if (cVar != null) {
                                    Integer num2 = cVar.f51330c;
                                    charset = charsetB;
                                    if (num2 != null) {
                                        bVar = bVarA;
                                        j12 = jL3;
                                        spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                    } else {
                                        bVar = bVarA;
                                        j12 = jL3;
                                    }
                                    if (cVar.f51337j == 3 && (num = cVar.f51331d) != null) {
                                        spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                    }
                                    float f15 = cVar.f51332e;
                                    if (f15 != -3.4028235E38f && f14 != -3.4028235E38f) {
                                        cVar2.f47849k = f15 / f14;
                                        cVar2.f47848j = 1;
                                    }
                                    boolean z14 = cVar.f51334g;
                                    boolean z15 = cVar.f51333f;
                                    if (z15 && z14) {
                                        i16 = 0;
                                        i17 = 33;
                                        spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                    } else {
                                        i16 = 0;
                                        i17 = 33;
                                        if (z15) {
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        } else if (z14) {
                                            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                        }
                                    }
                                    if (cVar.f51335h) {
                                        spannableString.setSpan(new UnderlineSpan(), i16, spannableString.length(), i17);
                                    }
                                    if (cVar.f51336i) {
                                        spannableString.setSpan(new StrikethroughSpan(), i16, spannableString.length(), i17);
                                    }
                                } else {
                                    charset = charsetB;
                                    bVar = bVarA;
                                    j12 = jL3;
                                }
                                int i23 = -1;
                                if (i22 != -1) {
                                    i23 = i22;
                                } else if (cVar != null) {
                                    i23 = cVar.f51329b;
                                }
                                switch (i23) {
                                    case 0:
                                    default:
                                        s.g();
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
                                cVar2.f47841c = alignment;
                                int i24 = BeduinInputModel.MIN_TEXT_VERSION;
                                switch (i23) {
                                    case 0:
                                    default:
                                        s.g();
                                    case -1:
                                        i13 = Integer.MIN_VALUE;
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                        i13 = 0;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        i13 = 1;
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        i13 = 2;
                                        break;
                                }
                                cVar2.f47847i = i13;
                                switch (i23) {
                                    case -1:
                                        break;
                                    case 0:
                                    default:
                                        s.g();
                                        break;
                                    case 1:
                                    case 2:
                                    case 3:
                                        i24 = 2;
                                        break;
                                    case 4:
                                    case 5:
                                    case 6:
                                        i24 = 1;
                                        break;
                                    case 7:
                                    case 8:
                                    case 9:
                                        i24 = 0;
                                        break;
                                }
                                cVar2.f47845g = i24;
                                if (pointF == null || f14 == -3.4028235E38f || f13 == -3.4028235E38f) {
                                    int i25 = cVar2.f47847i;
                                    if (i25 != 0) {
                                        i14 = 1;
                                        if (i25 != 1) {
                                            i15 = 2;
                                            f12 = i25 != 2 ? -3.4028235E38f : 0.95f;
                                        } else {
                                            i15 = 2;
                                            f12 = 0.5f;
                                        }
                                    } else {
                                        i14 = 1;
                                        i15 = 2;
                                        f12 = 0.05f;
                                    }
                                    cVar2.f47846h = f12;
                                    cVar2.f47843e = i24 != 0 ? i24 != i14 ? i24 != i15 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f;
                                    cVar2.f47844f = 0;
                                } else {
                                    cVar2.f47846h = pointF.x / f13;
                                    cVar2.f47843e = pointF.y / f14;
                                    cVar2.f47844f = 0;
                                }
                                androidx.media3.common.text.a aVarA = cVar2.a();
                                int iJ2 = j(j12, arrayList2, arrayList);
                                for (int iJ3 = j(jL2, arrayList2, arrayList); iJ3 < iJ2; iJ3++) {
                                    ((List) arrayList.get(iJ3)).add(aVarA);
                                }
                                aVar = this;
                                zVar2 = zVar;
                                charsetB = charset;
                                bVarA = bVar;
                            }
                        }
                    }
                }
                zVar = zVar2;
                charset = charsetB;
                bVar = bVarA;
                aVar = this;
                zVar2 = zVar;
                charsetB = charset;
                bVarA = bVar;
            } else {
                zVar = zVar2;
                charset = charsetB;
                bVar = bVarA;
                aVar = this;
                zVar2 = zVar;
                charsetB = charset;
                bVarA = bVar;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(androidx.media3.common.util.z r37, java.nio.charset.Charset r38) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ssa.a.k(androidx.media3.common.util.z, java.nio.charset.Charset):void");
    }

    public a(@P List<byte[]> list) throws NumberFormatException {
        super("SsaDecoder");
        this.f51321r = -3.4028235E38f;
        this.f51322s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f51318o = false;
            this.f51319p = null;
            return;
        }
        this.f51318o = true;
        String strO = M.o(list.get(0));
        C23110a.b(strO.startsWith("Format:"));
        b bVarA = b.a(strO);
        bVarA.getClass();
        this.f51319p = bVarA;
        k(new z(list.get(1)), C37262f.f359034c);
    }
}
