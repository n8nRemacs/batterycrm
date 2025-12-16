package sN;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvSimilarAdvertsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LsN/b;", "", "a", "b", "LsN/b$a;", "LsN/b$b;", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sN.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC48077b {

    /* compiled from: ImvSimilarAdvertsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LsN/b$a;", "LsN/b;", "<init>", "()V", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sN.b$a */
    public static final class a implements InterfaceC48077b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f437629a = new a();
    }

    /* compiled from: ImvSimilarAdvertsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsN/b$b;", "LsN/b;", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sN.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12613b implements InterfaceC48077b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f437630a;

        public C12613b(@k DeepLink deepLink) {
            this.f437630a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12613b) && L.f(this.f437630a, ((C12613b) obj).f437630a);
        }

        public final int hashCode() {
            return this.f437630a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenAdvert(deeplink="), this.f437630a, ')');
        }
    }
}
