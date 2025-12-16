package com.avito.android.util;

import com.google.gson.TypeAdapter;
import kotlin.Metadata;

/* compiled from: OptimalTypeAdapterEntry.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/x3;", "", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.x3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C35975x3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Class f319125a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TypeAdapter<?> f319126b;

    public C35975x3(@Y61.k Class cls, @Y61.k TypeAdapter typeAdapter) {
        this.f319125a = cls;
        this.f319126b = typeAdapter;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35975x3)) {
            return false;
        }
        C35975x3 c35975x3 = (C35975x3) obj;
        return this.f319125a.equals(c35975x3.f319125a) && this.f319126b.equals(c35975x3.f319126b);
    }

    public final int hashCode() {
        return this.f319126b.hashCode() + (this.f319125a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "OptimalTypeAdapterEntry(type=" + this.f319125a + ", typeAdapter=" + this.f319126b + ')';
    }
}
