package com.avito.android.delivery_tarifikator.presentation.region_screen;

import Xv.InterfaceC17050a;
import com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.p;
import com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.q;
import com.avito.android.delivery_tarifikator.presentation.region_screen.TarifikatorRegionFragment;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class a implements q, p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135771a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TarifikatorRegionFragment f135772b;

    public /* synthetic */ a(TarifikatorRegionFragment tarifikatorRegionFragment, int i12) {
        this.f135771a = i12;
        this.f135772b = tarifikatorRegionFragment;
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.p
    public void a(Long l12, List list) {
        TarifikatorRegionFragment tarifikatorRegionFragment = this.f135772b;
        switch (this.f135771a) {
            case 1:
                TarifikatorRegionFragment.a aVar = TarifikatorRegionFragment.f135744D0;
                tarifikatorRegionFragment.r5().accept(new InterfaceC17050a.g(l12, list));
                break;
            case 2:
                TarifikatorRegionFragment.a aVar2 = TarifikatorRegionFragment.f135744D0;
                tarifikatorRegionFragment.r5().accept(new InterfaceC17050a.f(l12, list));
                break;
            default:
                TarifikatorRegionFragment.a aVar3 = TarifikatorRegionFragment.f135744D0;
                tarifikatorRegionFragment.r5().accept(new InterfaceC17050a.e(l12, list));
                break;
        }
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.q
    public void b(String str, List list) {
        TarifikatorRegionFragment.a aVar = TarifikatorRegionFragment.f135744D0;
        this.f135772b.r5().accept(new InterfaceC17050a.i(str, list));
    }
}
