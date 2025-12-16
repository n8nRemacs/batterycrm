package com.avito.android.home.tags_item.tag;

import Y61.k;
import android.view.View;
import com.avito.android.lib.design.button.Button;
import com.avito.android.serp.adapter.home_section_tab.SectionTag;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SectionTagItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/home/tags_item/tag/j;", "Lcom/avito/android/home/tags_item/tag/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f162523c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f162524b;

    public j(@k View view) {
        super(view);
        this.f162524b = (Button) view;
    }

    @Override // com.avito.android.home.tags_item.tag.i
    public final void Xt(@k SectionTag sectionTag, int i12, @k Y41.a<G0> aVar) {
        String str = sectionTag.f270146d;
        Button button = this.f162524b;
        button.setText(str);
        button.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(2, aVar));
        button.setSelected(sectionTag.f270149g || i12 == 0);
    }
}
