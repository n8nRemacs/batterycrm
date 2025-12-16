package ca1;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* renamed from: ca1.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C27138d implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.passport.ui.address.f f57938b;

    public C27138d(ru.mts.biometry.sdk.feature.passport.ui.address.f fVar) {
        this.f57938b = fVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        AbstractC27149o abstractC27149o = (AbstractC27149o) obj;
        boolean z12 = abstractC27149o instanceof C27146l;
        ru.mts.biometry.sdk.feature.passport.ui.address.f fVar = this.f57938b;
        if (z12) {
            int i12 = ru.mts.biometry.sdk.feature.passport.ui.address.f.f436482i0;
            B91.n nVarB5 = fVar.b5();
            H91.g.b(nVarB5.f1150d);
            H91.g.b(nVarB5.f1148b);
        } else if (abstractC27149o instanceof C27148n) {
            int i13 = ru.mts.biometry.sdk.feature.passport.ui.address.f.f436482i0;
            B91.n nVarB52 = fVar.b5();
            H91.g.b(nVarB52.f1150d);
            H91.g.c(nVarB52.f1148b);
        } else if (abstractC27149o instanceof C27147m) {
            int i14 = ru.mts.biometry.sdk.feature.passport.ui.address.f.f436482i0;
            B91.n nVarB53 = fVar.b5();
            H91.g.b(nVarB53.f1150d);
            H91.g.b(nVarB53.f1148b);
        } else if (abstractC27149o instanceof C27145k) {
            int i15 = ru.mts.biometry.sdk.feature.passport.ui.address.f.f436482i0;
            B91.n nVarB54 = fVar.b5();
            RecyclerView recyclerView = nVarB54.f1150d;
            H91.g.c(recyclerView);
            fVar.f436485h0.m(((C27145k) abstractC27149o).f57949a);
            recyclerView.A0(0);
            H91.g.b(nVarB54.f1148b);
        }
        return G0.f406611a;
    }
}
