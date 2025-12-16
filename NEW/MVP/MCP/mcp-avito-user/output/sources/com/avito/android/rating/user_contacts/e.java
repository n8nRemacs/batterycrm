package com.avito.android.rating.user_contacts;

import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Metadata;

/* compiled from: UserContactsActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/user_contacts/e;", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e extends GridLayoutManager.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UserContactsActivity f247763e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f247764f;

    public e(UserContactsActivity userContactsActivity, int i12) {
        this.f247763e = userContactsActivity;
        this.f247764f = i12;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int f(int i12) {
        m mVar = this.f247763e.f247660s;
        if (mVar == null) {
            mVar = null;
        }
        return mVar.a(i12, this.f247764f);
    }
}
