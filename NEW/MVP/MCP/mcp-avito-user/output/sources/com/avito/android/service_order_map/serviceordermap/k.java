package com.avito.android.service_order_map.serviceordermap;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.AvitoMapTarget;
import com.avito.android.avito_map.AvitoMapUiSettings;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapState;
import com.avito.android.service_order_map.serviceordermap.mvi.entity.a;
import com.avito.android.user_address.pin.BlackPinView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ServiceOrderMapView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/k;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Lcom/avito/android/service_order_map/serviceordermap/ServiceOrderMapView;", "Lcom/avito/android/avito_map/AvitoMapAttachHelper$MapAttachListener;", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"ViewConstructor", "ClickableViewAccessibility"})
/* loaded from: classes3.dex */
public final class k extends CoordinatorLayout implements ServiceOrderMapView, AvitoMapAttachHelper.MapAttachListener {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f278684r = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AvitoMapTarget f278685b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f278686c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final BlackPinView f278687d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final NavBar f278688e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Input f278689f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final BackPressedAwareInput f278690g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final FloatingActionButton f278691h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final View f278692i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final View f278693j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final View f278694k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Button f278695l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final View f278696m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_order_map.serviceordermap.suggests.b f278697n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public AvitoMap f278698o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super com.avito.android.service_order_map.serviceordermap.mvi.entity.a, G0> f278699p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public ServiceOrderMapState.MapMode f278700q;

    /* compiled from: ServiceOrderMapView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ServiceOrderMapState.MapMode.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ServiceOrderMapState.MapMode mapMode = ServiceOrderMapState.MapMode.f278783b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public k(@Y61.k ServiceOrderMapActivity serviceOrderMapActivity, @Y61.k AvitoMapAttachHelper avitoMapAttachHelper, @Y61.k FragmentManager fragmentManager, @Y61.l AvitoMapTarget avitoMapTarget) {
        super(serviceOrderMapActivity);
        this.f278685b = avitoMapTarget;
        com.avito.android.service_order_map.serviceordermap.suggests.b bVar = new com.avito.android.service_order_map.serviceordermap.suggests.b();
        this.f278697n = bVar;
        this.f278700q = ServiceOrderMapState.MapMode.f278784c;
        LayoutInflater.from(serviceOrderMapActivity).inflate(R.layout.service_order_map_activity, (ViewGroup) this, true);
        this.f278686c = (FrameLayout) findViewById(R.id.map);
        this.f278687d = (BlackPinView) findViewById(R.id.pin_view);
        NavBar navBar = (NavBar) findViewById(R.id.navbar);
        this.f278688e = navBar;
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.find_me_button);
        this.f278691h = floatingActionButton;
        this.f278693j = findViewById(R.id.drop_down_suggestions_container);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        Button button = (Button) findViewById(R.id.main_button);
        this.f278695l = button;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(bVar);
        this.f278694k = findViewById(R.id.main_button_container);
        this.f278692i = findViewById(R.id.map_concealer);
        BackPressedAwareInput backPressedAwareInput = (BackPressedAwareInput) findViewById(R.id.edit_query);
        this.f278690g = backPressedAwareInput;
        this.f278696m = findViewById(R.id.progress_overlay_container);
        Input input = (Input) findViewById(R.id.search_input);
        input.setHint(R.string.service_order_map_search_hint);
        input.setFocusable(false);
        input.setClickable(false);
        input.setTouchListener(new View.OnTouchListener() { // from class: com.avito.android.service_order_map.serviceordermap.e
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Y41.l<? super com.avito.android.service_order_map.serviceordermap.mvi.entity.a, G0> lVar;
                int i12 = k.f278684r;
                if (motionEvent.getAction() != 1 || (lVar = this.f278677b.f278699p) == null) {
                    return false;
                }
                ((a) lVar).invoke(new a.b(ServiceOrderMapState.MapMode.f278783b));
                return false;
            }
        });
        this.f278689f = input;
        navBar.setState(new com.avito.android.lib.design.nav_bar.a(null, null, true, null, null, null, null, 123, null));
        avitoMapAttachHelper.setMapAttachedListener(this);
        avitoMapAttachHelper.attachView(R.id.map, this, fragmentManager);
        final int i12 = 0;
        floatingActionButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.service_order_map.serviceordermap.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f278679c;

            {
                this.f278679c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        Y41.l<? super com.avito.android.service_order_map.serviceordermap.mvi.entity.a, G0> lVar = this.f278679c.f278699p;
                        if (lVar != null) {
                            lVar.invoke(a.c.f278789a);
                            break;
                        }
                        break;
                    default:
                        Y41.l<? super com.avito.android.service_order_map.serviceordermap.mvi.entity.a, G0> lVar2 = this.f278679c.f278699p;
                        if (lVar2 != null) {
                            lVar2.invoke(a.d.f278790a);
                            break;
                        }
                        break;
                }
            }
        });
        navBar.c(R.attr.ic_arrowBack24, new g(this));
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.service_order_map.serviceordermap.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f278679c;

            {
                this.f278679c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        Y41.l<? super com.avito.android.service_order_map.serviceordermap.mvi.entity.a, G0> lVar = this.f278679c.f278699p;
                        if (lVar != null) {
                            lVar.invoke(a.c.f278789a);
                            break;
                        }
                        break;
                    default:
                        Y41.l<? super com.avito.android.service_order_map.serviceordermap.mvi.entity.a, G0> lVar2 = this.f278679c.f278699p;
                        if (lVar2 != null) {
                            lVar2.invoke(a.d.f278790a);
                            break;
                        }
                        break;
                }
            }
        });
        backPressedAwareInput.setOnBackPressed(new h(this));
        com.avito.android.lib.design.input.n.c(backPressedAwareInput, new i(this));
        bVar.f278822e = new j(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setState$lambda$5(k kVar) {
        BackPressedAwareInput backPressedAwareInput = kVar.f278690g;
        backPressedAwareInput.requestFocus();
        backPressedAwareInput.v();
    }

    @Override // com.avito.android.avito_map.AvitoMapAttachHelper.MapAttachListener
    public final void onMapAttach(@Y61.k AvitoMap avitoMap) {
        AvitoMapTarget avitoMapTarget = this.f278685b;
        if (avitoMapTarget != null) {
            avitoMap.restoreTarget(avitoMapTarget);
        }
        this.f278698o = avitoMap;
        AvitoMapUiSettings uiSettings = avitoMap.getUiSettings();
        uiSettings.isRotateGesturesEnabled(false);
        uiSettings.isFastTapEnabled(true);
        avitoMap.addMoveStartListener(new l());
        avitoMap.addMoveEndListener(new m(this));
        BlackPinView blackPinView = this.f278687d;
        blackPinView.getClass();
        avitoMap.addMoveStartListener(blackPinView);
        avitoMap.addMoveEndListener(blackPinView);
    }
}
