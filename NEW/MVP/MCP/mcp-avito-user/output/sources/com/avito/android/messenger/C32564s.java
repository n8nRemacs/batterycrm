package com.avito.android.messenger;

import kotlin.Metadata;

/* compiled from: TextToChunkConverterFixed.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/s;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.s, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final /* data */ class C32564s {

    /* renamed from: a, reason: collision with root package name */
    public final int f196938a;

    /* renamed from: b, reason: collision with root package name */
    public final int f196939b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C32571t f196940c;

    public C32564s(int i12, int i13, @Y61.k C32571t c32571t) {
        this.f196938a = i12;
        this.f196939b = i13;
        this.f196940c = c32571t;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32564s)) {
            return false;
        }
        C32564s c32564s = (C32564s) obj;
        return this.f196938a == c32564s.f196938a && this.f196939b == c32564s.f196939b && kotlin.jvm.internal.L.f(this.f196940c, c32564s.f196940c);
    }

    public final int hashCode() {
        return androidx.appcompat.app.r.e(this.f196939b, Integer.hashCode(this.f196938a) * 31, 31) + this.f196940c.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "Group(start=" + this.f196938a + ", end=" + this.f196939b + ", groupId=" + this.f196940c + ')';
    }
}
