package com.avito.android.work_profile.profile.gig.ui.list.title_item;

import Y41.l;
import Y61.k;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.header_button.HeaderButton;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GigTitlePresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/work_profile/profile/gig/ui/list/title_item/d;", "LTV0/d;", "Lcom/avito/android/work_profile/profile/gig/ui/list/title_item/c;", "Lcom/avito/android/work_profile/profile/gig/ui/list/title_item/GigTitleItem;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements TV0.d<c, GigTitleItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f331256b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super DeepLink, G0> lVar) {
        this.f331256b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        c cVar = (c) eVar;
        GigTitleItem gigTitleItem = (GigTitleItem) aVar;
        cVar.f331252c.setText(gigTitleItem.f331240b);
        String str = gigTitleItem.f331241c;
        int i13 = str != null ? 0 : 8;
        TextView textView = cVar.f331254e;
        textView.setVisibility(i13);
        textView.setText(str);
        String str2 = gigTitleItem.f331243e;
        DeepLink deepLink = gigTitleItem.f331244f;
        int i14 = (str2 == null || deepLink == null) ? 8 : 0;
        Button button = cVar.f331255f;
        button.setVisibility(i14);
        if (str2 != null) {
            button.setText(str2);
        }
        l<DeepLink, G0> lVar = this.f331256b;
        if (deepLink != null) {
            button.setOnClickListener(new XA0.c(lVar, deepLink, 22));
        } else {
            button.setOnClickListener(null);
        }
        DeepLink deepLink2 = gigTitleItem.f331242d;
        int i15 = deepLink2 != null ? 0 : 8;
        HeaderButton headerButton = cVar.f331253d;
        headerButton.setVisibility(i15);
        ViewGroup viewGroup = cVar.f331251b;
        if (deepLink2 != null) {
            headerButton.setOnClickListener(new XA0.c(lVar, deepLink2, 23));
            viewGroup.setOnClickListener(new XA0.c(lVar, deepLink2, 24));
        } else {
            headerButton.setOnClickListener(null);
            viewGroup.setOnClickListener(null);
        }
    }
}
