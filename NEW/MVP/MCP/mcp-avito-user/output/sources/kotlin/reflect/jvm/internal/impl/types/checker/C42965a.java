package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.checker.i;

/* compiled from: ClassicTypeCheckerState.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42965a {
    public static TypeCheckerState a(boolean z12, u uVar, g gVar, i iVar, int i12) {
        if ((i12 & 4) != 0) {
            uVar = u.f410124a;
        }
        u uVar2 = uVar;
        if ((i12 & 8) != 0) {
            gVar = g.a.f410098a;
        }
        g gVar2 = gVar;
        if ((i12 & 16) != 0) {
            iVar = i.a.f410099a;
        }
        return new TypeCheckerState(z12, true, uVar2, gVar2, iVar);
    }
}
