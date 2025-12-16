package com.google.android.exoplayer2.ui;

import android.content.res.Resources;
import android.view.View;
import com.avito.android.R;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.ui.s;
import com.google.android.exoplayer2.util.U;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f347650b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f347651c;

    public /* synthetic */ t(Object obj, int i12) {
        this.f347650b = i12;
        this.f347651c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Resources.NotFoundException {
        Object obj = this.f347651c;
        switch (this.f347650b) {
            case 0:
                s sVar = s.this;
                d0 d0Var = sVar.f347569P;
                if (d0Var != null) {
                    com.google.android.exoplayer2.trackselection.r rVarG = d0Var.g();
                    d0 d0Var2 = sVar.f347569P;
                    int i12 = U.f348106a;
                    d0Var2.w(rVarG.a().b(1).g(1).a());
                    sVar.f347599l0.f347639d[1] = sVar.getResources().getString(R.string.exo_track_selection_auto);
                    sVar.f347603n0.dismiss();
                    break;
                }
                break;
            case 1:
                int i13 = s.g.f347633f;
                s.g gVar = (s.g) obj;
                int adapterPosition = gVar.getAdapterPosition();
                s sVar2 = s.this;
                if (adapterPosition != 0) {
                    if (adapterPosition != 1) {
                        sVar2.f347603n0.dismiss();
                        break;
                    } else {
                        sVar2.d(sVar2.f347611r0);
                        break;
                    }
                } else {
                    sVar2.d(sVar2.f347601m0);
                    break;
                }
            case 2:
                s sVar3 = s.this;
                d0 d0Var3 = sVar3.f347569P;
                if (d0Var3 != null) {
                    sVar3.f347569P.w(d0Var3.g().a().b(3).e().a());
                    sVar3.f347603n0.dismiss();
                    break;
                }
                break;
            case 3:
                z zVar = (z) obj;
                zVar.g();
                if (view.getId() != R.id.exo_overflow_show) {
                    if (view.getId() == R.id.exo_overflow_hide) {
                        zVar.f347684r.start();
                        break;
                    }
                } else {
                    zVar.f347683q.start();
                    break;
                }
                break;
            default:
                s.a((s) obj);
                break;
        }
    }
}
