package androidx.compose.foundation.gestures;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: MouseWheelScrollable.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", i = {0, 0, 0, 0, 0}, l = {227}, m = "dispatchMouseWheelScroll$waitNextScrollDelta", n = {"this$0", "targetScrollDelta", "targetValue", "$this_dispatchMouseWheelScroll", "animationState"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
/* renamed from: androidx.compose.foundation.gestures.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20476l1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C20456g1 f27838q;

    /* renamed from: r, reason: collision with root package name */
    public l0.h f27839r;

    /* renamed from: s, reason: collision with root package name */
    public l0.e f27840s;

    /* renamed from: t, reason: collision with root package name */
    public C20433a2 f27841t;

    /* renamed from: u, reason: collision with root package name */
    public l0.h f27842u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f27843v;

    /* renamed from: w, reason: collision with root package name */
    public int f27844w;

    public C20476l1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27843v = obj;
        this.f27844w |= BeduinInputModel.MIN_TEXT_VERSION;
        return C20456g1.c(null, null, null, null, null, 0L, this);
    }
}
