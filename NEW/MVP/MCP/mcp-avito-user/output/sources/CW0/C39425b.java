package cw0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import aw0.C24186b;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.short_term_rent.generated.api.api_2_str_booking_request_pay_post.PaymentType;
import cw0.InterfaceC39426c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcw0/b;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cw0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C39425b extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f393064h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final C39425b f393065i = new C39425b(null, InterfaceC11001b.C11002b.f393073a, 0, false, InterfaceC39426c.C11003c.f393081a, PaymentType.Type.Prepaid.f254365b);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C24186b f393066b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC11001b f393067c;

    /* renamed from: d, reason: collision with root package name */
    public final long f393068d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f393069e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC39426c f393070f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f393071g;

    /* compiled from: BookingFormState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcw0/b$a;", "", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cw0.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BookingFormState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcw0/b$b;", "", "a", "b", "c", "Lcw0/b$b$a;", "Lcw0/b$b$b;", "Lcw0/b$b$c;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cw0.b$b, reason: collision with other inner class name */
    public interface InterfaceC11001b {

        /* compiled from: BookingFormState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcw0/b$b$a;", "Lcw0/b$b;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: cw0.b$b$a */
        public static final /* data */ class a implements InterfaceC11001b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f393072a = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1364263986;
            }

            @k
            public final String toString() {
                return "Error";
            }
        }

        /* compiled from: BookingFormState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcw0/b$b$b;", "Lcw0/b$b;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: cw0.b$b$b, reason: collision with other inner class name */
        public static final /* data */ class C11002b implements InterfaceC11001b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C11002b f393073a = new C11002b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C11002b);
            }

            public final int hashCode() {
                return -1386663706;
            }

            @k
            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: BookingFormState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcw0/b$b$c;", "Lcw0/b$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: cw0.b$b$c */
        public static final /* data */ class c implements InterfaceC11001b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final List<C39429f> f393074a;

            public c(@k List<C39429f> list) {
                this.f393074a = list;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f393074a, ((c) obj).f393074a);
            }

            public final int hashCode() {
                return this.f393074a.hashCode();
            }

            @k
            public final String toString() {
                return H.p(new StringBuilder("Response(pages="), this.f393074a, ')');
            }
        }
    }

    public C39425b(@l C24186b c24186b, @k InterfaceC11001b interfaceC11001b, long j12, boolean z12, @k InterfaceC39426c interfaceC39426c, @k String str) {
        this.f393066b = c24186b;
        this.f393067c = interfaceC11001b;
        this.f393068d = j12;
        this.f393069e = z12;
        this.f393070f = interfaceC39426c;
        this.f393071g = str;
    }

    public static C39425b a(C39425b c39425b, C24186b c24186b, InterfaceC11001b interfaceC11001b, long j12, boolean z12, InterfaceC39426c interfaceC39426c, String str, int i12) {
        C24186b c24186b2 = (i12 & 1) != 0 ? c39425b.f393066b : c24186b;
        InterfaceC11001b interfaceC11001b2 = (i12 & 2) != 0 ? c39425b.f393067c : interfaceC11001b;
        long j13 = (i12 & 4) != 0 ? c39425b.f393068d : j12;
        boolean z13 = (i12 & 8) != 0 ? c39425b.f393069e : z12;
        InterfaceC39426c interfaceC39426c2 = (i12 & 16) != 0 ? c39425b.f393070f : interfaceC39426c;
        String str2 = (i12 & 32) != 0 ? c39425b.f393071g : str;
        c39425b.getClass();
        return new C39425b(c24186b2, interfaceC11001b2, j13, z13, interfaceC39426c2, str2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39425b)) {
            return false;
        }
        C39425b c39425b = (C39425b) obj;
        return L.f(this.f393066b, c39425b.f393066b) && L.f(this.f393067c, c39425b.f393067c) && this.f393068d == c39425b.f393068d && this.f393069e == c39425b.f393069e && L.f(this.f393070f, c39425b.f393070f) && L.f(this.f393071g, c39425b.f393071g);
    }

    public final int hashCode() {
        C24186b c24186b = this.f393066b;
        return this.f393071g.hashCode() + ((this.f393070f.hashCode() + r.i(r.g((this.f393067c.hashCode() + ((c24186b == null ? 0 : c24186b.hashCode()) * 31)) * 31, 31, this.f393068d), 31, this.f393069e)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BookingFormState(formData=");
        sb2.append(this.f393066b);
        sb2.append(", loadingType=");
        sb2.append(this.f393067c);
        sb2.append(", currentPageId=");
        sb2.append(this.f393068d);
        sb2.append(", showProgress=");
        sb2.append(this.f393069e);
        sb2.append(", viewState=");
        sb2.append(this.f393070f);
        sb2.append(", paymentType=");
        return C22026a.c(sb2, this.f393071g, ')');
    }
}
