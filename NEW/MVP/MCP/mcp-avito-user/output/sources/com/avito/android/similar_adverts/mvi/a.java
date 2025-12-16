package com.avito.android.similar_adverts.mvi;

import Ow0.InterfaceC14743a;
import Ow0.b;
import Y41.p;
import com.avito.android.remote.model.section.SectionTypeItem;
import com.avito.android.section.SectionItemConverter;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;

/* compiled from: SimilarAdvertsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LOw0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.similar_adverts.mvi.SimilarAdvertsActor$process$1", f = "SimilarAdvertsActor.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super Ow0.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f283938q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f283939r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14743a f283940s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f283941t;

    /* compiled from: SimilarAdvertsActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/serp/adapter/PersistableSpannedItem;", "it", "Lkotlin/G0;", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.similar_adverts.mvi.a$a, reason: collision with other inner class name */
    public static final class C8470a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<Ow0.b> f283942b;

        /* JADX WARN: Multi-variable type inference failed */
        public C8470a(InterfaceC43172j<? super Ow0.b> interfaceC43172j) {
            this.f283942b = interfaceC43172j;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            Object objEmit = this.f283942b.emit(new b.c(new UV0.c((List) obj)), continuation);
            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC14743a interfaceC14743a, b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f283940s = interfaceC14743a;
        this.f283941t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f283940s, this.f283941t, continuation);
        aVar.f283939r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Ow0.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f283938q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f283939r;
            InterfaceC14743a.C0819a c0819a = (InterfaceC14743a.C0819a) this.f283940s;
            SectionTypeItem sectionTypeItem = c0819a.f12723a;
            if (sectionTypeItem != null) {
                b bVar = this.f283941t;
                InterfaceC43160i interfaceC43160iA = y.a(bVar.f283944b.c(sectionTypeItem, new SectionItemConverter.Params(c0819a.f12724b, bVar.f283946d, true, false, false, false, null, null, false, null, false, false, 3832, null)).F());
                C8470a c8470a = new C8470a(interfaceC43172j);
                this.f283938q = 1;
                if (((AbstractC43168f) interfaceC43160iA).collect(c8470a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                C42784z0 c42784z0 = C42784z0.f406748b;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
