package Ow0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.section.SectionTypeItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SimilarAdvertsAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LOw0/a;", "", "a", "b", "LOw0/a$a;", "LOw0/a$b;", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ow0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC14743a {

    /* compiled from: SimilarAdvertsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOw0/a$a;", "LOw0/a;", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ow0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0819a implements InterfaceC14743a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final SectionTypeItem f12723a;

        /* renamed from: b, reason: collision with root package name */
        public final int f12724b;

        public C0819a(@l SectionTypeItem sectionTypeItem, int i12) {
            this.f12723a = sectionTypeItem;
            this.f12724b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0819a)) {
                return false;
            }
            C0819a c0819a = (C0819a) obj;
            return L.f(this.f12723a, c0819a.f12723a) && this.f12724b == c0819a.f12724b;
        }

        public final int hashCode() {
            SectionTypeItem sectionTypeItem = this.f12723a;
            return Integer.hashCode(this.f12724b) + ((sectionTypeItem == null ? 0 : sectionTypeItem.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Convert(element=");
            sb2.append(this.f12723a);
            sb2.append(", similarColumns=");
            return r.t(sb2, this.f12724b, ')');
        }
    }

    /* compiled from: SimilarAdvertsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOw0/a$b;", "LOw0/a;", "<init>", "()V", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ow0.a$b */
    public static final class b implements InterfaceC14743a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f12725a = new b();
    }
}
