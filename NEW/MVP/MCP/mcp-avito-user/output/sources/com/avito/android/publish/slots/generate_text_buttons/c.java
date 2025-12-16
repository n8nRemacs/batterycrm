package com.avito.android.publish.slots.generate_text_buttons;

import androidx.compose.runtime.internal.P;
import com.avito.android.publish.slots.generate_text_buttons.item.GenerateTextButtonsItem;
import com.avito.android.publish.slots.q;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.generate_text_buttons.GenerateTextButtonsSlot;
import com.avito.android.remote.model.category_parameters.slot.generate_text_buttons.GenerateTextButtonsSlotConfig;
import com.avito.android.util.R0;
import dl0.InterfaceC39749a;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: GenerateTextButtonsSlotWrapper.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/generate_text_buttons/c;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/generate_text_buttons/GenerateTextButtonsSlot;", "Lcom/avito/android/publish/slots/q;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c extends com.avito.android.category_parameters.k<GenerateTextButtonsSlot> implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GenerateTextButtonsSlot f243945b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39749a f243946c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f243947d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final GenerateTextButtonsSlotConfig f243948e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final ParametersTree f243949f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final CharParameter f243950g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final CharParameter f243951h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> f243952i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f243953j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public String f243954k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public GenerateTextButtonsItem.State f243955l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f243956m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f243957n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final C43238h f243958o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public N0 f243959p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public N0 f243960q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public N0 f243961r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f243962s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f243963t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f243964u;

    /* compiled from: GenerateTextButtonsSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/publish/slots/generate_text_buttons/item/GenerateTextButtonsItem$a;", "invoke", "()Lcom/avito/android/publish/slots/generate_text_buttons/item/GenerateTextButtonsItem$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<GenerateTextButtonsItem.a> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final GenerateTextButtonsItem.a invoke() {
            c cVar = c.this;
            GenerateTextButtonsSlotConfig.ActionButton generateTextButton = cVar.f243948e.getGenerateTextButton();
            return new GenerateTextButtonsItem.a(new com.avito.android.publish.slots.generate_text_buttons.b(cVar), generateTextButton.getTitle(), generateTextButton.getIconName());
        }
    }

    /* compiled from: GenerateTextButtonsSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/publish/slots/generate_text_buttons/item/GenerateTextButtonsItem$a;", "invoke", "()Lcom/avito/android/publish/slots/generate_text_buttons/item/GenerateTextButtonsItem$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<GenerateTextButtonsItem.a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final GenerateTextButtonsItem.a invoke() {
            c cVar = c.this;
            GenerateTextButtonsSlotConfig.ActionButton previousTextButton = cVar.f243948e.getPreviousTextButton();
            return new GenerateTextButtonsItem.a(new f(cVar), previousTextButton.getTitle(), previousTextButton.getIconName());
        }
    }

    /* compiled from: GenerateTextButtonsSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/publish/slots/generate_text_buttons/item/GenerateTextButtonsItem$a;", "invoke", "()Lcom/avito/android/publish/slots/generate_text_buttons/item/GenerateTextButtonsItem$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.slots.generate_text_buttons.c$c, reason: collision with other inner class name */
    public static final class C7309c extends N implements Y41.a<GenerateTextButtonsItem.a> {
        public C7309c() {
            super(0);
        }

        @Override // Y41.a
        public final GenerateTextButtonsItem.a invoke() {
            c cVar = c.this;
            GenerateTextButtonsSlotConfig.ActionButton regenerateTextButton = cVar.f243948e.getRegenerateTextButton();
            return new GenerateTextButtonsItem.a(new h(cVar), regenerateTextButton.getTitle(), regenerateTextButton.getIconName());
        }
    }

    @i31.c
    public c(@InterfaceC41220a @Y61.k GenerateTextButtonsSlot generateTextButtonsSlot, @Y61.k com.avito.android.details.a aVar, @Y61.k InterfaceC39749a interfaceC39749a, @Y61.k R0 r02) {
        this.f243945b = generateTextButtonsSlot;
        this.f243946c = interfaceC39749a;
        this.f243947d = r02;
        this.f243948e = (GenerateTextButtonsSlotConfig) generateTextButtonsSlot.getWidget().getConfig();
        ParametersTree parametersTreeWa = aVar.wa();
        this.f243949f = parametersTreeWa;
        CharParameter charParameter = (CharParameter) (parametersTreeWa != null ? parametersTreeWa.findParameter(((GenerateTextButtonsSlotConfig) generateTextButtonsSlot.getWidget().getConfig()).getAssociatedParameterId()) : null);
        this.f243950g = charParameter;
        ParameterSlot parameterSlotFindParameter = parametersTreeWa != null ? parametersTreeWa.findParameter("2922") : null;
        this.f243951h = parameterSlotFindParameter instanceof CharParameter ? (CharParameter) parameterSlotFindParameter : null;
        com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f243952i = cVar;
        this.f243953j = cVar;
        this.f243954k = UUID.randomUUID().toString();
        this.f243955l = GenerateTextButtonsItem.State.f243983b;
        this.f243957n = new LinkedHashSet();
        this.f243958o = U.a(r02.b());
        this.f243962s = C42727D.c(new a());
        this.f243963t = C42727D.c(new b());
        this.f243964u = C42727D.c(new C7309c());
        charParameter.setValueChangesListener(new d(this));
    }

    @Override // com.avito.android.publish.slots.q
    @Y61.k
    public final z<com.avito.android.category_parameters.f> a() {
        return this.f243953j;
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
        N0 n02 = this.f243959p;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        N0 n03 = this.f243960q;
        if (n03 != null) {
            ((V0) n03).c(null);
        }
        N0 n04 = this.f243961r;
        if (n04 != null) {
            ((V0) n04).c(null);
        }
        C43259k.d(this.f243958o, null, null, new i(this, null), 3);
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f243945b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        GenerateTextButtonsSlot generateTextButtonsSlot = this.f243945b;
        return Collections.singletonList(new GenerateTextButtonsItem(generateTextButtonsSlot.getId(), (GenerateTextButtonsItem.a) this.f243962s.getValue(), (GenerateTextButtonsItem.a) this.f243963t.getValue(), (GenerateTextButtonsItem.a) this.f243964u.getValue(), this.f243955l, generateTextButtonsSlot.getMotivation()));
    }
}
