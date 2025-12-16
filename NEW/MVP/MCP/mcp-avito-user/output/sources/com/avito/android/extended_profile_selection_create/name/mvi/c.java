package com.avito.android.extended_profile_selection_create.name.mvi;

import KA.a;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.extended_profile_selection_create.name.ExtendedProfileSetSelectionNameConfig;
import com.avito.android.extended_profile_selection_create.name.mvi.entity.ExtendedProfileSetSelectionNameInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Z1;

/* compiled from: ExtendedProfileSetSelectionNameActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/name/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LKA/a;", "Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction;", "LKA/c;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements com.avito.android.arch.mvi.a<KA.a, ExtendedProfileSetSelectionNameInternalAction, KA.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_selection_create.name.f f151894a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Z1<HA.g> f151895b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileSetSelectionNameConfig f151896c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final E f151897d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f151898e;

    @Inject
    public c(@Y61.k com.avito.android.extended_profile_selection_create.name.f fVar, @Y61.k Z1<HA.g> z12, @Y61.k ExtendedProfileSetSelectionNameConfig extendedProfileSetSelectionNameConfig, @Y61.k E e12, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f151894a = fVar;
        this.f151895b = z12;
        this.f151896c = extendedProfileSetSelectionNameConfig;
        this.f151897d = e12;
        this.f151898e = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ExtendedProfileSetSelectionNameInternalAction> b(KA.a aVar, KA.c cVar) {
        String strA;
        KA.a aVar2 = aVar;
        KA.c cVar2 = cVar;
        if (!aVar2.equals(a.C0558a.f9336a)) {
            if (aVar2 instanceof a.b) {
                return C43175k.G(new a(this, aVar2, null));
            }
            if (aVar2 instanceof a.c) {
                return C43175k.G(new b(this, aVar2, null));
            }
            throw new NoWhenBranchMatchedException();
        }
        String str = cVar2.f9345b;
        int length = str.length();
        ExtendedProfileSetSelectionNameConfig extendedProfileSetSelectionNameConfig = this.f151896c;
        if (length > extendedProfileSetSelectionNameConfig.f151809h) {
            return C43175k.w();
        }
        if (str.length() == 0) {
            return new C43210w(ExtendedProfileSetSelectionNameInternalAction.EmptyNameError.f151904b);
        }
        boolean zF2 = L.f(cVar2.f9349f, str);
        boolean z12 = extendedProfileSetSelectionNameConfig.f151806e;
        InterfaceC28373a interfaceC28373a = this.f151898e;
        E e12 = this.f151897d;
        Boolean bool = cVar2.f9350g;
        boolean z13 = cVar2.f9346c;
        if (zF2 && L.f(bool, Boolean.valueOf(z13))) {
            String strA2 = e12.a();
            if (strA2 != null) {
                interfaceC28373a.c(new IA.c(strA2, str, z12));
            }
            return new C43210w(new ExtendedProfileSetSelectionNameInternalAction.SetSelectionNameSuccess(str, z13));
        }
        String strA3 = e12.a();
        if (strA3 != null) {
            interfaceC28373a.c(new IA.c(strA3, str, z12));
        }
        if (!L.f(bool, Boolean.valueOf(z13)) && (strA = e12.a()) != null) {
            interfaceC28373a.c(new IA.f(strA, z13, z12));
        }
        return this.f151894a.a(extendedProfileSetSelectionNameConfig.f151808g, z13, str);
    }
}
