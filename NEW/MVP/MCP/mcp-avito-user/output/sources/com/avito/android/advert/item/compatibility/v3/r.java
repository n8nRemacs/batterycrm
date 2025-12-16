package com.avito.android.advert.item.compatibility.v3;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.C29640d;
import com.avito.android.R;
import com.avito.android.advert.item.spare_parts.data.CarCompatibility;
import com.avito.android.advert.item.spare_parts.data.SparePartsGroup;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.v;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: GarageCompatibilityV3View.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v3/r;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/compatibility/v3/q;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class r extends com.avito.konveyor.adapter.b implements q {

    /* renamed from: u, reason: collision with root package name */
    public static final int f74498u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f74499v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f74500w;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f74501b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f74502c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f74503d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.compatibility.v3.b f74504e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f74505f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f74506g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f74507h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f74508i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f74509j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final View f74510k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final ImageView f74511l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final TextView f74512m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f74513n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Button f74514o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Button f74515p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final TextView f74516q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f74517r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final TextView f74518s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final Drawable f74519t;

    /* compiled from: GarageCompatibilityV3View.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v3/r$a;", "", "<init>", "()V", "", "ARROW_INDENT", "I", "ARROW_SIZE", "CAR_PLACEHOLDER_DRAWABLE_RES", "", "NBSP", "Ljava/lang/String;", "SPAN_IMAGE_PLACEHOLDER", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: GarageCompatibilityV3View.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[CarCompatibility.Car.Status.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CarCompatibility.Car.Status status = CarCompatibility.Car.Status.f80417c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CarCompatibility.Car.Status status2 = CarCompatibility.Car.Status.f80417c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: GarageCompatibilityV3View.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ SparePartsGroup f74521m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SparePartsGroup sparePartsGroup) {
            super(0);
            this.f74521m = sparePartsGroup;
        }

        @Override // Y41.a
        public final G0 invoke() {
            r.this.f74504e.h(new com.avito.android.advert.item.compatibility.v3.a(this.f74521m, true));
            return G0.f406611a;
        }
    }

    static {
        new a(null);
        f74498u = R.drawable.ic_garage_compatibility_placeholder;
        f74499v = y6.b(18);
        f74500w = y6.b(3);
    }

    public r(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k com.avito.konveyor.adapter.h hVar, @Y61.k C29640d c29640d, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.advert.item.compatibility.v3.b bVar) {
        super(view);
        this.f74501b = jVar;
        this.f74502c = hVar;
        this.f74503d = aVar;
        this.f74504e = bVar;
        View viewFindViewById = view.findViewById(R.id.loading);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f74505f = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.content);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f74506g = (ConstraintLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.car_compatibility_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f74507h = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.car_compatibility_subtitle);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f74508i = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.car_compatibility_image);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f74509j = (SimpleDraweeView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.foreground_fade);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f74510k = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.car_compatibility_image_corner);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f74511l = (ImageView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.car_compatibility_car_title);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f74512m = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.car_compatibility_car_subtitle);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f74513n = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.button_primary);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f74514o = (Button) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.button_secondary);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f74515p = (Button) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.other_compatibility_title);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById12;
        this.f74516q = textView;
        View viewFindViewById13 = view.findViewById(R.id.other_compatibility_list);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById13;
        this.f74517r = recyclerView;
        View viewFindViewById14 = view.findViewById(R.id.other_compatibility_subtitle);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f74518s = (TextView) viewFindViewById14;
        Drawable drawableA = C43852a.a(textView.getContext(), R.drawable.ic_forward_restyle);
        if (drawableA != null) {
            int i12 = f74499v;
            drawableA.setBounds(0, 0, i12, i12);
        } else {
            drawableA = null;
        }
        this.f74519t = drawableA;
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[41];
        if (!((Boolean) c29640d.f132190O.a().invoke()).booleanValue()) {
            jVar.setHasStableIds(true);
        }
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(jVar);
        recyclerView.setItemAnimator(null);
        recyclerView.setScrollingTouchSlop(1);
        recyclerView.setHasFixedSize(true);
        recyclerView.l(new V4.a(), -1);
    }

    @Override // com.avito.android.advert.item.compatibility.v3.q
    public final void Bf() {
        D6.w(this.f74517r);
    }

    @Override // com.avito.android.advert.item.compatibility.v3.q
    public final void Sx(@Y61.l CarCompatibility.Button button) {
        Button button2 = this.f74515p;
        if (button == null) {
            D6.w(button2);
            return;
        }
        D6.H(button2);
        button2.setText(button.f80411b);
        button2.setOnClickListener(new com.avito.android.advert.closed.b(11, this, button));
    }

    @Override // com.avito.android.advert.item.compatibility.v3.q
    public final void Te(@Y61.l String str) {
        I5.a(this.f74508i, str, false);
    }

    @Override // com.avito.android.advert.item.compatibility.v3.q
    public final void VU(@Y61.l String str, boolean z12, @Y61.k SparePartsGroup sparePartsGroup) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str == null ? "" : str);
        Drawable drawable = this.f74519t;
        if (drawable != null && z12 && str != null && str.length() != 0) {
            spannableStringBuilder = spannableStringBuilder.append((CharSequence) " ").append("_", new com.avito.android.lib.util.a(drawable, f74500w), 33);
        }
        TextView textView = this.f74516q;
        I5.a(textView, spannableStringBuilder, false);
        I5.c(textView, new c(sparePartsGroup));
    }

    @Override // com.avito.android.advert.item.compatibility.v3.q
    public final void c0() {
        D6.H(this.f74505f);
        D6.w(this.f74506g);
    }

    @Override // com.avito.android.advert.item.compatibility.v3.q
    public final void hide() {
        D6.w(this.f74505f);
        D6.w(this.f74506g);
    }

    @Override // com.avito.android.advert.item.compatibility.v3.q
    public final void kA(@Y61.l String str) {
        I5.a(this.f74518s, str, false);
    }

    @Override // com.avito.android.advert.item.compatibility.v3.q
    public final void mL(@Y61.l CarCompatibility.Button button) {
        Button button2 = this.f74514o;
        if (button == null) {
            D6.w(button2);
            return;
        }
        D6.H(button2);
        button2.setText(button.f80411b);
        button2.setOnClickListener(new com.avito.android.advert.closed.b(11, this, button));
    }

    @Override // com.avito.android.advert.item.compatibility.v3.q
    public final void p00(@Y61.l String str) {
        I5.a(this.f74507h, str, false);
    }

    @Override // com.avito.android.advert.item.compatibility.v3.q
    @SuppressLint({"NotifyDataSetChanged"})
    public final void qC(@Y61.k List<? extends com.avito.conveyor_item.a> list) {
        D6.H(this.f74517r);
        this.f74502c.f338510e = new UV0.c(list);
        this.f74501b.notifyDataSetChanged();
    }

    @Override // com.avito.android.advert.item.compatibility.v3.q
    public final void show() {
        D6.H(this.f74506g);
        D6.w(this.f74505f);
    }

    @Override // com.avito.android.advert.item.compatibility.v3.q
    public final void uh(@Y61.k CarCompatibility.Car car) {
        G0 g02;
        Image imageDependsOnThemeOrDefault;
        SimpleDraweeView simpleDraweeView = this.f74509j;
        D6.H(simpleDraweeView);
        v.b(simpleDraweeView, R.dimen.garage_compatibility_item_v3_image_corner_radius);
        v.b(this.f74510k, R.dimen.garage_compatibility_item_v3_image_corner_radius);
        Integer numValueOf = null;
        UniversalImage universalImage = car.f80414c;
        int i12 = f74498u;
        if (universalImage == null || (imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()))) == null) {
            g02 = null;
        } else {
            ImageRequest.a aVar = new ImageRequest.a(new DM.a(simpleDraweeView));
            Drawable drawableA = C43852a.a(simpleDraweeView.getContext(), i12);
            ImageRequest.ScaleType scaleType = ImageRequest.ScaleType.f169473d;
            aVar.f169492j = drawableA;
            aVar.f169493k = scaleType;
            aVar.d(com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault));
            aVar.f169486d = true;
            aVar.f169490h = new s(this);
            aVar.c();
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            simpleDraweeView.setImageResource(i12);
            D6.H(simpleDraweeView);
        }
        CarCompatibility.Car.Status status = car.f80413b;
        if (status == null) {
            com.avito.android.advert.item.spare_parts.data.b.f80451a.getClass();
            status = com.avito.android.advert.item.spare_parts.data.b.f80452b;
        }
        int iOrdinal = status.ordinal();
        if (iOrdinal == 0) {
            numValueOf = Integer.valueOf(R.drawable.ic_garage_compatibility_check);
        } else if (iOrdinal == 1) {
            numValueOf = Integer.valueOf(R.drawable.ic_garage_compatibility_exclamation);
        } else if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        ImageView imageView = this.f74511l;
        if (numValueOf == null) {
            D6.w(imageView);
        } else {
            D6.H(imageView);
            imageView.setImageResource(numValueOf.intValue());
        }
        I5.a(this.f74512m, car.f80415d, false);
        I5.a(this.f74513n, car.f80416e, false);
    }

    @Override // com.avito.android.advert.item.compatibility.v3.q
    public final void yx() {
        D6.w(this.f74510k);
        D6.w(this.f74509j);
        D6.w(this.f74511l);
        D6.w(this.f74512m);
        D6.w(this.f74513n);
    }
}
