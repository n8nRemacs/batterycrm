package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.idle;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiDeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import dL.d;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IdleNavigation.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/idle/IdleNavigation;", "LdL/d;", "CloseScreen", "FinalLink", "NoNavigation", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/idle/IdleNavigation$CloseScreen;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/idle/IdleNavigation$FinalLink;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/idle/IdleNavigation$NoNavigation;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface IdleNavigation extends d {

    /* compiled from: IdleNavigation.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/idle/IdleNavigation$CloseScreen;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/idle/IdleNavigation;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements IdleNavigation {
        public static final int $stable = 0;

        @k
        public static final CloseScreen INSTANCE = new CloseScreen();

        private CloseScreen() {
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof CloseScreen);
        }

        public int hashCode() {
            return 1399133868;
        }

        @k
        public String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: IdleNavigation.kt */
    @P
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/idle/IdleNavigation$FinalLink;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/idle/IdleNavigation;", "link", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "(Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;)V", "getLink", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinalLink implements IdleNavigation {
        public static final int $stable = 8;

        @k
        private final IacPiiDeepLink link;

        public FinalLink(@k IacPiiDeepLink iacPiiDeepLink) {
            this.link = iacPiiDeepLink;
        }

        public static /* synthetic */ FinalLink copy$default(FinalLink finalLink, IacPiiDeepLink iacPiiDeepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                iacPiiDeepLink = finalLink.link;
            }
            return finalLink.copy(iacPiiDeepLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final IacPiiDeepLink getLink() {
            return this.link;
        }

        @k
        public final FinalLink copy(@k IacPiiDeepLink link) {
            return new FinalLink(link);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FinalLink) && L.f(this.link, ((FinalLink) other).link);
        }

        @k
        public final IacPiiDeepLink getLink() {
            return this.link;
        }

        public int hashCode() {
            return this.link.hashCode();
        }

        @k
        public String toString() {
            return "FinalLink(link=" + this.link + ')';
        }
    }

    /* compiled from: IdleNavigation.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/idle/IdleNavigation$NoNavigation;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/idle/IdleNavigation;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NoNavigation implements IdleNavigation {
        public static final int $stable = 0;

        @k
        public static final NoNavigation INSTANCE = new NoNavigation();

        private NoNavigation() {
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof NoNavigation);
        }

        public int hashCode() {
            return -1175562867;
        }

        @k
        public String toString() {
            return "NoNavigation";
        }
    }
}
