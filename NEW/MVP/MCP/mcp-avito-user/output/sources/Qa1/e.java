package Qa1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.SubscribeComponent", f = "SubscribeComponent.kt", i = {0}, l = {91, 95, 98}, m = "registerForPushes", n = {"this"}, s = {"L$0"})
/* loaded from: classes9.dex */
public final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f13787q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f13788r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f13789s;

    /* renamed from: t, reason: collision with root package name */
    public int f13790t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f13789s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f13788r = obj;
        this.f13790t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f13789s.e(this);
    }
}
