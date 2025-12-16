package com.avito.android.publish.slots;

import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.f;
import com.avito.android.publish.C0;
import com.avito.android.publish.InterfaceC34155z;
import com.avito.android.publish.O;
import com.avito.android.publish.slots.i;
import com.avito.android.remote.H0;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.ItemBrief;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.TypedResultKt;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.auto_publish.AutoPublishResponse;
import com.avito.android.remote.model.category_parameters.slot.auto_publish.AutoPublishSlot;
import com.avito.android.remote.model.category_parameters.slot.auto_publish.AutoPublishSlotConfig;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import io.reactivex.rxjava3.internal.operators.observable.E;
import io.reactivex.rxjava3.internal.operators.observable.L0;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import l41.InterfaceC43543a;
import yc.C50213a;

/* compiled from: AutoPublishSlotWrapper.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/a;", "Lcom/avito/android/category_parameters/j;", "Lcom/avito/android/remote/model/category_parameters/slot/auto_publish/AutoPublishSlot;", "Lcom/avito/android/publish/slots/q;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.slots.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34116a extends com.avito.android.category_parameters.j<AutoPublishSlot> implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AutoPublishSlot f242777b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final H0 f242778c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34155z f242779d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f242780e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final CategoryParametersConverter f242781f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C50213a f242782g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f242783h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Pd0.v f242784i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final O f242785j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final ItemBrief f242786k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final BooleanParameter f242787l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final List<String> f242788m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f242789n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> f242790o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f242791p;

    /* compiled from: AutoPublishSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/category_parameters/slot/auto_publish/AutoPublishResponse;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.slots.a$a, reason: collision with other inner class name */
    public static final class C7280a<T> implements l41.g {
        public C7280a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C34116a.this.f242784i.B();
        }
    }

    /* compiled from: AutoPublishSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/category_parameters/slot/auto_publish/AutoPublishResponse;", "it", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.slots.a$b */
    public static final class b<T, R> implements l41.o {
        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            C34116a.this.f242784i.z((Throwable) obj);
            return TypedResultKt.toTyped((ApiError) com.avito.android.remote.error.j.d(2, ""));
        }
    }

    /* compiled from: AutoPublishSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/category_parameters/slot/auto_publish/AutoPublishResponse;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.slots.a$c */
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            boolean z12 = typedResult instanceof TypedResult.Success;
            C34116a c34116a = C34116a.this;
            if (z12 && ((AutoPublishResponse) ((TypedResult.Success) typedResult).getResult()).getAvailable()) {
                c34116a.f242777b.setParameters(Collections.singletonList(c34116a.f242787l));
            } else {
                c34116a.f242777b.setParameters(C42784z0.f406748b);
            }
            c34116a.f242790o.accept(new f.b(SlotType.AUTO_PUBLISH, null));
        }
    }

    /* compiled from: AutoPublishSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.slots.a$d */
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f242795b = new d<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed on checkAutoPublish", (Throwable) obj);
        }
    }

    @i31.c
    public C34116a(@InterfaceC41220a @Y61.k AutoPublishSlot autoPublishSlot, @Y61.k H0 h02, @Y61.k C0 c02, @Y61.k InterfaceC34155z interfaceC34155z, @Y61.k com.avito.android.details.a aVar, @Y61.k CategoryParametersConverter categoryParametersConverter, @Y61.k C50213a c50213a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k Pd0.v vVar, @Y61.k O o12) {
        this.f242777b = autoPublishSlot;
        this.f242778c = h02;
        this.f242779d = interfaceC34155z;
        this.f242780e = aVar;
        this.f242781f = categoryParametersConverter;
        this.f242782g = c50213a;
        this.f242783h = interfaceC35745a5;
        this.f242784i = vVar;
        this.f242785j = o12;
        this.f242786k = c02.f231867e0;
        this.f242787l = ((AutoPublishSlotConfig) autoPublishSlot.getWidget().getConfig()).getField();
        List<String> relatedFields = ((AutoPublishSlotConfig) autoPublishSlot.getWidget().getConfig()).getRelatedFields();
        this.f242788m = relatedFields == null ? C42784z0.f406748b : relatedFields;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f242789n = cVar;
        com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f242790o = cVar2;
        if (!L.f(((AutoPublishSlotConfig) autoPublishSlot.getWidget().getConfig()).getReadyToDisplay(), Boolean.TRUE)) {
            j();
        }
        f fVar = new f(this);
        l41.r rVar = C34120b.f243117b;
        C41981q0 c41981q0 = c02.f231882t0;
        E eY2 = c41981q0.N(rVar).y(500L, TimeUnit.MILLISECONDS, interfaceC35745a5.c());
        i.a aVar2 = new i.a(fVar);
        l41.g<? super Throwable> gVar = com.avito.android.publish.slots.c.f243118b;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        cVar.b(eY2.v0(aVar2, gVar, interfaceC43543a));
        cVar.b(c41981q0.N(com.avito.android.publish.slots.d.f243423b).v0(new i.a(fVar), e.f243866b, interfaceC43543a));
        this.f242791p = new C41981q0(cVar2);
    }

    @Override // com.avito.android.publish.slots.q
    @Y61.k
    public final io.reactivex.rxjava3.core.z<com.avito.android.category_parameters.f> a() {
        return this.f242791p;
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
        this.f242789n.e();
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final com.avito.android.category_parameters.f d(@Y61.k com.avito.conveyor_item.a aVar) {
        if (aVar instanceof com.avito.android.items.b) {
            BooleanParameter booleanParameter = this.f242787l;
            if (L.f(booleanParameter.getId(), aVar.getF268425c())) {
                booleanParameter.setValue(Boolean.valueOf(((com.avito.android.items.b) aVar).f173929d));
            }
        }
        return f.c.f117644b;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f242777b;
    }

    public final void j() {
        List<ParameterSlot> parameters;
        CategoryParameters categoryParametersC0 = this.f242780e.C0();
        if (categoryParametersC0 == null || (parameters = categoryParametersC0.getParameters()) == null) {
            return;
        }
        this.f242784i.p();
        Navigation navigationU = this.f242779d.U();
        CategoryParametersConverter categoryParametersConverter = this.f242781f;
        Map<String, String> mapConvertToFieldMap = categoryParametersConverter.convertToFieldMap(navigationU);
        Map<String, String> mapConvertToFieldMap2 = categoryParametersConverter.convertToFieldMap(parameters);
        ItemBrief itemBrief = this.f242786k;
        L0 l0M0 = this.f242778c.M(mapConvertToFieldMap, mapConvertToFieldMap2, itemBrief != null ? itemBrief.getId() : null, this.f242782g.b()).K(new C7280a()).m0(new b());
        InterfaceC35745a5 interfaceC35745a5 = this.f242783h;
        this.f242789n.b(l0M0.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).v0(new c(), d.f242795b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }
}
