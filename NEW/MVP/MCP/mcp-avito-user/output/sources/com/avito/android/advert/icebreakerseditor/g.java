package com.avito.android.advert.icebreakerseditor;

import Zf.InterfaceC19551a;
import ag.C19885a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import b4.InterfaceC25406b;
import bg.C25646a;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import com.huawei.hms.adapter.internal.AvailableCode;
import eg.C40102a;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: IcebreakersEditorInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/icebreakerseditor/g;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19551a f71209a;

    /* compiled from: IcebreakersEditorInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lb4/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.icebreakerseditor.IcebreakersEditorInteractor$createIcebreaker$1", f = "IcebreakersEditorInteractor.kt", i = {0}, l = {40, 47, 57}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC25406b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f71210q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f71211r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f71213t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f71214u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f71215v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f71216w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, String str4, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f71213t = str;
            this.f71214u = str2;
            this.f71215v = str3;
            this.f71216w = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = g.this.new a(this.f71213t, this.f71214u, this.f71215v, this.f71216w, continuation);
            aVar.f71211r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC25406b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws NumberFormatException {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f71210q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f71211r;
                InterfaceC19551a interfaceC19551a = g.this.f71209a;
                long j12 = Long.parseLong(this.f71213t);
                String str = this.f71214u;
                Long lBoxLong = str != null ? Boxing.boxLong(Long.parseLong(str)) : null;
                this.f71211r = interfaceC43172j;
                this.f71210q = 1;
                obj = interfaceC19551a.b(j12, lBoxLong, this.f71215v, this.f71216w, this);
                if (obj == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f71211r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                C19885a c19885a = (C19885a) ((TypedResult.Success) typedResult).getResult();
                long id2 = c19885a.getId();
                String messageText = c19885a.getMessageText();
                String uri = c19885a.getUri();
                InterfaceC25406b.e eVar = new InterfaceC25406b.e(id2, messageText, c19885a.getPreviewText(), uri != null ? Uri.parse(uri) : null);
                this.f71211r = null;
                this.f71210q = 2;
                if (interfaceC43172j.emit(eVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                C35936s.a(error.getError(), error.getCause());
                InterfaceC25406b.j jVar = InterfaceC25406b.j.f56887a;
                this.f71211r = null;
                this.f71210q = 3;
                if (interfaceC43172j.emit(jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: IcebreakersEditorInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lb4/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.icebreakerseditor.IcebreakersEditorInteractor$deleteIcebreaker$1", f = "IcebreakersEditorInteractor.kt", i = {0}, l = {19, AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC25406b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f71217q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f71218r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f71220t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f71221u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, long j12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f71220t = str;
            this.f71221u = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = g.this.new b(this.f71220t, this.f71221u, continuation);
            bVar.f71218r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC25406b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws NumberFormatException {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f71217q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f71218r;
                InterfaceC19551a interfaceC19551a = g.this.f71209a;
                long j12 = Long.parseLong(this.f71220t);
                this.f71218r = interfaceC43172j;
                this.f71217q = 1;
                obj = interfaceC19551a.d(j12, this.f71221u, this);
                if (obj == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f71218r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                if (((C25646a) ((TypedResult.Success) typedResult).getResult()).getDeleted()) {
                    InterfaceC25406b.f fVar = new InterfaceC25406b.f(this.f71221u);
                    this.f71218r = null;
                    this.f71217q = 2;
                    if (interfaceC43172j.emit(fVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                C35936s.a(error.getError(), error.getCause());
                InterfaceC25406b.j jVar = InterfaceC25406b.j.f56887a;
                this.f71218r = null;
                this.f71217q = 3;
                if (interfaceC43172j.emit(jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: IcebreakersEditorInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lb4/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.icebreakerseditor.IcebreakersEditorInteractor$updateIcebreaker$1", f = "IcebreakersEditorInteractor.kt", i = {0}, l = {69, 77, 88}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC25406b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f71222q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f71223r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f71225t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f71226u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ long f71227v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f71228w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f71229x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, long j12, String str3, String str4, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f71225t = str;
            this.f71226u = str2;
            this.f71227v = j12;
            this.f71228w = str3;
            this.f71229x = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = g.this.new c(this.f71225t, this.f71226u, this.f71227v, this.f71228w, this.f71229x, continuation);
            cVar.f71223r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC25406b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws NumberFormatException {
            InterfaceC43172j interfaceC43172j;
            Object objC;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f71222q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f71223r;
                InterfaceC19551a interfaceC19551a = g.this.f71209a;
                long j12 = Long.parseLong(this.f71225t);
                String str = this.f71226u;
                Long lBoxLong = str != null ? Boxing.boxLong(Long.parseLong(str)) : null;
                this.f71223r = interfaceC43172j;
                this.f71222q = 1;
                objC = interfaceC19551a.c(j12, this.f71227v, lBoxLong, this.f71228w, this.f71229x, this);
                if (objC == coroutine_suspended) {
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
                InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f71223r;
                C42729a0.b(obj);
                interfaceC43172j = interfaceC43172j2;
                objC = obj;
            }
            TypedResult typedResult = (TypedResult) objC;
            if (typedResult instanceof TypedResult.Success) {
                C40102a c40102a = (C40102a) ((TypedResult.Success) typedResult).getResult();
                long id2 = c40102a.getId();
                String messageText = c40102a.getMessageText();
                String uri = c40102a.getUri();
                InterfaceC25406b.g gVar = new InterfaceC25406b.g(this.f71227v, id2, messageText, c40102a.getPreviewText(), uri != null ? Uri.parse(uri) : null);
                this.f71223r = null;
                this.f71222q = 2;
                if (interfaceC43172j.emit(gVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                C35936s.a(error.getError(), error.getCause());
                InterfaceC25406b.j jVar = InterfaceC25406b.j.f56887a;
                this.f71223r = null;
                this.f71222q = 3;
                if (interfaceC43172j.emit(jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public g(@Y61.k InterfaceC19551a interfaceC19551a) {
        this.f71209a = interfaceC19551a;
    }

    @Y61.k
    public final InterfaceC43160i<InterfaceC25406b> a(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4) {
        return C43175k.G(new a(str, str2, str3, str4, null));
    }

    @Y61.k
    public final InterfaceC43160i b(long j12, @Y61.k String str) {
        return C43175k.G(new b(str, j12, null));
    }

    @Y61.k
    public final InterfaceC43160i<InterfaceC25406b> c(@Y61.k String str, @Y61.l String str2, long j12, @Y61.k String str3, @Y61.l String str4) {
        return C43175k.G(new c(str, str2, j12, str3, str4, null));
    }
}
