package jb1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.domain.usecase.RegisterPushTokenUseCase", f = "RegisterPushTokenUseCase.kt", i = {}, l = {20}, m = "invoke-iRXhn8M", n = {}, s = {})
/* loaded from: classes9.dex */
public final class j extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f405697q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f405698r;

    /* renamed from: s, reason: collision with root package name */
    public int f405699s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f405698r = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f405697q = obj;
        this.f405699s |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objA = this.f405698r.a(null, this);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Z.a(objA);
    }
}
