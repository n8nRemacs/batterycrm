package com.avito.android.user_address;

import Y61.k;
import Y61.l;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import androidx.compose.foundation.H;
import com.avito.android.R;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;
import kotlin.text.C43066x;

/* compiled from: SuccessToast.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_user-address_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {
    public static final void a(@k View view, @k UserAddressLink.Result.Success success) {
        String string;
        String str;
        String str2;
        boolean z12;
        if (success instanceof UserAddressLink.Result.Success.Added) {
            UserAddressLink.Result.Success.Added added = (UserAddressLink.Result.Success.Added) success;
            string = view.getContext().getString(R.string.saved);
            str = added.f133812f;
            str2 = added.f133811e;
            z12 = added.f133808b;
        } else {
            if (success instanceof UserAddressLink.Result.Success.DefaultChanged) {
                return;
            }
            if (success instanceof UserAddressLink.Result.Success.Delete) {
                UserAddressLink.Result.Success.Delete delete = (UserAddressLink.Result.Success.Delete) success;
                string = view.getContext().getString(R.string.deleted);
                str = delete.f133820e;
                str2 = delete.f133819d;
                z12 = delete.f133817b;
            } else {
                if (!(success instanceof UserAddressLink.Result.Success.Modified)) {
                    throw new NoWhenBranchMatchedException();
                }
                UserAddressLink.Result.Success.Modified modified = (UserAddressLink.Result.Success.Modified) success;
                string = view.getContext().getString(R.string.saved);
                str = modified.f133825f;
                str2 = modified.f133824e;
                z12 = modified.f133821b;
            }
        }
        if (z12) {
            b(view, str, str2, string);
        }
    }

    public static final void b(@k View view, @l String str, @k String str2, @k String str3) {
        String str4;
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(view.getContext(), R.style.Theme_DesignSystem_Re23);
        if (str == null || C43066x.K(str)) {
            u0 u0Var = u0.f406856a;
            str4 = String.format(view.getContext().getString(R.string.success_action_toast_title), Arrays.copyOf(new Object[]{""}, 1));
        } else {
            u0 u0Var2 = u0.f406856a;
            str4 = String.format(view.getContext().getString(R.string.success_action_toast_title), Arrays.copyOf(new Object[]{AK.c.k("«", str, "» ")}, 1));
        }
        String strConcat = str4.concat(str3);
        SpannableString spannableString = new SpannableString(H.i('\n', strConcat, str2));
        spannableString.setSpan(new TextAppearanceSpan(view.getContext(), C35835l0.j(R.attr.textH40, view.getContext())), 0, strConcat.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(y6.b(18)), 0, strConcat.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(C35835l0.d(R.attr.white, dVar)), 0, strConcat.length(), 33);
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, view, com.avito.android.printable_text.b.e(spannableString), null, null, null, null, 0, null, null, false, false, null, null, 4094);
    }
}
