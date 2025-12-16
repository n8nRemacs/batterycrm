package com.avito.android.publish.scanner_v2;

import Ae0.ViewOnClickListenerC13025a;
import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.core.view.C22823h0;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.photo_camera_view.InterfaceC33173d;
import com.avito.android.publish.scanner_v2.ScannerOverlay;
import com.avito.android.publish.scanner_v2.a;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ScannerCameraView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/scanner_v2/c;", "Lcom/avito/android/publish/scanner_v2/b;", "Lcom/avito/android/publish/scanner_v2/ScannerOverlay$a;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements com.avito.android.publish.scanner_v2.b, ScannerOverlay.a {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f239339z = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f239340b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC33173d f239341c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ScannerOverlay f239342d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f239343e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View f239344f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final View f239345g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f239346h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final View f239347i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f239348j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final Button f239349k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final SimpleDraweeView f239350l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final View f239351m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final SimpleDraweeView f239352n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final ViewGroup f239353o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final TextView f239354p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final TextView f239355q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final Button f239356r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final ViewGroup f239357s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final TextView f239358t;

    /* renamed from: u, reason: collision with root package name */
    @k
    public final Button f239359u;

    /* renamed from: v, reason: collision with root package name */
    @k
    public final Button f239360v;

    /* renamed from: w, reason: collision with root package name */
    @k
    public final TextureView f239361w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f239362x;

    /* renamed from: y, reason: collision with root package name */
    @l
    public Y41.l<? super Boolean, G0> f239363y;

    /* compiled from: ScannerCameraView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/publish/scanner_v2/c$a;", "", "<init>", "()V", "", "BOTTOM_CONSTANT_MARGIN", "I", "COLLAPSED_DESCRIPTION_MARGIN", "TOP_SAFE_AREA", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ScannerCameraView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[ScannerOverlay.ControllerType.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ScannerOverlay.ControllerType controllerType = ScannerOverlay.ControllerType.f239315b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/u0", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.scanner_v2.c$c, reason: collision with other inner class name */
    public static final class ViewOnLayoutChangeListenerC7197c implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC7197c() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            view.removeOnLayoutChangeListener(this);
            c cVar = c.this;
            D6.w(cVar.f239351m);
            D6.H(cVar.f239350l);
            D6.H(cVar.f239348j);
        }
    }

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/u0", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements View.OnLayoutChangeListener {
        public d() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            view.removeOnLayoutChangeListener(this);
            c cVar = c.this;
            D6.w(cVar.f239348j);
            D6.w(cVar.f239350l);
            D6.H(cVar.f239351m);
        }
    }

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/u0", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements View.OnLayoutChangeListener {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a.C7196a f239367c;

        public e(a.C7196a c7196a) {
            this.f239367c = c7196a;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            view.removeOnLayoutChangeListener(this);
            c cVar = c.this;
            int bottom = cVar.f239346h.getBottom();
            a.C7196a c7196a = this.f239367c;
            if (bottom > c7196a.f239320a) {
                TextView textView = cVar.f239346h;
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int iB2 = ((y6.b(24) + c7196a.f239320a) - y6.b(48)) - c7196a.f239324e;
                int i22 = c7196a.f239322c;
                marginLayoutParams.setMargins(i22, iB2, i22, marginLayoutParams.bottomMargin);
                textView.setLayoutParams(marginLayoutParams);
            }
        }
    }

    static {
        new a(null);
    }

    public c(@k View view, @k InterfaceC33173d interfaceC33173d) {
        this.f239340b = view;
        this.f239341c = interfaceC33173d;
        View viewFindViewById = view.findViewById(R.id.scanner_overlay);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.publish.scanner_v2.ScannerOverlay");
        }
        ScannerOverlay scannerOverlay = (ScannerOverlay) viewFindViewById;
        this.f239342d = scannerOverlay;
        View viewFindViewById2 = view.findViewById(R.id.self_input_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f239343e = (Button) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.close_and_save);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f239344f = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.back_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f239345g = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.scanner_description);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f239346h = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.help_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f239347i = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.scanner_help_text);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f239348j = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.camera_shot_button);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById8;
        this.f239349k = button;
        View viewFindViewById9 = view.findViewById(R.id.gallery_button);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById9;
        this.f239350l = simpleDraweeView;
        View viewFindViewById10 = view.findViewById(R.id.minified_gallery_button);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f239351m = viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.preview_image);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f239352n = (SimpleDraweeView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.scanner_permission_placeholder);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f239353o = (ViewGroup) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.permission_title);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f239354p = (TextView) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.permission_description);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f239355q = (TextView) viewFindViewById14;
        View viewFindViewById15 = view.findViewById(R.id.permission_open_button);
        if (viewFindViewById15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button2 = (Button) viewFindViewById15;
        this.f239356r = button2;
        View viewFindViewById16 = view.findViewById(R.id.scanner_error_overlay);
        if (viewFindViewById16 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f239357s = (ViewGroup) viewFindViewById16;
        View viewFindViewById17 = view.findViewById(R.id.error_message);
        if (viewFindViewById17 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f239358t = (TextView) viewFindViewById17;
        View viewFindViewById18 = view.findViewById(R.id.instruction_button);
        if (viewFindViewById18 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f239359u = (Button) viewFindViewById18;
        View viewFindViewById19 = view.findViewById(R.id.retry_button);
        if (viewFindViewById19 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f239360v = (Button) viewFindViewById19;
        View viewFindViewById20 = view.findViewById(R.id.preview_surface);
        if (viewFindViewById20 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.TextureView");
        }
        this.f239361w = (TextureView) viewFindViewById20;
        button.setOnClickListener(new ViewOnClickListenerC13025a(this, 1));
        simpleDraweeView.setOnClickListener(new ViewOnClickListenerC13025a(this, 2));
        viewFindViewById10.setOnClickListener(new ViewOnClickListenerC13025a(this, 3));
        button2.setOnClickListener(new ViewOnClickListenerC13025a(this, 4));
        scannerOverlay.setCalculatePaddingListener(this);
        C22823h0.K(view, new Ae0.c(this, 0));
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void Bo(boolean z12) {
        Y41.l<? super Boolean, G0> lVar = this.f239363y;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z12));
        }
    }

    @Override // com.avito.android.photo_camera_view.x
    @k
    public final u80.c CO() {
        TextureView textureView = this.f239361w;
        return new u80.c(textureView.getWidth(), textureView.getHeight());
    }

    public final void D0() {
        D6.w(this.f239353o);
        D6.H(this.f239361w);
        D6.H(this.f239349k);
        D6.H(this.f239342d);
        D6.H(this.f239346h);
        D6.H(this.f239347i);
        if (this.f239362x) {
            D6.H(this.f239351m);
        } else {
            D6.H(this.f239348j);
            D6.H(this.f239350l);
        }
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void L70(boolean z12) {
        this.f239349k.setEnabled(z12);
    }

    @Override // com.avito.android.photo_camera_view.x
    @k
    /* renamed from: Vn, reason: from getter */
    public final TextureView getF239361w() {
        return this.f239361w;
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void cg(@k Bitmap bitmap) {
        if (this.f239362x) {
            return;
        }
        SimpleDraweeView simpleDraweeView = this.f239350l;
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.f169484b = new ImageRequest.d.a(new BitmapDrawable(this.f239340b.getResources(), bitmap), null);
        aVarA.c();
        D6.H(simpleDraweeView);
        simpleDraweeView.setClickable(true);
    }

    @Override // com.avito.android.publish.scanner_v2.ScannerOverlay.a
    public final void e0(@k ScannerOverlay.ControllerType controllerType, @k a.C7196a c7196a) {
        int iOrdinal = controllerType.ordinal();
        View view = this.f239340b;
        if (iOrdinal == 0) {
            this.f239362x = true;
            view.addOnLayoutChangeListener(new d());
        } else if (iOrdinal == 1) {
            this.f239362x = false;
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC7197c());
        }
        view.addOnLayoutChangeListener(new e(c7196a));
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void tL() {
        D6.w(this.f239350l);
        D6.w(this.f239351m);
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void uj() {
        D6.w(this.f239350l);
        D6.w(this.f239351m);
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void yu(@k String str) {
        Button button = this.f239356r;
        button.setText(str);
        button.setOnClickListener(new ViewOnClickListenerC13025a(this, 0));
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void z50() {
        D0();
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void BI() {
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void E70() {
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void Iw() {
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void M30() {
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void Ne() {
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void jE() {
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void yN() {
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void PY(boolean z12) {
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void Wk(boolean z12) {
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void bU(boolean z12) {
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void n40(boolean z12) {
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void v00(@k u80.c cVar) {
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void w20(@k com.avito.android.device_orientation.c cVar) {
    }

    @Override // com.avito.android.photo_camera_view.x
    public final void wc(@k String str) {
    }
}
