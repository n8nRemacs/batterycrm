package com.avito.android.user_advert.advert.delegate;

import Y61.k;
import kotlin.Metadata;

/* compiled from: PresenterDelegateNotFoundException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/PresenterDelegateNotFoundException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PresenterDelegateNotFoundException extends IllegalStateException {
    public PresenterDelegateNotFoundException(@k Class<?> cls) {
        super("Presenter delegate for " + cls + " not found!");
    }
}
