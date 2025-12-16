package oB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxConfigureAdvanceManualOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LoB0/b;", "", "a", "b", "LoB0/b$a;", "LoB0/b$b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oB0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC44621b {

    /* compiled from: CpxConfigureAdvanceManualOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB0/b$a;", "LoB0/b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oB0.b$a */
    public static final /* data */ class a implements InterfaceC44621b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f419554a;

        public a(@k DeepLink deepLink) {
            this.f419554a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f419554a, ((a) obj).f419554a);
        }

        public final int hashCode() {
            return this.f419554a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deepLink="), this.f419554a, ')');
        }
    }

    /* compiled from: CpxConfigureAdvanceManualOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB0/b$b;", "LoB0/b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oB0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12173b implements InterfaceC44621b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f419555a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f419556b;

        public C12173b(@k DeepLink deepLink, @l String str) {
            this.f419555a = deepLink;
            this.f419556b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12173b)) {
                return false;
            }
            C12173b c12173b = (C12173b) obj;
            return L.f(this.f419555a, c12173b.f419555a) && L.f(this.f419556b, c12173b.f419556b);
        }

        public final int hashCode() {
            int iHashCode = this.f419555a.hashCode() * 31;
            String str = this.f419556b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleRequestDeepLink(deepLink=");
            sb2.append(this.f419555a);
            sb2.append(", advance=");
            return C22026a.c(sb2, this.f419556b, ')');
        }
    }
}
