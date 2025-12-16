package Qa1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.SubscribeComponent", f = "SubscribeComponent.kt", i = {0, 0, 1}, l = {137, 148}, m = "registerPushToken-Du7M8sQ", n = {"this", "pushToken", "this"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes9.dex */
public final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f13791q;

    /* renamed from: r, reason: collision with root package name */
    public Object f13792r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f13793s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f13794t;

    /* renamed from: u, reason: collision with root package name */
    public int f13795u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f13794t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f13793s = obj;
        this.f13795u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f13794t.d(null, this);
    }
}
