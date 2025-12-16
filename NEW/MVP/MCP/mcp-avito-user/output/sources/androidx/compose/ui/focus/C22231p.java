package androidx.compose.ui.focus;

import androidx.collection.S0;
import androidx.collection.k1;
import androidx.compose.ui.node.InterfaceC22419k;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FocusInvalidationManager.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/focus/p;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.focus.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22231p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Y41.a<G0>, G0> f39187a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f39188b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<f0> f39189c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.a<FocusTargetNode> f39190d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final S0<FocusTargetNode> f39191e = k1.a();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final S0<InterfaceC22224i> f39192f = k1.a();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ArrayList f39193g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ArrayList f39194h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ArrayList f39195i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ArrayList f39196j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f39197k;

    /* JADX WARN: Multi-variable type inference failed */
    public C22231p(@Y61.k Y41.l<? super Y41.a<G0>, G0> lVar, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<? extends f0> aVar2, @Y61.k Y41.a<FocusTargetNode> aVar3) {
        this.f39187a = lVar;
        this.f39188b = aVar;
        this.f39189c = aVar2;
        this.f39190d = aVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.focus.C22231p r22) {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.C22231p.a(androidx.compose.ui.focus.p):void");
    }

    public final boolean b() {
        return androidx.compose.ui.l.f40323d ? this.f39197k : (this.f39193g.isEmpty() && this.f39195i.isEmpty() && this.f39194h.isEmpty()) ? false : true;
    }

    public final void c(ArrayList arrayList, InterfaceC22419k interfaceC22419k) {
        if (arrayList.add(interfaceC22419k)) {
            if (this.f39195i.size() + this.f39194h.size() + this.f39193g.size() == 1) {
                this.f39187a.invoke(new C22229n(0, this, C22231p.class, "invalidateNodes", "invalidateNodes()V", 0));
            }
        }
    }
}
