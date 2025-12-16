package com.avito.android.master_plan.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.master_plan_view.MasterPlanPin;
import com.avito.android.remote.error.ApiError;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import vY.C49283b;

/* compiled from: MasterPlanInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChangeBuilding", "Error", "InitialArgsChecked", "Loaded", "Loading", "NavigateBack", "NavigateForward", "WrongInitialArgs", "Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction$ChangeBuilding;", "Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction$Error;", "Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction$InitialArgsChecked;", "Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction$Loaded;", "Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction$Loading;", "Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction$NavigateBack;", "Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction$NavigateForward;", "Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction$WrongInitialArgs;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface MasterPlanInternalAction extends n {

    /* compiled from: MasterPlanInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction$ChangeBuilding;", "Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ChangeBuilding implements MasterPlanInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MasterPlanPin f186072b;

        public ChangeBuilding(@k MasterPlanPin masterPlanPin) {
            this.f186072b = masterPlanPin;
        }
    }

    /* compiled from: MasterPlanInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction$Error;", "Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements MasterPlanInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f186073b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ApiError f186074c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f186075d;

        public Error(@k ApiError apiError, @k String str) {
            this.f186073b = str;
            this.f186074c = apiError;
            this.f186075d = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF267993e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return L.f(this.f186073b, error.f186073b) && L.f(this.f186074c, error.f186074c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF124443d() {
            return this.f186075d;
        }

        public final int hashCode() {
            return this.f186074c.hashCode() + (this.f186073b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(message=");
            sb2.append(this.f186073b);
            sb2.append(", error=");
            return c.n(sb2, this.f186074c, ')');
        }
    }

    /* compiled from: MasterPlanInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction$InitialArgsChecked;", "Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitialArgsChecked implements MasterPlanInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C49283b f186076b;

        public InitialArgsChecked(@k C49283b c49283b) {
            this.f186076b = c49283b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitialArgsChecked) && L.f(this.f186076b, ((InitialArgsChecked) obj).f186076b);
        }

        public final int hashCode() {
            return this.f186076b.hashCode();
        }

        @k
        public final String toString() {
            return "InitialArgsChecked(masterPlanData=" + this.f186076b + ')';
        }
    }

    /* compiled from: MasterPlanInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction$Loaded;", "Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loaded implements MasterPlanInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ArrayList f186077b;

        public Loaded(@l ArrayList arrayList) {
            this.f186077b = arrayList;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF267993e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && this.f186077b.equals(((Loaded) obj).f186077b);
        }

        public final int hashCode() {
            return this.f186077b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("Loaded(data="), this.f186077b, ')');
        }
    }

    /* compiled from: MasterPlanInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction$Loading;", "Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction;", "()V", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading implements MasterPlanInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f186078b = new Loading();

        private Loading() {
        }
    }

    /* compiled from: MasterPlanInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction$NavigateBack;", "Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction;", "()V", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NavigateBack implements MasterPlanInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NavigateBack f186079b = new NavigateBack();

        private NavigateBack() {
        }
    }

    /* compiled from: MasterPlanInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction$NavigateForward;", "Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NavigateForward implements MasterPlanInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f186080b;

        public NavigateForward(@k DeepLink deepLink) {
            this.f186080b = deepLink;
        }
    }

    /* compiled from: MasterPlanInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction$WrongInitialArgs;", "Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction;", "()V", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WrongInitialArgs implements MasterPlanInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final WrongInitialArgs f186081b = new WrongInitialArgs();

        private WrongInitialArgs() {
        }
    }
}
