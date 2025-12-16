package com.avito.android.seller_room.ui;

import Y41.l;
import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.review_gallery.g;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SellerRoomFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class b extends N implements l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SellerRoomFragment f268238l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SellerRoomFragment sellerRoomFragment) {
        super(1);
        this.f268238l = sellerRoomFragment;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) {
        ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
        SellerRoomFragment sellerRoomFragment = this.f268238l;
        contentPlaceholder2.setImageResource(Integer.valueOf(C35835l0.j(R.attr.expected_img_error_cat, sellerRoomFragment.requireContext())));
        contentPlaceholder2.setTitle(sellerRoomFragment.getText(R.string.seller_room_error_title));
        contentPlaceholder2.setSubtitle(sellerRoomFragment.getText(R.string.seller_room_error_description_text));
        contentPlaceholder2.setButtonTitle(sellerRoomFragment.getText(R.string.seller_room_error_update));
        contentPlaceholder2.setButtonOnClickListener(new g(sellerRoomFragment, 20));
        return G0.f406611a;
    }
}
