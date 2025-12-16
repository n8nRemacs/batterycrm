package com.avito.android.imv_services_dialog;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import Y41.l;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.avito.android.R;
import com.avito.android.remote.model.imv_services.ImvServicesPriceRangeType;
import j.D;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ImvServicesBottomDialog.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_services_dialog/b;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_imv-services-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: T, reason: collision with root package name */
    public static final /* synthetic */ int f170751T = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final l<Integer, G0> f170752E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final l<Integer, G0> f170753F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f170754G;

    /* renamed from: H, reason: collision with root package name */
    public final LayoutInflater f170755H;

    /* renamed from: I, reason: collision with root package name */
    public final TextView f170756I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f170757J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f170758K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f170759L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f170760M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f170761N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f170762O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f170763P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f170764Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f170765R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f170766S;

    /* compiled from: ImvServicesBottomDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f170767a;

        static {
            int[] iArr = new int[ImvServicesPriceRangeType.values().length];
            try {
                iArr[ImvServicesPriceRangeType.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImvServicesPriceRangeType.GOOD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImvServicesPriceRangeType.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f170767a = iArr;
        }
    }

    /* compiled from: ImvServicesBottomDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/FrameLayout;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.imv_services_dialog.b$b, reason: collision with other inner class name */
    public static final class C5053b extends N implements Y41.a<FrameLayout> {
        public C5053b() {
            super(0);
        }

        @Override // Y41.a
        public final FrameLayout invoke() {
            return (FrameLayout) b.this.findViewById(R.id.imv_services_dialog_chart_container);
        }
    }

    /* compiled from: ImvServicesBottomDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<TextView> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            return (TextView) b.this.findViewById(R.id.imv_services_dialog_poll_answered);
        }
    }

    /* compiled from: ImvServicesBottomDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/constraintlayout/widget/Group;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<Group> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Group invoke() {
            return (Group) b.this.findViewById(R.id.imv_services_dialog_poll_buttons_group);
        }
    }

    /* compiled from: ImvServicesBottomDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<TextView> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            return (TextView) b.this.findViewById(R.id.imv_services_dialog_poll_negative);
        }
    }

    /* compiled from: ImvServicesBottomDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.a<TextView> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            return (TextView) b.this.findViewById(R.id.imv_services_dialog_poll_positive);
        }
    }

    /* compiled from: ImvServicesBottomDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements Y41.a<TextView> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            return (TextView) b.this.findViewById(R.id.imv_services_dialog_poll_title);
        }
    }

    /* compiled from: ImvServicesBottomDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends N implements Y41.a<TextView> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            return (TextView) b.this.findViewById(R.id.imv_services_dialog_header);
        }
    }

    /* compiled from: ImvServicesBottomDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class i extends N implements Y41.a<TextView> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            return (TextView) b.this.findViewById(R.id.imv_services_dialog_hint);
        }
    }

    /* compiled from: ImvServicesBottomDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class j extends N implements Y41.a<LinearLayout> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final LinearLayout invoke() {
            return (LinearLayout) b.this.findViewById(R.id.imv_services_dialog_options_container);
        }
    }

    /* compiled from: ImvServicesBottomDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class k extends N implements Y41.a<TextView> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            return (TextView) b.this.findViewById(R.id.imv_services_dialog_title);
        }
    }

    public /* synthetic */ b(Context context, int i12, l lVar, l lVar2, Y41.a aVar, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? 0 : i12, lVar, lVar2, aVar);
    }

    public static void V(ConstraintLayout constraintLayout, @D int i12, Float f12) {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.g(constraintLayout);
        dVar.y(f12 != null ? f12.floatValue() : 0.0f, i12);
        dVar.c(constraintLayout);
    }

    public final FrameLayout W() {
        return (FrameLayout) this.f170761N.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@Y61.k Context context, int i12, @Y61.k l<? super Integer, G0> lVar, @Y61.k l<? super Integer, G0> lVar2, @Y61.k Y41.a<G0> aVar) {
        super(context, i12);
        this.f170752E = lVar;
        this.f170753F = lVar2;
        this.f170754G = aVar;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f170755H = layoutInflaterFrom;
        this.f170757J = C42727D.c(new h());
        this.f170758K = C42727D.c(new k());
        this.f170759L = C42727D.c(new i());
        this.f170760M = C42727D.c(new j());
        this.f170761N = C42727D.c(new C5053b());
        this.f170762O = C42727D.c(new g());
        this.f170763P = C42727D.c(new f());
        this.f170764Q = C42727D.c(new e());
        this.f170765R = C42727D.c(new d());
        this.f170766S = C42727D.c(new c());
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 7);
        setContentView(R.layout.dialog_fragment_imv_services);
        View viewInflate = layoutInflaterFrom.inflate(R.layout.imv_services_dialog_bottom_sheet_header_layout, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.bottom_sheet_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f170756I = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.close_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ((ImageView) viewFindViewById2).setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 29));
        H(viewInflate);
        setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(this, 20));
    }
}
