package Oi0;

import TV0.g;
import Y61.k;
import android.view.ViewGroup;
import com.avito.android.util.C;
import com.avito.android.util.V2;
import com.avito.konveyor.adapter.j;
import kotlin.Metadata;

/* compiled from: SafeRecyclerAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOi0/d;", "Lcom/avito/konveyor/adapter/j;", "_avito_recycler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Oi0.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14700d extends j {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C f12494f;

    public C14700d(@k com.avito.konveyor.adapter.a aVar, @k g<? extends com.avito.konveyor.adapter.b> gVar, @k C c12) {
        super(aVar, gVar);
        this.f12494f = c12;
    }

    @Override // com.avito.konveyor.adapter.j, androidx.recyclerview.widget.RecyclerView.Adapter
    @k
    /* renamed from: j */
    public final com.avito.konveyor.adapter.b onCreateViewHolder(@k ViewGroup viewGroup, int i12) {
        try {
            return super.onCreateViewHolder(viewGroup, i12);
        } catch (Throwable th2) {
            this.f12494f.o().getClass();
            V2.f318762a.a("SafeRecyclerAdapter", "Failed to inflate view of " + i12, th2);
            return new com.avito.konveyor.adapter.c(viewGroup);
        }
    }
}
