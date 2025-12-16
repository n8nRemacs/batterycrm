package com.avito.android.remote.parse;

import Y61.k;
import com.avito.android.remote.model.basic.AboutWidget;
import com.avito.android.remote.model.basic.BadgeBarWidget;
import com.avito.android.remote.model.basic.BasicInfoWidget;
import com.avito.android.remote.model.basic.BasicSettingsWidget;
import com.avito.android.remote.model.basic.VerificationWidget;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: BasicProfileWidgetTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/BasicProfileWidgetTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/basic/BasicSettingsWidget;", "<init>", "()V", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BasicProfileWidgetTypeAdapter extends RuntimeTypeAdapter<BasicSettingsWidget> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f254138a;

    public BasicProfileWidgetTypeAdapter() {
        super(null, null, null, 7, null);
        this.f254138a = P0.g(new Q("profile_info", AboutWidget.class), new Q("profile_badges", BadgeBarWidget.class), new Q("profile_verifications", VerificationWidget.class), new Q("basic_info", BasicInfoWidget.class));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.Class<? extends com.avito.android.remote.model.basic.BasicSettingsWidget>>] */
    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @k
    public final Map<String, Class<? extends BasicSettingsWidget>> getMapping() {
        return this.f254138a;
    }
}
