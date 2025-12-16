package androidx.datastore.core;

import androidx.datastore.core.o;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SingleProcessDataStore.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 1, 2, 2}, l = {359, 362, 365}, m = "readDataOrHandleCorruption", n = {"this", "ex", "ex", "newData"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes.dex */
final class w extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f45508q;

    /* renamed from: r, reason: collision with root package name */
    public Object f45509r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f45510s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o<Object> f45511t;

    /* renamed from: u, reason: collision with root package name */
    public int f45512u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f45511t = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f45510s = obj;
        this.f45512u |= BeduinInputModel.MIN_TEXT_VERSION;
        o.a aVar = o.f45433k;
        return this.f45511t.h(this);
    }
}
