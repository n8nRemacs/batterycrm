package com.avito.android.service_booking_details;

import Bt0.InterfaceC13184a;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.lib.design.button.Button;
import com.avito.android.service_booking.api.remote.model.details.ServiceBookingItemDetailsResult;
import com.avito.android.service_booking_details.ToastConfig;
import com.avito.android.util.C35835l0;
import com.avito.android.util.R0;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: ServiceBookingItemDetailsView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_details/p;", "Lcom/avito/android/deep_linking/links/w;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p implements w {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f277459b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f277460c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f277461d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f277462e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_utils.ux_feedback.a f277463f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f277464g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f277465h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Toolbar f277466i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final View f277467j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Button f277468k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Button f277469l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Button f277470m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f277471n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f277472o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final C42670a f277473p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super InterfaceC13184a, G0> f277474q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final C43238h f277475r;

    /* compiled from: ServiceBookingItemDetailsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<View> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            return p.this.f277464g;
        }
    }

    /* compiled from: ServiceBookingItemDetailsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f277477a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f277478b;

        static {
            int[] iArr = new int[ToastConfig.ToastAnchor.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ToastConfig.ToastAnchor[] toastAnchorArr = ToastConfig.ToastAnchor.f277210b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ServiceBookingItemDetailsResult.ServiceBookingItemDetailsAction.ActionType.values().length];
            try {
                iArr2[ServiceBookingItemDetailsResult.ServiceBookingItemDetailsAction.ActionType.CONFIRM.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ServiceBookingItemDetailsResult.ServiceBookingItemDetailsAction.ActionType.EDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ServiceBookingItemDetailsResult.ServiceBookingItemDetailsAction.ActionType.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f277477a = iArr2;
            int[] iArr3 = new int[ServiceBookingItemDetailsResult.ServiceBookingItemDetailsAction.ButtonType.values().length];
            try {
                iArr3[ServiceBookingItemDetailsResult.ServiceBookingItemDetailsAction.ButtonType.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[ServiceBookingItemDetailsResult.ServiceBookingItemDetailsAction.ButtonType.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f277478b = iArr3;
        }
    }

    public p(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.android.util.text.a aVar2, @Y61.k R0 r02, @Y61.k j jVar2, @Y61.k com.avito.android.service_booking_utils.ux_feedback.a aVar3) {
        this.f277459b = view;
        this.f277460c = aVar;
        this.f277461d = aVar2;
        this.f277462e = r02;
        this.f277463f = aVar3;
        View viewFindViewById = view.findViewById(R.id.recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f277464g = recyclerView;
        View viewFindViewById2 = view.findViewById(R.id.service_booking_details_content);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.buttons_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f277465h = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.toolbar);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById4;
        this.f277466i = toolbar;
        View viewFindViewById5 = view.findViewById(R.id.button_spacer);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f277467j = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.confirm_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f277468k = (Button) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.cancel_button);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f277469l = (Button) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.edit_button);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f277470m = (Button) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.disclaimer);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById9;
        this.f277471n = textView;
        View viewFindViewById10 = view.findViewById(R.id.buttons_actions_container);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f277472o = (LinearLayout) viewFindViewById10;
        this.f277475r = U.a(CoroutineContext.Element.DefaultImpls.plus(Q0.a(), r02.b()));
        this.f277473p = new C42670a(viewGroup, new a(), 0, 4, null);
        recyclerView.setAdapter(jVar);
        recyclerView.l(jVar2, -1);
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setTint(C35835l0.d(R.attr.black, toolbar.getContext()));
        }
        toolbar.setNavigationOnClickListener(new com.avito.android.review_gallery.g(this, 26));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(@Y61.k DeepLink deepLink) {
        Y41.l<? super InterfaceC13184a, G0> lVar = this.f277474q;
        if (lVar != null) {
            lVar.invoke(new InterfaceC13184a.d(deepLink));
        }
    }
}
