package com.avito.android.publish.details;

import af0.InterfaceC19882a;
import android.annotation.SuppressLint;
import androidx.view.AbstractC22991Y;
import androidx.view.C23071x;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.K1;
import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import com.avito.android.publish.slots.PublishSlotBadResponse;
import com.avito.android.publish.slots.accordion.AccordionSlotError;
import com.avito.android.publish.slots.contact_info.error.PhoneReverificationError;
import com.avito.android.publish.slots.contact_method.ContactMethodEmptyException;
import com.avito.android.publish.slots.group_inlined_block.GroupInlinedBlockSlotError;
import com.avito.android.publish.slots.iac_devices.IacDevicesNoCheckedDeviceForProError;
import com.avito.android.publish.slots.iac_devices.IacPermissionsNotGrantedError;
import com.avito.android.publish.slots.sleeping_places.SleepingPlacesSlotValidationError;
import com.avito.android.publish.slots.user_verification.UserVerificationError;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.error.PhoneVerificationError;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;
import l41.InterfaceC43543a;

/* compiled from: PublishDetailsSlotValidator.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/details/y1;", "Lcom/avito/android/publish/details/w1;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.details.y1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33806y1 implements InterfaceC33800w1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.C0 f235091a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f235092b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f235093c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19882a f235094d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.Q1 f235095e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC33678b> f235096f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f235097g = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<K1.AbstractC33668b> f235098h = new com.avito.android.util.architecture_components.D<>();

    /* compiled from: PublishDetailsSlotValidator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/y1$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.details.y1$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final P2<SuccessResult> f235099a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Slot<?> f235100b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k P2<? super SuccessResult> p22, @Y61.l Slot<?> slot) {
            this.f235099a = p22;
            this.f235100b = slot;
        }
    }

    /* compiled from: PublishDetailsSlotValidator.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/SuccessResult;", "it", "Lcom/avito/android/publish/details/y1$a;", "apply", "(Lcom/avito/android/util/P2;)Lcom/avito/android/publish/details/y1$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.y1$b */
    public static final class b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.category_parameters.j<? extends Slot<?>> f235101b;

        public b(com.avito.android.category_parameters.j<? extends Slot<?>> jVar) {
            this.f235101b = jVar;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return new a((P2) obj, this.f235101b.g());
        }
    }

    /* compiled from: PublishDetailsSlotValidator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "kotlin.jvm.PlatformType", "args", "Lcom/avito/android/publish/details/y1$a;", "apply", "([Ljava/lang/Object;)Lcom/avito/android/publish/details/y1$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.y1$c */
    public static final class c<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T, R> f235102b = new c<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            for (Object obj2 : (Object[]) obj) {
                if (obj2 instanceof a) {
                    a aVar = (a) obj2;
                    if (aVar.f235099a instanceof P2.a) {
                        return aVar;
                    }
                }
            }
            return new a(new P2.b(kotlin.G0.f406611a), null);
        }
    }

    /* compiled from: PublishDetailsSlotValidator.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/details/y1$a;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/details/y1$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.y1$d */
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f235103b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.l<K1.C33667a, kotlin.G0> f235104c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C33806y1 f235105d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Set<com.avito.android.category_parameters.j<? extends Slot<?>>> f235106e;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Y41.a<kotlin.G0> aVar, Y41.l<? super K1.C33667a, kotlin.G0> lVar, C33806y1 c33806y1, Set<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> set) {
            this.f235103b = aVar;
            this.f235104c = lVar;
            this.f235105d = c33806y1;
            this.f235106e = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            a aVar = (a) obj;
            P2<SuccessResult> p22 = aVar.f235099a;
            boolean z12 = p22 instanceof P2.b;
            Y41.a<kotlin.G0> aVar2 = this.f235103b;
            if (z12) {
                aVar2.invoke();
                return;
            }
            if (!(p22 instanceof P2.a)) {
                kotlin.jvm.internal.L.f(p22, P2.c.f318721a);
                return;
            }
            ApiError apiError = ((P2.a) p22).f318719a;
            String str = apiError + ": " + com.avito.android.error.z.i(apiError);
            boolean z13 = apiError instanceof PublishSlotBadResponse;
            boolean z14 = !z13;
            Slot<?> slot = aVar.f235100b;
            this.f235104c.invoke(new K1.C33667a(slot != null ? slot.getId() : null, str, z14, null, 8, null));
            boolean z15 = apiError instanceof PhoneVerificationError;
            final C33806y1 c33806y1 = this.f235105d;
            if (z15) {
                c33806y1.f235098h.setValue(new K1.AbstractC33668b.g(c33806y1.f235094d.a()));
                return;
            }
            if (apiError instanceof PhoneReverificationError) {
                PhoneReverificationError phoneReverificationError = (PhoneReverificationError) apiError;
                c33806y1.f235098h.setValue(new K1.AbstractC33668b.h(phoneReverificationError.f243251c, phoneReverificationError.f243252d, phoneReverificationError.f243253e, phoneReverificationError.f243254f));
                return;
            }
            if (apiError instanceof IacPermissionsNotGrantedError) {
                c33806y1.getClass();
                c33806y1.f235098h.setValue(new K1.AbstractC33668b.c(((IacPermissionsNotGrantedError) apiError).f244064c, new D1(aVar2), new G1(this.f235106e, c33806y1, aVar2)));
                return;
            }
            if (apiError instanceof IacDevicesNoCheckedDeviceForProError) {
                com.avito.android.Q1 q12 = c33806y1.f235095e;
                q12.getClass();
                kotlin.reflect.n<Object> nVar = com.avito.android.Q1.f67448x0[39];
                if (((Boolean) q12.f67461M.a().invoke()).booleanValue()) {
                    c33806y1.f235096f.get().e7();
                    return;
                } else {
                    c33806y1.f235098h.setValue(new K1.AbstractC33668b.j(apiError.getF244063c()));
                    return;
                }
            }
            if (z13) {
                PublishSlotBadResponse publishSlotBadResponse = (PublishSlotBadResponse) apiError;
                c33806y1.f235098h.setValue(new K1.AbstractC33668b.i(publishSlotBadResponse.f242774c, publishSlotBadResponse.f242775d, publishSlotBadResponse.f242776e));
                return;
            }
            if (apiError instanceof ApiError.PretendError) {
                c33806y1.f235091a.ze(((ApiError.PretendError) apiError).f253393b.getErrors());
                return;
            }
            if (apiError instanceof com.avito.android.remote.error.r) {
                Map<String, String> mapC = ((com.avito.android.remote.error.r) apiError).c();
                c33806y1.getClass();
                c33806y1.f235097g.b(io.reactivex.rxjava3.core.z.c0(mapC).U(C33809z1.f235115b).H0().F().j0(c33806y1.f235092b.e()).F(new InterfaceC43543a() { // from class: com.avito.android.publish.details.x1
                    @Override // l41.InterfaceC43543a
                    public final void run() {
                        c33806y1.f235096f.get().e7();
                    }
                }).v0(new A1(c33806y1), B1.f232624b, io.reactivex.rxjava3.internal.functions.a.f401993c));
                return;
            }
            if (apiError instanceof ContactMethodEmptyException ? true : apiError instanceof AccordionSlotError ? true : apiError instanceof UserVerificationError) {
                c33806y1.f235096f.get().B9(new PublishDetailsFlowTracker.FlowContext[0]);
                return;
            }
            if (apiError instanceof SleepingPlacesSlotValidationError) {
                c33806y1.f235096f.get().e7();
            } else if (apiError instanceof GroupInlinedBlockSlotError) {
                c33806y1.f235096f.get().e7();
            } else {
                c33806y1.f235098h.setValue(new K1.AbstractC33668b.j(apiError.getF244063c()));
            }
        }
    }

    /* compiled from: PublishDetailsSlotValidator.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.y1$e */
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(C33806y1.this.f235093c, "PublishDetailsSlotValidator", (Throwable) obj, 4);
        }
    }

    @Inject
    public C33806y1(@Y61.k com.avito.android.publish.C0 c02, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k InterfaceC19882a interfaceC19882a, @Y61.k com.avito.android.Q1 q12, @Y61.k h31.e<InterfaceC33678b> eVar) {
        this.f235091a = c02;
        this.f235092b = interfaceC35745a5;
        this.f235093c = interfaceC33535v;
        this.f235094d = interfaceC19882a;
        this.f235095e = q12;
        this.f235096f = eVar;
    }

    @Override // com.avito.android.publish.details.InterfaceC33800w1
    @Y61.k
    public final AbstractC22991Y<K1.AbstractC33668b> a() {
        return this.f235098h;
    }

    @Override // com.avito.android.publish.details.InterfaceC33800w1
    @SuppressLint({"HardcodeStringDetector"})
    public final void b(@Y61.k Set<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> set, @Y61.k Y41.a<kotlin.G0> aVar, @Y61.k Y41.l<? super K1.C33667a, kotlin.G0> lVar) {
        if (set.isEmpty()) {
            aVar.invoke();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (com.avito.android.category_parameters.j<? extends Slot<?>> jVar : set) {
            arrayList.add(jVar.c().d0(new b(jVar)));
        }
        io.reactivex.rxjava3.internal.operators.observable.R1 r1L0 = io.reactivex.rxjava3.core.z.L0(arrayList, c.f235102b);
        InterfaceC35745a5 interfaceC35745a5 = this.f235092b;
        this.f235097g.b(r1L0.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).v0(new d(aVar, lVar, this, set), new e(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.publish.details.InterfaceC33800w1
    @Y61.k
    public final InterfaceC43160i<K1.AbstractC33668b> c() {
        return C23071x.a(this.f235098h);
    }
}
