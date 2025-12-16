package jb1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.domain.usecase.UnsubscribeFromTopicUseCase", f = "UnsubscribeFromTopicUseCase.kt", i = {}, l = {8}, m = "invoke-gIAlu-s", n = {}, s = {})
/* loaded from: classes9.dex */
public final class s extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f405726q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t f405727r;

    /* renamed from: s, reason: collision with root package name */
    public int f405728s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f405727r = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f405726q = obj;
        this.f405728s |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objA = this.f405727r.a(null, this);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Z.a(objA);
    }
}
