package com.avito.android.review_gallery.dialog;

import Y41.p;
import android.os.Bundle;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReviewGalleryDetailsDialog.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/avito/android/remote/model/Image;", "list", "", "position", "Lkotlin/G0;", "invoke", "(Ljava/util/List;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class a extends N implements p<List<? extends Image>, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ReviewGalleryDetailsDialog f255488l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ReviewGalleryDetailsDialog reviewGalleryDetailsDialog) {
        super(2);
        this.f255488l = reviewGalleryDetailsDialog;
    }

    @Override // Y41.p
    public final G0 invoke(List<? extends Image> list, Integer num) {
        int iIntValue = num.intValue();
        Bundle bundle = new Bundle();
        bundle.putParcelable("selectedImage", list.get(iIntValue));
        ReviewGalleryDetailsDialog reviewGalleryDetailsDialog = this.f255488l;
        reviewGalleryDetailsDialog.getParentFragmentManager().o0(bundle, "detailsDialog");
        reviewGalleryDetailsDialog.dismiss();
        return G0.f406611a;
    }
}
