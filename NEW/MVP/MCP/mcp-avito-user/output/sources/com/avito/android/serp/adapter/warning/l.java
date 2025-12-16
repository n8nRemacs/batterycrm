package com.avito.android.serp.adapter.warning;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import java.util.Iterator;
import java.util.List;
import jr.C42417b;
import jr.InterfaceC42416a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SerpWarningItemView.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/warning/l;", "Lcom/avito/android/serp/adapter/warning/k;", "Lcom/avito/konveyor/adapter/b;", "Ljr/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l extends com.avito.konveyor.adapter.b implements k, InterfaceC42416a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C42417b f273733b;

    public l(@Y61.k View view) {
        super(view);
        this.f273733b = new C42417b(view);
    }

    @Override // jr.InterfaceC42416a
    public final void B7(@Y61.l Y41.a<G0> aVar) {
        this.f273733b.B7(aVar);
    }

    @Override // jr.InterfaceC42416a
    public final void G4(@Y61.l com.avito.android.image_loader.a aVar) {
        this.f273733b.G4(aVar);
    }

    @Override // jr.InterfaceC42416a
    public final void P2(@Y61.k CharSequence charSequence) {
        this.f273733b.P2(charSequence);
    }

    @Override // jr.InterfaceC42416a
    public final void h2(@Y61.k List<InterfaceC42416a.C11584a> list) {
        this.f273733b.h2(list);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Iterator it = this.f273733b.f405834f.iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setOnClickListener(null);
        }
        B7(null);
    }

    @Override // jr.InterfaceC42416a
    public final void setCloseButtonVisible(boolean z12) {
        this.f273733b.setCloseButtonVisible(z12);
    }
}
