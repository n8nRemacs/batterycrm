package gB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CprConfigureAdvanceOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LgB0/b;", "", "a", "b", "c", "d", "LgB0/b$a;", "LgB0/b$b;", "LgB0/b$c;", "LgB0/b$d;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gB0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC40567b {

    /* compiled from: CprConfigureAdvanceOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LgB0/b$a;", "LgB0/b;", "<init>", "()V", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gB0.b$a */
    public static final class a implements InterfaceC40567b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f396368a = new a();
    }

    /* compiled from: CprConfigureAdvanceOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LgB0/b$b;", "LgB0/b;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gB0.b$b, reason: collision with other inner class name */
    public static final class C11195b implements InterfaceC40567b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f396369a;

        public C11195b(@l DeepLink deepLink) {
            this.f396369a = deepLink;
        }
    }

    /* compiled from: CprConfigureAdvanceOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LgB0/b$c;", "LgB0/b;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gB0.b$c */
    public static final class c implements InterfaceC40567b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f396370a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f396371b;

        public c(@l DeepLink deepLink, @l String str) {
            this.f396370a = deepLink;
            this.f396371b = str;
        }
    }

    /* compiled from: CprConfigureAdvanceOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LgB0/b$d;", "LgB0/b;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gB0.b$d */
    public static final /* data */ class d implements InterfaceC40567b {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ShowError(error=null)";
        }
    }
}
