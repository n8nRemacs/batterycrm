package vn0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoryListOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lvn0/c;", "", "a", "b", "c", "Lvn0/c$a;", "Lvn0/c$b;", "Lvn0/c$c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vn0.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC49358c {

    /* compiled from: CategoryListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvn0/c$a;", "Lvn0/c;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vn0.c$a */
    public static final class a implements InterfaceC49358c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f440957a = new a();
    }

    /* compiled from: CategoryListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvn0/c$b;", "Lvn0/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vn0.c$b */
    public static final /* data */ class b implements InterfaceC49358c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f440958a;

        public b(@k DeepLink deepLink) {
            this.f440958a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f440958a, ((b) obj).f440958a);
        }

        public final int hashCode() {
            return this.f440958a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("FollowLink(deepLink="), this.f440958a, ')');
        }
    }

    /* compiled from: CategoryListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvn0/c$c;", "Lvn0/c;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vn0.c$c, reason: collision with other inner class name */
    public static final class C12790c implements InterfaceC49358c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12790c f440959a = new C12790c();
    }
}
