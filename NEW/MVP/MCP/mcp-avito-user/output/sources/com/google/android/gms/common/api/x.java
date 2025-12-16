package com.google.android.gms.common.api;

import com.google.android.gms.common.api.m;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class x implements m.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C36617b f349260a;

    public x(C36617b c36617b) {
        this.f349260a = c36617b;
    }

    @Override // com.google.android.gms.common.api.m.a
    public final void a(Status status) {
        synchronized (this.f349260a.f348918t) {
            try {
                if (this.f349260a.isCanceled()) {
                    return;
                }
                if (status.f348905b == 16) {
                    this.f349260a.f348916r = true;
                } else if (!status.h()) {
                    this.f349260a.f348915q = true;
                }
                C36617b c36617b = this.f349260a;
                int i12 = c36617b.f348914p - 1;
                c36617b.f348914p = i12;
                if (i12 == 0) {
                    if (c36617b.f348916r) {
                        super/*com.google.android.gms.common.api.internal.BasePendingResult*/.cancel();
                    } else {
                        this.f349260a.setResult(new C36618c(c36617b.f348915q ? new Status(13, null, null, null) : Status.f348900f));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
