package Za1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.data.ipc.TestPushIPCClient$Companion$asTestAuthIPCClient$1", f = "TestPushIPCClient.kt", i = {}, l = {140}, m = "isUserAuthorized-IoAF18A", n = {}, s = {})
/* loaded from: classes9.dex */
public final class j extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f20236q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k f20237r;

    /* renamed from: s, reason: collision with root package name */
    public int f20238s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f20237r = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f20236q = obj;
        this.f20238s |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objA = this.f20237r.a(this);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Z.a(objA);
    }
}
