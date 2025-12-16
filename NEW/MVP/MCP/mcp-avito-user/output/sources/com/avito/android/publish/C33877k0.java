package com.avito.android.publish;

import android.app.Application;
import android.content.Intent;
import com.avito.android.Q1;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.geo_common.model.location_picker.LocationFlowType;
import com.avito.android.location_picker.LocationPickerActivity;
import com.avito.android.location_picker.LocationPickerArguments;
import com.avito.android.location_picker.LocationPickerFragmentData;
import com.avito.android.location_picker.view.LocationPickerChooseButtonLocation;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.publish.cpa_tariff.CpaTariffActivity;
import com.avito.android.publish.start_publish.StartPublishActivity;
import com.avito.android.publish.start_publish.StartPublishBundle;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.publish.PublishInitialToast;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42756l;
import org.json.JSONObject;

/* compiled from: PublishIntentFactoryImpl.kt */
@androidx.compose.runtime.internal.P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/k0;", "Lcom/avito/android/publish/PublishIntentFactory;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.k0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33877k0 implements PublishIntentFactory {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f237370a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.L f237371b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Q1 f237372c;

    /* compiled from: PublishIntentFactoryImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.k0$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PublishIntentFactory.LocationPickerChooseButtonLocation.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PublishIntentFactory.LocationPickerChooseButtonLocation locationPickerChooseButtonLocation = PublishIntentFactory.LocationPickerChooseButtonLocation.f231991b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[FlowType.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                FlowType flowType = FlowType.f231902b;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                FlowType flowType2 = FlowType.f231902b;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                FlowType flowType3 = FlowType.f231902b;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                FlowType flowType4 = FlowType.f231902b;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Inject
    public C33877k0(@Y61.k Application application, @Y61.k com.avito.android.L l12, @Y61.k Q1 q12) {
        this.f237370a = application;
        this.f237371b = l12;
        this.f237372c = q12;
    }

    @Override // com.avito.android.publish.PublishIntentFactory
    @Y61.k
    public final Intent a(@Y61.l DeepLink deepLink, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, boolean z12) {
        return new Intent(this.f237370a, (Class<?>) PublishActivity.class).putExtra("key_item_id", str).putExtra("key_action", deepLink).putExtra("key_focus_id", str2).putExtra("key_force_error_checking", z12).putExtra("key_from_source", str3).putExtra("key_scenario", str4);
    }

    @Override // com.avito.android.publish.PublishIntentFactory
    @Y61.k
    public final Intent b(@Y61.k DeepLink deepLink) {
        return new Intent(this.f237370a, (Class<?>) PublishActivity.class).putExtra("key_publish_restart", deepLink).setFlags(603979776);
    }

    @Override // com.avito.android.publish.PublishIntentFactory
    @Y61.k
    public final Intent c(@Y61.l DeepLink deepLink, @Y61.k Navigation navigation2, @Y61.l PublishInitialToast publishInitialToast, @Y61.l Boolean bool, @Y61.l String str, @Y61.l String str2, @Y61.l Map map, boolean z12) {
        Intent intentPutExtra = new Intent(this.f237370a, (Class<?>) PublishActivity.class).putExtra("key_navigation", navigation2).putExtra("key_target_step_type", str).putExtra("key_need_root_navigation", bool);
        if (map == null) {
            map = kotlin.collections.P0.c();
        }
        Intent intentPutExtra2 = intentPutExtra.putExtra("key_params", new JSONObject(map).toString()).putExtra("key_startup_action", deepLink);
        String[] strArr = C33850e0.f235443a;
        Integer categoryId = navigation2.getCategoryId();
        return intentPutExtra2.putExtra("key_start_from_subcategory", C42756l.H(categoryId != null ? categoryId.toString() : null, strArr) >= 0).putExtra("with_up_intent", z12).putExtra("key_initial_toast", publishInitialToast).putExtra("key_scenario", str2);
    }

    @Override // com.avito.android.publish.PublishIntentFactory
    @Y61.k
    public final Intent d() {
        return new Intent(this.f237370a, (Class<?>) PublishActivity.class).putExtra("key_publish_update", true).setFlags(603979776);
    }

    @Override // com.avito.android.publish.PublishIntentFactory
    @Y61.k
    public final Intent e(@Y61.l Navigation navigation2, @Y61.l DeepLink deepLink, boolean z12, @Y61.l PublishInitialToast publishInitialToast, boolean z13, @Y61.l Map<String, ? extends Object> map, @Y61.l String str, @Y61.l Boolean bool, @Y61.l String str2) {
        StartPublishActivity.a aVar = StartPublishActivity.f245278m;
        StartPublishBundle startPublishBundle = new StartPublishBundle(deepLink, navigation2, publishInitialToast, bool, str, str2, map, z13);
        aVar.getClass();
        Intent intent = new Intent(this.f237370a, (Class<?>) StartPublishActivity.class);
        intent.putExtra("key.call_with_params", startPublishBundle);
        intent.putExtra("with_up_intent", z12);
        return intent;
    }

    @Override // com.avito.android.publish.PublishIntentFactory
    @Y61.k
    public final Intent f(int i12) {
        return new Intent(this.f237370a, (Class<?>) CpaTariffActivity.class).putExtra("category_id", i12);
    }

    @Override // com.avito.android.publish.PublishIntentFactory
    @Y61.k
    public final Intent g(@Y61.l AddressParameter.Value value, @Y61.l Radius radius, @Y61.l String str, @Y61.k PublishIntentFactory.LocationPickerChooseButtonLocation locationPickerChooseButtonLocation, @Y61.l SearchParams searchParams, @Y61.l PublishIntentFactory.JobAssistantParams jobAssistantParams, @Y61.l AddressParameter.ValidationRules validationRules, boolean z12, @Y61.l String str2, @Y61.k FlowType flowType) {
        LocationPickerChooseButtonLocation locationPickerChooseButtonLocation2;
        LocationFlowType locationFlowType;
        int iOrdinal = locationPickerChooseButtonLocation.ordinal();
        if (iOrdinal == 0) {
            locationPickerChooseButtonLocation2 = LocationPickerChooseButtonLocation.f182519b;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            locationPickerChooseButtonLocation2 = LocationPickerChooseButtonLocation.f182520c;
        }
        LocationPickerChooseButtonLocation locationPickerChooseButtonLocation3 = locationPickerChooseButtonLocation2;
        Q1 q12 = this.f237372c;
        q12.getClass();
        kotlin.reflect.n<Object> nVar = Q1.f67448x0[76];
        boolean zBooleanValue = ((Boolean) q12.f67493j0.a().invoke()).booleanValue();
        int iOrdinal2 = flowType.ordinal();
        if (iOrdinal2 == 0) {
            locationFlowType = LocationFlowType.f159415c;
        } else if (iOrdinal2 == 1) {
            locationFlowType = LocationFlowType.f159416d;
        } else if (iOrdinal2 == 2) {
            locationFlowType = LocationFlowType.f159417e;
        } else if (iOrdinal2 == 3) {
            locationFlowType = LocationFlowType.f159418f;
        } else {
            if (iOrdinal2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            locationFlowType = LocationFlowType.f159419g;
        }
        LocationPickerArguments locationPickerArguments = new LocationPickerArguments(value, null, radius, str, locationPickerChooseButtonLocation3, searchParams, jobAssistantParams, validationRules, false, false, false, null, false, str2, zBooleanValue, locationFlowType, 7936, null);
        if (z12) {
            return this.f237371b.d(new LocationPickerFragmentData(locationPickerArguments));
        }
        LocationPickerActivity.f182141m.getClass();
        return new Intent(this.f237370a, (Class<?>) LocationPickerActivity.class).putExtra("extra.arguments", locationPickerArguments);
    }

    @Override // com.avito.android.publish.PublishIntentFactory
    @Y61.k
    public final Intent h(@Y61.k String str, @Y61.l DeepLink deepLink, boolean z12) {
        return new Intent(this.f237370a, (Class<?>) PublishActivity.class).putExtra("should_restore_draft", true).putExtra("should_draft_id", str).putExtra("should_track_draft_resume", z12).putExtra("key_startup_action", deepLink);
    }
}
