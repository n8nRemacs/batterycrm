package eA0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.ButtonAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SuccessState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LeA0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eA0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C39981c extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f395034b;

    /* compiled from: SuccessState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LeA0/c$a;", "", "<init>", "()V", "a", "b", "c", "LeA0/c$a$a;", "LeA0/c$a$b;", "LeA0/c$a$c;", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eA0.c$a */
    public static abstract class a {

        /* compiled from: SuccessState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeA0/c$a$a;", "LeA0/c$a;", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: eA0.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C11057a extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final UV0.c<com.avito.conveyor_item.a> f395035a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final List<ButtonAction> f395036b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final List<DeepLink> f395037c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final DeepLink f395038d;

            public C11057a() {
                throw null;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C11057a(UV0.c cVar, List list, List list2, DeepLink deepLink, int i12, C42822w c42822w) {
                C42822w c42822w2 = null;
                list2 = (i12 & 4) != 0 ? null : list2;
                deepLink = (i12 & 8) != 0 ? null : deepLink;
                super(c42822w2);
                this.f395035a = cVar;
                this.f395036b = list;
                this.f395037c = list2;
                this.f395038d = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C11057a)) {
                    return false;
                }
                C11057a c11057a = (C11057a) obj;
                return L.f(this.f395035a, c11057a.f395035a) && L.f(this.f395036b, c11057a.f395036b) && L.f(this.f395037c, c11057a.f395037c) && L.f(this.f395038d, c11057a.f395038d);
            }

            public final int hashCode() {
                int iE2 = H.e(this.f395035a.f16399b.hashCode() * 31, 31, this.f395036b);
                List<DeepLink> list = this.f395037c;
                int iHashCode = (iE2 + (list == null ? 0 : list.hashCode())) * 31;
                DeepLink deepLink = this.f395038d;
                return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Content(dataSource=");
                sb2.append(this.f395035a);
                sb2.append(", buttons=");
                sb2.append(this.f395036b);
                sb2.append(", onLoadedActions=");
                sb2.append(this.f395037c);
                sb2.append(", onWebviewCloseAction=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f395038d, ')');
            }
        }

        /* compiled from: SuccessState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeA0/c$a$b;", "LeA0/c$a;", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: eA0.c$a$b */
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ApiError f395039a;

            public b(@k ApiError apiError) {
                super(null);
                this.f395039a = apiError;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f395039a, ((b) obj).f395039a);
            }

            public final int hashCode() {
                return this.f395039a.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.n(new StringBuilder("Failed(error="), this.f395039a, ')');
            }
        }

        /* compiled from: SuccessState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LeA0/c$a$c;", "LeA0/c$a;", "<init>", "()V", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: eA0.c$a$c, reason: collision with other inner class name */
        public static final /* data */ class C11058c extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C11058c f395040a = new C11058c();

            public C11058c() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C11058c);
            }

            public final int hashCode() {
                return 2117712479;
            }

            @k
            public final String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C39981c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39981c) && L.f(this.f395034b, ((C39981c) obj).f395034b);
    }

    public final int hashCode() {
        return this.f395034b.hashCode();
    }

    @k
    public final String toString() {
        return "SuccessState(contentState=" + this.f395034b + ')';
    }

    public /* synthetic */ C39981c(a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? a.C11058c.f395040a : aVar);
    }

    public C39981c(@k a aVar) {
        this.f395034b = aVar;
    }
}
