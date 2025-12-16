package com.avito.android.messenger.conversation.mvi.menu;

import com.avito.android.messenger.blacklist_reasons.y;
import io.reactivex.rxjava3.internal.operators.observable.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelMenuInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "isLoaded", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/messenger/blacklist_reasons/y$c;", "apply", "(Z)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.menu.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32112d<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32115g f191426b;

    public C32112d(C32115g c32115g) {
        this.f191426b = c32115g;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return ((Boolean) obj).booleanValue() ? this.f191426b.f191430W.g7().k0(y.c.class) : H0.f403644b;
    }
}
