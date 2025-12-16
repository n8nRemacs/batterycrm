package com.avito.android.serp.adapter.recomendations.restyle;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.serp.adapter.recomendations.m;
import com.avito.android.serp.adapter.recomendations.n;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ExpandableSectionRestyleView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/recomendations/restyle/c;", "Lcom/avito/android/serp/adapter/recomendations/m;", "Lcom/avito/android/serp/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends com.avito.android.serp.c implements m {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f270574b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f270575c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f270576d;

    public c(@k View view) {
        super(view);
        this.f270574b = view;
        this.f270575c = new n(view);
        this.f270576d = (ImageView) view.findViewById(R.id.arrow_image_view);
    }

    @Override // com.avito.android.serp.adapter.recomendations.m
    public final void Z(@k String str) {
        this.f270575c.Z(str);
    }

    @Override // com.avito.android.serp.adapter.recomendations.m
    public final void a(@k Y41.a<G0> aVar) {
        this.f270575c.a(aVar);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f270575c.f270567f = null;
    }

    @Override // com.avito.android.serp.adapter.recomendations.m
    public final void j8(@k Y41.a<G0> aVar) {
        this.f270575c.f270567f = aVar;
    }

    @Override // com.avito.android.serp.adapter.recomendations.m
    public final void setTitle(@k String str) {
        this.f270575c.setTitle(str);
    }

    @Override // com.avito.android.serp.adapter.recomendations.m
    public final void y5(boolean z12) {
        View view = this.f270574b;
        ImageView imageView = this.f270576d;
        if (z12) {
            imageView.setImageDrawable(C35835l0.h(R.attr.ic_arrowDownBoldH4, view.getContext()));
        } else {
            imageView.setImageDrawable(C35835l0.h(R.attr.ic_arrowUpBoldH4, view.getContext()));
        }
    }
}
