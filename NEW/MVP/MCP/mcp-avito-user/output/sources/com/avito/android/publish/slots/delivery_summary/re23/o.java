package com.avito.android.publish.slots.delivery_summary.re23;

import android.view.View;
import com.avito.android.publish.slots.delivery_summary.item.x;
import hf0.DialogC40929b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f243707b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f243708c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f243709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y41.l f243710e;

    public /* synthetic */ o(q qVar, x xVar, Y41.l lVar, int i12) {
        this.f243707b = i12;
        this.f243708c = qVar;
        this.f243709d = xVar;
        this.f243710e = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        q qVar = this.f243708c;
        Y41.l lVar = this.f243710e;
        x xVar = this.f243709d;
        switch (this.f243707b) {
            case 0:
                int i12 = q.f243712F;
                hf0.e eVar = xVar.f243636c;
                qVar.getClass();
                if (eVar != null) {
                    com.avito.android.lib.util.g.a(new DialogC40929b(qVar.f243721p.getContext(), eVar, lVar));
                    break;
                }
                break;
            case 1:
                int i13 = q.f243712F;
                hf0.e eVar2 = xVar.f243636c;
                qVar.getClass();
                if (eVar2 != null) {
                    com.avito.android.lib.util.g.a(new DialogC40929b(qVar.f243721p.getContext(), eVar2, lVar));
                    break;
                }
                break;
            default:
                int i14 = q.f243712F;
                hf0.e eVar3 = xVar.f243636c;
                qVar.getClass();
                if (eVar3 != null) {
                    com.avito.android.lib.util.g.a(new DialogC40929b(qVar.f243721p.getContext(), eVar3, lVar));
                    break;
                }
                break;
        }
    }
}
