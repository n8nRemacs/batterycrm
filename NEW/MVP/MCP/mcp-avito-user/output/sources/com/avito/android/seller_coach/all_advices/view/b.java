package com.avito.android.seller_coach.all_advices.view;

import Gq0.C13908a;
import Y41.l;
import android.os.Bundle;
import com.avito.android.lib.util.g;
import com.avito.android.seller_coach.all_advices.view.AllAdvicesFragment;
import com.avito.android.seller_coach.all_advices.vm.a;
import com.avito.android.seller_coach.hints_dialog.view.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AllAdvicesFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/seller_coach/all_advices/vm/a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/seller_coach/all_advices/vm/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class b extends N implements l<com.avito.android.seller_coach.all_advices.vm.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AllAdvicesFragment f267419l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.seller_coach.all_advices.vm.b f267420m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AllAdvicesFragment allAdvicesFragment, com.avito.android.seller_coach.all_advices.vm.b bVar) {
        super(1);
        this.f267419l = allAdvicesFragment;
        this.f267420m = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.seller_coach.all_advices.vm.a aVar) {
        com.avito.android.seller_coach.all_advices.vm.a aVar2 = aVar;
        boolean z12 = aVar2 instanceof a.b;
        AllAdvicesFragment allAdvicesFragment = this.f267419l;
        if (z12) {
            h.b bVar = allAdvicesFragment.f267407z0;
            if (bVar == null) {
                bVar = null;
            }
            g.a(bVar.a(new C13908a(((a.b) aVar2).f267437a, "from_list", true), allAdvicesFragment, this.f267420m));
        } else if (aVar2 instanceof a.C7988a) {
            AllAdvicesFragment.a aVar3 = AllAdvicesFragment.f267395F0;
            Bundle bundle = new Bundle(1);
            bundle.putBoolean("key_hints_dialog_data", true);
            G0 g02 = G0.f406611a;
            allAdvicesFragment.getParentFragmentManager().o0(bundle, "request_key_hints_dialog");
        }
        return G0.f406611a;
    }
}
