package com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.arch.mvi.a;
import com.avito.android.permissions.z;
import com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.mvi.entity.IacEnableBottomSheetInternalAction;
import com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.mvi.entity.IacEnableBottomSheetState;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import vb0.InterfaceC49294a;

/* compiled from: IacEnableBottomSheetActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/iac_enable_bottomsheet/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "Lvb0/a;", "Lcom/avito/android/profile_phones/phones_list/iac_enable_bottomsheet/mvi/entity/IacEnableBottomSheetInternalAction;", "Lcom/avito/android/profile_phones/phones_list/iac_enable_bottomsheet/mvi/entity/IacEnableBottomSheetState;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC49294a, IacEnableBottomSheetInternalAction, IacEnableBottomSheetState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final NL.e f227822a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f227823b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final OL.a f227824c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final z f227825d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final F f227826e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f227827f;

    @Inject
    public c(@Y61.k NL.e eVar, @Y61.k R0 r02, @Y61.k OL.a aVar, @Y61.k z zVar, @Y61.k F f12, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f227822a = eVar;
        this.f227823b = r02;
        this.f227824c = aVar;
        this.f227825d = zVar;
        this.f227826e = f12;
        this.f227827f = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<IacEnableBottomSheetInternalAction> b(InterfaceC49294a interfaceC49294a, IacEnableBottomSheetState iacEnableBottomSheetState) {
        InterfaceC49294a interfaceC49294a2 = interfaceC49294a;
        if (!(interfaceC49294a2 instanceof InterfaceC49294a.C12782a)) {
            throw new NoWhenBranchMatchedException();
        }
        return new C43152f0(C43175k.I(this.f227823b.a(), C43175k.G(new a(((InterfaceC49294a.C12782a) interfaceC49294a2).f440870a, this, null))), new b(3, null));
    }
}
