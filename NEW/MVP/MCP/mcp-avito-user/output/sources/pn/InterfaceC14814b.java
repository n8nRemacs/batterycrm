package Pn;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoryOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LPn/b;", "", "a", "b", "LPn/b$a;", "LPn/b$b;", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pn.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14814b {

    /* compiled from: CategoryOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPn/b$a;", "LPn/b;", "<init>", "()V", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pn.b$a */
    public static final /* data */ class a implements InterfaceC14814b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f13277a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 292739795;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: CategoryOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPn/b$b;", "LPn/b;", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pn.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0863b implements InterfaceC14814b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f13278a;

        public C0863b(@k DeepLink deepLink) {
            this.f13278a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0863b) && L.f(this.f13278a, ((C0863b) obj).f13278a);
        }

        public final int hashCode() {
            return this.f13278a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("FollowLink(deepLink="), this.f13278a, ')');
        }
    }
}
