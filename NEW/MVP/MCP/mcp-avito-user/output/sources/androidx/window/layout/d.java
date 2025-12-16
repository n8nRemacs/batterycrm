package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.layout.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: HardwareFoldingFeature.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/window/layout/d;", "Landroidx/window/layout/c;", "a", "b", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f55315d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.window.core.c f55316a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final b f55317b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final c.C1945c f55318c;

    /* compiled from: HardwareFoldingFeature.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/window/layout/d$a;", "", "<init>", "()V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: HardwareFoldingFeature.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/window/layout/d$b;", "", "a", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f55319b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final b f55320c = new b("FOLD");

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final b f55321d = new b("HINGE");

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f55322a;

        /* compiled from: HardwareFoldingFeature.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/window/layout/d$b$a;", "", "<init>", "()V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            @Y61.k
            public static b a() {
                return b.f55320c;
            }

            @Y61.k
            public static b b() {
                return b.f55321d;
            }

            public a() {
            }
        }

        public b(String str) {
            this.f55322a = str;
        }

        @Y61.k
        /* renamed from: toString, reason: from getter */
        public final String getF55322a() {
            return this.f55322a;
        }
    }

    public d(@Y61.k androidx.window.core.c cVar, @Y61.k b bVar, @Y61.k c.C1945c c1945c) {
        this.f55316a = cVar;
        this.f55317b = bVar;
        this.f55318c = c1945c;
        f55315d.getClass();
        if (cVar.b() == 0 && cVar.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (cVar.f55178a != 0 && cVar.f55179b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    @Override // androidx.window.layout.c
    public final boolean a() {
        b.a aVar = b.f55319b;
        aVar.getClass();
        b bVar = b.f55321d;
        b bVar2 = this.f55317b;
        if (L.f(bVar2, bVar)) {
            return true;
        }
        aVar.getClass();
        if (L.f(bVar2, b.f55320c)) {
            if (L.f(this.f55318c, c.C1945c.f55313c)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.window.layout.c
    @Y61.k
    public final c.b b() {
        androidx.window.core.c cVar = this.f55316a;
        return cVar.b() > cVar.a() ? c.b.f55310c : c.b.f55309b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f55316a, dVar.f55316a) && L.f(this.f55317b, dVar.f55317b) && L.f(this.f55318c, dVar.f55318c);
    }

    @Override // androidx.window.layout.a
    @Y61.k
    public final Rect getBounds() {
        return this.f55316a.c();
    }

    public final int hashCode() {
        return this.f55318c.hashCode() + ((this.f55317b.hashCode() + (this.f55316a.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        androidx.appcompat.app.r.C(d.class, sb2, " { ");
        sb2.append(this.f55316a);
        sb2.append(", type=");
        sb2.append(this.f55317b);
        sb2.append(", state=");
        sb2.append(this.f55318c);
        sb2.append(" }");
        return sb2.toString();
    }
}
