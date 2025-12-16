package com.avito.android.account;

import com.avito.android.account.X;
import com.avito.android.account.analytics.event.SaveSuggestEvent;
import com.avito.android.remote.model.LoginResult;
import com.avito.android.remote.model.Profile;
import com.avito.android.remote.model.Session;
import com.avito.android.remote.model.TfaFlow;
import com.avito.android.remote.model.TypedResult;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.observable.L0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AccountInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/account/a;", "", "_avito_account-storage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.account.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC27663a {

    /* compiled from: AccountInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.account.a$a, reason: collision with other inner class name */
    public static final class C2131a {
        public static /* synthetic */ AbstractC41768a b(InterfaceC27663a interfaceC27663a, Session session, Profile profile, String str, String str2, String str3, String str4, int i12) {
            if ((i12 & 8) != 0) {
                str2 = "login";
            }
            String str5 = str2;
            if ((i12 & 16) != 0) {
                str3 = profile.getSocialId();
            }
            String str6 = str3;
            if ((i12 & 32) != 0) {
                str4 = null;
            }
            return interfaceC27663a.d(session, profile, str, str5, str6, str4, SaveSuggestEvent.Source.f68107c);
        }
    }

    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.K a(@Y61.l String str, boolean z12);

    @Y61.l
    Object b(@Y61.k String str, @Y61.k TfaFlow tfaFlow, @Y61.k Y y12, @Y61.k Continuation<? super TypedResult<LoginResult>> continuation);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.mixed.a c(@Y61.k X.a aVar, @Y61.l String str, @Y61.l String str2);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.K d(@Y61.k Session session, @Y61.k Profile profile, @Y61.l String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.k SaveSuggestEvent.Source source);

    @Y61.k
    L0 e(@Y61.k X.b bVar, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.single.U f(@Y61.k String str, @Y61.k String str2, boolean z12);
}
