package ru.avito.component.animator;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: ExtensibleItemAnimator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/animator/n;", "Lru/avito/component/animator/s;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class n extends s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f430328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.C f430329b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f430330c;

    public n(k kVar, RecyclerView.C c12, a aVar) {
        this.f430328a = kVar;
        this.f430329b = c12;
        this.f430330c = aVar;
    }

    @Override // ru.avito.component.animator.s, androidx.core.view.B0
    public final void a(@Y61.k View view) {
        this.f430330c.f430290a.e(null);
        k kVar = this.f430328a;
        RecyclerView.C c12 = this.f430329b;
        kVar.h(c12);
        kVar.f430308s.remove(c12);
        kVar.t();
    }

    @Override // ru.avito.component.animator.s, androidx.core.view.B0
    public final void b(@Y61.k View view) {
        this.f430328a.getClass();
    }
}
