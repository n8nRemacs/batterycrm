package com.avito.android.deeplink_handler.view.impl;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.i;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.L5;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;

/* compiled from: TypeBasedToastRenderer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/impl/l;", "Lcom/avito/android/deeplink_handler/view/a$i;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements a.i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f134630b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f134631c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final View f134632d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ToastBarPosition f134633e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ToastBarPosition f134634f;

    public l(Context context, View view, View view2, ToastBarPosition toastBarPosition, ToastBarPosition toastBarPosition2, int i12, C42822w c42822w) {
        view2 = (i12 & 4) != 0 ? null : view2;
        toastBarPosition = (i12 & 8) != 0 ? ToastBarPosition.f181044b : toastBarPosition;
        toastBarPosition2 = (i12 & 16) != 0 ? ToastBarPosition.f181045c : toastBarPosition2;
        this.f134630b = context;
        this.f134631c = view;
        this.f134632d = view2;
        this.f134633e = toastBarPosition;
        this.f134634f = toastBarPosition2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.deeplink_handler.view.a.i
    public final void V0(@Y61.k PrintableText printableText, @Y61.l List<? extends c.a> list, @Y61.l List<? extends c.a> list2, @Y61.l FrameLayout frameLayout, @Y61.k com.avito.android.component.toast.f fVar, int i12, @Y61.k ToastBarPosition toastBarPosition, boolean z12, boolean z13, @Y61.l i.b bVar, @Y61.l String str) {
        Q q12;
        boolean z14 = fVar instanceof f.c;
        View view = this.f134631c;
        if (z14) {
            View view2 = this.f134632d;
            if (view2 != null) {
                view = view2;
            }
            q12 = new Q(view, this.f134634f);
        } else {
            q12 = new Q(view, this.f134633e);
        }
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, (View) q12.f406619b, printableText, null, null, null, fVar, i12, (ToastBarPosition) q12.f406620c, null, false, false, bVar, null, 2958);
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    public final void Y1(int i12) {
        L5.a(this.f134630b, i12, 1);
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    @InterfaceC42830m
    public final void b2(int i12, @Y61.k f.c cVar, @Y61.k ToastBarPosition toastBarPosition) {
        a.i.C4057a.a(this, i12, cVar, toastBarPosition);
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    @InterfaceC42830m
    public final void m0(@Y61.k String str, @Y61.k com.avito.android.component.toast.f fVar, int i12, @Y61.k ToastBarPosition toastBarPosition) {
        a.i.C4057a.b(this, str, fVar, i12, toastBarPosition);
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    public final void z1(@Y61.k String str) {
        L5.b(this.f134630b, str, 1);
    }
}
