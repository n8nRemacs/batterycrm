package Za1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.data.ipc.TestPushIPCClient$Companion$asTestPushIPCClient$1", f = "TestPushIPCClient.kt", i = {}, l = {113}, m = "registerForPushes-gIAlu-s", n = {}, s = {})
/* loaded from: classes9.dex */
public final class l extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f20241q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f20242r;

    /* renamed from: s, reason: collision with root package name */
    public int f20243s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f20242r = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20241q = obj;
        this.f20243s |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objC = this.f20242r.c(null, this);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : Z.a(objC);
    }
}
