package com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PanelCardItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_card/g;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f313707p = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.f f313708b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f313709c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final CardView f313710d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f313711e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f313712f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f313713g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Badge f313714h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Object f313715i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Object f313716j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Object f313717k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Object f313718l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public PanelCardItem f313719m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.tooltip.k f313720n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Object f313721o;

    /* compiled from: PanelCardItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_card/g$a;", "", "<init>", "()V", "", "BLUE_STYLE_GRADIENT_END_SCALE", "F", "BLUE_STYLE_GRADIENT_ROTATION", "BLUE_STYLE_GRADIENT_START_SCALE", "GREEN_STYLE_GRADIENT_END_SCALE", "GREEN_STYLE_GRADIENT_ROTATION", "GREEN_STYLE_GRADIENT_START_SCALE", "RED_STYLE_GRADIENT_END_SCALE", "RED_STYLE_GRADIENT_ROTATION", "RED_STYLE_GRADIENT_START_SCALE", "VIOLET_STYLE_GRADIENT_END_SCALE", "VIOLET_STYLE_GRADIENT_ROTATION", "VIOLET_STYLE_GRADIENT_START_SCALE", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PanelCardItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[PanelCardItem.Style.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PanelCardItem.Style style = PanelCardItem.Style.f313695b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PanelCardItem.Style style2 = PanelCardItem.Style.f313695b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PanelCardItem.Style style3 = PanelCardItem.Style.f313695b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[PanelCardItem.HyphenationFrequency.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                PanelCardItem.HyphenationFrequency hyphenationFrequency = PanelCardItem.HyphenationFrequency.f313691b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: PanelCardItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/ShapeDrawable;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<ShapeDrawable> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final ShapeDrawable invoke() {
            return g.B80(g.this, PanelCardItem.Style.f313695b);
        }
    }

    /* compiled from: PanelCardItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/ShapeDrawable;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<ShapeDrawable> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final ShapeDrawable invoke() {
            return g.B80(g.this, PanelCardItem.Style.f313698e);
        }
    }

    /* compiled from: PanelCardItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/ShapeDrawable;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<ShapeDrawable> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final ShapeDrawable invoke() {
            return g.B80(g.this, PanelCardItem.Style.f313697d);
        }
    }

    /* compiled from: PanelCardItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/lib/design/tooltip/r$a;", "invoke", "()Lcom/avito/android/lib/design/tooltip/r$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<r.a> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f313725l = new f();

        public f() {
            super(0);
        }

        @Override // Y41.a
        public final r.a invoke() {
            return new r.a(new i.c(new b.c()));
        }
    }

    /* compiled from: PanelCardItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/ShapeDrawable;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.g$g, reason: collision with other inner class name */
    public static final class C9656g extends N implements Y41.a<ShapeDrawable> {
        public C9656g() {
            super(0);
        }

        @Override // Y41.a
        public final ShapeDrawable invoke() {
            return g.B80(g.this, PanelCardItem.Style.f313696c);
        }
    }

    static {
        new a(null);
    }

    public g(@Y61.k View view, @Y61.k com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.f fVar) {
        super(view);
        this.f313708b = fVar;
        this.f313709c = view.getContext();
        this.f313710d = (CardView) view.findViewById(R.id.panel_card_item_card);
        this.f313711e = (TextView) view.findViewById(R.id.panel_card_title);
        this.f313712f = (TextView) view.findViewById(R.id.panel_card_subtitle);
        this.f313713g = (SimpleDraweeView) view.findViewById(R.id.panel_card_icon);
        this.f313714h = (Badge) view.findViewById(R.id.panel_card_item_badge);
        c cVar = new c();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f313715i = C42727D.b(lazyThreadSafetyMode, cVar);
        this.f313716j = C42727D.b(lazyThreadSafetyMode, new C9656g());
        this.f313717k = C42727D.b(lazyThreadSafetyMode, new e());
        this.f313718l = C42727D.b(lazyThreadSafetyMode, new d());
        this.f313721o = C42727D.b(lazyThreadSafetyMode, f.f313725l);
        view.setOnClickListener(new com.avito.android.user_adverts.root_screen.adverts_host.host_view.g(this, 1));
    }

    public static final PaintDrawable B80(g gVar, PanelCardItem.Style style) {
        int[] iArr;
        float f12;
        float[] fArr;
        gVar.getClass();
        PaintDrawable paintDrawable = new PaintDrawable();
        int iOrdinal = style.ordinal();
        Context context = gVar.f313709c;
        if (iOrdinal == 0) {
            iArr = new int[]{context.getColor(R.color.user_adverts_panel_blue_start_color), context.getColor(R.color.user_adverts_panel_blue_end_color)};
        } else if (iOrdinal == 1) {
            iArr = new int[]{context.getColor(R.color.user_adverts_panel_violet_start_color), context.getColor(R.color.user_adverts_panel_violet_end_color)};
        } else if (iOrdinal == 2) {
            iArr = new int[]{context.getColor(R.color.user_adverts_panel_red_start_color), context.getColor(R.color.user_adverts_panel_red_end_color)};
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iArr = new int[]{context.getColor(R.color.user_adverts_panel_green_start_color), context.getColor(R.color.user_adverts_panel_green_end_color)};
        }
        int[] iArr2 = iArr;
        int iOrdinal2 = style.ordinal();
        if (iOrdinal2 == 0) {
            f12 = 170.0f;
        } else if (iOrdinal2 == 1) {
            f12 = 0.0f;
        } else if (iOrdinal2 != 2) {
            if (iOrdinal2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f12 = 0.0f;
        } else {
            f12 = 180.0f;
        }
        float f13 = (f12 / 180.0f) * 3.1415927f;
        int iOrdinal3 = style.ordinal();
        if (iOrdinal3 == 0) {
            fArr = new float[]{-0.55f, 0.92f};
        } else if (iOrdinal3 == 1) {
            fArr = new float[]{0.0f, 1.24f};
        } else {
            if (iOrdinal3 != 2 && iOrdinal3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            fArr = new float[]{0.0f, 1.0f};
        }
        paintDrawable.setShaderFactory(new i(f13, fArr, new Matrix(), f12, iArr2));
        paintDrawable.setShape(new RectShape());
        paintDrawable.setCornerRadius(gVar.f313710d.getRadius());
        return paintDrawable;
    }

    public final void C80() {
        com.avito.android.lib.design.tooltip.k kVar = this.f313720n;
        if (kVar != null) {
            kVar.d(null);
        }
        com.avito.android.lib.design.tooltip.k kVar2 = this.f313720n;
        if (kVar2 != null) {
            kVar2.setOnDismissListener(null);
        }
        com.avito.android.lib.design.tooltip.k kVar3 = this.f313720n;
        if (kVar3 != null) {
            kVar3.dismiss();
        }
        this.f313720n = null;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        C80();
    }
}
