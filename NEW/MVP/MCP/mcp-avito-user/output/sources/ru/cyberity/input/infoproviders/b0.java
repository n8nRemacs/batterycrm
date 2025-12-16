package ru.cyberity.input.infoproviders;

import Y61.k;
import kotlin.Metadata;

/* compiled from: SensorsInfoProvider.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u000b"}, d2 = {"Lru/cyberity/fingerprint/infoproviders/b0;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "sensorName", "b", "vendorName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final String sensorName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final String vendorName;

    public b0(@k String str, @k String str2) {
        this.sensorName = str;
        this.vendorName = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getSensorName() {
        return this.sensorName;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getVendorName() {
        return this.vendorName;
    }
}
