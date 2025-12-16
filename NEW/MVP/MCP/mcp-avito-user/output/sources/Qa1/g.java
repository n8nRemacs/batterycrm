package Qa1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.SubscribeComponent", f = "SubscribeComponent.kt", i = {0, 1, 2, 3, 3, 4, 5, 5}, l = {44, 45, 46, 55, 56, 66}, m = "requestFullReSubscription", n = {"this", "this", "this", "this", "authTokenResult", "this", "this", "pushToken"}, s = {"L$0", "L$0", "L$0", "L$0", "L$1", "L$0", "L$0", "L$1"})
/* loaded from: classes9.dex */
public final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f13796q;

    /* renamed from: r, reason: collision with root package name */
    public Object f13797r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f13798s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f13799t;

    /* renamed from: u, reason: collision with root package name */
    public int f13800u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f13799t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f13798s = obj;
        this.f13800u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f13799t.f(null, this);
    }
}
