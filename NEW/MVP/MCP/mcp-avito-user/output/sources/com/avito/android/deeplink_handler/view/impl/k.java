package com.avito.android.deeplink_handler.view.impl;

import android.app.Activity;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.R;
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
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SimpleToastRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/impl/k;", "Lcom/avito/android/deeplink_handler/view/a$i;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public class k implements a.i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Activity f134629b;

    public k(@Y61.k Activity activity) {
        this.f134629b = activity;
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    public void V0(@Y61.k PrintableText printableText, @Y61.l List<? extends c.a> list, @Y61.l List<? extends c.a> list2, @Y61.l FrameLayout frameLayout, @Y61.k com.avito.android.component.toast.f fVar, int i12, @Y61.k ToastBarPosition toastBarPosition, boolean z12, boolean z13, @Y61.l i.b bVar, @Y61.l String str) {
        ContextThemeWrapper contextThemeWrapper;
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        ViewGroup viewGroupA = a();
        if (str != null) {
            contextThemeWrapper = new ContextThemeWrapper(this.f134629b, com.avito.android.lib.deprecated_design.f.b(R.style.Theme_DesignSystem_Legacy, str));
        } else {
            contextThemeWrapper = null;
        }
        com.avito.android.component.toast.c.b(cVar, viewGroupA, printableText, list, list2, frameLayout, fVar, i12, toastBarPosition, null, z12, z13, bVar, contextThemeWrapper, 128);
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    public final void Y1(int i12) {
        L5.a(this.f134629b, i12, 1);
    }

    @Y61.k
    public ViewGroup a() {
        return (ViewGroup) this.f134629b.findViewById(android.R.id.content);
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
        L5.b(this.f134629b, str, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Activity activity, ToastBarPosition toastBarPosition, int i12, C42822w c42822w) {
        this(activity);
        if ((i12 & 2) != 0) {
            ToastBarPosition toastBarPosition2 = ToastBarPosition.f181044b;
        }
    }
}
