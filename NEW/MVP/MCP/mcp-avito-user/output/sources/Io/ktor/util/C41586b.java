package io.ktor.util;

import kotlin.Metadata;

/* compiled from: Attributes.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Lio/ktor/util/b;", "", "T", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.util.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41586b<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f400429a;

    public C41586b(@Y61.k String str) {
        this.f400429a = str;
        if (str.length() == 0) {
            throw new IllegalStateException("Name can't be blank");
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C41586b.class == obj.getClass() && kotlin.jvm.internal.L.f(this.f400429a, ((C41586b) obj).f400429a);
    }

    public final int hashCode() {
        return this.f400429a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "AttributeKey: " + this.f400429a;
    }
}
