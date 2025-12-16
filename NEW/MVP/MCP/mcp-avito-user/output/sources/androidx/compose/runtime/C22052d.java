package androidx.compose.runtime;

import android.os.Looper;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: MonotonicFrameClock.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "androidx/compose/runtime/ActualAndroid_androidKt")
/* renamed from: androidx.compose.runtime.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final /* synthetic */ class C22052d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f38281a = C42727D.c(a.f38282l);

    /* compiled from: MonotonicFrameClock.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/runtime/V0;", "invoke", "()Landroidx/compose/runtime/V0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.runtime.d$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<V0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f38282l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final V0 invoke() {
            return Looper.getMainLooper() != null ? C22064f0.f38396b : C22203y0.f38802b;
        }
    }
}
