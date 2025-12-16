package bb1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.data.source.VkpnsTopicSourceApi", f = "VkpnsTopicSourceApi.kt", i = {}, l = {22}, m = "subscribeToTopic-0E7RQCE", n = {}, s = {})
/* loaded from: classes9.dex */
public final class z extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f57286q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ D f57287r;

    /* renamed from: s, reason: collision with root package name */
    public int f57288s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(D d12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f57287r = d12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f57286q = obj;
        this.f57288s |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objA = this.f57287r.a(null, this);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Z.a(objA);
    }
}
