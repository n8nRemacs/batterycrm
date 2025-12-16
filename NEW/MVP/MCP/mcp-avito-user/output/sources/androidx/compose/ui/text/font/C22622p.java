package androidx.compose.ui.text.font;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.ui.text.font.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22622p extends SuspendLambda implements Y41.l<Continuation<? super Object>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f42286q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C22624s f42287r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ D f42288s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22622p(C22624s c22624s, D d12, Continuation<? super C22622p> continuation) {
        super(1, continuation);
        this.f42287r = c22624s;
        this.f42288s = d12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Continuation<?> continuation) {
        return new C22622p(this.f42287r, this.f42288s, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super Object> continuation) {
        return ((C22622p) create(continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f42286q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f42286q = 1;
            obj = this.f42287r.d(this.f42288s, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
