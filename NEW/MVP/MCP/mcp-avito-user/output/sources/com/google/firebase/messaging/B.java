package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.InterfaceC37020c;
import com.google.android.gms.tasks.InterfaceC37022e;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class B implements InterfaceC37020c, InterfaceC37022e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f361731b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f361732c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f361733d;

    public /* synthetic */ B(int i12, Object obj, Object obj2) {
        this.f361731b = i12;
        this.f361732c = obj;
        this.f361733d = obj2;
    }

    @Override // com.google.android.gms.tasks.InterfaceC37022e
    public void onComplete(Task task) {
        int i12 = AbstractServiceC37614h.f361860g;
        ((AbstractServiceC37614h) this.f361732c).a((Intent) this.f361733d);
    }

    @Override // com.google.android.gms.tasks.InterfaceC37020c
    public Object then(Task task) {
        switch (this.f361731b) {
            case 0:
                C c12 = (C) this.f361732c;
                String str = (String) this.f361733d;
                synchronized (c12) {
                    c12.f361735b.remove(str);
                }
                return task;
            default:
                return ((Integer) task.n()).intValue() != 402 ? task : C37616j.a((Context) this.f361732c, (Intent) this.f361733d).i(new androidx.arch.core.executor.a(1), new com.google.firebase.components.g(5));
        }
    }
}
