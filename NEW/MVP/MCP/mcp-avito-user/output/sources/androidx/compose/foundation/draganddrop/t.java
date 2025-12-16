package androidx.compose.foundation.draganddrop;

import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LegacyDragAndDropSourceWithDefaultPainter.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/draganddrop/j;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/draganddrop/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter$2", f = "LegacyDragAndDropSourceWithDefaultPainter.android.kt", i = {}, l = {UpdateStatusCode.DialogButton.CONFIRM}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class t extends SuspendLambda implements Y41.p<j, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f27117q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27118r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v f27119s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, Continuation<? super t> continuation) {
        super(2, continuation);
        this.f27119s = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        t tVar = new t(this.f27119s, continuation);
        tVar.f27118r = obj;
        return tVar;
    }

    @Override // Y41.p
    public final Object invoke(j jVar, Continuation<? super G0> continuation) {
        return ((t) create(jVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f27117q;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return G0.f406611a;
        }
        C42729a0.b(obj);
        this.f27117q = 1;
        throw null;
    }
}
