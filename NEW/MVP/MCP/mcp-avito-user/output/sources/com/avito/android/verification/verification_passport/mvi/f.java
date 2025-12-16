package com.avito.android.verification.verification_passport.mvi;

import VM0.a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.verification.verification_passport.CyberityParams;
import com.avito.android.verification.verification_passport.mvi.entity.PassportInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import ru.cyberity.cbr.core.data.model.CBRSDKState;

/* compiled from: PassportActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/verification/verification_passport/mvi/f;", "Lcom/avito/android/arch/mvi/a;", "LVM0/a;", "Lcom/avito/android/verification/verification_passport/mvi/entity/PassportInternalAction;", "LVM0/c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements com.avito.android.arch.mvi.a<VM0.a, PassportInternalAction, VM0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f325728a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CyberityParams f325729b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.verification_passport.b f325730c;

    @Inject
    public f(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k CyberityParams cyberityParams, @Y61.k com.avito.android.verification.verification_passport.b bVar) {
        this.f325728a = interfaceC28373a;
        this.f325729b = cyberityParams;
        this.f325730c = bVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<PassportInternalAction> b(VM0.a aVar, VM0.c cVar) {
        VM0.a aVar2 = aVar;
        if (aVar2 instanceof a.C1175a) {
            CBRSDKState cBRSDKState = ((a.C1175a) aVar2).f17093a;
            return cBRSDKState instanceof CBRSDKState.Failed ? true : cBRSDKState instanceof CBRSDKState.FinallyRejected ? true : cBRSDKState instanceof CBRSDKState.Approved ? C43175k.G(new b(2, null)) : C43175k.w();
        }
        if (aVar2 instanceof a.c) {
            return C43175k.G(new c(((a.c) aVar2).f17096a, this, null));
        }
        if (!(aVar2 instanceof a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        a.b bVar = (a.b) aVar2;
        return C43175k.G(new a(this, bVar.f17095b, bVar.f17094a, null));
    }
}
