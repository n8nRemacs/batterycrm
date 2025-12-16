package Ie0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.publish.ActionMode;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: PublishDetailsState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LIe0/f;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "e", "f", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class f extends q {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final b f8428j = new b(null);

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final f f8429k = new f(e.b.f8453a, d.c.f8451a, false, false, new C0480f(null, null, ActionMode.f231836f), new a(null, true, false, false, null), new c(0, false, false, false), new UV0.c(C42784z0.f406748b));

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f8430b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d f8431c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8432d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8433e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C0480f f8434f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a f8435g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final c f8436h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final UV0.a<? extends com.avito.conveyor_item.a> f8437i;

    /* compiled from: PublishDetailsState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/f$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f8438a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f8439b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f8440c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f8441d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final com.avito.android.publish.slots.card_select.item.k f8442e;

        public a(@l String str, boolean z12, boolean z13, boolean z14, @l com.avito.android.publish.slots.card_select.item.k kVar) {
            this.f8438a = str;
            this.f8439b = z12;
            this.f8440c = z13;
            this.f8441d = z14;
            this.f8442e = kVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f8438a, aVar.f8438a) && this.f8439b == aVar.f8439b && this.f8440c == aVar.f8440c && this.f8441d == aVar.f8441d && L.f(this.f8442e, aVar.f8442e);
        }

        public final int hashCode() {
            String str = this.f8438a;
            int i12 = r.i(r.i(r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f8439b), 31, this.f8440c), 31, this.f8441d);
            com.avito.android.publish.slots.card_select.item.k kVar = this.f8442e;
            return i12 + (kVar != null ? kVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ButtonsState(buttonTitle=" + this.f8438a + ", isEnabled=" + this.f8439b + ", isVisible=" + this.f8440c + ", isSecondary=" + this.f8441d + ", conditionalAction=" + this.f8442e + ')';
        }
    }

    /* compiled from: PublishDetailsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/f$b;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: PublishDetailsState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/f$c;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f8443a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8444b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f8445c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f8446d;

        public c(int i12, boolean z12, boolean z13, boolean z14) {
            this.f8443a = z12;
            this.f8444b = i12;
            this.f8445c = z13;
            this.f8446d = z14;
        }

        public static c a(c cVar, boolean z12, int i12, boolean z13, boolean z14, int i13) {
            if ((i13 & 1) != 0) {
                z12 = cVar.f8443a;
            }
            if ((i13 & 2) != 0) {
                i12 = cVar.f8444b;
            }
            if ((i13 & 4) != 0) {
                z13 = cVar.f8445c;
            }
            if ((i13 & 8) != 0) {
                z14 = cVar.f8446d;
            }
            cVar.getClass();
            return new c(i12, z12, z13, z14);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f8443a == cVar.f8443a && this.f8444b == cVar.f8444b && this.f8445c == cVar.f8445c && this.f8446d == cVar.f8446d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f8446d) + r.i(r.e(this.f8444b, Boolean.hashCode(this.f8443a) * 31, 31), 31, this.f8445c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HtmlEditorState(isVisible=");
            sb2.append(this.f8443a);
            sb2.append(", flags=");
            sb2.append(this.f8444b);
            sb2.append(", undoEnabled=");
            sb2.append(this.f8445c);
            sb2.append(", redoEnabled=");
            return r.x(sb2, this.f8446d, ')');
        }
    }

    /* compiled from: PublishDetailsState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LIe0/f$d;", "", "a", "b", "c", "LIe0/f$d$a;", "LIe0/f$d$b;", "LIe0/f$d$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {

        /* compiled from: PublishDetailsState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/f$d$a;", "LIe0/f$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f8447a;

            public a(@k String str) {
                this.f8447a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f8447a, ((a) obj).f8447a);
            }

            public final int hashCode() {
                return this.f8447a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("ErrorAutoDescription(error="), this.f8447a, ')');
            }
        }

        /* compiled from: PublishDetailsState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/f$d$b;", "LIe0/f$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f8448a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f8449b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final N f8450c;

            /* JADX WARN: Multi-variable type inference failed */
            public b(@k Y41.l lVar, @k String str, @k String str2) {
                this.f8448a = str;
                this.f8449b = str2;
                this.f8450c = (N) lVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f8448a, bVar.f8448a) && L.f(this.f8449b, bVar.f8449b) && this.f8450c.equals(bVar.f8450c);
            }

            public final int hashCode() {
                return this.f8450c.hashCode() + H.d(this.f8448a.hashCode() * 31, 31, this.f8449b);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Loading(interruptTitle=");
                sb2.append(this.f8448a);
                sb2.append(", loadingMessage=");
                sb2.append(this.f8449b);
                sb2.append(", interruptCallback=");
                return C22026a.d(sb2, this.f8450c, ')');
            }
        }

        /* compiled from: PublishDetailsState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/f$d$c;", "LIe0/f$d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f8451a = new c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -780530574;
            }

            @k
            public final String toString() {
                return "ShowContent";
            }
        }
    }

    /* compiled from: PublishDetailsState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LIe0/f$e;", "", "a", "b", "c", "LIe0/f$e$a;", "LIe0/f$e$b;", "LIe0/f$e$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface e {

        /* compiled from: PublishDetailsState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/f$e$a;", "LIe0/f$e;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f8452a = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 314801039;
            }

            @k
            public final String toString() {
                return "Retry";
            }
        }

        /* compiled from: PublishDetailsState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/f$e$b;", "LIe0/f$e;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f8453a = new b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 243587683;
            }

            @k
            public final String toString() {
                return "ShowContent";
            }
        }

        /* compiled from: PublishDetailsState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/f$e$c;", "LIe0/f$e;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f8454a = new c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1472472701;
            }

            @k
            public final String toString() {
                return "ShowProgress";
            }
        }
    }

    /* compiled from: PublishDetailsState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/f$f;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ie0.f$f, reason: collision with other inner class name */
    public static final /* data */ class C0480f {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f8455a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f8456b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ActionMode f8457c;

        public C0480f(@l String str, @InterfaceC42150f @l Integer num, @k ActionMode actionMode) {
            this.f8455a = str;
            this.f8456b = num;
            this.f8457c = actionMode;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0480f)) {
                return false;
            }
            C0480f c0480f = (C0480f) obj;
            return L.f(this.f8455a, c0480f.f8455a) && L.f(this.f8456b, c0480f.f8456b) && this.f8457c == c0480f.f8457c;
        }

        public final int hashCode() {
            String str = this.f8455a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f8456b;
            return this.f8457c.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            return "ToolbarState(title=" + this.f8455a + ", homeIcon=" + this.f8456b + ", actionButton=" + this.f8457c + ')';
        }
    }

    public f(@k e eVar, @k d dVar, boolean z12, boolean z13, @k C0480f c0480f, @k a aVar, @k c cVar, @k UV0.a<? extends com.avito.conveyor_item.a> aVar2) {
        this.f8430b = eVar;
        this.f8431c = dVar;
        this.f8432d = z12;
        this.f8433e = z13;
        this.f8434f = c0480f;
        this.f8435g = aVar;
        this.f8436h = cVar;
        this.f8437i = aVar2;
    }

    public static f a(f fVar, e eVar, d dVar, boolean z12, C0480f c0480f, a aVar, c cVar, UV0.a aVar2, int i12) {
        e eVar2 = (i12 & 1) != 0 ? fVar.f8430b : eVar;
        d dVar2 = (i12 & 2) != 0 ? fVar.f8431c : dVar;
        boolean z13 = (i12 & 4) != 0 ? fVar.f8432d : z12;
        boolean z14 = (i12 & 8) != 0 ? fVar.f8433e : true;
        C0480f c0480f2 = (i12 & 16) != 0 ? fVar.f8434f : c0480f;
        a aVar3 = (i12 & 32) != 0 ? fVar.f8435g : aVar;
        c cVar2 = (i12 & 64) != 0 ? fVar.f8436h : cVar;
        UV0.a aVar4 = (i12 & 128) != 0 ? fVar.f8437i : aVar2;
        fVar.getClass();
        return new f(eVar2, dVar2, z13, z14, c0480f2, aVar3, cVar2, aVar4);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f8430b, fVar.f8430b) && L.f(this.f8431c, fVar.f8431c) && this.f8432d == fVar.f8432d && this.f8433e == fVar.f8433e && L.f(this.f8434f, fVar.f8434f) && L.f(this.f8435g, fVar.f8435g) && L.f(this.f8436h, fVar.f8436h) && L.f(this.f8437i, fVar.f8437i);
    }

    public final int hashCode() {
        return this.f8437i.hashCode() + ((this.f8436h.hashCode() + ((this.f8435g.hashCode() + ((this.f8434f.hashCode() + r.i(r.i((this.f8431c.hashCode() + (this.f8430b.hashCode() * 31)) * 31, 31, this.f8432d), 31, this.f8433e)) * 31)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "PublishDetailsState(progressOverlay=" + this.f8430b + ", loadingOverlay=" + this.f8431c + ", showValidationProgress=" + this.f8432d + ", hideBottomActionsOnScroll=" + this.f8433e + ", toolbarState=" + this.f8434f + ", buttonsState=" + this.f8435g + ", htmlEditorState=" + this.f8436h + ", items=" + this.f8437i + ')';
    }
}
