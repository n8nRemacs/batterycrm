package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.mlkit_common.zzbg;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.mlkit:common@@18.10.0 */
@RX0.a
/* renamed from: com.google.mlkit.common.sdkinternal.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37643l extends zzbg {

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadLocal f362341c = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public final ThreadPoolExecutor f362342b;

    public C37643l() {
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.google.mlkit.common.sdkinternal.A
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return threadFactoryDefaultThreadFactory.newThread(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        C37643l.f362341c.set(new ArrayDeque());
                        runnable.run();
                    }
                });
            }
        });
        this.f362342b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbg, com.google.android.gms.internal.mlkit_common.zzai
    @j.N
    public final /* synthetic */ Object a() {
        return this.f362342b;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbg
    @j.N
    public final ThreadPoolExecutor b() {
        return this.f362342b;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbg, java.util.concurrent.Executor
    public final void execute(@j.N final Runnable runnable) {
        Deque deque = (Deque) f362341c.get();
        if (deque == null || deque.size() > 1) {
            this.f362342b.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.z
                @Override // java.lang.Runnable
                public final void run() {
                    Deque deque2 = (Deque) C37643l.f362341c.get();
                    C36729v.j(deque2);
                    Runnable runnable2 = runnable;
                    deque2.add(runnable2);
                    if (deque2.size() <= 1) {
                        do {
                            runnable2.run();
                            deque2.removeFirst();
                            runnable2 = (Runnable) deque2.peekFirst();
                        } while (runnable2 != null);
                    }
                }
            });
            return;
        }
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }
}
