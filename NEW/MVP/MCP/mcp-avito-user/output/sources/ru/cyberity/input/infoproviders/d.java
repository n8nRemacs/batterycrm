package ru.cyberity.input.infoproviders;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CameraInfoProvider.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Lru/cyberity/fingerprint/infoproviders/d;", "", "", "cameraName", "cameraType", "cameraOrientation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "f", "c", "e", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final String cameraName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final String cameraType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final String cameraOrientation;

    public d(@k String str, @k String str2, @k String str3) {
        this.cameraName = str;
        this.cameraType = str2;
        this.cameraOrientation = str3;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getCameraName() {
        return this.cameraName;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getCameraOrientation() {
        return this.cameraOrientation;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof d)) {
            return false;
        }
        d dVar = (d) other;
        return L.f(this.cameraName, dVar.cameraName) && L.f(this.cameraType, dVar.cameraType) && L.f(this.cameraOrientation, dVar.cameraOrientation);
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getCameraType() {
        return this.cameraType;
    }

    public int hashCode() {
        return this.cameraOrientation.hashCode() + H.d(this.cameraName.hashCode() * 31, 31, this.cameraType);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CameraInfo(cameraName=");
        sb2.append(this.cameraName);
        sb2.append(", cameraType=");
        sb2.append(this.cameraType);
        sb2.append(", cameraOrientation=");
        return C22026a.c(sb2, this.cameraOrientation, ')');
    }
}
