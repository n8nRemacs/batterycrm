package kotlinx.coroutines.selects;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Select.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {0}, l = {438, 441}, m = "doSelectSuspend", n = {"this"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class p extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public o f412229q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f412230r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o<Object> f412231s;

    /* renamed from: t, reason: collision with root package name */
    public int f412232t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f412231s = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f412230r = obj;
        this.f412232t |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o.f412214g;
        return this.f412231s.h(this);
    }
}
