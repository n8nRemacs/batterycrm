package sx;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ResidentialComplexOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lsx/b;", "", "a", "b", "c", "d", "Lsx/b$a;", "Lsx/b$b;", "Lsx/b$c;", "Lsx/b$d;", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sx.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC48427b {

    /* compiled from: ResidentialComplexOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsx/b$a;", "Lsx/b;", "<init>", "()V", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sx.b$a */
    public static final class a implements InterfaceC48427b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f438925a = new a();
    }

    /* compiled from: ResidentialComplexOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsx/b$b;", "Lsx/b;", "<init>", "()V", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sx.b$b, reason: collision with other inner class name */
    public static final class C12652b implements InterfaceC48427b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12652b f438926a = new C12652b();
    }

    /* compiled from: ResidentialComplexOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsx/b$c;", "Lsx/b;", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sx.b$c */
    public static final /* data */ class c implements InterfaceC48427b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SelectParameter.Value f438927a;

        public c(@k SelectParameter.Value value) {
            this.f438927a = value;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f438927a, ((c) obj).f438927a);
        }

        public final int hashCode() {
            return this.f438927a.hashCode();
        }

        @k
        public final String toString() {
            return "ItemClickedResult(value=" + this.f438927a + ')';
        }
    }

    /* compiled from: ResidentialComplexOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsx/b$d;", "Lsx/b;", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sx.b$d */
    public static final /* data */ class d implements InterfaceC48427b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f438928a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f438929b;

        public d(boolean z12, @k String str) {
            this.f438928a = z12;
            this.f438929b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f438928a == dVar.f438928a && L.f(this.f438929b, dVar.f438929b);
        }

        public final int hashCode() {
            return this.f438929b.hashCode() + (Boolean.hashCode(this.f438928a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateSearchField(isVisible=");
            sb2.append(this.f438928a);
            sb2.append(", searchValue=");
            return C22026a.c(sb2, this.f438929b, ')');
        }
    }
}
