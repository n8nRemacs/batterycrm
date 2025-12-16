package L7;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.CreateAdvertCollectionResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertCollectionAddingOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LL7/b;", "", "a", "b", "c", "LL7/b$a;", "LL7/b$b;", "LL7/b$c;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface b {

    /* compiled from: AdvertCollectionAddingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LL7/b$a;", "LL7/b;", "<init>", "()V", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f9803a = new a();
    }

    /* compiled from: AdvertCollectionAddingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LL7/b$b;", "LL7/b;", "a", "b", "LL7/b$b$a;", "LL7/b$b$b;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: L7.b$b, reason: collision with other inner class name */
    public interface InterfaceC0605b extends b {

        /* compiled from: AdvertCollectionAddingOneTimeEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LL7/b$b$a;", "LL7/b$b;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: L7.b$b$a */
        public static final /* data */ class a implements InterfaceC0605b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final DeepLink f9804a;

            public a(@k DeepLink deepLink) {
                this.f9804a = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f9804a, ((a) obj).f9804a);
            }

            public final int hashCode() {
                return this.f9804a.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("Added(deepLink="), this.f9804a, ')');
            }
        }

        /* compiled from: AdvertCollectionAddingOneTimeEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LL7/b$b$b;", "LL7/b$b;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: L7.b$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0606b implements InterfaceC0605b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final CreateAdvertCollectionResult.Created f9805a;

            public C0606b(@k CreateAdvertCollectionResult.Created created) {
                this.f9805a = created;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0606b) && L.f(this.f9805a, ((C0606b) obj).f9805a);
            }

            public final int hashCode() {
                return this.f9805a.hashCode();
            }

            @k
            public final String toString() {
                return "Created(collection=" + this.f9805a + ')';
            }
        }
    }

    /* compiled from: AdvertCollectionAddingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LL7/b$c;", "LL7/b;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f9806a;

        public c(@k String str) {
            this.f9806a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f9806a, ((c) obj).f9806a);
        }

        public final int hashCode() {
            return this.f9806a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ErrorToast(text="), this.f9806a, ')');
        }
    }
}
