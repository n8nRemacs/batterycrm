package com.avito.android.personal_selections.view;

import Y61.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.p;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: PersonalSelectionsItemViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/personal_selections/view/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/personal_selections/view/h;", "a", "_avito_personal-selections_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f215850k = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f215851b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LayoutInflater f215852c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayout f215853d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f215854e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f215855f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f215856g;

    /* renamed from: h, reason: collision with root package name */
    public final int f215857h;

    /* renamed from: i, reason: collision with root package name */
    public final int f215858i;

    /* renamed from: j, reason: collision with root package name */
    public final int f215859j;

    /* compiled from: PersonalSelectionsItemViewImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/personal_selections/view/i$a;", "", "<init>", "()V", "", "IMAGES_CONTAINER_TAG", "Ljava/lang/String;", "", "IMAGES_OFFSET", "I", "IMAGE_BG_SIZE", "_avito_personal-selections_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public i(@k View view) {
        super(view);
        Context context = view.getContext();
        this.f215851b = context;
        this.f215852c = LayoutInflater.from(context);
        View viewFindViewById = view.findViewById(R.id.personal_selections_item_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f215853d = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f215854e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f215855f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.text_icon);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f215856g = (TextView) viewFindViewById4;
        this.f215857h = y6.b(10);
        this.f215858i = y6.b(8);
        this.f215859j = y6.b(9);
    }

    @Override // com.avito.android.personal_selections.view.h
    public final void K5(@k List<String> list) {
        LinearLayout linearLayout = this.f215853d;
        linearLayout.removeView((FrameLayout) linearLayout.findViewWithTag("images_container_tag"));
        int size = list.size();
        Context context = this.f215851b;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setTag("images_container_tag");
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(y6.b(((size - 1) * 20) + 38), -2));
        Integer numValueOf = Integer.valueOf(this.f215857h);
        int i12 = this.f215859j;
        D6.d(frameLayout, numValueOf, Integer.valueOf(i12), Integer.valueOf(this.f215858i), Integer.valueOf(i12));
        Drawable drawableA = C43852a.a(context, R.drawable.placeholders_selection_item_no_image);
        boolean z12 = false;
        int i13 = 0;
        for (Object obj : C42745f0.q0(list)) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            String str = (String) obj;
            View viewInflate = this.f215852c.inflate(R.layout.personal_selections_image, frameLayout, z12);
            View viewFindViewById = viewInflate.findViewById(R.id.bottom_image);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            ImageView imageView = (ImageView) viewFindViewById;
            View viewFindViewById2 = viewInflate.findViewById(R.id.upper_overlay);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            View viewFindViewById3 = viewInflate.findViewById(R.id.upper_icon);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            ImageView imageView2 = (ImageView) viewFindViewById3;
            ImageRequest.a aVar = new ImageRequest.a(new DM.a(imageView));
            aVar.f169492j = drawableA;
            aVar.f169493k = null;
            aVar.d(new p(Uri.parse(str)));
            aVar.f169486d = true;
            aVar.e(y6.b(8));
            aVar.c();
            if (i13 != list.size() - 1 || list.size() <= 1) {
                viewInflate.setTranslationX(y6.b(((list.size() - 1) - i13) * 20));
            } else {
                D6.H(viewFindViewById2);
                D6.H(imageView2);
            }
            frameLayout.addView(viewInflate);
            i13 = i14;
            z12 = false;
        }
        linearLayout.addView(frameLayout, z12 ? 1 : 0);
    }

    @Override // com.avito.android.personal_selections.view.h
    public final void X(@k Y41.a<G0> aVar) {
        this.f215853d.setOnClickListener(new com.avito.android.mortgage.root.list.items.legacy_status.i(18, aVar));
    }

    @Override // com.avito.android.personal_selections.view.h
    public final void iy(@k String str, @k String str2) {
        this.f215854e.setText(str);
        this.f215855f.setText(str2);
    }

    @Override // com.avito.android.personal_selections.view.h
    public final void zf() {
        FV.a.f4720a.getClass();
        FV.a.c(this.f215856g, R.attr.textIconArrowForwardIos);
    }
}
