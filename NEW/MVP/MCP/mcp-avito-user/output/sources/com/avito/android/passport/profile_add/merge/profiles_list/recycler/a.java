package com.avito.android.passport.profile_add.merge.profiles_list.recycler;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.FontAttribute;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: MergeAccountsAttributedTextGenerator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/recycler/a;", "Lcom/avito/android/passport/profile_list_item/a;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.passport.profile_list_item.a {
    @Inject
    public a() {
    }

    @Override // com.avito.android.passport.profile_list_item.a
    @Y61.k
    public final AttributedText a(@Y61.k Context context) {
        return new AttributedText("{{text}} {{link_text}}", C42745f0.U(new FontAttribute("text", context.getString(R.string.passport_accounts_merge_profiles_list_legal_text), com.avito.android.advert.item.delivery_suggests.l.u(null, "m2")), new DeepLinkAttribute("link_text", context.getString(R.string.passport_accounts_merge_profiles_list_legal_link_text), new WebViewLink.OnlyAvitoDomain(com.avito.android.passport.profile_add.merge.a.f212382a, null, null, 6, null), null, null, null, 56, null)), 1);
    }
}
