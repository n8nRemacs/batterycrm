package com.avito.android.photo_list_view;

import Ca1.ViewOnTouchListenerC13234a;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.photo_uploader_image.PhotoUploaderImage;
import com.avito.android.lib.design.photo_uploader_image.PhotoUploaderLayout;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.util.D6;
import gw.InterfaceC40743a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImageListAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/A;", "Lcom/avito/android/photo_list_view/Q;", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class A extends Q {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f218051g = 0;

    /* renamed from: c, reason: collision with root package name */
    public final PhotoUploaderLayout f218052c;

    /* renamed from: d, reason: collision with root package name */
    public final PhotoUploaderImage f218053d;

    /* renamed from: e, reason: collision with root package name */
    public final View f218054e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageLabelsView f218055f;

    /* compiled from: ImageListAdapter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f218057m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f218057m = str;
        }

        @Override // Y41.a
        public final G0 invoke() {
            A.this.f218106b.o(this.f218057m);
            return G0.f406611a;
        }
    }

    /* compiled from: ImageListAdapter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f218059m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.f218059m = str;
        }

        @Override // Y41.a
        public final G0 invoke() {
            A.this.f218106b.f(this.f218059m);
            return G0.f406611a;
        }
    }

    /* compiled from: ImageListAdapter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33208b f218060l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ PhotoUploaderImage f218061m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC33208b interfaceC33208b, PhotoUploaderImage photoUploaderImage) {
            super(0);
            this.f218060l = interfaceC33208b;
            this.f218061m = photoUploaderImage;
        }

        @Override // Y41.a
        public final G0 invoke() {
            InterfaceC33208b.InterfaceC6540b f218070c = this.f218060l.getF218094c();
            InterfaceC33208b.InterfaceC6540b.C6541b c6541b = f218070c instanceof InterfaceC33208b.InterfaceC6540b.C6541b ? (InterfaceC33208b.InterfaceC6540b.C6541b) f218070c : null;
            if (c6541b != null) {
                this.f218061m.k(c6541b.f218118a);
            }
            return G0.f406611a;
        }
    }

    public A(@Y61.k View view, @Y61.k s sVar) {
        super(view, sVar);
        this.f218052c = (PhotoUploaderLayout) view.findViewById(R.id.item_photo_container);
        this.f218053d = (PhotoUploaderImage) view.findViewById(R.id.loading_photo_image_view);
        this.f218054e = view.findViewById(R.id.edit_available_icon);
        this.f218055f = (ImageLabelsView) view.findViewById(R.id.labels);
    }

    @Override // com.avito.android.photo_list_view.Q
    public final void B80(@Y61.k InterfaceC33208b interfaceC33208b) {
        View view = this.f218054e;
        view.setClickable(false);
        view.setOnTouchListener(new ViewOnTouchListenerC13234a(this, 11));
        boolean z12 = !interfaceC33208b.a().isEmpty();
        ImageLabelsView imageLabelsView = this.f218055f;
        D6.G(imageLabelsView, z12);
        imageLabelsView.setLabels(interfaceC33208b.a());
        String f218068a = interfaceC33208b.getF218092a();
        PhotoUploaderImage photoUploaderImage = this.f218053d;
        photoUploaderImage.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.g(interfaceC33208b, photoUploaderImage, this, 5));
        photoUploaderImage.setRemoveClickedListener(new a(f218068a));
        photoUploaderImage.setRetryClickedListener(new b(f218068a));
        photoUploaderImage.setErrorClickedListener(new c(interfaceC33208b, photoUploaderImage));
        Uri f218069b = interfaceC33208b.getF218093b();
        if (f218069b == null) {
            photoUploaderImage.setImage(null);
        } else {
            com.bumptech.glide.b.c(photoUploaderImage).l(f218069b).B(new d(photoUploaderImage));
        }
        InterfaceC33208b.InterfaceC6540b f218070c = interfaceC33208b.getF218094c();
        if (f218070c instanceof InterfaceC33208b.InterfaceC6540b.c) {
            photoUploaderImage.n();
        } else if (f218070c instanceof InterfaceC33208b.InterfaceC6540b.C6541b) {
            photoUploaderImage.l((2 & 1) == 0, true);
        } else {
            photoUploaderImage.j();
        }
    }

    @Override // com.avito.android.photo_list_view.InterfaceC33207a
    public final boolean isDraggable() {
        return true;
    }

    /* compiled from: ImageLoadableExtension.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004¸\u0006\u0000"}, d2 = {"DM/l", "Lcom/bumptech/glide/request/target/g;", "Landroid/view/View;", "Landroid/graphics/drawable/Drawable;", "_common_image-loader-glide_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends com.bumptech.glide.request.target.g<View, Drawable> {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC40743a f218062d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(InterfaceC40743a interfaceC40743a) {
            super((View) interfaceC40743a);
            this.f218062d = interfaceC40743a;
        }

        @Override // com.bumptech.glide.request.target.q
        public final void c(Object obj, com.bumptech.glide.request.transition.f fVar) {
            this.f218062d.setImage((Drawable) obj);
        }

        @Override // com.bumptech.glide.request.target.q
        public final void g(@Y61.l Drawable drawable) {
        }
    }
}
