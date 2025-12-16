package com.avito.android.tariff.cpx.info.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff.cpx.info.mvi.entity.TariffCpxInfoInternalAction;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import wB0.C49483c;

/* compiled from: TariffCpxInfoReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/info/mvi/q;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction;", "LwB0/c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class q implements u<TariffCpxInfoInternalAction, C49483c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff.cpx.info.mvi.domain.converter.a f296740b;

    @Inject
    public q(@Y61.k com.avito.android.tariff.cpx.info.mvi.domain.converter.a aVar) {
        this.f296740b = aVar;
    }

    public static void b(List list, List list2) {
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C49483c.b.a aVar = (C49483c.b.a) it.next();
            list.add(new com.avito.android.tariff.cpx.info.items.feature.a("feature_item_" + aVar.f441331b, aVar.f441331b, aVar.f441332c, aVar.f441330a, aVar.f441333d, aVar.f441334e));
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.List] */
    public static void c(String str, List list, List list2) {
        Object obj = null;
        if (str != null) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (L.f(((C49483c.b) next).f441328b, str)) {
                    obj = next;
                    break;
                }
            }
            C49483c.b bVar = (C49483c.b) obj;
            if (bVar != null) {
                b(list, bVar.f441329c);
                return;
            }
            return;
        }
        int i12 = 0;
        for (Object obj2 : list2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            C49483c.b bVar2 = (C49483c.b) obj2;
            AttributedText attributedText = bVar2.f441327a;
            if (attributedText != null) {
                list.add(new com.avito.android.tariff.cpx.info.items.features_header.a(AK.c.g(i12, "features_header_item_"), attributedText));
            }
            b(list, bVar2.f441329c);
            i12 = i13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    @Override // com.avito.android.arch.mvi.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final wB0.C49483c a(com.avito.android.tariff.cpx.info.mvi.entity.TariffCpxInfoInternalAction r8, wB0.C49483c r9) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff.cpx.info.mvi.q.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
