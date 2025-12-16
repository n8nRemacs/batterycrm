package com.avito.android.messenger;

import kotlin.Metadata;

/* compiled from: TextToChunkConverterFixed.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/t;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final /* data */ class C32571t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f197429a;

    /* renamed from: b, reason: collision with root package name */
    public final int f197430b;

    public C32571t(boolean z12, int i12) {
        this.f197429a = z12;
        this.f197430b = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32571t)) {
            return false;
        }
        C32571t c32571t = (C32571t) obj;
        return this.f197429a == c32571t.f197429a && this.f197430b == c32571t.f197430b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f197430b) + (Boolean.hashCode(this.f197429a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GroupId(isUrl=");
        sb2.append(this.f197429a);
        sb2.append(", number=");
        return androidx.appcompat.app.r.t(sb2, this.f197430b, ')');
    }
}
