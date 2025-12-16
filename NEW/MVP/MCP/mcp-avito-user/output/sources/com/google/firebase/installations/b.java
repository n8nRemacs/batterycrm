package com.google.firebase.installations;

import com.google.android.gms.tasks.InterfaceC37022e;
import com.google.android.gms.tasks.Task;
import j.N;
import java.util.concurrent.CountDownLatch;

/* compiled from: AwaitListener.java */
/* loaded from: classes6.dex */
final class b implements InterfaceC37022e<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f361631b = new CountDownLatch(1);

    @Override // com.google.android.gms.tasks.InterfaceC37022e
    public final void onComplete(@N Task<Void> task) {
        this.f361631b.countDown();
    }
}
