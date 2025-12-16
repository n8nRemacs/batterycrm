package com.avito.android.serp.adapter.vertical_main.featured.action;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.C;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FeaturedActionView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/featured/action/j;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/serp/adapter/vertical_main/featured/action/i;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends com.avito.android.serp.c implements i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f272826b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Button f272827c;

    public j(@k View view, @k d dVar) {
        super(view);
        this.f272826b = dVar;
        View viewFindViewById = view.findViewById(R.id.featured_action);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f272827c = (Button) viewFindViewById;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.featured.action.i
    public final void Dw(@k FeaturedActionItem featuredActionItem, int i12) {
        String str = featuredActionItem.f272802c;
        Button button = this.f272827c;
        com.avito.android.lib.design.button.b.a(button, str, false);
        button.setOnClickListener(new C(this, featuredActionItem, i12, 15));
    }
}
