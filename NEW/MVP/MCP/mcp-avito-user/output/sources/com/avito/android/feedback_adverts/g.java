package com.avito.android.feedback_adverts;

import com.avito.android.C35995v2;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ok0.InterfaceC44788a;

/* compiled from: FeedbackAdvertsInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/feedback_adverts/g;", "LS20/a;", "Lcom/avito/android/feedback_adverts/g$c;", "a", "b", "c", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface g extends S20.a<c> {

    /* compiled from: FeedbackAdvertsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/feedback_adverts/g$a;", "", "a", "b", "Lcom/avito/android/feedback_adverts/g$a$a;", "Lcom/avito/android/feedback_adverts/g$a$b;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: FeedbackAdvertsInteractor.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/feedback_adverts/g$a$a;", "Lcom/avito/android/feedback_adverts/g$a;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.feedback_adverts.g$a$a, reason: collision with other inner class name */
        public static final /* data */ class C4610a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final Throwable f157816a;

            public C4610a(@Y61.l Throwable th2) {
                this.f157816a = th2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4610a) && L.f(this.f157816a, ((C4610a) obj).f157816a);
            }

            public final int hashCode() {
                Throwable th2 = this.f157816a;
                if (th2 == null) {
                    return 0;
                }
                return th2.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(error="), this.f157816a, ')');
            }
        }

        /* compiled from: FeedbackAdvertsInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/feedback_adverts/g$a$b;", "Lcom/avito/android/feedback_adverts/g$a;", "<init>", "()V", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f157817a = new b();

            @Y61.k
            public final String toString() {
                return "Idle";
            }
        }
    }

    /* compiled from: FeedbackAdvertsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/feedback_adverts/g$b;", "", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<InterfaceC44788a> f157818a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f157819b;

        public b() {
            this(null, false, 3, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f157818a, bVar.f157818a) && this.f157819b == bVar.f157819b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f157819b) + (this.f157818a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SearchResults(items=");
            sb2.append(this.f157818a);
            sb2.append(", hasMore=");
            return androidx.appcompat.app.r.x(sb2, this.f157819b, ')');
        }

        public b(List list, boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? false : z12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.k List<? extends InterfaceC44788a> list, boolean z12) {
            this.f157818a = list;
            this.f157819b = z12;
        }
    }

    @Y61.k
    B0 F0();

    void J();

    void Qd(@Y61.k C35995v2 c35995v2);

    /* compiled from: FeedbackAdvertsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/feedback_adverts/g$c;", "", "a", "b", "c", "Lcom/avito/android/feedback_adverts/g$c$b;", "Lcom/avito/android/feedback_adverts/g$c$c;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f157820a = a.f157821a;

        /* compiled from: FeedbackAdvertsInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/feedback_adverts/g$c$a;", "", "<init>", "()V", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ a f157821a = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C4611c f157822b = new C4611c(new C35995v2(0, null, 3, null), new b(null, false, 3, null), null, 4, null);
        }

        /* compiled from: FeedbackAdvertsInteractor.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/feedback_adverts/g$c$b;", "Lcom/avito/android/feedback_adverts/g$c;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements c {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final C35995v2 f157823b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final b f157824c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final Throwable f157825d;

            public b(C35995v2 c35995v2, b bVar, Throwable th2, int i12, C42822w c42822w) {
                bVar = (i12 & 2) != 0 ? new b(null, false, 3, null) : bVar;
                this.f157823b = c35995v2;
                this.f157824c = bVar;
                this.f157825d = th2;
            }

            @Override // com.avito.android.feedback_adverts.g.c
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final b getF157827c() {
                return this.f157824c;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f157823b, bVar.f157823b) && L.f(this.f157824c, bVar.f157824c) && L.f(this.f157825d, bVar.f157825d);
            }

            @Override // com.avito.android.feedback_adverts.g.c
            @Y61.k
            /* renamed from: getQuery, reason: from getter */
            public final C35995v2 getF157826b() {
                return this.f157823b;
            }

            public final int hashCode() {
                int iHashCode = (this.f157824c.hashCode() + (this.f157823b.hashCode() * 31)) * 31;
                Throwable th2 = this.f157825d;
                return iHashCode + (th2 == null ? 0 : th2.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(query=");
                sb2.append(this.f157823b);
                sb2.append(", results=");
                sb2.append(this.f157824c);
                sb2.append(", error=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f157825d, ')');
            }
        }

        @Y61.k
        /* renamed from: a */
        b getF157827c();

        @Y61.k
        /* renamed from: getQuery */
        C35995v2 getF157826b();

        /* compiled from: FeedbackAdvertsInteractor.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/feedback_adverts/g$c$c;", "Lcom/avito/android/feedback_adverts/g$c;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.feedback_adverts.g$c$c, reason: collision with other inner class name */
        public static final /* data */ class C4611c implements c {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final C35995v2 f157826b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final b f157827c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final a f157828d;

            public C4611c(@Y61.k C35995v2 c35995v2, @Y61.k b bVar, @Y61.k a aVar) {
                this.f157826b = c35995v2;
                this.f157827c = bVar;
                this.f157828d = aVar;
            }

            @Override // com.avito.android.feedback_adverts.g.c
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final b getF157827c() {
                return this.f157827c;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4611c)) {
                    return false;
                }
                C4611c c4611c = (C4611c) obj;
                return L.f(this.f157826b, c4611c.f157826b) && L.f(this.f157827c, c4611c.f157827c) && L.f(this.f157828d, c4611c.f157828d);
            }

            @Override // com.avito.android.feedback_adverts.g.c
            @Y61.k
            /* renamed from: getQuery, reason: from getter */
            public final C35995v2 getF157826b() {
                return this.f157826b;
            }

            public final int hashCode() {
                return this.f157828d.hashCode() + ((this.f157827c.hashCode() + (this.f157826b.hashCode() * 31)) * 31);
            }

            @Y61.k
            public final String toString() {
                return "Loaded(query=" + this.f157826b + ", results=" + this.f157827c + ", paginationState=" + this.f157828d + ')';
            }

            public /* synthetic */ C4611c(C35995v2 c35995v2, b bVar, a aVar, int i12, C42822w c42822w) {
                this(c35995v2, bVar, (i12 & 4) != 0 ? a.b.f157817a : aVar);
            }
        }
    }
}
