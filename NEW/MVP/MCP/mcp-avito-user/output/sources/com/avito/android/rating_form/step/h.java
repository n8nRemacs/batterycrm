package com.avito.android.rating_form.step;

import com.avito.android.advert.item.blocks.items_factories.C28081y0;
import com.avito.android.rating_form.FieldIdentifier;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;

/* compiled from: RatingFormFileInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating_form.step.RatingFormFileInteractor$removeFile$2", f = "RatingFormFileInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class h extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ f f249504q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ FieldIdentifier f249505r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f249506s;

    /* compiled from: RatingFormFileInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/rating_form/step/e;", "it", "", "invoke", "(Lcom/avito/android/rating_form/step/e;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<e, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f249507l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(1);
            this.f249507l = eVar;
        }

        @Override // Y41.l
        public final Boolean invoke(e eVar) {
            return Boolean.valueOf(eVar.f249467a == this.f249507l.f249467a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, FieldIdentifier fieldIdentifier, e eVar, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f249504q = fVar;
        this.f249505r = fieldIdentifier;
        this.f249506s = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new h(this.f249504q, this.f249505r, this.f249506s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        f fVar = this.f249504q;
        LinkedHashMap linkedHashMap = new LinkedHashMap(fVar.f249480h.getValue());
        FieldIdentifier fieldIdentifier = this.f249505r;
        List list = (List) linkedHashMap.get(fieldIdentifier);
        if (list == null) {
            return G0.f406611a;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.removeIf(new C28081y0(new a(this.f249506s), 12));
        linkedHashMap.put(fieldIdentifier, arrayList);
        fVar.f249480h.setValue(linkedHashMap);
        return G0.f406611a;
    }
}
