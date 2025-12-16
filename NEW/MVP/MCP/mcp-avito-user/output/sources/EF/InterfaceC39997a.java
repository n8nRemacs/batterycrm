package eF;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FreemiumRulesAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LeF/a;", "", "a", "b", "c", "d", "LeF/a$a;", "LeF/a$b;", "LeF/a$c;", "LeF/a$d;", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eF.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC39997a {

    /* compiled from: FreemiumRulesAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LeF/a$a;", "LeF/a;", "<init>", "()V", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eF.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11061a implements InterfaceC39997a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11061a f395062a = new C11061a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11061a);
        }

        public final int hashCode() {
            return 1803834951;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: FreemiumRulesAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LeF/a$b;", "LeF/a;", "<init>", "()V", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eF.a$b */
    public static final /* data */ class b implements InterfaceC39997a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f395063a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 466855706;
        }

        @k
        public final String toString() {
            return "OnButtonClick";
        }
    }

    /* compiled from: FreemiumRulesAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeF/a$c;", "LeF/a;", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eF.a$c */
    public static final /* data */ class c implements InterfaceC39997a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f395064a;

        public c(@k DeepLink deepLink) {
            this.f395064a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f395064a, ((c) obj).f395064a);
        }

        public final int hashCode() {
            return this.f395064a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnDeepLinkClick(deepLink="), this.f395064a, ')');
        }
    }

    /* compiled from: FreemiumRulesAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LeF/a$d;", "LeF/a;", "<init>", "()V", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eF.a$d */
    public static final /* data */ class d implements InterfaceC39997a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f395065a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -921790805;
        }

        @k
        public final String toString() {
            return "Retry";
        }
    }
}
