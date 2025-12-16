package com.avito.android.passport.profile_list_item;

import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.mortgage.document_upload.B;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ProfileListLegalItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_list_item/s;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/passport/profile_list_item/r;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class s extends com.avito.konveyor.adapter.b implements r {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f213664c = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AttributedText f213665b;

    public s(@Y61.k View view, @Y61.k a aVar) {
        super(view);
        AttributedText attributedTextA = aVar.a(view.getContext());
        this.f213665b = attributedTextA;
        com.avito.android.lib.design.text_view.a aVar2 = new com.avito.android.lib.design.text_view.a(view.getContext(), null, 0, 0, 14, null);
        com.avito.android.util.text.j.c(aVar2, attributedTextA, null);
        aVar2.setTextAppearance(C35835l0.j(R.attr.textM10, aVar2.getContext()));
        Banner banner = (Banner) view.findViewById(R.id.passport_merge_accounts_profile_list_legal_item_banner);
        banner.setContentView(aVar2);
        Banner.m(banner, Integer.valueOf(y6.b(28)), 7);
    }

    @Override // com.avito.android.passport.profile_list_item.r
    public final void H3(@Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f213665b.setOnDeepLinkClickListener(new B(2, lVar));
    }
}
