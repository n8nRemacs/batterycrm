package com.avito.android.ui.adapter;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GridLayoutNoLoaderAppendingHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/adapter/l;", "Lcom/avito/android/ui/adapter/e;", "_avito_appending-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f304568a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f304569b;

    /* renamed from: c, reason: collision with root package name */
    public RecyclerView.Adapter<?> f304570c;

    /* renamed from: d, reason: collision with root package name */
    public f f304571d;

    public l(@Y61.k n nVar, boolean z12) {
        this.f304568a = nVar;
        this.f304569b = z12;
    }

    public final void a(int i12) {
        f fVar = this.f304571d;
        if (fVar == null) {
            fVar = null;
        }
        if (fVar.gk()) {
            n nVar = this.f304568a;
            int f268504a = nVar.getF268504a();
            int iD2 = nVar.d(i12);
            if (iD2 >= f268504a - 1 || (this.f304569b && iD2 == f268504a - ((10 / nVar.getF269087c()) + 1))) {
                f fVar2 = this.f304571d;
                (fVar2 != null ? fVar2 : null).rp();
            }
        }
    }

    public /* synthetic */ l(n nVar, boolean z12, int i12, C42822w c42822w) {
        this(nVar, (i12 & 2) != 0 ? false : z12);
    }
}
