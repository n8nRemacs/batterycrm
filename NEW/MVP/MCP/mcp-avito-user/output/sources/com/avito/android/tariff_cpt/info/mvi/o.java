package com.avito.android.tariff_cpt.info.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff_cpt.info.mvi.entity.CptInfoV2InternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import yC0.c;

/* compiled from: CptInfoV2Reducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_cpt/info/mvi/o;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction;", "LyC0/c;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class o implements u<CptInfoV2InternalAction, yC0.c> {
    @Inject
    public o() {
    }

    public static void b(ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c.b bVar = (c.b) it.next();
            arrayList.add(new com.avito.android.tariff_cpt.info.ui.items.feature.a("cpt_info_feature_" + bVar.f442987b, bVar.f442987b, bVar.f442988c, bVar.f442986a, bVar.f442989d, bVar.f442990e));
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.List] */
    public static void c(String str, ArrayList arrayList, List list) {
        Object obj = null;
        if (str != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (L.f(((c.C12894c) next).f442992b, str)) {
                    obj = next;
                    break;
                }
            }
            c.C12894c c12894c = (c.C12894c) obj;
            if (c12894c != null) {
                b(arrayList, c12894c.f442993c);
                return;
            }
            return;
        }
        int i12 = 0;
        for (Object obj2 : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            c.C12894c c12894c2 = (c.C12894c) obj2;
            AttributedText attributedText = c12894c2.f442991a;
            if (attributedText != null) {
                arrayList.add(new com.avito.android.tariff_cpt.info.ui.items.features_header.a(AK.c.g(i12, "cpt_info_features_header_"), attributedText));
            }
            b(arrayList, c12894c2.f442993c);
            i12 = i13;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0552  */
    /* JADX WARN: Type inference failed for: r11v19, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // com.avito.android.arch.mvi.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yC0.c a(com.avito.android.tariff_cpt.info.mvi.entity.CptInfoV2InternalAction r31, yC0.c r32) {
        /*
            Method dump skipped, instructions count: 1567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff_cpt.info.mvi.o.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
