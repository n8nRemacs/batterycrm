package com.avito.android.iac_incoming_call_ability.impl_module.iac_enable;

import kotlin.Metadata;

/* compiled from: IacSettingsInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class l<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f168314b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f168315c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f168316d;

    public l(m mVar, boolean z12, boolean z13) {
        this.f168314b = mVar;
        this.f168315c = z12;
        this.f168316d = z13;
    }

    @Override // l41.g
    public final void accept(@Y61.k Object obj) {
        m mVar = this.f168314b;
        com.jakewharton.rxrelay3.c<Boolean> cVar = mVar.f168320d;
        boolean z12 = this.f168315c;
        cVar.accept(Boolean.valueOf(z12));
        OL.a aVar = mVar.f168318b;
        aVar.d(z12);
        mVar.f168319c.f(z12);
        if (this.f168316d) {
            aVar.o(!z12);
        }
    }
}
