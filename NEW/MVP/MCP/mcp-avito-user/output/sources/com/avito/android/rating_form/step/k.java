package com.avito.android.rating_form.step;

import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.step.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.H0;
import kotlin.collections.J0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: RatingFormFileInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating_form.step.RatingFormFileInteractor$updateList$2", f = "RatingFormFileInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class k extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ e f249515q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z f249516r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f249517s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ FieldIdentifier f249518t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(FieldIdentifier fieldIdentifier, e eVar, f fVar, z zVar, Continuation continuation) {
        super(2, continuation);
        this.f249515q = eVar;
        this.f249516r = zVar;
        this.f249517s = fVar;
        this.f249518t = fieldIdentifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new k(this.f249518t, this.f249515q, this.f249517s, this.f249516r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((k) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object next;
        int i12;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        e eVar = this.f249515q;
        e eVar2 = new e(eVar.f249467a, eVar.f249468b, eVar.f249469c, eVar.f249470d, this.f249516r);
        f fVar = this.f249517s;
        LinkedHashMap linkedHashMap = new LinkedHashMap(fVar.f249480h.getValue());
        FieldIdentifier fieldIdentifier = this.f249518t;
        Collection collection = (List) linkedHashMap.get(fieldIdentifier);
        if (collection == null) {
            collection = C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((e) next).f249467a == eVar2.f249467a) {
                break;
            }
        }
        if (((e) next) != null) {
            arrayList.replaceAll(new j(eVar2, 0));
        } else {
            Boxing.boxBoolean(arrayList.add(eVar2));
        }
        linkedHashMap.put(fieldIdentifier, arrayList);
        fVar.f249480h.setValue(linkedHashMap);
        ArrayList arrayList2 = fVar.f249481i;
        Iterator it2 = C42745f0.S0(arrayList2).iterator();
        while (true) {
            J0 j02 = (J0) it2;
            if (!j02.f406646b.hasNext()) {
                i12 = -1;
                break;
            }
            H0 h02 = (H0) j02.next();
            if (((f.b) h02.f406644b).f249483b.f249467a == eVar.f249467a) {
                i12 = h02.f406643a;
                break;
            }
        }
        if (i12 != -1) {
            arrayList2.set(i12, new f.b(((f.b) arrayList2.get(i12)).f249482a, eVar2));
        }
        return G0.f406611a;
    }
}
