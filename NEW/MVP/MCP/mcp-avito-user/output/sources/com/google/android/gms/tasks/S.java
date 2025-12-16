package com.google.android.gms.tasks;

import com.google.android.gms.internal.tasks.zza;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class S implements InterfaceC37022e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zza f355666b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37028k f355667c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f355668d;

    public /* synthetic */ S(zza zzaVar, C37028k c37028k, u uVar) {
        this.f355666b = zzaVar;
        this.f355667c = c37028k;
        this.f355668d = uVar;
    }

    @Override // com.google.android.gms.tasks.InterfaceC37022e
    public final void onComplete(Task task) {
        this.f355666b.removeCallbacksAndMessages(null);
        boolean zR2 = task.r();
        C37028k c37028k = this.f355667c;
        if (zR2) {
            c37028k.d(task.n());
        } else {
            if (task.p()) {
                this.f355668d.f355685a.x(null);
                return;
            }
            Exception excM = task.m();
            excM.getClass();
            c37028k.c(excM);
        }
    }
}
