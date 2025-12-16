package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C20310q;
import androidx.compose.runtime.F3;
import kotlin.Metadata;

/* compiled from: BringIntoViewSpec.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/J;", "", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface J {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f27277a = a.f27278a;

    /* compiled from: BringIntoViewSpec.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/J$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f27278a = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final androidx.compose.animation.core.R0 f27279b = C20310q.d(0.0f, 7, null);

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final C1569a f27280c = new C1569a();

        /* compiled from: BringIntoViewSpec.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/gestures/J$a$a", "Landroidx/compose/foundation/gestures/J;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.gestures.J$a$a, reason: collision with other inner class name */
        public static final class C1569a implements J {
        }
    }

    default float a(float f12, float f13, float f14) {
        f27277a.getClass();
        float f15 = f13 + f12;
        if ((f12 >= 0.0f && f15 <= f14) || (f12 < 0.0f && f15 > f14)) {
            return 0.0f;
        }
        float f16 = f15 - f14;
        return Math.abs(f12) < Math.abs(f16) ? f12 : f16;
    }
}
