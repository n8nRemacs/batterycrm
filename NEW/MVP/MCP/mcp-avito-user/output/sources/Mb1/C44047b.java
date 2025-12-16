package mb1;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.push.PushTokenRepositoryImpl", f = "PushTokenRepositoryImpl.kt", i = {}, l = {18}, m = "deletePushToken-gIAlu-s", n = {}, s = {})
/* renamed from: mb1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C44047b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f414607q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f414608r;

    /* renamed from: s, reason: collision with root package name */
    public int f414609s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44047b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f414608r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f414607q = obj;
        this.f414609s |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objC = this.f414608r.c(null, this);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : Z.a(objC);
    }
}
