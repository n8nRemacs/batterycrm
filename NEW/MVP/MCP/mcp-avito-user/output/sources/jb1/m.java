package jb1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.domain.usecase.SendPushTokenToClientIfNeedUseCase", f = "SendPushTokenToClientIfNeedUseCase.kt", i = {0, 0, 1}, l = {18, 21, 22}, m = "invoke-Du7M8sQ", n = {"this", "pushToken", "this"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes9.dex */
public final class m extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public n f405708q;

    /* renamed from: r, reason: collision with root package name */
    public String f405709r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f405710s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f405711t;

    /* renamed from: u, reason: collision with root package name */
    public int f405712u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f405711t = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f405710s = obj;
        this.f405712u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f405711t.a(null, this);
    }
}
