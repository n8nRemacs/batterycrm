package p20;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ParticipantViewState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lp20/e;", "", "a", "c", "d", "Lp20/e$a;", "Lp20/e$c;", "Lp20/e$d;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface e {

    /* compiled from: ParticipantViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp20/e$a;", "Lp20/e;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final o20.c f428150a;

        public a(@k o20.c cVar) {
            this.f428150a = cVar;
        }

        @Override // p20.e
        @k
        public final String a() {
            return b.a(this);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f428150a, ((a) obj).f428150a);
        }

        public final int hashCode() {
            return this.f428150a.hashCode();
        }

        @k
        public final String toString() {
            return "Content(form=" + this.f428150a + ')';
        }
    }

    /* compiled from: ParticipantViewState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        @k
        public static String a(@k e eVar) {
            a aVar = eVar instanceof a ? (a) eVar : null;
            String str = aVar != null ? aVar.f428150a.f419321a : null;
            return str == null ? "" : str;
        }
    }

    /* compiled from: ParticipantViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp20/e$c;", "Lp20/e;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f428151a = new c();

        @Override // p20.e
        @k
        public final String a() {
            return b.a(this);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 513221117;
        }

        @k
        public final String toString() {
            return "Failed";
        }
    }

    /* compiled from: ParticipantViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp20/e$d;", "Lp20/e;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f428152a = new d();

        @Override // p20.e
        @k
        public final String a() {
            return b.a(this);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 153226108;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    @k
    String a();
}
