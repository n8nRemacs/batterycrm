package androidx.compose.foundation.gestures;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: MouseWheelScrollable.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", i = {0, 0, 0, 0}, l = {244, 295}, m = "dispatchMouseWheelScroll", n = {"this", "$this$dispatchMouseWheelScroll", "targetValue", "speed"}, s = {"L$0", "L$1", "L$2", "F$0"})
/* renamed from: androidx.compose.foundation.gestures.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20468j1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C20456g1 f27779q;

    /* renamed from: r, reason: collision with root package name */
    public C20433a2 f27780r;

    /* renamed from: s, reason: collision with root package name */
    public l0.e f27781s;

    /* renamed from: t, reason: collision with root package name */
    public float f27782t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f27783u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C20456g1 f27784v;

    /* renamed from: w, reason: collision with root package name */
    public int f27785w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20468j1(C20456g1 c20456g1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27784v = c20456g1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27783u = obj;
        this.f27785w |= BeduinInputModel.MIN_TEXT_VERSION;
        return C20456g1.b(this.f27784v, null, null, 0.0f, 0.0f, this);
    }
}
