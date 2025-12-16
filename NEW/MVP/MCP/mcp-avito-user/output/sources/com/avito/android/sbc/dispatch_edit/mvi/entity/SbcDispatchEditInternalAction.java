package com.avito.android.sbc.dispatch_edit.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import com.avito.android.sbc.autodispatches.SbcDispatchEditResult;
import com.avito.android.sbc.generated.api.api_get_auto_dispatches_v_1.AutoDispatchItemOut;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SbcDispatchEditInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CheckAllClicked", "CheckClicked", "Loaded", "NavigateBack", "RemoveFromDispatchFailed", "RemovedFromDispatch", "RemovingStarted", "Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction$CheckAllClicked;", "Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction$CheckClicked;", "Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction$Loaded;", "Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction$NavigateBack;", "Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction$RemoveFromDispatchFailed;", "Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction$RemovedFromDispatch;", "Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction$RemovingStarted;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SbcDispatchEditInternalAction extends n {

    /* compiled from: SbcDispatchEditInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction$CheckAllClicked;", "Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CheckAllClicked implements SbcDispatchEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CheckAllClicked f260125b = new CheckAllClicked();

        private CheckAllClicked() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CheckAllClicked);
        }

        public final int hashCode() {
            return -1134179278;
        }

        @k
        public final String toString() {
            return "CheckAllClicked";
        }
    }

    /* compiled from: SbcDispatchEditInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction$CheckClicked;", "Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CheckClicked implements SbcDispatchEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f260126b;

        public CheckClicked(@k String str) {
            this.f260126b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CheckClicked) && L.f(this.f260126b, ((CheckClicked) obj).f260126b);
        }

        public final int hashCode() {
            return this.f260126b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CheckClicked(id="), this.f260126b, ')');
        }
    }

    /* compiled from: SbcDispatchEditInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction$Loaded;", "Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loaded implements SbcDispatchEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<AutoDispatchItemOut> f260127b;

        public Loaded(@k List<AutoDispatchItemOut> list) {
            this.f260127b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && L.f(this.f260127b, ((Loaded) obj).f260127b);
        }

        public final int hashCode() {
            return this.f260127b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("Loaded(advertItems="), this.f260127b, ')');
        }
    }

    /* compiled from: SbcDispatchEditInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction$NavigateBack;", "Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateBack implements SbcDispatchEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NavigateBack f260128b = new NavigateBack();

        private NavigateBack() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NavigateBack);
        }

        public final int hashCode() {
            return 974612148;
        }

        @k
        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: SbcDispatchEditInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction$RemoveFromDispatchFailed;", "Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RemoveFromDispatchFailed implements SbcDispatchEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ApiError f260129b;

        /* JADX WARN: Multi-variable type inference failed */
        public RemoveFromDispatchFailed() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveFromDispatchFailed) && L.f(this.f260129b, ((RemoveFromDispatchFailed) obj).f260129b);
        }

        public final int hashCode() {
            ApiError apiError = this.f260129b;
            if (apiError == null) {
                return 0;
            }
            return apiError.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("RemoveFromDispatchFailed(error="), this.f260129b, ')');
        }

        public RemoveFromDispatchFailed(@l ApiError apiError) {
            this.f260129b = apiError;
        }

        public /* synthetic */ RemoveFromDispatchFailed(ApiError apiError, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : apiError);
        }
    }

    /* compiled from: SbcDispatchEditInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction$RemovedFromDispatch;", "Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RemovedFromDispatch implements SbcDispatchEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SbcDispatchEditResult f260130b;

        public RemovedFromDispatch(@k SbcDispatchEditResult sbcDispatchEditResult) {
            this.f260130b = sbcDispatchEditResult;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemovedFromDispatch) && this.f260130b == ((RemovedFromDispatch) obj).f260130b;
        }

        public final int hashCode() {
            return this.f260130b.hashCode();
        }

        @k
        public final String toString() {
            return "RemovedFromDispatch(result=" + this.f260130b + ')';
        }
    }

    /* compiled from: SbcDispatchEditInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction$RemovingStarted;", "Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RemovingStarted implements SbcDispatchEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RemovingStarted f260131b = new RemovingStarted();

        private RemovingStarted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof RemovingStarted);
        }

        public final int hashCode() {
            return 958703300;
        }

        @k
        public final String toString() {
            return "RemovingStarted";
        }
    }
}
