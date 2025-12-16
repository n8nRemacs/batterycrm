package com.avito.android.messenger.blacklist.mvi;

import com.avito.android.messenger.blacklist.mvi.H.b;
import com.avito.android.messenger.blacklist.mvi.InterfaceC31683m;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BlacklistPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/m$a;", "newState", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/blacklist/mvi/m$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class K<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f186373b;

    public K(H h12) {
        this.f186373b = h12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        H h12 = this.f186373b;
        h12.le().s(h12.new b((InterfaceC31683m.a) obj));
    }
}
