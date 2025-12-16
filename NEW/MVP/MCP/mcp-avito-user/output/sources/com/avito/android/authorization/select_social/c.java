package com.avito.android.authorization.select_social;

import com.avito.android.remote.model.SocialAuthResult;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41998x0;
import kotlin.Metadata;

/* compiled from: SelectSocialInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/select_social/c;", "", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface c {

    /* compiled from: SelectSocialInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    C41998x0 a();

    @Y61.k
    z<SocialAuthResult> b(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4);

    @Y61.k
    z<SocialAuthResult> c(@Y61.k String str, @Y61.l String str2, @Y61.l String str3);
}
