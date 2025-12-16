package com.avito.android.authorization.auth;

import android.os.Bundle;
import kotlin.Metadata;

/* compiled from: AuthFragment.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_authorization_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.authorization.auth.m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28634m {
    public static final AuthArguments a(AuthFragment authFragment) {
        Bundle arguments = authFragment.getArguments();
        AuthArguments authArguments = arguments != null ? (AuthArguments) arguments.getParcelable("key_arguments") : null;
        if (authArguments != null) {
            return authArguments;
        }
        throw new IllegalArgumentException("AuthArguments must be specified!");
    }
}
