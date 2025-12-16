package com.avito.android.rating.user_contacts;

import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserContactsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g extends N implements Y41.l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserContactsActivity f247766l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(UserContactsActivity userContactsActivity) {
        super(1);
        this.f247766l = userContactsActivity;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) {
        ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
        UserContactsActivity userContactsActivity = this.f247766l;
        contentPlaceholder2.setTitle(userContactsActivity.getString(R.string.error_layout_unknown_error));
        contentPlaceholder2.setSubtitle(userContactsActivity.getString(R.string.error_layout_try_refresh_or_return_later));
        contentPlaceholder2.setImageDrawable(C35835l0.h(R.attr.img_unknownError, userContactsActivity));
        contentPlaceholder2.setButtonTitle(userContactsActivity.getString(R.string.error_layout_refresh));
        contentPlaceholder2.setButtonOnClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(userContactsActivity, 21));
        return G0.f406611a;
    }
}
