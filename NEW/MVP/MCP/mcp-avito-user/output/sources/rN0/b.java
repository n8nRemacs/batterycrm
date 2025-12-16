package RN0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CreateOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LRN0/b;", "", "a", "b", "LRN0/b$a;", "LRN0/b$b;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: CreateOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRN0/b$a;", "LRN0/b;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PN0.a f14423a;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f14423a, ((a) obj).f14423a);
        }

        public final int hashCode() {
            PN0.a aVar = this.f14423a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        @k
        public final String toString() {
            return "Close(client=" + this.f14423a + ')';
        }

        public a(@l PN0.a aVar) {
            this.f14423a = aVar;
        }

        public /* synthetic */ a(PN0.a aVar, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : aVar);
        }
    }

    /* compiled from: CreateOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRN0/b$b;", "LRN0/b;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: RN0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0963b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f14424a;

        public C0963b(@k PrintableText printableText) {
            this.f14424a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0963b) && L.f(this.f14424a, ((C0963b) obj).f14424a);
        }

        public final int hashCode() {
            return this.f14424a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowError(error="), this.f14424a, ')');
        }
    }
}
