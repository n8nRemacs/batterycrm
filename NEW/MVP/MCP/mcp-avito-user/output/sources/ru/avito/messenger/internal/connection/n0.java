package ru.avito.messenger.internal.connection;

import kotlin.Metadata;

/* compiled from: MessengerConnectionHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/internal/connection/n0;", "", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* data */ class n0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f431368a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ru.avito.messenger.l0 f431369b;

    public n0(@Y61.k String str, @Y61.k ru.avito.messenger.l0 l0Var) {
        this.f431368a = str;
        this.f431369b = l0Var;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return kotlin.jvm.internal.L.f(this.f431368a, n0Var.f431368a) && kotlin.jvm.internal.L.f(this.f431369b, n0Var.f431369b);
    }

    public final int hashCode() {
        return this.f431369b.hashCode() + (this.f431368a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "SessionAndHash(session=" + this.f431368a + ", connectionParams=" + this.f431369b + ')';
    }
}
