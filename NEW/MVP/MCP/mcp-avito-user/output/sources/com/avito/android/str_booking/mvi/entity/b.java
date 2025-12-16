package com.avito.android.str_booking.mvi.entity;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AnimationOverlayUrl;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_booking.mvi.entity.a;
import com.avito.android.str_booking.network.models.sections.UpdatedTimeContent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingOneTimeEvent.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "Lcom/avito/android/str_booking/mvi/entity/b$a;", "Lcom/avito/android/str_booking/mvi/entity/b$b;", "Lcom/avito/android/str_booking/mvi/entity/b$c;", "Lcom/avito/android/str_booking/mvi/entity/b$d;", "Lcom/avito/android/str_booking/mvi/entity/b$e;", "Lcom/avito/android/str_booking/mvi/entity/b$f;", "Lcom/avito/android/str_booking/mvi/entity/b$g;", "Lcom/avito/android/str_booking/mvi/entity/b$h;", "Lcom/avito/android/str_booking/mvi/entity/b$i;", "Lcom/avito/android/str_booking/mvi/entity/b$j;", "Lcom/avito/android/str_booking/mvi/entity/b$k;", "Lcom/avito/android/str_booking/mvi/entity/b$l;", "Lcom/avito/android/str_booking/mvi/entity/b$m;", "Lcom/avito/android/str_booking/mvi/entity/b$n;", "Lcom/avito/android/str_booking/mvi/entity/b$o;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: StrBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/b$a;", "Lcom/avito/android/str_booking/mvi/entity/b;", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f285797a = new a();
    }

    /* compiled from: StrBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/b$b;", "Lcom/avito/android/str_booking/mvi/entity/b;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_booking.mvi.entity.b$b, reason: collision with other inner class name */
    public static final /* data */ class C8554b implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f285798a;

        public C8554b(@Y61.k String str) {
            this.f285798a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8554b) && L.f(this.f285798a, ((C8554b) obj).f285798a);
        }

        public final int hashCode() {
            return this.f285798a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("CallUser(url="), this.f285798a, ')');
        }
    }

    /* compiled from: StrBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/b$c;", "Lcom/avito/android/str_booking/mvi/entity/b;", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f285799a = new c();
    }

    /* compiled from: StrBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/b$d;", "Lcom/avito/android/str_booking/mvi/entity/b;", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f285800a = new d();
    }

    /* compiled from: StrBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/b$e;", "Lcom/avito/android/str_booking/mvi/entity/b;", "a", "b", "Lcom/avito/android/str_booking/mvi/entity/b$e$a;", "Lcom/avito/android/str_booking/mvi/entity/b$e$b;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface e extends b {

        /* compiled from: StrBookingOneTimeEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/b$e$a;", "Lcom/avito/android/str_booking/mvi/entity/b$e;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements e {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final DeepLink f285801a;

            public a(@Y61.k DeepLink deepLink) {
                this.f285801a = deepLink;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f285801a, ((a) obj).f285801a);
            }

            public final int hashCode() {
                return this.f285801a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("Deeplink(deeplink="), this.f285801a, ')');
            }
        }

        /* compiled from: StrBookingOneTimeEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/b$e$b;", "Lcom/avito/android/str_booking/mvi/entity/b$e;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.str_booking.mvi.entity.b$e$b, reason: collision with other inner class name */
        public static final /* data */ class C8555b implements e {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f285802a;

            public C8555b(@Y61.k String str) {
                this.f285802a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C8555b) && L.f(this.f285802a, ((C8555b) obj).f285802a);
            }

            public final int hashCode() {
                return this.f285802a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Link(url="), this.f285802a, ')');
            }
        }
    }

    /* compiled from: StrBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/b$f;", "Lcom/avito/android/str_booking/mvi/entity/b;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<Image> f285803a;

        /* renamed from: b, reason: collision with root package name */
        public final int f285804b;

        public f(@Y61.k List<Image> list, int i12) {
            this.f285803a = list;
            this.f285804b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f285803a, fVar.f285803a) && this.f285804b == fVar.f285804b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f285804b) + (this.f285803a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenGalleryScreen(images=");
            sb2.append(this.f285803a);
            sb2.append(", position=");
            return r.t(sb2, this.f285804b, ')');
        }
    }

    /* compiled from: StrBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/b$g;", "Lcom/avito/android/str_booking/mvi/entity/b;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Coordinates f285805a;

        public g(@Y61.k Coordinates coordinates) {
            this.f285805a = coordinates;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f285805a, ((g) obj).f285805a);
        }

        public final int hashCode() {
            return this.f285805a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenMap(coordinates=" + this.f285805a + ')';
        }
    }

    /* compiled from: StrBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/b$h;", "Lcom/avito/android/str_booking/mvi/entity/b;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f285806a;

        public h(@Y61.k String str) {
            this.f285806a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f285806a, ((h) obj).f285806a);
        }

        public final int hashCode() {
            return this.f285806a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenWebView(url="), this.f285806a, ')');
        }
    }

    /* compiled from: StrBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/b$i;", "Lcom/avito/android/str_booking/mvi/entity/b;", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f285807a = new i();
    }

    /* compiled from: StrBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/b$j;", "Lcom/avito/android/str_booking/mvi/entity/b;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f285808a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f285809b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f285810c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final AttributedText f285811d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final a.i f285812e;

        public j(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l AttributedText attributedText, @Y61.k a.i iVar) {
            this.f285808a = str;
            this.f285809b = str2;
            this.f285810c = str3;
            this.f285811d = attributedText;
            this.f285812e = iVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return L.f(this.f285808a, jVar.f285808a) && L.f(this.f285809b, jVar.f285809b) && L.f(this.f285810c, jVar.f285810c) && L.f(this.f285811d, jVar.f285811d) && L.f(this.f285812e, jVar.f285812e);
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(this.f285808a.hashCode() * 31, 31, this.f285809b), 31, this.f285810c);
            AttributedText attributedText = this.f285811d;
            return this.f285812e.hashCode() + ((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            return "ShowConfirmBottomSheet(title=" + this.f285808a + ", approveButtonText=" + this.f285809b + ", cancelButtonText=" + this.f285810c + ", bodyText=" + this.f285811d + ", approveAction=" + this.f285812e + ')';
        }
    }

    /* compiled from: StrBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/b$k;", "Lcom/avito/android/str_booking/mvi/entity/b;", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class k implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f285813a = new k();
    }

    /* compiled from: StrBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/b$l;", "Lcom/avito/android/str_booking/mvi/entity/b;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.str_booking.domain.c f285814a;

        public l(@Y61.k com.avito.android.str_booking.domain.c cVar) {
            this.f285814a = cVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f285814a, ((l) obj).f285814a);
        }

        public final int hashCode() {
            return this.f285814a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowOnboardingTooltip(onboardingInfo=" + this.f285814a + ')';
        }
    }

    /* compiled from: StrBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/b$m;", "Lcom/avito/android/str_booking/mvi/entity/b;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AnimationOverlayUrl f285815a;

        public m(@Y61.k AnimationOverlayUrl animationOverlayUrl) {
            this.f285815a = animationOverlayUrl;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && L.f(this.f285815a, ((m) obj).f285815a);
        }

        public final int hashCode() {
            return this.f285815a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowStartAnimation(startAnimation=" + this.f285815a + ')';
        }
    }

    /* compiled from: StrBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/b$n;", "Lcom/avito/android/str_booking/mvi/entity/b;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final UpdatedTimeContent f285816a;

        public n(@Y61.l UpdatedTimeContent updatedTimeContent) {
            this.f285816a = updatedTimeContent;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && L.f(this.f285816a, ((n) obj).f285816a);
        }

        public final int hashCode() {
            UpdatedTimeContent updatedTimeContent = this.f285816a;
            if (updatedTimeContent == null) {
                return 0;
            }
            return updatedTimeContent.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "StartPolling(updatedTimeContent=" + this.f285816a + ')';
        }
    }

    /* compiled from: StrBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/b$o;", "Lcom/avito/android/str_booking/mvi/entity/b;", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final o f285817a = new o();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 1612999665;
        }

        @Y61.k
        public final String toString() {
            return "StopPolling";
        }
    }
}
