package androidx.compose.ui.semantics;

import androidx.collection.A0;
import androidx.collection.N0;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SemanticsOwner.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/semantics/w;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LayoutNode f41802a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C22558f f41803b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final A0 f41804c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final N0<p> f41805d = new N0<>(2, null);

    public w(@Y61.k LayoutNode layoutNode, @Y61.k C22558f c22558f, @Y61.k A0 a02) {
        this.f41802a = layoutNode;
        this.f41803b = c22558f;
        this.f41804c = a02;
    }

    @Y61.k
    public final u a() {
        return new u(this.f41803b, false, this.f41802a, new l());
    }
}
