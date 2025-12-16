package com.avito.android.feedback_adverts;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.C35995v2;
import com.avito.android.feedback_adverts.adapter.c;
import com.avito.android.feedback_adverts.g;
import com.avito.android.util.architecture_components.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FeedbackAdvertsPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/feedback_adverts/o;", "LS20/a;", "Lcom/avito/android/feedback_adverts/o$b;", "Lcom/avito/android/feedback_adverts/adapter/c$a;", "a", "b", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface o extends S20.a<b>, c.a {

    /* compiled from: FeedbackAdvertsPresenter.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/feedback_adverts/o$a;", "", "a", "b", "c", "Lcom/avito/android/feedback_adverts/o$a$a;", "Lcom/avito/android/feedback_adverts/o$a$b;", "Lcom/avito/android/feedback_adverts/o$a$c;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: FeedbackAdvertsPresenter.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/feedback_adverts/o$a$a;", "Lcom/avito/android/feedback_adverts/o$a;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.feedback_adverts.o$a$a, reason: collision with other inner class name */
        public static final /* data */ class C4612a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final Throwable f157845a;

            public C4612a(@Y61.l Throwable th2) {
                this.f157845a = th2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4612a) && L.f(this.f157845a, ((C4612a) obj).f157845a);
            }

            public final int hashCode() {
                Throwable th2 = this.f157845a;
                if (th2 == null) {
                    return 0;
                }
                return th2.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(error="), this.f157845a, ')');
            }
        }

        /* compiled from: FeedbackAdvertsPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/feedback_adverts/o$a$b;", "Lcom/avito/android/feedback_adverts/o$a;", "<init>", "()V", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f157846a = new b();
        }

        /* compiled from: FeedbackAdvertsPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/feedback_adverts/o$a$c;", "Lcom/avito/android/feedback_adverts/o$a;", "<init>", "()V", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f157847a = new c();
        }
    }

    @Y61.k
    D Ad();

    void J();

    @Y61.k
    D Q();

    void m4(@Y61.k String str);

    /* compiled from: FeedbackAdvertsPresenter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/feedback_adverts/o$b;", "", "a", "b", "c", "d", "e", "Lcom/avito/android/feedback_adverts/o$b$b;", "Lcom/avito/android/feedback_adverts/o$b$c;", "Lcom/avito/android/feedback_adverts/o$b$d;", "Lcom/avito/android/feedback_adverts/o$b$e;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f157848a = a.f157849a;

        /* compiled from: FeedbackAdvertsPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/feedback_adverts/o$b$a;", "", "<init>", "()V", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ a f157849a = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final c.C4614b f157850b = new c.C4614b(null, null, 3, null);
        }

        /* compiled from: FeedbackAdvertsPresenter.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/feedback_adverts/o$b$c;", "Lcom/avito/android/feedback_adverts/o$b;", "a", "b", "Lcom/avito/android/feedback_adverts/o$b$c$a;", "Lcom/avito/android/feedback_adverts/o$b$c$b;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface c extends b {

            /* compiled from: FeedbackAdvertsPresenter.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/feedback_adverts/o$b$c$a;", "Lcom/avito/android/feedback_adverts/o$b$c;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class a implements c {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final g.b f157856b;

                /* renamed from: c, reason: collision with root package name */
                @Y61.k
                public final C35995v2 f157857c;

                /* renamed from: d, reason: collision with root package name */
                @Y61.l
                public final Throwable f157858d;

                /* renamed from: e, reason: collision with root package name */
                @Y61.l
                public final String f157859e;

                public a(g.b bVar, C35995v2 c35995v2, Throwable th2, String str, int i12, C42822w c42822w) {
                    bVar = (i12 & 1) != 0 ? new g.b(null, false, 3, null) : bVar;
                    th2 = (i12 & 4) != 0 ? null : th2;
                    str = (i12 & 8) != 0 ? null : str;
                    this.f157856b = bVar;
                    this.f157857c = c35995v2;
                    this.f157858d = th2;
                    this.f157859e = str;
                }

                @Override // com.avito.android.feedback_adverts.o.b
                @Y61.k
                /* renamed from: a, reason: from getter */
                public final C35995v2 getF157870c() {
                    return this.f157857c;
                }

                @Override // com.avito.android.feedback_adverts.o.b
                @Y61.k
                /* renamed from: b, reason: from getter */
                public final g.b getF157869b() {
                    return this.f157856b;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return L.f(this.f157856b, aVar.f157856b) && L.f(this.f157857c, aVar.f157857c) && L.f(this.f157858d, aVar.f157858d) && L.f(this.f157859e, aVar.f157859e);
                }

                public final int hashCode() {
                    int iHashCode = (this.f157857c.hashCode() + (this.f157856b.hashCode() * 31)) * 31;
                    Throwable th2 = this.f157858d;
                    int iHashCode2 = (iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31;
                    String str = this.f157859e;
                    return iHashCode2 + (str != null ? str.hashCode() : 0);
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Error(searchResults=");
                    sb2.append(this.f157856b);
                    sb2.append(", searchQuery=");
                    sb2.append(this.f157857c);
                    sb2.append(", error=");
                    sb2.append(this.f157858d);
                    sb2.append(", message=");
                    return C22026a.c(sb2, this.f157859e, ')');
                }
            }

            /* compiled from: FeedbackAdvertsPresenter.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/feedback_adverts/o$b$c$b;", "Lcom/avito/android/feedback_adverts/o$b$c;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.feedback_adverts.o$b$c$b, reason: collision with other inner class name */
            public static final /* data */ class C4614b implements c {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final g.b f157860b;

                /* renamed from: c, reason: collision with root package name */
                @Y61.k
                public final C35995v2 f157861c;

                public C4614b() {
                    this(null, null, 3, null);
                }

                @Override // com.avito.android.feedback_adverts.o.b
                @Y61.k
                /* renamed from: a, reason: from getter */
                public final C35995v2 getF157870c() {
                    return this.f157861c;
                }

                @Override // com.avito.android.feedback_adverts.o.b
                @Y61.k
                /* renamed from: b, reason: from getter */
                public final g.b getF157869b() {
                    return this.f157860b;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C4614b)) {
                        return false;
                    }
                    C4614b c4614b = (C4614b) obj;
                    return L.f(this.f157860b, c4614b.f157860b) && L.f(this.f157861c, c4614b.f157861c);
                }

                public final int hashCode() {
                    return this.f157861c.hashCode() + (this.f157860b.hashCode() * 31);
                }

                @Y61.k
                public final String toString() {
                    return "Loading(searchResults=" + this.f157860b + ", searchQuery=" + this.f157861c + ')';
                }

                public C4614b(g.b bVar, C35995v2 c35995v2, int i12, C42822w c42822w) {
                    bVar = (i12 & 1) != 0 ? new g.b(null, false, 3, null) : bVar;
                    c35995v2 = (i12 & 2) != 0 ? new C35995v2(0L, null, 3, null) : c35995v2;
                    this.f157860b = bVar;
                    this.f157861c = c35995v2;
                }
            }
        }

        @Y61.k
        /* renamed from: a */
        C35995v2 getF157870c();

        @Y61.k
        /* renamed from: b */
        g.b getF157869b();

        /* compiled from: FeedbackAdvertsPresenter.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/feedback_adverts/o$b$d;", "Lcom/avito/android/feedback_adverts/o$b;", "a", "b", "Lcom/avito/android/feedback_adverts/o$b$d$a;", "Lcom/avito/android/feedback_adverts/o$b$d$b;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface d extends b {

            /* compiled from: FeedbackAdvertsPresenter.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/feedback_adverts/o$b$d$a;", "Lcom/avito/android/feedback_adverts/o$b$d;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class a implements d {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final g.b f157862b;

                /* renamed from: c, reason: collision with root package name */
                @Y61.k
                public final C35995v2 f157863c;

                /* renamed from: d, reason: collision with root package name */
                @Y61.k
                public final String f157864d;

                /* renamed from: e, reason: collision with root package name */
                @Y61.k
                public final String f157865e;

                public a(g.b bVar, C35995v2 c35995v2, String str, String str2, int i12, C42822w c42822w) {
                    this.f157862b = (i12 & 1) != 0 ? new g.b(null, false, 3, null) : bVar;
                    this.f157863c = c35995v2;
                    this.f157864d = str;
                    this.f157865e = str2;
                }

                @Override // com.avito.android.feedback_adverts.o.b
                @Y61.k
                /* renamed from: a, reason: from getter */
                public final C35995v2 getF157870c() {
                    return this.f157863c;
                }

                @Override // com.avito.android.feedback_adverts.o.b
                @Y61.k
                /* renamed from: b, reason: from getter */
                public final g.b getF157869b() {
                    return this.f157862b;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return L.f(this.f157862b, aVar.f157862b) && L.f(this.f157863c, aVar.f157863c) && L.f(this.f157864d, aVar.f157864d) && L.f(this.f157865e, aVar.f157865e);
                }

                public final int hashCode() {
                    return this.f157865e.hashCode() + H.d((this.f157863c.hashCode() + (this.f157862b.hashCode() * 31)) * 31, 31, this.f157864d);
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Empty(searchResults=");
                    sb2.append(this.f157862b);
                    sb2.append(", searchQuery=");
                    sb2.append(this.f157863c);
                    sb2.append(", message=");
                    sb2.append(this.f157864d);
                    sb2.append(", description=");
                    return C22026a.c(sb2, this.f157865e, ')');
                }
            }

            /* compiled from: FeedbackAdvertsPresenter.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/feedback_adverts/o$b$d$b;", "Lcom/avito/android/feedback_adverts/o$b$d;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.feedback_adverts.o$b$d$b, reason: collision with other inner class name */
            public static final /* data */ class C4615b implements d {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final g.b f157866b;

                /* renamed from: c, reason: collision with root package name */
                @Y61.k
                public final C35995v2 f157867c;

                /* renamed from: d, reason: collision with root package name */
                @Y61.k
                public final a f157868d;

                public C4615b(@Y61.k g.b bVar, @Y61.k C35995v2 c35995v2, @Y61.k a aVar) {
                    this.f157866b = bVar;
                    this.f157867c = c35995v2;
                    this.f157868d = aVar;
                }

                @Override // com.avito.android.feedback_adverts.o.b
                @Y61.k
                /* renamed from: a, reason: from getter */
                public final C35995v2 getF157870c() {
                    return this.f157867c;
                }

                @Override // com.avito.android.feedback_adverts.o.b
                @Y61.k
                /* renamed from: b, reason: from getter */
                public final g.b getF157869b() {
                    return this.f157866b;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C4615b)) {
                        return false;
                    }
                    C4615b c4615b = (C4615b) obj;
                    return L.f(this.f157866b, c4615b.f157866b) && L.f(this.f157867c, c4615b.f157867c) && L.f(this.f157868d, c4615b.f157868d);
                }

                public final int hashCode() {
                    return this.f157868d.hashCode() + ((this.f157867c.hashCode() + (this.f157866b.hashCode() * 31)) * 31);
                }

                @Y61.k
                public final String toString() {
                    return "Results(searchResults=" + this.f157866b + ", searchQuery=" + this.f157867c + ", paginationState=" + this.f157868d + ')';
                }

                public /* synthetic */ C4615b(g.b bVar, C35995v2 c35995v2, a aVar, int i12, C42822w c42822w) {
                    this(bVar, c35995v2, (i12 & 4) != 0 ? a.b.f157846a : aVar);
                }
            }
        }

        /* compiled from: FeedbackAdvertsPresenter.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/feedback_adverts/o$b$e;", "Lcom/avito/android/feedback_adverts/o$b;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class e implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final g.b f157869b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final C35995v2 f157870c;

            public e(@Y61.k g.b bVar, @Y61.k C35995v2 c35995v2) {
                this.f157869b = bVar;
                this.f157870c = c35995v2;
            }

            @Override // com.avito.android.feedback_adverts.o.b
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final C35995v2 getF157870c() {
                return this.f157870c;
            }

            @Override // com.avito.android.feedback_adverts.o.b
            @Y61.k
            /* renamed from: b, reason: from getter */
            public final g.b getF157869b() {
                return this.f157869b;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return L.f(this.f157869b, eVar.f157869b) && L.f(this.f157870c, eVar.f157870c);
            }

            public final int hashCode() {
                return this.f157870c.hashCode() + (this.f157869b.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                return "Loading(searchResults=" + this.f157869b + ", searchQuery=" + this.f157870c + ')';
            }

            public /* synthetic */ e(g.b bVar, C35995v2 c35995v2, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? new g.b(null, false, 3, null) : bVar, c35995v2);
            }
        }

        /* compiled from: FeedbackAdvertsPresenter.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/feedback_adverts/o$b$b;", "Lcom/avito/android/feedback_adverts/o$b;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.feedback_adverts.o$b$b, reason: collision with other inner class name */
        public static final /* data */ class C4613b implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final g.b f157851b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final C35995v2 f157852c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final String f157853d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final String f157854e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.l
            public final Throwable f157855f;

            public C4613b(@Y61.k g.b bVar, @Y61.k C35995v2 c35995v2, @Y61.k String str, @Y61.k String str2, @Y61.l Throwable th2) {
                this.f157851b = bVar;
                this.f157852c = c35995v2;
                this.f157853d = str;
                this.f157854e = str2;
                this.f157855f = th2;
            }

            @Override // com.avito.android.feedback_adverts.o.b
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final C35995v2 getF157870c() {
                return this.f157852c;
            }

            @Override // com.avito.android.feedback_adverts.o.b
            @Y61.k
            /* renamed from: b, reason: from getter */
            public final g.b getF157869b() {
                return this.f157851b;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4613b)) {
                    return false;
                }
                C4613b c4613b = (C4613b) obj;
                return L.f(this.f157851b, c4613b.f157851b) && L.f(this.f157852c, c4613b.f157852c) && L.f(this.f157853d, c4613b.f157853d) && L.f(this.f157854e, c4613b.f157854e) && L.f(this.f157855f, c4613b.f157855f);
            }

            public final int hashCode() {
                int iD2 = H.d(H.d((this.f157852c.hashCode() + (this.f157851b.hashCode() * 31)) * 31, 31, this.f157853d), 31, this.f157854e);
                Throwable th2 = this.f157855f;
                return iD2 + (th2 == null ? 0 : th2.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(searchResults=");
                sb2.append(this.f157851b);
                sb2.append(", searchQuery=");
                sb2.append(this.f157852c);
                sb2.append(", message=");
                sb2.append(this.f157853d);
                sb2.append(", description=");
                sb2.append(this.f157854e);
                sb2.append(", error=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f157855f, ')');
            }

            public /* synthetic */ C4613b(g.b bVar, C35995v2 c35995v2, String str, String str2, Throwable th2, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? new g.b(null, false, 3, null) : bVar, c35995v2, str, str2, th2);
            }
        }
    }
}
