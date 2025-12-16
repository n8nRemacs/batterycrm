package com.google.android.play.core.integrity;

import com.google.android.play.integrity.internal.C37254c;
import com.google.android.play.integrity.internal.InterfaceC37253b;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
/* loaded from: classes6.dex */
public final class z implements InterfaceC37253b {

    /* renamed from: a, reason: collision with root package name */
    public final C37254c f358594a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.play.integrity.internal.d f358595b;

    public z(C37254c c37254c, com.google.android.play.integrity.internal.d dVar) {
        this.f358594a = c37254c;
        this.f358595b = dVar;
    }

    @Override // com.google.android.play.integrity.internal.d
    public final Object a() {
        C37254c c37254c = this.f358594a;
        return new x(c37254c.f358913a, (com.google.android.play.integrity.internal.n) this.f358595b.a());
    }
}
