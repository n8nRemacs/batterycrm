package com.avito.android.advert.item.select.teaser;

import Y61.k;
import Y61.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.auto_select.Benefit;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AutoSelectTeaserView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/select/teaser/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/select/teaser/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f79650g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f79651b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f79652c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f79653d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final h f79654e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public List<Benefit> f79655f;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f79651b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f79652c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.benefits_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f79653d = (Button) viewFindViewById4;
        this.f79654e = new h(viewGroup);
    }

    @Override // com.avito.android.advert.item.select.teaser.f
    public final void Y0(@l String str, @k Y41.a<G0> aVar) {
        Button button = this.f79653d;
        if (str == null) {
            D6.w(button);
            button.setOnClickListener(null);
        } else {
            D6.H(button);
            button.setText(str);
            button.setOnClickListener(new com.avito.android.advert.item.parking.h(14, aVar));
        }
    }

    @Override // com.avito.android.advert.item.select.teaser.f
    public final void b(@l String str) {
        I5.a(this.f79651b, str, false);
    }

    @Override // com.avito.android.advert.item.select.teaser.f
    public final void j(@l String str) {
        I5.a(this.f79652c, str, false);
    }

    @Override // com.avito.android.advert.item.select.teaser.f
    public final void y4(@l List<Benefit> list) {
        TextView textView;
        View viewInflate;
        if (L.f(list, this.f79655f)) {
            return;
        }
        h hVar = this.f79654e;
        ViewGroup viewGroup = hVar.f79656a;
        viewGroup.removeAllViews();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Benefit benefit : list) {
                ArrayList arrayList2 = new ArrayList();
                String title = benefit.getTitle();
                LayoutInflater layoutInflater = hVar.f79657b;
                if (title == null) {
                    textView = null;
                } else {
                    textView = (TextView) layoutInflater.inflate(hVar.f79658c, viewGroup, false);
                    textView.setText(title);
                }
                if (textView != null) {
                    arrayList2.add(textView);
                }
                List<String> descriptions = benefit.getDescriptions();
                if (descriptions != null) {
                    for (String str : descriptions) {
                        if (str == null) {
                            viewInflate = null;
                        } else {
                            viewInflate = layoutInflater.inflate(hVar.f79659d, viewGroup, false);
                            View viewFindViewById = viewInflate.findViewById(R.id.benefit_description);
                            if (viewFindViewById == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                            }
                            ((TextView) viewFindViewById).setText(str);
                        }
                        if (viewInflate != null) {
                            arrayList2.add(viewInflate);
                        }
                    }
                }
                C42745f0.h(arrayList2, arrayList);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                viewGroup.addView((View) it.next());
            }
        }
        this.f79655f = list;
    }
}
