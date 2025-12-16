package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC22363h0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FlowLayoutBuildingBlocks.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0002\r\u000eB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/layout/K0;", "", "", "maxItemsInMainAxis", "Landroidx/compose/foundation/layout/X0;", "overflow", "Landroidx/compose/foundation/layout/P1;", "constraints", "maxLines", "mainAxisSpacing", "crossAxisSpacing", "<init>", "(ILandroidx/compose/foundation/layout/X0;JIIILkotlin/jvm/internal/w;)V", "a", "b", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class K0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f28345a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final X0 f28346b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28347c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28348d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28349e;

    /* renamed from: f, reason: collision with root package name */
    public final int f28350f;

    /* compiled from: FlowLayoutBuildingBlocks.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/layout/K0$a;", "", "Landroidx/compose/ui/layout/h0;", "ellipsis", "Landroidx/compose/ui/layout/K0;", "placeable", "Landroidx/collection/E;", "ellipsisSize", "", "placeEllipsisOnLastContentLine", "<init>", "(Landroidx/compose/ui/layout/h0;Landroidx/compose/ui/layout/K0;JZLkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC22363h0 f28351a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final androidx.compose.ui.layout.K0 f28352b;

        /* renamed from: c, reason: collision with root package name */
        public final long f28353c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f28354d;

        public /* synthetic */ a(InterfaceC22363h0 interfaceC22363h0, androidx.compose.ui.layout.K0 k02, long j12, boolean z12, int i12, C42822w c42822w) {
            this(interfaceC22363h0, k02, j12, (i12 & 8) != 0 ? true : z12, null);
        }

        public a(InterfaceC22363h0 interfaceC22363h0, androidx.compose.ui.layout.K0 k02, long j12, boolean z12, C42822w c42822w) {
            this.f28351a = interfaceC22363h0;
            this.f28352b = k02;
            this.f28353c = j12;
            this.f28354d = z12;
        }
    }

    /* compiled from: FlowLayoutBuildingBlocks.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/K0$b;", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f28355a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f28356b;

        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            boolean z12 = false;
            this(z12, z12, 3, null);
        }

        public b(boolean z12, boolean z13) {
            this.f28355a = z12;
            this.f28356b = z13;
        }

        public /* synthetic */ b(boolean z12, boolean z13, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13);
        }
    }

    public K0(int i12, X0 x02, long j12, int i13, int i14, int i15, C42822w c42822w) {
        this.f28345a = i12;
        this.f28346b = x02;
        this.f28347c = j12;
        this.f28348d = i13;
        this.f28349e = i14;
        this.f28350f = i15;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.foundation.layout.K0.a a(@Y61.k androidx.compose.foundation.layout.K0.b r17, boolean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.K0.a(androidx.compose.foundation.layout.K0$b, boolean, int, int, int, int):androidx.compose.foundation.layout.K0$a");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if ((((int) (r21 >> 32)) - ((int) (r16 >> 32))) < 0) goto L24;
     */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.foundation.layout.K0.b b(boolean r19, int r20, long r21, @Y61.l androidx.collection.E r23, int r24, int r25, int r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.K0.b(boolean, int, long, androidx.collection.E, int, int, int, boolean, boolean):androidx.compose.foundation.layout.K0$b");
    }
}
