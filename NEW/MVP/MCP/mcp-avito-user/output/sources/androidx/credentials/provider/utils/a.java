package androidx.credentials.provider.utils;

import android.app.slice.Slice;
import android.os.Bundle;
import android.service.credentials.Action;
import android.service.credentials.BeginGetCredentialOption;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.BeginGetCredentialResponse;
import android.service.credentials.CreateEntry;
import android.service.credentials.CredentialEntry;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a {
    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ Action d(Slice slice) {
        return new Action(slice);
    }

    public static /* bridge */ /* synthetic */ BeginGetCredentialOption f(Object obj) {
        return (BeginGetCredentialOption) obj;
    }

    public static /* synthetic */ BeginGetCredentialOption g(String str, String str2, Bundle bundle) {
        return new BeginGetCredentialOption(str, str2, bundle);
    }

    public static /* synthetic */ BeginGetCredentialRequest.Builder h() {
        return new BeginGetCredentialRequest.Builder();
    }

    public static /* synthetic */ BeginGetCredentialResponse.Builder k() {
        return new BeginGetCredentialResponse.Builder();
    }

    public static /* bridge */ /* synthetic */ CreateEntry n(Object obj) {
        return (CreateEntry) obj;
    }

    public static /* synthetic */ CredentialEntry o(BeginGetCredentialOption beginGetCredentialOption, Slice slice) {
        return new CredentialEntry(beginGetCredentialOption, slice);
    }

    public static /* synthetic */ void t() {
    }
}
