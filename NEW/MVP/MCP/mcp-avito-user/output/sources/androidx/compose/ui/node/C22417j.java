package androidx.compose.ui.node;

import kotlin.Metadata;
import s0.C47949a;

/* compiled from: CompositionLocalConsumerModifierNode.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22417j {
    public static final <T> T a(@Y61.k InterfaceC22415i interfaceC22415i, @Y61.k androidx.compose.runtime.O<T> o12) {
        if (!interfaceC22415i.getF42880b().f42893o) {
            C47949a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return (T) C22421l.g(interfaceC22415i).f40611E.a(o12);
    }
}
