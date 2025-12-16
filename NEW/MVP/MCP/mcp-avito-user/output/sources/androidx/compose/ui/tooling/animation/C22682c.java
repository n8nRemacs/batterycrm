package androidx.compose.ui.tooling.animation;

import A0.a;
import androidx.compose.animation.core.C20288i1;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.P;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.b1;

/* compiled from: AnimatedVisibilityComposeAnimation.android.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/tooling/animation/c;", "Landroidx/compose/animation/tooling/ComposeAnimation;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.tooling.animation.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22682c implements ComposeAnimation {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C20288i1<Boolean> f42780a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<A0.a> f42781b;

    public C22682c(@Y61.k C20288i1 c20288i1) {
        this.f42780a = c20288i1;
        ComposeAnimationType composeAnimationType = ComposeAnimationType.ANIMATED_VISIBILITY;
        A0.a.f29b.getClass();
        this.f42781b = b1.k(A0.a.a(a.C0000a.a()), A0.a.a(a.C0000a.b()));
    }
}
