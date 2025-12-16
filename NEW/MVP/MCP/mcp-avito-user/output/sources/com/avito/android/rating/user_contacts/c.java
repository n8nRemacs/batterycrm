package com.avito.android.rating.user_contacts;

import android.view.View;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserContactsActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class c extends N implements Y41.a<View> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserContactsActivity f247727l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(UserContactsActivity userContactsActivity) {
        super(0);
        this.f247727l = userContactsActivity;
    }

    @Override // Y41.a
    public final View invoke() {
        return this.f247727l.findViewById(R.id.recycler);
    }
}
