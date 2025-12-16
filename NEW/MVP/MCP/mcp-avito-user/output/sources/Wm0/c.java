package Wm0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.error.ApiError;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryReturnCheckoutState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LWm0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_return-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f18035b;

    /* compiled from: DeliveryReturnCheckoutState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LWm0/c$a;", "", "<init>", "()V", "a", "b", "c", "LWm0/c$a$a;", "LWm0/c$a$b;", "LWm0/c$a$c;", "_avito_return-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: DeliveryReturnCheckoutState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWm0/c$a$a;", "LWm0/c$a;", "_avito_return-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Wm0.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C1282a extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f18036a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f18037b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f18038c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f18039d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f18040e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f18041f;

            /* renamed from: g, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f18042g;

            /* JADX WARN: Multi-variable type inference failed */
            public C1282a(@k String str, @k String str2, @k String str3, @k String str4, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list3) {
                super(null);
                this.f18036a = str;
                this.f18037b = str2;
                this.f18038c = str3;
                this.f18039d = str4;
                this.f18040e = list;
                this.f18041f = list2;
                this.f18042g = list3;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1282a)) {
                    return false;
                }
                C1282a c1282a = (C1282a) obj;
                return L.f(this.f18036a, c1282a.f18036a) && L.f(this.f18037b, c1282a.f18037b) && L.f(this.f18038c, c1282a.f18038c) && L.f(this.f18039d, c1282a.f18039d) && L.f(this.f18040e, c1282a.f18040e) && L.f(this.f18041f, c1282a.f18041f) && L.f(this.f18042g, c1282a.f18042g);
            }

            public final int hashCode() {
                return this.f18042g.hashCode() + H.e(H.e(H.d(H.d(H.d(this.f18036a.hashCode() * 31, 31, this.f18037b), 31, this.f18038c), 31, this.f18039d), 31, this.f18040e), 31, this.f18041f);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Content(title=");
                sb2.append(this.f18036a);
                sb2.append(", topFormId=");
                sb2.append(this.f18037b);
                sb2.append(", mainFormId=");
                sb2.append(this.f18038c);
                sb2.append(", bottomFormId=");
                sb2.append(this.f18039d);
                sb2.append(", topComponents=");
                sb2.append(this.f18040e);
                sb2.append(", mainComponents=");
                sb2.append(this.f18041f);
                sb2.append(", bottomComponents=");
                return H.p(sb2, this.f18042g, ')');
            }
        }

        /* compiled from: DeliveryReturnCheckoutState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWm0/c$a$b;", "LWm0/c$a;", "_avito_return-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ApiError f18043a;

            public b(@k ApiError apiError) {
                super(null);
                this.f18043a = apiError;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f18043a, ((b) obj).f18043a);
            }

            public final int hashCode() {
                return this.f18043a.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.n(new StringBuilder("Failed(error="), this.f18043a, ')');
            }
        }

        /* compiled from: DeliveryReturnCheckoutState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWm0/c$a$c;", "LWm0/c$a;", "<init>", "()V", "_avito_return-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Wm0.c$a$c, reason: collision with other inner class name */
        public static final class C1283c extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C1283c f18044a = new C1283c();

            public C1283c() {
                super(null);
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && L.f(this.f18035b, ((c) obj).f18035b);
    }

    public final int hashCode() {
        return this.f18035b.hashCode();
    }

    @k
    public final String toString() {
        return "DeliveryReturnCheckoutState(contentState=" + this.f18035b + ')';
    }

    public /* synthetic */ c(a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? a.C1283c.f18044a : aVar);
    }

    public c(@k a aVar) {
        this.f18035b = aVar;
    }
}
