package com.avito.android.delivery_tarifikator.presentation.main_screen;

import Tv.InterfaceC15412c;
import android.content.DialogInterface;
import com.avito.android.delivery_tarifikator.presentation.main_screen.TarifikatorMainFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TarifikatorMainFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class k extends N implements Y41.l<DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TarifikatorMainFragment f135606l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TarifikatorMainFragment tarifikatorMainFragment) {
        super(1);
        this.f135606l = tarifikatorMainFragment;
    }

    @Override // Y41.l
    public final G0 invoke(DialogInterface dialogInterface) {
        TarifikatorMainFragment.a aVar = TarifikatorMainFragment.f135523E0;
        TarifikatorMainFragment tarifikatorMainFragment = this.f135606l;
        tarifikatorMainFragment.r5().accept(InterfaceC15412c.a.f15984a);
        tarifikatorMainFragment.f135538w0 = null;
        return G0.f406611a;
    }
}
