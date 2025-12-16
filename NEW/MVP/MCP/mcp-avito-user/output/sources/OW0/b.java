package Ow0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.section.SectionTypeItem;
import com.avito.android.serp.adapter.i1;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SimilarAdvertsInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LOw0/b;", "", "a", "b", "c", "LOw0/b$a;", "LOw0/b$b;", "LOw0/b$c;", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: SimilarAdvertsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOw0/b$a;", "LOw0/b;", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final SectionTypeItem f12726a;

        public a(@l SectionTypeItem sectionTypeItem) {
            this.f12726a = sectionTypeItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f12726a, ((a) obj).f12726a);
        }

        public final int hashCode() {
            SectionTypeItem sectionTypeItem = this.f12726a;
            if (sectionTypeItem == null) {
                return 0;
            }
            return sectionTypeItem.hashCode();
        }

        @k
        public final String toString() {
            return "Convert(element=" + this.f12726a + ')';
        }
    }

    /* compiled from: SimilarAdvertsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOw0/b$b;", "LOw0/b;", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ow0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0820b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f12727a;

        public C0820b(@k Throwable th2) {
            this.f12727a = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0820b) && L.f(this.f12727a, ((C0820b) obj).f12727a);
        }

        public final int hashCode() {
            return this.f12727a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(throwable="), this.f12727a, ')');
        }
    }

    /* compiled from: SimilarAdvertsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOw0/b$c;", "LOw0/b;", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UV0.c<i1> f12728a;

        public c(@k UV0.c<i1> cVar) {
            this.f12728a = cVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f12728a, ((c) obj).f12728a);
        }

        public final int hashCode() {
            return this.f12728a.f16399b.hashCode();
        }

        @k
        public final String toString() {
            return "Result(items=" + this.f12728a + ')';
        }
    }
}
