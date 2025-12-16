package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.InterfaceC37020c;
import com.google.android.gms.tasks.InterfaceC37022e;
import com.google.android.gms.tasks.InterfaceC37024g;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.P;
import java.io.IOException;
import java.util.concurrent.ScheduledFuture;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.firebase.messaging.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C37620n implements InterfaceC37024g, InterfaceC37020c, InterfaceC37022e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f361876b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f361877c;

    public /* synthetic */ C37620n(Object obj, int i12) {
        this.f361876b = i12;
        this.f361877c = obj;
    }

    @Override // com.google.android.gms.tasks.InterfaceC37022e
    public void onComplete(Task task) {
        Object obj = this.f361877c;
        switch (this.f361876b) {
            case 2:
                N.b((Intent) obj);
                break;
            case 3:
                int i12 = O.f361815b;
                ((P.a) obj).f361824b.d(null);
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.InterfaceC37024g
    public void onSuccess(Object obj) {
        boolean z12;
        L l12 = (L) obj;
        if (!((FirebaseMessaging) this.f361877c).f361758g.a() || l12.f361802h.a() == null) {
            return;
        }
        synchronized (l12) {
            z12 = l12.f361801g;
        }
        if (z12) {
            return;
        }
        l12.f(0L);
    }

    @Override // com.google.android.gms.tasks.InterfaceC37020c
    public Object then(Task task) throws IOException {
        ((r) this.f361877c).getClass();
        Bundle bundle = (Bundle) task.o();
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null || (string = bundle.getString("unregistered")) != null) {
            return string;
        }
        String string2 = bundle.getString("error");
        if ("RST".equals(string2)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string2 != null) {
            throw new IOException(string2);
        }
        bundle.toString();
        new Throwable();
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
}
