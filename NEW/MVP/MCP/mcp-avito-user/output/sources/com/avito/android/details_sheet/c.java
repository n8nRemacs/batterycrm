package com.avito.android.details_sheet;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: DetailsSheetActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/details_sheet/c;", "Lcom/avito/android/image_loader/i;", "_avito_details-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements com.avito.android.image_loader.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SimpleDraweeView f135936b;

    public c(SimpleDraweeView simpleDraweeView) {
        this.f135936b = simpleDraweeView;
    }

    @Override // com.avito.android.image_loader.i
    public final void H(int i12, int i13) {
        SimpleDraweeView simpleDraweeView = this.f135936b;
        ViewGroup.LayoutParams layoutParams = simpleDraweeView.getLayoutParams();
        ConstraintLayout.b bVar = null;
        ConstraintLayout.b bVar2 = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i12);
            sb2.append(':');
            sb2.append(i13);
            bVar2.f44161H = sb2.toString();
            bVar = bVar2;
        }
        simpleDraweeView.setLayoutParams(bVar);
    }

    @Override // com.avito.android.image_loader.i
    public final void S2() {
    }

    @Override // com.avito.android.image_loader.i
    public final void b2(@Y61.l Throwable th2) {
    }
}
