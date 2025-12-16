package com.avito.android.messenger.conversation.mvi.menu;

import android.view.View;
import com.avito.android.R;
import com.avito.android.messenger.conversation.mvi.menu.t;
import com.avito.android.remote.model.Action;
import com.avito.android.util.L5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChannelMenuView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class B extends N implements Y41.l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t.d.c f191410l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.o f191411m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u f191412n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(t.d.c cVar, com.avito.android.lib.design.bottom_sheet.o oVar, u uVar) {
        super(1);
        this.f191410l = cVar;
        this.f191411m = oVar;
        this.f191412n = uVar;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        Action action = this.f191410l.f191523b;
        com.avito.android.lib.design.bottom_sheet.o oVar = this.f191411m;
        if (action != null) {
            oVar.r();
            this.f191412n.f191537e.accept(G0.f406611a);
        } else {
            L5.a(oVar.getContext(), R.string.messenger_profile_is_not_available, 0);
        }
        return G0.f406611a;
    }
}
