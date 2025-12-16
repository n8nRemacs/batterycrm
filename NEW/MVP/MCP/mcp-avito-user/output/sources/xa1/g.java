package Xa1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.auth.AuthIPCClientImpl", f = "AuthIPCClientImpl.kt", i = {}, l = {48}, m = "isUserAuthorized-IoAF18A", n = {}, s = {})
/* loaded from: classes9.dex */
public final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f18940q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f18941r;

    /* renamed from: s, reason: collision with root package name */
    public int f18942s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f18941r = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
        this.f18940q = obj;
        this.f18942s |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objA = this.f18941r.a(this);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Z.a(objA);
    }
}
