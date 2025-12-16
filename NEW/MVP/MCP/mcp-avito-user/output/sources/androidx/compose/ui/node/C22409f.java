package androidx.compose.ui.node;

import kotlin.Metadata;

/* compiled from: NodeKind.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/f;", "Landroidx/compose/ui/focus/J;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22409f implements androidx.compose.ui.focus.J {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C22409f f40781a = new C22409f();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public static Boolean f40782b;

    @Override // androidx.compose.ui.focus.J
    public final void a(boolean z12) {
        f40782b = Boolean.valueOf(z12);
    }

    @Override // androidx.compose.ui.focus.J
    /* renamed from: d */
    public final boolean getF39135a() {
        Boolean bool = f40782b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw androidx.compose.foundation.H.s("canFocus is read before it is written");
    }
}
