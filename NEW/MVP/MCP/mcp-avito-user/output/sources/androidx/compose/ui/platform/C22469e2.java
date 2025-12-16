package androidx.compose.ui.platform;

import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: SemanticsUtils.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/e2;", "Landroidx/compose/ui/node/K0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.e2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22469e2 implements androidx.compose.ui.node.K0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f41436b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f41437c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Float f41438d = null;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Float f41439e = null;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.semantics.j f41440f = null;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.semantics.j f41441g = null;

    public C22469e2(int i12, @Y61.k ArrayList arrayList) {
        this.f41436b = i12;
        this.f41437c = arrayList;
    }

    @Override // androidx.compose.ui.node.K0
    public final boolean n1() {
        return this.f41437c.contains(this);
    }
}
