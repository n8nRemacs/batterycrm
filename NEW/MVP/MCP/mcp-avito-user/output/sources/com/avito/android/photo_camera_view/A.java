package com.avito.android.photo_camera_view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.view.TextureView;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.device_orientation.c;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Size;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CameraItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_camera_view/A;", "Lcom/avito/android/photo_camera_view/x;", "Lcom/avito/konveyor/adapter/b;", "_avito_photo-camera-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class A extends com.avito.konveyor.adapter.b implements x {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f216342x = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f216343b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33173d f216344c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextureView f216345d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageButton f216346e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f216347f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ImageView f216348g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ImageButton f216349h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f216350i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final View f216351j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final View f216352k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public View f216353l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final View f216354m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final View f216355n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public View f216356o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public Button f216357p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public View f216358q;

    /* renamed from: r, reason: collision with root package name */
    public final Animation f216359r;

    /* renamed from: s, reason: collision with root package name */
    public final Context f216360s;

    /* renamed from: t, reason: collision with root package name */
    public final int f216361t;

    /* renamed from: u, reason: collision with root package name */
    public final int f216362u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final View f216363v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final TextureView f216364w;

    public A(@Y61.k View view, @Y61.k InterfaceC33173d interfaceC33173d) {
        super(view);
        this.f216343b = view;
        this.f216344c = interfaceC33173d;
        View viewFindViewById = view.findViewById(R.id.preview_surface);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.TextureView");
        }
        TextureView textureView = (TextureView) viewFindViewById;
        this.f216345d = textureView;
        View viewFindViewById2 = view.findViewById(R.id.take_shot_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        ImageButton imageButton = (ImageButton) viewFindViewById2;
        this.f216346e = imageButton;
        View viewFindViewById3 = view.findViewById(R.id.flash_toggle_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f216347f = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.flash_toggle);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById4;
        this.f216348g = imageView;
        View viewFindViewById5 = view.findViewById(R.id.camera_toggle);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        ImageButton imageButton2 = (ImageButton) viewFindViewById5;
        this.f216349h = imageButton2;
        View viewFindViewById6 = view.findViewById(R.id.gallery_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById6;
        this.f216350i = simpleDraweeView;
        View viewFindViewById7 = view.findViewById(R.id.gallery_button_container);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f216351j = viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.placeholders_container);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f216352k = viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.preview_stub);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f216354m = viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.preview_stub_icon);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f216355n = viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.camera_preview_description);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f216359r = AnimationUtils.loadAnimation(view.getContext(), R.anim.camera_blink);
        this.f216360s = view.getContext();
        this.f216361t = C35835l0.d(R.attr.gray8, view.getContext());
        this.f216362u = C35835l0.d(R.attr.white, view.getContext());
        this.f216363v = view.findViewById(R.id.scanner_frame_container);
        imageButton.setOnClickListener(new y(this, 0));
        imageView.setOnClickListener(new y(this, 1));
        imageButton2.setOnClickListener(new y(this, 2));
        simpleDraweeView.setOnClickListener(new y(this, 3));
        this.f216364w = textureView;
    }

    public static void B80(View view, com.avito.android.device_orientation.c cVar, Size size) {
        int iIntValue = ((Integer) view.getTag(R.id.photo_picker_placeholder_real_height_tag)).intValue();
        View viewFindViewById = view.findViewById(R.id.no_camera_image);
        if ((cVar instanceof c.a) || (cVar instanceof c.b)) {
            view.getLayoutParams().height = size.getHeight();
            view.getLayoutParams().width = size.getWidth();
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        } else {
            view.getLayoutParams().height = size.getWidth();
            view.getLayoutParams().width = size.getHeight();
            view.setTranslationX((size.getWidth() - size.getHeight()) / 2);
            view.setTranslationY((size.getHeight() - size.getWidth()) / 2);
        }
        D6.G(viewFindViewById, iIntValue <= view.getLayoutParams().height);
        view.requestLayout();
        D6.A(view, cVar.f139238a);
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void BI() {
        if (this.f216353l == null) {
            View view = this.f216343b;
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.no_camera_placeholder_stub);
            View viewInflate = viewStub != null ? viewStub.inflate() : null;
            this.f216353l = viewInflate;
            if (viewInflate != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                viewInflate.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                viewInflate.setTag(R.id.photo_picker_placeholder_real_height_tag, Integer.valueOf(viewInflate.getMeasuredHeight()));
            }
            View viewFindViewById = view.findViewById(R.id.go_to_gallery_button);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            this.f216358q = viewFindViewById;
            viewFindViewById.setOnClickListener(new y(this, 4));
        }
        D80(false);
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void Bo(boolean z12) {
        D6.G(this.f216354m, z12);
        boolean z13 = !z12;
        C80(z13);
        D6.G(this.f216363v, z13);
    }

    public final void C80(boolean z12) {
        ImageButton imageButton = this.f216346e;
        imageButton.setClickable(z12);
        ImageView imageView = this.f216348g;
        imageView.setClickable(z12);
        ImageButton imageButton2 = this.f216349h;
        imageButton2.setClickable(z12);
        float f12 = z12 ? 1.0f : 0.4f;
        imageButton.setAlpha(f12);
        imageView.setAlpha(f12);
        imageButton2.setAlpha(f12);
    }

    @Override // com.avito.android.photo_camera_view.x
    @Y61.k
    public final u80.c CO() {
        TextureView textureView = this.f216345d;
        return new u80.c(textureView.getWidth(), textureView.getHeight());
    }

    public final void D80(boolean z12) {
        View view = this.f216356o;
        if (view != null) {
            D6.G(view, z12);
        }
        View view2 = this.f216353l;
        if (view2 != null) {
            D6.G(view2, !z12);
        }
        D6.G(this.f216352k, true);
        C80(false);
        D6.w(this.f216363v);
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void E70() {
        K2.d(this.f216343b, true);
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void Iw() {
        this.f216348g.setImageResource(R.drawable.ic_flash_on_black_24);
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void L70(boolean z12) {
        this.f216346e.setClickable(z12);
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void M30() {
        this.f216345d.startAnimation(this.f216359r);
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void Ne() {
        this.f216348g.setImageResource(R.drawable.ic_flash_auto_24);
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void PY(boolean z12) {
        D6.G(this.f216347f, z12);
        D6.G(this.f216346e, z12);
    }

    @Override // com.avito.android.photo_camera_view.x
    @Y61.k
    /* renamed from: Vn, reason: from getter */
    public final TextureView getF216364w() {
        return this.f216364w;
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void Wk(boolean z12) {
        View view = this.f216352k;
        if (z12) {
            view.setBackgroundColor(this.f216361t);
        } else {
            view.setBackgroundColor(this.f216362u);
        }
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void bU(boolean z12) {
        this.f216349h.setClickable(z12);
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void cg(@Y61.k Bitmap bitmap) {
        SimpleDraweeView simpleDraweeView = this.f216350i;
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.f169484b = new ImageRequest.d.a(new BitmapDrawable(this.f216343b.getResources(), bitmap), null);
        aVarA.c();
        D6.H(this.f216351j);
        simpleDraweeView.setClickable(true);
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void jE() {
        this.f216348g.setImageResource(R.drawable.ic_flash_off_24);
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void n40(boolean z12) {
        this.f216348g.setClickable(z12);
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void tL() {
        D6.H(this.f216351j);
        SimpleDraweeView simpleDraweeView = this.f216350i;
        simpleDraweeView.setClickable(true);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.f169484b = new ImageRequest.d.a(this.f216360s.getDrawable(R.drawable.img_gallery_placeholder_48), null);
        aVarA.c();
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void uj() {
        D6.w(this.f216351j);
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void v00(@Y61.k u80.c cVar) {
        float f12 = cVar.f439809a;
        float f13 = cVar.f439810b;
        TextureView textureView = this.f216345d;
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        Matrix matrix = new Matrix();
        matrix.setScale(f12 / width, f13 / height);
        matrix.postTranslate((width - f12) / 2.0f, (height - f13) / 2.0f);
        textureView.setTransform(matrix);
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void w20(@Y61.k com.avito.android.device_orientation.c cVar) {
        int i12 = 21;
        Iterator it = C42745f0.U(this.f216348g, this.f216349h, this.f216350i, this.f216355n).iterator();
        while (it.hasNext()) {
            D6.A((View) it.next(), cVar.f139238a);
        }
        View view = this.f216356o;
        if (view != null) {
            Object tag = view.getTag(R.id.photo_picker_placeholder_size_tag);
            if (tag == null) {
                view.post(new Me.m(view, this, cVar, i12));
            } else {
                B80(view, cVar, (Size) tag);
            }
        }
        View view2 = this.f216353l;
        if (view2 != null) {
            Object tag2 = view2.getTag(R.id.photo_picker_placeholder_size_tag);
            if (tag2 == null) {
                view2.post(new Me.m(view2, this, cVar, i12));
            } else {
                B80(view2, cVar, (Size) tag2);
            }
        }
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void wc(@Y61.k String str) {
        com.avito.android.component.snackbar.h.c(this.f216343b, str, 0, null, null, null, null, 254);
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void yN() {
        if (this.f216356o == null) {
            View view = this.f216343b;
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.no_camera_permission_placeholder_stub);
            View viewInflate = viewStub != null ? viewStub.inflate() : null;
            this.f216356o = viewInflate;
            if (viewInflate != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                viewInflate.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                viewInflate.setTag(R.id.photo_picker_placeholder_real_height_tag, Integer.valueOf(viewInflate.getMeasuredHeight()));
            }
            View viewFindViewById = view.findViewById(R.id.allow_access_btn);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
            }
            Button button = (Button) viewFindViewById;
            this.f216357p = button;
            button.setOnClickListener(new y(this, 5));
        }
        D80(true);
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void yu(@Y61.k String str) {
        Button button = this.f216357p;
        if (button == null) {
            return;
        }
        button.setText(str);
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void z50() {
        D6.w(this.f216352k);
        C80(true);
        D6.G(this.f216363v, true);
    }
}
