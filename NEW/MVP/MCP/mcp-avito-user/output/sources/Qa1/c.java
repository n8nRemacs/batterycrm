package Qa1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.SubscribeComponent", f = "SubscribeComponent.kt", i = {0}, l = {103}, m = "getToken", n = {"this"}, s = {"L$0"})
/* loaded from: classes9.dex */
public final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f13778q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f13779r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f13780s;

    /* renamed from: t, reason: collision with root package name */
    public int f13781t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f13780s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f13779r = obj;
        this.f13781t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f13780s.b(this);
    }
}
