package bb1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.data.source.RegisterPushTokenDataSource", f = "RegisterPushTokenDataSource.kt", i = {0}, l = {10, 11}, m = "registerForPushes-gIAlu-s", n = {"token"}, s = {"L$0"})
/* loaded from: classes9.dex */
public final class w extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public String f57280q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f57281r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x f57282s;

    /* renamed from: t, reason: collision with root package name */
    public int f57283t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f57282s = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f57281r = obj;
        this.f57283t |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objA = this.f57282s.a(null, this);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Z.a(objA);
    }
}
