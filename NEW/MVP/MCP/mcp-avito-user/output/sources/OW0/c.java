package Ow0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.section.SectionTypeItem;
import com.avito.android.serp.adapter.i1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SimilarAdvertsState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LOw0/c;", "", "<init>", "()V", "a", "b", "c", "d", "LOw0/c$a;", "LOw0/c$b;", "LOw0/c$c;", "LOw0/c$d;", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class c {

    /* compiled from: SimilarAdvertsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOw0/c$a;", "LOw0/c;", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UV0.c<i1> f12729a;

        public a(@k UV0.c<i1> cVar) {
            super(null);
            this.f12729a = cVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f12729a, ((a) obj).f12729a);
        }

        public final int hashCode() {
            return this.f12729a.f16399b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(similarAdvertItems=" + this.f12729a + ')';
        }
    }

    /* compiled from: SimilarAdvertsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOw0/c$b;", "LOw0/c;", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final SectionTypeItem f12730a;

        public b(@l SectionTypeItem sectionTypeItem) {
            super(null);
            this.f12730a = sectionTypeItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f12730a, ((b) obj).f12730a);
        }

        public final int hashCode() {
            SectionTypeItem sectionTypeItem = this.f12730a;
            if (sectionTypeItem == null) {
                return 0;
            }
            return sectionTypeItem.hashCode();
        }

        @k
        public final String toString() {
            return "Downloaded(element=" + this.f12730a + ')';
        }
    }

    /* compiled from: SimilarAdvertsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOw0/c$c;", "LOw0/c;", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ow0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0821c extends c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f12731a;

        public C0821c(@k Throwable th2) {
            super(null);
            this.f12731a = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0821c) && L.f(this.f12731a, ((C0821c) obj).f12731a);
        }

        public final int hashCode() {
            return this.f12731a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(throwable="), this.f12731a, ')');
        }
    }

    /* compiled from: SimilarAdvertsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOw0/c$d;", "LOw0/c;", "<init>", "()V", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f12732a = new d();

        public d() {
            super(null);
        }
    }

    public /* synthetic */ c(C42822w c42822w) {
        this();
    }

    public c() {
    }
}
