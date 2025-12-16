package Re0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.f;
import com.avito.android.category_parameters.k;
import com.avito.android.items.ItemWithState;
import com.avito.android.publish.slots.q;
import com.avito.android.remote.model.category_parameters.RangeIntParameter;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.age_range.AgeRangeSlot;
import com.avito.android.remote.model.category_parameters.slot.age_range.AgeRangeSlotConfig;
import com.avito.android.remote.model.text.AttributedText;
import io.reactivex.rxjava3.core.z;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: AgeRangeSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"LRe0/a;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/age_range/AgeRangeSlot;", "Lcom/avito/android/publish/slots/q;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Re0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C15034a extends k<AgeRangeSlot> implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AgeRangeSlot f14530b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f14531c = new com.jakewharton.rxrelay3.c();

    /* renamed from: d, reason: collision with root package name */
    @l
    public final RangeIntParameter f14532d;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    @i31.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C15034a(@i31.InterfaceC41220a @Y61.k com.avito.android.remote.model.category_parameters.slot.age_range.AgeRangeSlot r4, @Y61.k com.avito.android.details.a r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.f14530b = r4
            com.jakewharton.rxrelay3.c r0 = new com.jakewharton.rxrelay3.c
            r0.<init>()
            r3.f14531c = r0
            com.avito.android.remote.model.category_parameters.slot.SlotWidget r0 = r4.getWidget()
            com.avito.android.remote.model.category_parameters.slot.SlotConfig r0 = r0.getConfig()
            com.avito.android.remote.model.category_parameters.slot.age_range.AgeRangeSlotConfig r0 = (com.avito.android.remote.model.category_parameters.slot.age_range.AgeRangeSlotConfig) r0
            java.lang.String r0 = r0.getAgeRangeId()
            r1 = 0
            if (r0 == 0) goto L30
            com.avito.android.remote.model.category_parameters.CategoryParameters r5 = r5.C0()
            if (r5 == 0) goto L28
            com.avito.android.remote.model.category_parameters.base.ParameterSlot r5 = r5.findParameter(r0)
            goto L29
        L28:
            r5 = r1
        L29:
            boolean r0 = r5 instanceof com.avito.android.remote.model.category_parameters.RangeIntParameter
            if (r0 == 0) goto L30
            com.avito.android.remote.model.category_parameters.RangeIntParameter r5 = (com.avito.android.remote.model.category_parameters.RangeIntParameter) r5
            goto L31
        L30:
            r5 = r1
        L31:
            r3.f14532d = r5
            if (r5 == 0) goto L3c
            java.lang.Object r0 = r5.getValue()
            r1 = r0
            com.avito.android.remote.model.category_parameters.RangeIntParameter$RangeValue r1 = (com.avito.android.remote.model.category_parameters.RangeIntParameter.RangeValue) r1
        L3c:
            if (r1 != 0) goto L6f
            if (r5 != 0) goto L41
            goto L6f
        L41:
            com.avito.android.remote.model.category_parameters.RangeIntParameter$RangeValue r0 = new com.avito.android.remote.model.category_parameters.RangeIntParameter$RangeValue
            com.avito.android.remote.model.category_parameters.RangeIntParameter$RangeValueLimit r1 = new com.avito.android.remote.model.category_parameters.RangeIntParameter$RangeValueLimit
            com.avito.android.remote.model.category_parameters.slot.SlotWidget r2 = r4.getWidget()
            com.avito.android.remote.model.category_parameters.slot.SlotConfig r2 = r2.getConfig()
            com.avito.android.remote.model.category_parameters.slot.age_range.AgeRangeSlotConfig r2 = (com.avito.android.remote.model.category_parameters.slot.age_range.AgeRangeSlotConfig) r2
            java.lang.Long r2 = r2.getValueFrom()
            r1.<init>(r2)
            com.avito.android.remote.model.category_parameters.RangeIntParameter$RangeValueLimit r2 = new com.avito.android.remote.model.category_parameters.RangeIntParameter$RangeValueLimit
            com.avito.android.remote.model.category_parameters.slot.SlotWidget r4 = r4.getWidget()
            com.avito.android.remote.model.category_parameters.slot.SlotConfig r4 = r4.getConfig()
            com.avito.android.remote.model.category_parameters.slot.age_range.AgeRangeSlotConfig r4 = (com.avito.android.remote.model.category_parameters.slot.age_range.AgeRangeSlotConfig) r4
            java.lang.Long r4 = r4.getValueTo()
            r2.<init>(r4)
            r0.<init>(r1, r2)
            r5.setValue(r0)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Re0.C15034a.<init>(com.avito.android.remote.model.category_parameters.slot.age_range.AgeRangeSlot, com.avito.android.details.a):void");
    }

    @Override // com.avito.android.publish.slots.q
    @Y61.k
    public final z<f> a() {
        return this.f14531c;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final f d(@Y61.k com.avito.conveyor_item.a aVar) {
        if (aVar instanceof com.avito.android.publish.items.int_range.b) {
            RangeIntParameter rangeIntParameter = this.f14532d;
            if (rangeIntParameter != null) {
                com.avito.android.publish.items.int_range.b bVar = (com.avito.android.publish.items.int_range.b) aVar;
                Long l12 = bVar.f236965c.f236959a;
                RangeIntParameter.RangeValueLimit rangeValueLimit = l12 != null ? new RangeIntParameter.RangeValueLimit(Long.valueOf(l12.longValue())) : null;
                Long l13 = bVar.f236966d.f236959a;
                rangeIntParameter.setValue(new RangeIntParameter.RangeValue(rangeValueLimit, l13 != null ? new RangeIntParameter.RangeValueLimit(Long.valueOf(l13.longValue())) : null));
            }
            if (rangeIntParameter != null) {
                rangeIntParameter.resetErrors();
            }
        }
        return f.c.f117644b;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f14530b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        RangeIntParameter.RangeValueLimit to2;
        RangeIntParameter.RangeValueLimit from;
        RangeIntParameter rangeIntParameter = this.f14532d;
        if (rangeIntParameter == null) {
            return C42784z0.f406748b;
        }
        AgeRangeSlotConfig ageRangeSlotConfig = (AgeRangeSlotConfig) this.f14530b.getWidget().getConfig();
        String id2 = rangeIntParameter.getId();
        RangeIntParameter.RangeValue value = rangeIntParameter.getValue();
        com.avito.android.publish.items.int_range.a aVar = new com.avito.android.publish.items.int_range.a((value == null || (from = value.getFrom()) == null) ? null : from.getInt(), ageRangeSlotConfig.getPrefixFrom(), ageRangeSlotConfig.getHintFrom(), 0, 0, 24, null);
        RangeIntParameter.RangeValue value2 = rangeIntParameter.getValue();
        com.avito.android.publish.items.int_range.a aVar2 = new com.avito.android.publish.items.int_range.a((value2 == null || (to2 = value2.getTo()) == null) ? null : to2.getInt(), ageRangeSlotConfig.getPrefixTo(), ageRangeSlotConfig.getHintTo(), 0, 0, 24, null);
        AttributedText errorMessage = rangeIntParameter.getErrorMessage();
        return Collections.singletonList(new com.avito.android.publish.items.int_range.b(id2, aVar, aVar2, errorMessage != null ? new ItemWithState.State.Error.ErrorWithMessage(errorMessage.getText()) : new ItemWithState.State.Normal(null, 1, null), null, 16, null));
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
    }
}
