package com.avito.android.str_booking.mvi.entity;

import Jx0.C14258a;
import Vx0.AbstractC15725a;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.Image;
import com.avito.android.str_booking.network.models.common.Prompt;
import com.avito.android.str_booking.network.models.sections.InfoContent;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingAction.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "Lcom/avito/android/str_booking/mvi/entity/a$a;", "Lcom/avito/android/str_booking/mvi/entity/a$b;", "Lcom/avito/android/str_booking/mvi/entity/a$c;", "Lcom/avito/android/str_booking/mvi/entity/a$d;", "Lcom/avito/android/str_booking/mvi/entity/a$e;", "Lcom/avito/android/str_booking/mvi/entity/a$f;", "Lcom/avito/android/str_booking/mvi/entity/a$g;", "Lcom/avito/android/str_booking/mvi/entity/a$h;", "Lcom/avito/android/str_booking/mvi/entity/a$i;", "Lcom/avito/android/str_booking/mvi/entity/a$j;", "Lcom/avito/android/str_booking/mvi/entity/a$k;", "Lcom/avito/android/str_booking/mvi/entity/a$l;", "Lcom/avito/android/str_booking/mvi/entity/a$m;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: StrBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/a$a;", "Lcom/avito/android/str_booking/mvi/entity/a;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_booking.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C8553a implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final InfoContent f285779a;

        public C8553a(@Y61.l InfoContent infoContent) {
            this.f285779a = infoContent;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8553a) && L.f(this.f285779a, ((C8553a) obj).f285779a);
        }

        public final int hashCode() {
            InfoContent infoContent = this.f285779a;
            if (infoContent == null) {
                return 0;
            }
            return infoContent.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "AnimateInfoClick(infoContent=" + this.f285779a + ')';
        }
    }

    /* compiled from: StrBookingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/a$b;", "Lcom/avito/android/str_booking/mvi/entity/a;", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f285780a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -133021199;
        }

        @Y61.k
        public final String toString() {
            return "ClickClose";
        }
    }

    /* compiled from: StrBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/a$c;", "Lcom/avito/android/str_booking/mvi/entity/a;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f285781a;

        public c(@Y61.l String str) {
            this.f285781a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f285781a, ((c) obj).f285781a);
        }

        public final int hashCode() {
            String str = this.f285781a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("CollapsableCalculationClick(id="), this.f285781a, ')');
        }
    }

    /* compiled from: StrBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/a$d;", "Lcom/avito/android/str_booking/mvi/entity/a;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final DeepLink f285782a;

        public d(@Y61.l DeepLink deepLink) {
            this.f285782a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f285782a, ((d) obj).f285782a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f285782a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeeplinkClick(deeplink="), this.f285782a, ')');
        }
    }

    /* compiled from: StrBookingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/a$e;", "Lcom/avito/android/str_booking/mvi/entity/a;", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f285783a = new e();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 90936580;
        }

        @Y61.k
        public final String toString() {
            return "GuestProfileButtonClick";
        }
    }

    /* compiled from: StrBookingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/a$f;", "Lcom/avito/android/str_booking/mvi/entity/a;", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f285784a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1746532096;
        }

        @Y61.k
        public final String toString() {
            return "GuestProfileTooltipShown";
        }
    }

    /* compiled from: StrBookingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/a$g;", "Lcom/avito/android/str_booking/mvi/entity/a;", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f285785a = new g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 644147742;
        }

        @Y61.k
        public final String toString() {
            return "HideFooter";
        }
    }

    /* compiled from: StrBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/a$h;", "Lcom/avito/android/str_booking/mvi/entity/a;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<Image> f285786a;

        /* renamed from: b, reason: collision with root package name */
        public final int f285787b;

        public h(@Y61.k List<Image> list, int i12) {
            this.f285786a = list;
            this.f285787b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f285786a, hVar.f285786a) && this.f285787b == hVar.f285787b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f285787b) + (this.f285786a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenGalleryScreenClick(images=");
            sb2.append(this.f285786a);
            sb2.append(", position=");
            return r.t(sb2, this.f285787b, ')');
        }
    }

    /* compiled from: StrBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/a$i;", "Lcom/avito/android/str_booking/mvi/entity/a;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AbstractC15725a f285788a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Map<String, String> f285789b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Prompt f285790c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final C14258a f285791d;

        public i(@Y61.k AbstractC15725a abstractC15725a, @Y61.l Map<String, String> map, @Y61.l Prompt prompt, @Y61.l C14258a c14258a) {
            this.f285788a = abstractC15725a;
            this.f285789b = map;
            this.f285790c = prompt;
            this.f285791d = c14258a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f285788a, iVar.f285788a) && L.f(this.f285789b, iVar.f285789b) && L.f(this.f285790c, iVar.f285790c) && L.f(this.f285791d, iVar.f285791d);
        }

        public final int hashCode() {
            int iHashCode = this.f285788a.hashCode() * 31;
            Map<String, String> map = this.f285789b;
            int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
            Prompt prompt = this.f285790c;
            int iHashCode3 = (iHashCode2 + (prompt == null ? 0 : prompt.hashCode())) * 31;
            C14258a c14258a = this.f285791d;
            return iHashCode3 + (c14258a != null ? c14258a.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "OpenLink(linkType=" + this.f285788a + ", content=" + this.f285789b + ", prompt=" + this.f285790c + ", analyticsEvent=" + this.f285791d + ')';
        }
    }

    /* compiled from: StrBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/a$j;", "Lcom/avito/android/str_booking/mvi/entity/a;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Coordinates f285792a;

        public j(@Y61.k Coordinates coordinates) {
            this.f285792a = coordinates;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f285792a, ((j) obj).f285792a);
        }

        public final int hashCode() {
            return this.f285792a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenMapClick(coordinates=" + this.f285792a + ')';
        }
    }

    /* compiled from: StrBookingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/a$k;", "Lcom/avito/android/str_booking/mvi/entity/a;", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f285793a = new k();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 89266118;
        }

        @Y61.k
        public final String toString() {
            return "ReloadScreen";
        }
    }

    /* compiled from: StrBookingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/a$l;", "Lcom/avito/android/str_booking/mvi/entity/a;", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f285794a = new l();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 1076195225;
        }

        @Y61.k
        public final String toString() {
            return "ShowFooter";
        }
    }

    /* compiled from: StrBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/a$m;", "Lcom/avito/android/str_booking/mvi/entity/a;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Float f285795a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Parcelable f285796b;

        public m(@Y61.l Float f12, @Y61.l Parcelable parcelable) {
            this.f285795a = f12;
            this.f285796b = parcelable;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return L.f(this.f285795a, mVar.f285795a) && L.f(this.f285796b, mVar.f285796b);
        }

        public final int hashCode() {
            Float f12 = this.f285795a;
            int iHashCode = (f12 == null ? 0 : f12.hashCode()) * 31;
            Parcelable parcelable = this.f285796b;
            return iHashCode + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateScrollStates(motionScrollProgress=");
            sb2.append(this.f285795a);
            sb2.append(", mainItemsScrollState=");
            return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.f285796b, ')');
        }
    }
}
