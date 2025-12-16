package com.avito.android.mortgage.verification_flow;

import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import s10.C47959c;

/* compiled from: VerificationFlowScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class p extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f203940l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f203941m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f203942n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(InterfaceC22204y1 interfaceC22204y1, Y41.l lVar, Y41.l lVar2) {
        super(2);
        this.f203940l = interfaceC22204y1;
        this.f203941m = lVar;
        this.f203942n = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            InterfaceC22204y1 interfaceC22204y1 = this.f203940l;
            t.b(((C47959c) interfaceC22204y1.getF42167b()).f437296e, ((C47959c) interfaceC22204y1.getF42167b()).f437297f, this.f203941m, this.f203942n, a13, 72);
        }
        return G0.f406611a;
    }
}
