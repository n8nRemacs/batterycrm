package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.b;
import gZ0.InterfaceC40638a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes13.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.firebase.components.p<ScheduledExecutorService> f360797a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.firebase.components.p<ScheduledExecutorService> f360798b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.firebase.components.p<ScheduledExecutorService> f360799c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.firebase.components.p<ScheduledExecutorService> f360800d;

    static {
        final int i12 = 0;
        f360797a = new com.google.firebase.components.p<>(new wZ0.b() { // from class: com.google.firebase.concurrent.j
            @Override // wZ0.b
            public final Object get() {
                switch (i12) {
                    case 0:
                        com.google.firebase.components.p<ScheduledExecutorService> pVar = ExecutorsRegistrar.f360797a;
                        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                        builderDetectNetwork.detectResourceMismatches();
                        builderDetectNetwork.detectUnbufferedIo();
                        return new h(Executors.newFixedThreadPool(4, new b("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), ExecutorsRegistrar.f360800d.get());
                    case 1:
                        com.google.firebase.components.p<ScheduledExecutorService> pVar2 = ExecutorsRegistrar.f360797a;
                        return new h(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new b("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), ExecutorsRegistrar.f360800d.get());
                    case 2:
                        com.google.firebase.components.p<ScheduledExecutorService> pVar3 = ExecutorsRegistrar.f360797a;
                        return new h(Executors.newCachedThreadPool(new b("Firebase Blocking", 11, null)), ExecutorsRegistrar.f360800d.get());
                    default:
                        com.google.firebase.components.p<ScheduledExecutorService> pVar4 = ExecutorsRegistrar.f360797a;
                        return Executors.newSingleThreadScheduledExecutor(new b("Firebase Scheduler", 0, null));
                }
            }
        });
        final int i13 = 1;
        f360798b = new com.google.firebase.components.p<>(new wZ0.b() { // from class: com.google.firebase.concurrent.j
            @Override // wZ0.b
            public final Object get() {
                switch (i13) {
                    case 0:
                        com.google.firebase.components.p<ScheduledExecutorService> pVar = ExecutorsRegistrar.f360797a;
                        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                        builderDetectNetwork.detectResourceMismatches();
                        builderDetectNetwork.detectUnbufferedIo();
                        return new h(Executors.newFixedThreadPool(4, new b("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), ExecutorsRegistrar.f360800d.get());
                    case 1:
                        com.google.firebase.components.p<ScheduledExecutorService> pVar2 = ExecutorsRegistrar.f360797a;
                        return new h(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new b("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), ExecutorsRegistrar.f360800d.get());
                    case 2:
                        com.google.firebase.components.p<ScheduledExecutorService> pVar3 = ExecutorsRegistrar.f360797a;
                        return new h(Executors.newCachedThreadPool(new b("Firebase Blocking", 11, null)), ExecutorsRegistrar.f360800d.get());
                    default:
                        com.google.firebase.components.p<ScheduledExecutorService> pVar4 = ExecutorsRegistrar.f360797a;
                        return Executors.newSingleThreadScheduledExecutor(new b("Firebase Scheduler", 0, null));
                }
            }
        });
        final int i14 = 2;
        f360799c = new com.google.firebase.components.p<>(new wZ0.b() { // from class: com.google.firebase.concurrent.j
            @Override // wZ0.b
            public final Object get() {
                switch (i14) {
                    case 0:
                        com.google.firebase.components.p<ScheduledExecutorService> pVar = ExecutorsRegistrar.f360797a;
                        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                        builderDetectNetwork.detectResourceMismatches();
                        builderDetectNetwork.detectUnbufferedIo();
                        return new h(Executors.newFixedThreadPool(4, new b("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), ExecutorsRegistrar.f360800d.get());
                    case 1:
                        com.google.firebase.components.p<ScheduledExecutorService> pVar2 = ExecutorsRegistrar.f360797a;
                        return new h(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new b("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), ExecutorsRegistrar.f360800d.get());
                    case 2:
                        com.google.firebase.components.p<ScheduledExecutorService> pVar3 = ExecutorsRegistrar.f360797a;
                        return new h(Executors.newCachedThreadPool(new b("Firebase Blocking", 11, null)), ExecutorsRegistrar.f360800d.get());
                    default:
                        com.google.firebase.components.p<ScheduledExecutorService> pVar4 = ExecutorsRegistrar.f360797a;
                        return Executors.newSingleThreadScheduledExecutor(new b("Firebase Scheduler", 0, null));
                }
            }
        });
        final int i15 = 3;
        f360800d = new com.google.firebase.components.p<>(new wZ0.b() { // from class: com.google.firebase.concurrent.j
            @Override // wZ0.b
            public final Object get() {
                switch (i15) {
                    case 0:
                        com.google.firebase.components.p<ScheduledExecutorService> pVar = ExecutorsRegistrar.f360797a;
                        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                        builderDetectNetwork.detectResourceMismatches();
                        builderDetectNetwork.detectUnbufferedIo();
                        return new h(Executors.newFixedThreadPool(4, new b("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), ExecutorsRegistrar.f360800d.get());
                    case 1:
                        com.google.firebase.components.p<ScheduledExecutorService> pVar2 = ExecutorsRegistrar.f360797a;
                        return new h(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new b("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), ExecutorsRegistrar.f360800d.get());
                    case 2:
                        com.google.firebase.components.p<ScheduledExecutorService> pVar3 = ExecutorsRegistrar.f360797a;
                        return new h(Executors.newCachedThreadPool(new b("Firebase Blocking", 11, null)), ExecutorsRegistrar.f360800d.get());
                    default:
                        com.google.firebase.components.p<ScheduledExecutorService> pVar4 = ExecutorsRegistrar.f360797a;
                        return Executors.newSingleThreadScheduledExecutor(new b("Firebase Scheduler", 0, null));
                }
            }
        });
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<com.google.firebase.components.b<?>> getComponents() {
        b.C10697b c10697b = new b.C10697b(new com.google.firebase.components.u(InterfaceC40638a.class, ScheduledExecutorService.class), new com.google.firebase.components.u[]{new com.google.firebase.components.u(InterfaceC40638a.class, ExecutorService.class), new com.google.firebase.components.u(InterfaceC40638a.class, Executor.class)}, (b.a) null);
        final int i12 = 0;
        c10697b.f360737f = new com.google.firebase.components.f() { // from class: com.google.firebase.concurrent.k
            @Override // com.google.firebase.components.f
            public final Object a(com.google.firebase.components.c cVar) {
                switch (i12) {
                    case 0:
                        return ExecutorsRegistrar.f360797a.get();
                    case 1:
                        return ExecutorsRegistrar.f360799c.get();
                    case 2:
                        return ExecutorsRegistrar.f360798b.get();
                    default:
                        com.google.firebase.components.p<ScheduledExecutorService> pVar = ExecutorsRegistrar.f360797a;
                        return UiExecutor.f360801b;
                }
            }
        };
        com.google.firebase.components.b bVarB = c10697b.b();
        b.C10697b c10697b2 = new b.C10697b(new com.google.firebase.components.u(gZ0.b.class, ScheduledExecutorService.class), new com.google.firebase.components.u[]{new com.google.firebase.components.u(gZ0.b.class, ExecutorService.class), new com.google.firebase.components.u(gZ0.b.class, Executor.class)}, (b.a) null);
        final int i13 = 1;
        c10697b2.f360737f = new com.google.firebase.components.f() { // from class: com.google.firebase.concurrent.k
            @Override // com.google.firebase.components.f
            public final Object a(com.google.firebase.components.c cVar) {
                switch (i13) {
                    case 0:
                        return ExecutorsRegistrar.f360797a.get();
                    case 1:
                        return ExecutorsRegistrar.f360799c.get();
                    case 2:
                        return ExecutorsRegistrar.f360798b.get();
                    default:
                        com.google.firebase.components.p<ScheduledExecutorService> pVar = ExecutorsRegistrar.f360797a;
                        return UiExecutor.f360801b;
                }
            }
        };
        com.google.firebase.components.b bVarB2 = c10697b2.b();
        b.C10697b c10697b3 = new b.C10697b(new com.google.firebase.components.u(gZ0.c.class, ScheduledExecutorService.class), new com.google.firebase.components.u[]{new com.google.firebase.components.u(gZ0.c.class, ExecutorService.class), new com.google.firebase.components.u(gZ0.c.class, Executor.class)}, (b.a) null);
        final int i14 = 2;
        c10697b3.f360737f = new com.google.firebase.components.f() { // from class: com.google.firebase.concurrent.k
            @Override // com.google.firebase.components.f
            public final Object a(com.google.firebase.components.c cVar) {
                switch (i14) {
                    case 0:
                        return ExecutorsRegistrar.f360797a.get();
                    case 1:
                        return ExecutorsRegistrar.f360799c.get();
                    case 2:
                        return ExecutorsRegistrar.f360798b.get();
                    default:
                        com.google.firebase.components.p<ScheduledExecutorService> pVar = ExecutorsRegistrar.f360797a;
                        return UiExecutor.f360801b;
                }
            }
        };
        com.google.firebase.components.b bVarB3 = c10697b3.b();
        b.C10697b c10697bA = com.google.firebase.components.b.a(new com.google.firebase.components.u(gZ0.d.class, Executor.class));
        final int i15 = 3;
        c10697bA.f360737f = new com.google.firebase.components.f() { // from class: com.google.firebase.concurrent.k
            @Override // com.google.firebase.components.f
            public final Object a(com.google.firebase.components.c cVar) {
                switch (i15) {
                    case 0:
                        return ExecutorsRegistrar.f360797a.get();
                    case 1:
                        return ExecutorsRegistrar.f360799c.get();
                    case 2:
                        return ExecutorsRegistrar.f360798b.get();
                    default:
                        com.google.firebase.components.p<ScheduledExecutorService> pVar = ExecutorsRegistrar.f360797a;
                        return UiExecutor.f360801b;
                }
            }
        };
        return Arrays.asList(bVarB, bVarB2, bVarB3, c10697bA.b());
    }
}
