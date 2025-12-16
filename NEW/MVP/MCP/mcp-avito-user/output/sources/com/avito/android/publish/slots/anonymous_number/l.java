package com.avito.android.publish.slots.anonymous_number;

import Pd0.v;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.deep_linking.x;
import com.avito.android.phone_protection_info.item.b;
import com.avito.android.publish.C0;
import com.avito.android.publish.InterfaceC33544d;
import com.avito.android.publish.InterfaceC34155z;
import com.avito.android.publish.slots.contact_info.ContactsData;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.ItemBrief;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.PublishAnonymousNumber;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.model.category_parameters.PhoneParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.anonymous_number.AnonymousNumberSlot;
import com.avito.android.remote.model.category_parameters.slot.anonymous_number.AnonymousNumberSlotConfig;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.rx3.Q;
import u70.InterfaceC48811a;
import yc.C50213a;

/* compiled from: AnonymousNumberSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/anonymous_number/l;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/anonymous_number/AnonymousNumberSlot;", "Lcom/avito/android/publish/slots/q;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends com.avito.android.category_parameters.k<AnonymousNumberSlot> implements com.avito.android.publish.slots.q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AnonymousNumberSlot f243034b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C0 f243035c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f243036d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34155z f243037e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final H0 f243038f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48811a f243039g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Q1 f243040h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final x f243041i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final CategoryParametersConverter f243042j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f243043k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C50213a f243044l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final v f243045m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33544d f243046n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f243047o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final ItemBrief f243048p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final Theme f243049q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final List<String> f243050r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public b.a f243051s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> f243052t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f243053u;

    /* compiled from: AnonymousNumberSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lkotlin/G0;", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/util/P2;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            P2 p22 = (P2) obj;
            if (p22 instanceof P2.b) {
                l lVar = l.this;
                if (lVar.f243051s == null) {
                    ContactsData contactsDataB = lVar.f243046n.b();
                    return lVar.l(contactsDataB != null ? contactsDataB.f243206b : null).k(new j(lVar)).r(k.f243033b).F();
                }
            }
            return z.c0(p22);
        }
    }

    /* compiled from: AnonymousNumberSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/P2;", "Lkotlin/G0;", VoiceInfo.STATE, "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            P2 p22 = (P2) obj;
            boolean z12 = p22 instanceof P2.b;
            l lVar = l.this;
            if (z12) {
                lVar.f243045m.v();
            } else if (p22 instanceof P2.a) {
                lVar.f243045m.A(((P2.a) p22).f318719a);
            } else {
                p22.equals(P2.c.f318721a);
            }
        }
    }

    /* compiled from: AnonymousNumberSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/P2;", "Lkotlin/G0;", VoiceInfo.STATE, "apply", "(Lcom/avito/android/util/P2;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T, R> f243056b = new c<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            P2 p22 = (P2) obj;
            return p22 instanceof P2.a ? new P2.b(G0.f406611a) : p22;
        }
    }

    @i31.c
    public l(@InterfaceC41220a @Y61.k AnonymousNumberSlot anonymousNumberSlot, @Y61.k C0 c02, @Y61.k com.avito.android.details.a aVar, @Y61.k InterfaceC34155z interfaceC34155z, @Y61.k H0 h02, @Y61.k InterfaceC48811a interfaceC48811a, @Y61.k Q1 q12, @Y61.k x xVar, @Y61.k CategoryParametersConverter categoryParametersConverter, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k C50213a c50213a, @Y61.k v vVar, @Y61.k InterfaceC33544d interfaceC33544d) {
        this.f243034b = anonymousNumberSlot;
        this.f243035c = c02;
        this.f243036d = aVar;
        this.f243037e = interfaceC34155z;
        this.f243038f = h02;
        this.f243039g = interfaceC48811a;
        this.f243040h = q12;
        this.f243041i = xVar;
        this.f243042j = categoryParametersConverter;
        this.f243043k = interfaceC35745a5;
        this.f243044l = c50213a;
        this.f243045m = vVar;
        this.f243046n = interfaceC33544d;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f243047o = cVar;
        this.f243048p = c02.f231867e0;
        this.f243049q = c02.ve();
        List<String> relatedFields = ((AnonymousNumberSlotConfig) anonymousNumberSlot.getWidget().getConfig()).getRelatedFields();
        this.f243050r = relatedFields == null ? Collections.singletonList("phone") : relatedFields;
        com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f243052t = cVar2;
        this.f243053u = new C41981q0(cVar2);
        cVar.b(c02.f231882t0.N(new com.avito.android.publish.slots.anonymous_number.c(this)).d0(d.f243023b).B(e.f243024a).v0(new f(this), g.f243026b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.publish.slots.q
    @Y61.k
    public final z<com.avito.android.category_parameters.f> a() {
        return this.f243053u;
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
        this.f243047o.e();
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f243034b;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final z<P2<G0>> h() {
        this.f243045m.o();
        z zVarT = this.f243046n.d(null).T(new a(), Integer.MAX_VALUE);
        InterfaceC35745a5 interfaceC35745a5 = this.f243043k;
        return zVarT.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).K(new b()).d0(c.f243056b);
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        b.a aVar = this.f243051s;
        if (aVar == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        boolean zIsAvitoRe23 = Theme.INSTANCE.isAvitoRe23(this.f243049q);
        arrayList.add(new com.avito.android.phone_protection_info.item.b(aVar, new b.C6479b(zIsAvitoRe23 ? R.dimen.publish_container_horizontal_padding_redesign : R.dimen.publish_container_horizontal_padding, Integer.valueOf((!zIsAvitoRe23 || this.f243035c.Be()) ? R.dimen.protection_banner_top_margin : R.dimen.protection_banner_top_margin_redesign))));
        return arrayList;
    }

    public final I<TypedResult<b.a>> l(String str) {
        I<TypedResult<PublishAnonymousNumber>> iY2;
        I iR2;
        PhoneParameter phoneParameter;
        CategoryParameters categoryParametersC0 = this.f243036d.C0();
        String value = (categoryParametersC0 == null || (phoneParameter = (PhoneParameter) categoryParametersC0.getFirstParameterOfType(PhoneParameter.class)) == null) ? null : phoneParameter.getValue();
        if (value != null) {
            str = value;
        }
        if (str == null) {
            return I.q(new TypedResult.Error(com.avito.android.remote.error.j.b(), null, 2, null));
        }
        List<ParameterSlot> parametersExceptOwnedBySlots = categoryParametersC0.getParametersExceptOwnedBySlots();
        Navigation navigationU = this.f243037e.U();
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        CategoryParametersConverter categoryParametersConverter = this.f243042j;
        Map<String, String> mapConvertToFieldMap = categoryParametersConverter.convertToFieldMap(parametersExceptOwnedBySlots);
        Q1 q12 = this.f243040h;
        q12.getClass();
        kotlin.reflect.n<Object> nVar = Q1.f67448x0[77];
        boolean zBooleanValue = ((Boolean) q12.f67495k0.a().invoke()).booleanValue();
        ItemBrief itemBrief = this.f243048p;
        if (zBooleanValue) {
            iR2 = Q.a(EmptyCoroutineContext.INSTANCE, new h(this, itemBrief, string, null));
        } else {
            if (itemBrief == null) {
                iY2 = this.f243038f.B(string, categoryParametersConverter.convertToFieldMap(navigationU), mapConvertToFieldMap, this.f243044l.b());
            } else {
                String id2 = itemBrief.getId();
                String categoryId = itemBrief.getCategoryId();
                if (categoryId == null) {
                    categoryId = "";
                }
                iY2 = this.f243038f.y(id2, categoryId, categoryParametersConverter.convertToFieldMap(navigationU), string, itemBrief.getVersion(), true, mapConvertToFieldMap);
            }
            iR2 = iY2.r(i.f243031b);
        }
        return iR2.z(this.f243043k.a());
    }
}
