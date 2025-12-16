package bf0;

import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.category_parameters.f;
import com.avito.android.publish.C0;
import com.avito.android.publish.slots.q;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlot;
import com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlotType;
import com.avito.android.remote.model.category_parameters.slot.iac_devices.IacDevicesSlot;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.util.P2;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import t3.k0;
import u3.l;
import yc.C50213a;

/* compiled from: ContactMethodSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lbf0/d;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/contact_method/ContactMethodSlot;", "Lcom/avito/android/publish/slots/q;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bf0.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C25645d extends com.avito.android.category_parameters.k<ContactMethodSlot> implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ContactMethodSlot f57320b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC25642a f57321c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Q1 f57322d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f57323e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C50213a f57324f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final OL.a f57325g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final l<SimpleTestGroupWithNone> f57326h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f57327i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Integer f57328j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Theme f57329k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> f57330l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final SelectParameter.Flat f57331m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final ContactMethodSlotType f57332n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final IacDevicesSlot f57333o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public f f57334p;

    @i31.c
    public C25645d(@Y61.k C0 c02, @InterfaceC41220a @Y61.k ContactMethodSlot contactMethodSlot, @Y61.k InterfaceC25642a interfaceC25642a, @Y61.k com.avito.android.details.a aVar, @Y61.k Q1 q12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a, @Y61.k OL.a aVar2, @Y61.k @k0 l<SimpleTestGroupWithNone> lVar) {
        Navigation navigation2;
        this.f57320b = contactMethodSlot;
        this.f57321c = interfaceC25642a;
        this.f57322d = q12;
        this.f57323e = interfaceC28373a;
        this.f57324f = c50213a;
        this.f57325g = aVar2;
        this.f57326h = lVar;
        this.f57327i = c02.Be();
        CategoryParameters categoryParameters = c02.f231873k0;
        this.f57328j = (categoryParameters == null || (navigation2 = categoryParameters.getNavigation()) == null) ? null : navigation2.getCategoryId();
        this.f57329k = c02.ve();
        this.f57330l = new com.jakewharton.rxrelay3.c<>();
        this.f57331m = ((ContactMethodSlotConfig) contactMethodSlot.getWidget().getConfig()).getField();
        this.f57332n = ((ContactMethodSlotConfig) contactMethodSlot.getWidget().getConfig()).getType();
        CategoryParameters categoryParametersC0 = aVar.C0();
        this.f57333o = categoryParametersC0 != null ? (IacDevicesSlot) categoryParametersC0.getFirstParameterOfType(IacDevicesSlot.class) : null;
    }

    @Override // com.avito.android.publish.slots.q
    public final z a() {
        return this.f57330l;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final z<P2<SuccessResult>> c() {
        f fVar = this.f57334p;
        return fVar != null ? fVar.c() : z.c0(new P2.b(new SuccessResult(null)));
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final com.avito.android.category_parameters.f d(@Y61.k com.avito.conveyor_item.a aVar) {
        com.avito.android.category_parameters.f fVarD;
        f fVar = this.f57334p;
        return (fVar == null || (fVarD = fVar.d(aVar)) == null) ? f.c.f117644b : fVarD;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final com.avito.android.category_parameters.f e(@Y61.k ParameterSlot parameterSlot) {
        f.c cVarB;
        f fVar = this.f57334p;
        return (fVar == null || (cVarB = fVar.b(parameterSlot)) == null) ? f.c.f117644b : cVarB;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f57320b;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final z<P2<G0>> h() {
        this.f57330l.accept(new f.a(SlotType.CONTACT_METHOD, this.f57320b));
        return super.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[EDGE_INSN: B:26:0x0058->B:18:0x0058 BREAK  A[LOOP:0: B:10:0x001e->B:27:?]] */
    @Override // com.avito.android.category_parameters.k
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.avito.conveyor_item.a> j() {
        /*
            r13 = this;
            bf0.f r0 = r13.f57334p
            if (r0 != 0) goto Lab
            com.avito.android.remote.model.category_parameters.SelectParameter$Flat r0 = r13.f57331m
            java.util.List r0 = r0.getValues()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L1a
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1a
            goto L37
        L1a:
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            com.avito.android.remote.model.category_parameters.SelectParameter$Value r1 = (com.avito.android.remote.model.category_parameters.SelectParameter.Value) r1
            java.util.List<java.lang.String> r2 = bf0.i.f57340a
            java.lang.String r1 = r1.getId()
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L1e
            goto L58
        L37:
            com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlotType r0 = r13.f57332n
            com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlotType r1 = com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlotType.REDESIGN
            if (r0 != r1) goto L58
            bf0.j r0 = new bf0.j
            com.avito.android.analytics.a r9 = r13.f57323e
            yc.a r10 = r13.f57324f
            com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlot r3 = r13.f57320b
            com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> r4 = r13.f57330l
            bf0.a r5 = r13.f57321c
            com.avito.android.Q1 r6 = r13.f57322d
            com.avito.android.remote.model.category_parameters.slot.iac_devices.IacDevicesSlot r7 = r13.f57333o
            boolean r8 = r13.f57327i
            OL.a r11 = r13.f57325g
            java.lang.Integer r12 = r13.f57328j
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto La9
        L58:
            u3.l<com.avito.android.ab_tests.groups.SimpleTestGroupWithNone> r0 = r13.f57326h
            u3.m<T> r0 = r0.f439745a
            T r0 = r0.f439749b
            com.avito.android.ab_tests.groups.SimpleTestGroupWithNone r0 = (com.avito.android.ab_tests.groups.SimpleTestGroupWithNone) r0
            boolean r0 = r0.b()
            r1 = 88
            com.avito.android.Q1 r2 = r13.f57322d
            bf0.a r3 = r13.f57321c
            com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> r4 = r13.f57330l
            com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlot r5 = r13.f57320b
            if (r0 == 0) goto L8d
            cf0.a r0 = new cf0.a
            r2.getClass()
            kotlin.reflect.n<java.lang.Object>[] r6 = com.avito.android.Q1.f67448x0
            r1 = r6[r1]
            com.avito.android.A0$a r1 = r2.f67517v0
            DE0.a r1 = r1.a()
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.<init>(r5, r4, r3, r1)
            goto La9
        L8d:
            bf0.e r0 = new bf0.e
            r2.getClass()
            kotlin.reflect.n<java.lang.Object>[] r6 = com.avito.android.Q1.f67448x0
            r1 = r6[r1]
            com.avito.android.A0$a r1 = r2.f67517v0
            DE0.a r1 = r1.a()
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.<init>(r5, r4, r3, r1)
        La9:
            r13.f57334p = r0
        Lab:
            com.avito.android.remote.model.search.Theme r1 = r13.f57329k
            java.util.ArrayList r0 = r0.e(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bf0.C25645d.j():java.util.List");
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
    }
}
