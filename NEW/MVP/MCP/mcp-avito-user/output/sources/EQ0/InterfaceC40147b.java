package eq0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: SelectDistrictOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Leq0/b;", "", "a", "b", "Leq0/b$a;", "Leq0/b$b;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eq0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC40147b {

    /* compiled from: SelectDistrictOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leq0/b$a;", "Leq0/b;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eq0.b$a */
    public static final /* data */ class a implements InterfaceC40147b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f395393a;

        public a(@k ArrayList arrayList) {
            this.f395393a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f395393a.equals(((a) obj).f395393a);
        }

        public final int hashCode() {
            return this.f395393a.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("Confirm(selected="), this.f395393a, ')');
        }
    }

    /* compiled from: SelectDistrictOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leq0/b$b;", "Leq0/b;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eq0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11106b implements InterfaceC40147b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11106b f395394a = new C11106b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11106b);
        }

        public final int hashCode() {
            return 531765502;
        }

        @k
        public final String toString() {
            return "GoBack";
        }
    }
}
