package com.avito.beduin.v2.avito.component.map.state;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MoveToState.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/z;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "Lcom/avito/beduin/v2/avito/component/map/state/z$a;", "Lcom/avito/beduin/v2/avito/component/map/state/z$b;", "Lcom/avito/beduin/v2/avito/component/map/state/z$c;", "Lcom/avito/beduin/v2/avito/component/map/state/z$d;", "Lcom/avito/beduin/v2/avito/component/map/state/z$e;", "Lcom/avito/beduin/v2/avito/component/map/state/z$f;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class z {

    /* compiled from: MoveToState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/z$a;", "Lcom/avito/beduin/v2/avito/component/map/state/z;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final x f334762a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final x f334763b;

        public a(@Y61.k x xVar, @Y61.k x xVar2) {
            super(null);
            this.f334762a = xVar;
            this.f334763b = xVar2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f334762a, aVar.f334762a) && kotlin.jvm.internal.L.f(this.f334763b, aVar.f334763b);
        }

        public final int hashCode() {
            return this.f334763b.hashCode() + (this.f334762a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "Bounds(topLeft=" + this.f334762a + ", bottomRight=" + this.f334763b + ')';
        }
    }

    /* compiled from: MoveToState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/z$b;", "Lcom/avito/beduin/v2/avito/component/map/state/z;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final x f334764a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Float f334765b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f334766c;

        public b(@Y61.k x xVar, @Y61.l Float f12, boolean z12) {
            super(null);
            this.f334764a = xVar;
            this.f334765b = f12;
            this.f334766c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.L.f(this.f334764a, bVar.f334764a) && kotlin.jvm.internal.L.f(this.f334765b, bVar.f334765b) && this.f334766c == bVar.f334766c;
        }

        public final int hashCode() {
            int iHashCode = this.f334764a.hashCode() * 31;
            Float f12 = this.f334765b;
            return Boolean.hashCode(this.f334766c) + ((iHashCode + (f12 == null ? 0 : f12.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Point(point=");
            sb2.append(this.f334764a);
            sb2.append(", zoom=");
            sb2.append(this.f334765b);
            sb2.append(", animate=");
            return androidx.appcompat.app.r.x(sb2, this.f334766c, ')');
        }
    }

    /* compiled from: MoveToState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/z$c;", "Lcom/avito/beduin/v2/avito/component/map/state/z;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final x f334767a;

        /* renamed from: b, reason: collision with root package name */
        public final float f334768b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final u f334769c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final MoveReason f334770d;

        public c(@Y61.k x xVar, float f12, @Y61.k u uVar, @Y61.k MoveReason moveReason) {
            super(null);
            this.f334767a = xVar;
            this.f334768b = f12;
            this.f334769c = uVar;
            this.f334770d = moveReason;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.L.f(this.f334767a, cVar.f334767a) && Float.compare(this.f334768b, cVar.f334768b) == 0 && kotlin.jvm.internal.L.f(this.f334769c, cVar.f334769c) && this.f334770d == cVar.f334770d;
        }

        public final int hashCode() {
            return this.f334770d.hashCode() + ((this.f334769c.hashCode() + androidx.appcompat.app.r.d(this.f334768b, this.f334767a.hashCode() * 31, 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "VisibleSnapshot(point=" + this.f334767a + ", zoom=" + this.f334768b + ", mapBounds=" + this.f334769c + ", moveReason=" + this.f334770d + ')';
        }
    }

    /* compiled from: MoveToState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/z$d;", "Lcom/avito/beduin/v2/avito/component/map/state/z;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends z {

        /* renamed from: a, reason: collision with root package name */
        public final float f334771a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f334772b;

        public d(float f12, boolean z12) {
            super(null);
            this.f334771a = f12;
            this.f334772b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Float.compare(this.f334771a, dVar.f334771a) == 0 && this.f334772b == dVar.f334772b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f334772b) + (Float.hashCode(this.f334771a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Zoom(zoom=");
            sb2.append(this.f334771a);
            sb2.append(", animate=");
            return androidx.appcompat.app.r.x(sb2, this.f334772b, ')');
        }
    }

    /* compiled from: MoveToState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/z$e;", "Lcom/avito/beduin/v2/avito/component/map/state/z;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends z {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f334773a;

        public e(boolean z12) {
            super(null);
            this.f334773a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f334773a == ((e) obj).f334773a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f334773a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("ZoomIn(animate="), this.f334773a, ')');
        }
    }

    /* compiled from: MoveToState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/z$f;", "Lcom/avito/beduin/v2/avito/component/map/state/z;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f extends z {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f334774a;

        public f(boolean z12) {
            super(null);
            this.f334774a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f334774a == ((f) obj).f334774a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f334774a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("ZoomOut(animate="), this.f334774a, ')');
        }
    }

    public /* synthetic */ z(C42822w c42822w) {
        this();
    }

    public z() {
    }
}
