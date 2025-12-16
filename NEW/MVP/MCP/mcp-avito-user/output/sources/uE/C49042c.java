package ue;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.MaskInfo;
import com.avito.android.util.C35843m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: MasksFormatter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lue/c;", "Lue/b;", "_avito_formatters-provider_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ue.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49042c implements InterfaceC49041b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<MaskInfo> f440194a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f440195b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Y41.l<C49040a, G0> f440196c;

    /* JADX WARN: Multi-variable type inference failed */
    public C49042c(@k List<MaskInfo> list, boolean z12, @l Y41.l<? super C49040a, G0> lVar) {
        this.f440194a = list;
        this.f440195b = z12;
        this.f440196c = lVar;
    }

    @Override // com.avito.android.util.InterfaceC35945t1
    public final String a(String str) {
        String str2 = str;
        return str2 == null ? "" : c(0, str2).f318924a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final C35843m0 b(C35843m0 c35843m0, boolean z12) {
        int i12;
        Object next;
        C49040a c49040a;
        Object objValueOf;
        String upperCase = c35843m0.f318924a;
        int length = upperCase.length();
        Y41.l<C49040a, G0> lVar = this.f440196c;
        if (length == 0) {
            if (lVar != null) {
                lVar.invoke(null);
            }
            return c35843m0;
        }
        List<MaskInfo> list = this.f440194a;
        if (list.isEmpty()) {
            return c35843m0;
        }
        if (this.f440195b) {
            upperCase = upperCase.toUpperCase(Locale.getDefault());
        }
        List<MaskInfo> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i12 = c35843m0.f318925b;
            if (!zHasNext) {
                break;
            }
            MaskInfo maskInfo = (MaskInfo) it.next();
            StringBuilder sb2 = new StringBuilder(maskInfo.getMask().length());
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            boolean z13 = false;
            while (i13 <= C43066x.F(upperCase) && i14 <= C43066x.F(maskInfo.getMask())) {
                char cCharAt = maskInfo.getMask().charAt(i14);
                char cCharAt2 = upperCase.charAt(i13);
                if (maskInfo.isConstrainedPlaceholder(cCharAt)) {
                    if (maskInfo.isCharacterMatchesToConstraints(cCharAt, cCharAt2)) {
                        sb2.append(cCharAt2);
                        i14++;
                    } else if (!z13) {
                        z13 = true;
                        i15 = i13;
                    }
                    i13++;
                } else {
                    if (z12) {
                        sb2.append(cCharAt);
                        if (cCharAt2 == cCharAt) {
                            i13++;
                        } else if (i12 > i13) {
                            i16++;
                        }
                    }
                    i14++;
                }
            }
            int length2 = !z13 ? upperCase.length() : i15;
            String string = sb2.toString();
            Map<String, String> symbolsMap = maskInfo.getSymbolsMap();
            ArrayList arrayList2 = new ArrayList(string.length());
            for (int i17 = 0; i17 < string.length(); i17++) {
                char cCharAt3 = string.charAt(i17);
                if (symbolsMap == null || (objValueOf = (String) symbolsMap.get(String.valueOf(cCharAt3))) == null) {
                    objValueOf = Character.valueOf(cCharAt3);
                }
                arrayList2.add(objValueOf);
            }
            arrayList.add(new C49040a(upperCase, maskInfo, C42745f0.O(arrayList2, "", null, null, null, 62), i12 + i16, length2));
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int i18 = ((C49040a) next).f440193e;
                do {
                    Object next2 = it2.next();
                    int i19 = ((C49040a) next2).f440193e;
                    if (i18 < i19) {
                        next = next2;
                        i18 = i19;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        C49040a c49040a2 = (C49040a) next;
        int i22 = c49040a2 != null ? c49040a2.f440193e : 0;
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next3 = it3.next();
            if (((C49040a) next3).f440193e == i22) {
                arrayList3.add(next3);
            }
        }
        Iterator it4 = arrayList3.iterator();
        if (it4.hasNext()) {
            ?? next4 = it4.next();
            if (it4.hasNext()) {
                int length3 = ((C49040a) next4).f440191c.length();
                do {
                    Object next5 = it4.next();
                    int length4 = ((C49040a) next5).f440191c.length();
                    next4 = next4;
                    if (length3 < length4) {
                        next4 = next5;
                        length3 = length4;
                    }
                } while (it4.hasNext());
            }
            c49040a = next4;
        } else {
            c49040a = null;
        }
        C49040a c49040a3 = c49040a;
        if (lVar != null) {
            lVar.invoke(c49040a3);
        }
        String str = c49040a3 != null ? c49040a3.f440191c : "";
        if (c49040a3 != null) {
            i12 = c49040a3.f440192d;
        }
        return new C35843m0(str, i12);
    }

    @k
    public final C35843m0 c(int i12, @l String str) {
        return str == null ? new C35843m0("", 0) : b(new C35843m0(str, i12), true);
    }

    public /* synthetic */ C49042c(List list, boolean z12, Y41.l lVar, int i12, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? null : lVar);
    }
}
