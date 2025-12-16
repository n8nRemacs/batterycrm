package com.avito.android.safety.safety_settings.mvi;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsElement;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SafetySettingsReducer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsElement$SessionItem$a;", "it", "Lcom/avito/android/deep_linking/links/DeepLink;", "invoke", "(Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsElement$SessionItem$a;)Lcom/avito/android/deep_linking/links/DeepLink;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class F extends N implements Y41.l<SafetySettingsElement.SessionItem.a, DeepLink> {

    /* renamed from: l, reason: collision with root package name */
    public static final F f257652l = new F();

    public F() {
        super(1);
    }

    @Override // Y41.l
    public final DeepLink invoke(SafetySettingsElement.SessionItem.a aVar) {
        return aVar.f257684b;
    }
}
