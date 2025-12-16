package com.avito.android.lib.design.bottom_sheet;

import android.view.View;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f178553b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f178554c;

    /* JADX WARN: Type inference failed for: r0v2, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f178554c;
        switch (this.f178553b) {
            case 0:
                Y41.a<G0> aVar = ((k) obj).f178550j;
                if (aVar != null) {
                    aVar.invoke();
                    break;
                }
                break;
            default:
                int i12 = o.f178559F;
                ((N) obj).invoke(view);
                break;
        }
    }
}
