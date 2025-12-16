package com.avito.android.mortgage.sign.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.mortgage.sign.mvi.entity.SignInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import o10.InterfaceC44504b;

/* compiled from: SignActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/sign/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lo10/b;", "Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction;", "Lo10/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC44504b, SignInternalAction, o10.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.sign.files.a f203763a;

    @Inject
    public a(@Y61.k com.avito.android.mortgage.sign.files.a aVar) {
        this.f203763a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SignInternalAction> b(InterfaceC44504b interfaceC44504b, o10.d dVar) {
        C43210w c43210w;
        InterfaceC44504b interfaceC44504b2 = interfaceC44504b;
        o10.d dVar2 = dVar;
        if (interfaceC44504b2 instanceof InterfaceC44504b.c) {
            return new C43210w(new SignInternalAction.PathEnded(((InterfaceC44504b.c) interfaceC44504b2).f419297a));
        }
        if (interfaceC44504b2 instanceof InterfaceC44504b.C12156b) {
            InterfaceC44504b.C12156b c12156b = (InterfaceC44504b.C12156b) interfaceC44504b2;
            return new C43210w(new SignInternalAction.PointDrawed(c12156b.f419295a, c12156b.f419296b));
        }
        if (interfaceC44504b2 instanceof InterfaceC44504b.a) {
            c43210w = new C43210w(SignInternalAction.SignCleared.f203781b);
        } else {
            if (interfaceC44504b2 instanceof InterfaceC44504b.d) {
                InterfaceC44504b.d dVar3 = (InterfaceC44504b.d) interfaceC44504b2;
                return this.f203763a.a(dVar2.f419305b, dVar3.f419298a, dVar3.f419299b, dVar2.f419309f, dVar2.f419310g, dVar2.f419311h);
            }
            if (!(interfaceC44504b2 instanceof InterfaceC44504b.e)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(SignInternalAction.DrawingStarted.f203775b);
        }
        return c43210w;
    }
}
