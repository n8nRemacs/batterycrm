package com.avito.android.advert.item.sellersubscription;

import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionState;
import com.avito.android.lib.design.button.Button;
import com.jakewharton.rxbinding4.view.C37722i;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsSellerSubscriptionView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/sellersubscription/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/sellersubscription/h;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final D f79743b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Button f79744c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public C28206d f79745d;

    /* compiled from: AdvertDetailsSellerSubscriptionView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[SellerSubscriptionState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SellerSubscriptionState sellerSubscriptionState = SellerSubscriptionState.f85639b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SellerSubscriptionState sellerSubscriptionState2 = SellerSubscriptionState.f85639b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i(@Y61.k View view, @Y61.k D d12) {
        super(view);
        this.f79743b = d12;
        View viewFindViewById = view.findViewById(R.id.subscribe_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f79744c = (Button) viewFindViewById;
    }

    @Override // com.avito.android.advert.item.sellersubscription.h
    public final void Cp(@Y61.k SellerSubscriptionState sellerSubscriptionState) {
        int iOrdinal = sellerSubscriptionState.ordinal();
        D d12 = this.f79743b;
        Button button = this.f79744c;
        if (iOrdinal == 0) {
            button.setLoading(false);
            button.setClickable(true);
            button.setText(d12.a());
        } else if (iOrdinal == 1) {
            button.setLoading(false);
            button.setClickable(true);
            button.setText(d12.b());
        } else {
            if (iOrdinal != 2) {
                return;
            }
            button.setLoading(true);
            button.setClickable(false);
        }
    }

    @Override // com.avito.android.advert.item.sellersubscription.h
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> E3() {
        return C37722i.a(this.f79744c);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        C28206d c28206d = this.f79745d;
        if (c28206d != null) {
            c28206d.f79735a.zJ(null);
            c28206d.f79736b.e();
        }
    }

    @Override // com.avito.android.advert.item.sellersubscription.h
    public final void zJ(@Y61.l C28206d c28206d) {
        this.f79745d = c28206d;
    }
}
