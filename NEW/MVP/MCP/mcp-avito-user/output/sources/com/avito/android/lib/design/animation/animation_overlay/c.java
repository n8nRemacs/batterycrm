package com.avito.android.lib.design.animation.animation_overlay;

import com.avito.android.lib.design.animation.AnimationView;
import kotlin.Metadata;

/* compiled from: AnimationOverlay.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/animation/animation_overlay/c;", "Lcom/avito/android/lib/design/animation/AnimationView$b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements AnimationView.b {

    /* renamed from: a, reason: collision with root package name */
    public int f178322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f178323b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f178324c;

    public c(int i12, b bVar) {
        this.f178323b = i12;
        this.f178324c = bVar;
    }

    @Override // com.avito.android.lib.design.animation.AnimationView.b
    public final void a(float f12) {
        if (f12 == 1.0f) {
            if (this.f178322a == this.f178323b) {
                this.f178324c.c();
            }
            this.f178322a++;
        }
    }
}
