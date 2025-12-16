package androidx.work.impl.utils;

import android.content.Context;
import android.os.Build;
import androidx.work.InterfaceC23639x;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.C43259k;

/* compiled from: WorkForeground.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f55954a = 0;

    static {
        androidx.work.G.b("WorkForegroundRunnable");
    }

    @Y61.l
    public static final Object a(@Y61.k Context context, @Y61.k androidx.work.impl.model.H h12, @Y61.k androidx.work.F f12, @Y61.k InterfaceC23639x interfaceC23639x, @Y61.k androidx.work.impl.utils.taskexecutor.c cVar, @Y61.k Continuation continuation) {
        if (!h12.f55811q || Build.VERSION.SDK_INT >= 31) {
            return G0.f406611a;
        }
        Object objG = C43259k.g(A0.b(cVar.f56031d), new L(f12, h12, interfaceC23639x, context, null), continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }
}
