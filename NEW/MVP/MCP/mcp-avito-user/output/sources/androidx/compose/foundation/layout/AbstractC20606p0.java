package androidx.compose.foundation.layout;

import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RowColumnImpl.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/layout/p0;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "Landroidx/compose/foundation/layout/p0$a;", "Landroidx/compose/foundation/layout/p0$b;", "Landroidx/compose/foundation/layout/p0$d;", "Landroidx/compose/foundation/layout/p0$e;", "Landroidx/compose/foundation/layout/p0$f;", "Landroidx/compose/foundation/layout/p0$g;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC20606p0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final c f28701a = new c(null);

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/p0$a;", "Landroidx/compose/foundation/layout/p0;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.p0$a */
    public static final class a extends AbstractC20606p0 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AbstractC20573h f28702b;

        public a(@Y61.k AbstractC20573h abstractC20573h) {
            super(null);
            this.f28702b = abstractC20573h;
        }

        @Override // androidx.compose.foundation.layout.AbstractC20606p0
        public final int a(int i12, int i13, @Y61.k androidx.compose.ui.layout.K0 k02, @Y61.k LayoutDirection layoutDirection) {
            int iA2 = this.f28702b.a(k02);
            if (iA2 == Integer.MIN_VALUE) {
                return 0;
            }
            int i14 = i13 - iA2;
            return layoutDirection == LayoutDirection.f42839c ? i12 - i14 : i14;
        }

        @Override // androidx.compose.foundation.layout.AbstractC20606p0
        @Y61.k
        public final Integer b(@Y61.k androidx.compose.ui.layout.K0 k02) {
            return Integer.valueOf(this.f28702b.a(k02));
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/p0$b;", "Landroidx/compose/foundation/layout/p0;", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.p0$b */
    public static final class b extends AbstractC20606p0 {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f28703b = 0;

        static {
            new b();
        }

        public b() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.AbstractC20606p0
        public final int a(int i12, int i13, @Y61.k androidx.compose.ui.layout.K0 k02, @Y61.k LayoutDirection layoutDirection) {
            return i12 / 2;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/p0$c;", "", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.p0$c */
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/p0$d;", "Landroidx/compose/foundation/layout/p0;", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.p0$d */
    public static final class d extends AbstractC20606p0 {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f28704b = 0;

        static {
            new d();
        }

        public d() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.AbstractC20606p0
        public final int a(int i12, int i13, @Y61.k androidx.compose.ui.layout.K0 k02, @Y61.k LayoutDirection layoutDirection) {
            if (layoutDirection == LayoutDirection.f42838b) {
                return i12;
            }
            return 0;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/p0$e;", "Landroidx/compose/foundation/layout/p0;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.p0$e */
    public static final /* data */ class e extends AbstractC20606p0 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final InterfaceC22215f.b f28705b;

        public e(@Y61.k InterfaceC22215f.b bVar) {
            super(null);
            this.f28705b = bVar;
        }

        @Override // androidx.compose.foundation.layout.AbstractC20606p0
        public final int a(int i12, int i13, @Y61.k androidx.compose.ui.layout.K0 k02, @Y61.k LayoutDirection layoutDirection) {
            return this.f28705b.a(0, i12, layoutDirection);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && kotlin.jvm.internal.L.f(this.f28705b, ((e) obj).f28705b);
        }

        public final int hashCode() {
            return this.f28705b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.f28705b + ')';
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/p0$f;", "Landroidx/compose/foundation/layout/p0;", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.p0$f */
    public static final class f extends AbstractC20606p0 {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f28706b = 0;

        static {
            new f();
        }

        public f() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.AbstractC20606p0
        public final int a(int i12, int i13, @Y61.k androidx.compose.ui.layout.K0 k02, @Y61.k LayoutDirection layoutDirection) {
            if (layoutDirection == LayoutDirection.f42838b) {
                return 0;
            }
            return i12;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/p0$g;", "Landroidx/compose/foundation/layout/p0;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.p0$g */
    public static final /* data */ class g extends AbstractC20606p0 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final InterfaceC22215f.c f28707b;

        public g(@Y61.k InterfaceC22215f.c cVar) {
            super(null);
            this.f28707b = cVar;
        }

        @Override // androidx.compose.foundation.layout.AbstractC20606p0
        public final int a(int i12, int i13, @Y61.k androidx.compose.ui.layout.K0 k02, @Y61.k LayoutDirection layoutDirection) {
            return this.f28707b.a(0, i12);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && kotlin.jvm.internal.L.f(this.f28707b, ((g) obj).f28707b);
        }

        public final int hashCode() {
            return this.f28707b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.f28707b + ')';
        }
    }

    static {
        int i12 = b.f28703b;
        int i13 = f.f28706b;
        int i14 = d.f28704b;
    }

    public /* synthetic */ AbstractC20606p0(C42822w c42822w) {
        this();
    }

    public abstract int a(int i12, int i13, @Y61.k androidx.compose.ui.layout.K0 k02, @Y61.k LayoutDirection layoutDirection);

    @Y61.l
    public Integer b(@Y61.k androidx.compose.ui.layout.K0 k02) {
        return null;
    }

    public AbstractC20606p0() {
    }
}
