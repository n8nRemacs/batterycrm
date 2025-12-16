package com.avito.android.section.action;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Action;
import com.avito.android.section.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SectionActionPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/section/action/d;", "Lcom/avito/android/section/action/b;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements b {

    /* renamed from: b, reason: collision with root package name */
    @l
    public Object f264614b;

    @Inject
    public d() {
    }

    @Override // com.avito.android.section.action.b
    public final void K2(@k z zVar) {
        this.f264614b = zVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        a aVar2 = (a) eVar;
        Action f264683g = ((SectionActionItem) aVar).getF264683g();
        if (f264683g == null) {
            aVar2.Gi(false);
        } else {
            aVar2.Gi(true);
            aVar2.D3(f264683g.getTitle(), new c(this, f264683g));
        }
    }

    @Override // com.avito.android.section.action.b
    public final void c0() {
        this.f264614b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.recycler.responsive.g
    public final /* bridge */ /* synthetic */ void r0(com.avito.konveyor.adapter.b bVar, int i12) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.recycler.responsive.g
    public final /* bridge */ /* synthetic */ void t0(com.avito.konveyor.adapter.b bVar, int i12) {
    }
}
