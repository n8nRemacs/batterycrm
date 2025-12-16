package Xa1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.auth.AuthIPCClientImpl", f = "AuthIPCClientImpl.kt", i = {}, l = {35}, m = "getIntermediateToken-IoAF18A", n = {}, s = {})
/* loaded from: classes9.dex */
public final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f18933q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f18934r;

    /* renamed from: s, reason: collision with root package name */
    public int f18935s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f18934r = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
        this.f18933q = obj;
        this.f18935s |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objB = this.f18934r.b(this);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : Z.a(objB);
    }
}
