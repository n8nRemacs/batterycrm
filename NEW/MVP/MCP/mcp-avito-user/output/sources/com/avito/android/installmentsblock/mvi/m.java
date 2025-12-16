package com.avito.android.installmentsblock.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.installments_block.entity.InstallmentsBlock;
import com.avito.android.installments_block.entity.InstallmentsBlockStateData;
import com.avito.android.installments_block.entity.InstallmentsLoanTerms;
import dO.InterfaceC39606b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: InstallmentsBlockReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/installmentsblock/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "LdO/b;", "LdO/d;", "<init>", "()V", "_avito_installments-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m implements u<InterfaceC39606b, dO.d> {
    @Inject
    public m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    @Override // com.avito.android.arch.mvi.u
    public final dO.d a(InterfaceC39606b interfaceC39606b, dO.d dVar) {
        InstallmentsLoanTerms.Term term;
        InterfaceC39606b interfaceC39606b2 = interfaceC39606b;
        dO.d dVar2 = dVar;
        if (!(interfaceC39606b2 instanceof InterfaceC39606b.c)) {
            if (!(interfaceC39606b2 instanceof InterfaceC39606b.C11026b)) {
                if (interfaceC39606b2 instanceof InterfaceC39606b.a) {
                    return dVar2;
                }
                throw new NoWhenBranchMatchedException();
            }
            Map<String, InstallmentsBlockStateData> map = dVar2.f393847c;
            String str = ((InterfaceC39606b.C11026b) interfaceC39606b2).f393841a;
            InstallmentsBlockStateData installmentsBlockStateData = map.get(str);
            List<dO.e> list = dVar2.f393846b;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (dO.e eVar : list) {
                arrayList.add(new dO.e(eVar.f393848b, eVar.f393849c, eVar.f393850d, L.f(eVar.f393848b, str)));
            }
            return new dO.d(installmentsBlockStateData, arrayList, map);
        }
        InstallmentsBlock installmentsBlock = ((InterfaceC39606b.c) interfaceC39606b2).f393842a;
        InstallmentsLoanTerms installmentsLoanTerms = installmentsBlock.f172841d;
        int i12 = installmentsLoanTerms != null ? installmentsLoanTerms.f172858b : 0;
        ?? r42 = installmentsBlock.f172842e;
        C42784z0 c42784z0 = null;
        InstallmentsBlockStateData installmentsBlockStateData2 = (installmentsLoanTerms == null || (term = (InstallmentsLoanTerms.Term) installmentsLoanTerms.f172859c.get(i12)) == null) ? null : (InstallmentsBlockStateData) r42.get(term.f172860b);
        if (installmentsBlockStateData2 == null) {
            installmentsBlockStateData2 = installmentsBlock.f172840c;
        }
        if (installmentsLoanTerms != null) {
            ArrayList arrayList2 = installmentsLoanTerms.f172859c;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
            int i13 = 0;
            for (Object obj : arrayList2) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                InstallmentsLoanTerms.Term term2 = (InstallmentsLoanTerms.Term) obj;
                arrayList3.add(new dO.e(term2.f172860b, term2.f172861c, term2.f172862d, i13 == installmentsLoanTerms.f172858b));
                i13 = i14;
            }
            c42784z0 = arrayList3;
        }
        if (c42784z0 == null) {
            c42784z0 = C42784z0.f406748b;
        }
        return new dO.d(installmentsBlockStateData2, c42784z0, r42);
    }
}
