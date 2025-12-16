package com.avito.android.multigeo_flow.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.multigeo_flow.domain.AddressItem;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JobMultiGeoActions.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction;", "", "a", "b", "c", "DeleteAddress", "d", "e", "ShowError", "ShowLoading", "f", "Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction$a;", "Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction$b;", "Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction$c;", "Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction$DeleteAddress;", "Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction$d;", "Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction$e;", "Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction$ShowError;", "Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction$ShowLoading;", "Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction$f;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface InternalAction {

    /* compiled from: JobMultiGeoActions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction$DeleteAddress;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeleteAddress implements TrackableContent, InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f206985b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f206986c;

        public DeleteAddress(@k String str, @k String str2) {
            this.f206985b = str;
            this.f206986c = str2;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF211967d() {
            return "Deleted";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return "Deleted";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeleteAddress)) {
                return false;
            }
            DeleteAddress deleteAddress = (DeleteAddress) obj;
            return L.f(this.f206985b, deleteAddress.f206985b) && L.f(this.f206986c, deleteAddress.f206986c);
        }

        public final int hashCode() {
            return this.f206986c.hashCode() + (this.f206985b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DeleteAddress(jwt=");
            sb2.append(this.f206985b);
            sb2.append(", address=");
            return C22026a.c(sb2, this.f206986c, ')');
        }
    }

    /* compiled from: JobMultiGeoActions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction$ShowError;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements TrackableError, InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f206987b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f206988c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f206989d = "DeleteFailed";

        public ShowError(@k ApiError apiError) {
            this.f206987b = apiError;
            this.f206988c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF211967d() {
            return this.f206989d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return this.f206989d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowError) && L.f(this.f206987b, ((ShowError) obj).f206987b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF328859c() {
            return this.f206988c;
        }

        public final int hashCode() {
            return this.f206987b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("ShowError(error="), this.f206987b, ')');
        }
    }

    /* compiled from: JobMultiGeoActions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction$ShowLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLoading extends TrackableLoadingStarted implements InternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f206990d;

        public ShowLoading() {
            this(null, 1, null);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF211967d() {
            return this.f206990d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowLoading) && L.f(this.f206990d, ((ShowLoading) obj).f206990d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f206990d.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowLoading(contentType="), this.f206990d, ')');
        }

        public ShowLoading(String str, int i12, C42822w c42822w) {
            this.f206990d = (i12 & 1) != 0 ? "LoadingDelete" : str;
        }
    }

    /* compiled from: JobMultiGeoActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction$a;", "Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f206991b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AddressItem f206992c;

        public a(@k String str, @k AddressItem addressItem) {
            this.f206991b = str;
            this.f206992c = addressItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f206991b, aVar.f206991b) && L.f(this.f206992c, aVar.f206992c);
        }

        public final int hashCode() {
            return this.f206992c.hashCode() + (this.f206991b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "AddAddress(jwt=" + this.f206991b + ", item=" + this.f206992c + ')';
        }
    }

    /* compiled from: JobMultiGeoActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction$b;", "Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f206993b;

        public b(@k String str) {
            this.f206993b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f206993b, ((b) obj).f206993b);
        }

        public final int hashCode() {
            return this.f206993b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CloseFlow(jwt="), this.f206993b, ')');
        }
    }

    /* compiled from: JobMultiGeoActions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction$c;", "Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction;", "<init>", "()V", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final c f206994b = new c();
    }

    /* compiled from: JobMultiGeoActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction$d;", "Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f206995b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AddressItem f206996c;

        public d(@k String str, @k AddressItem addressItem) {
            this.f206995b = str;
            this.f206996c = addressItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f206995b, dVar.f206995b) && L.f(this.f206996c, dVar.f206996c);
        }

        public final int hashCode() {
            return this.f206996c.hashCode() + (this.f206995b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "EditAddress(jwt=" + this.f206995b + ", item=" + this.f206996c + ')';
        }
    }

    /* compiled from: JobMultiGeoActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction$e;", "Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AddressItem f206997b;

        public e(@k AddressItem addressItem) {
            this.f206997b = addressItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f206997b, ((e) obj).f206997b);
        }

        public final int hashCode() {
            return this.f206997b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenOptions(item=" + this.f206997b + ')';
        }
    }

    /* compiled from: JobMultiGeoActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction$f;", "Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements InternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f206998b;

        public f(int i12) {
            this.f206998b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f206998b == ((f) obj).f206998b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f206998b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("UpdateEditedItem(editedItemIndex="), this.f206998b, ')');
        }
    }
}
