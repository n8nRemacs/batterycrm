package com.avito.android.iac_calls_history.impl_module.screen.mvi.entity;

import Y61.k;
import Y61.l;
import aK.C19782a;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.items.IacCallsHistoryItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CallsHistoryScreenAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a$b;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a$c;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a$d;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a$e;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a$f;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a$g;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a$h;", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface a {

    /* compiled from: CallsHistoryScreenAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a$a;", "", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.a$a, reason: collision with other inner class name */
    public static final class C4823a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C19782a<a> f164829a;

        static {
            new C4823a();
            f164829a = new C19782a<>(a.class);
        }
    }

    /* compiled from: CallsHistoryScreenAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a$b;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a;", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final IacCallsHistoryItem f164830a;

        public b(@k IacCallsHistoryItem iacCallsHistoryItem) {
            this.f164830a = iacCallsHistoryItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f164830a, ((b) obj).f164830a);
        }

        public final int hashCode() {
            return this.f164830a.hashCode();
        }

        @k
        public final String toString() {
            return C4823a.f164829a.a(new String[]{"item=" + this.f164830a}, this);
        }
    }

    /* compiled from: CallsHistoryScreenAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a$c;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a;", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final long f164831a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f164832b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Object f164833c;

        public c(long j12, @k List list, boolean z12) {
            this.f164831a = j12;
            this.f164832b = z12;
            this.f164833c = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f164831a == cVar.f164831a && this.f164832b == cVar.f164832b && L.f(this.f164833c, cVar.f164833c);
        }

        public final int hashCode() {
            return this.f164833c.hashCode() + r.i(Long.hashCode(this.f164831a) * 31, 31, this.f164832b);
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
        @k
        public final String toString() {
            return C4823a.f164829a.a(new String[]{"loadingId=" + this.f164831a, "hasMore=" + this.f164832b, "itemsCount=" + this.f164833c.size()}, this);
        }
    }

    /* compiled from: CallsHistoryScreenAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a$d;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a;", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        public final long f164834a;

        public d(long j12) {
            this.f164834a = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f164834a == ((d) obj).f164834a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f164834a);
        }

        @k
        public final String toString() {
            return C4823a.f164829a.a(new String[]{"loadingId=" + this.f164834a}, this);
        }
    }

    /* compiled from: CallsHistoryScreenAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a$e;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a;", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f164835a = new e();

        @k
        public final String toString() {
            return C4823a.f164829a.a(new String[0], this);
        }
    }

    /* compiled from: CallsHistoryScreenAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a$f;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a;", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f164836a = new f();

        @k
        public final String toString() {
            return C4823a.f164829a.a(new String[0], this);
        }
    }

    /* compiled from: CallsHistoryScreenAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a$g;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a;", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f164837a = new g();

        @k
        public final String toString() {
            return C4823a.f164829a.a(new String[0], this);
        }
    }

    /* compiled from: CallsHistoryScreenAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a$h;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a;", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f164838a;

        public h(int i12) {
            this.f164838a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f164838a == ((h) obj).f164838a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f164838a);
        }

        @k
        public final String toString() {
            return C4823a.f164829a.a(new String[]{"position=" + this.f164838a}, this);
        }
    }
}
