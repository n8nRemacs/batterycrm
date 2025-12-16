package androidx.datastore.core;

import androidx.datastore.core.o;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SingleProcessDataStore.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0}, l = {302}, m = "readAndInitOrPropagateAndThrowFailure", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
final class t extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public o f45495q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f45496r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o<Object> f45497s;

    /* renamed from: t, reason: collision with root package name */
    public int f45498t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f45497s = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f45496r = obj;
        this.f45498t |= BeduinInputModel.MIN_TEXT_VERSION;
        o.a aVar = o.f45433k;
        return this.f45497s.e(this);
    }
}
