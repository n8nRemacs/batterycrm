package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.a;
import defpackage.d6;
import defpackage.dz7;
import defpackage.gwi;
import defpackage.imb;
import defpackage.qc;
import defpackage.uq3;
import defpackage.vq3;
import defpackage.wq3;
import defpackage.xp8;

/* loaded from: classes2.dex */
public final class ConfirmationDialog extends DialogFragment {
    public boolean y1;

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        y0();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        y0();
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog v0() {
        int i;
        int i2;
        int i3;
        int i4;
        Bundle bundleJ0 = j0();
        String string = bundleJ0.getString("ru.ok.tamtam.extra.TITLE");
        CharSequence charSequence = bundleJ0.getCharSequence("ru.ok.tamtam.extra.CONTENT");
        String string2 = bundleJ0.getString("ru.ok.tamtam.extra.POSITIVE_TEXT");
        String string3 = bundleJ0.getString("ru.ok.tamtam.extra.NEGATIVE_TEXT");
        if (TextUtils.isEmpty(string) && (i4 = bundleJ0.getInt("ru.ok.tamtam.extra.TITLE_RES_ID")) != 0) {
            string = y(i4);
        }
        if (TextUtils.isEmpty(charSequence) && (i3 = bundleJ0.getInt("ru.ok.tamtam.extra.CONTENT_RES_ID")) != 0) {
            charSequence = y(i3);
        }
        if (TextUtils.isEmpty(string2) && (i2 = bundleJ0.getInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID")) != 0) {
            string2 = y(i2);
        }
        if (TextUtils.isEmpty(string3) && (i = bundleJ0.getInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID")) != 0) {
            string3 = y(i);
        }
        xp8 xp8VarB = new xp8(k0(), 0).b(string);
        qc qcVar = xp8VarB.a;
        qcVar.f = charSequence;
        uq3 uq3Var = new uq3(this, 0);
        qcVar.g = string2;
        qcVar.h = uq3Var;
        uq3 uq3Var2 = new uq3(this, 1);
        qcVar.k = string3;
        qcVar.l = uq3Var2;
        return xp8VarB.create();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y0() {
        if (this.y1) {
            return;
        }
        Bundle bundle = this.X;
        Bundle bundle2 = bundle != null ? bundle.getBundle("oneme:share:data") : null;
        x().b0("ConfirmationDialog:request_key", gwi.b(new imb("NEGATIVE", wq3.b)));
        a aVarZ = z(true);
        if (aVarZ == 0) {
            dz7 dz7VarT = t();
            if (dz7VarT instanceof vq3) {
                ((vq3) dz7VarT).getClass();
            } else if (dz7VarT instanceof d6) {
                Intent intent = new Intent();
                intent.putExtra("oneme:share:data", bundle2);
                ((d6) dz7VarT).onActivityResult(A(), 0, intent);
            }
        } else if (aVarZ instanceof vq3) {
        } else {
            Intent intent2 = new Intent();
            intent2.putExtra("oneme:share:data", bundle2);
            aVarZ.J(A(), 0, intent2);
        }
        this.y1 = true;
    }
}
