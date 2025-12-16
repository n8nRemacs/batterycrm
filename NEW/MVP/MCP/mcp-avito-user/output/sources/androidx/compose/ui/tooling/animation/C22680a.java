package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.AbstractC20330x;
import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.InterfaceC20307p;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.tooling.animation.C22686g;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.collections.b1;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AnimateXAsStateComposeAnimation.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/tooling/animation/a;", "T", "Landroidx/compose/animation/core/x;", "V", "Landroidx/compose/animation/tooling/ComposeAnimation;", "a", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.tooling.animation.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22680a<T, V extends AbstractC20330x> implements ComposeAnimation {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final C1691a f42770e = new C1691a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f42771f;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C<T> f42772a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC20307p<T> f42773b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C20268c<T, V> f42774c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Set<Object> f42775d;

    /* compiled from: AnimateXAsStateComposeAnimation.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/tooling/animation/a$a;", "", "<init>", "()V", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.tooling.animation.a$a, reason: collision with other inner class name */
    public static final class C1691a {
        public /* synthetic */ C1691a(C42822w c42822w) {
            this();
        }

        @Y61.l
        public static C22680a a(@Y61.k C22686g.c cVar) {
            if (!C22680a.f42771f) {
                return null;
            }
            cVar.getClass();
            throw null;
        }

        public C1691a() {
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
            if (L.f(composeAnimationTypeArrValues[i12].name(), "ANIMATE_X_AS_STATE")) {
                z12 = true;
                break;
            }
            i12++;
        }
        f42771f = z12;
    }

    public /* synthetic */ C22680a(C c12, InterfaceC20307p interfaceC20307p, C20268c c20268c, C42822w c42822w) {
        this(c12, interfaceC20307p, c20268c);
    }

    public C22680a(C<T> c12, InterfaceC20307p<T> interfaceC20307p, C20268c<T, V> c20268c) {
        Set<Object> setL0;
        this.f42772a = c12;
        this.f42773b = interfaceC20307p;
        this.f42774c = c20268c;
        ComposeAnimationType composeAnimationType = ComposeAnimationType.ANIMATE_X_AS_STATE;
        T tF2 = c20268c.f();
        Object[] enumConstants = tF2.getClass().getEnumConstants();
        this.f42775d = (enumConstants == null || (setL0 = C42756l.l0(enumConstants)) == null) ? b1.j(tF2) : setL0;
    }
}
