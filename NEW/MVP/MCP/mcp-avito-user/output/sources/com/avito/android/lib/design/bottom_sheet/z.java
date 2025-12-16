package com.avito.android.lib.design.bottom_sheet;

import android.view.View;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class z implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f178619b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A f178620c;

    public /* synthetic */ z(A a12, int i12) {
        this.f178619b = i12;
        this.f178620c = a12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r2v6, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f178619b) {
            case 0:
                A a12 = this.f178620c;
                ?? r02 = a12.f178488r;
                if (r02 != 0) {
                    r02.invoke();
                }
                a12.dismiss();
                break;
            case 1:
                A a13 = this.f178620c;
                if (!a13.f178491u) {
                    a13.dismiss();
                    break;
                } else {
                    Y41.a<G0> aVar = a13.f178486p;
                    if (aVar != null) {
                        aVar.invoke();
                        break;
                    }
                }
                break;
            default:
                ?? r22 = this.f178620c.f178487q;
                if (r22 != 0) {
                    r22.invoke();
                    break;
                }
                break;
        }
    }
}
