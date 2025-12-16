package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.profile_phones.phones_list.SectionForOpen;
import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PhonesListMviBootstrap.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/B;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class B implements com.avito.android.arch.mvi.b<PhonesListMviInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final G f227898a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f227899b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.permissions.z f227900c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final SectionForOpen f227901d;

    @Inject
    public B(@Y61.k G g12, boolean z12, @Y61.k com.avito.android.permissions.z zVar, @Y61.l SectionForOpen sectionForOpen) {
        this.f227898a = g12;
        this.f227899b = z12;
        this.f227900c = zVar;
        this.f227901d = sectionForOpen;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<PhonesListMviInternalAction> a() {
        return C43175k.N(!this.f227899b ? new C43152f0(C43175k.G(new x(this, null)), new y(this, null)) : C43175k.w(), new A(new z(kotlinx.coroutines.rx3.y.a(this.f227900c.a()))));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
