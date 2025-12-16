package com.avito.android.checkout.data;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: CheckoutResponse.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/checkout/data/CheckoutResponse;", "", "a", "CheckoutPromocode", "b", "c", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CheckoutResponse {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final AttributedText f118143a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final MnzFloatingFooter f118144b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ButtonAction f118145c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ButtonAction f118146d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final c f118147e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ArrayList f118148f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final CheckoutPromocode f118149g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ArrayList f118150h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f118151i;

    /* compiled from: CheckoutResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/checkout/data/CheckoutResponse$CheckoutPromocode;", "", "State", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CheckoutPromocode {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ButtonAction f118152a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f118153b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f118154c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final State f118155d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final AttributedText f118156e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f118157f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CheckoutResponse.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/checkout/data/CheckoutResponse$CheckoutPromocode$State;", "", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class State {

            /* renamed from: b, reason: collision with root package name */
            public static final State f118158b;

            /* renamed from: c, reason: collision with root package name */
            public static final State f118159c;

            /* renamed from: d, reason: collision with root package name */
            public static final State f118160d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ State[] f118161e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f118162f;

            static {
                State state = new State("NORMAL", 0);
                f118158b = state;
                State state2 = new State("APPLIED", 1);
                f118159c = state2;
                State state3 = new State("INVALID", 2);
                f118160d = state3;
                State[] stateArr = {state, state2, state3};
                f118161e = stateArr;
                f118162f = kotlin.enums.c.a(stateArr);
            }

            public State() {
                throw null;
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) f118161e.clone();
            }
        }

        public CheckoutPromocode(@k ButtonAction buttonAction, @l String str, @l String str2, @k State state, @k AttributedText attributedText, @l String str3) {
            this.f118152a = buttonAction;
            this.f118153b = str;
            this.f118154c = str2;
            this.f118155d = state;
            this.f118156e = attributedText;
            this.f118157f = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckoutPromocode)) {
                return false;
            }
            CheckoutPromocode checkoutPromocode = (CheckoutPromocode) obj;
            return L.f(this.f118152a, checkoutPromocode.f118152a) && L.f(this.f118153b, checkoutPromocode.f118153b) && L.f(this.f118154c, checkoutPromocode.f118154c) && this.f118155d == checkoutPromocode.f118155d && L.f(this.f118156e, checkoutPromocode.f118156e) && L.f(this.f118157f, checkoutPromocode.f118157f);
        }

        public final int hashCode() {
            int iHashCode = this.f118152a.hashCode() * 31;
            String str = this.f118153b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f118154c;
            int iB2 = com.avito.android.actions_sheet.a.b((this.f118155d.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.f118156e);
            String str3 = this.f118157f;
            return iB2 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CheckoutPromocode(button=");
            sb2.append(this.f118152a);
            sb2.append(", message=");
            sb2.append(this.f118153b);
            sb2.append(", placeholder=");
            sb2.append(this.f118154c);
            sb2.append(", state=");
            sb2.append(this.f118155d);
            sb2.append(", title=");
            sb2.append(this.f118156e);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f118157f, ')');
        }
    }

    /* compiled from: CheckoutResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/checkout/data/CheckoutResponse$a;", "", "a", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Object f118163a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f118164b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AttributedText f118165c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final AttributedText f118166d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final AttributedText f118167e;

        /* compiled from: CheckoutResponse.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/checkout/data/CheckoutResponse$a$a;", "", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.checkout.data.CheckoutResponse$a$a, reason: collision with other inner class name */
        public static final /* data */ class C3436a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final AttributedText f118168a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final AttributedText f118169b;

            public C3436a(@k AttributedText attributedText, @k AttributedText attributedText2) {
                this.f118168a = attributedText;
                this.f118169b = attributedText2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3436a)) {
                    return false;
                }
                C3436a c3436a = (C3436a) obj;
                return L.f(this.f118168a, c3436a.f118168a) && L.f(this.f118169b, c3436a.f118169b);
            }

            public final int hashCode() {
                return this.f118169b.hashCode() + (this.f118168a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("CheckoutPriceDropDownList(price=");
                sb2.append(this.f118168a);
                sb2.append(", title=");
                return com.avito.android.actions_sheet.a.w(sb2, this.f118169b, ')');
            }
        }

        public a(@k AttributedText attributedText, @l List list, @l String str, @k AttributedText attributedText2, @l AttributedText attributedText3) {
            this.f118163a = list;
            this.f118164b = str;
            this.f118165c = attributedText;
            this.f118166d = attributedText2;
            this.f118167e = attributedText3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f118163a, aVar.f118163a) && L.f(this.f118164b, aVar.f118164b) && L.f(this.f118165c, aVar.f118165c) && L.f(this.f118166d, aVar.f118166d) && L.f(this.f118167e, aVar.f118167e);
        }

        public final int hashCode() {
            Object obj = this.f118163a;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            String str = this.f118164b;
            int iB2 = com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f118165c), 31, this.f118166d);
            AttributedText attributedText = this.f118167e;
            return iB2 + (attributedText != null ? attributedText.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CheckoutPrice(dropDownList=");
            sb2.append(this.f118163a);
            sb2.append(", oldPrice=");
            sb2.append(this.f118164b);
            sb2.append(", price=");
            sb2.append(this.f118165c);
            sb2.append(", title=");
            sb2.append(this.f118166d);
            sb2.append(", description=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f118167e, ')');
        }
    }

    /* compiled from: CheckoutResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/checkout/data/CheckoutResponse$b;", "", "a", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final a f118170a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final UniversalImage f118171b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f118172c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final AttributedText f118173d;

        /* renamed from: e, reason: collision with root package name */
        public final long f118174e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final AttributedText f118175f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final AttributedText f118176g;

        /* compiled from: CheckoutResponse.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/checkout/data/CheckoutResponse$b$a;", "", "a", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final C3437a f118177a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final DeepLink f118178b;

            /* compiled from: CheckoutResponse.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/checkout/data/CheckoutResponse$b$a$a;", "", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.checkout.data.CheckoutResponse$b$a$a, reason: collision with other inner class name */
            public static final /* data */ class C3437a {

                /* renamed from: a, reason: collision with root package name */
                @l
                public final String f118179a;

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f118180b;

                public C3437a(@l String str, @k String str2) {
                    this.f118179a = str;
                    this.f118180b = str2;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C3437a)) {
                        return false;
                    }
                    C3437a c3437a = (C3437a) obj;
                    return L.f(this.f118179a, c3437a.f118179a) && L.f(this.f118180b, c3437a.f118180b);
                }

                public final int hashCode() {
                    String str = this.f118179a;
                    return this.f118180b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("ColoredIcon(colorName=");
                    sb2.append(this.f118179a);
                    sb2.append(", iconName=");
                    return C22026a.c(sb2, this.f118180b, ')');
                }
            }

            public a(@k C3437a c3437a, @k DeepLink deepLink) {
                this.f118177a = c3437a;
                this.f118178b = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f118177a, aVar.f118177a) && L.f(this.f118178b, aVar.f118178b);
            }

            public final int hashCode() {
                return this.f118178b.hashCode() + (this.f118177a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("CheckoutServiceAction(icon=");
                sb2.append(this.f118177a);
                sb2.append(", uri=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f118178b, ')');
            }
        }

        public b(@l a aVar, @l UniversalImage universalImage, boolean z12, @k AttributedText attributedText, long j12, @k AttributedText attributedText2, @l AttributedText attributedText3) {
            this.f118170a = aVar;
            this.f118171b = universalImage;
            this.f118172c = z12;
            this.f118173d = attributedText;
            this.f118174e = j12;
            this.f118175f = attributedText2;
            this.f118176g = attributedText3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f118170a, bVar.f118170a) && L.f(this.f118171b, bVar.f118171b) && this.f118172c == bVar.f118172c && L.f(this.f118173d, bVar.f118173d) && this.f118174e == bVar.f118174e && L.f(this.f118175f, bVar.f118175f) && L.f(this.f118176g, bVar.f118176g);
        }

        public final int hashCode() {
            a aVar = this.f118170a;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            UniversalImage universalImage = this.f118171b;
            int iB2 = com.avito.android.actions_sheet.a.b(r.g(com.avito.android.actions_sheet.a.b(r.i((iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31, 31, this.f118172c), 31, this.f118173d), 31, this.f118174e), 31, this.f118175f);
            AttributedText attributedText = this.f118176g;
            return iB2 + (attributedText != null ? attributedText.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CheckoutService(action=");
            sb2.append(this.f118170a);
            sb2.append(", icon=");
            sb2.append(this.f118171b);
            sb2.append(", isRemoved=");
            sb2.append(this.f118172c);
            sb2.append(", price=");
            sb2.append(this.f118173d);
            sb2.append(", serviceId=");
            sb2.append(this.f118174e);
            sb2.append(", title=");
            sb2.append(this.f118175f);
            sb2.append(", description=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f118176g, ')');
        }
    }

    /* compiled from: CheckoutResponse.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/checkout/data/CheckoutResponse$c;", "", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final ButtonAction f118181a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Float f118182b;

        public c(@l Float f12, @l ButtonAction buttonAction) {
            this.f118181a = buttonAction;
            this.f118182b = f12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f118181a, cVar.f118181a) && L.f(this.f118182b, cVar.f118182b);
        }

        public final int hashCode() {
            ButtonAction buttonAction = this.f118181a;
            int iHashCode = (buttonAction == null ? 0 : buttonAction.hashCode()) * 31;
            Float f12 = this.f118182b;
            return iHashCode + (f12 != null ? f12.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Navbar(button=");
            sb2.append(this.f118181a);
            sb2.append(", progress=");
            return h.d(sb2, this.f118182b, ')');
        }
    }

    public CheckoutResponse(@l AttributedText attributedText, @l MnzFloatingFooter mnzFloatingFooter, @k ButtonAction buttonAction, @l ButtonAction buttonAction2, @l c cVar, @k ArrayList arrayList, @l CheckoutPromocode checkoutPromocode, @k ArrayList arrayList2, @k String str) {
        this.f118143a = attributedText;
        this.f118144b = mnzFloatingFooter;
        this.f118145c = buttonAction;
        this.f118146d = buttonAction2;
        this.f118147e = cVar;
        this.f118148f = arrayList;
        this.f118149g = checkoutPromocode;
        this.f118150h = arrayList2;
        this.f118151i = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutResponse)) {
            return false;
        }
        CheckoutResponse checkoutResponse = (CheckoutResponse) obj;
        return L.f(this.f118143a, checkoutResponse.f118143a) && L.f(this.f118144b, checkoutResponse.f118144b) && this.f118145c.equals(checkoutResponse.f118145c) && L.f(this.f118146d, checkoutResponse.f118146d) && L.f(this.f118147e, checkoutResponse.f118147e) && this.f118148f.equals(checkoutResponse.f118148f) && L.f(this.f118149g, checkoutResponse.f118149g) && this.f118150h.equals(checkoutResponse.f118150h) && L.f(this.f118151i, checkoutResponse.f118151i);
    }

    public final int hashCode() {
        AttributedText attributedText = this.f118143a;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        MnzFloatingFooter mnzFloatingFooter = this.f118144b;
        int iHashCode2 = (this.f118145c.hashCode() + ((iHashCode + (mnzFloatingFooter == null ? 0 : mnzFloatingFooter.hashCode())) * 31)) * 31;
        ButtonAction buttonAction = this.f118146d;
        int iHashCode3 = (iHashCode2 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        c cVar = this.f118147e;
        int iG2 = e.g(this.f118148f, (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31, 31);
        CheckoutPromocode checkoutPromocode = this.f118149g;
        return this.f118151i.hashCode() + e.g(this.f118150h, (iG2 + (checkoutPromocode != null ? checkoutPromocode.hashCode() : 0)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheckoutResponse(agreement=");
        sb2.append(this.f118143a);
        sb2.append(", bblFooter=");
        sb2.append(this.f118144b);
        sb2.append(", button=");
        sb2.append(this.f118145c);
        sb2.append(", installmentsButton=");
        sb2.append(this.f118146d);
        sb2.append(", navbar=");
        sb2.append(this.f118147e);
        sb2.append(", prices=");
        sb2.append(this.f118148f);
        sb2.append(", promocode=");
        sb2.append(this.f118149g);
        sb2.append(", services=");
        sb2.append(this.f118150h);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f118151i, ')');
    }
}
