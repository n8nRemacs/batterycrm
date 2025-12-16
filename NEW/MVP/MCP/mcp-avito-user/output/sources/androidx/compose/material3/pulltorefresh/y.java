package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.C20273d1;
import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.InterfaceC22192v1;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PullToRefresh.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl", f = "PullToRefresh.kt", i = {0, 0}, l = {364}, m = "onRelease", n = {"this", "velocity"}, s = {"L$0", "F$0"})
/* loaded from: classes.dex */
final class y extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public v f37116q;

    /* renamed from: r, reason: collision with root package name */
    public float f37117r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f37118s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v f37119t;

    /* renamed from: u, reason: collision with root package name */
    public int f37120u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(v vVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f37119t = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        y yVar;
        float f12;
        this.f37118s = obj;
        this.f37120u |= BeduinInputModel.MIN_TEXT_VERSION;
        v vVar = this.f37119t;
        vVar.getClass();
        int i12 = this.f37120u;
        if ((i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0) {
            this.f37120u = i12 - BeduinInputModel.MIN_TEXT_VERSION;
            yVar = this;
        } else {
            yVar = new y(vVar, this);
        }
        Object obj2 = yVar.f37118s;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = yVar.f37120u;
        if (i13 == 0) {
            C42729a0.b(obj2);
            if (vVar.d()) {
                return Boxing.boxFloat(0.0f);
            }
            float f13 = ((C22040c3) vVar.f37109a).f() * 0.5f;
            InterfaceC22192v1 interfaceC22192v1 = vVar.f37110b;
            if (f13 > 0.0f) {
                ((C22082i3) vVar.f37111c).setValue(Boolean.TRUE);
                ((C22040c3) interfaceC22192v1).S6(0.0f);
            } else {
                yVar.f37116q = vVar;
                yVar.f37117r = 0.0f;
                yVar.f37120u = 1;
                Object objC = C20273d1.c(((C22040c3) interfaceC22192v1).f(), 0.0f, null, new w(vVar), yVar, 12);
                if (objC != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objC = G0.f406611a;
                }
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            f12 = 0.0f;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            float f14 = yVar.f37117r;
            v vVar2 = yVar.f37116q;
            C42729a0.b(obj2);
            f12 = f14;
            vVar = vVar2;
        }
        if (((C22040c3) vVar.f37109a).f() == 0.0f || f12 < 0.0f) {
            f12 = 0.0f;
        }
        ((C22040c3) vVar.f37109a).S6(0.0f);
        return Boxing.boxFloat(f12);
    }
}
