package com.avito.android.item_map;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.item_map.ItemMapFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ItemMapActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/item_map/ItemMapActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ItemMapActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f173203m = new a(null);

    /* compiled from: ItemMapActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/item_map/ItemMapActivity$a;", "", "<init>", "()V", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.item_map_activity);
        if (bundle == null) {
            ItemMapArguments itemMapArguments = (ItemMapArguments) getIntent().getParcelableExtra("item_map_state");
            if (itemMapArguments == null) {
                throw new IllegalStateException("No args provided");
            }
            H hE2 = getSupportFragmentManager().e();
            ItemMapFragment.f173231V0.getClass();
            hE2.n(R.id.fragment_container, ItemMapFragment.a.a(itemMapArguments), "item_map_tag");
            hE2.e();
        }
    }
}
