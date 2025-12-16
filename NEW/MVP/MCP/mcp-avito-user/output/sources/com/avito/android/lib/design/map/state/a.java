package com.avito.android.lib.design.map.state;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: MoveTo.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/lib/design/map/state/a;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "Lcom/avito/android/lib/design/map/state/a$a;", "Lcom/avito/android/lib/design/map/state/a$b;", "Lcom/avito/android/lib/design/map/state/a$c;", "Lcom/avito/android/lib/design/map/state/a$d;", "Lcom/avito/android/lib/design/map/state/a$e;", "Lcom/avito/android/lib/design/map/state/a$f;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class a {

    /* compiled from: MoveTo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/map/state/a$a;", "Lcom/avito/android/lib/design/map/state/a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.map.state.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5283a extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AvitoMapBounds f179648a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f179649b;

        public /* synthetic */ C5283a(AvitoMapBounds avitoMapBounds, boolean z12, int i12, C42822w c42822w) {
            this(avitoMapBounds, (i12 & 2) != 0 ? true : z12);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5283a)) {
                return false;
            }
            C5283a c5283a = (C5283a) obj;
            return L.f(this.f179648a, c5283a.f179648a) && this.f179649b == c5283a.f179649b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f179649b) + (this.f179648a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Bounds(bounds=");
            sb2.append(this.f179648a);
            sb2.append(", animate=");
            return r.x(sb2, this.f179649b, ')');
        }

        public C5283a(@k AvitoMapBounds avitoMapBounds, boolean z12) {
            super(null);
            this.f179648a = avitoMapBounds;
            this.f179649b = z12;
        }
    }

    /* compiled from: MoveTo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/map/state/a$b;", "Lcom/avito/android/lib/design/map/state/a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AvitoMapPoint f179650a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f179651b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Float f179652c;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(AvitoMapPoint avitoMapPoint, boolean z12, Float f12, int i12, C42822w c42822w) {
            z12 = (i12 & 2) != 0 ? true : z12;
            C42822w c42822w2 = null;
            f12 = (i12 & 4) != 0 ? null : f12;
            super(c42822w2);
            this.f179650a = avitoMapPoint;
            this.f179651b = z12;
            this.f179652c = f12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f179650a, bVar.f179650a) && this.f179651b == bVar.f179651b && L.f(this.f179652c, bVar.f179652c);
        }

        public final int hashCode() {
            int i12 = r.i(this.f179650a.hashCode() * 31, 31, this.f179651b);
            Float f12 = this.f179652c;
            return i12 + (f12 == null ? 0 : f12.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Point(point=");
            sb2.append(this.f179650a);
            sb2.append(", animate=");
            sb2.append(this.f179651b);
            sb2.append(", zoomLevel=");
            return h.d(sb2, this.f179652c, ')');
        }
    }

    /* compiled from: MoveTo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/map/state/a$c;", "Lcom/avito/android/lib/design/map/state/a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AvitoMapPoint f179653a;

        /* renamed from: b, reason: collision with root package name */
        public final float f179654b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AvitoMapBounds f179655c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final MoveReason f179656d;

        public c(@k AvitoMapPoint avitoMapPoint, float f12, @l AvitoMapBounds avitoMapBounds, @k MoveReason moveReason) {
            super(null);
            this.f179653a = avitoMapPoint;
            this.f179654b = f12;
            this.f179655c = avitoMapBounds;
            this.f179656d = moveReason;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f179653a, cVar.f179653a) && Float.compare(this.f179654b, cVar.f179654b) == 0 && L.f(this.f179655c, cVar.f179655c) && this.f179656d == cVar.f179656d;
        }

        public final int hashCode() {
            int iD2 = r.d(this.f179654b, this.f179653a.hashCode() * 31, 31);
            AvitoMapBounds avitoMapBounds = this.f179655c;
            return this.f179656d.hashCode() + ((iD2 + (avitoMapBounds == null ? 0 : avitoMapBounds.hashCode())) * 31);
        }

        @k
        public final String toString() {
            return "VisibleSnapshot(point=" + this.f179653a + ", zoomLevel=" + this.f179654b + ", bounds=" + this.f179655c + ", reason=" + this.f179656d + ')';
        }
    }

    /* compiled from: MoveTo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/map/state/a$d;", "Lcom/avito/android/lib/design/map/state/a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final float f179657a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f179658b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f12, boolean z12, int i12, C42822w c42822w) {
            super(null);
            z12 = (i12 & 2) != 0 ? true : z12;
            this.f179657a = f12;
            this.f179658b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Float.compare(this.f179657a, dVar.f179657a) == 0 && this.f179658b == dVar.f179658b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f179658b) + (Float.hashCode(this.f179657a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Zoom(zoomLevel=");
            sb2.append(this.f179657a);
            sb2.append(", animate=");
            return r.x(sb2, this.f179658b, ')');
        }
    }

    /* compiled from: MoveTo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/map/state/a$e;", "Lcom/avito/android/lib/design/map/state/a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f179659a;

        public e() {
            this(false, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f179659a == ((e) obj).f179659a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f179659a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ZoomIn(animate="), this.f179659a, ')');
        }

        public /* synthetic */ e(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? true : z12);
        }

        public e(boolean z12) {
            super(null);
            this.f179659a = z12;
        }
    }

    /* compiled from: MoveTo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/map/state/a$f;", "Lcom/avito/android/lib/design/map/state/a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f extends a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f179660a;

        public f() {
            this(false, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f179660a == ((f) obj).f179660a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f179660a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ZoomOut(animate="), this.f179660a, ')');
        }

        public /* synthetic */ f(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? true : z12);
        }

        public f(boolean z12) {
            super(null);
            this.f179660a = z12;
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    public a() {
    }
}
