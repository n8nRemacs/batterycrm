package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

import android.widget.PopupWindow;
import com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c;
import com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35694d;
import kotlin.Metadata;
import kotlin.Z;

/* compiled from: UserAdvertsTooltipsPlayer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "onDismiss", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class w implements PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r f315702b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC35693c.b f315703c;

    public w(kotlinx.coroutines.r rVar, InterfaceC35693c.b bVar) {
        this.f315702b = rVar;
        this.f315703c = bVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        int i12 = Z.f406624c;
        this.f315702b.resumeWith(new InterfaceC35694d.a(this.f315703c));
    }
}
