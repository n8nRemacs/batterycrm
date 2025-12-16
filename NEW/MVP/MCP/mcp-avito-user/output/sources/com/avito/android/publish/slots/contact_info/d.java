package com.avito.android.publish.slots.contact_info;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.account.G;
import com.avito.android.category_parameters.f;
import com.avito.android.publish.C0;
import com.avito.android.publish.InterfaceC33544d;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.slots.contact_info.error.PhoneReverificationError;
import com.avito.android.publish.slots.q;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.error.PhoneVerificationError;
import com.avito.android.remote.model.PhonePretendResult;
import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.EmailParameter;
import com.avito.android.remote.model.category_parameters.PhoneParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasError;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.contact_info.ContactInfoSlot;
import com.avito.android.remote.model.category_parameters.slot.contact_info.ContactInfoSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlot;
import com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlotType;
import com.avito.android.util.C5;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.N3;
import com.avito.android.util.P2;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import io.reactivex.rxjava3.internal.operators.observable.C41998x0;
import io.reactivex.rxjava3.internal.operators.observable.O;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: ContactInfoSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/slots/contact_info/d;", "Lcom/avito/android/category_parameters/j;", "Lcom/avito/android/remote/model/category_parameters/slot/contact_info/ContactInfoSlot;", "Lcom/avito/android/publish/slots/q;", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d extends com.avito.android.category_parameters.j<ContactInfoSlot> implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ContactInfoSlot f243224b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.P f243225c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33544d f243226d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34401z0 f243227e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f243228f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final G f243229g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<String> f243230h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f243231i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.contact_info.a f243232j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f243233k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> f243234l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f243235m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f243236n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f243237o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f243238p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f243239q;

    /* compiled from: ContactInfoSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/slots/contact_info/ContactsData;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/slots/contact_info/ContactsData;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            d.this.f243234l.accept(new f.b(SlotType.CONTACT_INFO, null));
        }
    }

    /* compiled from: ContactInfoSlotWrapper.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/contact_info/d$b;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f243241a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f243242b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f243243c;

        public b(@Y61.k String str, @Y61.l String str2, boolean z12) {
            this.f243241a = str;
            this.f243242b = str2;
            this.f243243c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f243241a, bVar.f243241a) && L.f(this.f243242b, bVar.f243242b) && this.f243243c == bVar.f243243c;
        }

        public final int hashCode() {
            int iHashCode = this.f243241a.hashCode() * 31;
            String str = this.f243242b;
            return Boolean.hashCode(this.f243243c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PhoneVerificationData(phone=");
            sb2.append(this.f243241a);
            sb2.append(", manager=");
            sb2.append(this.f243242b);
            sb2.append(", isCompany=");
            return r.x(sb2, this.f243243c, ')');
        }
    }

    /* compiled from: ContactInfoSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/SuccessResult;", "it", "apply", "(Lcom/avito/android/util/P2;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements o {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v3, types: [com.avito.android.remote.error.ApiError] */
        @Override // l41.o
        public final Object apply(Object obj) {
            P2 p22 = (P2) obj;
            if ((p22 instanceof P2.b) || !(p22 instanceof P2.a)) {
                return p22;
            }
            d dVar = d.this;
            boolean zIsEmpty = dVar.f243224b.getParameters().isEmpty();
            ?? r62 = ((P2.a) p22).f318719a;
            ApiError.IncorrectData incorrectDataP = r62;
            if (!zIsEmpty) {
                if (r62 instanceof ApiError.PretendError) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, PretendErrorValue> entry : ((ApiError.PretendError) r62).f253393b.getErrors().entrySet()) {
                        String singleMessage = entry.getValue().getSingleMessage();
                        if (singleMessage != null) {
                            linkedHashMap.put(entry.getKey(), singleMessage);
                        }
                    }
                    incorrectDataP = dVar.p(linkedHashMap);
                } else {
                    boolean z12 = r62 instanceof com.avito.android.remote.error.r;
                    incorrectDataP = r62;
                    if (z12) {
                        incorrectDataP = dVar.p(((com.avito.android.remote.error.r) r62).c());
                    }
                }
            }
            return new P2.a(incorrectDataP);
        }
    }

    /* compiled from: ContactInfoSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/PhonePretendResult;", "it", "Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/SuccessResult;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.slots.contact_info.d$d, reason: collision with other inner class name */
    public static final class C7292d<T, R> implements o {
        public C7292d() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            Object aVar;
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Error) {
                return new P2.a(((TypedResult.Error) typedResult).getError());
            }
            if (!(typedResult instanceof TypedResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            PhonePretendResult phonePretendResult = (PhonePretendResult) ((TypedResult.Success) typedResult).getResult();
            d.this.getClass();
            if (phonePretendResult instanceof PhonePretendResult.Ok) {
                aVar = new P2.b(new SuccessResult(null, 1, null));
            } else if (phonePretendResult instanceof PhonePretendResult.NeedConfirmation) {
                aVar = new P2.a(new PhoneVerificationError(null, 1, null));
            } else {
                if (phonePretendResult instanceof PhonePretendResult.IncorrectData) {
                    return new P2.a(new ApiError.IncorrectData(((PhonePretendResult.IncorrectData) phonePretendResult).getMessages()));
                }
                if (phonePretendResult instanceof PhonePretendResult.AllowReverification) {
                    PhonePretendResult.AllowReverification allowReverification = (PhonePretendResult.AllowReverification) phonePretendResult;
                    aVar = new P2.a(new PhoneReverificationError(allowReverification.getPhone(), allowReverification.getPhoneFormatted(), allowReverification.getUserEmail(), true));
                } else {
                    if (!(phonePretendResult instanceof PhonePretendResult.DisallowReverification)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PhonePretendResult.DisallowReverification disallowReverification = (PhonePretendResult.DisallowReverification) phonePretendResult;
                    aVar = new P2.a(new PhoneReverificationError(disallowReverification.getPhone(), disallowReverification.getPhoneFormatted(), disallowReverification.getUserEmail(), false));
                }
            }
            return aVar;
        }
    }

    /* compiled from: ContactInfoSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/P2;", "Lkotlin/G0;", "it", "apply", "(Lcom/avito/android/util/P2;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T, R> implements o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.l<ContactsData, ContactsData> f243247c;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Y41.l<? super ContactsData, ContactsData> lVar) {
            this.f243247c = lVar;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            P2 p22 = (P2) obj;
            if (!(p22 instanceof P2.a)) {
                return p22;
            }
            d dVar = d.this;
            dVar.f243226d.c(new ContactsData(null, null, null, null, null, false, false, false, false, null, false, null, null, 8191, null));
            this.f243247c.invoke(dVar.f243226d.b());
            d.j(dVar);
            return new P2.b(G0.f406611a);
        }
    }

    /* compiled from: ContactInfoSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/P2;", "Lkotlin/G0;", "it", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {
        public f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            if (((P2) obj) instanceof P2.b) {
                d dVar = d.this;
                dVar.f243238p = dVar.f243226d.b().f243213i;
                d.j(dVar);
            }
        }
    }

    /* compiled from: ContactInfoSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/publish/slots/contact_info/ContactsData;", "contactsData", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements Y41.l<ContactsData, ContactsData> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final ContactsData invoke(ContactsData contactsData) {
            ContactsData contactsData2 = contactsData;
            d dVar = d.this;
            ContactInfoSlotConfig contactInfoSlotConfig = (ContactInfoSlotConfig) dVar.f243224b.getWidget().getConfig();
            String strA = dVar.f243230h.a(contactInfoSlotConfig.getPhoneField().getValue());
            String value = contactInfoSlotConfig.getManagerField().getValue();
            if (value == null) {
                value = contactsData2.f243209e;
            }
            return ContactsData.a(contactsData2, strA, null, null, value, 8182);
        }
    }

    @i31.c
    public d(@InterfaceC41220a @Y61.k ContactInfoSlot contactInfoSlot, @Y61.k com.avito.android.publish.P p12, @Y61.k InterfaceC33544d interfaceC33544d, @Y61.k InterfaceC34401z0 interfaceC34401z0, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k G g12, @N3.c @Y61.k InterfaceC35945t1<String> interfaceC35945t1, @Y61.k C0 c02, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k com.avito.android.details.a aVar, @Y61.k com.avito.android.publish.slots.contact_info.a aVar2) {
        ContactMethodSlot contactMethodSlot;
        SlotWidget<W> widget;
        ContactMethodSlotConfig contactMethodSlotConfig;
        this.f243224b = contactInfoSlot;
        this.f243225c = p12;
        this.f243226d = interfaceC33544d;
        this.f243227e = interfaceC34401z0;
        this.f243228f = fVar;
        this.f243229g = g12;
        this.f243230h = interfaceC35945t1;
        this.f243231i = interfaceC35745a5;
        this.f243232j = aVar2;
        boolean zBe = c02.Be();
        this.f243233k = zBe;
        com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f243234l = cVar;
        io.reactivex.rxjava3.disposables.c cVar2 = new io.reactivex.rxjava3.disposables.c();
        this.f243235m = cVar2;
        CategoryParameters categoryParametersC0 = aVar.C0();
        this.f243236n = ((categoryParametersC0 == null || (contactMethodSlot = (ContactMethodSlot) categoryParametersC0.getFirstParameterOfType(ContactMethodSlot.class)) == null || (widget = contactMethodSlot.getWidget()) == 0 || (contactMethodSlotConfig = (ContactMethodSlotConfig) widget.getConfig()) == null) ? null : contactMethodSlotConfig.getType()) == ContactMethodSlotType.REDESIGN;
        if (!zBe) {
            interfaceC33535v.q();
        }
        cVar2.b(interfaceC33544d.a().t0(new a()));
        this.f243239q = new C41981q0(cVar);
    }

    public static final void j(d dVar) {
        ArrayList arrayListB;
        if (dVar.f243237o) {
            return;
        }
        ContactsData contactsDataB = dVar.f243226d.b();
        boolean z12 = contactsDataB.f243213i;
        ContactInfoSlot contactInfoSlot = dVar.f243224b;
        if (z12) {
            CharParameter charParameterN = dVar.n(contactsDataB);
            EmailParameter emailField = ((ContactInfoSlotConfig) contactInfoSlot.getWidget().getConfig()).getEmailField();
            if (emailField == null) {
                emailField = null;
            } else {
                emailField.setValue(contactsDataB.f243208d);
            }
            arrayListB = C42756l.B(new ParameterSlot[]{charParameterN, emailField, dVar.o(contactsDataB)});
        } else {
            arrayListB = dVar.f243236n ? C42756l.B(new Object[]{dVar.n(contactsDataB), dVar.o(contactsDataB), dVar.m(contactsDataB)}) : C42756l.B(new Object[]{dVar.n(contactsDataB), dVar.m(contactsDataB), dVar.o(contactsDataB)});
        }
        contactInfoSlot.setParameters(arrayListB);
        dVar.f243237o = true;
    }

    @Override // com.avito.android.publish.slots.q
    @Y61.k
    public final z<com.avito.android.category_parameters.f> a() {
        return this.f243239q;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final z<P2<SuccessResult>> c() {
        Object next;
        ApiError.IncorrectData incorrectDataB;
        Iterator<T> it = this.f243224b.getParameters().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof PhoneParameter) {
                break;
            }
        }
        if (!(next instanceof PhoneParameter)) {
            next = null;
        }
        PhoneParameter phoneParameter = (PhoneParameter) next;
        String value = phoneParameter != null ? phoneParameter.getValue() : null;
        if (value == null) {
            value = "";
        }
        if (C5.f318568b.e(value)) {
            incorrectDataB = null;
        } else {
            if (phoneParameter != null) {
                phoneParameter.setErrorMessage(this.f243232j.a());
            }
            incorrectDataB = com.avito.android.remote.error.j.b();
        }
        C41998x0 c41998x0C0 = incorrectDataB != null ? z.c0(new P2.a(incorrectDataB)) : null;
        if (c41998x0C0 == null) {
            return (this.f243238p ? this.f243229g.getF68056k().S().p(new com.avito.android.publish.slots.contact_info.g(this)).j0(this.f243231i.a()).T(new h(this), Integer.MAX_VALUE).m0(new i(this)) : l()).d0(new c());
        }
        return c41998x0C0;
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
        this.f243235m.e();
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final com.avito.android.category_parameters.f d(@Y61.k com.avito.conveyor_item.a aVar) {
        Object next;
        if (!(aVar instanceof com.avito.android.items.d)) {
            return f.c.f117644b;
        }
        ContactInfoSlot contactInfoSlot = this.f243224b;
        Iterator<T> it = contactInfoSlot.getParameters().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((ParameterSlot) next).getId(), aVar.getF268425c())) {
                break;
            }
        }
        EditableParameter editableParameter = next instanceof EditableParameter ? (EditableParameter) next : null;
        if (editableParameter == null) {
            return f.c.f117644b;
        }
        editableParameter.clearError();
        String f117481f = ((com.avito.android.items.d) aVar).getF117481f();
        if (f117481f == null) {
            f117481f = "";
        }
        String f8933b = aVar.getF268425c();
        boolean zF2 = L.f(f8933b, ((ContactInfoSlotConfig) contactInfoSlot.getWidget().getConfig()).getPhoneField().getId());
        InterfaceC33544d interfaceC33544d = this.f243226d;
        if (zF2) {
            String strA = this.f243230h.a(f117481f);
            ContactsData contactsDataB = interfaceC33544d.b();
            interfaceC33544d.c(contactsDataB != null ? ContactsData.a(contactsDataB, strA, null, null, null, 8190) : null);
            ((PhoneParameter) editableParameter).setValue(strA);
        } else if (L.f(f8933b, ((ContactInfoSlotConfig) contactInfoSlot.getWidget().getConfig()).getManagerField().getId())) {
            ContactsData contactsDataB2 = interfaceC33544d.b();
            interfaceC33544d.c(contactsDataB2 != null ? ContactsData.a(contactsDataB2, null, null, null, f117481f, 8183) : null);
            ((CharParameter) editableParameter).setValue(f117481f);
        } else {
            EmailParameter emailField = ((ContactInfoSlotConfig) contactInfoSlot.getWidget().getConfig()).getEmailField();
            if (L.f(f8933b, emailField != null ? emailField.getId() : null)) {
                ContactsData contactsDataB3 = interfaceC33544d.b();
                interfaceC33544d.c(contactsDataB3 != null ? ContactsData.a(contactsDataB3, null, null, f117481f, null, 8187) : null);
                ((EmailParameter) editableParameter).setValue(f117481f);
            } else {
                CharParameter nameField = ((ContactInfoSlotConfig) contactInfoSlot.getWidget().getConfig()).getNameField();
                if (L.f(f8933b, nameField != null ? nameField.getId() : null)) {
                    ContactsData contactsDataB4 = interfaceC33544d.b();
                    interfaceC33544d.c(contactsDataB4 != null ? ContactsData.a(contactsDataB4, null, f117481f, null, null, 8189) : null);
                    ((CharParameter) editableParameter).setValue(f117481f);
                }
            }
        }
        return new f.b(SlotType.CONTACT_INFO, null);
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f243224b;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final z<P2<G0>> h() {
        g gVar = new g();
        O oK2 = this.f243226d.d(gVar).K(new f());
        return this.f243233k ? oK2.d0(new e(gVar)) : oK2;
    }

    public final z<P2<SuccessResult>> l() {
        Object next;
        ContactsData contactsDataB = this.f243226d.b();
        boolean z12 = contactsDataB != null ? contactsDataB.f243212h : false;
        Iterator<T> it = this.f243224b.getParameters().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof PhoneParameter) {
                break;
            }
        }
        if (!(next instanceof PhoneParameter)) {
            next = null;
        }
        PhoneParameter phoneParameter = (PhoneParameter) next;
        String value = phoneParameter != null ? phoneParameter.getValue() : null;
        if (value == null) {
            value = "";
        }
        return this.f243227e.x(value, z12).r(new C7292d()).u(new androidx.room.rxjava3.b(this, 17)).F();
    }

    public final CharParameter m(ContactsData contactsData) {
        if (!contactsData.f243212h && !contactsData.f243211g) {
            return null;
        }
        CharParameter managerField = ((ContactInfoSlotConfig) this.f243224b.getWidget().getConfig()).getManagerField();
        String value = managerField.getValue();
        if (value == null) {
            value = contactsData.f243209e;
        }
        managerField.setValue(value);
        return managerField;
    }

    public final CharParameter n(ContactsData contactsData) {
        CharParameter nameField;
        if (!contactsData.f243214j || (nameField = ((ContactInfoSlotConfig) this.f243224b.getWidget().getConfig()).getNameField()) == null) {
            return null;
        }
        String value = nameField.getValue();
        if (value == null) {
            value = contactsData.f243207c;
        }
        nameField.setValue(value);
        return nameField;
    }

    public final PhoneParameter o(ContactsData contactsData) {
        PhoneParameter phoneField = ((ContactInfoSlotConfig) this.f243224b.getWidget().getConfig()).getPhoneField();
        String value = phoneField.getValue();
        if (value == null) {
            value = contactsData.f243206b;
        }
        phoneField.setValue(value);
        return phoneField;
    }

    public final ApiError.IncorrectData p(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (ParameterSlot parameterSlot : this.f243224b.getParameters()) {
            if (map.get(parameterSlot.getId()) != null && (parameterSlot instanceof HasError)) {
                ((HasError) parameterSlot).setErrorMessage((String) map.get(parameterSlot.getId()));
                linkedHashMap.remove(parameterSlot.getId());
            }
        }
        return new ApiError.IncorrectData(linkedHashMap);
    }
}
