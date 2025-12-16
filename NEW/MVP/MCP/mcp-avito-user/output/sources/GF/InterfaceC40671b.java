package gf;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectContactMeOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lgf/b;", "", "a", "b", "Lgf/b$a;", "Lgf/b$b;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gf.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC40671b {

    /* compiled from: AutoSelectContactMeOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgf/b$a;", "Lgf/b;", "<init>", "()V", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gf.b$a */
    public static final /* data */ class a implements InterfaceC40671b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f396672a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 56832203;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: AutoSelectContactMeOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgf/b$b;", "Lgf/b;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gf.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11219b implements InterfaceC40671b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f396673a;

        public C11219b(@k DeepLink deepLink) {
            this.f396673a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11219b) && L.f(this.f396673a, ((C11219b) obj).f396673a);
        }

        public final int hashCode() {
            return this.f396673a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleLink(deepLink="), this.f396673a, ')');
        }
    }
}
