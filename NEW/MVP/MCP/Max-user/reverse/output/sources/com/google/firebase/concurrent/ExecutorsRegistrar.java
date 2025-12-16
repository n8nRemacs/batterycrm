package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.bl3;
import defpackage.cc4;
import defpackage.cl3;
import defpackage.dm4;
import defpackage.eqg;
import defpackage.fsc;
import defpackage.ft4;
import defpackage.gqg;
import defpackage.l18;
import defpackage.nq0;
import defpackage.o48;
import defpackage.ol3;
import defpackage.tl3;
import defpackage.v5j;
import defpackage.ze0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    static final l18 BG_EXECUTOR = new l18(new tl3(1));
    static final l18 LITE_EXECUTOR = new l18(new tl3(2));
    static final l18 BLOCKING_EXECUTOR = new l18(new tl3(3));
    static final l18 SCHEDULER = new l18(new tl3(4));

    private static StrictMode.ThreadPolicy bgPolicy() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        builderDetectNetwork.detectUnbufferedIo();
        return builderDetectNetwork.penaltyLog().build();
    }

    private static ThreadFactory factory(String str, int i) {
        return new cc4(str, i, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$getComponents$4(ol3 ol3Var) {
        return (ScheduledExecutorService) BG_EXECUTOR.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$getComponents$5(ol3 ol3Var) {
        return (ScheduledExecutorService) BLOCKING_EXECUTOR.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$getComponents$6(ol3 ol3Var) {
        return (ScheduledExecutorService) LITE_EXECUTOR.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Executor lambda$getComponents$7(ol3 ol3Var) {
        return eqg.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$static$0() {
        return scheduled(Executors.newFixedThreadPool(4, factory("Firebase Background", 10, bgPolicy())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$static$1() {
        return scheduled(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), factory("Firebase Lite", 0, litePolicy())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$static$2() {
        return scheduled(Executors.newCachedThreadPool(factory("Firebase Blocking", 11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$static$3() {
        return Executors.newSingleThreadScheduledExecutor(factory("Firebase Scheduler", 0));
    }

    private static StrictMode.ThreadPolicy litePolicy() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService scheduled(ExecutorService executorService) {
        return new ft4(executorService, (ScheduledExecutorService) SCHEDULER.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<cl3> getComponents() {
        fsc fscVar = new fsc(ze0.class, ScheduledExecutorService.class);
        fsc[] fscVarArr = {new fsc(ze0.class, ExecutorService.class), new fsc(ze0.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(fscVar);
        for (fsc fscVar2 : fscVarArr) {
            v5j.a(fscVar2, "Null interface");
        }
        Collections.addAll(hashSet, fscVarArr);
        cl3 cl3Var = new cl3(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new dm4(18), hashSet3);
        fsc fscVar3 = new fsc(nq0.class, ScheduledExecutorService.class);
        fsc[] fscVarArr2 = {new fsc(nq0.class, ExecutorService.class), new fsc(nq0.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(fscVar3);
        for (fsc fscVar4 : fscVarArr2) {
            v5j.a(fscVar4, "Null interface");
        }
        Collections.addAll(hashSet4, fscVarArr2);
        cl3 cl3Var2 = new cl3(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new dm4(19), hashSet6);
        fsc fscVar5 = new fsc(o48.class, ScheduledExecutorService.class);
        fsc[] fscVarArr3 = {new fsc(o48.class, ExecutorService.class), new fsc(o48.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(fscVar5);
        for (fsc fscVar6 : fscVarArr3) {
            v5j.a(fscVar6, "Null interface");
        }
        Collections.addAll(hashSet7, fscVarArr3);
        cl3 cl3Var3 = new cl3(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new dm4(20), hashSet9);
        bl3 bl3VarA = cl3.a(new fsc(gqg.class, Executor.class));
        bl3VarA.g = new dm4(21);
        return Arrays.asList(cl3Var, cl3Var2, cl3Var3, bl3VarA.b());
    }

    private static ThreadFactory factory(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new cc4(str, i, threadPolicy);
    }
}
