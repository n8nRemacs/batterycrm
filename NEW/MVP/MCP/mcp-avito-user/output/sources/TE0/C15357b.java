package Te0;

import Se0.C15178b;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.k;
import com.avito.android.publish.C0;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.GroupBlockSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.additional_options.GroupAdditionalOptionsSlot;
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
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: GroupAdditionalOptionBlockSlotWrapper.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LTe0/b;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/auto_group_block/additional_options/GroupAdditionalOptionsSlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Te0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C15357b extends k<GroupAdditionalOptionsSlot> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GroupAdditionalOptionsSlot f15773b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C0 f15774c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public ArrayList f15775d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C15356a f15776e = new C15356a();

    @i31.c
    public C15357b(@InterfaceC41220a @Y61.k GroupAdditionalOptionsSlot groupAdditionalOptionsSlot, @Y61.k C0 c02) {
        this.f15773b = groupAdditionalOptionsSlot;
        this.f15774c = c02;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f15773b;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final z<P2<G0>> h() {
        this.f15775d = l();
        return super.h();
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        Se0.c cVar;
        String displayTitle;
        Object next;
        ArrayList<ParameterSlot> arrayListL = this.f15775d;
        if (arrayListL == null) {
            arrayListL = l();
        }
        GroupAdditionalOptionsSlot groupAdditionalOptionsSlot = this.f15773b;
        GroupBlockSlotConfig groupBlockSlotConfig = (GroupBlockSlotConfig) groupAdditionalOptionsSlot.getWidget().getConfig();
        this.f15776e.getClass();
        StringBuilder sb2 = new StringBuilder();
        int i12 = 0;
        int i13 = 0;
        for (ParameterSlot parameterSlot : arrayListL) {
            if (parameterSlot instanceof SelectParameter) {
                SelectParameter selectParameter = (SelectParameter) parameterSlot;
                String value = selectParameter.getValue();
                if (value != null && value.length() != 0 && (displayTitle = selectParameter.getDisplayTitle()) != null && displayTitle.length() != 0) {
                    int i14 = i13 + 1;
                    if (i13 < 3) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(selectParameter.getDisplayTitle());
                    } else {
                        i12++;
                    }
                    i13 = i14;
                }
            } else if (parameterSlot instanceof MultiselectParameter) {
                StringBuilder sb3 = new StringBuilder();
                MultiselectParameter multiselectParameter = (MultiselectParameter) parameterSlot;
                List<? extends String> value2 = multiselectParameter.getValue();
                if (value2 != null) {
                    for (String str : value2) {
                        Iterator<T> it = multiselectParameter.getValues().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (L.f(((MultiselectParameter.Value) next).getId(), str)) {
                                break;
                            }
                        }
                        MultiselectParameter.Value value3 = (MultiselectParameter.Value) next;
                        String f201827c = value3 != null ? value3.getF201827c() : null;
                        int i15 = i13 + 1;
                        if (i13 < 3) {
                            if (sb3.length() > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(f201827c);
                        } else {
                            i12++;
                        }
                        i13 = i15;
                    }
                }
                if (sb3.length() > 0) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(multiselectParameter.getTitle() + ": " + ((Object) sb3));
                }
            }
        }
        if (sb2.length() == 0) {
            cVar = new Se0.c(groupBlockSlotConfig.getDescription(), groupBlockSlotConfig.getButtonTitle());
        } else {
            if (i12 > 0) {
                sb2.append(" ");
                Map<String, String> plurals = groupBlockSlotConfig.getPlurals();
                String str2 = plurals != null ? plurals.get(PluralsKeys.ONE) : null;
                Map<String, String> plurals2 = groupBlockSlotConfig.getPlurals();
                String str3 = plurals2 != null ? plurals2.get(PluralsKeys.FEW) : null;
                Map<String, String> plurals3 = groupBlockSlotConfig.getPlurals();
                sb2.append(C43066x.a0(C5.f(i12, str2, str3, plurals3 != null ? plurals3.get(PluralsKeys.OTHER) : null), PluralsKeys.CHANGE_KEY, String.valueOf(i12), false));
            }
            cVar = new Se0.c(sb2.toString(), groupBlockSlotConfig.getFilledParametersButtonTitle());
        }
        GroupBlockSlotConfig groupBlockSlotConfig2 = (GroupBlockSlotConfig) groupAdditionalOptionsSlot.getWidget().getConfig();
        return Collections.singletonList(new com.avito.android.publish.slots.auto_group_block.item.c(groupAdditionalOptionsSlot.getId(), groupAdditionalOptionsSlot.getId(), groupBlockSlotConfig2.getTitle(), groupBlockSlotConfig2.getTooltipText(), cVar.f15107b, cVar.f15106a));
    }

    public final ArrayList l() {
        List<ParameterSlot> parameters;
        C15178b c15178b = C15178b.f15105a;
        CategoryParameters categoryParameters = this.f15774c.f231873k0;
        if (categoryParameters == null || (parameters = categoryParameters.getParameters()) == null) {
            parameters = C42784z0.f406748b;
        }
        List<String> fields = ((GroupBlockSlotConfig) this.f15773b.getWidget().getConfig()).getFillParametersStepConfig().getFields();
        c15178b.getClass();
        return C15178b.b(parameters, fields);
    }
}
