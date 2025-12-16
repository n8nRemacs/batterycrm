package il;

import Y61.k;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import com.avito.konveyor.adapter.h;
import com.avito.konveyor.adapter.i;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BxContentAdapterPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lil/a;", "Lcom/avito/konveyor/adapter/a;", "Lcom/avito/konveyor/adapter/i;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: il.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C41420a implements com.avito.konveyor.adapter.a, i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f398715b;

    public C41420a(@k h hVar) {
        this.f398715b = hVar;
    }

    @Override // com.avito.konveyor.adapter.a
    public final void a(@k RecyclerView.Adapter<com.avito.konveyor.adapter.b> adapter, @k com.avito.konveyor.adapter.b bVar) {
        this.f398715b.getClass();
    }

    @Override // com.avito.konveyor.adapter.a
    public final int b(int i12) {
        return this.f398715b.b(i12);
    }

    @Override // com.avito.konveyor.adapter.a
    public final void c(@k UV0.a<? extends TV0.a> aVar) {
        this.f398715b.f338510e = aVar;
    }

    @Override // com.avito.konveyor.adapter.a
    public final void d(@k com.avito.konveyor.adapter.b bVar) {
        this.f398715b.getClass();
    }

    @Override // com.avito.konveyor.adapter.a
    public final void e(@k com.avito.konveyor.adapter.b bVar, int i12, @k List list) {
        this.f398715b.e(bVar, i12, list);
    }

    @Override // com.avito.konveyor.adapter.a
    public final int getCount() {
        return this.f398715b.f338510e.getCount();
    }

    @Override // com.avito.konveyor.adapter.i
    @k
    public final TV0.a getItem(int i12) {
        return this.f398715b.getItem(i12);
    }

    @Override // com.avito.konveyor.adapter.a
    public final long getItemId(int i12) {
        TV0.a item = this.f398715b.getItem(i12);
        SerpConstructorAdvertItem serpConstructorAdvertItem = item instanceof SerpConstructorAdvertItem ? (SerpConstructorAdvertItem) item : null;
        Long gigShiftId = serpConstructorAdvertItem != null ? serpConstructorAdvertItem.getGigShiftId() : null;
        return gigShiftId != null ? gigShiftId.longValue() : item.getF75535g();
    }

    @Override // com.avito.konveyor.adapter.a
    public final boolean isEmpty() {
        return this.f398715b.isEmpty();
    }
}
