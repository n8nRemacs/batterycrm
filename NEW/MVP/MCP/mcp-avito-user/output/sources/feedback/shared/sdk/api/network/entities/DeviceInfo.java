package feedback.shared.sdk.api.network.entities;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003Jm\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014¨\u0006+"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/DeviceInfo;", "", "width", "", "height", "os", "", "device", "deviceVendor", "deviceModel", "ip", "orientation", "network", "language", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDevice", "()Ljava/lang/String;", "getDeviceModel", "getDeviceVendor", "getHeight", "()I", "getIp", "getLanguage", "getNetwork", "getOrientation", "getOs", "getWidth", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DeviceInfo {

    @k
    private final String device;

    @k
    private final String deviceModel;

    @k
    private final String deviceVendor;
    private final int height;

    @k
    private final String ip;

    @k
    private final String language;

    @k
    private final String network;

    @k
    private final String orientation;

    @k
    private final String os;
    private final int width;

    public DeviceInfo(int i12, int i13, @k String str, @k String str2, @k String str3, @k String str4, @k String str5, @k String str6, @k String str7, @k String str8) {
        this.width = i12;
        this.height = i13;
        this.os = str;
        this.device = str2;
        this.deviceVendor = str3;
        this.deviceModel = str4;
        this.ip = str5;
        this.orientation = str6;
        this.network = str7;
        this.language = str8;
    }

    /* renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    @k
    /* renamed from: component10, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getDevice() {
        return this.device;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getDeviceVendor() {
        return this.deviceVendor;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @k
    /* renamed from: component7, reason: from getter */
    public final String getIp() {
        return this.ip;
    }

    @k
    /* renamed from: component8, reason: from getter */
    public final String getOrientation() {
        return this.orientation;
    }

    @k
    /* renamed from: component9, reason: from getter */
    public final String getNetwork() {
        return this.network;
    }

    @k
    public final DeviceInfo copy(int width, int height, @k String os2, @k String device, @k String deviceVendor, @k String deviceModel, @k String ip2, @k String orientation, @k String network, @k String language) {
        return new DeviceInfo(width, height, os2, device, deviceVendor, deviceModel, ip2, orientation, network, language);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) other;
        return this.width == deviceInfo.width && this.height == deviceInfo.height && L.f(this.os, deviceInfo.os) && L.f(this.device, deviceInfo.device) && L.f(this.deviceVendor, deviceInfo.deviceVendor) && L.f(this.deviceModel, deviceInfo.deviceModel) && L.f(this.ip, deviceInfo.ip) && L.f(this.orientation, deviceInfo.orientation) && L.f(this.network, deviceInfo.network) && L.f(this.language, deviceInfo.language);
    }

    @k
    public final String getDevice() {
        return this.device;
    }

    @k
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @k
    public final String getDeviceVendor() {
        return this.deviceVendor;
    }

    public final int getHeight() {
        return this.height;
    }

    @k
    public final String getIp() {
        return this.ip;
    }

    @k
    public final String getLanguage() {
        return this.language;
    }

    @k
    public final String getNetwork() {
        return this.network;
    }

    @k
    public final String getOrientation() {
        return this.orientation;
    }

    @k
    public final String getOs() {
        return this.os;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return this.language.hashCode() + H.d(H.d(H.d(H.d(H.d(H.d(H.d(r.e(this.height, Integer.hashCode(this.width) * 31, 31), 31, this.os), 31, this.device), 31, this.deviceVendor), 31, this.deviceModel), 31, this.ip), 31, this.orientation), 31, this.network);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceInfo(width=");
        sb2.append(this.width);
        sb2.append(", height=");
        sb2.append(this.height);
        sb2.append(", os=");
        sb2.append(this.os);
        sb2.append(", device=");
        sb2.append(this.device);
        sb2.append(", deviceVendor=");
        sb2.append(this.deviceVendor);
        sb2.append(", deviceModel=");
        sb2.append(this.deviceModel);
        sb2.append(", ip=");
        sb2.append(this.ip);
        sb2.append(", orientation=");
        sb2.append(this.orientation);
        sb2.append(", network=");
        sb2.append(this.network);
        sb2.append(", language=");
        return C22026a.c(sb2, this.language, ')');
    }
}
