package com.avito.android.user_adverts.root_screen.adverts_host;

import YI0.a;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment;
import com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.c;
import com.avito.android.user_adverts.tab_actions.attention.UserAdvertsActionAttentionData;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C35565c implements androidx.fragment.app.C, c.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsHostFragment f312529b;

    public /* synthetic */ C35565c(UserAdvertsHostFragment userAdvertsHostFragment) {
        this.f312529b = userAdvertsHostFragment;
    }

    public void a(BI0.a aVar) {
        com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.F f12 = this.f312529b.f312298H0;
        if (f12 == null) {
            f12 = null;
        }
        f12.accept(aVar);
    }

    @Override // androidx.fragment.app.C
    public void k(Bundle bundle, String str) {
        UserAdvertsHostFragment.a aVar = UserAdvertsHostFragment.f312290o1;
        if (str.hashCode() == 1412999815 && str.equals("request_key_user_adverts_attention_dialog_fragment_data")) {
            UserAdvertsActionAttentionData userAdvertsActionAttentionData = (UserAdvertsActionAttentionData) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("key_user_adverts_attention_dialog_fragment_data", UserAdvertsActionAttentionData.class) : bundle.getParcelable("key_user_adverts_attention_dialog_fragment_data"));
            if (userAdvertsActionAttentionData != null) {
                com.avito.android.user_adverts.tab_actions.host.j jVar = this.f312529b.f312292B0;
                if (jVar == null) {
                    jVar = null;
                }
                jVar.accept(new a.d(userAdvertsActionAttentionData.f314194b, userAdvertsActionAttentionData.f314196d, userAdvertsActionAttentionData.f314198f, null, 8, null));
            }
        }
    }
}
