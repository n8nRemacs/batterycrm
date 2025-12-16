package com.avito.android.delivery_tarifikator.presentation.main_screen;

import Tv.InterfaceC15412c;
import android.view.View;
import com.avito.android.delivery_tarifikator.presentation.main_screen.TarifikatorMainFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f135554b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TarifikatorMainFragment f135555c;

    public /* synthetic */ b(TarifikatorMainFragment tarifikatorMainFragment, int i12) {
        this.f135554b = i12;
        this.f135555c = tarifikatorMainFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TarifikatorMainFragment tarifikatorMainFragment = this.f135555c;
        switch (this.f135554b) {
            case 0:
                TarifikatorMainFragment.a aVar = TarifikatorMainFragment.f135523E0;
                tarifikatorMainFragment.r5().accept(InterfaceC15412c.o.f16001a);
                break;
            default:
                TarifikatorMainFragment.a aVar2 = TarifikatorMainFragment.f135523E0;
                tarifikatorMainFragment.r5().accept(InterfaceC15412c.n.f16000a);
                break;
        }
    }
}
