package ru.avito.component.animator;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: ExtensibleItemAnimator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/animator/o;", "Lru/avito/component/animator/s;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class o extends s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f430331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.C f430332b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f430333c;

    public o(k kVar, RecyclerView.C c12, a aVar) {
        this.f430331a = kVar;
        this.f430332b = c12;
        this.f430333c = aVar;
    }

    @Override // ru.avito.component.animator.s, androidx.core.view.B0
    public final void a(@Y61.k View view) {
        this.f430333c.f430290a.e(null);
        k kVar = this.f430331a;
        RecyclerView.C c12 = this.f430332b;
        kVar.h(c12);
        kVar.f430306q.remove(c12);
        kVar.t();
    }

    @Override // ru.avito.component.animator.s, androidx.core.view.B0
    public final void b(@Y61.k View view) {
        this.f430331a.getClass();
    }
}
