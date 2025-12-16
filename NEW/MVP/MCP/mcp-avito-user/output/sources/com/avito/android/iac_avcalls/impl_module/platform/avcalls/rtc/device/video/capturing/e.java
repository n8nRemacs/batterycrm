package com.avito.android.iac_avcalls.impl_module.platform.avcalls.rtc.device.video.capturing;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.avcalls.call.models.CameraPosition;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CameraVideoCapturerImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/avcalls/rtc/device/video/capturing/e;", "", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final CameraPosition f164417a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f164418b;

    public e(@k CameraPosition cameraPosition, @k String str) {
        this.f164417a = cameraPosition;
        this.f164418b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f164417a == eVar.f164417a && L.f(this.f164418b, eVar.f164418b);
    }

    public final int hashCode() {
        return this.f164418b.hashCode() + (this.f164417a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device(position=");
        sb2.append(this.f164417a);
        sb2.append(", name=");
        return C22026a.c(sb2, this.f164418b, ')');
    }
}
