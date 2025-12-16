package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Selection.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/selection/x;", "", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.selection.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C21045x {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f32156a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f32157b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f32158c;

    /* compiled from: Selection.kt */
    @androidx.compose.runtime.H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/x$a;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.x$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ResolvedTextDirection f32159a;

        /* renamed from: b, reason: collision with root package name */
        public final int f32160b;

        /* renamed from: c, reason: collision with root package name */
        public final long f32161c;

        public a(@Y61.k ResolvedTextDirection resolvedTextDirection, int i12, long j12) {
            this.f32159a = resolvedTextDirection;
            this.f32160b = i12;
            this.f32161c = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f32159a == aVar.f32159a && this.f32160b == aVar.f32160b && this.f32161c == aVar.f32161c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f32161c) + androidx.appcompat.app.r.e(this.f32160b, this.f32159a.hashCode() * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AnchorInfo(direction=");
            sb2.append(this.f32159a);
            sb2.append(", offset=");
            sb2.append(this.f32160b);
            sb2.append(", selectableId=");
            return androidx.appcompat.app.r.u(sb2, this.f32161c, ')');
        }
    }

    public C21045x(@Y61.k a aVar, @Y61.k a aVar2, boolean z12) {
        this.f32156a = aVar;
        this.f32157b = aVar2;
        this.f32158c = z12;
    }

    public static C21045x a(C21045x c21045x, a aVar, a aVar2, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            aVar = c21045x.f32156a;
        }
        if ((i12 & 2) != 0) {
            aVar2 = c21045x.f32157b;
        }
        if ((i12 & 4) != 0) {
            z12 = c21045x.f32158c;
        }
        c21045x.getClass();
        return new C21045x(aVar, aVar2, z12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21045x)) {
            return false;
        }
        C21045x c21045x = (C21045x) obj;
        return kotlin.jvm.internal.L.f(this.f32156a, c21045x.f32156a) && kotlin.jvm.internal.L.f(this.f32157b, c21045x.f32157b) && this.f32158c == c21045x.f32158c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32158c) + ((this.f32157b.hashCode() + (this.f32156a.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Selection(start=");
        sb2.append(this.f32156a);
        sb2.append(", end=");
        sb2.append(this.f32157b);
        sb2.append(", handlesCrossed=");
        return androidx.appcompat.app.r.x(sb2, this.f32158c, ')');
    }

    public /* synthetic */ C21045x(a aVar, a aVar2, boolean z12, int i12, C42822w c42822w) {
        this(aVar, aVar2, (i12 & 4) != 0 ? false : z12);
    }
}
