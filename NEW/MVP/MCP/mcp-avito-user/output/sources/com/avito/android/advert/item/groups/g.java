package com.avito.android.advert.item.groups;

import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.n;
import com.avito.android.advert_core.advert.o;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.util.D6;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsGroupsView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/groups/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/groups/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final n f75806b;

    public g(@k View view, @k o oVar) {
        super(view);
        this.f75806b = new n(view, oVar);
    }

    @Override // com.avito.android.advert.item.groups.f
    public final void pP(@k List<AdvertParameters.Group> list) {
        n nVar = this.f75806b;
        ViewGroup viewGroup = nVar.f82691b;
        if (viewGroup == null) {
            return;
        }
        if (list.isEmpty()) {
            D6.w(viewGroup);
            viewGroup.removeAllViews();
            return;
        }
        if (list.size() == nVar.f82692c.size()) {
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                AdvertParameters.Group group = (AdvertParameters.Group) obj;
                AdvertParameters.Group group2 = nVar.f82692c.get(i12);
                if (L.f(group2.getTitle(), group.getTitle()) && group2.getParameters().size() == group.getParameters().size()) {
                    int i14 = 0;
                    for (Object obj2 : group.getParameters()) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        AdvertParameters.Parameter parameter = (AdvertParameters.Parameter) obj2;
                        AdvertParameters.Parameter parameter2 = group2.getParameters().get(i14);
                        if (L.f(parameter.getTitle(), parameter2.getTitle()) && L.f(parameter.getDescription(), parameter2.getDescription())) {
                            i14 = i15;
                        }
                    }
                    i12 = i13;
                }
            }
            return;
        }
        viewGroup.removeAllViews();
        D6.H(viewGroup);
        for (AdvertParameters.Group group3 : list) {
            int i16 = nVar.f82693d;
            LayoutInflater layoutInflater = nVar.f82690a;
            layoutInflater.inflate(i16, viewGroup, true);
            String title = group3.getTitle();
            TextView textView = (TextView) layoutInflater.inflate(nVar.f82694e, viewGroup, false);
            textView.setText(title);
            viewGroup.addView(textView);
            for (AdvertParameters.Parameter parameter3 : group3.getParameters()) {
                String title2 = parameter3.getTitle();
                List<String> subtitles = parameter3.getSubtitles();
                ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(nVar.f82698i, viewGroup, false);
                TextView textView2 = (TextView) layoutInflater.inflate(nVar.f82695f, viewGroup2, false);
                textView2.setText(title2);
                viewGroup2.addView(textView2);
                for (String str : subtitles) {
                    TextView textView3 = (TextView) layoutInflater.inflate(nVar.f82696g, viewGroup2, false);
                    textView3.setText(str);
                    viewGroup2.addView(textView3);
                }
                viewGroup.addView(viewGroup2);
                String description = parameter3.getDescription();
                if (description != null) {
                    TextView textView4 = (TextView) layoutInflater.inflate(nVar.f82697h, viewGroup, false);
                    textView4.setText(description);
                    viewGroup.addView(textView4);
                }
            }
        }
        nVar.f82692c = list;
    }
}
