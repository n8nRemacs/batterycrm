package Za1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.data.ipc.ArbiterIPCClient", f = "ArbiterIPCClient.kt", i = {}, l = {31}, m = "getMaster-IoAF18A", n = {}, s = {})
/* renamed from: Za1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C19526a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f20221q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f20222r;

    /* renamed from: s, reason: collision with root package name */
    public int f20223s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19526a(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f20222r = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f20221q = obj;
        this.f20223s |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objA = this.f20222r.a(this);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Z.a(objA);
    }
}
