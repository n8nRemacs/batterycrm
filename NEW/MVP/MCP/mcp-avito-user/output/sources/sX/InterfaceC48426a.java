package sx;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ResidentialComplexAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lsx/a;", "", "a", "b", "c", "d", "Lsx/a$a;", "Lsx/a$b;", "Lsx/a$c;", "Lsx/a$d;", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sx.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC48426a {

    /* compiled from: ResidentialComplexAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsx/a$a;", "Lsx/a;", "<init>", "()V", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sx.a$a, reason: collision with other inner class name */
    public static final class C12651a implements InterfaceC48426a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12651a f438920a = new C12651a();
    }

    /* compiled from: ResidentialComplexAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsx/a$b;", "Lsx/a;", "<init>", "()V", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sx.a$b */
    public static final class b implements InterfaceC48426a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f438921a = new b();
    }

    /* compiled from: ResidentialComplexAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsx/a$c;", "Lsx/a;", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sx.a$c */
    public static final /* data */ class c implements InterfaceC48426a {

        /* renamed from: a, reason: collision with root package name */
        public final int f438922a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f438923b;

        public c(int i12, @k String str) {
            this.f438922a = i12;
            this.f438923b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f438922a == cVar.f438922a && L.f(this.f438923b, cVar.f438923b);
        }

        public final int hashCode() {
            return this.f438923b.hashCode() + (Integer.hashCode(this.f438922a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ItemClicked(id=");
            sb2.append(this.f438922a);
            sb2.append(", name=");
            return C22026a.c(sb2, this.f438923b, ')');
        }
    }

    /* compiled from: ResidentialComplexAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsx/a$d;", "Lsx/a;", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sx.a$d */
    public static final /* data */ class d implements InterfaceC48426a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f438924a;

        public d(@k String str) {
            this.f438924a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f438924a, ((d) obj).f438924a);
        }

        public final int hashCode() {
            return this.f438924a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SearchDataTriggered(text="), this.f438924a, ')');
        }
    }
}
