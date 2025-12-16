package com.avito.android.verification.list_items.image;

import Y61.k;
import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.verification.list_items.image.ImageItem;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: ImageItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/list_items/image/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_verification-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    public final SimpleDraweeView f324827b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f324828c;

    /* compiled from: ImageItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ImageItem.Align.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ImageItem.Align align = ImageItem.Align.f324817b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ImageItem.Align align2 = ImageItem.Align.f324817b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public e(@k View view) {
        super(view);
        this.f324827b = (SimpleDraweeView) view.findViewById(R.id.item_image_drawee_view);
        this.f324828c = this.itemView.getContext();
    }
}
