package com.avito.android.publish.slots.final_state_suggest;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.f;
import com.avito.android.category_parameters.k;
import com.avito.android.publish.C0;
import com.avito.android.publish.InterfaceC34155z;
import com.avito.android.publish.slots.q;
import com.avito.android.remote.H0;
import com.avito.android.remote.error.f;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.final_state_suggest.FinalStateSuggestResponse;
import com.avito.android.remote.model.category_parameters.slot.final_state_suggest.FinalStateSuggestSlot;
import com.avito.android.remote.model.category_parameters.slot.final_state_suggest.FinalStateSuggestSlotConfig;
import com.avito.android.remote.model.publish.ParamsSuggest;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import l41.g;
import l41.o;

/* compiled from: FinalStateSuggestSlotWrapper.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/final_state_suggest/a;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/final_state_suggest/FinalStateSuggestSlot;", "Lcom/avito/android/publish/slots/q;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends k<FinalStateSuggestSlot> implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final FinalStateSuggestSlot f243893b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final H0 f243894c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34155z f243895d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f243896e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AttributesTreeConverter f243897f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f243898g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final f f243899h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C0 f243900i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f243901j = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> f243902k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public P2<? super FinalStateSuggestResponse> f243903l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f243904m;

    /* compiled from: FinalStateSuggestSlotWrapper.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/category_parameters/slot/final_state_suggest/FinalStateSuggestResponse;", "it", "Lcom/avito/android/util/P2;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.slots.final_state_suggest.a$a, reason: collision with other inner class name */
    public static final class C7308a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final C7308a<T, R> f243905b = new C7308a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                return new P2.b(((TypedResult.Success) typedResult).getResult());
            }
            if (typedResult instanceof TypedResult.Error) {
                return new P2.a(((TypedResult.Error) typedResult).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: FinalStateSuggestSlotWrapper.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/category_parameters/slot/final_state_suggest/FinalStateSuggestResponse;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            CategoryParameters categoryParameters;
            P2<? super FinalStateSuggestResponse> p22 = (P2) obj;
            boolean z12 = p22 instanceof P2.b;
            a aVar = a.this;
            if (z12 && (categoryParameters = aVar.f243900i.f231873k0) != null) {
                FinalStateSuggestResponse finalStateSuggestResponse = (FinalStateSuggestResponse) ((P2.b) p22).f318720a;
                List<ParamsSuggest> params = finalStateSuggestResponse.getParams();
                ArrayList arrayList = new ArrayList(C42745f0.q(params, 10));
                for (ParamsSuggest paramsSuggest : params) {
                    arrayList.add(new CharParameter(paramsSuggest.getId(), paramsSuggest.getId(), false, false, null, null, null, paramsSuggest.getValue(), null, null, null, null, null, null, null, null, null, null, 262000, null));
                }
                List<ParamsSuggest> params2 = finalStateSuggestResponse.getParams();
                ArrayList arrayList2 = new ArrayList(C42745f0.q(params2, 10));
                Iterator<T> it = params2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ParamsSuggest) it.next()).getId());
                }
                CategoryParameters categoryParametersCloneWithNewParameters = categoryParameters.cloneWithNewParameters(arrayList, (String[]) arrayList2.toArray(new String[0]));
                if (categoryParametersCloneWithNewParameters != null) {
                    aVar.f243900i.Le(categoryParametersCloneWithNewParameters);
                }
            }
            aVar.f243903l = p22;
            aVar.f243902k.accept(new f.b(SlotType.FINAL_STATE_SUGGEST, null));
        }
    }

    /* compiled from: FinalStateSuggestSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a aVar = a.this;
            aVar.f243903l = new P2.a(aVar.f243899h.a((Throwable) obj));
            aVar.f243902k.accept(new f.b(SlotType.FINAL_STATE_SUGGEST, null));
        }
    }

    @i31.c
    public a(@InterfaceC41220a @Y61.k FinalStateSuggestSlot finalStateSuggestSlot, @Y61.k H0 h02, @Y61.k InterfaceC34155z interfaceC34155z, @Y61.k com.avito.android.details.a aVar, @Y61.k AttributesTreeConverter attributesTreeConverter, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k C0 c02) {
        this.f243893b = finalStateSuggestSlot;
        this.f243894c = h02;
        this.f243895d = interfaceC34155z;
        this.f243896e = aVar;
        this.f243897f = attributesTreeConverter;
        this.f243898g = interfaceC35745a5;
        this.f243899h = fVar;
        this.f243900i = c02;
        com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f243902k = cVar;
        l();
        this.f243904m = cVar;
    }

    @Override // com.avito.android.publish.slots.q
    @Y61.k
    public final z<com.avito.android.category_parameters.f> a() {
        return this.f243904m;
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
        this.f243903l = null;
        this.f243901j.e();
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final com.avito.android.category_parameters.f d(@Y61.k com.avito.conveyor_item.a aVar) {
        if (!(aVar instanceof com.avito.android.publish.slots.final_state_suggest.item.a)) {
            return f.c.f117644b;
        }
        l();
        return f.c.f117644b;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f243893b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        P2<? super FinalStateSuggestResponse> p22 = this.f243903l;
        return p22 == null ? C42784z0.f406748b : Collections.singletonList(new com.avito.android.publish.slots.final_state_suggest.item.a(f(), p22));
    }

    public final void l() {
        List<ParameterSlot> parameters;
        Integer categoryId;
        CategoryParameters categoryParametersC0 = this.f243896e.C0();
        if (categoryParametersC0 == null || (parameters = categoryParametersC0.getParameters()) == null || (categoryId = this.f243895d.U().getCategoryId()) == null) {
            return;
        }
        int iIntValue = categoryId.intValue();
        String contentUrl = ((FinalStateSuggestSlotConfig) this.f243893b.getWidget().getConfig()).getContentUrl();
        this.f243903l = P2.c.f318721a;
        this.f243902k.accept(new f.b(SlotType.FINAL_STATE_SUGGEST, null));
        String strValueOf = String.valueOf(iIntValue);
        AttributesTreeConverter attributesTreeConverter = this.f243897f;
        I<TypedResult<FinalStateSuggestResponse>> iN2 = this.f243894c.N(contentUrl, strValueOf, attributesTreeConverter.convertToParameterFieldMap(attributesTreeConverter.convertToAttributesTree(parameters)));
        InterfaceC35745a5 interfaceC35745a5 = this.f243898g;
        this.f243901j.b(iN2.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).r(C7308a.f243905b).x(new b(), new c()));
    }
}
