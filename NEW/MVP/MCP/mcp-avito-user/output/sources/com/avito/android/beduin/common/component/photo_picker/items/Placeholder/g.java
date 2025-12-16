package com.avito.android.beduin.common.component.photo_picker.items.Placeholder;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.photo_uploader_appending.PhotoUploaderAppending;
import com.avito.android.lib.design.photo_uploader_image.PhotoUploaderLayout;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PlaceholderItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/items/Placeholder/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/beduin/common/component/photo_picker/items/Placeholder/f;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f102019f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f102020b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PhotoUploaderLayout f102021c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PhotoUploaderAppending f102022d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f102023e;

    public g(@k View view) {
        super(view);
        this.f102020b = view;
        this.f102021c = (PhotoUploaderLayout) view.findViewById(R.id.item_appending_container);
        this.f102022d = (PhotoUploaderAppending) view.findViewById(R.id.loading_photo_image_view);
        this.f102023e = (TextView) view.findViewById(R.id.error_message);
    }

    @Override // com.avito.android.beduin.common.component.photo_picker.items.Placeholder.f
    public final void Dn(boolean z12) throws Resources.NotFoundException {
        PhotoUploaderAppending photoUploaderAppending = this.f102022d;
        if (z12) {
            photoUploaderAppending.setAppearance(R.style.BeduinPhotoUploaderAppendingError);
        } else {
            photoUploaderAppending.setAppearance(R.style.BeduinPhotoUploaderAppending);
        }
        this.f102021c.setContentDescription("errorBorder=" + z12);
    }

    @Override // com.avito.android.beduin.common.component.photo_picker.items.Placeholder.f
    public final void Wp(@l String str) {
        I5.a(this.f102023e, str, false);
    }

    @Override // com.avito.android.beduin.common.component.photo_picker.items.Placeholder.f
    public final void zL(@k Y41.a<G0> aVar) {
        this.f102022d.setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(26, aVar));
    }
}
