package androidx.compose.ui.text;

import androidx.compose.runtime.C22026a;
import androidx.compose.ui.text.C22602e;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LinkAnnotation.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/text/C;", "Landroidx/compose/ui/text/e$a;", "<init>", "()V", "a", "b", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class C implements C22602e.a {

    /* compiled from: LinkAnnotation.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/C$a;", "Landroidx/compose/ui/text/C;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f41903a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final p0 f41904b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final D f41905c;

        public /* synthetic */ a(String str, p0 p0Var, D d12, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : p0Var, d12);
        }

        @Override // androidx.compose.ui.text.C
        @Y61.l
        /* renamed from: a, reason: from getter */
        public final D getF41908c() {
            return this.f41905c;
        }

        @Override // androidx.compose.ui.text.C
        @Y61.l
        /* renamed from: b, reason: from getter */
        public final p0 getF41907b() {
            return this.f41904b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!kotlin.jvm.internal.L.f(this.f41903a, aVar.f41903a)) {
                return false;
            }
            if (kotlin.jvm.internal.L.f(this.f41904b, aVar.f41904b)) {
                return kotlin.jvm.internal.L.f(this.f41905c, aVar.f41905c);
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = this.f41903a.hashCode() * 31;
            p0 p0Var = this.f41904b;
            int iHashCode2 = (iHashCode + (p0Var != null ? p0Var.hashCode() : 0)) * 31;
            D d12 = this.f41905c;
            return iHashCode2 + (d12 != null ? d12.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f41903a, ')');
        }

        public a(@Y61.k String str, @Y61.l p0 p0Var, @Y61.l D d12) {
            super(null);
            this.f41903a = str;
            this.f41904b = p0Var;
            this.f41905c = d12;
        }
    }

    /* compiled from: LinkAnnotation.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/C$b;", "Landroidx/compose/ui/text/C;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f41906a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final p0 f41907b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final D f41908c;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(String str, p0 p0Var, D d12, int i12, C42822w c42822w) {
            C42822w c42822w2 = null;
            p0Var = (i12 & 2) != 0 ? null : p0Var;
            d12 = (i12 & 4) != 0 ? null : d12;
            super(c42822w2);
            this.f41906a = str;
            this.f41907b = p0Var;
            this.f41908c = d12;
        }

        @Override // androidx.compose.ui.text.C
        @Y61.l
        /* renamed from: a, reason: from getter */
        public final D getF41908c() {
            return this.f41908c;
        }

        @Override // androidx.compose.ui.text.C
        @Y61.l
        /* renamed from: b, reason: from getter */
        public final p0 getF41907b() {
            return this.f41907b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!kotlin.jvm.internal.L.f(this.f41906a, bVar.f41906a)) {
                return false;
            }
            if (kotlin.jvm.internal.L.f(this.f41907b, bVar.f41907b)) {
                return kotlin.jvm.internal.L.f(this.f41908c, bVar.f41908c);
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = this.f41906a.hashCode() * 31;
            p0 p0Var = this.f41907b;
            int iHashCode2 = (iHashCode + (p0Var != null ? p0Var.hashCode() : 0)) * 31;
            D d12 = this.f41908c;
            return iHashCode2 + (d12 != null ? d12.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("LinkAnnotation.Url(url="), this.f41906a, ')');
        }
    }

    public /* synthetic */ C(C42822w c42822w) {
        this();
    }

    @Y61.l
    /* renamed from: a */
    public abstract D getF41908c();

    @Y61.l
    /* renamed from: b */
    public abstract p0 getF41907b();

    public C() {
    }
}
