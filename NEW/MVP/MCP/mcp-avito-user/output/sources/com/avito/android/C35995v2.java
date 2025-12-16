package com.avito.android;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SearchQuery.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/v2;", "", "a", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.v2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* data */ class C35995v2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f319199a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f319200b;

    /* compiled from: SearchQuery.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/v2$a;", "", "<init>", "()V", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.v2$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        new C35995v2(0L, null, 3, null);
    }

    public C35995v2() {
        this(0L, null, 3, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35995v2)) {
            return false;
        }
        C35995v2 c35995v2 = (C35995v2) obj;
        return this.f319199a == c35995v2.f319199a && kotlin.jvm.internal.L.f(this.f319200b, c35995v2.f319200b);
    }

    public final int hashCode() {
        return this.f319200b.hashCode() + (Long.hashCode(this.f319199a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchQuery(id=");
        sb2.append(this.f319199a);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f319200b, ')');
    }

    public C35995v2(long j12, @Y61.k String str) {
        this.f319199a = j12;
        this.f319200b = str;
    }

    public /* synthetic */ C35995v2(long j12, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? 0L : j12, (i12 & 2) != 0 ? "" : str);
    }
}
