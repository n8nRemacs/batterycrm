package com.avito.android.vas_performance.ui.applied_services;

import androidx.compose.runtime.internal.P;
import androidx.view.AbstractC22991Y;
import androidx.view.C23038g0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import com.avito.android.util.architecture_components.D;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AppliedServicesViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/ui/applied_services/j;", "", "a", "b", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface j {

    /* compiled from: AppliedServicesViewModel.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/applied_services/j$a;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<com.avito.conveyor_item.a> f321428a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Action f321429b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Action f321430c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k List<? extends com.avito.conveyor_item.a> list, @Y61.l Action action, @Y61.l Action action2) {
            this.f321428a = list;
            this.f321429b = action;
            this.f321430c = action2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f321428a, aVar.f321428a) && L.f(this.f321429b, aVar.f321429b) && L.f(this.f321430c, aVar.f321430c);
        }

        public final int hashCode() {
            int iHashCode = this.f321428a.hashCode() * 31;
            Action action = this.f321429b;
            int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
            Action action2 = this.f321430c;
            return iHashCode2 + (action2 != null ? action2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "Data(items=" + this.f321428a + ", action=" + this.f321429b + ", secondaryAction=" + this.f321430c + ')';
        }
    }

    /* compiled from: AppliedServicesViewModel.kt */
    @P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_performance/ui/applied_services/j$b;", "", "<init>", "()V", "a", "Lcom/avito/android/vas_performance/ui/applied_services/j$b$a;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: AppliedServicesViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/applied_services/j$b$a;", "Lcom/avito/android/vas_performance/ui/applied_services/j$b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final DeepLink f321431a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f321432b;

            public a(@Y61.k DeepLink deepLink, boolean z12) {
                super(null);
                this.f321431a = deepLink;
                this.f321432b = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f321431a, aVar.f321431a) && this.f321432b == aVar.f321432b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f321432b) + (this.f321431a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("FollowDeeplink(deeplink=");
                sb2.append(this.f321431a);
                sb2.append(", shouldFinish=");
                return androidx.appcompat.app.r.x(sb2, this.f321432b, ')');
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    void R7(@Y61.k String str);

    @Y61.k
    /* renamed from: da */
    D getF321456T();

    void f(@Y61.k DeepLink deepLink);

    @Y61.k
    /* renamed from: g0 */
    C23038g0 getF321455S();

    void ia(@Y61.k String str);

    @Y61.k
    AbstractC22991Y<b> k0();

    void z(@Y61.k Set<TV0.d<?, ?>> set);
}
