package s10;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationFlowAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Ls10/a;", "", "a", "b", "c", "Ls10/a$a;", "Ls10/a$b;", "Ls10/a$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: s10.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC47957a {

    /* compiled from: VerificationFlowAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls10/a$a;", "Ls10/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: s10.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12605a implements InterfaceC47957a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12605a f437286a = new C12605a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12605a);
        }

        public final int hashCode() {
            return 1586762411;
        }

        @k
        public final String toString() {
            return "BackClicked";
        }
    }

    /* compiled from: VerificationFlowAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ls10/a$b;", "Ls10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: s10.a$b */
    public static final /* data */ class b implements InterfaceC47957a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f437287a;

        public b(@l DeepLink deepLink) {
            this.f437287a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f437287a, ((b) obj).f437287a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f437287a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("PrimaryActionClicked(deeplink="), this.f437287a, ')');
        }
    }

    /* compiled from: VerificationFlowAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ls10/a$c;", "Ls10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: s10.a$c */
    public static final /* data */ class c implements InterfaceC47957a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f437288a;

        public c(@l DeepLink deepLink) {
            this.f437288a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f437288a, ((c) obj).f437288a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f437288a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("SecondaryActionClicked(deeplink="), this.f437288a, ')');
        }
    }
}
