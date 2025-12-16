package com.avito.android.delivery_location_suggest.mvi;

import Gv.InterfaceC13920a;
import com.avito.android.delivery_location_suggest.mvi.entity.DeliveryLocationSuggestInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import nF.C44245a;

/* compiled from: DeliveryLocationSuggestActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/delivery_location_suggest/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LGv/a;", "Lcom/avito/android/delivery_location_suggest/mvi/entity/DeliveryLocationSuggestInternalAction;", "LGv/c;", "a", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC13920a, DeliveryLocationSuggestInternalAction, Gv.c> {

    /* renamed from: d, reason: collision with root package name */
    public static final long f135149d;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.delivery_location_suggest.mvi.useCase.e f135150a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.delivery_location_suggest.mvi.useCase.c f135151b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C44245a f135152c;

    /* compiled from: DeliveryLocationSuggestActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_location_suggest/mvi/a$a;", "", "<init>", "()V", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.delivery_location_suggest.mvi.a$a, reason: collision with other inner class name */
    public static final class C4093a {
        public /* synthetic */ C4093a(C42822w c42822w) {
            this();
        }

        public C4093a() {
        }
    }

    static {
        new C4093a(null);
        e.a aVar = kotlin.time.e.f410651c;
        f135149d = kotlin.time.g.g(300, DurationUnit.f410633e);
    }

    @Inject
    public a(@Y61.k com.avito.android.delivery_location_suggest.mvi.useCase.e eVar, @Y61.k com.avito.android.delivery_location_suggest.mvi.useCase.c cVar, @Y61.k C44245a c44245a) {
        this.f135150a = eVar;
        this.f135151b = cVar;
        this.f135152c = c44245a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.C(new d(this, aVar, null), c43197r1), C43175k.Y(C43175k.p(new b(c43197r1), f135149d), new c(null, this)));
    }

    @Override // com.avito.android.arch.mvi.a
    public final /* bridge */ /* synthetic */ InterfaceC43160i<DeliveryLocationSuggestInternalAction> b(InterfaceC13920a interfaceC13920a, Gv.c cVar) {
        return c(interfaceC13920a);
    }

    @Y61.k
    public final InterfaceC43160i c(@Y61.k InterfaceC13920a interfaceC13920a) {
        if (!(interfaceC13920a instanceof InterfaceC13920a.b)) {
            if (interfaceC13920a instanceof InterfaceC13920a.C0379a) {
                return new C43210w(new DeliveryLocationSuggestInternalAction.QueryChanged(((InterfaceC13920a.C0379a) interfaceC13920a).f6770a));
            }
            throw new NoWhenBranchMatchedException();
        }
        C44245a c44245a = this.f135152c;
        c44245a.getClass();
        kotlin.reflect.n<Object> nVar = C44245a.f414956i[5];
        if (!((Boolean) c44245a.f414962g.a().invoke()).booleanValue()) {
            return new C43210w(new DeliveryLocationSuggestInternalAction.SuggestSelected(((InterfaceC13920a.b) interfaceC13920a).f6771a));
        }
        return this.f135151b.a(((InterfaceC13920a.b) interfaceC13920a).f6771a);
    }
}
