package com.avito.android.profile_phones.add_phone.mvi;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.profile_phones.add_phone.mvi.entity.AddPhoneInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import nb0.C44373c;
import nb0.InterfaceC44371a;
import ob0.C44750c;
import xb0.InterfaceC49919a;

/* compiled from: AddPhoneActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "Lnb0/a;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction;", "Lnb0/c;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements com.avito.android.arch.mvi.a<InterfaceC44371a, AddPhoneInternalAction, C44373c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_phones.add_phone.n f226894a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49919a f226895b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f226896c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.code_confirmation.code_confirmation.phone_confirm.f f226897d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final E f226898e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f226899f;

    @Inject
    public e(@Y61.k com.avito.android.profile_phones.add_phone.n nVar, @Y61.k InterfaceC49919a interfaceC49919a, @com.avito.android.profile_phones.add_phone.di.g @Y61.l String str, @Y61.k com.avito.android.code_confirmation.code_confirmation.phone_confirm.f fVar, @Y61.k E e12, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f226894a = nVar;
        this.f226895b = interfaceC49919a;
        this.f226896c = str;
        this.f226897d = fVar;
        this.f226898e = e12;
        this.f226899f = interfaceC28373a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
    
        if (r12 == null) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.profile_phones.add_phone.mvi.e r10, java.lang.String r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_phones.add_phone.mvi.e.c(com.avito.android.profile_phones.add_phone.mvi.e, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AddPhoneInternalAction> b(InterfaceC44371a interfaceC44371a, C44373c c44373c) {
        InterfaceC44371a interfaceC44371a2 = interfaceC44371a;
        if (interfaceC44371a2.equals(InterfaceC44371a.C11863a.f415191a)) {
            return new C43210w(AddPhoneInternalAction.RoutingGoBack.f226910b);
        }
        if (interfaceC44371a2 instanceof InterfaceC44371a.b) {
            return C43175k.G(new d(this, ((InterfaceC44371a.b) interfaceC44371a2).f415192a, null));
        }
        if (interfaceC44371a2 instanceof InterfaceC44371a.c) {
            InterfaceC44371a.c cVar = (InterfaceC44371a.c) interfaceC44371a2;
            String str = cVar.f415193a;
            return this.f226894a.c(cVar.f415194b, this.f226896c, str);
        }
        if (interfaceC44371a2 instanceof InterfaceC44371a.d) {
            return new C43210w(new AddPhoneInternalAction.PhoneReverificationInfoAccepted(((InterfaceC44371a.d) interfaceC44371a2).f415195a));
        }
        if (interfaceC44371a2.equals(InterfaceC44371a.e.f415196a)) {
            return new C43210w(AddPhoneInternalAction.Ok.f226905b);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_phones.add_phone.mvi.e.d(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl, boolean):java.lang.Object");
    }

    public final void e(String str) {
        String strA;
        if (!L.f(this.f226896c, "extended_profile") || (strA = this.f226898e.a()) == null) {
            return;
        }
        this.f226899f.c(new C44750c(strA, str));
    }
}
