package androidx.datastore.core;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SingleProcessDataStore.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {1, 1}, l = {276, 281, 284}, m = "handleUpdate", n = {"update", "$this$handleUpdate_u24lambda_u2d0"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
final class p extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f45468q;

    /* renamed from: r, reason: collision with root package name */
    public o f45469r;

    /* renamed from: s, reason: collision with root package name */
    public Object f45470s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f45471t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ o<Object> f45472u;

    /* renamed from: v, reason: collision with root package name */
    public int f45473v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f45472u = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f45471t = obj;
        this.f45473v |= BeduinInputModel.MIN_TEXT_VERSION;
        return o.b(this.f45472u, null, this);
    }
}
