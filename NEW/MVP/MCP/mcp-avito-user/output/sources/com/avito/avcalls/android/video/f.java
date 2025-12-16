package com.avito.avcalls.android.video;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CameraVideoCapturer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/video/f;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CameraPosition f332482a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f332483b;

    public f(@Y61.k CameraPosition cameraPosition, @Y61.k String str) {
        this.f332482a = cameraPosition;
        this.f332483b = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f332482a == fVar.f332482a && L.f(this.f332483b, fVar.f332483b);
    }

    public final int hashCode() {
        return this.f332483b.hashCode() + (this.f332482a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device(position=");
        sb2.append(this.f332482a);
        sb2.append(", name=");
        return C22026a.c(sb2, this.f332483b, ')');
    }
}
