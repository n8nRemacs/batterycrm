package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C20310q;
import kotlin.Metadata;

/* compiled from: AnchoredDraggable.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/b;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.gestures.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20434b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C20434b f27562a = new C20434b();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.animation.core.G1 f27563b = C20310q.e(0, 0, null, 7);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<Float, Float> f27564c = a.f27566l;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.animation.core.H<Float> f27565d = androidx.compose.animation.core.J.b();

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "distance", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.b$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Float, Float> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f27566l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Float invoke(Float f12) {
            return Float.valueOf(f12.floatValue() / 2.0f);
        }
    }
}
