package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import defpackage.bwf;
import defpackage.gsc;
import defpackage.gwi;
import defpackage.imb;
import defpackage.isc;
import defpackage.l6g;
import defpackage.lsc;
import defpackage.mvd;
import defpackage.nca;
import defpackage.q1g;
import defpackage.qc;
import defpackage.rbh;
import defpackage.uq3;
import defpackage.vc;
import defpackage.we3;
import defpackage.wqi;
import defpackage.wy1;
import defpackage.xp8;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/views/dialogs/VideoQualityPickerDialog;", "Lru/ok/messages/views/dialogs/FrgDlgBase;", "<init>", "()V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoQualityPickerDialog extends FrgDlgBase {
    @Override // androidx.fragment.app.DialogFragment
    public final Dialog v0() {
        int i;
        final ArrayList parcelableArrayList = j0().getParcelableArrayList("ru.ok.tamtam.extra.QUALITIES");
        boolean z = j0().getBoolean("ru.ok.tamtam.extra.SHOW_SIZE");
        gsc gscVar = (gsc) j0().getSerializable("ru.ok.tamtam.extra.CURRENT_QUALITY");
        if (gscVar != null) {
            Iterator it = parcelableArrayList.iterator();
            i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((lsc) it.next()).a.a == gscVar) {
                    break;
                }
                i++;
            }
        } else {
            i = 0;
        }
        Context contextK0 = k0();
        bwf bwfVar = q1g.a0;
        q1g q1gVarD = nca.d(contextK0);
        ArrayList arrayList = new ArrayList(we3.q(parcelableArrayList, 10));
        Iterator it2 = parcelableArrayList.iterator();
        while (it2.hasNext()) {
            isc iscVar = ((lsc) it2.next()).a;
            boolean z2 = iscVar.f;
            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) iscVar.a.a);
            if (z) {
                String strU = l6g.u(iscVar.e, true, null);
                spannableStringBuilderAppend.append(' ').append(z2 ? wy1.h("– ", strU) : wy1.h("~ ", strU), new ForegroundColorSpan(q1gVarD.M), 34);
            }
            if (z2) {
                spannableStringBuilderAppend.append(' ').append(wy1.h("– ", y(mvd.T0)), new ForegroundColorSpan(q1gVarD.M), 17);
            }
            arrayList.add(spannableStringBuilderAppend);
        }
        xp8 xp8VarB = new xp8(k0(), 0).b(y(mvd.o2));
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new SpannableStringBuilder[0]);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: nbh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.a.y0(new qbh(((lsc) parcelableArrayList.get(i2)).a.a));
            }
        };
        qc qcVar = xp8VarB.a;
        qcVar.o = charSequenceArr;
        qcVar.q = onClickListener;
        qcVar.t = i;
        qcVar.s = true;
        String strY = y(mvd.p);
        uq3 uq3Var = new uq3(this, 2);
        qc qcVar2 = xp8VarB.a;
        qcVar2.k = strY;
        qcVar2.l = uq3Var;
        vc vcVarCreate = xp8VarB.create();
        vcVarCreate.show();
        return vcVarCreate;
    }

    public final void y0(rbh rbhVar) {
        wqi.c("ru.ok.messages.views.dialogs.VideoQualityPickerDialog", "set fragment result " + rbhVar, new Object[0]);
        x().b0("VideoQualityPickerDialog:result:request", gwi.b(new imb("VideoQualityPickerDialog:result:key", rbhVar)));
        t0(false, false);
    }
}
