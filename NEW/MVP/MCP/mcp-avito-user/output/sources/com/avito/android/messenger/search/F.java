package com.avito.android.messenger.search;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SearchQuery.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/search/F;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class F {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f197039c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final F f197040d = new F(0, null, 3, null);

    /* renamed from: a, reason: collision with root package name */
    public final long f197041a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f197042b;

    /* compiled from: SearchQuery.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/search/F$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public F() {
        this(0L, null, 3, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f12 = (F) obj;
        return this.f197041a == f12.f197041a && L.f(this.f197042b, f12.f197042b);
    }

    public final int hashCode() {
        return this.f197042b.hashCode() + (Long.hashCode(this.f197041a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchQuery(id=");
        sb2.append(this.f197041a);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f197042b, ')');
    }

    public F(long j12, @Y61.k String str) {
        this.f197041a = j12;
        this.f197042b = str;
    }

    public /* synthetic */ F(long j12, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? 0L : j12, (i12 & 2) != 0 ? "" : str);
    }
}
