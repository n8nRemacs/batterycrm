package com.avito.android.publish.slots.group_inlined_block;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.category_parameters.f;
import com.avito.android.items.ItemWithState;
import com.avito.android.publish.C0;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.SimpleParametersTree;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.group_inlined_block_slot.GroupInlinedBlockSlot;
import com.avito.android.remote.model.category_parameters.slot.group_inlined_block_slot.GroupInlinedBlockSlotConfig;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.P2;
import com.avito.android.validation.C36018l;
import com.avito.android.validation.d1;
import com.avito.android.validation.n1;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: GroupInlinedBlockSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/group_inlined_block/m;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/group_inlined_block_slot/GroupInlinedBlockSlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m extends com.avito.android.category_parameters.k<GroupInlinedBlockSlot> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GroupInlinedBlockSlot f244043b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.category_parameters.a f244044c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C0 f244045d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final d1 f244046e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f244047f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Context f244048g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Theme f244049h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public ItemWithState.State f244050i = new ItemWithState.State.Normal(null, 1, null);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f244051j = C42727D.c(new b());

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f244052k = C42727D.c(new a());

    /* compiled from: GroupInlinedBlockSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/avito/conveyor_item/a;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<List<com.avito.conveyor_item.a>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final List<com.avito.conveyor_item.a> invoke() {
            m mVar = m.this;
            ArrayList arrayList = new ArrayList(com.avito.android.category_parameters.a.c(mVar.f244044c, new UV0.c((List) mVar.f244051j.getValue()), null, null, mVar.f244049h, 14));
            Iterator it = arrayList.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                if (((com.avito.conveyor_item.a) it.next()) instanceof ParameterElement.p) {
                    break;
                }
                i12++;
            }
            Integer numValueOf = Integer.valueOf(i12);
            if (i12 == -1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                arrayList.set(iIntValue, ParameterElement.p.f((ParameterElement.p) ((com.avito.conveyor_item.a) arrayList.get(iIntValue)), null, null, null, null, 528482303));
            }
            return arrayList;
        }
    }

    /* compiled from: GroupInlinedBlockSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<List<? extends ParameterSlot>> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends ParameterSlot> invoke() {
            ParameterSlot parameterSlot;
            Object next;
            m mVar = m.this;
            mVar.getClass();
            ArrayList arrayList = new ArrayList();
            CategoryParameters categoryParameters = mVar.f244045d.f231873k0;
            List<ParameterSlot> parameters = categoryParameters != null ? categoryParameters.getParameters() : null;
            List<String> params = ((GroupInlinedBlockSlotConfig) mVar.f244043b.getWidget().getConfig()).getParams();
            if (params != null) {
                for (String str : params) {
                    if (parameters != null) {
                        Iterator<T> it = parameters.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (L.f(((ParameterSlot) next).getId(), str)) {
                                break;
                            }
                        }
                        parameterSlot = (ParameterSlot) next;
                    } else {
                        parameterSlot = null;
                    }
                    if (parameterSlot != null) {
                        arrayList.add(parameterSlot);
                    }
                }
            }
            return arrayList.isEmpty() ? C42784z0.f406748b : arrayList;
        }
    }

    @i31.c
    public m(@InterfaceC41220a @Y61.k GroupInlinedBlockSlot groupInlinedBlockSlot, @Y61.k com.avito.android.category_parameters.a aVar, @Y61.k C0 c02, @Y61.k d1 d1Var, @Y61.k com.avito.android.util.text.a aVar2, @Y61.k Context context) {
        this.f244043b = groupInlinedBlockSlot;
        this.f244044c = aVar;
        this.f244045d = c02;
        this.f244046e = d1Var;
        this.f244047f = aVar2;
        this.f244048g = context;
        this.f244049h = c02.ve();
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final z<P2<SuccessResult>> c() {
        Object next;
        Object next2;
        Iterator it = ((List) this.f244052k.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof com.avito.android.items.d) {
                break;
            }
        }
        if (!(next instanceof com.avito.android.items.d)) {
            next = null;
        }
        com.avito.android.items.d dVar = (com.avito.android.items.d) next;
        if (dVar == null) {
            dVar = null;
        }
        Iterator it2 = ((List) this.f244051j.getValue()).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (L.f(((ParameterSlot) next2).getId(), dVar != null ? dVar.getF309979b() : null)) {
                break;
            }
        }
        ParameterSlot parameterSlot = (ParameterSlot) next2;
        if (dVar != null && parameterSlot != null) {
            l(parameterSlot, dVar);
        }
        return z.c0(this.f244050i instanceof ItemWithState.State.Error ? new P2.a(new GroupInlinedBlockSlotError()) : new P2.b(new SuccessResult(null)));
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final com.avito.android.category_parameters.f d(@Y61.k com.avito.conveyor_item.a aVar) {
        Object next;
        if (!(aVar instanceof ItemWithState)) {
            return f.c.f117644b;
        }
        Iterator it = ((List) this.f244051j.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((ParameterSlot) next).getId(), aVar.getF309979b())) {
                break;
            }
        }
        ParameterSlot parameterSlot = (ParameterSlot) next;
        if (parameterSlot == null) {
            return f.c.f117644b;
        }
        l(parameterSlot, (ItemWithState) aVar);
        return new f.b(SlotType.GROUP_INLINED_BLOCK, null);
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f244043b;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final z<P2<G0>> h() {
        this.f244043b.setParameters((List) this.f244051j.getValue());
        return super.h();
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        GroupInlinedBlockSlot groupInlinedBlockSlot = this.f244043b;
        return C42745f0.e0(new com.avito.android.publish.slots.group_inlined_block.item.a(groupInlinedBlockSlot.getId(), ((GroupInlinedBlockSlotConfig) groupInlinedBlockSlot.getWidget().getConfig()).getTitle(), ((GroupInlinedBlockSlotConfig) groupInlinedBlockSlot.getWidget().getConfig()).getTooltipText(), C42745f0.M0((List) this.f244052k.getValue()), this.f244050i));
    }

    public final void l(ParameterSlot parameterSlot, ItemWithState itemWithState) {
        ItemWithState.State warning;
        ItemWithState.State normal;
        EditableParameter<?> editableParameter = parameterSlot instanceof EditableParameter ? (EditableParameter) parameterSlot : null;
        int i12 = 0;
        n1 n1VarA = editableParameter != null ? this.f244046e.a(editableParameter, new SimpleParametersTree((List) this.f244051j.getValue()), false) : null;
        if (n1VarA != null) {
            if (n1VarA instanceof n1.c) {
                normal = new ItemWithState.State.Normal(null, 1, null);
            } else {
                if (n1VarA instanceof n1.a.c) {
                    warning = new ItemWithState.State.Error.ErrorWithMessage(C36018l.b((n1.a.c) n1VarA, itemWithState));
                } else if (n1VarA instanceof n1.a.b) {
                    warning = new ItemWithState.State.Error.ErrorWithMessage(((n1.a.b) n1VarA).f319404c);
                } else if (n1VarA instanceof n1.a.C9897a) {
                    com.avito.android.util.text.a aVar = this.f244047f;
                    Context context = this.f244048g;
                    AttributedText attributedText = ((n1.a.C9897a) n1VarA).f319408g;
                    CharSequence charSequenceC = aVar.c(context, attributedText);
                    if (charSequenceC == null) {
                        charSequenceC = attributedText.getText();
                    }
                    warning = new ItemWithState.State.Error.ErrorWithMessage(charSequenceC);
                } else {
                    warning = new ItemWithState.State.Warning(((n1.a) n1VarA).f319404c);
                }
                normal = warning;
            }
            ParameterElement.p pVar = itemWithState instanceof ParameterElement.p ? (ParameterElement.p) itemWithState : null;
            InterfaceC42726C interfaceC42726C = this.f244052k;
            Iterator it = ((List) interfaceC42726C.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                com.avito.conveyor_item.a aVar2 = (com.avito.conveyor_item.a) it.next();
                if (pVar != null && aVar2.getF268775b() == pVar.f117182c) {
                    break;
                } else {
                    i12++;
                }
            }
            if (i12 != -1 && pVar != null) {
                ((List) interfaceC42726C.getValue()).set(i12, ParameterElement.p.f(pVar, null, null, normal, null, 536862719));
            }
            this.f244050i = normal;
        }
    }
}
