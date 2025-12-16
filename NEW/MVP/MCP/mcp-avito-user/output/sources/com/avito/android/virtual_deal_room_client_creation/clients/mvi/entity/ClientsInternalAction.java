package com.avito.android.virtual_deal_room_client_creation.clients.mvi.entity;

import AK.c;
import PN0.a;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientsInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ClientAddClicked", "ClientClicked", "CloseClicked", "Content", "Error", "Loading", "SearchInput", "Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction$ClientAddClicked;", "Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction$ClientClicked;", "Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction$CloseClicked;", "Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction$Content;", "Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction$Error;", "Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction$Loading;", "Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction$SearchInput;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ClientsInternalAction extends n {

    /* compiled from: ClientsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction$ClientAddClicked;", "Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction;", "<init>", "()V", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClientAddClicked implements ClientsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ClientAddClicked f326648b = new ClientAddClicked();

        private ClientAddClicked() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ClientAddClicked);
        }

        public final int hashCode() {
            return 460207408;
        }

        @k
        public final String toString() {
            return "ClientAddClicked";
        }
    }

    /* compiled from: ClientsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction$ClientClicked;", "Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClientClicked implements ClientsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f326649b;

        public ClientClicked(@k a aVar) {
            this.f326649b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClientClicked) && L.f(this.f326649b, ((ClientClicked) obj).f326649b);
        }

        public final int hashCode() {
            return this.f326649b.hashCode();
        }

        @k
        public final String toString() {
            return "ClientClicked(client=" + this.f326649b + ')';
        }
    }

    /* compiled from: ClientsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction$CloseClicked;", "Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction;", "<init>", "()V", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseClicked implements ClientsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseClicked f326650b = new CloseClicked();

        private CloseClicked() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseClicked);
        }

        public final int hashCode() {
            return 1240258894;
        }

        @k
        public final String toString() {
            return "CloseClicked";
        }
    }

    /* compiled from: ClientsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction$Content;", "Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements ClientsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f326651b;

        /* renamed from: c, reason: collision with root package name */
        public final int f326652c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f326653d;

        public Content(int i12, @k ArrayList arrayList, boolean z12) {
            this.f326651b = arrayList;
            this.f326652c = i12;
            this.f326653d = z12;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF315372f() {
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
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.f326651b.equals(content.f326651b) && this.f326652c == content.f326652c && this.f326653d == content.f326653d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f326653d) + r.e(this.f326652c, this.f326651b.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(data=");
            sb2.append(this.f326651b);
            sb2.append(", page=");
            sb2.append(this.f326652c);
            sb2.append(", isEnded=");
            return r.x(sb2, this.f326653d, ')');
        }
    }

    /* compiled from: ClientsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction$Error;", "Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements ClientsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f326654b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f326655c;

        public Error(@k ApiError apiError) {
            this.f326654b = apiError;
            this.f326655c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF315372f() {
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
            return (obj instanceof Error) && L.f(this.f326654b, ((Error) obj).f326654b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF315347e() {
            return this.f326655c;
        }

        public final int hashCode() {
            return this.f326654b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(error="), this.f326654b, ')');
        }
    }

    /* compiled from: ClientsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction$Loading;", "Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading extends TrackableLoadingStarted implements ClientsInternalAction {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f326656d;

        public Loading(boolean z12) {
            this.f326656d = z12;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && this.f326656d == ((Loading) obj).f326656d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return Boolean.hashCode(this.f326656d);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("Loading(isInitial="), this.f326656d, ')');
        }
    }

    /* compiled from: ClientsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction$SearchInput;", "Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchInput implements ClientsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f326657b;

        public SearchInput(@k String str) {
            this.f326657b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchInput) && L.f(this.f326657b, ((SearchInput) obj).f326657b);
        }

        public final int hashCode() {
            return this.f326657b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SearchInput(search="), this.f326657b, ')');
        }
    }
}
