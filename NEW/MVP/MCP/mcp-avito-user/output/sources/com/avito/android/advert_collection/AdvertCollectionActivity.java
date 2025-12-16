package com.avito.android.advert_collection;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.advert_collection.AdvertCollectionFragment;
import com.avito.android.analytics.screens.InterfaceC28477j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertCollectionActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert_collection/AdvertCollectionActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertCollectionActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* compiled from: AdvertCollectionActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection/AdvertCollectionActivity$a;", "", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    public final void a2(Intent intent, Bundle bundle) {
        AdvertCollectionArguments advertCollectionArguments = (AdvertCollectionArguments) intent.getParcelableExtra("arguments");
        if (advertCollectionArguments == null) {
            throw new RuntimeException("arguments was not passed to " + this);
        }
        if (bundle == null) {
            H hE2 = getSupportFragmentManager().e();
            AdvertCollectionFragment.a aVar = AdvertCollectionFragment.f81177V0;
            Intent intent2 = this.f304538c;
            aVar.getClass();
            hE2.n(R.id.fragment_container, AdvertCollectionFragment.a.a(advertCollectionArguments, intent2), null);
            hE2.e();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        Intent intent = this.f304538c;
        if (intent != null) {
            startActivity(intent);
        }
        finish();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fragment_container);
        a2(getIntent(), bundle);
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@Y61.k Intent intent) {
        super.onNewIntent(intent);
        a2(intent, null);
    }
}
