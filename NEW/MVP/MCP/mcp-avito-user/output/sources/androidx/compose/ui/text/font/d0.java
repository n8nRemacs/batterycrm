package androidx.compose.ui.text.font;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.H0;
import androidx.compose.ui.unit.y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: FontVariation.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/font/d0;", "", "<init>", "()V", "a", "b", "c", "d", "e", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final d0 f42233a = new d0();

    /* compiled from: FontVariation.kt */
    @H0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/d0$a;", "", "Landroidx/compose/ui/text/font/d0$b;", "Landroidx/compose/ui/text/font/d0$c;", "Landroidx/compose/ui/text/font/d0$d;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        boolean a();

        @Y61.k
        /* renamed from: b */
        String getF42236a();

        float c(@Y61.l androidx.compose.ui.unit.d dVar);
    }

    /* compiled from: FontVariation.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/d0$b;", "Landroidx/compose/ui/text/font/d0$a;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final float f42234a;

        public b(float f12) {
            this.f42234a = f12;
        }

        @Override // androidx.compose.ui.text.font.d0.a
        public final boolean a() {
            return false;
        }

        @Override // androidx.compose.ui.text.font.d0.a
        @Y61.k
        /* renamed from: b */
        public final String getF42236a() {
            return "ital";
        }

        @Override // androidx.compose.ui.text.font.d0.a
        public final float c(@Y61.l androidx.compose.ui.unit.d dVar) {
            return this.f42234a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            return this.f42234a == bVar.f42234a;
        }

        public final int hashCode() {
            return Float.hashCode(this.f42234a) + 100522026;
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.k(')', this.f42234a, new StringBuilder("FontVariation.Setting(axisName='ital', value="));
        }
    }

    /* compiled from: FontVariation.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/d0$c;", "Landroidx/compose/ui/text/font/d0$a;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f42235a;

        public c(int i12) {
            this.f42235a = i12;
        }

        @Override // androidx.compose.ui.text.font.d0.a
        public final boolean a() {
            return false;
        }

        @Override // androidx.compose.ui.text.font.d0.a
        @Y61.k
        /* renamed from: b */
        public final String getF42236a() {
            return "wght";
        }

        @Override // androidx.compose.ui.text.font.d0.a
        public final float c(@Y61.l androidx.compose.ui.unit.d dVar) {
            return this.f42235a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            return this.f42235a == cVar.f42235a;
        }

        public final int hashCode() {
            return 113071012 + this.f42235a;
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("FontVariation.Setting(axisName='wght', value="), this.f42235a, ')');
        }
    }

    /* compiled from: FontVariation.kt */
    @H0
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/font/d0$d;", "Landroidx/compose/ui/text/font/d0$a;", "", "axisName", "Landroidx/compose/ui/unit/y;", "value", "<init>", "(Ljava/lang/String;JLkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f42236a;

        /* renamed from: b, reason: collision with root package name */
        public final long f42237b;

        public d(String str, long j12, C42822w c42822w) {
            this.f42236a = str;
            this.f42237b = j12;
        }

        @Override // androidx.compose.ui.text.font.d0.a
        public final boolean a() {
            return true;
        }

        @Override // androidx.compose.ui.text.font.d0.a
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getF42236a() {
            return this.f42236a;
        }

        @Override // androidx.compose.ui.text.font.d0.a
        public final float c(@Y61.l androidx.compose.ui.unit.d dVar) {
            return dVar.getF42847c() * androidx.compose.ui.unit.y.d(this.f42237b);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.L.f(this.f42236a, dVar.f42236a) && androidx.compose.ui.unit.y.b(this.f42237b, dVar.f42237b);
        }

        public final int hashCode() {
            int iHashCode = this.f42236a.hashCode() * 31;
            y.a aVar = androidx.compose.ui.unit.y.f42874b;
            return Long.hashCode(this.f42237b) + iHashCode;
        }

        @Y61.k
        public final String toString() {
            return "FontVariation.Setting(axisName='" + this.f42236a + "', value=" + ((Object) androidx.compose.ui.unit.y.f(this.f42237b)) + ')';
        }
    }

    /* compiled from: FontVariation.kt */
    @H0
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/d0$e;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f42238a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f42239b;

        public e(@Y61.k a... aVarArr) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z12 = false;
            for (a aVar : aVarArr) {
                String f42236a = aVar.getF42236a();
                Object objR = linkedHashMap.get(f42236a);
                if (objR == null) {
                    objR = androidx.compose.ui.graphics.colorspace.e.r(linkedHashMap, f42236a);
                }
                ((List) objR).add(aVar);
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() != 1) {
                    throw new IllegalArgumentException(C22026a.c(androidx.appcompat.app.r.A("'", str, "' must be unique. Actual [ ["), C42745f0.O(list, null, null, null, null, 63), ']').toString());
                }
                C42745f0.h(list, arrayList);
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.f42238a = arrayList2;
            int size = arrayList2.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    break;
                }
                if (((a) arrayList2.get(i12)).a()) {
                    z12 = true;
                    break;
                }
                i12++;
            }
            this.f42239b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && kotlin.jvm.internal.L.f(this.f42238a, ((e) obj).f42238a);
        }

        public final int hashCode() {
            return this.f42238a.hashCode();
        }
    }
}
