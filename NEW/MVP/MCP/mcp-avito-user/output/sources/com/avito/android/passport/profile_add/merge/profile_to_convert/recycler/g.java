package com.avito.android.passport.profile_add.merge.profile_to_convert.recycler;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;

/* compiled from: ErrorTextListItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profile_to_convert/recycler/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/passport/profile_add/merge/profile_to_convert/recycler/f;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f213185b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f213186c;

    public g(@Y61.k View view) {
        super(view);
        this.f213185b = view;
        this.f213186c = (TextView) view.findViewById(R.id.passport_merge_accounts_error_item_text);
    }

    @Override // com.avito.android.passport.profile_add.merge.profile_to_convert.recycler.f
    public final void y(@Y61.k PrintableText printableText) {
        com.avito.android.printable_text.a.c(this.f213186c, printableText);
    }
}
