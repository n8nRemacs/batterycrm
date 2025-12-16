package com.avito.android.str_calendar.seller.calandar_parameters.domain.children;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.blocks.items_factories.C28081y0;
import com.avito.android.remote.model.category_parameters.ChildrenAgesGroup;
import com.avito.android.remote.model.category_parameters.ChildrenAgesParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.StrAgeVariant;
import com.avito.android.remote.model.category_parameters.StrChildrenPayload;
import com.avito.android.remote.model.category_parameters.StrPayload;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: ChildrenAgesGroupParameterHelper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/domain/children/h;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/domain/children/g;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_calendar.seller.calandar_parameters.domain.children.a f286933a;

    /* compiled from: ChildrenAgesGroupParameterHelper.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "invoke", "(Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<ParameterSlot, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f286934l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f286934l = str;
        }

        @Override // Y41.l
        public final Boolean invoke(ParameterSlot parameterSlot) {
            return Boolean.valueOf(L.f(parameterSlot.getId(), this.f286934l));
        }
    }

    @Inject
    public h(@Y61.k com.avito.android.str_calendar.seller.calandar_parameters.domain.children.a aVar) {
        this.f286933a = aVar;
    }

    public static ChildrenAgesGroup c(ChildrenAgesGroup childrenAgesGroup) {
        List<ChildrenAgesParameter> childrenAgesParameters = childrenAgesGroup.getChildrenAgesParameters();
        ArrayList arrayList = new ArrayList(C42745f0.q(childrenAgesParameters, 10));
        int i12 = 0;
        for (Object obj : childrenAgesParameters) {
            int i13 = i12 + 1;
            PriceParameter priceParameterCopy = null;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            ChildrenAgesParameter childrenAgesParameter = (ChildrenAgesParameter) obj;
            String strG = AK.c.g(i12, "childrenInterval.");
            String strG2 = AK.c.g(i13, "Возраст ");
            IntParameter fromAgeParameter = childrenAgesParameter.getFromAgeParameter();
            IntParameter intParameterCopy = fromAgeParameter != null ? fromAgeParameter.copy((32766 & 1) != 0 ? fromAgeParameter.id : r.q(strG, ".fromAge"), (32766 & 2) != 0 ? fromAgeParameter.title : null, (32766 & 4) != 0 ? fromAgeParameter.required : false, (32766 & 8) != 0 ? fromAgeParameter.immutable : false, (32766 & 16) != 0 ? fromAgeParameter.motivation : null, (32766 & 32) != 0 ? fromAgeParameter.updatesForm : null, (32766 & 64) != 0 ? fromAgeParameter.hint : null, (32766 & 128) != 0 ? fromAgeParameter._value : null, (32766 & 256) != 0 ? fromAgeParameter.constraints : null, (32766 & 512) != 0 ? fromAgeParameter.displayingOptions : null, (32766 & 1024) != 0 ? fromAgeParameter.placeholder : null, (32766 & 2048) != 0 ? fromAgeParameter.button : null, (32766 & 4096) != 0 ? fromAgeParameter.visible : null, (32766 & 8192) != 0 ? fromAgeParameter.phantom : null, (32766 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? fromAgeParameter.widget : null) : null;
            IntParameter toAgeParameter = childrenAgesParameter.getToAgeParameter();
            IntParameter intParameterCopy2 = toAgeParameter != null ? toAgeParameter.copy((32766 & 1) != 0 ? toAgeParameter.id : r.q(strG, ".toAge"), (32766 & 2) != 0 ? toAgeParameter.title : null, (32766 & 4) != 0 ? toAgeParameter.required : false, (32766 & 8) != 0 ? toAgeParameter.immutable : false, (32766 & 16) != 0 ? toAgeParameter.motivation : null, (32766 & 32) != 0 ? toAgeParameter.updatesForm : null, (32766 & 64) != 0 ? toAgeParameter.hint : null, (32766 & 128) != 0 ? toAgeParameter._value : null, (32766 & 256) != 0 ? toAgeParameter.constraints : null, (32766 & 512) != 0 ? toAgeParameter.displayingOptions : null, (32766 & 1024) != 0 ? toAgeParameter.placeholder : null, (32766 & 2048) != 0 ? toAgeParameter.button : null, (32766 & 4096) != 0 ? toAgeParameter.visible : null, (32766 & 8192) != 0 ? toAgeParameter.phantom : null, (32766 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? toAgeParameter.widget : null) : null;
            PriceParameter priceParameter = childrenAgesParameter.getPriceParameter();
            if (priceParameter != null) {
                priceParameterCopy = priceParameter.copy((8127 & 1) != 0 ? priceParameter.id : r.q(strG, ".price"), (8127 & 2) != 0 ? priceParameter.title : null, (8127 & 4) != 0 ? priceParameter.motivation : null, (8127 & 8) != 0 ? priceParameter.required : false, (8127 & 16) != 0 ? priceParameter.updatesForm : null, (8127 & 32) != 0 ? priceParameter.displayingOptions : null, (8127 & 64) != 0 ? priceParameter._value : null, (8127 & 128) != 0 ? priceParameter.constraints : null, (8127 & 256) != 0 ? priceParameter.placeholder : null, (8127 & 512) != 0 ? priceParameter.visible : null, (8127 & 1024) != 0 ? priceParameter.phantom : null, (8127 & 2048) != 0 ? priceParameter.button : null, (8127 & 4096) != 0 ? priceParameter.widget : null);
            }
            arrayList.add(childrenAgesParameter.copy(strG, strG2, C42756l.B(new Object[]{intParameterCopy, intParameterCopy2, priceParameterCopy})));
            i12 = i13;
        }
        return childrenAgesGroup.copy((507 & 1) != 0 ? childrenAgesGroup.id : null, (507 & 2) != 0 ? childrenAgesGroup.optionalTitle : null, (507 & 4) != 0 ? childrenAgesGroup.parameters : arrayList, (507 & 8) != 0 ? childrenAgesGroup.isNew : null, (507 & 16) != 0 ? childrenAgesGroup.visible : null, (507 & 32) != 0 ? childrenAgesGroup.phantom : null, (507 & 64) != 0 ? childrenAgesGroup.description : null, (507 & 128) != 0 ? childrenAgesGroup.displaying : null, (507 & 256) != 0 ? childrenAgesGroup.payload : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    @Override // com.avito.android.str_calendar.seller.calandar_parameters.domain.children.g
    @Y61.k
    public final ChildrenAgesGroup a(@Y61.k ChildrenAgesGroup childrenAgesGroup, @Y61.l String str) {
        ?? arrayList;
        ?? arrayList2;
        IntParameter intParameterCopy;
        IntParameter intParameterCopy2;
        List<StrAgeVariant> toAges;
        List<StrAgeVariant> fromAges;
        IntParameter toAgeParameter;
        Long value;
        List<ChildrenAgesParameter> childrenAgesParameters = childrenAgesGroup.getChildrenAgesParameters();
        StrPayload payload = childrenAgesGroup.getPayload();
        StrChildrenPayload childrenPayload = payload != null ? payload.getChildrenPayload() : null;
        ChildrenAgesParameter childrenAgesParameter = (ChildrenAgesParameter) C42745f0.S(childrenAgesParameters);
        Integer numValueOf = (childrenAgesParameter == null || (toAgeParameter = childrenAgesParameter.getToAgeParameter()) == null || (value = toAgeParameter.getValue()) == null) ? null : Integer.valueOf((int) value.longValue());
        if (childrenPayload == null || (fromAges = childrenPayload.getFromAges()) == null) {
            arrayList = 0;
        } else {
            arrayList = new ArrayList();
            Iterator it = fromAges.iterator();
            while (it.hasNext()) {
                Integer age = ((StrAgeVariant) it.next()).getAge();
                if (age != null) {
                    arrayList.add(age);
                }
            }
        }
        if (arrayList == 0) {
            arrayList = C42784z0.f406748b;
        }
        Collection<Integer> collection = (Collection) arrayList;
        if (childrenPayload == null || (toAges = childrenPayload.getToAges()) == null) {
            arrayList2 = 0;
        } else {
            arrayList2 = new ArrayList();
            Iterator it2 = toAges.iterator();
            while (it2.hasNext()) {
                Integer age2 = ((StrAgeVariant) it2.next()).getAge();
                if (age2 != null) {
                    arrayList2.add(age2);
                }
            }
        }
        if (arrayList2 == 0) {
            arrayList2 = C42784z0.f406748b;
        }
        com.avito.android.str_calendar.seller.calandar_parameters.domain.children.a aVar = this.f286933a;
        Q<Integer, Integer> qA2 = aVar.a(numValueOf, collection, (Collection) arrayList2, aVar.d(childrenAgesParameters));
        ChildrenAgesParameter childrenAgesParameter2 = (ChildrenAgesParameter) C42745f0.G(childrenAgesParameters);
        if (childrenAgesParameter2 == null) {
            return childrenAgesGroup;
        }
        IntParameter fromAgeParameter = childrenAgesParameter2.getFromAgeParameter();
        if (fromAgeParameter != null) {
            intParameterCopy = fromAgeParameter.copy((32766 & 1) != 0 ? fromAgeParameter.id : null, (32766 & 2) != 0 ? fromAgeParameter.title : null, (32766 & 4) != 0 ? fromAgeParameter.required : false, (32766 & 8) != 0 ? fromAgeParameter.immutable : false, (32766 & 16) != 0 ? fromAgeParameter.motivation : null, (32766 & 32) != 0 ? fromAgeParameter.updatesForm : null, (32766 & 64) != 0 ? fromAgeParameter.hint : null, (32766 & 128) != 0 ? fromAgeParameter._value : qA2 != null ? Long.valueOf(qA2.f406619b.intValue()) : null, (32766 & 256) != 0 ? fromAgeParameter.constraints : null, (32766 & 512) != 0 ? fromAgeParameter.displayingOptions : null, (32766 & 1024) != 0 ? fromAgeParameter.placeholder : null, (32766 & 2048) != 0 ? fromAgeParameter.button : null, (32766 & 4096) != 0 ? fromAgeParameter.visible : null, (32766 & 8192) != 0 ? fromAgeParameter.phantom : null, (32766 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? fromAgeParameter.widget : null);
        } else {
            intParameterCopy = null;
        }
        IntParameter toAgeParameter2 = childrenAgesParameter2.getToAgeParameter();
        if (toAgeParameter2 != null) {
            intParameterCopy2 = toAgeParameter2.copy((32766 & 1) != 0 ? toAgeParameter2.id : null, (32766 & 2) != 0 ? toAgeParameter2.title : null, (32766 & 4) != 0 ? toAgeParameter2.required : false, (32766 & 8) != 0 ? toAgeParameter2.immutable : false, (32766 & 16) != 0 ? toAgeParameter2.motivation : null, (32766 & 32) != 0 ? toAgeParameter2.updatesForm : null, (32766 & 64) != 0 ? toAgeParameter2.hint : null, (32766 & 128) != 0 ? toAgeParameter2._value : qA2 != null ? Long.valueOf(qA2.f406620c.intValue()) : null, (32766 & 256) != 0 ? toAgeParameter2.constraints : null, (32766 & 512) != 0 ? toAgeParameter2.displayingOptions : null, (32766 & 1024) != 0 ? toAgeParameter2.placeholder : null, (32766 & 2048) != 0 ? toAgeParameter2.button : null, (32766 & 4096) != 0 ? toAgeParameter2.visible : null, (32766 & 8192) != 0 ? toAgeParameter2.phantom : null, (32766 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? toAgeParameter2.widget : null);
        } else {
            intParameterCopy2 = null;
        }
        PriceParameter priceParameter = childrenAgesParameter2.getPriceParameter();
        return c(childrenAgesGroup.copy((507 & 1) != 0 ? childrenAgesGroup.id : null, (507 & 2) != 0 ? childrenAgesGroup.optionalTitle : null, (507 & 4) != 0 ? childrenAgesGroup.parameters : C42745f0.i0(new ChildrenAgesParameter("", "", C42756l.B(new Object[]{intParameterCopy, intParameterCopy2, priceParameter != null ? priceParameter.copy((8127 & 1) != 0 ? priceParameter.id : null, (8127 & 2) != 0 ? priceParameter.title : null, (8127 & 4) != 0 ? priceParameter.motivation : null, (8127 & 8) != 0 ? priceParameter.required : false, (8127 & 16) != 0 ? priceParameter.updatesForm : null, (8127 & 32) != 0 ? priceParameter.displayingOptions : null, (8127 & 64) != 0 ? priceParameter._value : str, (8127 & 128) != 0 ? priceParameter.constraints : null, (8127 & 256) != 0 ? priceParameter.placeholder : null, (8127 & 512) != 0 ? priceParameter.visible : null, (8127 & 1024) != 0 ? priceParameter.phantom : null, (8127 & 2048) != 0 ? priceParameter.button : null, (8127 & 4096) != 0 ? priceParameter.widget : null) : null})), childrenAgesGroup.getParameters()), (507 & 8) != 0 ? childrenAgesGroup.isNew : null, (507 & 16) != 0 ? childrenAgesGroup.visible : null, (507 & 32) != 0 ? childrenAgesGroup.phantom : null, (507 & 64) != 0 ? childrenAgesGroup.description : null, (507 & 128) != 0 ? childrenAgesGroup.displaying : null, (507 & 256) != 0 ? childrenAgesGroup.payload : null));
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.domain.children.g
    @Y61.k
    public final ChildrenAgesGroup b(@Y61.k ChildrenAgesGroup childrenAgesGroup, @Y61.k String str) {
        ArrayList arrayList = new ArrayList(childrenAgesGroup.getParameters());
        if (arrayList.size() >= 2) {
            arrayList.removeIf(new C28081y0(new a(str), 19));
        }
        G0 g02 = G0.f406611a;
        return c(childrenAgesGroup.copy((507 & 1) != 0 ? childrenAgesGroup.id : null, (507 & 2) != 0 ? childrenAgesGroup.optionalTitle : null, (507 & 4) != 0 ? childrenAgesGroup.parameters : arrayList, (507 & 8) != 0 ? childrenAgesGroup.isNew : null, (507 & 16) != 0 ? childrenAgesGroup.visible : null, (507 & 32) != 0 ? childrenAgesGroup.phantom : null, (507 & 64) != 0 ? childrenAgesGroup.description : null, (507 & 128) != 0 ? childrenAgesGroup.displaying : null, (507 & 256) != 0 ? childrenAgesGroup.payload : null));
    }
}
