package Ge0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ObjectFillFormState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"LGe0/f;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class f extends q {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f6686d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final f f6687e = new f(new c(d.b.f6697a, b.c.f6690a, false, null, null, false), new UV0.c(C42784z0.f406748b));

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c f6688b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final UV0.a<? extends com.avito.conveyor_item.a> f6689c;

    /* compiled from: ObjectFillFormState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGe0/f$a;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ObjectFillFormState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LGe0/f$b;", "", "a", "b", "c", "LGe0/f$b$a;", "LGe0/f$b$b;", "LGe0/f$b$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: ObjectFillFormState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGe0/f$b$a;", "LGe0/f$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {
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
                return "ErrorAutoDescription(error=null)";
            }
        }

        /* compiled from: ObjectFillFormState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGe0/f$b$b;", "LGe0/f$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ge0.f$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0363b implements b {
            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0363b)) {
                    return false;
                }
                ((C0363b) obj).getClass();
                return L.f(null, null) && L.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            @k
            public final String toString() {
                return "Loading(interruptTitle=null, loadingMessage=null)";
            }
        }

        /* compiled from: ObjectFillFormState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGe0/f$b$c;", "LGe0/f$b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f6690a = new c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 198687345;
            }

            @k
            public final String toString() {
                return "ShowContent";
            }
        }
    }

    /* compiled from: ObjectFillFormState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGe0/f$c;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final d f6691a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final b.c f6692b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f6693c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f6694d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final com.avito.android.publish.imv.a f6695e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f6696f;

        public c(@k d dVar, @k b.c cVar, boolean z12, @l String str, @l com.avito.android.publish.imv.a aVar, boolean z13) {
            this.f6691a = dVar;
            this.f6692b = cVar;
            this.f6693c = z12;
            this.f6694d = str;
            this.f6695e = aVar;
            this.f6696f = z13;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v6, types: [Ge0.f$d] */
        public static c a(c cVar, d.b bVar, boolean z12, String str, com.avito.android.publish.imv.a aVar, boolean z13, int i12) {
            d.b bVar2 = bVar;
            if ((i12 & 1) != 0) {
                bVar2 = cVar.f6691a;
            }
            d.b bVar3 = bVar2;
            b.c cVar2 = cVar.f6692b;
            if ((i12 & 4) != 0) {
                z12 = cVar.f6693c;
            }
            boolean z14 = z12;
            if ((i12 & 8) != 0) {
                str = cVar.f6694d;
            }
            String str2 = str;
            cVar.getClass();
            if ((i12 & 32) != 0) {
                aVar = cVar.f6695e;
            }
            com.avito.android.publish.imv.a aVar2 = aVar;
            if ((i12 & 64) != 0) {
                z13 = cVar.f6696f;
            }
            cVar.getClass();
            return new c(bVar3, cVar2, z14, str2, aVar2, z13);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f6691a, cVar.f6691a) && L.f(this.f6692b, cVar.f6692b) && this.f6693c == cVar.f6693c && L.f(this.f6694d, cVar.f6694d) && L.f(this.f6695e, cVar.f6695e) && this.f6696f == cVar.f6696f;
        }

        public final int hashCode() {
            int iHashCode = this.f6691a.hashCode() * 31;
            this.f6692b.getClass();
            int i12 = r.i((198687345 + iHashCode) * 31, 31, this.f6693c);
            String str = this.f6694d;
            int i13 = r.i((i12 + (str == null ? 0 : str.hashCode())) * 31, 31, false);
            com.avito.android.publish.imv.a aVar = this.f6695e;
            return Boolean.hashCode(this.f6696f) + ((i13 + (aVar != null ? aVar.f236061a.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ObjectViewState(progress=");
            sb2.append(this.f6691a);
            sb2.append(", loading=");
            sb2.append(this.f6692b);
            sb2.append(", showValidationProgress=");
            sb2.append(this.f6693c);
            sb2.append(", appbarShortTitle=");
            sb2.append(this.f6694d);
            sb2.append(", hideBottomActionsOnScroll=false, imvData=");
            sb2.append(this.f6695e);
            sb2.append(", isImvVisible=");
            return r.x(sb2, this.f6696f, ')');
        }
    }

    /* compiled from: ObjectFillFormState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LGe0/f$d;", "", "a", "b", "c", "LGe0/f$d$a;", "LGe0/f$d$b;", "LGe0/f$d$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {

        /* compiled from: ObjectFillFormState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGe0/f$d$a;", "LGe0/f$d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements d {
            static {
                new a();
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1149422128;
            }

            @k
            public final String toString() {
                return "Retry";
            }
        }

        /* compiled from: ObjectFillFormState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGe0/f$d$b;", "LGe0/f$d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f6697a = new b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 534572100;
            }

            @k
            public final String toString() {
                return "ShowContent";
            }
        }

        /* compiled from: ObjectFillFormState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGe0/f$d$c;", "LGe0/f$d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements d {
            static {
                new c();
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1041890366;
            }

            @k
            public final String toString() {
                return "ShowProgress";
            }
        }
    }

    public f(@k c cVar, @k UV0.a<? extends com.avito.conveyor_item.a> aVar) {
        this.f6688b = cVar;
        this.f6689c = aVar;
    }

    public static f a(f fVar, c cVar, UV0.a aVar, int i12) {
        if ((i12 & 1) != 0) {
            cVar = fVar.f6688b;
        }
        if ((i12 & 2) != 0) {
            aVar = fVar.f6689c;
        }
        fVar.getClass();
        return new f(cVar, aVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f6688b, fVar.f6688b) && L.f(this.f6689c, fVar.f6689c);
    }

    public final int hashCode() {
        return this.f6689c.hashCode() + (this.f6688b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "ObjectFillFormState(viewState=" + this.f6688b + ", items=" + this.f6689c + ')';
    }
}
