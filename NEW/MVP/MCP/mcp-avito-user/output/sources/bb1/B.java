package bb1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.data.source.VkpnsTopicSourceApi", f = "VkpnsTopicSourceApi.kt", i = {}, l = {43}, m = "unsubscribeFromTopic-0E7RQCE", n = {}, s = {})
/* loaded from: classes9.dex */
public final class B extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f57201q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ D f57202r;

    /* renamed from: s, reason: collision with root package name */
    public int f57203s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(D d12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f57202r = d12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f57201q = obj;
        this.f57203s |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objB = this.f57202r.b(null, null, this);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : Z.a(objB);
    }
}
