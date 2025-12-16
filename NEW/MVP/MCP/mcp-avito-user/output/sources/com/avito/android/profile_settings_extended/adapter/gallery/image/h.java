package com.avito.android.profile_settings_extended.adapter.gallery.image;

import Rb0.C15027c;
import Rb0.InterfaceC15026b;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.fresco.s;
import com.avito.android.lib.design.photo_uploader_image.PhotoUploaderImage;
import com.avito.android.profile_settings_extended.adapter.gallery.image.GalleryImageItem;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: ImageItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/gallery/image/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_extended/adapter/gallery/image/g;", "LRb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g, InterfaceC15026b {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f229438i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f229439b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C15027c f229440c;

    /* renamed from: d, reason: collision with root package name */
    public final PhotoUploaderImage f229441d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Drawable f229442e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public String f229443f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public String f229444g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public Y41.a<G0> f229445h;

    /* compiled from: ImageItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[GalleryImageItem.ScaleType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                GalleryImageItem.ScaleType scaleType = GalleryImageItem.ScaleType.f229424b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public h(@Y61.k View view) {
        super(view);
        this.f229439b = view;
        this.f229440c = new C15027c(view);
        this.f229441d = (PhotoUploaderImage) view.findViewById(R.id.loading_photo_image_view);
        this.f229442e = androidx.core.content.d.getDrawable(view.getContext(), R.drawable.placeholder_photo_uploader_image);
        this.f229443f = "";
        this.f229444g = "";
    }

    @Override // com.avito.android.profile_settings_extended.adapter.gallery.image.g
    @Y61.k
    /* renamed from: CU, reason: from getter */
    public final String getF229444g() {
        return this.f229444g;
    }

    @Override // com.avito.android.profile_settings_extended.adapter.gallery.image.g
    public final void NY(@Y61.k Uri uri, @Y61.k String str, @Y61.k String str2) {
        this.f229443f = str;
        this.f229444g = str2;
        PhotoUploaderImage photoUploaderImage = this.f229441d;
        photoUploaderImage.setImage(this.f229442e);
        s.c(photoUploaderImage, uri, true, null, null);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.gallery.image.g
    public final void OV(@Y61.k Image image, @Y61.k String str, @Y61.k String str2) {
        this.f229443f = str;
        this.f229444g = str2;
        PhotoUploaderImage photoUploaderImage = this.f229441d;
        photoUploaderImage.setImage(this.f229442e);
        s.b(photoUploaderImage, image, null, 30);
    }

    @Override // com.avito.android.profile_management_core.images.entity.f
    public final void c0() {
        this.f229441d.n();
    }

    @Override // com.avito.android.profile_management_core.images.entity.f
    public final void c80() {
        this.f229441d.j();
    }

    @Override // com.avito.android.profile_settings_extended.adapter.gallery.image.g
    public final void iB(@Y61.k GalleryImageItem.ScaleType scaleType) {
        ImageView.ScaleType scaleType2;
        int iOrdinal = scaleType.ordinal();
        if (iOrdinal == 0) {
            scaleType2 = ImageView.ScaleType.CENTER_CROP;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            scaleType2 = ImageView.ScaleType.FIT_CENTER;
        }
        this.f229441d.setImageScaleType(scaleType2);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f229445h = null;
        PhotoUploaderImage photoUploaderImage = this.f229441d;
        photoUploaderImage.setErrorClickedListener(null);
        photoUploaderImage.setOnClickListener(null);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.gallery.image.g
    @Y61.k
    /* renamed from: oT, reason: from getter */
    public final String getF229443f() {
        return this.f229443f;
    }

    @Override // com.avito.android.profile_settings_extended.adapter.gallery.image.g
    public final void p3(@Y61.k Y41.a<G0> aVar) {
        this.f229445h = aVar;
        this.f229441d.setOnClickListener(new com.avito.android.profile_phones.phones_list.phone_item.g(10, aVar));
    }

    @Override // Rb0.InterfaceC15026b
    public final void xT(boolean z12) {
        this.f229440c.xT(z12);
    }

    @Override // com.avito.android.profile_management_core.images.entity.f
    public final void y3() {
        PhotoUploaderImage photoUploaderImage = this.f229441d;
        photoUploaderImage.l((2 & 1) == 0, true);
        photoUploaderImage.setErrorClickedListener(new i(this));
    }

    @Override // com.avito.android.profile_management_core.images.entity.f
    public final void zI() {
        this.f229441d.i();
    }
}
