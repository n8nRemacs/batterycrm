package com.avito.android.profile.edit;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: EditProfileView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class T extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.B<G0> f222010l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(io.reactivex.rxjava3.core.B<G0> b12) {
        super(0);
        this.f222010l = b12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        io.reactivex.rxjava3.core.B<G0> b12 = this.f222010l;
        if (!b12.getF318621e()) {
            b12.onNext(G0.f406611a);
        }
        return G0.f406611a;
    }
}
