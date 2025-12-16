package com.avito.android.tariff.cpa.configure_advance;

import android.content.DialogInterface;
import com.avito.android.tariff.cpa.configure_advance.viewmodel.p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ConfigureAdvanceFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ConfigureAdvanceFragment f294316l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f294317m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ConfigureAdvanceFragment configureAdvanceFragment, DialogInterface dialogInterface) {
        super(0);
        this.f294316l = configureAdvanceFragment;
        this.f294317m = dialogInterface;
    }

    @Override // Y41.a
    public final G0 invoke() {
        p pVar = this.f294316l.f294244o0;
        if (pVar == null) {
            pVar = null;
        }
        pVar.E0();
        this.f294317m.dismiss();
        return G0.f406611a;
    }
}
