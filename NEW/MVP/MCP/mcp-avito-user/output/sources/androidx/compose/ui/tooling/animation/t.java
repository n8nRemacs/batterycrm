package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.C20281g0;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.tooling.animation.C22686g;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.b1;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: InfiniteTransitionComposeAnimation.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/tooling/animation/t;", "Landroidx/compose/animation/tooling/ComposeAnimation;", "a", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t implements ComposeAnimation {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f42789c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f42790d;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C20281g0 f42791a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<Object> f42792b;

    /* compiled from: InfiniteTransitionComposeAnimation.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/tooling/animation/t$a;", "", "<init>", "()V", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.l
        public static t a(@Y61.k C22686g.h hVar) {
            C42822w c42822w = null;
            if (!t.f42790d) {
                return null;
            }
            hVar.getClass();
            return new t(null, null, c42822w);
        }

        public a() {
        }
    }

    static {
        ComposeAnimationType[] composeAnimationTypeArrValues = ComposeAnimationType.values();
        int length = composeAnimationTypeArrValues.length;
        boolean z12 = false;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            if (L.f(composeAnimationTypeArrValues[i12].name(), "INFINITE_TRANSITION")) {
                z12 = true;
                break;
            }
            i12++;
        }
        f42790d = z12;
    }

    public /* synthetic */ t(C c12, C20281g0 c20281g0, C42822w c42822w) {
        this(c20281g0);
    }

    public t(C20281g0 c20281g0) {
        this.f42791a = c20281g0;
        ComposeAnimationType composeAnimationType = ComposeAnimationType.INFINITE_TRANSITION;
        this.f42792b = b1.j(0);
        c20281g0.getClass();
    }
}
