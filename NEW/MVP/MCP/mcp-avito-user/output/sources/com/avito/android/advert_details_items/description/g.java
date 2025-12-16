package com.avito.android.advert_details_items.description;

import Y61.l;
import android.view.View;
import com.avito.android.util.D6;
import com.avito.android.util.ExpandablePanelLayout;
import kotlin.Metadata;

/* compiled from: AdvertDetailsDescriptionView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/description/g;", "Lcom/avito/android/util/ExpandablePanelLayout$a;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements ExpandablePanelLayout.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f84625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f84626b;

    public g(d dVar, h hVar) {
        this.f84625a = dVar;
        this.f84626b = hVar;
    }

    @Override // com.avito.android.util.ExpandablePanelLayout.a
    public final void a() {
        this.f84625a.Y();
    }

    @Override // com.avito.android.util.ExpandablePanelLayout.a
    public final void c() {
        this.f84625a.V();
    }

    @Override // com.avito.android.util.ExpandablePanelLayout.a
    public final void d(@l View view) {
        if (view != null) {
            view.setVisibility(8);
        }
        this.f84625a.x1();
        h hVar = this.f84626b;
        ExpandablePanelLayout expandablePanelLayout = hVar.f84635b;
        int paddingLeft = expandablePanelLayout.getPaddingLeft();
        ExpandablePanelLayout expandablePanelLayout2 = hVar.f84635b;
        expandablePanelLayout.setPadding(paddingLeft, expandablePanelLayout2.getPaddingTop(), expandablePanelLayout2.getPaddingRight(), D6.j(expandablePanelLayout2, 3) + expandablePanelLayout2.getPaddingBottom());
        expandablePanelLayout2.invalidate();
    }

    @Override // com.avito.android.util.ExpandablePanelLayout.a
    public final void b(@l View view) {
    }
}
