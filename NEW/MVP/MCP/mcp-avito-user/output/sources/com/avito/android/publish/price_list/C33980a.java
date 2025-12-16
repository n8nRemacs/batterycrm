package com.avito.android.publish.price_list;

import android.content.DialogInterface;
import com.avito.android.lib.design.input.Input;
import com.avito.android.publish.price_list.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectPriceListFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.price_list.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33980a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SelectPriceListFragment f238413l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f238414m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33980a(SelectPriceListFragment selectPriceListFragment, DialogInterface dialogInterface) {
        super(0);
        this.f238413l = selectPriceListFragment;
        this.f238414m = dialogInterface;
    }

    @Override // Y41.a
    public final G0 invoke() {
        SelectPriceListFragment selectPriceListFragment = this.f238413l;
        z zVar = selectPriceListFragment.f238399z0;
        if (zVar != null) {
            Input.t(zVar.f238950l, null, false, 6);
        }
        ((com.avito.android.publish.price_list.mvi.entity.c) selectPriceListFragment.f238389p0.getValue()).accept(a.f.f238825a);
        this.f238414m.dismiss();
        return G0.f406611a;
    }
}
