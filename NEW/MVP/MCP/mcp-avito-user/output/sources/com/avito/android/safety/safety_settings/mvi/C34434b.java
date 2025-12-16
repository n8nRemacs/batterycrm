package com.avito.android.safety.safety_settings.mvi;

import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SafetySettingsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$ShowToastBarError;", "it", "", "invoke-O4jg6GI", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.safety.safety_settings.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34434b extends N implements Y41.l<String, SafetySettingsInternalAction.ShowToastBarError> {

    /* renamed from: l, reason: collision with root package name */
    public static final C34434b f257661l = new C34434b();

    public C34434b() {
        super(1);
    }

    @Override // Y41.l
    public final SafetySettingsInternalAction.ShowToastBarError invoke(String str) {
        return SafetySettingsInternalAction.ShowToastBarError.c(str);
    }
}
