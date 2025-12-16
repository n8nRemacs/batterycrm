package com.avito.android.verification.verification_finish.mvi;

import QM0.a;
import com.avito.android.arch.mvi.a;
import com.avito.android.verification.verification_finish.mvi.entity.FinishInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FinishActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/verification/verification_finish/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LQM0/a;", "Lcom/avito/android/verification/verification_finish/mvi/entity/FinishInternalAction;", "LQM0/c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements com.avito.android.arch.mvi.a<QM0.a, FinishInternalAction, QM0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f325277a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.verification_finish.i f325278b;

    @Inject
    public c(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.verification.verification_finish.i iVar) {
        this.f325277a = aVar;
        this.f325278b = iVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<FinishInternalAction> b(QM0.a aVar, QM0.c cVar) {
        QM0.a aVar2 = aVar;
        if (aVar2 instanceof a.c) {
            return C43175k.G(new a(this, aVar2, null));
        }
        if (aVar2.equals(a.d.f13697a)) {
            return this.f325278b.a();
        }
        if (aVar2.equals(a.b.f13695a)) {
            return new C43210w(FinishInternalAction.Close.f325282b);
        }
        if (aVar2 instanceof a.C0900a) {
            return C43175k.G(new b(this, aVar2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
