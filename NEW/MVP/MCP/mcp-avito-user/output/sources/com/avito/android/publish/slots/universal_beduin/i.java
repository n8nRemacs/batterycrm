package com.avito.android.publish.slots.universal_beduin;

import androidx.compose.runtime.internal.P;
import com.avito.android.beduin_models.BeduinForm;
import com.avito.android.category_parameters.f;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.messenger.conversation.mvi.file_upload.C32102w0;
import com.avito.android.publish.C0;
import com.avito.android.publish.InterfaceC34155z;
import com.avito.android.publish.slots.q;
import com.avito.android.publish.slots.universal_beduin.l;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.universal_beduin.UniversalBeduinResponse;
import com.avito.android.remote.model.category_parameters.slot.universal_beduin.UniversalBeduinSlot;
import com.avito.android.remote.model.category_parameters.slot.universal_beduin.UniversalBeduinSlotConfig;
import com.avito.android.util.InterfaceC35745a5;
import gj.InterfaceC40691b;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import l41.InterfaceC43543a;
import lj.InterfaceC43779a;
import yc.C50213a;

/* compiled from: UniversalBeduinSlotWrapper.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/universal_beduin/i;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/universal_beduin/UniversalBeduinSlot;", "Lcom/avito/android/publish/slots/q;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.android.category_parameters.k<UniversalBeduinSlot> implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final UniversalBeduinSlot f245049b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final H0 f245050c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34155z f245051d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f245052e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f245053f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final AttributesTreeConverter f245054g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C50213a f245055h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f245056i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.universal_beduin.a f245057j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final CategoryParametersConverter f245058k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f245059l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> f245060m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f245061n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.m f245062o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public com.avito.android.beduin_items.item_with_loader.a f245063p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f245064q;

    /* compiled from: UniversalBeduinSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/category_parameters/slot/universal_beduin/UniversalBeduinResponse;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.beduin_items.item_with_loader.a aVarA;
            TypedResult typedResult = (TypedResult) obj;
            i iVar = i.this;
            iVar.f245061n = false;
            com.avito.android.beduin_items.item_with_loader.a aVar = null;
            BeduinForm form = typedResult instanceof TypedResult.Success ? ((UniversalBeduinResponse) ((TypedResult.Success) typedResult).getResult()).getForm() : null;
            if (form != null) {
                com.avito.android.beduin_items.item_with_loader.a aVar2 = iVar.f245063p;
                InterfaceC40691b interfaceC40691b = iVar.f245056i;
                if (aVar2 != null) {
                    InterfaceC43779a interfaceC43779aJ = interfaceC40691b.getF103565k().get(form.getF105312b());
                    if (interfaceC43779aJ == null) {
                        interfaceC43779aJ = interfaceC40691b.j();
                    }
                    com.avito.android.beduin_shared.model.utils.m.b(interfaceC43779aJ, form);
                    aVarA = iVar.f245063p;
                } else {
                    aVarA = com.avito.android.beduin_items.item_with_loader.d.a(interfaceC40691b, form, iVar.f245061n, iVar.f245057j.a());
                }
                aVar = aVarA;
            }
            iVar.f245063p = aVar;
        }
    }

    /* compiled from: UniversalBeduinSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/category_parameters/slot/universal_beduin/UniversalBeduinResponse;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            i.this.f245060m.accept(new f.b(SlotType.UNIVERSAL_BEDUIN, null));
        }
    }

    /* compiled from: UniversalBeduinSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f245067b = new c<>();

        @Override // l41.g
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    @i31.c
    public i(@InterfaceC41220a @Y61.k UniversalBeduinSlot universalBeduinSlot, @Y61.k H0 h02, @Y61.k C0 c02, @Y61.k InterfaceC34155z interfaceC34155z, @Y61.k com.avito.android.details.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k AttributesTreeConverter attributesTreeConverter, @Y61.k C50213a c50213a, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k com.avito.android.publish.slots.universal_beduin.a aVar2, @Y61.k CategoryParametersConverter categoryParametersConverter) {
        this.f245049b = universalBeduinSlot;
        this.f245050c = h02;
        this.f245051d = interfaceC34155z;
        this.f245052e = aVar;
        this.f245053f = interfaceC35745a5;
        this.f245054g = attributesTreeConverter;
        this.f245055h = c50213a;
        this.f245056i = interfaceC40691b;
        this.f245057j = aVar2;
        this.f245058k = categoryParametersConverter;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f245059l = cVar;
        com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f245060m = cVar2;
        l();
        if (!L.f(((UniversalBeduinSlotConfig) universalBeduinSlot.getWidget().getConfig()).getEnableParamsObserve(), Boolean.FALSE)) {
            h hVar = new h(this);
            C41981q0 c41981q0 = c02.f231882t0;
            I0 i0J0 = c41981q0.N(d.f245044b).y(800L, TimeUnit.MILLISECONDS, interfaceC35745a5.c()).j0(interfaceC35745a5.e());
            l.a aVar3 = new l.a(hVar);
            l41.g<? super Throwable> gVar = e.f245045b;
            InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
            cVar.b(i0J0.v0(aVar3, gVar, interfaceC43543a));
            cVar.b(c41981q0.N(f.f245046b).j0(interfaceC35745a5.e()).v0(new l.a(hVar), g.f245047b, interfaceC43543a));
        }
        BeduinForm form = ((UniversalBeduinSlotConfig) universalBeduinSlot.getWidget().getConfig()).getForm();
        if (form != null) {
            this.f245063p = com.avito.android.beduin_items.item_with_loader.d.a(interfaceC40691b, form, this.f245061n, aVar2.a());
        }
        this.f245064q = cVar2;
    }

    @Override // com.avito.android.publish.slots.q
    @Y61.k
    public final z<com.avito.android.category_parameters.f> a() {
        return this.f245064q;
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
        this.f245059l.e();
        io.reactivex.rxjava3.internal.observers.m mVar = this.f245062o;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f245049b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        com.avito.android.beduin_items.item_with_loader.a aVar = this.f245063p;
        return aVar == null ? C42784z0.f406748b : Collections.singletonList(com.avito.android.beduin_items.item_with_loader.a.a(aVar, this.f245061n));
    }

    public final void l() {
        List<ParameterSlot> parameters;
        String url;
        CategoryParameters categoryParametersC0 = this.f245052e.C0();
        if (categoryParametersC0 == null || (parameters = categoryParametersC0.getParameters()) == null || (url = ((UniversalBeduinSlotConfig) this.f245049b.getWidget().getConfig()).getUrl()) == null) {
            return;
        }
        this.f245061n = true;
        io.reactivex.rxjava3.disposables.c cVar = this.f245059l;
        C41823n c41823n = C41823n.f402260b;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c41823n.getClass();
        cVar.b(c41823n.j(500L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).v(new C31684n(this, 13), io.reactivex.rxjava3.internal.functions.a.f401996f));
        LinkedHashMap linkedHashMapJ = P0.j(new Q("analyticsParams[publishSessionId]", this.f245055h.b()), new Q("analyticsParams[fromPage]", this.f245055h.f443212d.name().toLowerCase(Locale.ROOT)));
        String str = this.f245055h.f443213e;
        if (str != null) {
            linkedHashMapJ.put("analyticsParams[itemId]", str);
        }
        io.reactivex.rxjava3.internal.observers.m mVar = this.f245062o;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        H0 h02 = this.f245050c;
        Map<String, String> mapConvertToFieldMap = this.f245058k.convertToFieldMap(this.f245051d.U());
        AttributesTreeConverter attributesTreeConverter = this.f245054g;
        this.f245062o = (io.reactivex.rxjava3.internal.observers.m) h02.t(url, linkedHashMapJ, attributesTreeConverter.convertToParameterFieldMap(attributesTreeConverter.convertToAttributesTree(parameters)), mapConvertToFieldMap).z(this.f245053f.a()).s(this.f245053f.e()).u(new C32102w0(19)).k(new a()).x(new b(), c.f245067b);
    }
}
