package com.avito.android.code_check.phone_list.adapter.empty_search;

import Y61.k;
import android.view.View;
import com.avito.android.code_check.phone_list.adapter.PhoneListItemView;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;

/* compiled from: EmptySearchItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/phone_list/adapter/empty_search/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/code_check/phone_list/adapter/empty_search/f;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PhoneListItemView f118930b;

    public g(@k View view) {
        super(view);
        PhoneListItemView phoneListItemView = (PhoneListItemView) view;
        this.f118930b = phoneListItemView;
        phoneListItemView.n(null, false);
    }

    @Override // com.avito.android.code_check.phone_list.adapter.empty_search.f
    public final void y(@k PrintableText printableText) {
        PhoneListItemView phoneListItemView = this.f118930b;
        phoneListItemView.setText(printableText.k0(phoneListItemView.getContext()));
    }
}
