package com.avito.android.profile_settings_extended.adapter.banner;

import Rb0.C15027c;
import Rb0.InterfaceC15026b;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.Barrier;
import com.avito.android.R;
import com.avito.android.image_loader.fresco.s;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.photo_uploader_image.PhotoUploaderImage;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.profile_management_core.images.entity.UploadImageState;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedSettingsBannerItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/banner/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_extended/adapter/banner/i;", "LRb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k extends com.avito.konveyor.adapter.b implements i, InterfaceC15026b {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f229194m = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C15027c f229195b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f229196c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f229197d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<PhotoUploaderImage> f229198e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f229199f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Barrier f229200g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Drawable f229201h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_management_core.images.entity.d f229202i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public Y41.a<G0> f229203j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public Y41.l<? super UploadImage, G0> f229204k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public List<? extends UploadImage> f229205l;

    public k(@Y61.k View view) {
        super(view);
        this.f229195b = new C15027c(view);
        View viewFindViewById = view.findViewById(R.id.extended_settings_banner_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229196c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_settings_banner_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229197d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.extended_settings_banner_image_new);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.photo_uploader_image.PhotoUploaderImage");
        }
        PhotoUploaderImage photoUploaderImage = (PhotoUploaderImage) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.extended_settings_banner_image_old);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.photo_uploader_image.PhotoUploaderImage");
        }
        this.f229198e = C42745f0.U(photoUploaderImage, (PhotoUploaderImage) viewFindViewById4);
        View viewFindViewById5 = view.findViewById(R.id.extended_settings_banner_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f229199f = (Button) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.extended_settings_banner_barrier);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.Barrier");
        }
        this.f229200g = (Barrier) viewFindViewById6;
        this.f229201h = androidx.core.content.d.getDrawable(view.getContext(), R.drawable.placeholder_large_image);
        this.f229202i = new com.avito.android.profile_management_core.images.entity.d();
    }

    @Override // com.avito.android.profile_settings_extended.adapter.banner.i
    public final void Ei(@Y61.k Y41.l<? super UploadImage, G0> lVar) {
        this.f229204k = lVar;
    }

    @Override // com.avito.android.profile_settings_extended.adapter.banner.i
    public final void SM(@Y61.k ExtendedSettingsBannerItem extendedSettingsBannerItem) {
        List<UploadImage> list = extendedSettingsBannerItem.f229170h;
        Iterator<T> it = list.iterator();
        int i12 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            List<PhotoUploaderImage> list2 = this.f229198e;
            if (!zHasNext) {
                int i13 = 0;
                for (Object obj : list2) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    PhotoUploaderImage photoUploaderImage = (PhotoUploaderImage) obj;
                    if (C42745f0.K(i13, list) == null) {
                        D6.w(photoUploaderImage);
                        photoUploaderImage.setImage(null);
                        photoUploaderImage.setOnClickListener(null);
                        photoUploaderImage.setErrorClickedListener(null);
                    }
                    i13 = i14;
                }
                this.f229205l = list;
                xT(extendedSettingsBannerItem.f229176n);
                I5.a(this.f229196c, extendedSettingsBannerItem.f229166d, false);
                Barrier barrier = this.f229200g;
                TextView textView = this.f229197d;
                AttributedText attributedText = extendedSettingsBannerItem.f229167e;
                if (attributedText == null || !list.isEmpty()) {
                    D6.w(textView);
                    barrier.setDpMargin(4);
                } else {
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    com.avito.android.util.text.j.a(textView, attributedText, null);
                    barrier.setDpMargin(0);
                }
                com.avito.android.lib.design.button.b.a(this.f229199f, list.isEmpty() ? extendedSettingsBannerItem.f229168f : extendedSettingsBannerItem.f229169g, false);
                return;
            }
            Object next = it.next();
            int i15 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            UploadImage uploadImage = (UploadImage) next;
            PhotoUploaderImage photoUploaderImage2 = (PhotoUploaderImage) C42745f0.K(i12, list2);
            if (photoUploaderImage2 != null) {
                D6.E(photoUploaderImage2, extendedSettingsBannerItem.f229171i, extendedSettingsBannerItem.f229172j);
                j jVar = new j(this, uploadImage);
                Drawable drawable = this.f229201h;
                com.avito.android.profile_management_core.images.entity.h hVar = new com.avito.android.profile_management_core.images.entity.h(photoUploaderImage2, uploadImage, drawable, jVar);
                UploadImageState f226677c = uploadImage.getF226677c();
                this.f229202i.getClass();
                com.avito.android.profile_management_core.images.entity.d.a(hVar, f226677c);
                List<? extends UploadImage> list3 = this.f229205l;
                UploadImage uploadImage2 = list3 != null ? (UploadImage) C42745f0.K(i12, list3) : null;
                D6.H(photoUploaderImage2);
                if (uploadImage instanceof UploadImage.ImageFromApi) {
                    UploadImage.ImageFromApi imageFromApi = (UploadImage.ImageFromApi) uploadImage;
                    UploadImage.ImageFromApi imageFromApi2 = uploadImage2 instanceof UploadImage.ImageFromApi ? (UploadImage.ImageFromApi) uploadImage2 : null;
                    Image image = imageFromApi2 != null ? imageFromApi2.f226684j : null;
                    Image image2 = imageFromApi.f226684j;
                    if (!L.f(image2, image)) {
                        if (drawable != null) {
                            photoUploaderImage2.setImage(drawable);
                        }
                        s.b(photoUploaderImage2, image2, null, 30);
                    }
                } else if (uploadImage instanceof UploadImage.ImageFromPhotoPicker) {
                    UploadImage.ImageFromPhotoPicker imageFromPhotoPicker = (UploadImage.ImageFromPhotoPicker) uploadImage;
                    UploadImage.ImageFromPhotoPicker imageFromPhotoPicker2 = uploadImage2 instanceof UploadImage.ImageFromPhotoPicker ? (UploadImage.ImageFromPhotoPicker) uploadImage2 : null;
                    Uri uri = imageFromPhotoPicker2 != null ? imageFromPhotoPicker2.f226689j : null;
                    Uri uri2 = imageFromPhotoPicker.f226689j;
                    if (!L.f(uri2, uri)) {
                        if (drawable != null) {
                            photoUploaderImage2.setImage(drawable);
                        }
                        s.c(photoUploaderImage2, uri2, true, null, null);
                    }
                }
                photoUploaderImage2.setOnClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(hVar, 3));
            }
            i12 = i15;
        }
    }

    @Override // com.avito.android.profile_settings_extended.adapter.banner.i
    public final void a0(@Y61.k Y41.a<G0> aVar) {
        this.f229199f.setOnClickListener(new com.avito.android.profile_phones.phones_list.phone_item.g(5, aVar));
    }

    @Override // com.avito.android.profile_settings_extended.adapter.banner.i
    public final void d(@l Y41.a<G0> aVar) {
        this.f229203j = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f229203j;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f229204k = null;
        this.f229199f.setOnClickListener(null);
        for (PhotoUploaderImage photoUploaderImage : this.f229198e) {
            photoUploaderImage.setOnClickListener(null);
            photoUploaderImage.setErrorClickedListener(null);
        }
        this.f229205l = null;
    }

    @Override // Rb0.InterfaceC15026b
    public final void xT(boolean z12) {
        this.f229195b.xT(z12);
    }
}
