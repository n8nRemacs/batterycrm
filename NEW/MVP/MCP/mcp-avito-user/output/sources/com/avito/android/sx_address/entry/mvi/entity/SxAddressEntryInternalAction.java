package com.avito.android.sx_address.entry.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SxAddressEntryInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/sx_address/entry/mvi/entity/SxAddressEntryInternalAction;", "", "a", "LoadedList", "LoadingError", "b", "ShowLoading", "Lcom/avito/android/sx_address/entry/mvi/entity/SxAddressEntryInternalAction$a;", "Lcom/avito/android/sx_address/entry/mvi/entity/SxAddressEntryInternalAction$LoadedList;", "Lcom/avito/android/sx_address/entry/mvi/entity/SxAddressEntryInternalAction$LoadingError;", "Lcom/avito/android/sx_address/entry/mvi/entity/SxAddressEntryInternalAction$b;", "Lcom/avito/android/sx_address/entry/mvi/entity/SxAddressEntryInternalAction$ShowLoading;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SxAddressEntryInternalAction {

    /* compiled from: SxAddressEntryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/entry/mvi/entity/SxAddressEntryInternalAction$LoadedList;", "Lcom/avito/android/sx_address/entry/mvi/entity/SxAddressEntryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadedList implements SxAddressEntryInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f292963b;

        public LoadedList(@k ArrayList arrayList) {
            this.f292963b = arrayList;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211483d() {
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
            return (obj instanceof LoadedList) && this.f292963b.equals(((LoadedList) obj).f292963b);
        }

        public final int hashCode() {
            return this.f292963b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("LoadedList(data="), this.f292963b, ')');
        }
    }

    /* compiled from: SxAddressEntryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/entry/mvi/entity/SxAddressEntryInternalAction$LoadingError;", "Lcom/avito/android/sx_address/entry/mvi/entity/SxAddressEntryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingError implements SxAddressEntryInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f292964b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f292965c;

        public LoadingError(@k ApiError apiError) {
            this.f292964b = apiError;
            J.a.f90383b.getClass();
            this.f292965c = J.a.C2676a.b(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211483d() {
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
            return (obj instanceof LoadingError) && L.f(this.f292964b, ((LoadingError) obj).f292964b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF291678c() {
            return this.f292965c;
        }

        public final int hashCode() {
            return this.f292964b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadingError(error="), this.f292964b, ')');
        }
    }

    /* compiled from: SxAddressEntryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/entry/mvi/entity/SxAddressEntryInternalAction$ShowLoading;", "Lcom/avito/android/sx_address/entry/mvi/entity/SxAddressEntryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoading extends TrackableLoadingStarted implements SxAddressEntryInternalAction {
    }

    /* compiled from: SxAddressEntryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/entry/mvi/entity/SxAddressEntryInternalAction$a;", "Lcom/avito/android/sx_address/entry/mvi/entity/SxAddressEntryInternalAction;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements SxAddressEntryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f292966b = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1384811919;
        }

        @k
        public final String toString() {
            return "GoBack";
        }
    }

    /* compiled from: SxAddressEntryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/entry/mvi/entity/SxAddressEntryInternalAction$b;", "Lcom/avito/android/sx_address/entry/mvi/entity/SxAddressEntryInternalAction;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements SxAddressEntryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f292967b;

        public b(@k DeepLink deepLink) {
            this.f292967b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f292967b, ((b) obj).f292967b);
        }

        public final int hashCode() {
            return this.f292967b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f292967b, ')');
        }
    }
}
