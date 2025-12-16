package com.avito.android.iac_avcalls.impl_module.platform.avcalls.rtc.device.video.rendering.view_api;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VideoRendererStorage.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/avcalls/rtc/device/video/rendering/view_api/ProxyKey;", "LdL/d;", "", FailedBinderCallBack.CALLER_ID, "", "isLocal", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/avito/android/iac_avcalls/impl_module/platform/avcalls/rtc/device/video/rendering/view_api/ProxyKey;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallId", "Z", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProxyKey implements dL.d {

    @k
    private final String callId;
    private final boolean isLocal;

    public ProxyKey(@k String str, boolean z12) {
        this.callId = str;
        this.isLocal = z12;
    }

    public static /* synthetic */ ProxyKey copy$default(ProxyKey proxyKey, String str, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = proxyKey.callId;
        }
        if ((i12 & 2) != 0) {
            z12 = proxyKey.isLocal;
        }
        return proxyKey.copy(str, z12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLocal() {
        return this.isLocal;
    }

    @k
    public final ProxyKey copy(@k String callId, boolean isLocal) {
        return new ProxyKey(callId, isLocal);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProxyKey)) {
            return false;
        }
        ProxyKey proxyKey = (ProxyKey) other;
        return L.f(this.callId, proxyKey.callId) && this.isLocal == proxyKey.isLocal;
    }

    @k
    public final String getCallId() {
        return this.callId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLocal) + (this.callId.hashCode() * 31);
    }

    public final boolean isLocal() {
        return this.isLocal;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProxyKey(callId=");
        sb2.append(this.callId);
        sb2.append(", isLocal=");
        return r.x(sb2, this.isLocal, ')');
    }
}
