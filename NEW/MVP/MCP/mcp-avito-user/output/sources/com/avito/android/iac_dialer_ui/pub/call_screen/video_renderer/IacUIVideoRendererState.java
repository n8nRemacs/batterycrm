package com.avito.android.iac_dialer_ui.pub.call_screen.video_renderer;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacUIVideoRenderer.kt */
@H0
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0002+,B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JL\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b\u0007\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b(\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010\u0017¨\u0006-"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/video_renderer/IacUIVideoRendererState;", "LdL/d;", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/video_renderer/IacUIVideoRendererState$PlacementTag;", "placementTag", "", FailedBinderCallBack.CALLER_ID, "", "isLocal", "mirror", "hardwareScalerEnabled", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/video_renderer/IacUIVideoRendererState$ScalingTypeAspect;", "scalingType", "<init>", "(Lcom/avito/android/iac_dialer_ui/pub/call_screen/video_renderer/IacUIVideoRendererState$PlacementTag;Ljava/lang/String;ZZZLcom/avito/android/iac_dialer_ui/pub/call_screen/video_renderer/IacUIVideoRendererState$ScalingTypeAspect;)V", "component1", "()Lcom/avito/android/iac_dialer_ui/pub/call_screen/video_renderer/IacUIVideoRendererState$PlacementTag;", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "component5", "component6", "()Lcom/avito/android/iac_dialer_ui/pub/call_screen/video_renderer/IacUIVideoRendererState$ScalingTypeAspect;", "copy", "(Lcom/avito/android/iac_dialer_ui/pub/call_screen/video_renderer/IacUIVideoRendererState$PlacementTag;Ljava/lang/String;ZZZLcom/avito/android/iac_dialer_ui/pub/call_screen/video_renderer/IacUIVideoRendererState$ScalingTypeAspect;)Lcom/avito/android/iac_dialer_ui/pub/call_screen/video_renderer/IacUIVideoRendererState;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/video_renderer/IacUIVideoRendererState$PlacementTag;", "getPlacementTag", "Ljava/lang/String;", "getCallId", "Z", "getMirror", "getHardwareScalerEnabled", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/video_renderer/IacUIVideoRendererState$ScalingTypeAspect;", "getScalingType", "PlacementTag", "ScalingTypeAspect", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacUIVideoRendererState implements dL.d {
    public static final int $stable = 0;

    @k
    private final String callId;
    private final boolean hardwareScalerEnabled;
    private final boolean isLocal;
    private final boolean mirror;

    @k
    private final PlacementTag placementTag;

    @k
    private final ScalingTypeAspect scalingType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IacUIVideoRenderer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/video_renderer/IacUIVideoRendererState$PlacementTag;", "", "LdL/d;", "<init>", "(Ljava/lang/String;I)V", "FullScreen", "Pip", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PlacementTag implements dL.d {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ PlacementTag[] $VALUES;
        public static final PlacementTag FullScreen = new PlacementTag("FullScreen", 0);
        public static final PlacementTag Pip = new PlacementTag("Pip", 1);

        private static final /* synthetic */ PlacementTag[] $values() {
            return new PlacementTag[]{FullScreen, Pip};
        }

        static {
            PlacementTag[] placementTagArr$values = $values();
            $VALUES = placementTagArr$values;
            $ENTRIES = kotlin.enums.c.a(placementTagArr$values);
        }

        private PlacementTag(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<PlacementTag> getEntries() {
            return $ENTRIES;
        }

        public static PlacementTag valueOf(String str) {
            return (PlacementTag) Enum.valueOf(PlacementTag.class, str);
        }

        public static PlacementTag[] values() {
            return (PlacementTag[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IacUIVideoRenderer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/video_renderer/IacUIVideoRendererState$ScalingTypeAspect;", "", "LdL/d;", "<init>", "(Ljava/lang/String;I)V", "FIT", "FILL", "BALANCED", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ScalingTypeAspect implements dL.d {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ ScalingTypeAspect[] $VALUES;
        public static final ScalingTypeAspect FIT = new ScalingTypeAspect("FIT", 0);
        public static final ScalingTypeAspect FILL = new ScalingTypeAspect("FILL", 1);
        public static final ScalingTypeAspect BALANCED = new ScalingTypeAspect("BALANCED", 2);

        private static final /* synthetic */ ScalingTypeAspect[] $values() {
            return new ScalingTypeAspect[]{FIT, FILL, BALANCED};
        }

        static {
            ScalingTypeAspect[] scalingTypeAspectArr$values = $values();
            $VALUES = scalingTypeAspectArr$values;
            $ENTRIES = kotlin.enums.c.a(scalingTypeAspectArr$values);
        }

        private ScalingTypeAspect(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<ScalingTypeAspect> getEntries() {
            return $ENTRIES;
        }

        public static ScalingTypeAspect valueOf(String str) {
            return (ScalingTypeAspect) Enum.valueOf(ScalingTypeAspect.class, str);
        }

        public static ScalingTypeAspect[] values() {
            return (ScalingTypeAspect[]) $VALUES.clone();
        }
    }

    public IacUIVideoRendererState(@k PlacementTag placementTag, @k String str, boolean z12, boolean z13, boolean z14, @k ScalingTypeAspect scalingTypeAspect) {
        this.placementTag = placementTag;
        this.callId = str;
        this.isLocal = z12;
        this.mirror = z13;
        this.hardwareScalerEnabled = z14;
        this.scalingType = scalingTypeAspect;
    }

    public static /* synthetic */ IacUIVideoRendererState copy$default(IacUIVideoRendererState iacUIVideoRendererState, PlacementTag placementTag, String str, boolean z12, boolean z13, boolean z14, ScalingTypeAspect scalingTypeAspect, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            placementTag = iacUIVideoRendererState.placementTag;
        }
        if ((i12 & 2) != 0) {
            str = iacUIVideoRendererState.callId;
        }
        String str2 = str;
        if ((i12 & 4) != 0) {
            z12 = iacUIVideoRendererState.isLocal;
        }
        boolean z15 = z12;
        if ((i12 & 8) != 0) {
            z13 = iacUIVideoRendererState.mirror;
        }
        boolean z16 = z13;
        if ((i12 & 16) != 0) {
            z14 = iacUIVideoRendererState.hardwareScalerEnabled;
        }
        boolean z17 = z14;
        if ((i12 & 32) != 0) {
            scalingTypeAspect = iacUIVideoRendererState.scalingType;
        }
        return iacUIVideoRendererState.copy(placementTag, str2, z15, z16, z17, scalingTypeAspect);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final PlacementTag getPlacementTag() {
        return this.placementTag;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLocal() {
        return this.isLocal;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getMirror() {
        return this.mirror;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHardwareScalerEnabled() {
        return this.hardwareScalerEnabled;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final ScalingTypeAspect getScalingType() {
        return this.scalingType;
    }

    @k
    public final IacUIVideoRendererState copy(@k PlacementTag placementTag, @k String callId, boolean isLocal, boolean mirror, boolean hardwareScalerEnabled, @k ScalingTypeAspect scalingType) {
        return new IacUIVideoRendererState(placementTag, callId, isLocal, mirror, hardwareScalerEnabled, scalingType);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacUIVideoRendererState)) {
            return false;
        }
        IacUIVideoRendererState iacUIVideoRendererState = (IacUIVideoRendererState) other;
        return this.placementTag == iacUIVideoRendererState.placementTag && L.f(this.callId, iacUIVideoRendererState.callId) && this.isLocal == iacUIVideoRendererState.isLocal && this.mirror == iacUIVideoRendererState.mirror && this.hardwareScalerEnabled == iacUIVideoRendererState.hardwareScalerEnabled && this.scalingType == iacUIVideoRendererState.scalingType;
    }

    @k
    public final String getCallId() {
        return this.callId;
    }

    public final boolean getHardwareScalerEnabled() {
        return this.hardwareScalerEnabled;
    }

    public final boolean getMirror() {
        return this.mirror;
    }

    @k
    public final PlacementTag getPlacementTag() {
        return this.placementTag;
    }

    @k
    public final ScalingTypeAspect getScalingType() {
        return this.scalingType;
    }

    public int hashCode() {
        return this.scalingType.hashCode() + r.i(r.i(r.i(H.d(this.placementTag.hashCode() * 31, 31, this.callId), 31, this.isLocal), 31, this.mirror), 31, this.hardwareScalerEnabled);
    }

    public final boolean isLocal() {
        return this.isLocal;
    }

    @k
    public String toString() {
        return "IacUIVideoRendererState(placementTag=" + this.placementTag + ", callId=" + this.callId + ", isLocal=" + this.isLocal + ", mirror=" + this.mirror + ", hardwareScalerEnabled=" + this.hardwareScalerEnabled + ", scalingType=" + this.scalingType + ')';
    }
}
