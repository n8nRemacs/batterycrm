package com.avito.android.safety.password_change.mvi;

import com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PasswordChangeInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/p;", "", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface p {

    /* compiled from: PasswordChangeInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    r a();

    @Y61.l
    PasswordChangeInternalAction b(@Y61.l String str);

    @Y61.k
    InterfaceC43160i<PasswordChangeInternalAction> c(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4);
}
