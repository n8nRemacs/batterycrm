package com.avito.android.messenger.blacklist.mvi;

import com.avito.android.messenger.blacklist.mvi.C31686p.d;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BlacklistInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "notificationQueueWasRestored", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class A<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31686p f186326b;

    public A(C31686p c31686p) {
        this.f186326b = c31686p;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C31686p c31686p = this.f186326b;
        c31686p.le().s(c31686p.new d(zBooleanValue));
    }
}
