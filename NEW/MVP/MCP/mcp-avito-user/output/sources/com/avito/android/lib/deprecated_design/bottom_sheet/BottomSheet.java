package com.avito.android.lib.deprecated_design.bottom_sheet;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.r;
import hw.InterfaceC41179d;
import j.I;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BottomSheet.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet;", "", "a", "NotchVisibility", "c", "d", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
/* loaded from: classes14.dex */
public interface BottomSheet {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f177825a = a.f177831a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BottomSheet.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$NotchVisibility;", "", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NotchVisibility {

        /* renamed from: b, reason: collision with root package name */
        public static final NotchVisibility f177826b;

        /* renamed from: c, reason: collision with root package name */
        public static final NotchVisibility f177827c;

        /* renamed from: d, reason: collision with root package name */
        public static final NotchVisibility f177828d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ NotchVisibility[] f177829e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f177830f;

        static {
            NotchVisibility notchVisibility = new NotchVisibility("AUTO", 0);
            f177826b = notchVisibility;
            NotchVisibility notchVisibility2 = new NotchVisibility("ALWAYS_SHOWN", 1);
            f177827c = notchVisibility2;
            NotchVisibility notchVisibility3 = new NotchVisibility("ALWAYS_HIDDEN", 2);
            f177828d = notchVisibility3;
            NotchVisibility[] notchVisibilityArr = {notchVisibility, notchVisibility2, notchVisibility3};
            f177829e = notchVisibilityArr;
            f177830f = kotlin.enums.c.a(notchVisibilityArr);
        }

        public NotchVisibility() {
            throw null;
        }

        public static NotchVisibility valueOf(String str) {
            return (NotchVisibility) Enum.valueOf(NotchVisibility.class, str);
        }

        public static NotchVisibility[] values() {
            return (NotchVisibility[]) f177829e.clone();
        }
    }

    /* compiled from: BottomSheet.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$a;", "", "<init>", "()V", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f177831a = new a();

        @k
        public static BottomSheet a(@k View view) {
            return new e((FrameLayout) view);
        }
    }

    /* compiled from: BottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    /* compiled from: BottomSheet.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$c;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$c$a;", "Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$c$b;", "Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$c$c;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c {

        /* compiled from: BottomSheet.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$c$a;", "Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$c;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public final int f177832a;

            public a(int i12) {
                super(null);
                this.f177832a = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f177832a == ((a) obj).f177832a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f177832a);
            }

            @k
            public final String toString() {
                return r.t(new StringBuilder("Absolute(value="), this.f177832a, ')');
            }
        }

        /* compiled from: BottomSheet.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$c$b;", "Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$c;", "<init>", "()V", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f177833a = new b();

            public b() {
                super(null);
            }
        }

        /* compiled from: BottomSheet.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$c$c;", "Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$c;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet$c$c, reason: collision with other inner class name */
        public static final /* data */ class C5240c extends c {

            /* renamed from: a, reason: collision with root package name */
            public final float f177834a;

            /* renamed from: b, reason: collision with root package name */
            public final int f177835b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5240c(float f12, int i12, int i13, C42822w c42822w) {
                super(null);
                i12 = (i13 & 2) != 0 ? 0 : i12;
                this.f177834a = f12;
                this.f177835b = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5240c)) {
                    return false;
                }
                C5240c c5240c = (C5240c) obj;
                return Float.compare(this.f177834a, c5240c.f177834a) == 0 && this.f177835b == c5240c.f177835b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f177835b) + (Float.hashCode(this.f177834a) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Relative(value=");
                sb2.append(this.f177834a);
                sb2.append(", offset=");
                return r.t(sb2, this.f177835b, ')');
            }
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: BottomSheet.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$d;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$d$a;", "Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$d$b;", "Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$d$c;", "Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$d$d;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class d {

        /* compiled from: BottomSheet.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$d$a;", "Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$d;", "<init>", "()V", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f177836a = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: BottomSheet.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$d$b;", "Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$d;", "<init>", "()V", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f177837a = new b();

            public b() {
                super(null);
            }
        }

        /* compiled from: BottomSheet.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$d$c;", "Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$d;", "<init>", "()V", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f177838a = new c();

            public c() {
                super(null);
            }
        }

        /* compiled from: BottomSheet.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$d$d;", "Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$d;", "<init>", "()V", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet$d$d, reason: collision with other inner class name */
        public static final class C5241d extends d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C5241d f177839a = new C5241d();

            public C5241d() {
                super(null);
            }
        }

        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    void close();

    @k
    /* renamed from: getView */
    FrameLayout getF177843b();

    @k
    d getVisibility();

    void j2();

    void k2();

    void l2(boolean z12);

    @l
    /* renamed from: m2 */
    Float getF177863v();

    void n2(boolean z12);

    void o2();

    @k
    /* renamed from: p2 */
    c getF177861t();

    void q2(@l Integer num);

    @k
    /* renamed from: r2 */
    com.jakewharton.rxrelay3.b getF177856o();

    void s2(@k c.a aVar);

    void t2(@k NotchVisibility notchVisibility);

    void u2();

    void v2(@l Float f12);

    void w2();

    @k
    View x2(@I int i12);
}
