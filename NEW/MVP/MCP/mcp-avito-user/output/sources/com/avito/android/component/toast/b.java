package com.avito.android.component.toast;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.ToastBarType;
import com.avito.android.lib.design.toast_bar.c;
import com.avito.android.util.V2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ToastBarExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_ui-messages_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {
    public static final com.avito.android.lib.design.toast_bar.b a(Context context, View view, String str, int i12, String str2, int i13, Y41.a aVar, int i14, ToastBarPosition toastBarPosition, f fVar) {
        ToastBarType toastBarType;
        boolean z12 = fVar instanceof f.c;
        if (z12 && toastBarPosition == ToastBarPosition.f181047e) {
            V2.f318762a.f(new IllegalArgumentException("Error toast must be shown on top of the screen.\nFor details see: https://www.figma.com/file/ijwUrqgP3X7rMP9vKzGPjg/%5BCurrent%5D-Guidelines?node-id=5854%3A47647"));
        }
        String string = i12 != 0 ? context.getString(i12) : str;
        if (i13 != 0) {
            str2 = context.getString(i13);
        }
        com.avito.android.lib.design.toast_bar.b bVar = new com.avito.android.lib.design.toast_bar.b();
        bVar.f181058d = 2750;
        bVar.f181059e = ToastBarPosition.f181047e;
        ToastBarType toastBarType2 = ToastBarType.f181051b;
        bVar.f181060f = toastBarType2;
        bVar.f181057c = aVar;
        bVar.f181056b = str2;
        bVar.f181061g = true;
        bVar.f181062h = true;
        bVar.f181055a = view;
        if (L.f(fVar, f.a.f125253a) ? true : L.f(fVar, f.b.f125254a)) {
            toastBarType = toastBarType2;
        } else {
            if (!z12) {
                throw new NoWhenBranchMatchedException();
            }
            toastBarType = ToastBarType.f181052c;
        }
        bVar.f181060f = toastBarType;
        bVar.f181059e = toastBarPosition;
        bVar.f181058d = i14;
        com.avito.android.lib.design.toast_bar.f fVar2 = bVar.f181063i;
        if (fVar2 != null) {
            fVar2.f();
        }
        bVar.f181063i = null;
        ToastBarType toastBarType3 = bVar.f181060f;
        com.avito.android.lib.design.toast_bar.f fVar3 = new com.avito.android.lib.design.toast_bar.f(context, null, toastBarType3 == toastBarType2 ? R.attr.toastBarDefault : R.attr.toastBarError, toastBarType3 == toastBarType2 ? R.style.Design_Widget_ToastBar_Default : R.style.Design_Widget_ToastBar_Error);
        bVar.f181063i = fVar3;
        fVar3.setText(string);
        fVar3.setActionText(bVar.f181056b);
        fVar3.setAction(bVar.f181057c);
        fVar3.setNegativeAction(null);
        fVar3.setNegativeActionText(null);
        fVar3.setAnchorView(bVar.f181055a);
        fVar3.setContainerView(null);
        fVar3.setSwipeEnabled(bVar.f181061g);
        fVar3.setDuration(bVar.f181058d);
        fVar3.setPosition(bVar.f181059e);
        fVar3.setDismissListener(null);
        fVar3.setContentHorizontal(bVar.f181062h);
        fVar3.setCloseOnAction(false);
        com.avito.android.lib.design.toast_bar.c.f181064a.getClass();
        c.a.f181066b.a(fVar3);
        g.f125258a.getClass();
        g.b(str, fVar);
        return bVar;
    }

    public static com.avito.android.lib.design.toast_bar.b b(View view, String str, int i12, String str2, int i13, Y41.a aVar, int i14, ToastBarPosition toastBarPosition, f fVar, View view2, int i15) {
        return a(view.getContext(), (i15 & 512) != 0 ? view : view2, (i15 & 1) != 0 ? "" : str, (i15 & 2) != 0 ? 0 : i12, (i15 & 4) != 0 ? null : str2, (i15 & 8) == 0 ? i13 : 0, (i15 & 16) == 0 ? aVar : null, (i15 & 32) != 0 ? 2750 : i14, (i15 & 64) != 0 ? ToastBarPosition.f181047e : toastBarPosition, (i15 & 128) != 0 ? f.a.f125253a : fVar);
    }

    public static void c(Fragment fragment, String str, ToastBarPosition toastBarPosition, f fVar, int i12) {
        if ((i12 & 64) != 0) {
            toastBarPosition = ToastBarPosition.f181047e;
        }
        a(fragment.requireContext(), fragment.requireView(), str, 0, null, 0, null, 2750, toastBarPosition, fVar);
    }
}
