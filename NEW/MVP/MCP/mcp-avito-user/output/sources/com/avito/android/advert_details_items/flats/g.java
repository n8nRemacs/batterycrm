package com.avito.android.advert_details_items.flats;

import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert_core.advert.AdvertDetailsFlatViewType;
import com.avito.android.advert_core.advert.j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsFlatsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/flats/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/flats/f;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.advert.k f84723b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f84724c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f84725d;

    /* renamed from: e, reason: collision with root package name */
    public final View f84726e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final TextView f84727f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final j f84728g;

    /* renamed from: h, reason: collision with root package name */
    public final int f84729h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f84730i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public y f84731j;

    /* compiled from: AdvertDetailsFlatsView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "link", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            g.this.f84723b.O0((DeepLink) obj, "");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(View view, boolean z12, boolean z13, boolean z14, com.avito.android.advert_core.advert.k kVar, boolean z15, int i12, C42822w c42822w) {
        super(view);
        boolean z16 = (i12 & 4) != 0 ? false : z13;
        boolean z17 = (i12 & 8) != 0 ? false : z14;
        boolean z18 = (i12 & 32) == 0 ? z15 : false;
        this.f84723b = kVar;
        this.f84724c = z18;
        this.f84725d = view;
        this.f84726e = view.findViewById(R.id.params_container);
        this.f84727f = (TextView) view.findViewById(R.id.flats_container_title);
        this.f84729h = C35835l0.d(R.attr.gray48, view.getContext());
        this.f84730i = (TextView) view.findViewById(R.id.flats_disclaimer);
        this.f84728g = z16 ? new com.avito.android.advert_core.advert.d(view.findViewById(R.id.flat_container), 0, kVar, false, 10, null) : z12 ? new com.avito.android.advert_core.advert.e(view.findViewById(R.id.flat_container), 0, kVar, false, 10, null) : z17 ? new com.avito.android.advert_details_items.flats.auto_flats_redesign.b(view.findViewById(R.id.flat_container), kVar) : new com.avito.android.advert_core.advert.g(view.findViewById(R.id.flat_container), 0, kVar, false, 10, null);
    }

    @Override // com.avito.android.advert_details_items.flats.f
    public final void AZ(@l AttributedText attributedText, @k AdvertDetailsFlatViewType advertDetailsFlatViewType) {
        if (attributedText == null && advertDetailsFlatViewType == AdvertDetailsFlatViewType.f82421c) {
            D6.c(this.f84725d, null, Integer.valueOf(y6.b(0)), null, null, 13);
            this.f84725d.requestLayout();
        }
    }

    @Override // com.avito.android.advert_details_items.flats.f
    public final void C4(@l AttributedText attributedText) {
        if (attributedText == null) {
            return;
        }
        com.avito.android.util.text.j.a(this.f84730i, attributedText, null);
    }

    @Override // com.avito.android.advert_details_items.flats.f
    public final void eD(@l Integer num) {
        D6.c(this.f84726e, null, null, null, Integer.valueOf(y6.b(num != null ? num.intValue() : 0)), 7);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        y yVar = this.f84731j;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f84731j = null;
        TextView textView = this.f84727f;
        if (textView != null) {
            textView.setText("");
        }
        D6.w(textView);
        TextView textView2 = this.f84730i;
        if (textView2 != null) {
            textView2.setText("");
        }
        D6.w(textView2);
    }

    @Override // com.avito.android.advert_details_items.flats.f
    public final void l30(@k List<AdvertParameters.Parameter> list, @k AdvertDetailsFlatViewType advertDetailsFlatViewType) {
        this.f84728g.a(list, advertDetailsFlatViewType, this.f84724c);
    }

    @Override // com.avito.android.advert_details_items.flats.f
    public final void w(@l AttributedText attributedText) {
        if (attributedText == null) {
            return;
        }
        TextView textView = this.f84727f;
        if (textView != null) {
            com.avito.android.util.text.j.a(textView, attributedText, null);
        }
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        y yVar = this.f84731j;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f84731j = (y) attributedText.linkClicksV3().t0(new a());
    }

    @Override // com.avito.android.advert_details_items.flats.f
    public final void y1() {
        this.f84728g.b(this.f84729h);
    }
}
