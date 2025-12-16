package com.avito.android.login_suggests_impl;

import android.content.Intent;
import com.avito.android.login_suggests_impl.Suggest;
import com.avito.android.login_suggests_impl.adapter.LoginSuggestsItem;
import com.avito.android.login_suggests_impl.adapter.common_login.CommonLoginItem;
import com.avito.android.login_suggests_impl.adapter.suggest.SuggestItem;
import kotlin.Metadata;

/* compiled from: LoginSuggestsPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/login_suggests_impl/adapter/LoginSuggestsItem;", "kotlin.jvm.PlatformType", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/login_suggests_impl/adapter/LoginSuggestsItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class n<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f182942b;

    public n(t tVar) {
        this.f182942b = tVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        LoginSuggestsItem loginSuggestsItem = (LoginSuggestsItem) obj;
        boolean z12 = loginSuggestsItem instanceof SuggestItem;
        t tVar = this.f182942b;
        if (!z12) {
            if (loginSuggestsItem instanceof CommonLoginItem) {
                tVar.f182952e.c(new EW.a());
                LoginSuggestsActivity loginSuggestsActivity = tVar.f182956i;
                if (loginSuggestsActivity != null) {
                    loginSuggestsActivity.a2();
                    return;
                }
                return;
            }
            return;
        }
        Suggest suggest = ((SuggestItem) loginSuggestsItem).f182879c;
        if (suggest instanceof Suggest.Login) {
            tVar.f182952e.c(new EW.b(((Suggest.Login) suggest).f182857d, null, 2, null));
            LoginSuggestsActivity loginSuggestsActivity2 = tVar.f182956i;
            if (loginSuggestsActivity2 != null) {
                loginSuggestsActivity2.setResult(-1, new Intent().putExtra("login", ((Suggest.Login) suggest).f182857d));
                loginSuggestsActivity2.finish();
                return;
            }
            return;
        }
        if (suggest instanceof Suggest.Social) {
            tVar.f182952e.c(new EW.b(null, ((Suggest.Social) suggest).f182860d, 1, null));
            LoginSuggestsActivity loginSuggestsActivity3 = tVar.f182956i;
            if (loginSuggestsActivity3 != null) {
                Suggest.Social social = (Suggest.Social) suggest;
                String str = social.f182860d;
                Intent intent = new Intent();
                intent.putExtra("social", str);
                intent.putExtra("social_id", social.f182861e);
                loginSuggestsActivity3.setResult(-1, intent);
                loginSuggestsActivity3.finish();
            }
        }
    }
}
