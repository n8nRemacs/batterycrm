package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.view.C23038g0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.P2;
import com.avito.user_stats.model.extended_user_stats.UserMessage;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BasicIndicatorsTabViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/i;", "LQJ0/d;", "a", "b", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i extends QJ0.d {

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public static final a f317419R = new a(null);

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_stats.b f317420L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f317421M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f317422N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f317423O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final C23038g0<b> f317424P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f317425Q;

    /* compiled from: BasicIndicatorsTabViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/i$a;", "", "<init>", "()V", "", "VAS_BONUSES", "Ljava/lang/String;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BasicIndicatorsTabViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/i$b;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/i$b$a;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/i$b$b;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/i$b$c;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: BasicIndicatorsTabViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/i$b$a;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/i$b;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f317426a;

            public a(@Y61.k String str) {
                super(null);
                this.f317426a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f317426a, ((a) obj).f317426a);
            }

            public final int hashCode() {
                return this.f317426a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Error(message="), this.f317426a, ')');
            }
        }

        /* compiled from: BasicIndicatorsTabViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/i$b$b;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/i$b;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.i$b$b, reason: collision with other inner class name */
        public static final /* data */ class C9850b extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final ArrayList f317427a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final List<String> f317428b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final UserMessage f317429c;

            public C9850b(@Y61.k ArrayList arrayList, @Y61.k List list, @Y61.l UserMessage userMessage) {
                super(null);
                this.f317427a = arrayList;
                this.f317428b = list;
                this.f317429c = userMessage;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9850b)) {
                    return false;
                }
                C9850b c9850b = (C9850b) obj;
                return L.f(this.f317427a, c9850b.f317427a) && L.f(this.f317428b, c9850b.f317428b) && L.f(this.f317429c, c9850b.f317429c);
            }

            public final int hashCode() {
                int iE2 = H.e(this.f317427a.hashCode() * 31, 31, this.f317428b);
                UserMessage userMessage = this.f317429c;
                return iE2 + (userMessage == null ? 0 : userMessage.hashCode());
            }

            @Y61.k
            public final String toString() {
                return "Loaded(screenItems=" + this.f317427a + ", tabs=" + this.f317428b + ", userMessage=" + this.f317429c + ')';
            }
        }

        /* compiled from: BasicIndicatorsTabViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/i$b$c;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/i$b;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f317430a = new c();

            public c() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -975901292;
            }

            @Y61.k
            public final String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public i(@Y61.k com.avito.android.user_stats.b bVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        super(aVar);
        this.f317420L = bVar;
        this.f317421M = interfaceC35745a5;
        this.f317422N = fVar;
        this.f317423O = interfaceC35863o4;
        C23038g0<b> c23038g0 = new C23038g0<>();
        this.f317424P = c23038g0;
        this.f317425Q = c23038g0;
    }

    public final void ke() {
        this.f13677J.b(z.q(z.c0(P2.c.f318721a), this.f317420L.g(QJ0.e.b(this.f13678K, false)).r(j.f317505b).F()).m0(new k(this)).j0(this.f317421M.e()).t0(new l(this)));
    }
}
