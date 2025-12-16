package Qa1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.SubscribeComponent", f = "SubscribeComponent.kt", i = {0, 0}, l = {132, 133}, m = "onPushTokenRefreshed-Du7M8sQ", n = {"this", "pushToken"}, s = {"L$0", "L$1"})
/* loaded from: classes9.dex */
public final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f13782q;

    /* renamed from: r, reason: collision with root package name */
    public String f13783r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f13784s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f13785t;

    /* renamed from: u, reason: collision with root package name */
    public int f13786u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f13785t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f13784s = obj;
        this.f13786u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f13785t.a(null, this);
    }
}
