package dB;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileTabsAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LdB/a;", "", "a", "b", "c", "d", "e", "LdB/a$a;", "LdB/a$b;", "LdB/a$c;", "LdB/a$d;", "LdB/a$e;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dB.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC39552a {

    /* compiled from: ExtendedProfileTabsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdB/a$a;", "LdB/a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dB.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11014a implements InterfaceC39552a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f393728a;

        public C11014a(@k DeepLink deepLink) {
            this.f393728a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11014a) && L.f(this.f393728a, ((C11014a) obj).f393728a);
        }

        public final int hashCode() {
            return this.f393728a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleTabNavigationDeeplink(deepLink="), this.f393728a, ')');
        }
    }

    /* compiled from: ExtendedProfileTabsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LdB/a$b;", "LdB/a;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dB.a$b */
    public static final /* data */ class b implements InterfaceC39552a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f393729a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1001139154;
        }

        @k
        public final String toString() {
            return "OnBrandTabClicked";
        }
    }

    /* compiled from: ExtendedProfileTabsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LdB/a$c;", "LdB/a;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dB.a$c */
    public static final /* data */ class c implements InterfaceC39552a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f393730a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -183829162;
        }

        @k
        public final String toString() {
            return "OnRatingTabClicked";
        }
    }

    /* compiled from: ExtendedProfileTabsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LdB/a$d;", "LdB/a;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dB.a$d */
    public static final /* data */ class d implements InterfaceC39552a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f393731a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 494034849;
        }

        @k
        public final String toString() {
            return "OnSearchTabClicked";
        }
    }

    /* compiled from: ExtendedProfileTabsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LdB/a$e;", "LdB/a;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dB.a$e */
    public static final /* data */ class e implements InterfaceC39552a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f393732a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1758469984;
        }

        @k
        public final String toString() {
            return "Retry";
        }
    }
}
