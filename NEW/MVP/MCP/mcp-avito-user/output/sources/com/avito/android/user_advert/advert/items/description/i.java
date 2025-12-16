package com.avito.android.user_advert.advert.items.description;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.util.D6;
import com.avito.android.util.ExpandablePanelLayout;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MyAdvertDescriptionItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/description/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/description/h;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ExpandablePanelLayout f309366b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.a<G0> f309367c;

    public i(@k View view) {
        super(view);
        ExpandablePanelLayout expandablePanelLayout = (ExpandablePanelLayout) view;
        this.f309366b = expandablePanelLayout;
        expandablePanelLayout.setOnExpandListener(new a());
        expandablePanelLayout.setCollapsedLineCount(15);
    }

    @Override // com.avito.android.user_advert.advert.items.description.h
    public final void C00() {
        ExpandablePanelLayout expandablePanelLayout = this.f309366b;
        expandablePanelLayout.a(false);
        expandablePanelLayout.invalidate();
    }

    @Override // com.avito.android.user_advert.advert.items.description.h
    public final void Ku(@k Y41.a<G0> aVar) {
        this.f309367c = aVar;
    }

    @Override // com.avito.android.user_advert.advert.items.description.h
    public final void hi() {
        ExpandablePanelLayout expandablePanelLayout = this.f309366b;
        TextView textView = expandablePanelLayout.f318590g;
        if (textView != null) {
            expandablePanelLayout.f318591h = false;
            textView.setMaxLines(expandablePanelLayout.f318593j);
            ExpandablePanelLayout.a aVar = expandablePanelLayout.f318594k;
            if (aVar != null) {
                aVar.b(expandablePanelLayout.f318589f);
            }
        }
        expandablePanelLayout.invalidate();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f309367c = null;
    }

    @Override // com.avito.android.user_advert.advert.items.description.h
    public final void r5(@k CharSequence charSequence) {
        ExpandablePanelLayout.b(this.f309366b, charSequence);
    }

    /* compiled from: MyAdvertDescriptionItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/user_advert/advert/items/description/i$a", "Lcom/avito/android/util/ExpandablePanelLayout$a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ExpandablePanelLayout.a {
        public a() {
        }

        @Override // com.avito.android.util.ExpandablePanelLayout.a
        public final void d(@l View view) {
            if (view != null) {
                D6.w(view);
            }
            Y41.a<G0> aVar = i.this.f309367c;
            if (aVar != null) {
                ((e) aVar).invoke();
            }
        }

        @Override // com.avito.android.util.ExpandablePanelLayout.a
        public final void a() {
        }

        @Override // com.avito.android.util.ExpandablePanelLayout.a
        public final void c() {
        }

        @Override // com.avito.android.util.ExpandablePanelLayout.a
        public final void b(@l View view) {
        }
    }
}
