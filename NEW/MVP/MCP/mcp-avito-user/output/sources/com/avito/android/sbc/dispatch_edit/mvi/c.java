package com.avito.android.sbc.dispatch_edit.mvi;

import Wo0.InterfaceC15786b;
import Xo0.InterfaceC17032a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.sbc.dispatch_edit.mvi.entity.SbcDispatchEditInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SbcDispatchEditActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/sbc/dispatch_edit/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LWo0/b;", "Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction;", "LWo0/d;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC15786b, SbcDispatchEditInternalAction, Wo0.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC17032a f260110a;

    /* renamed from: b, reason: collision with root package name */
    public final long f260111b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f260112c;

    @Inject
    public c(@Y61.k InterfaceC17032a interfaceC17032a, long j12, @Y61.k R0 r02) {
        this.f260110a = interfaceC17032a;
        this.f260111b = j12;
        this.f260112c = r02;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SbcDispatchEditInternalAction> b(InterfaceC15786b interfaceC15786b, Wo0.d dVar) {
        C43210w c43210w;
        InterfaceC15786b interfaceC15786b2 = interfaceC15786b;
        Wo0.d dVar2 = dVar;
        if (interfaceC15786b2 instanceof InterfaceC15786b.c) {
            return new C43210w(new SbcDispatchEditInternalAction.CheckClicked(((InterfaceC15786b.c) interfaceC15786b2).f18054a));
        }
        if (interfaceC15786b2 instanceof InterfaceC15786b.C1285b) {
            c43210w = new C43210w(SbcDispatchEditInternalAction.CheckAllClicked.f260125b);
        } else {
            if (!(interfaceC15786b2 instanceof InterfaceC15786b.a)) {
                if (!(interfaceC15786b2 instanceof InterfaceC15786b.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                return C43175k.I(this.f260112c.a(), new C43152f0(C43175k.G(new a(dVar2, this, null)), new b(3, null)));
            }
            c43210w = new C43210w(SbcDispatchEditInternalAction.NavigateBack.f260128b);
        }
        return c43210w;
    }
}
