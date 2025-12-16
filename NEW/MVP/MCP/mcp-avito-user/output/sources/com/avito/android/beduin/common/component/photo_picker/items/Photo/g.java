package com.avito.android.beduin.common.component.photo_picker.items.Photo;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.photo_picker.BeduinPhotoPickerModel;
import com.avito.android.image_loader.fresco.s;
import com.avito.android.lib.design.photo_uploader_image.PhotoUploaderImage;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/items/Photo/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/beduin/common/component/photo_picker/items/Photo/h;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f101999f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f102000b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PhotoUploaderImage f102001c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageButton f102002d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f102003e;

    /* compiled from: PhotoItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Boolean> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            D6.m(g.this.f102002d, y6.b(8));
            return Boolean.TRUE;
        }
    }

    /* compiled from: PhotoItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102005a;

        static {
            int[] iArr = new int[BeduinPhotoPickerModel.ActionType.values().length];
            try {
                iArr[BeduinPhotoPickerModel.ActionType.EDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinPhotoPickerModel.ActionType.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinPhotoPickerModel.ActionType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f102005a = iArr;
        }
    }

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f102006b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f102007c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.beduin.common.component.photo_picker.items.Photo.a f102008d;

        public c(View view, g gVar, com.avito.android.beduin.common.component.photo_picker.items.Photo.a aVar) {
            this.f102006b = view;
            this.f102007c = gVar;
            this.f102008d = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            int i22 = g.f101999f;
            this.f102007c.C80(this.f102008d);
            this.f102006b.removeOnLayoutChangeListener(this);
        }
    }

    /* compiled from: PhotoItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f102009l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a<G0> aVar) {
            super(0);
            this.f102009l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f102009l.invoke();
            return G0.f406611a;
        }
    }

    public g(@k View view) {
        super(view);
        this.f102000b = view;
        this.f102001c = (PhotoUploaderImage) view.findViewById(R.id.photo_picker_image);
        this.f102002d = (ImageButton) view.findViewById(R.id.control_image_button);
        this.f102003e = (TextView) view.findViewById(R.id.error_message);
        D6.C(new a(), view);
    }

    public final void B80(Image image) {
        PhotoUploaderImage photoUploaderImage = this.f102001c;
        s.c(photoUploaderImage, C35829k2.c(image, photoUploaderImage, 2, 22).d(), true, null, null);
    }

    public final void C80(com.avito.android.beduin.common.component.photo_picker.items.Photo.a aVar) {
        Image urls;
        Image image = aVar.f101986b.f101920b;
        if (image != null) {
            B80(image);
        }
        BeduinPhotoPickerModel.PhotoPickerImage photoPickerImage = aVar.f101986b;
        UniversalImage universalImage = photoPickerImage.getUniversalImage();
        if (universalImage == null || (urls = com.avito.android.advert.item.delivery_suggests.l.g(this.f102000b, universalImage)) == null) {
            urls = photoPickerImage.getUrls();
        }
        B80(urls);
    }

    @Override // com.avito.android.beduin.common.component.photo_picker.items.Photo.h
    public final void K8(@k Y41.a<G0> aVar) {
        this.f102001c.setErrorClickedListener(new d(aVar));
    }

    @Override // com.avito.android.beduin.common.component.photo_picker.items.Photo.h
    public final void Vy(@l Y41.a<G0> aVar) {
        this.f102001c.setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(24, aVar));
    }

    @Override // com.avito.android.beduin.common.component.photo_picker.items.Photo.h
    public final void a0(@l Y41.a<G0> aVar) {
        this.f102002d.setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(25, aVar));
    }

    @Override // com.avito.android.beduin.common.component.photo_picker.items.Photo.h
    public final void rV(@k com.avito.android.beduin.common.component.photo_picker.items.Photo.a aVar) throws Resources.NotFoundException {
        Integer numValueOf;
        PhotoUploaderImage photoUploaderImage = this.f102001c;
        s.c(photoUploaderImage, null, true, null, null);
        BeduinPhotoPickerModel.PhotoPickerImage photoPickerImage = aVar.f101986b;
        if (!photoPickerImage.f101923e) {
            if (D6.x(photoUploaderImage)) {
                C80(aVar);
            } else {
                photoUploaderImage.addOnLayoutChangeListener(new c(photoUploaderImage, this, aVar));
            }
        }
        boolean z12 = aVar.f101987c;
        ImageButton imageButton = this.f102002d;
        if (z12) {
            D6.w(imageButton);
        } else {
            BeduinPhotoPickerModel.ControlButton controlButton = photoPickerImage.getControlButton();
            BeduinPhotoPickerModel.ActionType actionType = controlButton != null ? controlButton.getActionType() : null;
            int i12 = actionType == null ? -1 : b.f102005a[actionType.ordinal()];
            if (i12 == -1 || i12 == 1) {
                numValueOf = Integer.valueOf(R.attr.ic_edit16);
            } else if (i12 == 2) {
                numValueOf = Integer.valueOf(R.attr.ic_delete16);
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                numValueOf = null;
            }
            if (numValueOf != null) {
                D6.H(imageButton);
                imageButton.setImageDrawable(C35835l0.h(numValueOf.intValue(), this.itemView.getContext()));
            } else {
                D6.w(imageButton);
            }
            if (controlButton == null) {
                imageButton.setClickable(false);
                imageButton.setFocusable(false);
            } else {
                imageButton.setClickable(true);
                imageButton.setFocusable(true);
            }
        }
        BeduinPhotoPickerModel.ErrorState errorState = photoPickerImage.f101924f;
        I5.a(this.f102003e, errorState != null ? errorState.f101919c : null, false);
        Parcelable parcelable = photoPickerImage.f101922d;
        if (parcelable == null) {
            parcelable = BeduinPhotoPickerModel.PhotoPickerImage.LoadingState.Loaded.f101927b;
        }
        boolean z13 = parcelable instanceof BeduinPhotoPickerModel.PhotoPickerImage.LoadingState.Loading;
        boolean z14 = photoPickerImage.f101923e;
        int i13 = R.style.BeduinPhotoUploaderImageRemoving;
        if (z13) {
            if (!z14) {
                i13 = R.style.BeduinPhotoUploaderImageAdding;
            }
            photoUploaderImage.setAppearance(i13);
            photoUploaderImage.n();
        } else if (parcelable instanceof BeduinPhotoPickerModel.PhotoPickerImage.LoadingState.Error) {
            if (((BeduinPhotoPickerModel.PhotoPickerImage.LoadingState.Error) parcelable).f101926b) {
                if (!z14) {
                    i13 = R.style.BeduinPhotoUploaderImageAdding;
                }
                photoUploaderImage.setAppearance(i13);
                photoUploaderImage.l((2 & 1) == 0, true);
            } else {
                photoUploaderImage.setAppearance(R.style.BeduinPhotoUploaderImageError);
                photoUploaderImage.l(true, false);
            }
        } else {
            if (!(parcelable instanceof BeduinPhotoPickerModel.PhotoPickerImage.LoadingState.Loaded)) {
                throw new NoWhenBranchMatchedException();
            }
            photoUploaderImage.j();
        }
        G0 g02 = G0.f406611a;
    }
}
