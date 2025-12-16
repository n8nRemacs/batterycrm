package com.avito.android.authorization.auth;

import android.content.Context;
import android.content.Intent;
import com.avito.android.authorization.duplicate_pd.DuplicatePdActivity;
import com.avito.android.authorization.duplicate_pd.DuplicatePdArgs;
import i.AbstractC41201a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AuthFragmentContracts.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/auth/i;", "Li/a;", "Lcom/avito/android/authorization/duplicate_pd/DuplicatePdArgs;", "Lkotlin/G0;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.authorization.auth.i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28630i extends AbstractC41201a<DuplicatePdArgs, G0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AuthFragment f93041b;

    public C28630i(AuthFragment authFragment) {
        this.f93041b = authFragment;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, DuplicatePdArgs duplicatePdArgs) {
        DuplicatePdActivity.f93809m.getClass();
        Intent intent = new Intent(context, (Class<?>) DuplicatePdActivity.class);
        intent.putExtra("key_duplicate_pd_activity_args", duplicatePdArgs);
        return intent;
    }

    @Override // i.AbstractC41201a
    public final G0 parseResult(int i12, Intent intent) {
        String stringExtra = intent != null ? intent.getStringExtra("key_phone_hint") : null;
        AuthFragment authFragment = this.f93041b;
        if (i12 == -1) {
            authFragment.I5(stringExtra, true);
        } else if (i12 == 0) {
            authFragment.D5();
        }
        return G0.f406611a;
    }
}
