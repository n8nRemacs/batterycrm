package androidx.datastore.core;

import androidx.datastore.core.o;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SingleProcessDataStore.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 0, 1, 1, 1, 2}, l = {322, 348, 505}, m = "readAndInit", n = {"updateLock", "initData", "updateLock", "initData", "initializationComplete", "$this$withLock_u24default$iv"}, s = {"L$1", "L$2", "L$1", "L$2", "L$3", "L$3"})
/* loaded from: classes.dex */
final class q extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public o f45474q;

    /* renamed from: r, reason: collision with root package name */
    public Object f45475r;

    /* renamed from: s, reason: collision with root package name */
    public Serializable f45476s;

    /* renamed from: t, reason: collision with root package name */
    public Object f45477t;

    /* renamed from: u, reason: collision with root package name */
    public s f45478u;

    /* renamed from: v, reason: collision with root package name */
    public Iterator f45479v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f45480w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o<Object> f45481x;

    /* renamed from: y, reason: collision with root package name */
    public int f45482y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f45481x = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f45480w = obj;
        this.f45482y |= BeduinInputModel.MIN_TEXT_VERSION;
        o.a aVar = o.f45433k;
        return this.f45481x.d(this);
    }
}
