package com.avito.android.async_phone;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AsyncPhoneView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class q extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.subjects.e<G0> f92287l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(io.reactivex.rxjava3.subjects.e<G0> eVar) {
        super(0);
        this.f92287l = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f92287l.e();
        return G0.f406611a;
    }
}
