package com.avito.android.publish.slots.imv;

import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.f;
import com.avito.android.messenger.conversation.mvi.file_upload.C32102w0;
import com.avito.android.publish.C0;
import com.avito.android.publish.InterfaceC34155z;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.slots.q;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.ItemBrief;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.imv.InstantMarketValueResponse;
import com.avito.android.remote.model.category_parameters.slot.imv.InstantMarketValueSlot;
import com.avito.android.remote.model.category_parameters.slot.imv.InstantMarketValueSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.imv.InstantMarketValueSlotType;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import yc.C50213a;

/* compiled from: InstantMarketValueSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/imv/k;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/imv/InstantMarketValueSlot;", "Lcom/avito/android/publish/slots/q;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k extends com.avito.android.category_parameters.k<InstantMarketValueSlot> implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InstantMarketValueSlot f244287b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final H0 f244288c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C0 f244289d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34155z f244290e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f244291f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C50213a f244292g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f244293h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final CategoryParametersConverter f244294i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final AttributesTreeConverter f244295j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f244296k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final ItemBrief f244297l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f244298m = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> f244299n = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<EditableParameter<?>> f244300o = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: p, reason: collision with root package name */
    public final boolean f244301p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public InstantMarketValueResponse f244302q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f244303r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f244304s;

    /* compiled from: InstantMarketValueSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/category_parameters/slot/imv/InstantMarketValueResponse;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            boolean z12 = typedResult instanceof TypedResult.Success;
            k kVar = k.this;
            if (z12) {
                kVar.f244302q = (InstantMarketValueResponse) ((TypedResult.Success) typedResult).getResult();
            } else {
                kVar.f244302q = null;
                kVar.f244303r = false;
            }
        }
    }

    /* compiled from: InstantMarketValueSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/category_parameters/slot/imv/InstantMarketValueResponse;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            k kVar = k.this;
            kVar.f244303r = false;
            kVar.f244299n.accept(new f.b(SlotType.MARKET_PRICE, null));
        }
    }

    /* compiled from: InstantMarketValueSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            k.this.f244303r = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x004c  */
    @i31.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(@i31.InterfaceC41220a @Y61.k com.avito.android.remote.model.category_parameters.slot.imv.InstantMarketValueSlot r1, @Y61.k com.avito.android.remote.H0 r2, @Y61.k com.avito.android.publish.C0 r3, @Y61.k com.avito.android.publish.InterfaceC34155z r4, @Y61.k com.avito.android.details.a r5, @Y61.k yc.C50213a r6, @Y61.k com.avito.android.util.InterfaceC35745a5 r7, @Y61.k com.avito.android.remote.model.category_parameters.CategoryParametersConverter r8, @Y61.k com.avito.android.remote.model.category_parameters.AttributesTreeConverter r9, @Y61.k com.avito.android.publish.analytics.InterfaceC33535v r10, @Y61.k com.avito.android.Q1 r11, @com.avito.android.publish.objects.di.r boolean r12) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.slots.imv.k.<init>(com.avito.android.remote.model.category_parameters.slot.imv.InstantMarketValueSlot, com.avito.android.remote.H0, com.avito.android.publish.C0, com.avito.android.publish.z, com.avito.android.details.a, yc.a, com.avito.android.util.a5, com.avito.android.remote.model.category_parameters.CategoryParametersConverter, com.avito.android.remote.model.category_parameters.AttributesTreeConverter, com.avito.android.publish.analytics.v, com.avito.android.Q1, boolean):void");
    }

    @Override // com.avito.android.publish.slots.q
    @Y61.k
    public final z<com.avito.android.category_parameters.f> a() {
        return this.f244304s;
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
        this.f244298m.e();
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f244287b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        InstantMarketValueResponse instantMarketValueResponse = this.f244302q;
        if (instantMarketValueResponse == null) {
            return C42784z0.f406748b;
        }
        return Collections.singletonList(new JO.g(f(), instantMarketValueResponse.getItems(), this.f244303r, this.f244290e.U().getCategoryId(), ((InstantMarketValueSlotConfig) this.f244287b.getWidget().getConfig()).getType() == InstantMarketValueSlotType.FAIR_PRICING));
    }

    public final void l() {
        List<ParameterSlot> parameters;
        InstantMarketValueSlot instantMarketValueSlot;
        com.avito.android.details.a aVar = this.f244291f;
        CategoryParameters categoryParametersC0 = aVar.C0();
        if (categoryParametersC0 == null || (parameters = categoryParametersC0.getParameters()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = parameters.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            instantMarketValueSlot = this.f244287b;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            if (C42756l.h(((ParameterSlot) next).getId(), ((InstantMarketValueSlotConfig) instantMarketValueSlot.getWidget().getConfig()).getDataAttributeIds())) {
                arrayList.add(next);
            }
        }
        if (this.f244301p) {
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Parcelable parcelableCopy = (ParameterSlot) it2.next();
                if (parcelableCopy instanceof ObjectsParameter) {
                    ObjectsParameter objectsParameter = (ObjectsParameter) parcelableCopy;
                    DisplayingOptions displayingOptions = objectsParameter.getDisplayingOptions();
                    if (L.f(displayingOptions != null ? displayingOptions.getType() : null, "priceList")) {
                        ParametersTree parametersTreeWa = aVar.wa();
                        List<ParameterSlot> parametersExceptOwnedBySlots = parametersTreeWa != null ? parametersTreeWa.getParametersExceptOwnedBySlots() : null;
                        if (parametersExceptOwnedBySlots == null) {
                            parametersExceptOwnedBySlots = C42784z0.f406748b;
                        }
                        parcelableCopy = objectsParameter.copy((16127 & 1) != 0 ? objectsParameter.id : null, (16127 & 2) != 0 ? objectsParameter.title : null, (16127 & 4) != 0 ? objectsParameter.required : false, (16127 & 8) != 0 ? objectsParameter.immutable : false, (16127 & 16) != 0 ? objectsParameter.motivation : null, (16127 & 32) != 0 ? objectsParameter.restrictions : null, (16127 & 64) != 0 ? objectsParameter.summary : null, (16127 & 128) != 0 ? objectsParameter.params : null, (16127 & 256) != 0 ? objectsParameter._value : Collections.singletonList(parametersExceptOwnedBySlots), (16127 & 512) != 0 ? objectsParameter.displayingOptions : null, (16127 & 1024) != 0 ? objectsParameter.visible : null, (16127 & 2048) != 0 ? objectsParameter.phantom : null, (16127 & 4096) != 0 ? objectsParameter.widget : null, (16127 & 8192) != 0 ? objectsParameter.constraints : null);
                    }
                }
                arrayList2.add(parcelableCopy);
            }
            arrayList = arrayList2;
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            return;
        }
        InterfaceC34155z interfaceC34155z = this.f244290e;
        this.f244296k.z(interfaceC34155z.U().getCategoryId());
        this.f244303r = true;
        if (((InstantMarketValueSlotConfig) instantMarketValueSlot.getWidget().getConfig()).getType() != InstantMarketValueSlotType.FAIR_PRICING) {
            this.f244299n.accept(new f.b(SlotType.MARKET_PRICE, null));
        }
        Map<String, String> mapConvertToFieldMap = this.f244294i.convertToFieldMap(interfaceC34155z.U());
        AttributesTreeConverter attributesTreeConverter = this.f244295j;
        Map<String, String> mapConvertToParameterFieldMap = attributesTreeConverter.convertToParameterFieldMap(attributesTreeConverter.convertToAttributesTree(arrayList));
        ItemBrief itemBrief = this.f244297l;
        I<TypedResult<InstantMarketValueResponse>> iT2 = this.f244288c.T(mapConvertToFieldMap, mapConvertToParameterFieldMap, itemBrief != null ? itemBrief.getId() : null, this.f244292g.b());
        InterfaceC35745a5 interfaceC35745a5 = this.f244293h;
        this.f244298m.b(iT2.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).u(new C32102w0(18)).k(new a()).x(new b(), new c()));
    }
}
