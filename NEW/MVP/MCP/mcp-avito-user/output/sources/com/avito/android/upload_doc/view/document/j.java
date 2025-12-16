package com.avito.android.upload_doc.view.document;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.photo_uploader_image.PhotoUploaderImage;
import com.avito.android.util.D6;
import gw.InterfaceC40743a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: GigUploadDocDocumentView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/upload_doc/view/document/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/upload_doc/view/document/i;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f307036h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PhotoUploaderImage f307037b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f307038c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f307039d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f307040e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ImageView f307041f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ImageView f307042g;

    /* compiled from: GigUploadDocDocumentView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f307043l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f307043l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f307043l.invoke();
            return G0.f406611a;
        }
    }

    public j(@k View view) {
        super(view);
        PhotoUploaderImage photoUploaderImage = (PhotoUploaderImage) view.findViewById(R.id.document_image_view);
        this.f307037b = photoUploaderImage;
        this.f307038c = (TextView) view.findViewById(R.id.document_badge);
        this.f307039d = view.findViewById(R.id.camera_overlay);
        this.f307040e = (ImageView) view.findViewById(R.id.document_add_required_button);
        this.f307041f = (ImageView) view.findViewById(R.id.document_add_not_required_button);
        this.f307042g = (ImageView) view.findViewById(R.id.document_delete_button);
        photoUploaderImage.setCornerRadius(view.getResources().getDimension(R.dimen.gig_photo_radius));
    }

    @Override // com.avito.android.upload_doc.view.document.i
    public final void M4(@k Uri uri) {
        PhotoUploaderImage photoUploaderImage = this.f307037b;
        if (photoUploaderImage != null) {
            com.bumptech.glide.b.c(photoUploaderImage).l(uri).B(new b(photoUploaderImage));
        }
        D6.w(this.f307039d);
    }

    @Override // com.avito.android.upload_doc.view.document.i
    public final void N6() {
        PhotoUploaderImage photoUploaderImage = this.f307037b;
        if (photoUploaderImage != null) {
            photoUploaderImage.setImage(null);
        }
        D6.H(this.f307039d);
    }

    @Override // com.avito.android.upload_doc.view.document.i
    public final void OO(@k Y41.a aVar, boolean z12) {
        ImageView imageView = this.f307041f;
        ImageView imageView2 = this.f307040e;
        if (z12) {
            D6.H(imageView2);
            imageView2.setOnClickListener(new com.avito.android.travel_guest_profile.items.profile_header.h(5, aVar));
            D6.w(imageView);
        } else {
            D6.H(imageView);
            imageView.setOnClickListener(new com.avito.android.travel_guest_profile.items.profile_header.h(6, aVar));
            D6.w(imageView2);
        }
        D6.w(this.f307042g);
    }

    @Override // com.avito.android.upload_doc.view.document.i
    public final void Zi() {
        this.f307037b.j();
    }

    @Override // com.avito.android.upload_doc.view.document.i
    public final void c0() {
        this.f307037b.n();
    }

    @Override // com.avito.android.upload_doc.view.document.i
    public final void l9(@k Y41.a<G0> aVar) {
        PhotoUploaderImage photoUploaderImage = this.f307037b;
        photoUploaderImage.l((2 & 1) == 0, true);
        D6.w(this.f307039d);
        photoUploaderImage.setErrorClickedListener(new a(aVar));
    }

    @Override // com.avito.android.upload_doc.view.document.i
    public final void setTitle(@k String str) {
        this.f307038c.setText(str);
    }

    @Override // com.avito.android.upload_doc.view.document.i
    public final void wb(@k Y41.a<G0> aVar) {
        ImageView imageView = this.f307042g;
        D6.H(imageView);
        imageView.setOnClickListener(new com.avito.android.travel_guest_profile.items.profile_header.h(4, aVar));
        D6.w(this.f307040e);
        D6.w(this.f307041f);
    }

    /* compiled from: ImageLoadableExtension.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004¸\u0006\u0000"}, d2 = {"DM/l", "Lcom/bumptech/glide/request/target/g;", "Landroid/view/View;", "Landroid/graphics/drawable/Drawable;", "_common_image-loader-glide_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.bumptech.glide.request.target.g<View, Drawable> {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC40743a f307044d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC40743a interfaceC40743a) {
            super((View) interfaceC40743a);
            this.f307044d = interfaceC40743a;
        }

        @Override // com.bumptech.glide.request.target.q
        public final void c(Object obj, com.bumptech.glide.request.transition.f fVar) {
            this.f307044d.setImage((Drawable) obj);
        }

        @Override // com.bumptech.glide.request.target.q
        public final void g(@l Drawable drawable) {
        }
    }

    /* compiled from: ImageLoadableExtension.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004¸\u0006\u0000"}, d2 = {"DM/l", "Lcom/bumptech/glide/request/target/g;", "Landroid/view/View;", "Landroid/graphics/drawable/Drawable;", "_common_image-loader-glide_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends com.bumptech.glide.request.target.g<View, Drawable> {
        @Override // com.bumptech.glide.request.target.q
        public final void c(Object obj, com.bumptech.glide.request.transition.f fVar) {
            throw null;
        }

        @Override // com.bumptech.glide.request.target.q
        public final void g(@l Drawable drawable) {
        }
    }
}
