package com.avito.android.rating.user_contacts.mvi;

import android.net.Uri;
import com.avito.android.rating.user_contacts.mvi.entity.UserContactsInternalAction;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UserContactsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/n;", "", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface n {

    /* compiled from: UserContactsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    InterfaceC43160i<UserContactsInternalAction> a(boolean z12);

    @Y61.k
    InterfaceC43160i<UserContactsInternalAction> b(@Y61.k String str, @Y61.k String str2);

    @Y61.k
    InterfaceC43160i<UserContactsInternalAction> c(@Y61.k Uri uri);
}
