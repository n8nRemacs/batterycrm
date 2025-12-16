package com.yandex.mobile.ads.impl;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.mobile.ads.impl.r61;
import com.yandex.mobile.ads.impl.vm;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class p61 extends d41 {

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f388733r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: m, reason: collision with root package name */
    private final boolean f388734m;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    private final q61 f388735n;

    /* renamed from: o, reason: collision with root package name */
    private LinkedHashMap f388736o;

    /* renamed from: p, reason: collision with root package name */
    private float f388737p = -3.4028235E38f;

    /* renamed from: q, reason: collision with root package name */
    private float f388738q = -3.4028235E38f;

    public p61(@j.P List<byte[]> list) throws NumberFormatException {
        if (list == null || list.isEmpty()) {
            this.f388734m = false;
            this.f388735n = null;
            return;
        }
        this.f388734m = true;
        String strA = pc1.a(list.get(0));
        db.a(strA.startsWith("Format:"));
        this.f388735n = (q61) db.a(q61.a(strA));
        a(new pr0(list.get(1)));
    }

    @Override // com.yandex.mobile.ads.impl.d41
    public final t71 a(byte[] bArr, int i12, boolean z12) throws NumberFormatException {
        pr0 pr0Var;
        q61 q61Var;
        long j12;
        Layout.Alignment alignment;
        int i13;
        int i14;
        int i15;
        int i16;
        p61 p61Var = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        pr0 pr0Var2 = new pr0(i12, bArr);
        if (!p61Var.f388734m) {
            p61Var.a(pr0Var2);
        }
        q61 q61VarA = p61Var.f388734m ? p61Var.f388735n : null;
        while (true) {
            String strJ = pr0Var2.j();
            if (strJ == null) {
                return new s61(arrayList, arrayList2);
            }
            if (strJ.startsWith("Format:")) {
                q61VarA = q61.a(strJ);
            } else if (strJ.startsWith("Dialogue:")) {
                if (q61VarA == null) {
                    yk1.a("Skipping dialogue line before complete format: ", strJ, "SsaDecoder");
                } else {
                    db.a(strJ.startsWith("Dialogue:"));
                    String[] strArrSplit = strJ.substring(9).split(",", q61VarA.f389095e);
                    if (strArrSplit.length != q61VarA.f389095e) {
                        yk1.a("Skipping dialogue line with fewer columns than format: ", strJ, "SsaDecoder");
                    } else {
                        long jA2 = a(strArrSplit[q61VarA.f389091a]);
                        if (jA2 == -9223372036854775807L) {
                            yk1.a("Skipping invalid timing: ", strJ, "SsaDecoder");
                        } else {
                            long jA3 = a(strArrSplit[q61VarA.f389092b]);
                            if (jA3 == -9223372036854775807L) {
                                yk1.a("Skipping invalid timing: ", strJ, "SsaDecoder");
                            } else {
                                LinkedHashMap linkedHashMap = p61Var.f388736o;
                                r61 r61Var = (linkedHashMap == null || (i16 = q61VarA.f389093c) == -1) ? null : (r61) linkedHashMap.get(strArrSplit[i16].trim());
                                String str = strArrSplit[q61VarA.f389094d];
                                r61.b bVarA = r61.b.a(str);
                                String strReplace = r61.b.c(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                float f12 = p61Var.f388737p;
                                float f13 = p61Var.f388738q;
                                SpannableString spannableString = new SpannableString(strReplace);
                                vm.a aVarA = new vm.a().a(spannableString);
                                if (r61Var != null) {
                                    pr0Var = pr0Var2;
                                    if (r61Var.f389398c != null) {
                                        q61Var = q61VarA;
                                        j12 = jA3;
                                        spannableString.setSpan(new ForegroundColorSpan(r61Var.f389398c.intValue()), 0, spannableString.length(), 33);
                                    } else {
                                        q61Var = q61VarA;
                                        j12 = jA3;
                                    }
                                    if (r61Var.f389405j == 3 && r61Var.f389399d != null) {
                                        spannableString.setSpan(new BackgroundColorSpan(r61Var.f389399d.intValue()), 0, spannableString.length(), 33);
                                    }
                                    float f14 = r61Var.f389400e;
                                    if (f14 != -3.4028235E38f && f13 != -3.4028235E38f) {
                                        aVarA.b(1, f14 / f13);
                                    }
                                    boolean z13 = r61Var.f389401f;
                                    if (z13 && r61Var.f389402g) {
                                        i14 = 0;
                                        i15 = 33;
                                        spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                    } else {
                                        i14 = 0;
                                        i15 = 33;
                                        if (z13) {
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        } else if (r61Var.f389402g) {
                                            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                        }
                                    }
                                    if (r61Var.f389403h) {
                                        spannableString.setSpan(new UnderlineSpan(), i14, spannableString.length(), i15);
                                    }
                                    if (r61Var.f389404i) {
                                        spannableString.setSpan(new StrikethroughSpan(), i14, spannableString.length(), i15);
                                    }
                                } else {
                                    pr0Var = pr0Var2;
                                    q61Var = q61VarA;
                                    j12 = jA3;
                                }
                                int i17 = bVarA.f389421a;
                                int i18 = i17 != -1 ? i17 : r61Var != null ? r61Var.f389397b : -1;
                                switch (i18) {
                                    case 0:
                                    default:
                                        j90.a("Unknown alignment: ", i18, "SsaDecoder");
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
                                vm.a aVarB = aVarA.b(alignment);
                                int i19 = BeduinInputModel.MIN_TEXT_VERSION;
                                switch (i18) {
                                    case 0:
                                    default:
                                        j90.a("Unknown alignment: ", i18, "SsaDecoder");
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
                                vm.a aVarB2 = aVarB.b(i13);
                                switch (i18) {
                                    case -1:
                                        break;
                                    case 0:
                                    default:
                                        j90.a("Unknown alignment: ", i18, "SsaDecoder");
                                        break;
                                    case 1:
                                    case 2:
                                    case 3:
                                        i19 = 2;
                                        break;
                                    case 4:
                                    case 5:
                                    case 6:
                                        i19 = 1;
                                        break;
                                    case 7:
                                    case 8:
                                    case 9:
                                        i19 = 0;
                                        break;
                                }
                                aVarB2.a(i19);
                                PointF pointF = bVarA.f389422b;
                                if (pointF == null || f13 == -3.4028235E38f || f12 == -3.4028235E38f) {
                                    int iD2 = aVarA.d();
                                    aVarA.b(iD2 != 0 ? iD2 != 1 ? iD2 != 2 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f);
                                    int iC2 = aVarA.c();
                                    aVarA.a(0, iC2 != 0 ? iC2 != 1 ? iC2 != 2 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f);
                                } else {
                                    aVarA.b(pointF.x / f12);
                                    aVarA.a(0, bVarA.f389422b.y / f13);
                                }
                                vm vmVarA = aVarA.a();
                                int iA2 = a(j12, arrayList2, arrayList);
                                for (int iA3 = a(jA2, arrayList2, arrayList); iA3 < iA2; iA3++) {
                                    ((List) arrayList.get(iA3)).add(vmVarA);
                                }
                                p61Var = this;
                                pr0Var2 = pr0Var;
                                q61VarA = q61Var;
                            }
                        }
                    }
                }
                pr0Var = pr0Var2;
                q61Var = q61VarA;
                p61Var = this;
                pr0Var2 = pr0Var;
                q61VarA = q61Var;
            } else {
                pr0Var = pr0Var2;
                q61Var = q61VarA;
                p61Var = this;
                pr0Var2 = pr0Var;
                q61VarA = q61Var;
            }
        }
    }

    private void a(pr0 pr0Var) throws NumberFormatException {
        while (true) {
            String strJ = pr0Var.j();
            if (strJ == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strJ)) {
                while (true) {
                    String strJ2 = pr0Var.j();
                    if (strJ2 == null || (pr0Var.a() != 0 && pr0Var.g() == 91)) {
                        break;
                    }
                    String[] strArrSplit = strJ2.split(":");
                    if (strArrSplit.length == 2) {
                        String strB = bb.b(strArrSplit[0].trim());
                        strB.getClass();
                        if (strB.equals("playresx")) {
                            this.f388737p = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strB.equals("playresy")) {
                            try {
                                this.f388738q = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strJ)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r61.a aVarA = null;
                while (true) {
                    String strJ3 = pr0Var.j();
                    if (strJ3 == null || (pr0Var.a() != 0 && pr0Var.g() == 91)) {
                        break;
                    }
                    if (strJ3.startsWith("Format:")) {
                        aVarA = r61.a.a(strJ3);
                    } else if (strJ3.startsWith("Style:")) {
                        if (aVarA == null) {
                            yk1.a("Skipping 'Style:' line before 'Format:' line: ", strJ3, "SsaDecoder");
                        } else {
                            r61 r61VarA = r61.a(strJ3, aVarA);
                            if (r61VarA != null) {
                                linkedHashMap.put(r61VarA.f389396a, r61VarA);
                            }
                        }
                    }
                }
                this.f388736o = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strJ)) {
                ka0.c("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strJ)) {
                return;
            }
        }
    }

    private static long a(String str) {
        Matcher matcher = f388733r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i12 = pc1.f388768a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    private static int a(long j12, ArrayList arrayList, ArrayList arrayList2) {
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
}
