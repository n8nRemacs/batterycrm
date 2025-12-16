package Vp0;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.section.action.f;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SectionTitleWithActionItemView.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"LVp0/e;", "Lcom/avito/konveyor/adapter/b;", "LVp0/a;", "Lcom/avito/android/section/title/d;", "Lcom/avito/android/section/action/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends com.avito.konveyor.adapter.b implements InterfaceC15706a, com.avito.android.section.title.d, com.avito.android.section.action.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.section.title.e f17410b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final f f17411c;

    public e(@k View view, @k com.avito.android.section.title.e eVar, @k f fVar) {
        super(view);
        this.f17410b = eVar;
        this.f17411c = fVar;
    }

    @Override // com.avito.android.section.action.a
    public final void D3(@k String str, @k Y41.a<G0> aVar) {
        this.f17411c.D3(str, aVar);
    }

    @Override // com.avito.android.section.action.a
    public final void Gi(boolean z12) {
        this.f17411c.Gi(z12);
    }

    @Override // com.avito.android.section.title.d
    public final void b(@l String str) {
        this.f17410b.b(str);
    }

    @Override // com.avito.android.section.title.d
    public final void j(@l String str) {
        this.f17410b.j(str);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f17410b.getClass();
        this.f17411c.getClass();
    }
}
