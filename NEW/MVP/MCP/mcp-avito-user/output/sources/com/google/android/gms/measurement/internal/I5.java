package com.google.android.gms.measurement.internal;

import android.app.Service;
import android.content.Context;
import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
@j.k0
/* loaded from: classes6.dex */
public final class I5 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f354740a;

    @j.k0
    public I5(Service service) {
        C36729v.j(service);
        Context applicationContext = service.getApplicationContext();
        C36729v.j(applicationContext);
        this.f354740a = applicationContext;
    }
}
