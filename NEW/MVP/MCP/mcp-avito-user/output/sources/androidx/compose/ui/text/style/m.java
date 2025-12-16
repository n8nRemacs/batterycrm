package androidx.compose.ui.text.style;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.J;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.d1;
import androidx.compose.ui.graphics.k1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TextForegroundStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/style/m;", "", "a", "b", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f42697a = a.f42698a;

    /* compiled from: TextForegroundStyle.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/style/m$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f42698a = new a();

        @Y61.k
        public static m a(@Y61.l J j12, float f12) {
            if (j12 == null) {
                return b.f42699b;
            }
            if (j12 instanceof k1) {
                return b(l.b(((k1) j12).f39547b, f12));
            }
            if (j12 instanceof d1) {
                return new androidx.compose.ui.text.style.c((d1) j12, f12);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Y61.k
        public static m b(long j12) {
            return j12 != 16 ? new androidx.compose.ui.text.style.d(j12, null) : b.f42699b;
        }
    }

    /* compiled from: TextForegroundStyle.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/style/m$b;", "Landroidx/compose/ui/text/style/m;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements m {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final b f42699b = new b();

        @Override // androidx.compose.ui.text.style.m
        /* renamed from: a */
        public final long getF42633b() {
            T.f39320b.getClass();
            return T.f39330l;
        }

        @Override // androidx.compose.ui.text.style.m
        @Y61.l
        public final J c() {
            return null;
        }

        @Override // androidx.compose.ui.text.style.m
        /* renamed from: getAlpha */
        public final float getF42632c() {
            return Float.NaN;
        }
    }

    /* compiled from: TextForegroundStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Float> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Float invoke() {
            return Float.valueOf(m.this.getF42632c());
        }
    }

    /* compiled from: TextForegroundStyle.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/text/style/m;", "invoke", "()Landroidx/compose/ui/text/style/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<m> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final m invoke() {
            return m.this;
        }
    }

    /* renamed from: a */
    long getF42633b();

    @Y61.k
    default m b(@Y61.k m mVar) {
        boolean z12 = mVar instanceof androidx.compose.ui.text.style.c;
        if (!z12 || !(this instanceof androidx.compose.ui.text.style.c)) {
            return (!z12 || (this instanceof androidx.compose.ui.text.style.c)) ? (z12 || !(this instanceof androidx.compose.ui.text.style.c)) ? mVar.d(new d()) : this : mVar;
        }
        d1 d1Var = ((androidx.compose.ui.text.style.c) mVar).f42631b;
        float fFloatValue = ((androidx.compose.ui.text.style.c) mVar).f42632c;
        c cVar = new c();
        if (Float.isNaN(fFloatValue)) {
            fFloatValue = ((Number) cVar.invoke()).floatValue();
        }
        return new androidx.compose.ui.text.style.c(d1Var, fFloatValue);
    }

    @Y61.l
    J c();

    @Y61.k
    default m d(@Y61.k Y41.a<? extends m> aVar) {
        return !equals(b.f42699b) ? this : aVar.invoke();
    }

    /* renamed from: getAlpha */
    float getF42632c();
}
