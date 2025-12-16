package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.InterfaceC37022e;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class G implements InterfaceC37022e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C37028k f349003b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H f349004c;

    public G(H h12, C37028k c37028k) {
        this.f349004c = h12;
        this.f349003b = c37028k;
    }

    @Override // com.google.android.gms.tasks.InterfaceC37022e
    public final void onComplete(@j.N Task task) {
        this.f349004c.f349007b.remove(this.f349003b);
    }
}
