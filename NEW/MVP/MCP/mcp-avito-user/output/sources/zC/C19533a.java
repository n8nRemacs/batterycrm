package Zc;

import Y61.k;
import Y61.l;
import ad.C19867a;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeviceInfo.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"LZc/a;", "", "", "deviceModel", "deviceManufacturer", "deviceHardware", "deviceProduct", "Lad/a;", "cpuInfo", "", "isEmulator", "isRoot", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lad/a;ZZ)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "b", "e", "Lad/a;", "a", "()Lad/a;", "Z", "f", "()Z", "g", "_common_antifraud_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zc.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C19533a {

    @com.google.gson.annotations.c("cpuInfo")
    @k
    private final C19867a cpuInfo;

    @com.google.gson.annotations.c("deviceHardware")
    @k
    private final String deviceHardware;

    @com.google.gson.annotations.c("deviceManufacturer")
    @k
    private final String deviceManufacturer;

    @com.google.gson.annotations.c("deviceModel")
    @k
    private final String deviceModel;

    @com.google.gson.annotations.c("deviceProduct")
    @k
    private final String deviceProduct;

    @com.google.gson.annotations.c("isEmulator")
    private final boolean isEmulator;

    @com.google.gson.annotations.c("isRoot")
    private final boolean isRoot;

    public C19533a(@k String str, @k String str2, @k String str3, @k String str4, @k C19867a c19867a, boolean z12, boolean z13) {
        this.deviceModel = str;
        this.deviceManufacturer = str2;
        this.deviceHardware = str3;
        this.deviceProduct = str4;
        this.cpuInfo = c19867a;
        this.isEmulator = z12;
        this.isRoot = z13;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C19867a getCpuInfo() {
        return this.cpuInfo;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getDeviceHardware() {
        return this.deviceHardware;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getDeviceProduct() {
        return this.deviceProduct;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19533a)) {
            return false;
        }
        C19533a c19533a = (C19533a) obj;
        return L.f(this.deviceModel, c19533a.deviceModel) && L.f(this.deviceManufacturer, c19533a.deviceManufacturer) && L.f(this.deviceHardware, c19533a.deviceHardware) && L.f(this.deviceProduct, c19533a.deviceProduct) && L.f(this.cpuInfo, c19533a.cpuInfo) && this.isEmulator == c19533a.isEmulator && this.isRoot == c19533a.isRoot;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsEmulator() {
        return this.isEmulator;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsRoot() {
        return this.isRoot;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isRoot) + r.i((this.cpuInfo.hashCode() + H.d(H.d(H.d(this.deviceModel.hashCode() * 31, 31, this.deviceManufacturer), 31, this.deviceHardware), 31, this.deviceProduct)) * 31, 31, this.isEmulator);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceInfo(deviceModel=");
        sb2.append(this.deviceModel);
        sb2.append(", deviceManufacturer=");
        sb2.append(this.deviceManufacturer);
        sb2.append(", deviceHardware=");
        sb2.append(this.deviceHardware);
        sb2.append(", deviceProduct=");
        sb2.append(this.deviceProduct);
        sb2.append(", cpuInfo=");
        sb2.append(this.cpuInfo);
        sb2.append(", isEmulator=");
        sb2.append(this.isEmulator);
        sb2.append(", isRoot=");
        return r.x(sb2, this.isRoot, ')');
    }
}
