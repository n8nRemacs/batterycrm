package kotlinx.coroutines;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Await.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {0}, l = {47}, m = "joinAll", n = {"$this$forEach$iv"}, s = {"L$0"})
/* renamed from: kotlinx.coroutines.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43133f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object[] f411085q;

    /* renamed from: r, reason: collision with root package name */
    public int f411086r;

    /* renamed from: s, reason: collision with root package name */
    public int f411087s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f411088t;

    /* renamed from: u, reason: collision with root package name */
    public int f411089u;

    public C43133f() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        N0 n02;
        this.f411088t = obj;
        this.f411089u = (this.f411089u | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f411089u;
        if (i12 == 0) {
            C42729a0.b(obj);
            throw null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i13 = this.f411087s;
        int i14 = this.f411086r;
        N0[] n0Arr = (N0[]) this.f411085q;
        C42729a0.b(obj);
        do {
            i14++;
            if (i14 >= i13) {
                return kotlin.G0.f406611a;
            }
            n02 = n0Arr[i14];
            this.f411085q = n0Arr;
            this.f411086r = i14;
            this.f411087s = i13;
            this.f411089u = 1;
        } while (n02.A(this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
