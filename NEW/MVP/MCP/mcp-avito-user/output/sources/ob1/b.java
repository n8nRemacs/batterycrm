package ob1;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.push.ipc.PushIPCClientImpl", f = "PushIPCClientImpl.kt", i = {}, l = {33}, m = "registerForPushes-gIAlu-s", n = {}, s = {})
/* loaded from: classes9.dex */
public final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f419952q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f419953r;

    /* renamed from: s, reason: collision with root package name */
    public int f419954s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f419953r = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f419952q = obj;
        this.f419954s |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objC = this.f419953r.c(null, this);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : Z.a(objC);
    }
}
