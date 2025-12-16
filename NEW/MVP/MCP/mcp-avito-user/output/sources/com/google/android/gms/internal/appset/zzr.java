package com.google.android.gms.internal.appset;

import NX0.a;
import NX0.b;
import android.content.Context;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.InterfaceC37020c;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes6.dex */
public final class zzr implements a {

    /* renamed from: a, reason: collision with root package name */
    public final zzp f349961a;

    /* renamed from: b, reason: collision with root package name */
    public final zzl f349962b;

    public zzr(Context context) {
        zzl zzlVar;
        this.f349961a = new zzp(context, C36688g.f349289b);
        synchronized (zzl.class) {
            try {
                C36729v.k(context, "Context must not be null");
                if (zzl.f349953d == null) {
                    zzl.f349953d = new zzl(context.getApplicationContext());
                }
                zzlVar = zzl.f349953d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f349962b = zzlVar;
    }

    public static Task zza(zzr zzrVar, Task task) {
        if (task.r() || task.p()) {
            return task;
        }
        Exception excM = task.m();
        if (!(excM instanceof ApiException)) {
            return task;
        }
        int i12 = ((ApiException) excM).f348894b.f348905b;
        return (i12 == 43001 || i12 == 43002 || i12 == 43003 || i12 == 17) ? zzrVar.f349962b.getAppSetIdInfo() : i12 == 43000 ? C37030m.e(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : i12 != 15 ? task : C37030m.e(new Exception("The operation to get app set ID timed out. Please try again later."));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.appset.zzq] */
    @Override // NX0.a
    public final Task<b> getAppSetIdInfo() {
        return this.f349961a.getAppSetIdInfo().k(new InterfaceC37020c() { // from class: com.google.android.gms.internal.appset.zzq
            @Override // com.google.android.gms.tasks.InterfaceC37020c
            public final Object then(Task task) {
                return zzr.zza(this.zza, task);
            }
        });
    }
}
