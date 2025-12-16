package com.avito.android.persistence.messenger;

import java.util.SortedSet;
import kotlin.Metadata;

/* compiled from: ChannelDao.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/persistence/messenger/v0;", "", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.persistence.messenger.v0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C33126v0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SortedSet<String> f215552a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SortedSet<String> f215553b;

    public C33126v0(@Y61.k SortedSet<String> sortedSet, @Y61.k SortedSet<String> sortedSet2) {
        this.f215552a = sortedSet;
        this.f215553b = sortedSet2;
    }

    @Y61.k
    public final SortedSet<String> a() {
        return this.f215552a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33126v0)) {
            return false;
        }
        C33126v0 c33126v0 = (C33126v0) obj;
        return kotlin.jvm.internal.L.f(this.f215552a, c33126v0.f215552a) && kotlin.jvm.internal.L.f(this.f215553b, c33126v0.f215553b);
    }

    public final int hashCode() {
        return this.f215553b.hashCode() + (this.f215552a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "ChatListTags(tags=" + this.f215552a + ", excludeTags=" + this.f215553b + ')';
    }
}
