package ru.avito.component.animator;

import android.view.View;
import androidx.core.view.B0;
import kotlin.Metadata;

/* compiled from: ExtensibleItemAnimator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/animator/q;", "Landroidx/core/view/B0;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class q implements B0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f430337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B0 f430338b;

    public q(s sVar, B0 b02) {
        this.f430337a = sVar;
        this.f430338b = b02;
    }

    @Override // androidx.core.view.B0
    public final void a(@Y61.k View view) {
        this.f430337a.a(view);
        B0 b02 = this.f430338b;
        if (b02 != null) {
            b02.a(view);
        }
    }

    @Override // androidx.core.view.B0
    public final void b(@Y61.k View view) {
        this.f430337a.b(view);
        B0 b02 = this.f430338b;
        if (b02 != null) {
            b02.b(view);
        }
    }

    @Override // androidx.core.view.B0
    public final void c(@Y61.k View view) {
        this.f430337a.c(view);
        B0 b02 = this.f430338b;
        if (b02 != null) {
            b02.c(view);
        }
    }
}
