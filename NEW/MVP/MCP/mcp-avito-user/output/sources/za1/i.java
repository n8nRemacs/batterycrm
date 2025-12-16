package Za1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.data.ipc.TestPushIPCClient$Companion$asTestAuthIPCClient$1", f = "TestPushIPCClient.kt", i = {}, l = {136}, m = "getIntermediateToken-IoAF18A", n = {}, s = {})
/* loaded from: classes9.dex */
public final class i extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f20233q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k f20234r;

    /* renamed from: s, reason: collision with root package name */
    public int f20235s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f20234r = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f20233q = obj;
        this.f20235s |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objB = this.f20234r.b(this);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : Z.a(objB);
    }
}
