package com.avito.android.passport.profile_add;

import com.avito.android.R;
import com.avito.android.inline_filters.dialog.C;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PassportContentPlaceholders.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_passport_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g {
    public static final void a(@Y61.k ContentPlaceholder contentPlaceholder, @Y61.k Y41.a<G0> aVar) {
        contentPlaceholder.setImageResource(Integer.valueOf(R.drawable.placeholders_img_unknown_error));
        contentPlaceholder.setTitle(contentPlaceholder.getResources().getString(R.string.error_layout_unknown_error));
        contentPlaceholder.setSubtitle(contentPlaceholder.getResources().getString(R.string.error_layout_try_refresh_or_return_later));
        contentPlaceholder.setButtonTitle(contentPlaceholder.getResources().getString(R.string.error_layout_refresh));
        contentPlaceholder.setButtonOnClickListener(new C(17, aVar));
    }
}
