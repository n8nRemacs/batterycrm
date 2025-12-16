package com.avito.android.user_address.suggest.mvi;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.geo_common.model.CoordsByAddressResult;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAddressSuggestMviInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Clear", "CoordsLoadingEnd", "CoordsLoadingStart", "Error", "LoadData", "SetAddress", "SuggestLoading", "SuggestNavigate", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction$Clear;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction$CoordsLoadingEnd;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction$CoordsLoadingStart;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction$Error;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction$LoadData;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction$SetAddress;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction$SuggestLoading;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction$SuggestNavigate;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface UserAddressSuggestMviInternalAction extends com.avito.android.analytics.screens.mvi.n {

    /* compiled from: UserAddressSuggestMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction$Clear;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction;", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Clear implements UserAddressSuggestMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Clear f308072b = new Clear();

        private Clear() {
        }
    }

    /* compiled from: UserAddressSuggestMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction$CoordsLoadingEnd;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction;", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CoordsLoadingEnd implements UserAddressSuggestMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final CoordsLoadingEnd f308073b = new CoordsLoadingEnd();

        private CoordsLoadingEnd() {
        }
    }

    /* compiled from: UserAddressSuggestMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction$CoordsLoadingStart;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CoordsLoadingStart extends TrackableLoadingStarted implements UserAddressSuggestMviInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f308074d = "user_address_suggest_coords_loading";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getF284160e() {
            return this.f308074d;
        }
    }

    /* compiled from: UserAddressSuggestMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction$Error;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements UserAddressSuggestMviInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Throwable f308075b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final J.a f308076c;

        public Error(@Y61.k Throwable th2) {
            this.f308075b = th2;
            this.f308076c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @Y61.l
        /* renamed from: d */
        public final String getF284160e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @Y61.l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.f308075b, ((Error) obj).f308075b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @Y61.k
        /* renamed from: g, reason: from getter */
        public final J.a getF284156f() {
            return this.f308076c;
        }

        public final int hashCode() {
            return this.f308075b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(error="), this.f308075b, ')');
        }
    }

    /* compiled from: UserAddressSuggestMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction$LoadData;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadData implements UserAddressSuggestMviInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f308077b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ArrayList f308078c;

        public LoadData(@Y61.k String str, @Y61.k ArrayList arrayList) {
            this.f308077b = str;
            this.f308078c = arrayList;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @Y61.l
        /* renamed from: d */
        public final String getF284160e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @Y61.l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadData)) {
                return false;
            }
            LoadData loadData = (LoadData) obj;
            return L.f(this.f308077b, loadData.f308077b) && this.f308078c.equals(loadData.f308078c);
        }

        public final int hashCode() {
            return this.f308078c.hashCode() + (this.f308077b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadData(query=");
            sb2.append(this.f308077b);
            sb2.append(", suggests=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f308078c, ')');
        }
    }

    /* compiled from: UserAddressSuggestMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction$SetAddress;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetAddress implements UserAddressSuggestMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f308079b;

        public SetAddress(@Y61.k String str) {
            this.f308079b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetAddress) && L.f(this.f308079b, ((SetAddress) obj).f308079b);
        }

        public final int hashCode() {
            return this.f308079b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("SetAddress(address="), this.f308079b, ')');
        }
    }

    /* compiled from: UserAddressSuggestMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction$SuggestLoading;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SuggestLoading extends TrackableLoadingStarted implements UserAddressSuggestMviInternalAction {
    }

    /* compiled from: UserAddressSuggestMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction$SuggestNavigate;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SuggestNavigate implements UserAddressSuggestMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f308080b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f308081c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final CoordsByAddressResult.Point f308082d;

        public SuggestNavigate(@Y61.k String str, @Y61.k String str2, @Y61.k CoordsByAddressResult.Point point) {
            this.f308080b = str;
            this.f308081c = str2;
            this.f308082d = point;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuggestNavigate)) {
                return false;
            }
            SuggestNavigate suggestNavigate = (SuggestNavigate) obj;
            return L.f(this.f308080b, suggestNavigate.f308080b) && L.f(this.f308081c, suggestNavigate.f308081c) && L.f(this.f308082d, suggestNavigate.f308082d);
        }

        public final int hashCode() {
            return this.f308082d.hashCode() + H.d(this.f308080b.hashCode() * 31, 31, this.f308081c);
        }

        @Y61.k
        public final String toString() {
            return "SuggestNavigate(geoX=" + this.f308080b + ", address=" + this.f308081c + ", point=" + this.f308082d + ')';
        }
    }
}
