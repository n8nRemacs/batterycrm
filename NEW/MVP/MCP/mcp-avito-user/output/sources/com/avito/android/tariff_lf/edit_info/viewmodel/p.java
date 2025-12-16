package com.avito.android.tariff_lf.edit_info.viewmodel;

import com.avito.android.util.P2;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EditInfoViewModel.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class p extends N implements Y41.l<G0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f299114l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar) {
        super(1);
        this.f299114l = rVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // Y41.l
    public final G0 invoke(G0 g02) {
        r rVar = this.f299114l;
        rVar.f299124Q.dispose();
        rVar.f299124Q = (AtomicReference) rVar.f299117J.a().r0(P2.c.f318721a).j0(rVar.f299119L.e()).v0(new n(rVar), o.f299113b, io.reactivex.rxjava3.internal.functions.a.f401993c);
        return G0.f406611a;
    }
}
