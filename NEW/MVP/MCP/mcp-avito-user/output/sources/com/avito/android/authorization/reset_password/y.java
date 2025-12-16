package com.avito.android.authorization.reset_password;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.N3;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ResetPasswordResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/reset_password/y;", "Lcom/avito/android/authorization/reset_password/x;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class y implements x {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f94218a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC35945t1<String>> f94219b;

    @Inject
    public y(@Y61.k Resources resources, @N3.c @Y61.k h31.e<InterfaceC35945t1<String>> eVar) {
        this.f94218a = resources;
        this.f94219b = eVar;
    }

    @Override // com.avito.android.authorization.reset_password.x
    @Y61.k
    public final String a(@Y61.k String str) {
        return this.f94218a.getString(R.string.reset_password_link_sent_text, str);
    }

    @Override // com.avito.android.authorization.reset_password.x
    @Y61.k
    public final String b(@Y61.k String str) {
        return this.f94218a.getString(R.string.code_sent_text, this.f94219b.get().a(str));
    }
}
