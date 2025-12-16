package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

import android.view.View;
import android.widget.PopupWindow;
import com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c;
import com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35694d;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.l0;

/* compiled from: UserAdvertsTooltipsPlayer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class u implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.h<com.avito.android.lib.design.tooltip.k> f315693b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C35695e f315694c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r f315695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC35693c.b f315696e;

    public u(l0.h hVar, C35695e c35695e, kotlinx.coroutines.r rVar, InterfaceC35693c.b bVar) {
        this.f315693b = hVar;
        this.f315694c = c35695e;
        this.f315695d = rVar;
        this.f315696e = bVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.C] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l0.h<com.avito.android.lib.design.tooltip.k> hVar = this.f315693b;
        com.avito.android.lib.design.tooltip.k kVar = hVar.f406842b;
        if (kVar != null) {
            kVar.setOnDismissListener((PopupWindow.OnDismissListener) this.f315694c.f315636c.getValue());
        }
        com.avito.android.lib.design.tooltip.k kVar2 = hVar.f406842b;
        if (kVar2 != null) {
            kVar2.dismiss();
        }
        int i12 = Z.f406624c;
        this.f315695d.resumeWith(new InterfaceC35694d.b(this.f315696e));
    }
}
