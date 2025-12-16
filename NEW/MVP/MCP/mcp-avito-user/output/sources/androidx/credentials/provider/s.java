package androidx.credentials.provider;

import android.app.slice.Slice;
import android.content.pm.SigningInfo;
import android.credentials.ClearCredentialStateException;
import android.credentials.CreateCredentialException;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialException;
import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialRequest;
import android.service.credentials.BeginCreateCredentialResponse;
import android.service.credentials.CallingAppInfo;
import android.service.credentials.CreateEntry;
import android.service.credentials.RemoteEntry;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class s {
    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ ClearCredentialStateException b(String str, String str2) {
        return new ClearCredentialStateException(str, str2);
    }

    public static /* synthetic */ CreateCredentialException c(String str, String str2) {
        return new CreateCredentialException(str, str2);
    }

    public static /* bridge */ /* synthetic */ CredentialOption d(Object obj) {
        return (CredentialOption) obj;
    }

    public static /* synthetic */ GetCredentialException e(String str, String str2) {
        return new GetCredentialException(str, str2);
    }

    public static /* synthetic */ BeginCreateCredentialRequest h(String str, Bundle bundle, CallingAppInfo callingAppInfo) {
        return new BeginCreateCredentialRequest(str, bundle, callingAppInfo);
    }

    public static /* synthetic */ BeginCreateCredentialResponse.Builder i() {
        return new BeginCreateCredentialResponse.Builder();
    }

    public static /* synthetic */ CallingAppInfo k(String str, SigningInfo signingInfo, String str2) {
        return new CallingAppInfo(str, signingInfo, str2);
    }

    public static /* synthetic */ CreateEntry l(Slice slice) {
        return new CreateEntry(slice);
    }

    public static /* synthetic */ RemoteEntry m(Slice slice) {
        return new RemoteEntry(slice);
    }

    public static /* synthetic */ void t() {
    }

    public static /* synthetic */ void z() {
    }
}
