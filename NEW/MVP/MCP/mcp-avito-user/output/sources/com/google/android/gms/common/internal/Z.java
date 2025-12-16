package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.C36728u;
import com.google.android.gms.tasks.C37028k;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class Z implements m.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f349388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C37028k f349389b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36728u.a f349390c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36696c0 f349391d;

    public Z(BasePendingResult basePendingResult, C37028k c37028k, C36728u.a aVar, InterfaceC36696c0 interfaceC36696c0) {
        this.f349388a = basePendingResult;
        this.f349389b = c37028k;
        this.f349390c = aVar;
        this.f349391d = interfaceC36696c0;
    }

    @Override // com.google.android.gms.common.api.m.a
    public final void a(Status status) {
        boolean zH2 = status.h();
        C37028k c37028k = this.f349389b;
        if (!zH2) {
            c37028k.a(C36695c.a(status));
            return;
        }
        this.f349388a.await(0L, TimeUnit.MILLISECONDS);
        c37028k.b(null);
    }
}
