package androidx.datastore.core;

import androidx.datastore.core.o;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SingleProcessDataStore.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 0, 0}, l = {402, 410}, m = "transformAndWrite", n = {"this", "curDataAndHash", "curData"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes.dex */
final class x extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public o f45513q;

    /* renamed from: r, reason: collision with root package name */
    public Object f45514r;

    /* renamed from: s, reason: collision with root package name */
    public Object f45515s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f45516t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ o<Object> f45517u;

    /* renamed from: v, reason: collision with root package name */
    public int f45518v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f45517u = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f45516t = obj;
        this.f45518v |= BeduinInputModel.MIN_TEXT_VERSION;
        o.a aVar = o.f45433k;
        return this.f45517u.i(null, null, this);
    }
}
