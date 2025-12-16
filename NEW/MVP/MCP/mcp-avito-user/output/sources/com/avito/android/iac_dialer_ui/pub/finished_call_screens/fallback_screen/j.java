package com.avito.android.iac_dialer_ui.pub.finished_call_screens.fallback_screen;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.H0;
import com.avito.android.iac_dialer_ui.pub.common_ui.IacUIAudioModeItemInfoState;
import com.avito.android.iac_dialer_ui.pub.common_ui.IacUIAudioModePeerInfoState;
import com.avito.android.iac_dialer_ui.pub.common_ui.IacUICallHeaderState;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacUIFinishedFallbackScreenState.kt */
@H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/finished_call_screens/fallback_screen/j;", "", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final IacUICallHeaderState f167536a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final IacUIAudioModePeerInfoState f167537b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final IacUIAudioModeItemInfoState f167538c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f167539d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f167540e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f167541f;

    public j(@Y61.k IacUICallHeaderState iacUICallHeaderState, @Y61.k IacUIAudioModePeerInfoState iacUIAudioModePeerInfoState, @l IacUIAudioModeItemInfoState iacUIAudioModeItemInfoState, boolean z12, boolean z13, boolean z14) {
        this.f167536a = iacUICallHeaderState;
        this.f167537b = iacUIAudioModePeerInfoState;
        this.f167538c = iacUIAudioModeItemInfoState;
        this.f167539d = z12;
        this.f167540e = z13;
        this.f167541f = z14;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f167536a, jVar.f167536a) && L.f(this.f167537b, jVar.f167537b) && L.f(this.f167538c, jVar.f167538c) && this.f167539d == jVar.f167539d && this.f167540e == jVar.f167540e && this.f167541f == jVar.f167541f;
    }

    public final int hashCode() {
        int iHashCode = (this.f167537b.hashCode() + (this.f167536a.hashCode() * 31)) * 31;
        IacUIAudioModeItemInfoState iacUIAudioModeItemInfoState = this.f167538c;
        return Boolean.hashCode(this.f167541f) + r.i(r.i((iHashCode + (iacUIAudioModeItemInfoState == null ? 0 : iacUIAudioModeItemInfoState.hashCode())) * 31, 31, this.f167539d), 31, this.f167540e);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacUIFinishedFallbackScreenState(callHeader=");
        sb2.append(this.f167536a);
        sb2.append(", peerInfo=");
        sb2.append(this.f167537b);
        sb2.append(", itemInfo=");
        sb2.append(this.f167538c);
        sb2.append(", gsmButton=");
        sb2.append(this.f167539d);
        sb2.append(", iacButton=");
        sb2.append(this.f167540e);
        sb2.append(", msgButton=");
        return r.x(sb2, this.f167541f, ')');
    }
}
