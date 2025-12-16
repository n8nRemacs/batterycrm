package com.avito.android.publish.slots.delivery_summary_edit;

import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.category_parameters.f;
import com.avito.android.deep_linking.x;
import com.avito.android.messenger.conversation.mvi.file_upload.C32102w0;
import com.avito.android.publish.C0;
import com.avito.android.publish.InterfaceC34155z;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.analytics.events.CommissionInfoSeenEvent;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.ItemBrief;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.SlotWithState;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary_edit.CptEstimateEditResultV2;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary_edit.DeliverySummaryEditRequest;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary_edit.DeliverySummaryEditSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary_edit.DeliverySummaryEditSlotKt;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary_edit.FeeBlock;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import dl0.InterfaceC39749a;
import i31.InterfaceC41220a;
import if0.C41394a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.C42021t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.rx3.Q;

/* compiled from: DeliverySummaryEditSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary_edit/f;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary_edit/DeliverySummaryEditSlot;", "Lcom/avito/android/publish/slots/q;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f extends com.avito.android.category_parameters.k<DeliverySummaryEditSlot> implements com.avito.android.publish.slots.q {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f243756q = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeliverySummaryEditSlot f243757b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final H0 f243758c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f243759d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f243760e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39749a f243761f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Q1 f243762g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final x f243763h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public CptEstimateEditResultV2 f243764i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f243765j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public com.avito.android.publish.slots.delivery_summary_edit.item.o f243766k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.m f243767l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f243768m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> f243769n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.delivery_summary_edit.b f243770o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f243771p;

    /* compiled from: DeliverySummaryEditSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary_edit/f$a;", "", "<init>", "()V", "", "CHECK_TIMEOUT", "J", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DeliverySummaryEditSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary_edit/CptEstimateEditResultV2;", "it", "Lcom/avito/android/util/P2;", "Lkotlin/G0;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T, R> f243773b = new c<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return new P2.b(G0.f406611a);
        }
    }

    static {
        new a(null);
    }

    @i31.c
    public f(@InterfaceC41220a @Y61.k DeliverySummaryEditSlot deliverySummaryEditSlot, @Y61.k com.avito.android.details.a aVar, @Y61.k InterfaceC34155z interfaceC34155z, @Y61.k CategoryParametersConverter categoryParametersConverter, @Y61.k AttributesTreeConverter attributesTreeConverter, @Y61.k C0 c02, @Y61.k H0 h02, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k InterfaceC39749a interfaceC39749a, @Y61.k Q1 q12, @Y61.k x xVar) {
        this.f243757b = deliverySummaryEditSlot;
        this.f243758c = h02;
        this.f243759d = interfaceC35745a5;
        this.f243760e = interfaceC33535v;
        this.f243761f = interfaceC39749a;
        this.f243762g = q12;
        this.f243763h = xVar;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f243768m = cVar;
        com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f243769n = cVar2;
        this.f243770o = new com.avito.android.publish.slots.delivery_summary_edit.b(deliverySummaryEditSlot, categoryParametersConverter, interfaceC34155z, aVar, c02, attributesTreeConverter);
        this.f243771p = cVar2;
        io.reactivex.rxjava3.internal.operators.mixed.x xVar2 = new io.reactivex.rxjava3.internal.operators.mixed.x(c02.f231882t0.N(k.f243823b).y(800L, TimeUnit.MILLISECONDS, interfaceC35745a5.c()), new n(this));
        l41.g gVar = new l41.g() { // from class: com.avito.android.publish.slots.delivery_summary_edit.o
            @Override // l41.g
            public final void accept(Object obj) {
                f.l(this.f243827b, (TypedResult) obj);
            }
        };
        final V2 v22 = V2.f318762a;
        cVar.b(xVar2.v0(gVar, new l41.g() { // from class: com.avito.android.publish.slots.delivery_summary_edit.p
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public static final void l(f fVar, TypedResult typedResult) {
        String cptToken;
        Object next;
        fVar.getClass();
        if (typedResult instanceof TypedResult.Success) {
            fVar.f243766k = null;
            fVar.f243765j = false;
            TypedResult.Success success = (TypedResult.Success) typedResult;
            cptToken = ((CptEstimateEditResultV2) success.getResult()).getCptToken();
            fVar.f243764i = (CptEstimateEditResultV2) success.getResult();
        } else {
            if (typedResult instanceof TypedResult.Error) {
                fVar.f243766k = new com.avito.android.publish.slots.delivery_summary_edit.item.o(((TypedResult.Error) typedResult).getError(), new g(fVar));
                fVar.f243764i = null;
            }
            cptToken = null;
        }
        Iterator<T> it = fVar.f243757b.getParameters().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((ParameterSlot) next).getId(), DeliverySummaryEditSlotKt.KEY_CPT_EDIT_TOKEN)) {
                    break;
                }
            }
        }
        CharParameter charParameter = next instanceof CharParameter ? (CharParameter) next : null;
        if (charParameter != null) {
            charParameter.set_value(cptToken);
        }
        fVar.f243769n.accept(new f.b(SlotType.DELIVERY_SUMMARY_EDIT, null));
    }

    @Override // com.avito.android.publish.slots.q
    @Y61.k
    public final z<com.avito.android.category_parameters.f> a() {
        return this.f243771p;
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
        this.f243768m.dispose();
        io.reactivex.rxjava3.internal.observers.m mVar = this.f243767l;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f243757b;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final z<P2<G0>> h() {
        return m().k(new l41.g() { // from class: com.avito.android.publish.slots.delivery_summary_edit.f.b
            @Override // l41.g
            public final void accept(Object obj) {
                f.l(f.this, (TypedResult) obj);
            }
        }).r(c.f243773b).u(new C32102w0(17)).F();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012a  */
    @Override // com.avito.android.category_parameters.k
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.avito.conveyor_item.a> j() {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.slots.delivery_summary_edit.f.j():java.util.List");
    }

    public final C42021t m() {
        PriceParameter priceParameter;
        AddressParameter addressParameter;
        AddressParameter.Value value;
        com.avito.android.publish.slots.delivery_summary_edit.b bVar = this.f243770o;
        com.avito.android.details.a aVar = bVar.f243750d;
        CategoryParameters categoryParametersC0 = aVar.C0();
        String jsonWebToken = (categoryParametersC0 == null || (addressParameter = (AddressParameter) categoryParametersC0.getFirstParameterOfType(AddressParameter.class)) == null || (value = addressParameter.getValue()) == null) ? null : value.getJsonWebToken();
        String str = jsonWebToken == null ? "" : jsonWebToken;
        Integer categoryId = bVar.f243749c.U().getCategoryId();
        String string = categoryId != null ? categoryId.toString() : null;
        String str2 = string == null ? "" : string;
        CategoryParameters categoryParametersC02 = aVar.C0();
        String value2 = (categoryParametersC02 == null || (priceParameter = (PriceParameter) ((CategoryParameter) categoryParametersC02.getFirstParameterOfType(PriceParameter.class))) == null) ? null : priceParameter.getValue();
        String str3 = value2 == null ? "" : value2;
        CategoryParameters categoryParametersC03 = aVar.C0();
        List<ParameterSlot> parameters = categoryParametersC03 != null ? categoryParametersC03.getParameters() : null;
        if (parameters == null) {
            parameters = C42784z0.f406748b;
        }
        List<ParameterSlot> list = parameters;
        Map<String, String> mapConvertToFieldMap = bVar.f243748b.convertToFieldMap(list);
        ItemBrief itemBrief = bVar.f243751e.f231867e0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((ParameterSlot) obj) instanceof SlotWithState)) {
                arrayList.add(obj);
            }
        }
        AttributesTreeConverter attributesTreeConverter = bVar.f243752f;
        HashMap mapB = C41394a.b(attributesTreeConverter.convertToAttributesTree(arrayList));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((ParameterSlot) obj2) instanceof SlotWithState) {
                arrayList2.add(obj2);
            }
        }
        HashMap mapB2 = C41394a.b(attributesTreeConverter.convertToAttributesTree(arrayList2));
        String id2 = itemBrief != null ? itemBrief.getId() : null;
        String str4 = id2 == null ? "" : id2;
        String title = itemBrief != null ? itemBrief.getTitle() : null;
        String str5 = title == null ? "" : title;
        String description = itemBrief != null ? itemBrief.getDescription() : null;
        final DeliverySummaryEditRequest deliverySummaryEditRequest = new DeliverySummaryEditRequest(str, str2, str3, mapConvertToFieldMap, mapB, mapB2, str4, str5, description == null ? "" : description);
        C42007e c42007e = new C42007e(new l41.s() { // from class: com.avito.android.publish.slots.delivery_summary_edit.e
            @Override // l41.s
            public final Object get() {
                f fVar = this.f243754b;
                Q1 q12 = fVar.f243762g;
                q12.getClass();
                kotlin.reflect.n<Object> nVar = Q1.f67448x0[81];
                boolean zBooleanValue = ((Boolean) q12.f67503o0.a().invoke()).booleanValue();
                DeliverySummaryEditRequest deliverySummaryEditRequest2 = deliverySummaryEditRequest;
                if (zBooleanValue) {
                    return Q.a(EmptyCoroutineContext.INSTANCE, new h(fVar, deliverySummaryEditRequest2, null)).r(new i(fVar));
                }
                return fVar.f243758c.G(deliverySummaryEditRequest2.getLocationJwt(), deliverySummaryEditRequest2.getCategoryId(), deliverySummaryEditRequest2.getPrice(), deliverySummaryEditRequest2.getParamsMap(), deliverySummaryEditRequest2.getItemId(), deliverySummaryEditRequest2.getTitle(), deliverySummaryEditRequest2.getDescription());
            }
        });
        InterfaceC35745a5 interfaceC35745a5 = this.f243759d;
        return c42007e.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).j(new j(this));
    }

    public final void n() {
        FeeBlock fee;
        CptEstimateEditResultV2 cptEstimateEditResultV2 = this.f243764i;
        Float fValueOf = (cptEstimateEditResultV2 == null || (fee = cptEstimateEditResultV2.getFee()) == null) ? null : Float.valueOf(fee.getAmountPenny());
        if (fValueOf != null) {
            this.f243760e.G(fValueOf.floatValue(), CommissionInfoSeenEvent.Source.f232222d);
        }
    }
}
