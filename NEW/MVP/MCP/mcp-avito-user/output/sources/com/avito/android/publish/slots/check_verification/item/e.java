package com.avito.android.publish.slots.check_verification.item;

import Cd0.B;
import JO.o;
import JO.p;
import com.avito.android.publish.analytics.C33525k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VerificationItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f243186l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f243187m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, o oVar) {
        super(0);
        this.f243186l = fVar;
        this.f243187m = oVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        f fVar = this.f243186l;
        o oVar = this.f243187m;
        String f8986b = oVar.getF8980b();
        C33525k c33525k = fVar.f243188b;
        c33525k.f232258a.c(new B(f8986b, c33525k.f232259b.a()));
        fVar.f243191e.accept(((p) oVar).f8985g.f8937b);
        return G0.f406611a;
    }
}
