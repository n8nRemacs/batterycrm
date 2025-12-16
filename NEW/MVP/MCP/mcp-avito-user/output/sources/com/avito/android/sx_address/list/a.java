package com.avito.android.sx_address.list;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.sx_address.SxAddressAddResult;
import com.avito.android.sx_address.SxAddressCancel;
import com.avito.android.sx_address.SxAddressDeleteResult;
import com.avito.android.sx_address.SxAddressEditResult;
import com.avito.android.sx_address.SxAddressLinkResult;
import com.avito.android.sx_address.SxAddressRevalidateResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DeeplinkResultHandler.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/a;", "", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f293041a;

    public a(@k e eVar) {
        this.f293041a = eVar;
    }

    public final void a(@k SxAddressLinkResult sxAddressLinkResult, @k Button button) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z12 = sxAddressLinkResult instanceof SxAddressDeleteResult;
        e eVar = this.f293041a;
        if (z12) {
            SxAddressDeleteResult sxAddressDeleteResult = (SxAddressDeleteResult) sxAddressLinkResult;
            if (!(sxAddressDeleteResult instanceof SxAddressDeleteResult.Failure)) {
                if (!(sxAddressDeleteResult instanceof SxAddressDeleteResult.Success) || (str4 = ((SxAddressDeleteResult.Success) sxAddressDeleteResult).f292530b) == null) {
                    return;
                }
                com.avito.android.user_address.e.b(button, null, str4, eVar.getF293193b());
                return;
            }
            Throwable th2 = ((SxAddressDeleteResult.Failure) sxAddressDeleteResult).f292529b;
            if (th2 != null) {
                String localizedMessage = th2.getLocalizedMessage();
                str2 = localizedMessage != null ? localizedMessage : "Something went wrong";
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                PrintableText printableTextF = com.avito.android.printable_text.b.f(str2);
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.b(cVar, button, printableTextF, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181044b, null, false, false, null, null, 4014);
                return;
            }
            return;
        }
        if (sxAddressLinkResult instanceof SxAddressEditResult) {
            SxAddressEditResult sxAddressEditResult = (SxAddressEditResult) sxAddressLinkResult;
            if (!(sxAddressEditResult instanceof SxAddressEditResult.Failure)) {
                if (!(sxAddressEditResult instanceof SxAddressEditResult.Success) || (str3 = ((SxAddressEditResult.Success) sxAddressEditResult).f292538b) == null) {
                    return;
                }
                com.avito.android.user_address.e.b(button, null, str3, eVar.getF293194c());
                return;
            }
            Throwable th3 = ((SxAddressEditResult.Failure) sxAddressEditResult).f292537b;
            if (th3 != null) {
                String localizedMessage2 = th3.getLocalizedMessage();
                str2 = localizedMessage2 != null ? localizedMessage2 : "Something went wrong";
                com.avito.android.component.toast.c cVar2 = com.avito.android.component.toast.c.f125244a;
                PrintableText printableTextF2 = com.avito.android.printable_text.b.f(str2);
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.b(cVar2, button, printableTextF2, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181044b, null, false, false, null, null, 4014);
                return;
            }
            return;
        }
        if (sxAddressLinkResult instanceof SxAddressRevalidateResult) {
            SxAddressRevalidateResult sxAddressRevalidateResult = (SxAddressRevalidateResult) sxAddressLinkResult;
            if (!(sxAddressRevalidateResult instanceof SxAddressRevalidateResult.Failure)) {
                boolean z13 = sxAddressRevalidateResult instanceof SxAddressRevalidateResult.Success;
                return;
            }
            Throwable th4 = ((SxAddressRevalidateResult.Failure) sxAddressRevalidateResult).f292543b;
            if (th4 != null) {
                String localizedMessage3 = th4.getLocalizedMessage();
                str2 = localizedMessage3 != null ? localizedMessage3 : "Something went wrong";
                com.avito.android.component.toast.c cVar3 = com.avito.android.component.toast.c.f125244a;
                PrintableText printableTextF3 = com.avito.android.printable_text.b.f(str2);
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.b(cVar3, button, printableTextF3, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181044b, null, false, false, null, null, 4014);
                return;
            }
            return;
        }
        if (!(sxAddressLinkResult instanceof SxAddressAddResult)) {
            if (!(sxAddressLinkResult instanceof SxAddressCancel)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        SxAddressAddResult sxAddressAddResult = (SxAddressAddResult) sxAddressLinkResult;
        if (!(sxAddressAddResult instanceof SxAddressAddResult.Failure)) {
            if (!(sxAddressAddResult instanceof SxAddressAddResult.Success) || (str = ((SxAddressAddResult.Success) sxAddressAddResult).f292525b) == null) {
                return;
            }
            com.avito.android.user_address.e.b(button, null, str, eVar.getF293195d());
            return;
        }
        Throwable th5 = ((SxAddressAddResult.Failure) sxAddressAddResult).f292524b;
        if (th5 != null) {
            String localizedMessage4 = th5.getLocalizedMessage();
            str2 = localizedMessage4 != null ? localizedMessage4 : "Something went wrong";
            com.avito.android.component.toast.c cVar4 = com.avito.android.component.toast.c.f125244a;
            PrintableText printableTextF4 = com.avito.android.printable_text.b.f(str2);
            f.c.f125255c.getClass();
            com.avito.android.component.toast.c.b(cVar4, button, printableTextF4, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181044b, null, false, false, null, null, 4014);
        }
    }
}
