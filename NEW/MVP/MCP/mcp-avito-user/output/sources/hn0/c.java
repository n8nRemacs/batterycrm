package Hn0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RdsOrderCancellationReasonsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LHn0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class c extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f7703b;

    /* compiled from: RdsOrderCancellationReasonsState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LHn0/c$a;", "", "<init>", "()V", "a", "b", "c", "LHn0/c$a$a;", "LHn0/c$a$b;", "LHn0/c$a$c;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: RdsOrderCancellationReasonsState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHn0/c$a$a;", "LHn0/c$a;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Hn0.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0438a extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ArrayList f7704a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final UV0.c<com.avito.conveyor_item.a> f7705b;

            /* renamed from: c, reason: collision with root package name */
            public final int f7706c;

            public C0438a(@k ArrayList arrayList, @k UV0.c cVar, int i12) {
                super(null);
                this.f7704a = arrayList;
                this.f7705b = cVar;
                this.f7706c = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0438a)) {
                    return false;
                }
                C0438a c0438a = (C0438a) obj;
                return L.f(this.f7704a, c0438a.f7704a) && L.f(this.f7705b, c0438a.f7705b) && this.f7706c == c0438a.f7706c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f7706c) + H.e(this.f7704a.hashCode() * 31, 31, this.f7705b.f16399b);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Content(reasons=");
                sb2.append(this.f7704a);
                sb2.append(", dataSource=");
                sb2.append(this.f7705b);
                sb2.append(", commentMaxLength=");
                return r.t(sb2, this.f7706c, ')');
            }
        }

        /* compiled from: RdsOrderCancellationReasonsState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHn0/c$a$b;", "LHn0/c$a;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ApiError f7707a;

            public b(@k ApiError apiError) {
                super(null);
                this.f7707a = apiError;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f7707a, ((b) obj).f7707a);
            }

            public final int hashCode() {
                return this.f7707a.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.n(new StringBuilder("Failed(error="), this.f7707a, ')');
            }
        }

        /* compiled from: RdsOrderCancellationReasonsState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHn0/c$a$c;", "LHn0/c$a;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Hn0.c$a$c, reason: collision with other inner class name */
        public static final class C0439c extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C0439c f7708a = new C0439c();

            public C0439c() {
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
        return (obj instanceof c) && L.f(this.f7703b, ((c) obj).f7703b);
    }

    public final int hashCode() {
        return this.f7703b.hashCode();
    }

    @k
    public final String toString() {
        return "RdsOrderCancellationReasonsState(contentState=" + this.f7703b + ')';
    }

    public /* synthetic */ c(a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? a.C0439c.f7708a : aVar);
    }

    public c(@k a aVar) {
        this.f7703b = aVar;
    }
}
