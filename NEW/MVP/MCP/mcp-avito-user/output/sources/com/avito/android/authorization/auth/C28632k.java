package com.avito.android.authorization.auth;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import ae.C19875c;
import android.content.Context;
import android.content.Intent;
import com.avito.android.analytics.InterfaceC28373a;
import i.AbstractC41201a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AuthFragmentContracts.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/auth/k;", "Li/a;", "Lkotlin/G0;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.authorization.auth.k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28632k extends AbstractC41201a<G0, G0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AuthFragment f93045b;

    public C28632k(AuthFragment authFragment) {
        this.f93045b = authFragment;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, G0 g02) {
        FW.a aVar = this.f93045b.f92832u0;
        if (aVar == null) {
            aVar = null;
        }
        return aVar.a();
    }

    @Override // i.AbstractC41201a
    public final G0 parseResult(int i12, Intent intent) {
        String stringExtra;
        AuthFragment authFragment = this.f93045b;
        if (i12 == -1) {
            com.avito.android.lib.design.bottom_sheet.d dVar = authFragment.f92829M0;
            if (dVar != null) {
                dVar.setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(authFragment, 10));
            }
            com.avito.android.lib.design.bottom_sheet.d dVar2 = authFragment.f92829M0;
            if (dVar2 != null) {
                com.avito.android.lib.util.g.a(dVar2);
            }
            com.avito.android.lib.design.bottom_sheet.d dVar3 = authFragment.f92829M0;
            if (dVar3 != null) {
                dVar3.s();
            }
            String stringExtra2 = intent != null ? intent.getStringExtra("social") : null;
            String stringExtra3 = intent != null ? intent.getStringExtra("login") : null;
            if (intent != null && (stringExtra = intent.getStringExtra("social_id")) != null) {
                InterfaceC28644x interfaceC28644x = authFragment.f92836y0;
                if (interfaceC28644x == null) {
                    interfaceC28644x = null;
                }
                interfaceC28644x.k(stringExtra);
            }
            if (stringExtra2 != null) {
                InterfaceC28373a interfaceC28373a = authFragment.f92837z0;
                (interfaceC28373a != null ? interfaceC28373a : null).c(new C19875c("suggest", stringExtra2));
                authFragment.f92826J0.b(stringExtra2);
            } else if (stringExtra3 != null) {
                authFragment.H5(stringExtra3, "");
            } else {
                InterfaceC28644x interfaceC28644x2 = authFragment.f92836y0;
                (interfaceC28644x2 != null ? interfaceC28644x2 : null).h();
            }
        } else if (i12 == 0) {
            authFragment.D5();
        }
        return G0.f406611a;
    }
}
