package jk;

import Y61.k;
import Y61.l;
import com.avito.android.component.toast.f;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BrandspaceOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Ljk/b;", "", "a", "b", "Ljk/b$a;", "Ljk/b$b;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jk.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC42391b {

    /* compiled from: BrandspaceOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljk/b$a;", "Ljk/b;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jk.b$a */
    public static final /* data */ class a implements InterfaceC42391b {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "HandleFormError(actions=null)";
        }
    }

    /* compiled from: BrandspaceOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljk/b$b;", "Ljk/b;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jk.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11578b implements InterfaceC42391b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f405786a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f.c f405787b;

        public C11578b(@k PrintableText printableText, @k f.c cVar) {
            this.f405786a = printableText;
            this.f405787b = cVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11578b)) {
                return false;
            }
            C11578b c11578b = (C11578b) obj;
            return this.f405786a.equals(c11578b.f405786a) && this.f405787b.equals(c11578b.f405787b);
        }

        public final int hashCode() {
            return this.f405787b.hashCode() + (this.f405786a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowError(message=" + this.f405786a + ", toastBarType=" + this.f405787b + ')';
        }
    }
}
