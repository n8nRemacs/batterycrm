package kb1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import h21.C40764a;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.incoming.ValidateCallingHostInteractor", f = "ValidateCallingHostInteractor.kt", i = {0, 0}, l = {17}, m = "invoke-gIAlu-s", n = {"callingAppIds", "$this$invoke_gIAlu_s_u24lambda_u243"}, s = {"L$0", "L$1"})
/* loaded from: classes9.dex */
public final class t extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C40764a f406499q;

    /* renamed from: r, reason: collision with root package name */
    public u f406500r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f406501s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u f406502t;

    /* renamed from: u, reason: collision with root package name */
    public int f406503u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f406502t = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f406501s = obj;
        this.f406503u |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objA = this.f406502t.a(null, this);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Z.a(objA);
    }
}
