package com.avito.android.work_profile.profile.about_me.ui;

import Y41.l;
import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.user_adverts.root_screen.adverts_host.host_view.g;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AboutMeFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class a extends N implements l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AboutMeFragment f330833l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AboutMeFragment aboutMeFragment) {
        super(1);
        this.f330833l = aboutMeFragment;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) {
        ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
        contentPlaceholder2.setImageResource(Integer.valueOf(C35835l0.j(R.attr.expected_img_error_cat, contentPlaceholder2.getContext())));
        contentPlaceholder2.setTitle(contentPlaceholder2.getContext().getText(R.string.load_tabs_error_title));
        contentPlaceholder2.setSubtitle(contentPlaceholder2.getContext().getText(R.string.load_tabs_error_description_text));
        contentPlaceholder2.setButtonTitle(contentPlaceholder2.getContext().getText(R.string.load_tabs_error_update));
        contentPlaceholder2.setButtonOnClickListener(new g(this.f330833l, 23));
        return G0.f406611a;
    }
}
