package com.google.android.gms.location;

import com.google.android.gms.common.Feature;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public static final Feature f354203a;

    /* renamed from: b, reason: collision with root package name */
    public static final Feature f354204b;

    /* renamed from: c, reason: collision with root package name */
    public static final Feature f354205c;

    /* renamed from: d, reason: collision with root package name */
    public static final Feature f354206d;

    /* renamed from: e, reason: collision with root package name */
    public static final Feature f354207e;

    /* renamed from: f, reason: collision with root package name */
    public static final Feature f354208f;

    /* renamed from: g, reason: collision with root package name */
    public static final Feature[] f354209g;

    static {
        Feature feature = new Feature("name_ulr_private", 1L);
        Feature feature2 = new Feature("name_sleep_segment_request", 1L);
        f354203a = feature2;
        Feature feature3 = new Feature("get_last_activity_feature_id", 1L);
        Feature feature4 = new Feature("support_context_feature_id", 1L);
        Feature feature5 = new Feature("get_current_location", 2L);
        f354204b = feature5;
        Feature feature6 = new Feature("get_last_location_with_request", 1L);
        f354205c = feature6;
        Feature feature7 = new Feature("set_mock_mode_with_callback", 1L);
        f354206d = feature7;
        Feature feature8 = new Feature("set_mock_location_with_callback", 1L);
        f354207e = feature8;
        Feature feature9 = new Feature("inject_location_with_callback", 1L);
        Feature feature10 = new Feature("location_updates_with_callback", 1L);
        f354208f = feature10;
        f354209g = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8, feature9, feature10, new Feature("use_safe_parcelable_in_intents", 1L)};
    }
}
