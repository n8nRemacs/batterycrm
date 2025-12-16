package com.avito.android.iac_dialer_ui.pub.call_screen.standalone_status;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.H0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import dL.d;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacUIStandaloneStatus.kt */
@H0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/standalone_status/IacUIStandaloneStatusState;", "LdL/d;", "", "text", "", "showIcon", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/avito/android/iac_dialer_ui/pub/call_screen/standalone_status/IacUIStandaloneStatusState;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Z", "getShowIcon", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacUIStandaloneStatusState implements d {
    public static final int $stable = 0;
    private final boolean showIcon;

    @k
    private final String text;

    public IacUIStandaloneStatusState(@k String str, boolean z12) {
        this.text = str;
        this.showIcon = z12;
    }

    public static /* synthetic */ IacUIStandaloneStatusState copy$default(IacUIStandaloneStatusState iacUIStandaloneStatusState, String str, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = iacUIStandaloneStatusState.text;
        }
        if ((i12 & 2) != 0) {
            z12 = iacUIStandaloneStatusState.showIcon;
        }
        return iacUIStandaloneStatusState.copy(str, z12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowIcon() {
        return this.showIcon;
    }

    @k
    public final IacUIStandaloneStatusState copy(@k String text, boolean showIcon) {
        return new IacUIStandaloneStatusState(text, showIcon);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacUIStandaloneStatusState)) {
            return false;
        }
        IacUIStandaloneStatusState iacUIStandaloneStatusState = (IacUIStandaloneStatusState) other;
        return L.f(this.text, iacUIStandaloneStatusState.text) && this.showIcon == iacUIStandaloneStatusState.showIcon;
    }

    public final boolean getShowIcon() {
        return this.showIcon;
    }

    @k
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showIcon) + (this.text.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IacUIStandaloneStatusState(text=");
        sb2.append(this.text);
        sb2.append(", showIcon=");
        return r.x(sb2, this.showIcon, ')');
    }
}
