package androidx.credentials.provider.utils;

import android.adservices.adid.AdId;
import android.adservices.adselection.AdSelectionConfig;
import android.adservices.adselection.AdSelectionOutcome;
import android.adservices.appsetid.AppSetId;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.LeaveCustomAudienceRequest;
import android.service.credentials.Action;
import android.service.credentials.CredentialEntry;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f {
    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ void C() {
        new LeaveCustomAudienceRequest.Builder();
    }

    public static /* synthetic */ void D() {
        new JoinCustomAudienceRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ AdId b(Object obj) {
        return (AdId) obj;
    }

    public static /* bridge */ /* synthetic */ AdSelectionOutcome c(Object obj) {
        return (AdSelectionOutcome) obj;
    }

    public static /* bridge */ /* synthetic */ AppSetId d(Object obj) {
        return (AppSetId) obj;
    }

    public static /* synthetic */ CustomAudience.Builder e() {
        return new CustomAudience.Builder();
    }

    public static /* bridge */ /* synthetic */ Action o(Object obj) {
        return (Action) obj;
    }

    public static /* bridge */ /* synthetic */ CredentialEntry q(Object obj) {
        return (CredentialEntry) obj;
    }

    public static /* synthetic */ void t() {
        new AdSelectionConfig.Builder();
    }
}
