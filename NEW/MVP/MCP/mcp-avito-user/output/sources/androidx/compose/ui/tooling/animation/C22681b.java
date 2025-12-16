package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.C20288i1;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.P;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: AnimatedContentComposeAnimation.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/tooling/animation/b;", "T", "Landroidx/compose/animation/tooling/ComposeAnimation;", "Landroidx/compose/ui/tooling/animation/D;", "a", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.tooling.animation.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22681b<T> implements ComposeAnimation, D<T> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f42776c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f42777d;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C20288i1<T> f42778a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<Object> f42779b;

    /* compiled from: AnimatedContentComposeAnimation.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/tooling/animation/b$a;", "", "<init>", "()V", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.tooling.animation.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.l
        public static C22681b a(@Y61.k C20288i1 c20288i1) {
            Object objA;
            Set setSingleton;
            C42822w c42822w = null;
            if (!C22681b.f42777d || (objA = c20288i1.f26317a.a()) == null) {
                return null;
            }
            Object[] enumConstants = objA.getClass().getEnumConstants();
            if (enumConstants == null || (setSingleton = C42756l.l0(enumConstants)) == null) {
                setSingleton = Collections.singleton(objA);
            }
            String strL0 = c20288i1.f26319c;
            if (strL0 == null) {
                strL0 = m0.f406844a.b(objA.getClass()).l0();
            }
            return new C22681b(c20288i1, setSingleton, strL0, c42822w);
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
            if (L.f(composeAnimationTypeArrValues[i12].name(), "ANIMATED_CONTENT")) {
                z12 = true;
                break;
            }
            i12++;
        }
        f42777d = z12;
    }

    public /* synthetic */ C22681b(C20288i1 c20288i1, Set set, String str, C42822w c42822w) {
        this(c20288i1, set);
    }

    @Override // androidx.compose.ui.tooling.animation.D
    @Y61.k
    public final C20288i1<T> a() {
        return this.f42778a;
    }

    public C22681b(C20288i1 c20288i1, Set set) {
        this.f42778a = c20288i1;
        this.f42779b = set;
        ComposeAnimationType composeAnimationType = ComposeAnimationType.ANIMATED_CONTENT;
    }
}
