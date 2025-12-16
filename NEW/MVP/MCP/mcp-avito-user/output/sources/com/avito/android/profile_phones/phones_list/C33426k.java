package com.avito.android.profile_phones.phones_list;

import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.profile_phones.phones_list.PhonesListFragment;
import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviState;
import kotlin.G0;
import kotlin.Metadata;
import wb0.InterfaceC49590a;

/* compiled from: PhonesListFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.profile_phones.phones_list.k, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33426k extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PhonesListFragment f227889l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f227890m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33426k(PhonesListFragment phonesListFragment, InterfaceC22204y1 interfaceC22204y1) {
        super(0);
        this.f227889l = phonesListFragment;
        this.f227890m = interfaceC22204y1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.a
    public final G0 invoke() {
        PhonesListFragment.a aVar = PhonesListFragment.f227380K0;
        this.f227889l.D5().accept(new InterfaceC49590a.e(!((PhonesListMviState) this.f227890m.getF42167b()).f228020d));
        return G0.f406611a;
    }
}
