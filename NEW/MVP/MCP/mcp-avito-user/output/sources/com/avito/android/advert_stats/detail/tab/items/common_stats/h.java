package com.avito.android.advert_stats.detail.tab.items.common_stats;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.facebook.drawee.view.SimpleDraweeView;
import eb.InterfaceC40078a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CommonStatsView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/common_stats/h;", "Lcom/avito/android/advert_stats/detail/tab/items/common_stats/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f86373g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f86374b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f86375c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f86376d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f86377e;

    /* renamed from: f, reason: collision with root package name */
    public final SimpleDraweeView f86378f;

    public h(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f86374b = view;
        this.f86375c = aVar;
        this.f86376d = (ConstraintLayout) view.findViewById(R.id.cl_common_stats);
        this.f86377e = (TextView) view.findViewById(R.id.tv_common_stats);
        this.f86378f = (SimpleDraweeView) view.findViewById(R.id.sdv_common_stats_hint);
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.common_stats.f
    public final void Zz(@l final CommonStatsItem commonStatsItem, @k final Y41.l<? super InterfaceC40078a, G0> lVar) {
        UniversalImage universalImage;
        Image imageDependsOnTheme = null;
        CharSequence charSequenceC = this.f86375c.c(this.f86374b.getContext(), commonStatsItem != null ? commonStatsItem.f86358c : null);
        TextView textView = this.f86377e;
        textView.setText(charSequenceC);
        if (commonStatsItem != null && commonStatsItem.f86359d != null) {
            final int i12 = 0;
            this.f86376d.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.advert_stats.detail.tab.items.common_stats.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Y41.l lVar2 = lVar;
                    CommonStatsItem commonStatsItem2 = commonStatsItem;
                    switch (i12) {
                        case 0:
                            int i13 = h.f86373g;
                            lVar2.invoke(new InterfaceC40078a.c(commonStatsItem2.f86359d));
                            break;
                        default:
                            int i14 = h.f86373g;
                            lVar2.invoke(new InterfaceC40078a.c(commonStatsItem2.f86361f));
                            break;
                    }
                }
            });
        }
        if (commonStatsItem != null && (universalImage = commonStatsItem.f86360e) != null) {
            imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(textView.getContext()));
        }
        com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(imageDependsOnTheme);
        SimpleDraweeView simpleDraweeView = this.f86378f;
        C35949t5.c(simpleDraweeView, aVarB, null, null, null, 14);
        if (commonStatsItem == null || commonStatsItem.f86361f == null) {
            return;
        }
        final int i13 = 1;
        simpleDraweeView.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.advert_stats.detail.tab.items.common_stats.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Y41.l lVar2 = lVar;
                CommonStatsItem commonStatsItem2 = commonStatsItem;
                switch (i13) {
                    case 0:
                        int i132 = h.f86373g;
                        lVar2.invoke(new InterfaceC40078a.c(commonStatsItem2.f86359d));
                        break;
                    default:
                        int i14 = h.f86373g;
                        lVar2.invoke(new InterfaceC40078a.c(commonStatsItem2.f86361f));
                        break;
                }
            }
        });
    }
}
