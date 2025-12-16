package androidx.view;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.internal.K;
import kotlinx.coroutines.scheduling.c;

/* compiled from: CoroutineLiveData.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", i = {0, 0, 1}, l = {228, 229}, m = "emitSource$lifecycle_livedata_release", n = {"this", SearchParamsConverterKt.SOURCE, "this"}, s = {"L$0", "L$1", "L$0"})
/* renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23049m extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C23051n f46818q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f46819r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C23051n<Object> f46820s;

    /* renamed from: t, reason: collision with root package name */
    public int f46821t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23049m(C23051n c23051n, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46820s = c23051n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        C23049m c23049m;
        this.f46819r = obj;
        this.f46821t |= BeduinInputModel.MIN_TEXT_VERSION;
        C23051n<Object> c23051n = this.f46820s;
        c23051n.getClass();
        int i12 = this.f46821t;
        if ((i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0) {
            this.f46821t = i12 - BeduinInputModel.MIN_TEXT_VERSION;
            c23049m = this;
        } else {
            c23049m = new C23049m(c23051n, this);
        }
        Object objG = c23049m.f46819r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c23049m.f46821t;
        if (i13 == 0) {
            C42729a0.b(objG);
            c23049m.f46818q = c23051n;
            c23049m.f46821t = 1;
            if (c23051n.c(c23049m) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c23051n = c23049m.f46818q;
                C42729a0.b(objG);
                C23063t c23063t = (C23063t) objG;
                c23051n.f46834c = c23063t;
                return c23063t;
            }
            c23051n = c23049m.f46818q;
            C42729a0.b(objG);
        }
        c23049m.f46818q = c23051n;
        c23049m.f46821t = 2;
        c cVar = C43262l0.f411945a;
        objG = C43259k.g(K.f411877a.y(), new C23053o(c23051n, null, null), c23049m);
        if (objG == coroutine_suspended) {
            return coroutine_suspended;
        }
        C23063t c23063t2 = (C23063t) objG;
        c23051n.f46834c = c23063t2;
        return c23063t2;
    }
}
