package com.avito.android.lib.deprecated_design.circular_progress;

import android.animation.ValueAnimator;
import kotlin.Metadata;

/* compiled from: DefaultCircularProgressDrawableDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/circular_progress/h;", "Lcom/avito/android/lib/deprecated_design/circular_progress/q;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h extends q {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f177902c;

    public h(i iVar) {
        this.f177902c = iVar;
    }

    @Override // com.avito.android.lib.deprecated_design.circular_progress.q
    public final void a() {
        if (!this.f177937a || this.f177938b) {
            return;
        }
        i iVar = this.f177902c;
        iVar.f177914l = true;
        iVar.f177910h += iVar.f177905c;
        int i12 = iVar.f177908f + 1;
        int[] iArr = iVar.f177904b;
        int length = i12 % iArr.length;
        iVar.f177908f = length;
        int i13 = iArr[length];
        iVar.f177907e = i13;
        iVar.f177903a.f177883e.setColor(i13);
        ValueAnimator valueAnimator = iVar.f177915m;
        if (valueAnimator == null) {
            valueAnimator = null;
        }
        valueAnimator.start();
    }
}
