package mD0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConstructorConfigureLevelAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LmD0/a;", "", "a", "b", "c", "LmD0/a$a;", "LmD0/a$b;", "LmD0/a$c;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mD0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC43949a {

    /* compiled from: ConstructorConfigureLevelAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LmD0/a$a;", "LmD0/a;", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mD0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11819a implements InterfaceC43949a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11819a f414410a = new C11819a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11819a);
        }

        public final int hashCode() {
            return -1459575622;
        }

        @k
        public final String toString() {
            return "OnBackPressed";
        }
    }

    /* compiled from: ConstructorConfigureLevelAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LmD0/a$b;", "LmD0/a;", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mD0.a$b */
    public static final /* data */ class b implements InterfaceC43949a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f414411a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 5327523;
        }

        @k
        public final String toString() {
            return "OnDataRequested";
        }
    }

    /* compiled from: ConstructorConfigureLevelAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmD0/a$c;", "LmD0/a;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mD0.a$c */
    public static final /* data */ class c implements InterfaceC43949a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f414412a;

        public c(@k DeepLink deepLink) {
            this.f414412a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f414412a, ((c) obj).f414412a);
        }

        public final int hashCode() {
            return this.f414412a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnDeepLinkClicked(deepLink="), this.f414412a, ')');
        }
    }
}
