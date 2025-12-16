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

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.push.VkpnsPusherApi", f = "VkpnsPusherApi.kt", i = {0, 1, 1}, l = {UpdateStatusCode.DialogButton.CONFIRM, 102}, m = "getNewPushToken-0E7RQCE", n = {"this", "this", "response$iv"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes9.dex */
public final class h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public j f414625q;

    /* renamed from: r, reason: collision with root package name */
    public Response f414626r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f414627s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f414628t;

    /* renamed from: u, reason: collision with root package name */
    public int f414629u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f414628t = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f414627s = obj;
        this.f414629u |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objA = this.f414628t.a(null, this);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Z.a(objA);
    }
}
