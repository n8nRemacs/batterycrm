package com.avito.android.publish.details;

import android.os.Parcelable;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.SimpleParametersTree;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.InlineFillParametersStepConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: PublishDetailsInfoProvider.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/s0;", "Lcom/avito/android/publish/details/S0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.details.s0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33787s0 implements S0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.C0 f234917b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f234918c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f234919d = C42727D.c(new a());

    /* compiled from: PublishDetailsInfoProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.details.s0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<CategoryPublishStep.Params> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final CategoryPublishStep.Params invoke() {
            SlotWidget widget;
            C33787s0 c33787s0 = C33787s0.this;
            CategoryParameters categoryParameters = c33787s0.f234917b.f231873k0;
            ParameterSlot parameterSlotFindParameter = categoryParameters != null ? categoryParameters.findParameter(c33787s0.f234918c) : null;
            Slot slot = parameterSlotFindParameter instanceof Slot ? (Slot) parameterSlotFindParameter : null;
            Parcelable config = (slot == null || (widget = slot.getWidget()) == null) ? null : widget.getConfig();
            InlineFillParametersStepConfig inlineFillParametersStepConfig = config instanceof InlineFillParametersStepConfig ? (InlineFillParametersStepConfig) config : null;
            if (inlineFillParametersStepConfig != null) {
                return inlineFillParametersStepConfig.getFillParametersStepConfig();
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public C33787s0(@Y61.k com.avito.android.publish.C0 c02, @Y61.k String str) {
        this.f234917b = c02;
        this.f234918c = str;
    }

    @Override // com.avito.android.details.a
    @Y61.l
    public final CategoryParameters C0() {
        return this.f234917b.f231873k0;
    }

    @Override // com.avito.android.publish.details.S0
    public final boolean Ma() {
        return true;
    }

    @Override // com.avito.android.publish.InterfaceC34155z
    @Y61.k
    public final Navigation U() {
        return this.f234917b.f231861Y.getNavigation();
    }

    @Override // com.avito.android.publish.details.S0
    @Y61.l
    public final String Y7() {
        return this.f234917b.f231865c0;
    }

    @Override // com.avito.android.publish.details.InterfaceC33675a
    @Y61.k
    public final CategoryPublishStep a() {
        return (CategoryPublishStep.Params) this.f234919d.getValue();
    }

    @Override // com.avito.android.details.e
    @Y61.k
    public final ParametersTree wa() {
        List<ParameterSlot> parameters;
        Object next;
        CategoryParameters categoryParameters = this.f234917b.f231873k0;
        if (categoryParameters == null || (parameters = categoryParameters.getParameters()) == null) {
            parameters = C42784z0.f406748b;
        }
        List<String> fields = ((CategoryPublishStep.Params) this.f234919d.getValue()).getFields();
        ArrayList arrayList = new ArrayList();
        for (String str : fields) {
            Iterator<T> it = parameters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.L.f(((ParameterSlot) next).getId(), str)) {
                    break;
                }
            }
            ParameterSlot parameterSlot = (ParameterSlot) next;
            if (parameterSlot != null) {
                arrayList.add(parameterSlot);
            }
        }
        return new SimpleParametersTree(arrayList);
    }
}
