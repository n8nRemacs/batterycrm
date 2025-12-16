package com.avito.android.tariff_lf_constructor.configure.setting.viewmodel;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* compiled from: ConstructorSettingViewModel.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class E<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f300174b;

    public E(m mVar) {
        this.f300174b = mVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // l41.g
    public final void accept(Object obj) {
        m mVar = this.f300174b;
        String str = mVar.f300198E;
        if (str != null) {
            mVar.f300203N.dispose();
            mVar.f300203N = (AtomicReference) mVar.f300200K.b(str, mVar.f300222g0).j0(mVar.f300201L.e()).v0(new C(mVar), new D(mVar), io.reactivex.rxjava3.internal.functions.a.f401993c);
        }
    }
}
