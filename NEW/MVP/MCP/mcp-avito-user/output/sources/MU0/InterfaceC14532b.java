package Mu0;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceOrdersListOneTimeEvent.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LMu0/b;", "", "a", "b", "c", "d", "e", "f", "g", "LMu0/b$a;", "LMu0/b$b;", "LMu0/b$c;", "LMu0/b$d;", "LMu0/b$e;", "LMu0/b$f;", "LMu0/b$g;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mu0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC14532b {

    /* compiled from: ServiceOrdersListOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMu0/b$a;", "LMu0/b;", "<init>", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.b$a */
    public static final class a implements InterfaceC14532b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f11074a = new a();
    }

    /* compiled from: ServiceOrdersListOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMu0/b$b;", "LMu0/b;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0705b implements InterfaceC14532b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f11075a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f11076b;

        public C0705b(@l String str, @l String str2) {
            this.f11075a = str;
            this.f11076b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0705b)) {
                return false;
            }
            C0705b c0705b = (C0705b) obj;
            return L.f(this.f11075a, c0705b.f11075a) && L.f(this.f11076b, c0705b.f11076b);
        }

        public final int hashCode() {
            String str = this.f11075a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f11076b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CopyPhoneToClipboard(phone=");
            sb2.append(this.f11075a);
            sb2.append(", toastMessage=");
            return C22026a.c(sb2, this.f11076b, ')');
        }
    }

    /* compiled from: ServiceOrdersListOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMu0/b$c;", "LMu0/b;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.b$c */
    public static final /* data */ class c implements InterfaceC14532b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f11077a;

        public c(@k DeepLink deepLink) {
            this.f11077a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f11077a, ((c) obj).f11077a);
        }

        public final int hashCode() {
            return this.f11077a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnDeeplinkClicked(deepLink="), this.f11077a, ')');
        }
    }

    /* compiled from: ServiceOrdersListOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMu0/b$d;", "LMu0/b;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.b$d */
    public static final /* data */ class d implements InterfaceC14532b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f11078a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Bundle f11079b;

        public d(@k DeepLink deepLink, @l Bundle bundle) {
            this.f11078a = deepLink;
            this.f11079b = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f11078a, dVar.f11078a) && L.f(this.f11079b, dVar.f11079b);
        }

        public final int hashCode() {
            int iHashCode = this.f11078a.hashCode() * 31;
            Bundle bundle = this.f11079b;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeepLink(deepLink=");
            sb2.append(this.f11078a);
            sb2.append(", bundle=");
            return H.m(sb2, this.f11079b, ')');
        }

        public /* synthetic */ d(DeepLink deepLink, Bundle bundle, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : bundle);
        }
    }

    /* compiled from: ServiceOrdersListOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMu0/b$e;", "LMu0/b;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.b$e */
    public static final /* data */ class e implements InterfaceC14532b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f11080a;

        public e(@k PrintableText printableText) {
            this.f11080a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f11080a, ((e) obj).f11080a);
        }

        public final int hashCode() {
            return this.f11080a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowErrorToast(message="), this.f11080a, ')');
        }
    }

    /* compiled from: ServiceOrdersListOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMu0/b$f;", "LMu0/b;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.b$f */
    public static final /* data */ class f implements InterfaceC14532b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f11081a;

        public f(@k String str) {
            this.f11081a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f11081a, ((f) obj).f11081a);
        }

        public final int hashCode() {
            return this.f11081a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToast(message="), this.f11081a, ')');
        }
    }

    /* compiled from: ServiceOrdersListOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMu0/b$g;", "LMu0/b;", "<init>", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.b$g */
    public static final class g implements InterfaceC14532b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f11082a = new g();
    }
}
