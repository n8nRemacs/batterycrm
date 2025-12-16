package com.avito.android.delivery_tarifikator.presentation.main_screen;

import Tv.C15410a;
import Y41.p;
import android.content.DialogInterface;
import com.avito.android.lib.design.modal.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TarifikatorMainFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class l extends N implements p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C15410a f135607l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ TarifikatorMainFragment f135608m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C15410a c15410a, TarifikatorMainFragment tarifikatorMainFragment) {
        super(2);
        this.f135607l = c15410a;
        this.f135608m = tarifikatorMainFragment;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        bVar2.setButtonsOrientation(1);
        C15410a c15410a = this.f135607l;
        bVar2.setTitle(c15410a.f15974a);
        bVar2.setSubtitle(c15410a.f15975b);
        String str = c15410a.f15976c;
        TarifikatorMainFragment tarifikatorMainFragment = this.f135608m;
        if (str != null) {
            bVar2.L3(str, new h(c15410a, tarifikatorMainFragment));
        }
        String str2 = c15410a.f15977d;
        if (str2 != null) {
            bVar2.M3(str2, new i(tarifikatorMainFragment));
        }
        bVar2.P3(new j(tarifikatorMainFragment));
        bVar2.b(new k(tarifikatorMainFragment));
        return G0.f406611a;
    }
}
