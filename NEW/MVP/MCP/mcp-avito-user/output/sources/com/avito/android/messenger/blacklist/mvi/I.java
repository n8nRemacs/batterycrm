package com.avito.android.messenger.blacklist.mvi;

import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BlacklistPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class I extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H f186371l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(H h12) {
        super(1);
        this.f186371l = h12;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        V2.f318762a.a(this.f186371l.f207131E, "blacklistInteractor.stateObservable subscription encountered an error!", th2);
        return G0.f406611a;
    }
}
