package kotlinx.coroutines.channels;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BufferedChannel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {}, l = {762}, m = "receiveCatching-JP2dKIU$suspendImpl", n = {}, s = {})
/* renamed from: kotlinx.coroutines.channels.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43116q<E> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f410973q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C43108m<E> f410974r;

    /* renamed from: s, reason: collision with root package name */
    public int f410975s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43116q(C43108m c43108m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f410974r = c43108m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f410973q = obj;
        this.f410975s |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objQ = C43108m.Q(this.f410974r, this);
        return objQ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objQ : B.a(objQ);
    }
}
