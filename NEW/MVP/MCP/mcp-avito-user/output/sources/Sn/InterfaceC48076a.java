package sN;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvSimilarAdvertsAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LsN/a;", "", "a", "b", "c", "LsN/a$a;", "LsN/a$b;", "LsN/a$c;", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sN.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC48076a {

    /* compiled from: ImvSimilarAdvertsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LsN/a$a;", "LsN/a;", "<init>", "()V", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sN.a$a, reason: collision with other inner class name */
    public static final class C12612a implements InterfaceC48076a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12612a f437626a = new C12612a();
    }

    /* compiled from: ImvSimilarAdvertsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsN/a$b;", "LsN/a;", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sN.a$b */
    public static final /* data */ class b implements InterfaceC48076a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f437627a;

        public b(@k DeepLink deepLink) {
            this.f437627a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f437627a, ((b) obj).f437627a);
        }

        public final int hashCode() {
            return this.f437627a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenAdvert(deepLink="), this.f437627a, ')');
        }
    }

    /* compiled from: ImvSimilarAdvertsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LsN/a$c;", "LsN/a;", "<init>", "()V", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sN.a$c */
    public static final class c implements InterfaceC48076a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f437628a = new c();
    }
}
