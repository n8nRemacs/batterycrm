package com.avito.android.related_products.bottom_sheet;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenTransfer;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: RelatedProductsBottomSheetActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/RelatedProductsBottomSheetActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RelatedProductsBottomSheetActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final a f252819m = new a(null);

    /* compiled from: RelatedProductsBottomSheetActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/RelatedProductsBottomSheetActivity$a;", "", "<init>", "()V", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_related_products_empty;
    }

    @Override // com.avito.android.ui.activity.a
    /* renamed from: S1 */
    public final boolean getF304545j() {
        return false;
    }

    @Override // android.app.Activity
    public final void finish() {
        setResult(-1);
        super.finish();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Intent intent = getIntent();
            Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("SCREEN_TRANSFER_KEY", ScreenTransfer.class) : intent.getParcelableExtra("SCREEN_TRANSFER_KEY");
            RelatedProductsBottomSheetFragment.f252827i0.getClass();
            RelatedProductsBottomSheetFragment relatedProductsBottomSheetFragment = new RelatedProductsBottomSheetFragment();
            C35966w1.a(relatedProductsBottomSheetFragment, -1, new j((ScreenTransfer) parcelableExtra));
            relatedProductsBottomSheetFragment.show(getSupportFragmentManager(), "bottom_sheet");
        }
    }
}
