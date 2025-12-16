package com.avito.android.profile.remove;

import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfileRemoveActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class b extends N implements Y41.l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ProfileRemoveActivity f223780l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ProfileRemoveActivity profileRemoveActivity) {
        super(1);
        this.f223780l = profileRemoveActivity;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) {
        ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
        contentPlaceholder2.setImageResource(Integer.valueOf(R.drawable.placeholders_img_unknown_error));
        contentPlaceholder2.setTitle(contentPlaceholder2.getResources().getString(R.string.error_layout_unknown_error));
        contentPlaceholder2.setSubtitle(contentPlaceholder2.getResources().getString(R.string.error_layout_try_refresh_or_return_later));
        contentPlaceholder2.setButtonTitle(contentPlaceholder2.getResources().getString(R.string.error_layout_refresh));
        contentPlaceholder2.setButtonOnClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(this.f223780l, 1));
        return G0.f406611a;
    }
}
