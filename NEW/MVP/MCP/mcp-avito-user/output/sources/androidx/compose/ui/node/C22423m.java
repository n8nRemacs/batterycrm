package androidx.compose.ui.node;

import android.view.View;
import kotlin.Metadata;
import s0.C47949a;

/* compiled from: DelegatableNode.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22423m {
    @Y61.k
    public static final View a(@Y61.k InterfaceC22419k interfaceC22419k) {
        if (!interfaceC22419k.getF42880b().f42893o) {
            C47949a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) S.a(C22421l.g(interfaceC22419k));
    }
}
