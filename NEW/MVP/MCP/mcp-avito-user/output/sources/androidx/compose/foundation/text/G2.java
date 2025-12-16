package androidx.compose.foundation.text;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.I3;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: TextFieldScroll.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/G2;", "Landroidx/compose/foundation/gestures/U1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class G2 implements androidx.compose.foundation.gestures.U1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.gestures.U1 f30270a;

    /* renamed from: b, reason: collision with root package name */
    public final I3 f30271b;

    /* renamed from: c, reason: collision with root package name */
    public final I3 f30272c;

    /* compiled from: TextFieldScroll.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ J2 f30273l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(J2 j22) {
            super(0);
            this.f30273l = j22;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(((C22040c3) this.f30273l.f30371a).f() > 0.0f);
        }
    }

    /* compiled from: TextFieldScroll.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ J2 f30274l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(J2 j22) {
            super(0);
            this.f30274l = j22;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            J2 j22 = this.f30274l;
            return Boolean.valueOf(((C22040c3) j22.f30371a).f() < ((C22040c3) j22.f30372b).f());
        }
    }

    public G2(androidx.compose.foundation.gestures.U1 u12, J2 j22) {
        this.f30270a = u12;
        this.f30271b = C22126m3.d(new b(j22));
        this.f30272c = C22126m3.d(new a(j22));
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final boolean a() {
        return this.f30270a.a();
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final boolean b() {
        return ((Boolean) this.f30271b.getF42167b()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final float c(float f12) {
        return this.f30270a.c(f12);
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final boolean d() {
        return ((Boolean) this.f30272c.getF42167b()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final Object e(MutatePriority mutatePriority, Y41.p<? super androidx.compose.foundation.gestures.G1, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, Continuation<? super kotlin.G0> continuation) {
        return this.f30270a.e(mutatePriority, pVar, continuation);
    }
}
