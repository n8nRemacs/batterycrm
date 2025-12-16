package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.InterfaceC37020c;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ExecutorService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements InterfaceC37020c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f360963b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37028k f360964c;

    public /* synthetic */ d0(int i12, C37028k c37028k) {
        this.f360963b = i12;
        this.f360964c = c37028k;
    }

    @Override // com.google.android.gms.tasks.InterfaceC37020c
    public final Object then(Task task) {
        C37028k c37028k = this.f360964c;
        switch (this.f360963b) {
            case 0:
                ExecutorService executorService = e0.f360968a;
                if (!task.r()) {
                    if (task.m() != null) {
                        c37028k.c(task.m());
                        break;
                    }
                } else {
                    c37028k.d(task.n());
                    break;
                }
                break;
            case 1:
                ExecutorService executorService2 = e0.f360968a;
                if (!task.r()) {
                    if (task.m() != null) {
                        c37028k.a(task.m());
                        break;
                    }
                } else {
                    c37028k.b(task.n());
                    break;
                }
                break;
            default:
                ExecutorService executorService3 = e0.f360968a;
                if (!task.r()) {
                    if (task.m() != null) {
                        c37028k.c(task.m());
                        break;
                    }
                } else {
                    c37028k.d(task.n());
                    break;
                }
                break;
        }
        return null;
    }
}
