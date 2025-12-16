package com.avito.android.suggest_addresses;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.remote.model.SuggestAddress;
import com.avito.android.suggest_addresses.SuggestAddressesFragment;
import com.avito.android.suggest_addresses.entity.SuggestAddressesParams;
import java.util.Collection;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestAddressesActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/suggest_addresses/SuggestAddressesActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuggestAddressesActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f291781m = new a(null);

    /* compiled from: SuggestAddressesActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/suggest_addresses/SuggestAddressesActivity$a;", "", "<init>", "()V", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    public final void onActivityResult(int i12, int i13, @l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        if (i13 == -1) {
            Collection parcelableArrayListExtra = intent != null ? Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("suggest_addresses", SuggestAddress.class) : intent.getParcelableArrayListExtra("suggest_addresses") : null;
            if (parcelableArrayListExtra == null) {
                parcelableArrayListExtra = C42784z0.f406748b;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("suggest_addresses", (Parcelable[]) parcelableArrayListExtra.toArray(new SuggestAddress[0]));
            G0 g02 = G0.f406611a;
            setResult(-1, intent2);
            finish();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Intent intent = getIntent();
            Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("new_addresses_arguments", SuggestAddressesParams.class) : intent.getParcelableExtra("new_addresses_arguments");
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            H hE2 = getSupportFragmentManager().e();
            SuggestAddressesFragment.f291782B0.getClass();
            hE2.n(R.id.fragment_container, SuggestAddressesFragment.a.a((SuggestAddressesParams) parcelableExtra), "addresses_dialog_tag");
            hE2.f();
        }
    }
}
