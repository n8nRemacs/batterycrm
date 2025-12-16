package kb1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.incoming.ClientServiceDataDispatcher", f = "ClientServiceDataDispatcher.kt", i = {0}, l = {42}, m = "sendNewPushMessageToService", n = {"this"}, s = {"L$0"})
/* renamed from: kb1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C42665b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public f f406415q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f406416r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f406417s;

    /* renamed from: t, reason: collision with root package name */
    public int f406418t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42665b(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f406417s = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f406416r = obj;
        this.f406418t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f406417s.a(null, this);
    }
}
