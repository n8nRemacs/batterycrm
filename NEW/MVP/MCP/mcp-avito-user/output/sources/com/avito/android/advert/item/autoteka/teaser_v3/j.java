package com.avito.android.advert.item.autoteka.teaser_v3;

import Cf.C13298a;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.autoteka.analytics.event.FromBlock;
import com.avito.android.autoteka.model.AutotekaChoosingPurchaseButtonParams;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.remote.model.autotekateaser.AutotekaDiscount;
import com.avito.android.remote.model.autotekateaser.AutotekaPurchaseAction;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.autotekateaser.StandaloneAutotekaLink;
import com.avito.android.remote.model.teaser.TeaserError;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsAutotekaTeaserV3View.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser_v3/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/autoteka/teaser_v3/h;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f73138l = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f73139b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f73140c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f73141d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f73142e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final DockingBadge f73143f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f73144g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f73145h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final View f73146i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f73147j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f73148k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvertDetailsAutotekaTeaserV3View.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser_v3/j$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a[] f73149b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f73150c;

        static {
            a[] aVarArr = {new a("Result", 0), new a("Error", 1)};
            f73149b = aVarArr;
            f73150c = kotlin.enums.c.a(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f73149b.clone();
        }
    }

    /* compiled from: AdvertDetailsAutotekaTeaserV3View.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[] aVarArr = a.f73149b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public j(@Y61.k View view) {
        super(view);
        this.f73139b = view;
        View viewFindViewById = view.findViewById(R.id.autoteka_teaser_v3_result);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f73140c = viewFindViewById;
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f73141d = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewFindViewById.findViewById(R.id.description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f73142e = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewFindViewById.findViewById(R.id.discountAmount);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.docking_badge.DockingBadge");
        }
        this.f73143f = (DockingBadge) viewFindViewById4;
        View viewFindViewById5 = viewFindViewById.findViewById(R.id.button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f73144g = (Button) viewFindViewById5;
        View viewFindViewById6 = viewFindViewById.findViewById(R.id.standalone_link);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f73145h = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.error_container);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f73146i = viewFindViewById7;
        View viewFindViewById8 = viewFindViewById7.findViewById(R.id.title);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f73147j = (TextView) viewFindViewById8;
        View viewFindViewById9 = viewFindViewById7.findViewById(R.id.description);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f73148k = (TextView) viewFindViewById9;
    }

    @Override // com.avito.android.advert.item.autoteka.teaser_v3.h
    public final void us(@Y61.l String str, @Y61.k AutotekaTeaserResult autotekaTeaserResult, @Y61.k Y41.l<? super DeepLink, G0> lVar, @Y61.k Y41.l<? super Uri, G0> lVar2) {
        G0 g02;
        G0 g03;
        I5.a(this.f73141d, autotekaTeaserResult.getTitle(), false);
        I5.a(this.f73142e, autotekaTeaserResult.getSubTitle(), false);
        AutotekaDiscount discount = autotekaTeaserResult.getDiscount();
        DockingBadge dockingBadge = this.f73143f;
        if (discount != null) {
            D6.H(dockingBadge);
            dockingBadge.setText(discount.getAmount());
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            D6.w(dockingBadge);
        }
        com.avito.android.autoteka.helpers.b.f96647a.getClass();
        AutotekaPurchaseAction autotekaPurchaseActionA = com.avito.android.autoteka.helpers.b.a(autotekaTeaserResult);
        Button button = this.f73144g;
        if (autotekaPurchaseActionA != null) {
            FromBlock fromBlock = FromBlock.f96083c;
            AutotekaChoosingPurchaseButtonParams autotekaChoosingPurchaseButtonParamsC = com.avito.android.autoteka.helpers.b.c(autotekaPurchaseActionA, 0, str, null, null);
            button.setText(autotekaChoosingPurchaseButtonParamsC.f97069c);
            String str2 = autotekaChoosingPurchaseButtonParamsC.f97070d;
            if (str2 != null) {
                button.setSubtitle(str2);
            }
            button.setOnClickListener(new com.avito.android.advert.closed.b(5, lVar, autotekaChoosingPurchaseButtonParamsC));
            g03 = G0.f406611a;
        } else {
            g03 = null;
        }
        if (g03 == null) {
            button.setText(autotekaTeaserResult.getReportLink().getTitle());
            button.setOnClickListener(new com.avito.android.advert.closed.b(6, lVar2, autotekaTeaserResult));
        }
        StandaloneAutotekaLink standaloneAutotekaLink = autotekaTeaserResult.getStandaloneAutotekaLink();
        if (standaloneAutotekaLink != null) {
            AttributedText attributedTextA = C13298a.a(standaloneAutotekaLink);
            TextView textView = this.f73145h;
            com.avito.android.util.text.j.c(textView, attributedTextA, null);
            textView.setOnClickListener(new i(lVar2, standaloneAutotekaLink, 0));
            D6.H(textView);
        }
        a[] aVarArr = a.f73149b;
        D6.H(this.f73140c);
        D6.w(this.f73146i);
    }

    @Override // com.avito.android.advert.item.autoteka.teaser_v3.h
    public final void w9(@Y61.k TeaserError teaserError) {
        this.f73147j.setText(teaserError.getTitle());
        this.f73148k.setText(teaserError.getDescription());
        a[] aVarArr = a.f73149b;
        D6.w(this.f73140c);
        D6.H(this.f73146i);
    }
}
