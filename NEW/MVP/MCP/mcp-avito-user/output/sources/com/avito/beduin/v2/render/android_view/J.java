package com.avito.beduin.v2.render.android_view;

import android.graphics.Rect;
import android.view.View;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class J implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f337925b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K f337926c;

    public /* synthetic */ J(K k12, int i12) {
        this.f337925b = i12;
        this.f337926c = k12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f337925b) {
            case 0:
                K k12 = this.f337926c;
                View view = k12.f337927a;
                boolean z12 = false;
                if (view.getVisibility() != 8) {
                    int[] iArr = k12.f337935i;
                    view.getLocationInWindow(iArr);
                    int i12 = iArr[0];
                    int width = view.getWidth() + i12;
                    int i13 = iArr[1];
                    int height = view.getHeight() + i13;
                    Rect rect = k12.f337934h;
                    boolean z13 = Math.max(i12, rect.left) <= Math.min(width, rect.right);
                    boolean z14 = Math.max(i13, rect.top) <= Math.min(height, rect.bottom);
                    if (z13 && z14) {
                        z12 = true;
                    }
                }
                k12.b(z12);
                break;
            case 1:
                Y41.a<G0> aVar = this.f337926c.f337928b;
                if (aVar != null) {
                    aVar.invoke();
                    break;
                }
                break;
            default:
                Y41.a<G0> aVar2 = this.f337926c.f337929c;
                if (aVar2 != null) {
                    aVar2.invoke();
                    break;
                }
                break;
        }
    }
}
