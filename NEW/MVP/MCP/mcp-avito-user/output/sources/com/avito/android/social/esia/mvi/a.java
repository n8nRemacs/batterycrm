package com.avito.android.social.esia.mvi;

import Yw0.InterfaceC18341a;
import Yw0.InterfaceC18342b;
import Yw0.InterfaceC18344d;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EsiaAuthActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/social/esia/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LYw0/a;", "LYw0/b;", "LYw0/d;", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC18341a, InterfaceC18342b, InterfaceC18344d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f284392a;

    @Inject
    public a(@Y61.k c cVar) {
        this.f284392a = cVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC18342b> b(InterfaceC18341a interfaceC18341a, InterfaceC18344d interfaceC18344d) {
        if (!interfaceC18341a.equals(InterfaceC18341a.C1407a.f19742a)) {
            throw new NoWhenBranchMatchedException();
        }
        c cVar = this.f284392a;
        cVar.getClass();
        return C43175k.I(cVar.f284395b.a(), new C43152f0(C43175k.G(new d(cVar, null)), new e(3, null)));
    }
}
