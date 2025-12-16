package com.avito.android.advert_multi_items.param_images.modification_image;

import Qa.InterfaceC14873a;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.C22767g;
import com.avito.android.R;
import com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g;
import com.avito.android.advert_multi_items.model.ImageDisplayMode;
import com.avito.android.advert_multi_items.model.ModificationViewState;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.i;
import com.avito.android.lib.util.v;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import m.C43852a;
import sK0.C48063a;

/* compiled from: ModificationImageView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_multi_items/param_images/modification_image/c;", "Lcom/avito/android/advert_multi_items/param_images/modification_image/b;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_advert-multi-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c extends com.avito.konveyor.adapter.b implements com.avito.android.advert_multi_items.param_images.modification_image.b {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f85963i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC14873a f85964b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f85965c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f85966d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View f85967e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SimpleDraweeView f85968f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SimpleDraweeView f85969g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final View f85970h;

    /* compiled from: ModificationImageView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert_multi_items/param_images/modification_image/c$a;", "", "<init>", "()V", "", "MAX_LIGHTNESS_DIFF", "D", "_avito_advert-multi-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ModificationImageView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[ImageDisplayMode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ImageDisplayMode imageDisplayMode = ImageDisplayMode.f85892b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ModificationViewState.values().length];
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ModificationViewState modificationViewState = ModificationViewState.f85896b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ModificationViewState modificationViewState2 = ModificationViewState.f85896b;
                iArr2[0] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        new a(null);
    }

    public c(@k InterfaceC14873a interfaceC14873a, @k View view) {
        super(view);
        this.f85964b = interfaceC14873a;
        this.f85965c = view.getContext();
        this.f85966d = view.findViewById(R.id.image_container);
        View viewFindViewById = view.findViewById(R.id.placeholder);
        this.f85967e = viewFindViewById;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.simple_drawee_view);
        this.f85968f = simpleDraweeView;
        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) view.findViewById(R.id.material_drawee_view);
        this.f85969g = simpleDraweeView2;
        View viewFindViewById2 = view.findViewById(R.id.foreground_fade);
        this.f85970h = viewFindViewById2;
        v.b(simpleDraweeView, R.dimen.multi_item_image_corner_radius);
        v.b(simpleDraweeView2, R.dimen.multi_item_image_corner_radius);
        v.b(viewFindViewById2, R.dimen.multi_item_image_corner_radius);
        v.b(viewFindViewById, R.dimen.multi_item_image_corner_radius);
    }

    @InterfaceC42165v
    public final int B80(boolean z12) {
        View view = this.f85966d;
        if (z12) {
            int iB2 = y6.b(0);
            view.setPadding(iB2, iB2, iB2, iB2);
            return R.drawable.fg_multi_item_image_selected;
        }
        int iB3 = y6.b(1);
        view.setPadding(iB3, iB3, iB3, iB3);
        return R.drawable.fg_multi_item_image_not_selected;
    }

    public final void C80(ModificationImageItem modificationImageItem) {
        ImageRequest.a aVarA = C35949t5.a(this.f85968f);
        aVarA.f169492j = null;
        aVarA.f169493k = null;
        aVarA.d(com.avito.android.image_loader.b.b(modificationImageItem.f85956f));
        aVarA.f169490h = new C2564c(modificationImageItem);
        aVarA.c();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        C35949t5.a(this.f85968f).b();
        C35949t5.a(this.f85969g).b();
    }

    @Override // com.avito.konveyor.util.d
    public final void kD(TV0.a aVar) {
        int iB2;
        int iB80;
        float f12;
        ModificationImageItem modificationImageItem = (ModificationImageItem) aVar;
        View view = this.f85966d;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int iOrdinal = modificationImageItem.f85955e.ordinal();
        if (iOrdinal == 0) {
            iB2 = y6.b(46);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            iB2 = y6.b(61);
        }
        layoutParams.height = iB2;
        view.setLayoutParams(layoutParams);
        ModificationViewState modificationViewState = ModificationViewState.f85897c;
        ModificationViewState modificationViewState2 = modificationImageItem.f85954d;
        boolean z12 = modificationViewState2 == modificationViewState;
        Context context = this.f85965c;
        int iD2 = C35835l0.d(R.attr.white, context);
        C48063a c48063a = C48063a.f437606a;
        UniversalColor universalColor = modificationImageItem.f85957g;
        int iA2 = c48063a.a(context, universalColor);
        float[] fArr = new float[3];
        C22767g.a(Color.red(iA2), Color.green(iA2), Color.blue(iA2), fArr);
        float f13 = fArr[2];
        float[] fArr2 = new float[3];
        C22767g.a(Color.red(iD2), Color.green(iD2), Color.blue(iD2), fArr2);
        boolean z13 = ((double) Math.abs(f13 - fArr2[2])) < 0.07d;
        view.setSelected(modificationViewState2 == modificationViewState);
        if (z13) {
            int iB3 = y6.b(0);
            view.setPadding(iB3, iB3, iB3, iB3);
            iB80 = z12 ? R.drawable.fg_multi_item_image_selected_extra_stroke : R.drawable.fg_multi_item_image_not_selected_extra_stroke;
        } else {
            iB80 = B80(z12);
        }
        view.setForeground(C43852a.a(context, iB80));
        view.setOnClickListener(new g(27, modificationImageItem, this));
        int iA3 = c48063a.a(context, universalColor);
        View view2 = this.f85967e;
        view2.setBackgroundColor(iA3);
        view2.setVisibility(0);
        this.f85970h.setVisibility(8);
        int iOrdinal2 = modificationViewState2.ordinal();
        if (iOrdinal2 == 0 || iOrdinal2 == 1) {
            f12 = 1.0f;
        } else {
            if (iOrdinal2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f12 = 0.3f;
        }
        view2.setAlpha(f12);
        this.f85968f.setAlpha(f12);
        SimpleDraweeView simpleDraweeView = this.f85969g;
        simpleDraweeView.setAlpha(f12);
        Image image = modificationImageItem.f85958h;
        if (image == null || image.isEmpty()) {
            C80(modificationImageItem);
            return;
        }
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.f169492j = null;
        aVarA.f169493k = null;
        aVarA.d(com.avito.android.image_loader.b.b(image));
        aVarA.f169490h = new d(this, modificationImageItem, modificationImageItem);
        aVarA.c();
    }

    /* compiled from: ImageRequests.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/h2", "Lcom/avito/android/image_loader/i;", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert_multi_items.param_images.modification_image.c$c, reason: collision with other inner class name */
    public static final class C2564c implements i {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ModificationImageItem f85972c;

        public C2564c(ModificationImageItem modificationImageItem) {
            this.f85972c = modificationImageItem;
        }

        @Override // com.avito.android.image_loader.i
        public final void H(int i12, int i13) {
            c cVar = c.this;
            cVar.f85966d.setForeground(C43852a.a(cVar.f85965c, cVar.B80(this.f85972c.f85954d == ModificationViewState.f85897c)));
            cVar.f85967e.setVisibility(8);
            cVar.f85969g.setVisibility(8);
            cVar.f85970h.setVisibility(0);
        }

        @Override // com.avito.android.image_loader.i
        public final void S2() {
        }

        @Override // com.avito.android.image_loader.i
        public final void b2(@l Throwable th2) {
        }
    }
}
