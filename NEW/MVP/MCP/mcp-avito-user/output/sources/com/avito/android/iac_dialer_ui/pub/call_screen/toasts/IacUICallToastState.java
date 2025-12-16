package com.avito.android.iac_dialer_ui.pub.call_screen.toasts;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;

/* compiled from: IacUICallToast.kt */
@H0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/toasts/IacUICallToastState;", "LdL/d;", "UnstableConnectionToast", "VpnToast", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/toasts/IacUICallToastState$UnstableConnectionToast;", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/toasts/IacUICallToastState$VpnToast;", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface IacUICallToastState extends dL.d {

    /* compiled from: IacUICallToast.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/toasts/IacUICallToastState$UnstableConnectionToast;", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/toasts/IacUICallToastState;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UnstableConnectionToast implements IacUICallToastState {
        public static final int $stable = 0;

        @k
        public static final UnstableConnectionToast INSTANCE = new UnstableConnectionToast();

        private UnstableConnectionToast() {
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof UnstableConnectionToast);
        }

        public int hashCode() {
            return 1110727413;
        }

        @k
        public String toString() {
            return "UnstableConnectionToast";
        }
    }

    /* compiled from: IacUICallToast.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/toasts/IacUICallToastState$VpnToast;", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/toasts/IacUICallToastState;", "inverseTheme", "", "(Z)V", "getInverseTheme", "()Z", "component1", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class VpnToast implements IacUICallToastState {
        public static final int $stable = 0;
        private final boolean inverseTheme;

        public VpnToast(boolean z12) {
            this.inverseTheme = z12;
        }

        public static /* synthetic */ VpnToast copy$default(VpnToast vpnToast, boolean z12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z12 = vpnToast.inverseTheme;
            }
            return vpnToast.copy(z12);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getInverseTheme() {
            return this.inverseTheme;
        }

        @k
        public final VpnToast copy(boolean inverseTheme) {
            return new VpnToast(inverseTheme);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VpnToast) && this.inverseTheme == ((VpnToast) other).inverseTheme;
        }

        public final boolean getInverseTheme() {
            return this.inverseTheme;
        }

        public int hashCode() {
            return Boolean.hashCode(this.inverseTheme);
        }

        @k
        public String toString() {
            return r.x(new StringBuilder("VpnToast(inverseTheme="), this.inverseTheme, ')');
        }
    }
}
