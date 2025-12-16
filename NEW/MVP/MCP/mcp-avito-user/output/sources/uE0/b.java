package Ue0;

import Se0.C15178b;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.k;
import com.avito.android.publish.C0;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.GroupBlockSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.car_body_condition.GroupBodyConditionBlockSlot;
import com.avito.android.remote.model.category_parameters.slot.car_body_condition.CarBodyConditionSlot;
import com.avito.android.util.C5;
import com.avito.android.util.P2;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: GroupBodyConditionBlockSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LUe0/b;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/auto_group_block/car_body_condition/GroupBodyConditionBlockSlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b extends k<GroupBodyConditionBlockSlot> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GroupBodyConditionBlockSlot f16528b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C0 f16529c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public ArrayList f16530d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Object f16531e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C15513a f16532f = new C15513a();

    @i31.c
    public b(@InterfaceC41220a @Y61.k GroupBodyConditionBlockSlot groupBodyConditionBlockSlot, @Y61.k C0 c02) {
        this.f16528b = groupBodyConditionBlockSlot;
        this.f16529c = c02;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f16528b;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final z<P2<G0>> h() {
        this.f16530d = m();
        this.f16531e = l();
        return super.h();
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        Se0.c cVar;
        Object objL = this.f16531e;
        if (objL == null) {
            objL = l();
        }
        GroupBodyConditionBlockSlot groupBodyConditionBlockSlot = this.f16528b;
        GroupBlockSlotConfig groupBlockSlotConfig = (GroupBlockSlotConfig) groupBodyConditionBlockSlot.getWidget().getConfig();
        this.f16532f.getClass();
        int size = 0;
        for (ParameterSlot parameterSlot : (Iterable) objL) {
            if (parameterSlot instanceof MultiselectParameter) {
                List<? extends String> value = ((MultiselectParameter) parameterSlot).getValue();
                size += value != null ? value.size() : 0;
            }
        }
        if (size == 0) {
            cVar = new Se0.c(groupBlockSlotConfig.getDescription(), groupBlockSlotConfig.getButtonTitle());
        } else {
            Map<String, String> plurals = groupBlockSlotConfig.getPlurals();
            String str = plurals != null ? plurals.get(PluralsKeys.ONE) : null;
            Map<String, String> plurals2 = groupBlockSlotConfig.getPlurals();
            String str2 = plurals2 != null ? plurals2.get(PluralsKeys.FEW) : null;
            Map<String, String> plurals3 = groupBlockSlotConfig.getPlurals();
            cVar = new Se0.c(C43066x.a0(C5.f(size, str, str2, plurals3 != null ? plurals3.get(PluralsKeys.OTHER) : null), PluralsKeys.CHANGE_KEY, String.valueOf(size), false), groupBlockSlotConfig.getFilledParametersButtonTitle());
        }
        GroupBlockSlotConfig groupBlockSlotConfig2 = (GroupBlockSlotConfig) groupBodyConditionBlockSlot.getWidget().getConfig();
        return Collections.singletonList(new com.avito.android.publish.slots.auto_group_block.item.c(groupBodyConditionBlockSlot.getId(), groupBodyConditionBlockSlot.getId(), groupBlockSlotConfig2.getTitle(), groupBlockSlotConfig2.getTooltipText(), cVar.f15107b, cVar.f15106a));
    }

    public final List<MultiselectParameter> l() {
        Object next;
        List<ParameterSlot> parameters;
        ArrayList arrayListM = this.f16530d;
        if (arrayListM == null) {
            arrayListM = m();
        }
        Iterator it = arrayListM.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof CarBodyConditionSlot) {
                break;
            }
        }
        CarBodyConditionSlot carBodyConditionSlot = (CarBodyConditionSlot) (next instanceof CarBodyConditionSlot ? next : null);
        if (carBodyConditionSlot == null) {
            return C42784z0.f406748b;
        }
        C15178b c15178b = C15178b.f15105a;
        CategoryParameters categoryParameters = this.f16529c.f231873k0;
        if (categoryParameters == null || (parameters = categoryParameters.getParameters()) == null) {
            parameters = C42784z0.f406748b;
        }
        c15178b.getClass();
        return C15178b.a(carBodyConditionSlot, parameters);
    }

    public final ArrayList m() {
        List<ParameterSlot> parameters;
        C15178b c15178b = C15178b.f15105a;
        CategoryParameters categoryParameters = this.f16529c.f231873k0;
        if (categoryParameters == null || (parameters = categoryParameters.getParameters()) == null) {
            parameters = C42784z0.f406748b;
        }
        List<String> fields = ((GroupBlockSlotConfig) this.f16528b.getWidget().getConfig()).getFillParametersStepConfig().getFields();
        c15178b.getClass();
        return C15178b.b(parameters, fields);
    }
}
