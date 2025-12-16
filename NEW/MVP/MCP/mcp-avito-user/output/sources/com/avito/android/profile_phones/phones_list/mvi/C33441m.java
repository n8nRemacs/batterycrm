package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction;
import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviState;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;
import wb0.InterfaceC49590a;

/* compiled from: PhonesListMviActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwb0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "invoke", "(Lwb0/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.profile_phones.phones_list.mvi.m, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33441m extends kotlin.jvm.internal.N implements Y41.l<InterfaceC49590a, InterfaceC43160i<? extends PhonesListMviInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C33433e f228057l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<PhonesListMviState> f228058m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33441m(C33433e c33433e, Y41.a<PhonesListMviState> aVar) {
        super(1);
        this.f228057l = c33433e;
        this.f228058m = aVar;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends PhonesListMviInternalAction> invoke(InterfaceC49590a interfaceC49590a) {
        PhonesListMviState phonesListMviStateInvoke = this.f228058m.invoke();
        return this.f228057l.b(interfaceC49590a, phonesListMviStateInvoke);
    }
}
