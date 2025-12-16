package com.avito.android.extended_profile_ui_components;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
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
import kotlin.jvm.internal.s0;

/* compiled from: ToastRendererWithPerformanceTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/s;", "Lcom/avito/android/deeplink_handler/view/a$i;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class s implements a.i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ActivityC22955m f153377b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Y41.a<ViewGroup> f153378c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f153379d;

    public s(@Y61.k ActivityC22955m activityC22955m, @Y61.l Y41.a aVar, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f153377b = activityC22955m;
        this.f153378c = aVar;
        this.f153379d = screenPerformanceTracker;
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    public final void V0(@Y61.k PrintableText printableText, @Y61.l List<? extends c.a> list, @Y61.l List<? extends c.a> list2, @Y61.l FrameLayout frameLayout, @Y61.k com.avito.android.component.toast.f fVar, int i12, @Y61.k ToastBarPosition toastBarPosition, boolean z12, boolean z13, @Y61.l i.b bVar, @Y61.l String str) {
        ViewGroup viewGroupInvoke;
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        ActivityC22955m activityC22955m = this.f153377b;
        Y41.a<ViewGroup> aVar = this.f153378c;
        if (aVar == null || (viewGroupInvoke = aVar.invoke()) == null) {
            viewGroupInvoke = (ViewGroup) activityC22955m.findViewById(R.id.content);
        }
        com.avito.android.component.toast.c.e(cVar, viewGroupInvoke, printableText, list, list2, frameLayout, fVar, i12, toastBarPosition, z12, z13, bVar, str != null ? new ContextThemeWrapper(activityC22955m, com.avito.android.lib.deprecated_design.f.b(com.avito.android.R.style.Theme_DesignSystem_Legacy, str)) : null, this.f153379d, 128);
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    public final void Y1(int i12) {
        L5.a(this.f153377b, i12, 1);
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
        L5.b(this.f153377b, str, 1);
    }
}
