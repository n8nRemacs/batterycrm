package androidx.datastore.core;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: SingleProcessDataStore.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", f = "SingleProcessDataStore.kt", i = {0, 0, 1, 2, 2}, l = {503, 337, 339}, m = "updateData", n = {"transform", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "newData"}, s = {"L$0", "L$1", "L$0", "L$0", "L$2"})
/* loaded from: classes.dex */
final class r extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f45483q;

    /* renamed from: r, reason: collision with root package name */
    public Object f45484r;

    /* renamed from: s, reason: collision with root package name */
    public Object f45485s;

    /* renamed from: t, reason: collision with root package name */
    public l0.h f45486t;

    /* renamed from: u, reason: collision with root package name */
    public o f45487u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f45488v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f45489w;

    /* renamed from: x, reason: collision with root package name */
    public int f45490x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f45489w = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f45488v = obj;
        this.f45490x |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f45489w.a(null, this);
    }
}
