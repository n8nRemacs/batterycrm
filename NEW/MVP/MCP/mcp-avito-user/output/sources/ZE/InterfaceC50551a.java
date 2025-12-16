package ze;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoContactsPackagesAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lze/a;", "", "a", "b", "c", "Lze/a$a;", "Lze/a$b;", "Lze/a$c;", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ze.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC50551a {

    /* compiled from: AutoContactsPackagesAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lze/a$a;", "Lze/a;", "<init>", "()V", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ze.a$a, reason: collision with other inner class name */
    public static final class C12959a implements InterfaceC50551a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12959a f444104a = new C12959a();
    }

    /* compiled from: AutoContactsPackagesAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lze/a$b;", "Lze/a;", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ze.a$b */
    public static final /* data */ class b implements InterfaceC50551a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f444105a;

        public b(@k DeepLink deepLink) {
            this.f444105a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f444105a, ((b) obj).f444105a);
        }

        public final int hashCode() {
            return this.f444105a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("BuyMoreButtonClicked(deepLink="), this.f444105a, ')');
        }
    }

    /* compiled from: AutoContactsPackagesAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lze/a$c;", "Lze/a;", "<init>", "()V", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ze.a$c */
    public static final class c implements InterfaceC50551a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f444106a = new c();
    }
}
