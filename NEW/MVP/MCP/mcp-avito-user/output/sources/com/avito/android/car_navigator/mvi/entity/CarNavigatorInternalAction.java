package com.avito.android.car_navigator.mvi.entity;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CarNavigatorInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/car_navigator/mvi/entity/CarNavigatorInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CancelScreen", "OpenDeeplink", "OpenExternalUri", "ShowContent", "ShowLoading", "ShowLoadingError", "Lcom/avito/android/car_navigator/mvi/entity/CarNavigatorInternalAction$CancelScreen;", "Lcom/avito/android/car_navigator/mvi/entity/CarNavigatorInternalAction$OpenDeeplink;", "Lcom/avito/android/car_navigator/mvi/entity/CarNavigatorInternalAction$OpenExternalUri;", "Lcom/avito/android/car_navigator/mvi/entity/CarNavigatorInternalAction$ShowContent;", "Lcom/avito/android/car_navigator/mvi/entity/CarNavigatorInternalAction$ShowLoading;", "Lcom/avito/android/car_navigator/mvi/entity/CarNavigatorInternalAction$ShowLoadingError;", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CarNavigatorInternalAction extends n {

    /* compiled from: CarNavigatorInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/car_navigator/mvi/entity/CarNavigatorInternalAction$CancelScreen;", "Lcom/avito/android/car_navigator/mvi/entity/CarNavigatorInternalAction;", "<init>", "()V", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CancelScreen implements CarNavigatorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CancelScreen f115203b = new CancelScreen();

        private CancelScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CancelScreen);
        }

        public final int hashCode() {
            return 1635147790;
        }

        @k
        public final String toString() {
            return "CancelScreen";
        }
    }

    /* compiled from: CarNavigatorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/car_navigator/mvi/entity/CarNavigatorInternalAction$OpenDeeplink;", "Lcom/avito/android/car_navigator/mvi/entity/CarNavigatorInternalAction;", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements CarNavigatorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f115204b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f115205c;

        public OpenDeeplink(@k DeepLink deepLink, @l String str) {
            this.f115204b = deepLink;
            this.f115205c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenDeeplink)) {
                return false;
            }
            OpenDeeplink openDeeplink = (OpenDeeplink) obj;
            return L.f(this.f115204b, openDeeplink.f115204b) && L.f(this.f115205c, openDeeplink.f115205c);
        }

        public final int hashCode() {
            int iHashCode = this.f115204b.hashCode() * 31;
            String str = this.f115205c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeeplink(deepLink=");
            sb2.append(this.f115204b);
            sb2.append(", requestKey=");
            return C22026a.c(sb2, this.f115205c, ')');
        }

        public /* synthetic */ OpenDeeplink(DeepLink deepLink, String str, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: CarNavigatorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/car_navigator/mvi/entity/CarNavigatorInternalAction$OpenExternalUri;", "Lcom/avito/android/car_navigator/mvi/entity/CarNavigatorInternalAction;", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenExternalUri implements CarNavigatorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Uri f115206b;

        public OpenExternalUri(@k Uri uri) {
            this.f115206b = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenExternalUri) && L.f(this.f115206b, ((OpenExternalUri) obj).f115206b);
        }

        public final int hashCode() {
            return this.f115206b.hashCode();
        }

        @k
        public final String toString() {
            return a.t(new StringBuilder("OpenExternalUri(externalUri="), this.f115206b, ')');
        }
    }

    /* compiled from: CarNavigatorInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/car_navigator/mvi/entity/CarNavigatorInternalAction$ShowContent;", "Lcom/avito/android/car_navigator/mvi/entity/CarNavigatorInternalAction;", "<init>", "()V", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements CarNavigatorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowContent f115207b = new ShowContent();

        private ShowContent() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowContent);
        }

        public final int hashCode() {
            return -626585292;
        }

        @k
        public final String toString() {
            return "ShowContent";
        }
    }

    /* compiled from: CarNavigatorInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/car_navigator/mvi/entity/CarNavigatorInternalAction$ShowLoading;", "Lcom/avito/android/car_navigator/mvi/entity/CarNavigatorInternalAction;", "<init>", "()V", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLoading implements CarNavigatorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowLoading f115208b = new ShowLoading();

        private ShowLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowLoading);
        }

        public final int hashCode() {
            return -1241465353;
        }

        @k
        public final String toString() {
            return "ShowLoading";
        }
    }

    /* compiled from: CarNavigatorInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/car_navigator/mvi/entity/CarNavigatorInternalAction$ShowLoadingError;", "Lcom/avito/android/car_navigator/mvi/entity/CarNavigatorInternalAction;", "<init>", "()V", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLoadingError implements CarNavigatorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowLoadingError f115209b = new ShowLoadingError();

        private ShowLoadingError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowLoadingError);
        }

        public final int hashCode() {
            return 929842769;
        }

        @k
        public final String toString() {
            return "ShowLoadingError";
        }
    }
}
