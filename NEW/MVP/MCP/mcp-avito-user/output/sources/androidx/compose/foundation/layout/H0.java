package androidx.compose.foundation.layout;

import androidx.compose.runtime.F3;
import j.InterfaceC42167x;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: FlowLayout.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/H0;", "Landroidx/compose/foundation/layout/I0;", "Landroidx/compose/foundation/layout/G0;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class H0 implements I0, G0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final X0 f28300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J0 f28301b = J0.f28340b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f28302c;

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Integer> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(H0.this.f28300a.f28535d);
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<Integer> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(H0.this.f28300a.f28536e);
        }
    }

    public H0(@Y61.k X0 x02) {
        this.f28300a = x02;
        new H1(new b());
        x02.getClass();
        new a();
    }

    @Override // androidx.compose.foundation.layout.J
    @F3
    @Y61.k
    public final androidx.compose.ui.v a(@Y61.k androidx.compose.ui.v vVar, @InterfaceC42167x float f12, boolean z12) {
        return this.f28301b.f28341a.a(vVar, f12, z12);
    }

    @Override // androidx.compose.foundation.layout.I0
    @InterfaceC20625u0
    @Y61.k
    public final androidx.compose.ui.v b(@Y61.k androidx.compose.ui.v vVar) {
        return this.f28301b.b(vVar);
    }
}
