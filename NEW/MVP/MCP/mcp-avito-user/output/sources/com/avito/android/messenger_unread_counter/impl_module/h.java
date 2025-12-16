package com.avito.android.messenger_unread_counter.impl_module;

import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import pZ.C47037b;
import pZ.InterfaceC47038c;

/* compiled from: UnreadMessagesCounterRelay.kt */
@Singleton
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger_unread_counter/impl_module/h;", "LpZ/c;", "LpZ/d;", "<init>", "()V", "_avito_messenger-unread-counter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ContributesBinding.b
/* loaded from: classes15.dex */
public final class h implements InterfaceC47038c, pZ.d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<C47037b> f197729a = new com.jakewharton.rxrelay3.b<>();

    @Inject
    public h() {
    }

    @Override // pZ.d
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final com.jakewharton.rxrelay3.b getF197729a() {
        return this.f197729a;
    }

    @Override // pZ.InterfaceC47038c
    public final void b(@Y61.k C47037b c47037b) {
        this.f197729a.accept(c47037b);
    }
}
