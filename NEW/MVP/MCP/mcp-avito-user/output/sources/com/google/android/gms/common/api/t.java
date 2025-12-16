package com.google.android.gms.common.api;

import com.google.android.gms.common.api.r;
import j.N;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public abstract class t<R extends r> implements s<R> {
    @Override // com.google.android.gms.common.api.s
    @RX0.a
    public final void a(@N R r12) {
        Status status = r12.getStatus();
        if (status.h()) {
            c();
            return;
        }
        b(status);
        if (r12 instanceof o) {
            try {
                ((o) r12).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(r12));
            }
        }
    }

    public abstract void b(@N Status status);

    public abstract void c();
}
