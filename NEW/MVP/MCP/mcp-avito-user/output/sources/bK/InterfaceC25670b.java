package bk;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BottomSheetGroupOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lbk/b;", "", "a", "Lbk/b$a;", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bk.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC25670b {

    /* compiled from: BottomSheetGroupOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbk/b$a;", "Lbk/b;", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bk.b$a */
    public static final /* data */ class a implements InterfaceC25670b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f57413a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<String, Set<String>> f57414b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k String str, @k Map<String, ? extends Set<String>> map) {
            this.f57413a = str;
            this.f57414b = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f57413a, aVar.f57413a) && L.f(this.f57414b, aVar.f57414b);
        }

        public final int hashCode() {
            return this.f57414b.hashCode() + (this.f57413a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnSubmitClicked(id=");
            sb2.append(this.f57413a);
            sb2.append(", selected=");
            return r.w(sb2, this.f57414b, ')');
        }
    }
}
