package com.avito.android.advert.item.safedeal.info;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.safedeal.info.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsSafeDealInfoView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/safedeal/info/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/safedeal/info/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f78883c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f78884b;

    /* compiled from: AdvertDetailsSafeDealInfoView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78885a;

        static {
            int[] iArr = new int[SafeDeal.Info.OrderType.values().length];
            try {
                iArr[SafeDeal.Info.OrderType.DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SafeDeal.Info.OrderType.COURIER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SafeDeal.Info.OrderType.SAFE_DEAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f78885a = iArr;
        }
    }

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.info_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f78884b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.advert.item.safedeal.info.f
    public final void vF(@k SafeDeal.Info info, @k f.b bVar) {
        Integer numValueOf;
        SafeDeal.Info.OrderType orderType = info.getOrderType();
        int i12 = orderType == null ? -1 : a.f78885a[orderType.ordinal()];
        if (i12 == -1) {
            numValueOf = null;
        } else if (i12 == 1 || i12 == 2) {
            numValueOf = Integer.valueOf(R.drawable.rds_delivery_24);
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf = Integer.valueOf(R.drawable.ic_card_24);
        }
        String title = info.getTitle();
        TextView textView = this.f78884b;
        I5.a(textView, title, false);
        if (numValueOf != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, numValueOf.intValue(), 0);
        }
        DeepLink deeplink = info.getDeeplink();
        if (deeplink != null) {
            textView.setOnClickListener(new com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g(3, bVar, deeplink));
        }
    }
}
