package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.fragment.app.ActivityC22955m;
import com.google.android.gms.common.internal.C36729v;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public class LifecycleCallback {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    @RX0.a
    public final Object f349033b;

    @RX0.a
    public LifecycleCallback(@j.N InterfaceC36656m interfaceC36656m) {
        this.f349033b = interfaceC36656m;
    }

    @j.N
    @RX0.a
    public static InterfaceC36656m c(@j.N C36654l c36654l) {
        I1 i12;
        zzd zzdVar;
        Activity activity = c36654l.f349174a;
        if (!(activity instanceof ActivityC22955m)) {
            if (activity == null) {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            WeakHashMap weakHashMap = I1.f349015e;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference == null || (i12 = (I1) weakReference.get()) == null) {
                try {
                    i12 = (I1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (i12 == null || i12.isRemoving()) {
                        i12 = new I1();
                        activity.getFragmentManager().beginTransaction().add(i12, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    weakHashMap.put(activity, new WeakReference(i12));
                } catch (ClassCastException e12) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e12);
                }
            }
            return i12;
        }
        ActivityC22955m activityC22955m = (ActivityC22955m) activity;
        WeakHashMap weakHashMap2 = zzd.f349255i0;
        WeakReference weakReference2 = (WeakReference) weakHashMap2.get(activityC22955m);
        if (weakReference2 == null || (zzdVar = (zzd) weakReference2.get()) == null) {
            try {
                zzdVar = (zzd) activityC22955m.getSupportFragmentManager().H("SupportLifecycleFragmentImpl");
                if (zzdVar == null || zzdVar.isRemoving()) {
                    zzdVar = new zzd();
                    androidx.fragment.app.H hE2 = activityC22955m.getSupportFragmentManager().e();
                    hE2.j(0, zzdVar, "SupportLifecycleFragmentImpl", 1);
                    hE2.f();
                }
                weakHashMap2.put(activityC22955m, new WeakReference(zzdVar));
            } catch (ClassCastException e13) {
                throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e13);
            }
        }
        return zzdVar;
    }

    @Keep
    private static InterfaceC36656m getChimeraLifecycleFragmentImpl(C36654l c36654l) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.internal.m, java.lang.Object] */
    @j.N
    @RX0.a
    public final Activity b() {
        Activity activityL1 = this.f349033b.l1();
        C36729v.j(activityL1);
        return activityL1;
    }

    @RX0.a
    @j.K
    public void f() {
    }

    @RX0.a
    @j.K
    public void g() {
    }

    @RX0.a
    @j.K
    public void i() {
    }

    @RX0.a
    @j.K
    public void j() {
    }

    @RX0.a
    @j.K
    public void e(@j.P Bundle bundle) {
    }

    @RX0.a
    @j.K
    public void h(@j.N Bundle bundle) {
    }

    @RX0.a
    @j.K
    public void d(int i12, int i13, @j.N Intent intent) {
    }

    @RX0.a
    @j.K
    public void a(@j.N String str, @j.N FileDescriptor fileDescriptor, @j.N PrintWriter printWriter, @j.N String[] strArr) {
    }
}
