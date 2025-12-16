package Dn0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.Option;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReasonDetailsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LDn0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class c extends q {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Option f3445b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f3446c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a f3447d;

    /* compiled from: ReasonDetailsState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LDn0/c$a;", "", "<init>", "()V", "a", "b", "c", "LDn0/c$a$a;", "LDn0/c$a$b;", "LDn0/c$a$c;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: ReasonDetailsState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDn0/c$a$a;", "LDn0/c$a;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Dn0.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0193a extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final List<com.avito.conveyor_item.a> f3448a;

            public C0193a() {
                this(null, 1, null);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0193a) && L.f(this.f3448a, ((C0193a) obj).f3448a);
            }

            public final int hashCode() {
                return this.f3448a.hashCode();
            }

            @k
            public final String toString() {
                return H.p(new StringBuilder("Content(itemsList="), this.f3448a, ')');
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0193a(@k List<? extends com.avito.conveyor_item.a> list) {
                super(null);
                this.f3448a = list;
            }

            public C0193a(List list, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? C42784z0.f406748b : list);
            }
        }

        /* compiled from: ReasonDetailsState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDn0/c$a$b;", "LDn0/c$a;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f3449a = new b();

            public b() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 2047848866;
            }

            @k
            public final String toString() {
                return "Initial";
            }
        }

        /* compiled from: ReasonDetailsState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDn0/c$a$c;", "LDn0/c$a;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Dn0.c$a$c, reason: collision with other inner class name */
        public static final /* data */ class C0194c extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C0194c f3450a = new C0194c();

            public C0194c() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C0194c);
            }

            public final int hashCode() {
                return -1204964500;
            }

            @k
            public final String toString() {
                return "LoadingButton";
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c() {
        this(null, null, null, 7, null);
    }

    public static c a(c cVar, Option option, String str, a aVar, int i12) {
        if ((i12 & 1) != 0) {
            option = cVar.f3445b;
        }
        if ((i12 & 2) != 0) {
            str = cVar.f3446c;
        }
        if ((i12 & 4) != 0) {
            aVar = cVar.f3447d;
        }
        cVar.getClass();
        return new c(option, str, aVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f3445b, cVar.f3445b) && L.f(this.f3446c, cVar.f3446c) && L.f(this.f3447d, cVar.f3447d);
    }

    public final int hashCode() {
        Option option = this.f3445b;
        int iHashCode = (option == null ? 0 : option.hashCode()) * 31;
        String str = this.f3446c;
        return this.f3447d.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "ReasonDetailsState(selectedOption=" + this.f3445b + ", commentText=" + this.f3446c + ", contentState=" + this.f3447d + ')';
    }

    public /* synthetic */ c(Option option, String str, a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : option, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? a.b.f3449a : aVar);
    }

    public c(@l Option option, @l String str, @k a aVar) {
        this.f3445b = option;
        this.f3446c = str;
        this.f3447d = aVar;
    }
}
