package jr;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import hw.InterfaceC41177b;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: BannerCard.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Ljr/a;", "", "a", "b", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jr.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC42416a {

    /* renamed from: r2, reason: collision with root package name */
    @k
    public static final b f405826r2 = b.f405829a;

    /* compiled from: BannerCard.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljr/a$a;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jr.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11584a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f405827a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final N f405828b;

        /* JADX WARN: Multi-variable type inference failed */
        public C11584a(@l String str, @l Y41.a aVar) {
            this.f405827a = str;
            this.f405828b = (N) aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11584a)) {
                return false;
            }
            C11584a c11584a = (C11584a) obj;
            return L.f(this.f405827a, c11584a.f405827a) && this.f405828b.equals(c11584a.f405828b);
        }

        public final int hashCode() {
            String str = this.f405827a;
            return this.f405828b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Action(title=");
            sb2.append((Object) this.f405827a);
            sb2.append(", listener=");
            return C22026a.d(sb2, this.f405828b, ')');
        }
    }

    /* compiled from: BannerCard.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljr/a$b;", "", "<init>", "()V", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jr.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f405829a = new b();
    }

    void B7(@l Y41.a<G0> aVar);

    void G4(@l com.avito.android.image_loader.a aVar);

    void P2(@k CharSequence charSequence);

    void h2(@k List<C11584a> list);

    void setCloseButtonVisible(boolean z12);
}
