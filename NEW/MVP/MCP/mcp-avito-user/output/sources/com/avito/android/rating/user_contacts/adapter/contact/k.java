package com.avito.android.rating.user_contacts.adapter.contact;

import com.avito.android.rating.user_contacts.UserContactRatingSelectView;
import io.reactivex.rxjava3.core.B;
import kotlin.Metadata;

/* compiled from: ContactItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/user_contacts/adapter/contact/k;", "Lcom/avito/android/rating/user_contacts/UserContactRatingSelectView$a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k implements UserContactRatingSelectView.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B<Integer> f247704a;

    public k(B<Integer> b12) {
        this.f247704a = b12;
    }

    @Override // com.avito.android.rating.user_contacts.UserContactRatingSelectView.a
    public final void a(int i12) {
        this.f247704a.onNext(Integer.valueOf(i12));
    }
}
