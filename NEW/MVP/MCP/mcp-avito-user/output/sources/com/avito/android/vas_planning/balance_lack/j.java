package com.avito.android.vas_planning.balance_lack;

import androidx.compose.runtime.C22026a;
import androidx.view.C23038g0;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.R0;
import com.avito.android.util.architecture_components.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;

/* compiled from: VasPlanBalanceLackViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_planning/balance_lack/j;", "Landroidx/lifecycle/M0;", "a", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f322221E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final YL0.a f322222J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final R0 f322223K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.d f322224L = io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final C23038g0<a> f322225M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final D<DeepLink> f322226N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f322227O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final D f322228P;

    /* compiled from: VasPlanBalanceLackViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/vas_planning/balance_lack/j$a;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/vas_planning/balance_lack/j$a$a;", "Lcom/avito/android/vas_planning/balance_lack/j$a$b;", "Lcom/avito/android/vas_planning/balance_lack/j$a$c;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: VasPlanBalanceLackViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_planning/balance_lack/j$a$a;", "Lcom/avito/android/vas_planning/balance_lack/j$a;", "a", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.vas_planning.balance_lack.j$a$a, reason: collision with other inner class name */
        public static final /* data */ class C9960a extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final String f322229a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final AttributedText f322230b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final C9961a f322231c;

            /* compiled from: VasPlanBalanceLackViewModel.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/balance_lack/j$a$a$a;", "", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.vas_planning.balance_lack.j$a$a$a, reason: collision with other inner class name */
            public static final /* data */ class C9961a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final String f322232a;

                /* renamed from: b, reason: collision with root package name */
                @Y61.l
                public final DeepLink f322233b;

                public C9961a(@Y61.k String str, @Y61.l DeepLink deepLink) {
                    this.f322232a = str;
                    this.f322233b = deepLink;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C9961a)) {
                        return false;
                    }
                    C9961a c9961a = (C9961a) obj;
                    return L.f(this.f322232a, c9961a.f322232a) && L.f(this.f322233b, c9961a.f322233b);
                }

                public final int hashCode() {
                    int iHashCode = this.f322232a.hashCode() * 31;
                    DeepLink deepLink = this.f322233b;
                    return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Action(title=");
                    sb2.append(this.f322232a);
                    sb2.append(", uri=");
                    return com.avito.android.actions_sheet.a.v(sb2, this.f322233b, ')');
                }
            }

            public C9960a(@Y61.l String str, @Y61.l AttributedText attributedText, @Y61.l C9961a c9961a) {
                super(null);
                this.f322229a = str;
                this.f322230b = attributedText;
                this.f322231c = c9961a;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9960a)) {
                    return false;
                }
                C9960a c9960a = (C9960a) obj;
                return L.f(this.f322229a, c9960a.f322229a) && L.f(this.f322230b, c9960a.f322230b) && L.f(this.f322231c, c9960a.f322231c);
            }

            public final int hashCode() {
                String str = this.f322229a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                AttributedText attributedText = this.f322230b;
                int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
                C9961a c9961a = this.f322231c;
                return iHashCode2 + (c9961a != null ? c9961a.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                return "Data(title=" + this.f322229a + ", description=" + this.f322230b + ", action=" + this.f322231c + ')';
            }
        }

        /* compiled from: VasPlanBalanceLackViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/balance_lack/j$a$b;", "Lcom/avito/android/vas_planning/balance_lack/j$a;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f322234a;

            /* JADX WARN: Multi-variable type inference failed */
            public b() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f322234a, ((b) obj).f322234a);
            }

            public final int hashCode() {
                return this.f322234a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Error(msg="), this.f322234a, ')');
            }

            public b(@Y61.k String str) {
                super(null);
                this.f322234a = str;
            }

            public /* synthetic */ b(String str, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? "" : str);
            }
        }

        /* compiled from: VasPlanBalanceLackViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_planning/balance_lack/j$a$c;", "Lcom/avito/android/vas_planning/balance_lack/j$a;", "<init>", "()V", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f322235a = new c();

            public c() {
                super(null);
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public j(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k YL0.a aVar, @Y61.k R0 r02) {
        this.f322221E = interfaceC28373a;
        this.f322222J = aVar;
        this.f322223K = r02;
        C23038g0<a> c23038g0 = new C23038g0<>();
        this.f322225M = c23038g0;
        D<DeepLink> d12 = new D<>();
        this.f322226N = d12;
        this.f322227O = c23038g0;
        this.f322228P = d12;
        C43259k.d(N0.a(this), null, null, new k(this, null), 3);
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        this.f322224L.dispose();
    }
}
