package com.google.mlkit.common.sdkinternal;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* renamed from: com.google.mlkit.common.sdkinternal.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37632a {

    /* renamed from: a, reason: collision with root package name */
    public final ReferenceQueue f362330a = new ReferenceQueue();

    /* renamed from: b, reason: collision with root package name */
    public final Set f362331b = Collections.synchronizedSet(new HashSet());

    /* compiled from: com.google.mlkit:common@@18.10.0 */
    /* renamed from: com.google.mlkit.common.sdkinternal.a$a, reason: collision with other inner class name */
    public interface InterfaceC10741a {
    }

    @j.N
    @RX0.a
    public static C37632a a() {
        C37632a c37632a = new C37632a();
        r rVar = new Runnable() { // from class: com.google.mlkit.common.sdkinternal.r
            @Override // java.lang.Runnable
            public final void run() {
            }
        };
        final ReferenceQueue referenceQueue = c37632a.f362330a;
        u uVar = new u(c37632a, referenceQueue, c37632a.f362331b, rVar, null);
        final Set set = c37632a.f362331b;
        set.add(uVar);
        Thread thread = new Thread(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.s
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                while (!set.isEmpty()) {
                    try {
                        u uVar2 = (u) referenceQueue2.remove();
                        if (uVar2.f362389b.remove(uVar2)) {
                            uVar2.clear();
                            uVar2.f362390c.run();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return c37632a;
    }
}
