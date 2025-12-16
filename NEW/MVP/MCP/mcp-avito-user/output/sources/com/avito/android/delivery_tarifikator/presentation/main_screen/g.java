package com.avito.android.delivery_tarifikator.presentation.main_screen;

import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TarifikatorMainFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class g extends N implements Y41.l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TarifikatorMainFragment f135601l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TarifikatorMainFragment tarifikatorMainFragment) {
        super(1);
        this.f135601l = tarifikatorMainFragment;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) {
        ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
        TarifikatorMainFragment tarifikatorMainFragment = this.f135601l;
        contentPlaceholder2.setTitle(tarifikatorMainFragment.getString(R.string.tarifikator_main_error_title));
        contentPlaceholder2.setSubtitle(tarifikatorMainFragment.getString(R.string.tarifikator_main_error_description_text));
        contentPlaceholder2.setButtonTitle(tarifikatorMainFragment.getString(R.string.tarifikator_main_error_btn_text));
        contentPlaceholder2.setButtonOnClickListener(new b(tarifikatorMainFragment, 1));
        return G0.f406611a;
    }
}
