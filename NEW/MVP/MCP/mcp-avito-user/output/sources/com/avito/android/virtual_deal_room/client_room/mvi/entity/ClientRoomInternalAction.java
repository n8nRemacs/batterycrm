package com.avito.android.virtual_deal_room.client_room.mvi.entity;

import DN0.b;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ClientRoomInternalAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CallClicked", "CallCopyClicked", "CategoryUpdated", "ClientEdited", "Close", "Content", "EditClicked", "Error", "Loading", "TabSelect", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction$CallClicked;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction$CallCopyClicked;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction$CategoryUpdated;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction$ClientEdited;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction$Close;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction$Content;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction$EditClicked;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction$Error;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction$Loading;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction$TabSelect;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ClientRoomInternalAction extends n {

    /* compiled from: ClientRoomInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction$CallClicked;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CallClicked implements ClientRoomInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f326362b;

        public CallClicked(@k String str) {
            this.f326362b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CallClicked) && L.f(this.f326362b, ((CallClicked) obj).f326362b);
        }

        public final int hashCode() {
            return this.f326362b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CallClicked(phone="), this.f326362b, ')');
        }
    }

    /* compiled from: ClientRoomInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction$CallCopyClicked;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CallCopyClicked implements ClientRoomInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f326363b;

        public CallCopyClicked(@k String str) {
            this.f326363b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CallCopyClicked) && L.f(this.f326363b, ((CallCopyClicked) obj).f326363b);
        }

        public final int hashCode() {
            return this.f326363b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CallCopyClicked(phone="), this.f326363b, ')');
        }
    }

    /* compiled from: ClientRoomInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction$CategoryUpdated;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction;", "<init>", "()V", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CategoryUpdated implements ClientRoomInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CategoryUpdated f326364b = new CategoryUpdated();

        private CategoryUpdated() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CategoryUpdated);
        }

        public final int hashCode() {
            return 871322055;
        }

        @k
        public final String toString() {
            return "CategoryUpdated";
        }
    }

    /* compiled from: ClientRoomInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction$ClientEdited;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClientEdited implements ClientRoomInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f326365b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f326366c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f326367d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f326368e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f326369f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f326370g;

        public ClientEdited(@k String str, @k String str2, @k String str3, @l String str4, @k String str5, @k String str6) {
            this.f326365b = str;
            this.f326366c = str2;
            this.f326367d = str3;
            this.f326368e = str4;
            this.f326369f = str5;
            this.f326370g = str6;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClientEdited)) {
                return false;
            }
            ClientEdited clientEdited = (ClientEdited) obj;
            return L.f(this.f326365b, clientEdited.f326365b) && L.f(this.f326366c, clientEdited.f326366c) && L.f(this.f326367d, clientEdited.f326367d) && L.f(this.f326368e, clientEdited.f326368e) && L.f(this.f326369f, clientEdited.f326369f) && L.f(this.f326370g, clientEdited.f326370g);
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(this.f326365b.hashCode() * 31, 31, this.f326366c), 31, this.f326367d);
            String str = this.f326368e;
            return this.f326370g.hashCode() + H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f326369f);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClientEdited(name=");
            sb2.append(this.f326365b);
            sb2.append(", firstName=");
            sb2.append(this.f326366c);
            sb2.append(", lastName=");
            sb2.append(this.f326367d);
            sb2.append(", middleName=");
            sb2.append(this.f326368e);
            sb2.append(", phone=");
            sb2.append(this.f326369f);
            sb2.append(", email=");
            return C22026a.c(sb2, this.f326370g, ')');
        }
    }

    /* compiled from: ClientRoomInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction$Close;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements ClientRoomInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f326371b;

        public Close(boolean z12) {
            this.f326371b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Close) && this.f326371b == ((Close) obj).f326371b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f326371b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("Close(needUpdate="), this.f326371b, ')');
        }
    }

    /* compiled from: ClientRoomInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction$EditClicked;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EditClicked implements ClientRoomInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f326385b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f326386c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f326387d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f326388e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f326389f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f326390g;

        public EditClicked(@k String str, @k String str2, @k String str3, @k String str4, @k String str5, @k String str6) {
            this.f326385b = str;
            this.f326386c = str2;
            this.f326387d = str3;
            this.f326388e = str4;
            this.f326389f = str5;
            this.f326390g = str6;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditClicked)) {
                return false;
            }
            EditClicked editClicked = (EditClicked) obj;
            return L.f(this.f326385b, editClicked.f326385b) && L.f(this.f326386c, editClicked.f326386c) && L.f(this.f326387d, editClicked.f326387d) && L.f(this.f326388e, editClicked.f326388e) && L.f(this.f326389f, editClicked.f326389f) && L.f(this.f326390g, editClicked.f326390g);
        }

        public final int hashCode() {
            return this.f326390g.hashCode() + H.d(H.d(H.d(H.d(this.f326385b.hashCode() * 31, 31, this.f326386c), 31, this.f326387d), 31, this.f326388e), 31, this.f326389f);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("EditClicked(id=");
            sb2.append(this.f326385b);
            sb2.append(", firstName=");
            sb2.append(this.f326386c);
            sb2.append(", lastName=");
            sb2.append(this.f326387d);
            sb2.append(", middleName=");
            sb2.append(this.f326388e);
            sb2.append(", phone=");
            sb2.append(this.f326389f);
            sb2.append(", email=");
            return C22026a.c(sb2, this.f326390g, ')');
        }
    }

    /* compiled from: ClientRoomInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction$Error;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements ClientRoomInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f326391b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f326392c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f326393d;

        public Error(@k ApiError apiError, boolean z12) {
            this.f326391b = apiError;
            this.f326392c = z12;
            this.f326393d = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF198624d() {
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
            return L.f(this.f326391b, error.f326391b) && this.f326392c == error.f326392c;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF304335c() {
            return this.f326393d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f326392c) + (this.f326391b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(error=");
            sb2.append(this.f326391b);
            sb2.append(", isContentLoaded=");
            return r.x(sb2, this.f326392c, ')');
        }
    }

    /* compiled from: ClientRoomInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction$Loading;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements ClientRoomInternalAction {
    }

    /* compiled from: ClientRoomInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction$TabSelect;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TabSelect implements ClientRoomInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final b f326394b;

        public TabSelect(@k b bVar) {
            this.f326394b = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TabSelect) && L.f(this.f326394b, ((TabSelect) obj).f326394b);
        }

        public final int hashCode() {
            return this.f326394b.hashCode();
        }

        @k
        public final String toString() {
            return "TabSelect(selectedCategory=" + this.f326394b + ')';
        }
    }

    /* compiled from: ClientRoomInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction$Content;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements ClientRoomInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f326372b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f326373c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Image f326374d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Image f326375e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f326376f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f326377g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f326378h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final String f326379i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final String f326380j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final String f326381k;

        /* renamed from: l, reason: collision with root package name */
        @k
        public final List<b> f326382l;

        /* renamed from: m, reason: collision with root package name */
        @k
        public final b f326383m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f326384n;

        public Content(@k String str, @l String str2, @l Image image, @l Image image2, boolean z12, @k String str3, @l String str4, @l String str5, @l String str6, @l String str7, @k List<b> list, @k b bVar, boolean z13) {
            this.f326372b = str;
            this.f326373c = str2;
            this.f326374d = image;
            this.f326375e = image2;
            this.f326376f = z12;
            this.f326377g = str3;
            this.f326378h = str4;
            this.f326379i = str5;
            this.f326380j = str6;
            this.f326381k = str7;
            this.f326382l = list;
            this.f326383m = bVar;
            this.f326384n = z13;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF198624d() {
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
            return L.f(this.f326372b, content.f326372b) && L.f(this.f326373c, content.f326373c) && L.f(this.f326374d, content.f326374d) && L.f(this.f326375e, content.f326375e) && this.f326376f == content.f326376f && L.f(this.f326377g, content.f326377g) && L.f(this.f326378h, content.f326378h) && L.f(this.f326379i, content.f326379i) && L.f(this.f326380j, content.f326380j) && L.f(this.f326381k, content.f326381k) && L.f(this.f326382l, content.f326382l) && L.f(this.f326383m, content.f326383m) && this.f326384n == content.f326384n;
        }

        public final int hashCode() {
            int iHashCode = this.f326372b.hashCode() * 31;
            String str = this.f326373c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Image image = this.f326374d;
            int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
            Image image2 = this.f326375e;
            int iD2 = H.d(r.i((iHashCode3 + (image2 == null ? 0 : image2.hashCode())) * 31, 31, this.f326376f), 31, this.f326377g);
            String str2 = this.f326378h;
            int iHashCode4 = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f326379i;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f326380j;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f326381k;
            return Boolean.hashCode(this.f326384n) + ((this.f326383m.hashCode() + H.e((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.f326382l)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(name=");
            sb2.append(this.f326372b);
            sb2.append(", phone=");
            sb2.append(this.f326373c);
            sb2.append(", avatarLight=");
            sb2.append(this.f326374d);
            sb2.append(", avatarDark=");
            sb2.append(this.f326375e);
            sb2.append(", isEditable=");
            sb2.append(this.f326376f);
            sb2.append(", clientId=");
            sb2.append(this.f326377g);
            sb2.append(", clientFirstName=");
            sb2.append(this.f326378h);
            sb2.append(", clientLastName=");
            sb2.append(this.f326379i);
            sb2.append(", clientMiddleName=");
            sb2.append(this.f326380j);
            sb2.append(", clientEmail=");
            sb2.append(this.f326381k);
            sb2.append(", availableCategories=");
            sb2.append(this.f326382l);
            sb2.append(", selectedCategory=");
            sb2.append(this.f326383m);
            sb2.append(", needToReloadCategory=");
            return r.x(sb2, this.f326384n, ')');
        }

        public /* synthetic */ Content(String str, String str2, Image image, Image image2, boolean z12, String str3, String str4, String str5, String str6, String str7, List list, b bVar, boolean z13, int i12, C42822w c42822w) {
            this(str, str2, image, image2, z12, str3, str4, str5, str6, str7, list, bVar, (i12 & 4096) != 0 ? true : z13);
        }
    }
}
