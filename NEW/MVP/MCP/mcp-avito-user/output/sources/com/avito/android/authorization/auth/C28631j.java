package com.avito.android.authorization.auth;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.avito.android.social.SocialType;
import i.AbstractC41201a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AuthFragmentContracts.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/auth/j;", "Li/a;", "", "Lkotlin/G0;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.authorization.auth.j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28631j extends AbstractC41201a<String, G0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AuthFragment f93043b;

    public C28631j(AuthFragment authFragment) {
        this.f93043b = authFragment;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, String str) {
        String str2 = str;
        l90.o oVar = this.f93043b.f92834w0;
        if (oVar == null) {
            oVar = null;
        }
        return oVar.a(str2);
    }

    @Override // i.AbstractC41201a
    public final G0 parseResult(int i12, Intent intent) {
        SocialType socialType;
        AuthFragment authFragment = this.f93043b;
        if (i12 == -1) {
            String stringExtra = intent != null ? intent.getStringExtra("extra_social_email") : null;
            String stringExtra2 = intent != null ? intent.getStringExtra("extra_social_token") : null;
            if (intent != null) {
                socialType = (SocialType) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("extra_social_type", SocialType.class) : intent.getParcelableExtra("extra_social_type"));
            } else {
                socialType = null;
            }
            String stringExtra3 = intent != null ? intent.getStringExtra("extra_social_user") : null;
            String stringExtra4 = intent != null ? intent.getStringExtra("extra_social_code") : null;
            String stringExtra5 = intent != null ? intent.getStringExtra("extra_social_state") : null;
            String stringExtra6 = intent != null ? intent.getStringExtra("extra_social_error") : null;
            String stringExtra7 = intent != null ? intent.getStringExtra("extra_social_error_message") : null;
            InterfaceC28644x interfaceC28644x = authFragment.f92836y0;
            InterfaceC28644x interfaceC28644x2 = interfaceC28644x != null ? interfaceC28644x : null;
            com.avito.android.social.M m12 = authFragment.f92817A0;
            interfaceC28644x2.f((m12 != null ? m12 : null).a(socialType), stringExtra2, stringExtra, stringExtra3, stringExtra4, stringExtra5, stringExtra6, stringExtra7);
        } else if (i12 == 0) {
            InterfaceC28644x interfaceC28644x3 = authFragment.f92836y0;
            (interfaceC28644x3 != null ? interfaceC28644x3 : null).a();
            authFragment.D5();
        } else if (i12 == 1) {
            InterfaceC28644x interfaceC28644x4 = authFragment.f92836y0;
            (interfaceC28644x4 != null ? interfaceC28644x4 : null).c();
        }
        return G0.f406611a;
    }
}
