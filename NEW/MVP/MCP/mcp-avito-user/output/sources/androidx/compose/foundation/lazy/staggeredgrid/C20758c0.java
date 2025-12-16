package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.graphics.InterfaceC22264l0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazyStaggeredGridMeasure.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\r\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/c0;", "", "Landroidx/compose/foundation/lazy/staggeredgrid/y0;", VoiceInfo.STATE, "", "", "pinnedItems", "Landroidx/compose/foundation/lazy/staggeredgrid/M;", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/w0;", "resolvedSlots", "Landroidx/compose/ui/unit/b;", "constraints", "", "isVertical", "Landroidx/compose/foundation/lazy/layout/Q;", "measureScope", "mainAxisAvailableSize", "Landroidx/compose/ui/unit/q;", "contentOffset", "beforeContentPadding", "afterContentPadding", "reverseLayout", "mainAxisSpacing", "Lkotlinx/coroutines/T;", "coroutineScope", "isInLookaheadScope", "isLookingAhead", "Landroidx/compose/foundation/lazy/staggeredgrid/a0;", "approachLayoutInfo", "Landroidx/compose/ui/graphics/l0;", "graphicsContext", "<init>", "(Landroidx/compose/foundation/lazy/staggeredgrid/y0;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/M;Landroidx/compose/foundation/lazy/staggeredgrid/w0;JZLandroidx/compose/foundation/lazy/layout/Q;IJIIZILkotlinx/coroutines/T;ZZLandroidx/compose/foundation/lazy/staggeredgrid/a0;Landroidx/compose/ui/graphics/l0;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20758c0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final y0 f29590a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<Integer> f29591b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final M f29592c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final w0 f29593d;

    /* renamed from: e, reason: collision with root package name */
    public final long f29594e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f29595f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.lazy.layout.Q f29596g;

    /* renamed from: h, reason: collision with root package name */
    public final int f29597h;

    /* renamed from: i, reason: collision with root package name */
    public final long f29598i;

    /* renamed from: j, reason: collision with root package name */
    public final int f29599j;

    /* renamed from: k, reason: collision with root package name */
    public final int f29600k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f29601l;

    /* renamed from: m, reason: collision with root package name */
    public final int f29602m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.T f29603n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f29604o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final InterfaceC20754a0 f29605p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22264l0 f29606q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final C20756b0 f29607r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final Y f29608s;

    /* renamed from: t, reason: collision with root package name */
    public final int f29609t;

    public C20758c0() {
        throw null;
    }

    public C20758c0(y0 y0Var, List list, M m12, w0 w0Var, long j12, boolean z12, androidx.compose.foundation.lazy.layout.Q q12, int i12, long j13, int i13, int i14, boolean z13, int i15, kotlinx.coroutines.T t12, boolean z14, boolean z15, InterfaceC20754a0 interfaceC20754a0, InterfaceC22264l0 interfaceC22264l0, C42822w c42822w) {
        this.f29590a = y0Var;
        this.f29591b = list;
        this.f29592c = m12;
        this.f29593d = w0Var;
        this.f29594e = j12;
        this.f29595f = z12;
        this.f29596g = q12;
        this.f29597h = i12;
        this.f29598i = j13;
        this.f29599j = i13;
        this.f29600k = i14;
        this.f29601l = z13;
        this.f29602m = i15;
        this.f29603n = t12;
        this.f29604o = z14;
        this.f29605p = interfaceC20754a0;
        this.f29606q = interfaceC22264l0;
        this.f29607r = new C20756b0(this, z12, m12, q12, w0Var);
        this.f29608s = y0Var.f29684e;
        this.f29609t = w0Var.f29677b.length;
    }

    public static long a(@Y61.k M m12, int i12, int i13) {
        m12.d().a(i12);
        return (i13 << 32) | ((i13 + 1) & 4294967295L);
    }
}
