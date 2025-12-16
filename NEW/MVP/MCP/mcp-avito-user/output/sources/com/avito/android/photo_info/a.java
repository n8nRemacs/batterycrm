package com.avito.android.photo_info;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhotoInformation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_info/a;", "", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f218042a;

    /* renamed from: b, reason: collision with root package name */
    public final float f218043b;

    /* renamed from: c, reason: collision with root package name */
    public final long f218044c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f218045d;

    public a(float f12, float f13, long j12, @k String str) {
        this.f218042a = f12;
        this.f218043b = f13;
        this.f218044c = j12;
        this.f218045d = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f218042a, aVar.f218042a) == 0 && Float.compare(this.f218043b, aVar.f218043b) == 0 && this.f218044c == aVar.f218044c && L.f(this.f218045d, aVar.f218045d);
    }

    public final int hashCode() {
        return this.f218045d.hashCode() + r.g(r.d(this.f218043b, Float.hashCode(this.f218042a) * 31, 31), 31, this.f218044c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhotoInformation(width=");
        sb2.append(this.f218042a);
        sb2.append(", height=");
        sb2.append(this.f218043b);
        sb2.append(", size=");
        sb2.append(this.f218044c);
        sb2.append(", extension=");
        return C22026a.c(sb2, this.f218045d, ')');
    }
}
