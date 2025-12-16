package androidx.compose.foundation.layout;

import androidx.compose.runtime.F3;
import androidx.compose.ui.i;
import j.InterfaceC42167x;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: FlowLayout.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/p1;", "Landroidx/compose/foundation/layout/q1;", "Landroidx/compose/foundation/layout/o1;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20607p1 implements InterfaceC20611q1, InterfaceC20603o1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final X0 f28708a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C20614r1 f28709b = C20614r1.f28730b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f28710c;

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.p1$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Integer> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(C20607p1.this.f28708a.f28535d);
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.p1$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<Integer> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(C20607p1.this.f28708a.f28536e);
        }
    }

    public C20607p1(@Y61.k X0 x02) {
        this.f28708a = x02;
        new H1(new b());
        x02.getClass();
        new a();
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20572g2
    @F3
    @Y61.k
    public final androidx.compose.ui.v a(@Y61.k androidx.compose.ui.v vVar, @InterfaceC42167x float f12, boolean z12) {
        return this.f28709b.f28731a.a(vVar, f12, z12);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20611q1
    @InterfaceC20625u0
    @Y61.k
    public final androidx.compose.ui.v b(@Y61.k androidx.compose.ui.v vVar) {
        return this.f28709b.b(vVar);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20572g2
    @F3
    @Y61.k
    public final androidx.compose.ui.v c(@Y61.k androidx.compose.ui.v vVar, @Y61.k i.b bVar) {
        return this.f28709b.f28731a.c(vVar, bVar);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20572g2
    @F3
    @Y61.k
    public final androidx.compose.ui.v d(@Y61.k androidx.compose.ui.v vVar) {
        return this.f28709b.f28731a.d(vVar);
    }
}
