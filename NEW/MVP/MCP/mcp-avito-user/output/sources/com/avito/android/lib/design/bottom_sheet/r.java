package com.avito.android.lib.design.bottom_sheet;

import android.view.View;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class r implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f178565b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f178566c;

    public /* synthetic */ r(u uVar, int i12) {
        this.f178565b = i12;
        this.f178566c = uVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r5v6, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f178565b) {
            case 0:
                u uVar = this.f178566c;
                ?? r02 = uVar.f178598y;
                if (r02 != 0) {
                    r02.invoke();
                }
                uVar.f178575b.postDelayed(new s(uVar), 250L);
                if (uVar.f178589p.f355975L != 2) {
                    uVar.dismiss();
                    break;
                }
                break;
            case 1:
                u uVar2 = this.f178566c;
                if (!uVar2.f178573C) {
                    uVar2.dismiss();
                    break;
                } else {
                    Y41.a<G0> aVar = uVar2.f178596w;
                    if (aVar != null) {
                        aVar.invoke();
                        break;
                    }
                }
                break;
            default:
                ?? r52 = this.f178566c.f178597x;
                if (r52 != 0) {
                    r52.invoke();
                    break;
                }
                break;
        }
    }
}
