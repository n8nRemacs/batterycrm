package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.collections.b1;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UnsupportedComposeAnimation.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/tooling/animation/G;", "Landroidx/compose/animation/tooling/ComposeAnimation;", "a", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class G implements ComposeAnimation {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f42768a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f42769b;

    /* compiled from: UnsupportedComposeAnimation.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/tooling/animation/G$a;", "", "<init>", "()V", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.l
        public static G a(@Y61.l String str) {
            C42822w c42822w = null;
            if (G.f42769b) {
                return new G(str, c42822w);
            }
            return null;
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
            if (L.f(composeAnimationTypeArrValues[i12].name(), "UNSUPPORTED")) {
                z12 = true;
                break;
            }
            i12++;
        }
        f42769b = z12;
    }

    public /* synthetic */ G(String str, C42822w c42822w) {
        this();
    }

    public G() {
        ComposeAnimationType composeAnimationType = ComposeAnimationType.UNSUPPORTED;
        b1.b();
    }
}
