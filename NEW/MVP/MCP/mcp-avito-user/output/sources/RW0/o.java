package rw0;

import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: RulesInfo.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lrw0/o;", "", "a", "b", "Lrw0/o$a;", "Lrw0/o$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface o {

    /* compiled from: RulesInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/o$a;", "Lrw0/o;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements o {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final AttributedText f437240a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList f437241b;

        public a(@Y61.l AttributedText attributedText, @Y61.k ArrayList arrayList) {
            this.f437240a = attributedText;
            this.f437241b = arrayList;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f437240a.equals(aVar.f437240a) && this.f437241b.equals(aVar.f437241b);
        }

        public final int hashCode() {
            return this.f437241b.hashCode() + (this.f437240a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(title=");
            sb2.append(this.f437240a);
            sb2.append(", items=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f437241b, ')');
        }
    }

    /* compiled from: RulesInfo.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrw0/o$b;", "Lrw0/o;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements o {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f437242a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1657715767;
        }

        @Y61.k
        public final String toString() {
            return "Hidden";
        }
    }
}
