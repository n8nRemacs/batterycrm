package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.C20288i1;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.m0;

/* compiled from: TransitionComposeAnimation.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-tooling_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class F {
    @Y61.l
    public static final E<?> a(@Y61.k C20288i1<?> c20288i1) {
        Set setSingleton;
        Object objA = c20288i1.f26317a.a();
        if (objA == null) {
            return null;
        }
        Object[] enumConstants = objA.getClass().getEnumConstants();
        if (enumConstants == null || (setSingleton = C42756l.l0(enumConstants)) == null) {
            setSingleton = Collections.singleton(objA);
        }
        if (c20288i1.f26319c == null) {
            m0.f406844a.b(objA.getClass()).l0();
        }
        return new E<>(c20288i1, setSingleton);
    }
}
