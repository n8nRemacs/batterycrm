package com.avito.android.messenger.conversation;

import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC22955m;
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
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ChannelToastRenderer.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/a2;", "Lcom/avito/android/deeplink_handler/view/a$i;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a2 implements a.i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ActivityC22955m f189254b;

    public a2(@Y61.k ActivityC22955m activityC22955m) {
        this.f189254b = activityC22955m;
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    public final void V0(@Y61.k PrintableText printableText, @Y61.l List<? extends c.a> list, @Y61.l List<? extends c.a> list2, @Y61.l FrameLayout frameLayout, @Y61.k com.avito.android.component.toast.f fVar, int i12, @Y61.k ToastBarPosition toastBarPosition, boolean z12, boolean z13, @Y61.l i.b bVar, @Y61.l String str) {
        ToastBarPosition toastBarPosition2;
        if (fVar instanceof f.a ? true : kotlin.jvm.internal.L.f(fVar, f.b.f125254a)) {
            toastBarPosition2 = ToastBarPosition.f181047e;
        } else {
            if (!(fVar instanceof f.c)) {
                throw new NoWhenBranchMatchedException();
            }
            toastBarPosition2 = ToastBarPosition.f181044b;
        }
        ToastBarPosition toastBarPosition3 = toastBarPosition2;
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        ActivityC22955m activityC22955m = this.f189254b;
        com.avito.android.component.toast.c.b(cVar, ((com.avito.android.ui.activity.a) activityC22955m).K1(), printableText, list, list2, frameLayout, fVar, i12, toastBarPosition3, null, z12, z13, bVar, str != null ? new ContextThemeWrapper(activityC22955m, com.avito.android.lib.deprecated_design.f.b(R.style.Theme_DesignSystem_Legacy, str)) : null, 128);
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    public final void Y1(int i12) {
        L5.a(this.f189254b, i12, 1);
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
        L5.b(this.f189254b, str, 1);
    }
}
