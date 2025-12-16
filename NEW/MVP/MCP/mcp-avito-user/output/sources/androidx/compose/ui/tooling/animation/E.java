package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.C20288i1;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.P;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: TransitionComposeAnimation.android.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/tooling/animation/E;", "T", "Landroidx/compose/animation/tooling/ComposeAnimation;", "Landroidx/compose/ui/tooling/animation/D;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class E<T> implements ComposeAnimation, D<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C20288i1<T> f42766a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<Object> f42767b;

    public E(@Y61.k C20288i1 c20288i1, @Y61.k Set set) {
        this.f42766a = c20288i1;
        this.f42767b = set;
        ComposeAnimationType composeAnimationType = ComposeAnimationType.TRANSITION_ANIMATION;
    }

    @Override // androidx.compose.ui.tooling.animation.D
    @Y61.k
    public final C20288i1<T> a() {
        return this.f42766a;
    }
}
