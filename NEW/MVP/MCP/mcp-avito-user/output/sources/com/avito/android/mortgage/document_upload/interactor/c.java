package com.avito.android.mortgage.document_upload.interactor;

import Y41.p;
import android.net.Uri;
import com.avito.android.error.z;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import d00.C39479c;
import d00.d;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.internal.C43238h;
import okhttp3.MultipartBody;
import zZ.C50528b;
import zZ.InterfaceC50529c;

/* compiled from: FileUploaderInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Ld00/d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.document_upload.interactor.FileUploaderInteractor$uploadFile$1", f = "FileUploaderInteractor.kt", i = {0}, l = {58, 59, 60}, m = "invokeSuspend", n = {"$this$channelFlow"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements p<I0<? super d00.d>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f199215q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f199216r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C39479c f199217s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f199218t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f199219u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f199220v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f199221w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f199222x;

    /* compiled from: FileUploaderInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LzZ/c;", "uploadState", "Lkotlin/G0;", "invoke", "(LzZ/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<InterfaceC50529c, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C43238h f199223l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ I0<d00.d> f199224m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C43238h c43238h, I0 i02) {
            super(1);
            this.f199223l = c43238h;
            this.f199224m = i02;
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC50529c interfaceC50529c) {
            InterfaceC50529c interfaceC50529c2 = interfaceC50529c;
            boolean z12 = interfaceC50529c2 instanceof InterfaceC50529c.C12957c;
            C43238h c43238h = this.f199223l;
            I0<d00.d> i02 = this.f199224m;
            if (z12) {
                C43259k.d(c43238h, null, null, new com.avito.android.mortgage.document_upload.interactor.a(i02, interfaceC50529c2, null), 3);
            } else if (interfaceC50529c2 instanceof InterfaceC50529c.a) {
                C43259k.d(c43238h, null, null, new b(i02, interfaceC50529c2, null), 3);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C39479c c39479c, d dVar, String str, String str2, String str3, String str4, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f199217s = c39479c;
        this.f199218t = dVar;
        this.f199219u = str;
        this.f199220v = str2;
        this.f199221w = str3;
        this.f199222x = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f199217s, this.f199218t, this.f199219u, this.f199220v, this.f199221w, this.f199222x, continuation);
        cVar.f199216r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super d00.d> i02, Continuation<? super G0> continuation) {
        return ((c) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        I0 i02;
        Object objN;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f199215q;
        if (i12 == 0) {
            C42729a0.b(obj);
            i02 = (I0) this.f199216r;
            C43238h c43238hA = U.a(getF411447c());
            C39479c c39479c = this.f199217s;
            Uri uri = c39479c.f393608e;
            d dVar = this.f199218t;
            MultipartBody.Part partCreateFormData = MultipartBody.Part.INSTANCE.createFormData("file", c39479c.f393605b, new C50528b(uri, dVar.f199226b, 0, null, new a(c43238hA, i02), 12, null));
            IZ.a aVar = dVar.f199225a.get();
            this.f199216r = i02;
            this.f199215q = 1;
            objN = aVar.n(this.f199219u, this.f199220v, this.f199221w, this.f199222x, partCreateFormData, this);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            I0 i03 = (I0) this.f199216r;
            C42729a0.b(obj);
            i02 = i03;
            objN = obj;
        }
        TypedResult typedResult = (TypedResult) objN;
        if (typedResult instanceof TypedResult.Success) {
            d.b bVar = new d.b(((JZ.h) ((TypedResult.Success) typedResult).getResult()).getFile());
            this.f199216r = null;
            this.f199215q = 2;
            if (i02.send(bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            d.a aVar2 = new d.a(z.n(C35936s.a(error.getError(), error.getCause())));
            this.f199216r = null;
            this.f199215q = 3;
            if (i02.send(aVar2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
