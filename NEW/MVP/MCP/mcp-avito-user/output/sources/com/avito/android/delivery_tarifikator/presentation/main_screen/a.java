package com.avito.android.delivery_tarifikator.presentation.main_screen;

import Tv.InterfaceC15412c;
import com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.p;
import com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.q;
import com.avito.android.delivery_tarifikator.presentation.main_screen.TarifikatorMainFragment;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class a implements q, p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TarifikatorMainFragment f135553b;

    public /* synthetic */ a(TarifikatorMainFragment tarifikatorMainFragment, int i12) {
        this.f135552a = i12;
        this.f135553b = tarifikatorMainFragment;
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.p
    public void a(Long l12, List list) {
        TarifikatorMainFragment tarifikatorMainFragment = this.f135553b;
        switch (this.f135552a) {
            case 1:
                TarifikatorMainFragment.a aVar = TarifikatorMainFragment.f135523E0;
                tarifikatorMainFragment.r5().accept(new InterfaceC15412c.j(l12, list));
                break;
            case 2:
                TarifikatorMainFragment.a aVar2 = TarifikatorMainFragment.f135523E0;
                tarifikatorMainFragment.r5().accept(new InterfaceC15412c.h(l12, list));
                break;
            default:
                TarifikatorMainFragment.a aVar3 = TarifikatorMainFragment.f135523E0;
                tarifikatorMainFragment.r5().accept(new InterfaceC15412c.g(l12, list));
                break;
        }
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.q
    public void b(String str, List list) {
        TarifikatorMainFragment.a aVar = TarifikatorMainFragment.f135523E0;
        this.f135553b.r5().accept(new InterfaceC15412c.r(str, list));
    }
}
