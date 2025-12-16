package com.avito.android.suggest_locations;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.suggest_locations.SuggestLocationsFragment;
import java.io.Serializable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestLocationsActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/suggest_locations/SuggestLocationsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuggestLocationsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final a f292122m = new a(null);

    /* compiled from: SuggestLocationsActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/suggest_locations/SuggestLocationsActivity$a;", "", "<init>", "()V", "", "EXTRA_AUTO_OPEN_KEYBOARD", "Ljava/lang/String;", "EXTRA_CATEGORY_ID", "EXTRA_CHOOSE_BUTTON_LOCATION", "EXTRA_FROM_BLOCK", "EXTRA_GEO_SESSION_ID", "EXTRA_LOCATION_ID", "EXTRA_ONLY_REAL_LOCATIONS", "EXTRA_PARAM_ID", "EXTRA_PUBLIC_USER_KEY", "EXTRA_QUERY", "EXTRA_SUGGEST_FLOW_TYPE", "EXTRA_USE_LEGACY_API", "EXTRA_VALIDATION_RULES", "", "REQ_ADDRESS", "I", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        if (i13 != -1 || intent == null) {
            return;
        }
        AddressParameter.Value value = (AddressParameter.Value) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("EXTRA_ADDRESS_RESULT", AddressParameter.Value.class) : intent.getParcelableExtra("EXTRA_ADDRESS_RESULT"));
        if (value == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("EXTRA_ADDRESS_PARAM_ID");
        Intent intent2 = new Intent();
        intent2.putExtra("EXTRA_ADDRESS_RESULT", value);
        intent2.putExtra("EXTRA_ADDRESS_PARAM_ID", stringExtra);
        G0 g02 = G0.f406611a;
        setResult(-1, intent2);
        finish();
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        Fragment fragmentH = getSupportFragmentManager().H("SUGGEST_LOCATIONS_FRAGMENT");
        SuggestLocationsFragment suggestLocationsFragment = fragmentH instanceof SuggestLocationsFragment ? (SuggestLocationsFragment) fragmentH : null;
        if (suggestLocationsFragment != null) {
            InterfaceC35160z interfaceC35160z = suggestLocationsFragment.f292144t0;
            (interfaceC35160z != null ? interfaceC35160z : null).i0();
        }
        super.onBackPressed();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        setTheme(R.style.Theme_DesignSystem_Re23);
        super.onCreate(bundle);
        setContentView(R.layout.suggest_locations_activity);
        Fragment fragmentH = getSupportFragmentManager().H("SUGGEST_LOCATIONS_FRAGMENT");
        SuggestLocationsFragment suggestLocationsFragmentA = fragmentH instanceof SuggestLocationsFragment ? (SuggestLocationsFragment) fragmentH : null;
        if (suggestLocationsFragmentA == null) {
            SuggestLocationsFragment.a aVar = SuggestLocationsFragment.f292138F0;
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra("extra_location_id");
            String stringExtra2 = intent.getStringExtra("extra_category_id");
            int intExtra = intent.getIntExtra("extra_from_block", 0);
            String stringExtra3 = intent.getStringExtra("extra_query");
            Serializable serializableExtra = intent.getSerializableExtra("extra_choose_button_location");
            PublishIntentFactory.LocationPickerChooseButtonLocation locationPickerChooseButtonLocation = serializableExtra instanceof PublishIntentFactory.LocationPickerChooseButtonLocation ? (PublishIntentFactory.LocationPickerChooseButtonLocation) serializableExtra : null;
            String stringExtra4 = intent.getStringExtra("extra_geo_session_id");
            Parcelable parcelableExtra = intent.getParcelableExtra("extra_suggest_flow_type");
            PublishIntentFactory.SuggestLocationsFlowType suggestLocationsFlowType = parcelableExtra instanceof PublishIntentFactory.SuggestLocationsFlowType ? (PublishIntentFactory.SuggestLocationsFlowType) parcelableExtra : null;
            if (suggestLocationsFlowType == null) {
                suggestLocationsFlowType = PublishIntentFactory.SuggestLocationsFlowType.Default.f231995b;
            }
            SuggestLocationsArguments suggestLocationsArguments = new SuggestLocationsArguments(stringExtra, stringExtra2, Integer.valueOf(intExtra), stringExtra3, locationPickerChooseButtonLocation, suggestLocationsFlowType, stringExtra4, (AddressParameter.ValidationRules) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("extra_validation_rules", AddressParameter.ValidationRules.class) : intent.getParcelableExtra("extra_validation_rules")), intent.getBooleanExtra("extra_auto_open_keyboard", false), intent.getBooleanExtra("extra_use_legacy_api", false), false, intent.getStringExtra("public_user_key"), null, intent.getStringExtra("extra_param_id"), Boolean.valueOf(intent.getBooleanExtra("extra_only_real_locations", false)), 5120, null);
            aVar.getClass();
            suggestLocationsFragmentA = SuggestLocationsFragment.a.a(suggestLocationsArguments);
        }
        androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
        hE2.n(R.id.container, suggestLocationsFragmentA, "SUGGEST_LOCATIONS_FRAGMENT");
        hE2.e();
    }
}
