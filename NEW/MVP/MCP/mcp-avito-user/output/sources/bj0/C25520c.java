package bJ0;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.user_adverts.tab_actions.info.UserAdvertsActionResultInfo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertsActionResultState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LbJ0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bJ0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C25520c extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UserAdvertsActionResultInfo f57035b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f57036c;

    /* compiled from: UserAdvertsActionResultState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LbJ0/c$a;", "", "a", "b", "LbJ0/c$a$a;", "LbJ0/c$a$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bJ0.c$a */
    public interface a {

        /* compiled from: UserAdvertsActionResultState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbJ0/c$a$a;", "LbJ0/c$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: bJ0.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C1998a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ArrayList f57037a;

            public C1998a(@k ArrayList arrayList) {
                this.f57037a = arrayList;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1998a) && this.f57037a.equals(((C1998a) obj).f57037a);
            }

            public final int hashCode() {
                return this.f57037a.hashCode();
            }

            @k
            public final String toString() {
                return e.p(new StringBuilder("Content(items="), this.f57037a, ')');
            }
        }

        /* compiled from: UserAdvertsActionResultState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbJ0/c$a$b;", "LbJ0/c$a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: bJ0.c$a$b */
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f57038a = new b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 377925550;
            }

            @k
            public final String toString() {
                return "None";
            }
        }
    }

    public /* synthetic */ C25520c(UserAdvertsActionResultInfo userAdvertsActionResultInfo, a aVar, int i12, C42822w c42822w) {
        this(userAdvertsActionResultInfo, (i12 & 2) != 0 ? a.b.f57038a : aVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25520c)) {
            return false;
        }
        C25520c c25520c = (C25520c) obj;
        return L.f(this.f57035b, c25520c.f57035b) && L.f(this.f57036c, c25520c.f57036c);
    }

    public final int hashCode() {
        return this.f57036c.hashCode() + (this.f57035b.f314611b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "UserAdvertsActionResultState(infoParams=" + this.f57035b + ", viewState=" + this.f57036c + ')';
    }

    public C25520c(@k UserAdvertsActionResultInfo userAdvertsActionResultInfo, @k a aVar) {
        this.f57035b = userAdvertsActionResultInfo;
        this.f57036c = aVar;
    }
}
