package ru.avito.component.animator;

import android.view.View;
import kotlin.Metadata;

/* compiled from: DefaultAnimatorStrategy.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/animator/g;", "Lru/avito/component/animator/s;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class g extends s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f430292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f430293b;

    public g(int i12, int i13) {
        this.f430292a = i12;
        this.f430293b = i13;
    }

    @Override // ru.avito.component.animator.s, androidx.core.view.B0
    public final void c(@Y61.k View view) {
        if (this.f430292a != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f430293b != 0) {
            view.setTranslationY(0.0f);
        }
    }
}
