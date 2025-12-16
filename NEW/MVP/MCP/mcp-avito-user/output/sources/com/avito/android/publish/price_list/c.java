package com.avito.android.publish.price_list;

import android.content.Context;
import android.content.DialogInterface;
import com.avito.android.lib.design.modal.a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.publish.price_list.mvi.entity.e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectPriceListFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class c extends N implements Y41.p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.publish.price_list.mvi.entity.e f238416l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f238417m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ SelectPriceListFragment f238418n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.avito.android.publish.price_list.mvi.entity.e eVar, Context context, SelectPriceListFragment selectPriceListFragment) {
        super(2);
        this.f238416l = eVar;
        this.f238417m = context;
        this.f238418n = selectPriceListFragment;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        DialogInterface dialogInterface2 = dialogInterface;
        e.i iVar = (e.i) this.f238416l;
        PrintableText printableText = iVar.f238845a;
        Context context = this.f238417m;
        bVar2.setTitle(printableText.k0(context));
        bVar2.setButtonsOrientation(1);
        bVar2.setCancelable(true);
        bVar2.setSubtitle(iVar.f238846b.k0(context));
        bVar2.L3(iVar.f238847c.k0(context), new C33980a(this.f238418n, dialogInterface2));
        bVar2.M3(iVar.f238848d.k0(context), new b(dialogInterface2));
        return G0.f406611a;
    }
}
