package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.c;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
/* loaded from: classes6.dex */
final class e extends c.a {

    /* renamed from: a, reason: collision with root package name */
    public String f358569a;

    /* renamed from: b, reason: collision with root package name */
    public Long f358570b;

    @Override // com.google.android.play.core.integrity.c.a
    public final c a() {
        String str = this.f358569a;
        if (str != null) {
            return new g(str, this.f358570b, null);
        }
        throw new IllegalStateException("Missing required properties: nonce");
    }

    @Override // com.google.android.play.core.integrity.c.a
    public final c.a b(long j12) {
        this.f358570b = Long.valueOf(j12);
        return this;
    }

    @Override // com.google.android.play.core.integrity.c.a
    public final c.a c(String str) {
        if (str == null) {
            throw new NullPointerException("Null nonce");
        }
        this.f358569a = str;
        return this;
    }
}
