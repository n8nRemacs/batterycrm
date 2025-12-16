package f60;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfilesListAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lf60/a;", "", "a", "b", "c", "d", "e", "Lf60/a$a;", "Lf60/a$b;", "Lf60/a$c;", "Lf60/a$d;", "Lf60/a$e;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f60.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC40238a {

    /* compiled from: ProfilesListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf60/a$a;", "Lf60/a;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f60.a$a, reason: collision with other inner class name */
    public static final class C11126a implements InterfaceC40238a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11126a f395661a = new C11126a();
    }

    /* compiled from: ProfilesListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf60/a$b;", "Lf60/a;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f60.a$b */
    public static final class b implements InterfaceC40238a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f395662a = new b();
    }

    /* compiled from: ProfilesListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf60/a$c;", "Lf60/a;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f60.a$c */
    public static final /* data */ class c implements InterfaceC40238a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f395663a;

        public c(@k DeepLink deepLink) {
            this.f395663a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f395663a, ((c) obj).f395663a);
        }

        public final int hashCode() {
            return this.f395663a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeepLinkClick(deeplink="), this.f395663a, ')');
        }
    }

    /* compiled from: ProfilesListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf60/a$d;", "Lf60/a;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f60.a$d */
    public static final class d implements InterfaceC40238a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f395664a = new d();
    }

    /* compiled from: ProfilesListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf60/a$e;", "Lf60/a;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f60.a$e */
    public static final class e implements InterfaceC40238a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f395665a = new e();
    }
}
