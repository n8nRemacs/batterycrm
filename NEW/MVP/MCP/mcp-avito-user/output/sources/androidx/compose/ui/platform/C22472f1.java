package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.view.View;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FocusFinderCompat.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/platform/f1;", "", "<init>", "()V", "b", "c", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22472f1 {

    /* compiled from: FocusFinderCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/compose/ui/platform/f1$a", "Ljava/lang/ThreadLocal;", "Landroidx/compose/ui/platform/f1;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.f1$a */
    public static final class a extends ThreadLocal<C22472f1> {
        @Override // java.lang.ThreadLocal
        public final C22472f1 initialValue() {
            return new C22472f1();
        }
    }

    /* compiled from: FocusFinderCompat.android.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/f1$b;", "", "<init>", "()V", "androidx/compose/ui/platform/f1$a", "FocusFinderThreadLocal", "Landroidx/compose/ui/platform/f1$a;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.f1$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: FocusFinderCompat.android.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/f1$c;", "Ljava/util/Comparator;", "Landroid/view/View;", "Lkotlin/Comparator;", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.f1$c */
    public static final class c implements Comparator<View> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final androidx.collection.R0<View, View> f41443b = androidx.collection.i1.b();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final androidx.collection.R0<View, View> f41444c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final androidx.collection.M0<View> f41445d;

        /* compiled from: FocusFinderCompat.android.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/f1$c$a;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.platform.f1$c$a */
        public interface a {
        }

        public c(@Y61.k C22491k0 c22491k0) {
            androidx.collection.k1.a();
            this.f41444c = androidx.collection.i1.b();
            this.f41445d = androidx.collection.Y0.a();
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
        
            if (r5.f41443b.e(r6) != null) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0049, code lost:
        
            if (r0.b(r6) < r0.b(r7)) goto L7;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int compare(android.view.View r6, android.view.View r7) {
            /*
                r5 = this;
                android.view.View r6 = (android.view.View) r6
                android.view.View r7 = (android.view.View) r7
                r0 = 0
                if (r6 != r7) goto L8
                goto L4c
            L8:
                r1 = -1
                if (r6 != 0) goto Ld
            Lb:
                r0 = r1
                goto L4c
            Ld:
                r2 = 1
                if (r7 != 0) goto L12
            L10:
                r0 = r2
                goto L4c
            L12:
                androidx.collection.R0<android.view.View, android.view.View> r3 = r5.f41444c
                java.lang.Object r4 = r3.e(r6)
                android.view.View r4 = (android.view.View) r4
                java.lang.Object r3 = r3.e(r7)
                android.view.View r3 = (android.view.View) r3
                if (r4 != r3) goto L33
                if (r4 == 0) goto L33
                if (r6 != r4) goto L27
                goto Lb
            L27:
                if (r7 != r4) goto L2a
                goto L10
            L2a:
                androidx.collection.R0<android.view.View, android.view.View> r7 = r5.f41443b
                java.lang.Object r6 = r7.e(r6)
                if (r6 == 0) goto L10
                goto Lb
            L33:
                if (r4 != 0) goto L36
                goto L37
            L36:
                r6 = r4
            L37:
                if (r3 != 0) goto L3a
                goto L3b
            L3a:
                r7 = r3
            L3b:
                if (r4 != 0) goto L3f
                if (r3 == 0) goto L4c
            L3f:
                androidx.collection.M0<android.view.View> r0 = r5.f41445d
                int r6 = r0.b(r6)
                int r7 = r0.b(r7)
                if (r6 >= r7) goto L10
                goto Lb
            L4c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C22472f1.c.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    static {
        new b(null);
        new a();
    }

    public C22472f1() {
        new Rect();
        new c(new C22491k0());
        new androidx.collection.N0(0, 1, null);
    }
}
