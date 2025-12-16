package com.avito.android.brandspace.brandspace.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.beduin_shared.model.action.BeduinExecuteRequestAction;
import com.avito.android.brandspace.remote.model.Brandspace;
import com.avito.android.brandspace.remote.model.BrandspaceFormFailedData;
import com.avito.android.remote.error.ApiError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BrandspaceInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BeduinActionError", "BeduinExecuteRequestActionError", "Inital", "Loaded", "ShowError", "ShowLoading", "ViewPaused", "ViewResumed", "Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction$BeduinActionError;", "Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction$BeduinExecuteRequestActionError;", "Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction$Inital;", "Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction$Loaded;", "Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction$ShowError;", "Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction$ShowLoading;", "Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction$ViewPaused;", "Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction$ViewResumed;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BrandspaceInternalAction extends n {

    /* compiled from: BrandspaceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction$BeduinActionError;", "Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BeduinActionError implements BrandspaceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f107648b;

        public BeduinActionError(@k ApiError apiError) {
            this.f107648b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BeduinActionError) && L.f(this.f107648b, ((BeduinActionError) obj).f107648b);
        }

        public final int hashCode() {
            return this.f107648b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("BeduinActionError(error="), this.f107648b, ')');
        }
    }

    /* compiled from: BrandspaceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction$BeduinExecuteRequestActionError;", "Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BeduinExecuteRequestActionError implements BrandspaceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BeduinExecuteRequestAction f107649b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ApiError f107650c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final List<BrandspaceFormFailedData> f107651d;

        public BeduinExecuteRequestActionError(@k BeduinExecuteRequestAction beduinExecuteRequestAction, @k ApiError apiError, @l List<BrandspaceFormFailedData> list) {
            this.f107649b = beduinExecuteRequestAction;
            this.f107650c = apiError;
            this.f107651d = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BeduinExecuteRequestActionError)) {
                return false;
            }
            BeduinExecuteRequestActionError beduinExecuteRequestActionError = (BeduinExecuteRequestActionError) obj;
            return L.f(this.f107649b, beduinExecuteRequestActionError.f107649b) && L.f(this.f107650c, beduinExecuteRequestActionError.f107650c) && L.f(this.f107651d, beduinExecuteRequestActionError.f107651d);
        }

        public final int hashCode() {
            int iHashCode = (this.f107650c.hashCode() + (this.f107649b.hashCode() * 31)) * 31;
            List<BrandspaceFormFailedData> list = this.f107651d;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BeduinExecuteRequestActionError(action=");
            sb2.append(this.f107649b);
            sb2.append(", error=");
            sb2.append(this.f107650c);
            sb2.append(", formFailedData=");
            return H.p(sb2, this.f107651d, ')');
        }
    }

    /* compiled from: BrandspaceInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction$Inital;", "Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction;", "()V", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Inital implements BrandspaceInternalAction {
        static {
            new Inital();
        }

        private Inital() {
        }
    }

    /* compiled from: BrandspaceInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction$Loaded;", "Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loaded implements BrandspaceInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Brandspace f107652b;

        public Loaded(@k Brandspace brandspace) {
            this.f107652b = brandspace;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF314045d() {
            return "brandspace-beduin";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "brandspace-beduin";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && L.f(this.f107652b, ((Loaded) obj).f107652b);
        }

        public final int hashCode() {
            return this.f107652b.hashCode();
        }

        @k
        public final String toString() {
            return "Loaded(brandspace=" + this.f107652b + ')';
        }
    }

    /* compiled from: BrandspaceInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction$ShowError;", "Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements BrandspaceInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f107653b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f107654c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f107655d = "brandspace-beduin";

        public ShowError(@k ApiError apiError) {
            this.f107653b = apiError;
            this.f107654c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF314045d() {
            return this.f107655d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f107655d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowError) && L.f(this.f107653b, ((ShowError) obj).f107653b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF94954d() {
            return this.f107654c;
        }

        public final int hashCode() {
            return this.f107653b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ShowError(error="), this.f107653b, ')');
        }
    }

    /* compiled from: BrandspaceInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction$ShowLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction;", "<init>", "()V", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoading extends TrackableLoadingStarted implements BrandspaceInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f107656d = "brandspace-beduin";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF314045d() {
            return this.f107656d;
        }
    }

    /* compiled from: BrandspaceInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction$ViewPaused;", "Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction;", "()V", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ViewPaused implements BrandspaceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ViewPaused f107657b = new ViewPaused();

        private ViewPaused() {
        }
    }

    /* compiled from: BrandspaceInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction$ViewResumed;", "Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction;", "()V", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ViewResumed implements BrandspaceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ViewResumed f107658b = new ViewResumed();

        private ViewResumed() {
        }
    }
}
