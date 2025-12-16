package mb1;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okhttp3.Response;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.push.VkpnsPusherApi", f = "VkpnsPusherApi.kt", i = {1}, l = {UpdateStatusCode.DialogButton.CONFIRM, 102}, m = "deletePushToken-gIAlu-s", n = {"response$iv"}, s = {"L$0"})
/* loaded from: classes9.dex */
public final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Response f414620q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f414621r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f414622s;

    /* renamed from: t, reason: collision with root package name */
    public int f414623t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f414622s = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f414621r = obj;
        this.f414623t |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objB = this.f414622s.b(null, this);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : Z.a(objB);
    }
}
