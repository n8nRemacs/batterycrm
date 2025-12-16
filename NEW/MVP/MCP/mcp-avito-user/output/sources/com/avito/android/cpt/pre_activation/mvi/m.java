package com.avito.android.cpt.pre_activation.mvi;

import Xr.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.cpt.pre_activation.data.PreActivationData;
import com.avito.android.cpt.pre_activation.mvi.entity.PreActivationInternalAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35863o4;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PreActivationReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpt/pre_activation/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/cpt/pre_activation/mvi/entity/PreActivationInternalAction;", "LXr/c;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements u<PreActivationInternalAction, Xr.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f126752b;

    @Inject
    public m(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f126752b = interfaceC35863o4;
    }

    @Override // com.avito.android.arch.mvi.u
    public final Xr.c a(PreActivationInternalAction preActivationInternalAction, Xr.c cVar) {
        PreActivationInternalAction preActivationInternalAction2 = preActivationInternalAction;
        Xr.c cVar2 = cVar;
        if (!(preActivationInternalAction2 instanceof PreActivationInternalAction.Content)) {
            if (!(preActivationInternalAction2 instanceof PreActivationInternalAction.SelectOption)) {
                return cVar2;
            }
            List<c.b> list = cVar2.f19094d;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (c.b bVar : list) {
                arrayList.add(new c.b(bVar.f19099d, bVar.f19096a, bVar.f19097b, bVar.f19098c, L.f(bVar.f19096a, ((PreActivationInternalAction.SelectOption) preActivationInternalAction2).f126735b)));
            }
            return new Xr.c(cVar2.f19092b, cVar2.f19093c, arrayList, cVar2.f19095e);
        }
        PreActivationData preActivationData = ((PreActivationInternalAction.Content) preActivationInternalAction2).f126732b;
        String title = preActivationData.getTitle();
        AttributedText description = preActivationData.getDescription();
        List<PreActivationData.Option> listD = preActivationData.d();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listD, 10));
        int i12 = 0;
        for (Object obj : listD) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            PreActivationData.Option option = (PreActivationData.Option) obj;
            arrayList2.add(new c.b(option.getUri(), this.f126752b.a(), option.getTitle(), option.getDescription(), i12 == 0));
            i12 = i13;
        }
        return new Xr.c(title, description, arrayList2, preActivationData.getButtonTitle());
    }
}
