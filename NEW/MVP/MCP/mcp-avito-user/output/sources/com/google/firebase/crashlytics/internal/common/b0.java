package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.InterfaceC37020c;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import ru.rustore.sdk.core.tasks.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements InterfaceC37020c, ru.rustore.sdk.core.tasks.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f360959b;

    public /* synthetic */ b0(CountDownLatch countDownLatch) {
        this.f360959b = countDownLatch;
    }

    @Override // ru.rustore.sdk.core.tasks.c
    public void a(Throwable th2) {
        f.a aVar = ru.rustore.sdk.core.tasks.f.f436778d;
        this.f360959b.countDown();
    }

    @Override // com.google.android.gms.tasks.InterfaceC37020c
    public Object then(Task task) {
        ExecutorService executorService = e0.f360968a;
        this.f360959b.countDown();
        return null;
    }
}
