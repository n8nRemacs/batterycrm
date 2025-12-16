package com.avito.android.util;

import kotlin.Metadata;

/* compiled from: Border.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/B;", "", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class B {

    /* renamed from: a, reason: collision with root package name */
    public final float f318555a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C35763c0 f318556b;

    public B(float f12, @Y61.k C35763c0 c35763c0) {
        this.f318555a = f12;
        this.f318556b = c35763c0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b12 = (B) obj;
        return Float.compare(this.f318555a, b12.f318555a) == 0 && kotlin.jvm.internal.L.f(this.f318556b, b12.f318556b);
    }

    public final int hashCode() {
        return this.f318556b.hashCode() + (Float.hashCode(this.f318555a) * 31);
    }

    @Y61.k
    public final String toString() {
        return "Border(width=" + this.f318555a + ", color=" + this.f318556b + ')';
    }
}
