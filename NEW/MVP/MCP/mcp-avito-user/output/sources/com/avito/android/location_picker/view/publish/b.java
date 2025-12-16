package com.avito.android.location_picker.view.publish;

import Y41.p;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C19918B;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapPointKt;
import com.avito.android.avito_map.AvitoMapTarget;
import com.avito.android.avito_map.AvitoMapUiSettings;
import com.avito.android.component.toast.c;
import com.avito.android.di.B;
import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.input.ComponentType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.location_picker.K0;
import com.avito.android.location_picker.N0;
import com.avito.android.location_picker.analytics.ScreenCloseFromBlock;
import com.avito.android.location_picker.di.v;
import com.avito.android.location_picker.di.w;
import com.avito.android.location_picker.di.y;
import com.avito.android.location_picker.job.f;
import com.avito.android.location_picker.view.AbstractC31586h;
import com.avito.android.location_picker.view.InterfaceC31579a;
import com.avito.android.location_picker.view.InterfaceC31580b;
import com.avito.android.location_picker.view.InterfaceC31581c;
import com.avito.android.location_picker.view.LocationPickerChooseButtonLocation;
import com.avito.android.location_picker.view.X;
import com.avito.android.location_picker.view.publish.b;
import com.avito.android.location_picker.view.publish.b.C5354b;
import com.avito.android.location_picker.view.publish.b.c;
import com.avito.android.location_picker.view.publish.b.d;
import com.avito.android.location_picker.view.publish.b.f;
import com.avito.android.location_picker.view.radius.RadiusCircleViewImpl;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.user_address.pin.BlackPinView;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.jakewharton.rxbinding4.view.C37722i;
import com.jakewharton.rxbinding4.widget.C37750f0;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import io.reactivex.rxjava3.internal.operators.observable.T0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l41.o;
import l41.r;
import vW.C49272b;
import vW.C49273c;
import vW.q;
import vW.s;

/* compiled from: PublishLocationPickerView.kt */
@B
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/location_picker/view/publish/b;", "Lcom/avito/android/location_picker/view/a;", "Lcom/avito/android/location_picker/view/c;", "Lcom/avito/android/avito_map/AvitoMapAttachHelper$MapAttachListener;", "Lcom/avito/android/location_picker/view/b;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements InterfaceC31579a, InterfaceC31581c, AvitoMapAttachHelper.MapAttachListener, InterfaceC31580b {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b f182664A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final z<G0> f182665B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f182666C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f182667D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f182668E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final z<G0> f182669F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final T0 f182670G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public final z<G0> f182671H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f182672I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e f182673J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final z<com.avito.android.location_picker.view.radius.a> f182674K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f182675L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f182676M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b f182677N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b f182678O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final B0 f182679P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final T0 f182680Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final z<Boolean> f182681R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f182682S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f182683T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.view.publish.a f182684U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.view.publish.a f182685V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.view.publish.a f182686W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.view.publish.a f182687X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.view.publish.a f182688Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.view.publish.a f182689Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.view.publish.a f182690a0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f182691b;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.view.publish.a f182692b0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Fragment f182693c;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.view.publish.a f182694c0;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final N0 f182695d;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.view.publish.a f182696d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f182697e;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.view.publish.a f182698e0;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f182699f;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.view.publish.a f182700f0;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.job.f f182701g;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.view.publish.a f182702g0;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final AvitoMapTarget f182703h;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.view.publish.a f182704h0;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.providers.z f182705i;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.view.publish.a f182706i0;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f182707j;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.view.publish.a f182708j0;

    /* renamed from: k, reason: collision with root package name */
    public final Resources f182709k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.view.publish.k f182710l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public AvitoMap f182711m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.view.radius.f f182712n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.location_picker.view.radius.i f182713o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final C42670a f182714p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final X f182715q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.k f182716r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.modal.a f182717s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.tooltip.k f182718t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f182719u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f182720v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f182721w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f182722x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f182723y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f182724z;

    /* compiled from: PublishLocationPickerView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[LocationPickerChooseButtonLocation.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LocationPickerChooseButtonLocation locationPickerChooseButtonLocation = LocationPickerChooseButtonLocation.f182519b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: PublishLocationPickerView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.location_picker.view.publish.b$b, reason: collision with other inner class name */
    public static final class C5354b extends N implements Y41.a<G0> {
        public C5354b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c cVar = b.this.f182721w;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    /* compiled from: PublishLocationPickerView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            b bVar = b.this;
            com.jakewharton.rxrelay3.c cVar = bVar.f182722x;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            bVar.f182695d.T3();
            return g02;
        }
    }

    /* compiled from: PublishLocationPickerView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c cVar = b.this.f182721w;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    /* compiled from: PublishLocationPickerView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements p<a.b, DialogInterface, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f182728l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b f182729m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, b bVar) {
            super(2);
            this.f182728l = str;
            this.f182729m = bVar;
        }

        @Override // Y41.p
        public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
            a.b bVar2 = bVar;
            bVar2.setSubtitle(this.f182728l);
            b bVar3 = this.f182729m;
            bVar2.L3(bVar3.f182709k.getString(R.string.lp_error_dialog_ok_button_text), new com.avito.android.location_picker.view.publish.c(bVar3));
            return G0.f406611a;
        }
    }

    /* compiled from: PublishLocationPickerView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c cVar = b.this.f182721w;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    /* compiled from: PublishLocationPickerView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements Y41.a<Integer> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            FrameLayout frameLayout = b.this.f182710l.f182754i;
            int width = frameLayout.getWidth();
            if (frameLayout.getWidth() == 0) {
                width = frameLayout.getResources().getDisplayMetrics().widthPixels;
            }
            return Integer.valueOf(width);
        }
    }

    /* compiled from: PublishLocationPickerView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends N implements Y41.a<View> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            return b.this.f182710l.f182751f;
        }
    }

    /* compiled from: PublishLocationPickerView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class i<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final i<T> f182733b = new i<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((Number) obj).intValue() == 3;
        }
    }

    /* compiled from: PublishLocationPickerView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class j<T, R> implements o {
        public j() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            ((Number) obj).intValue();
            return String.valueOf(b.this.f182710l.f182756k.m53getText());
        }
    }

    /* compiled from: PublishLocationPickerView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "", "apply", "(Lkotlin/G0;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final k<T, R> f182735b = new k<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: PublishLocationPickerView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.l<com.avito.android.lib.design.tooltip.o, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f182736l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str) {
            super(1);
            this.f182736l = str;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.lib.design.tooltip.o oVar) {
            oVar.b(this.f182736l);
            return G0.f406611a;
        }
    }

    /* compiled from: PublishLocationPickerView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class m<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final m<T, R> f182737b = new m<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((CharSequence) obj).toString();
        }
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [com.avito.android.location_picker.view.publish.a] */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.avito.android.location_picker.view.publish.a] */
    /* JADX WARN: Type inference failed for: r2v18, types: [com.avito.android.location_picker.view.publish.a] */
    /* JADX WARN: Type inference failed for: r2v19, types: [com.avito.android.location_picker.view.publish.a] */
    /* JADX WARN: Type inference failed for: r2v20, types: [com.avito.android.location_picker.view.publish.a] */
    /* JADX WARN: Type inference failed for: r2v21, types: [com.avito.android.location_picker.view.publish.a] */
    /* JADX WARN: Type inference failed for: r2v22, types: [com.avito.android.location_picker.view.publish.a] */
    /* JADX WARN: Type inference failed for: r2v23, types: [com.avito.android.location_picker.view.publish.a] */
    /* JADX WARN: Type inference failed for: r2v24, types: [com.avito.android.location_picker.view.publish.a] */
    /* JADX WARN: Type inference failed for: r2v25, types: [com.avito.android.location_picker.view.publish.a] */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.avito.android.location_picker.view.publish.a] */
    /* JADX WARN: Type inference failed for: r2v27, types: [com.avito.android.location_picker.view.publish.a] */
    /* JADX WARN: Type inference failed for: r2v28, types: [com.avito.android.location_picker.view.publish.a] */
    /* JADX WARN: Type inference failed for: r2v29, types: [com.avito.android.location_picker.view.publish.a] */
    /* JADX WARN: Type inference failed for: r2v30, types: [com.avito.android.location_picker.view.publish.a] */
    /* JADX WARN: Type inference failed for: r2v31, types: [com.avito.android.location_picker.view.publish.a] */
    @Inject
    public b(@Y61.k View view, @Y61.k Fragment fragment, @Y61.k N0 n02, @w boolean z12, @com.avito.android.location_picker.di.a boolean z13, @Y61.k com.avito.android.location_picker.job.f fVar, @Y61.k LocationPickerChooseButtonLocation locationPickerChooseButtonLocation, @Y61.k AvitoMapAttachHelper avitoMapAttachHelper, @Y61.l AvitoMapTarget avitoMapTarget, @Y61.k com.avito.android.location_picker.providers.z zVar, @y boolean z14, @Y61.k K0 k02, @v @Y61.l String str) throws Resources.NotFoundException {
        AbstractC31586h.a bVar;
        boolean z15;
        this.f182691b = view;
        this.f182693c = fragment;
        this.f182695d = n02;
        this.f182697e = z12;
        this.f182699f = z13;
        this.f182701g = fVar;
        this.f182703h = avitoMapTarget;
        this.f182705i = zVar;
        this.f182707j = str;
        Context context = view.getContext();
        this.f182709k = view.getResources();
        int iOrdinal = locationPickerChooseButtonLocation.ordinal();
        if (iOrdinal == 0) {
            bVar = new AbstractC31586h.b(view);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new AbstractC31586h.c(view);
        }
        com.avito.android.location_picker.view.publish.k kVar = new com.avito.android.location_picker.view.publish.k(view, bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097148, null);
        this.f182710l = kVar;
        com.avito.android.location_picker.view.radius.f fVar2 = new com.avito.android.location_picker.view.radius.f();
        this.f182712n = fVar2;
        Chips chips = kVar.f182762q;
        this.f182713o = chips != null ? new com.avito.android.location_picker.view.radius.i(chips) : null;
        C42670a c42670a = new C42670a(kVar.f182750e, new h(), 0, 4, null);
        this.f182714p = c42670a;
        X x12 = new X(true);
        this.f182715q = x12;
        this.f182719u = C42727D.c(new g());
        this.f182720v = new com.jakewharton.rxrelay3.c();
        this.f182721w = new com.jakewharton.rxrelay3.c();
        this.f182722x = new com.jakewharton.rxrelay3.c();
        this.f182723y = new com.jakewharton.rxrelay3.c();
        this.f182724z = new com.jakewharton.rxrelay3.c();
        this.f182664A = new com.jakewharton.rxrelay3.b();
        PublishSearchLocationInput publishSearchLocationInput = kVar.f182756k;
        this.f182665B = publishSearchLocationInput.getBackPressedEvents();
        this.f182666C = new com.jakewharton.rxrelay3.c();
        this.f182667D = new com.jakewharton.rxrelay3.c();
        this.f182668E = new com.jakewharton.rxrelay3.c();
        AbstractC31586h.a aVar = kVar.f182747b;
        this.f182669F = aVar.R0();
        FloatingActionButton floatingActionButton = kVar.f182755j;
        this.f182670G = C37722i.a(floatingActionButton).p0();
        Button button = kVar.f182763r;
        this.f182671H = button != null ? C37722i.a(button) : null;
        this.f182672I = new com.jakewharton.rxrelay3.c();
        this.f182673J = x12.f182554g;
        this.f182674K = fVar2.f182792b;
        com.jakewharton.rxrelay3.c cVar = new com.jakewharton.rxrelay3.c();
        this.f182675L = cVar;
        this.f182676M = cVar;
        com.jakewharton.rxrelay3.b bVar2 = new com.jakewharton.rxrelay3.b();
        this.f182677N = bVar2;
        this.f182678O = bVar2;
        this.f182679P = C37750f0.b(publishSearchLocationInput.f179340l).N(i.f182733b).d0(new j());
        this.f182680Q = n.e(publishSearchLocationInput).d0(m.f182737b).p0();
        com.jakewharton.rxbinding4.a<Boolean> aVarC = C37722i.c(publishSearchLocationInput);
        PublishSearchLocationInput publishSearchLocationInput2 = kVar.f182758m;
        this.f182681R = z.g0(aVarC, C37722i.a(publishSearchLocationInput2).d0(k.f182735b));
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f182682S = cVar2;
        this.f182683T = new C41981q0(cVar2);
        final int i12 = 2;
        this.f182684U = new l41.g(this) { // from class: com.avito.android.location_picker.view.publish.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f182663c;

            {
                this.f182663c = this;
            }

            @Override // l41.g
            public final void accept(Object obj) throws Resources.NotFoundException {
                String string;
                Button button2;
                AvitoMapBounds avitoMapBounds;
                ViewPropertyAnimator viewPropertyAnimatorAnimate;
                ViewPropertyAnimator duration;
                ViewPropertyAnimator viewPropertyAnimatorAlpha;
                switch (i12) {
                    case 0:
                        String str2 = (String) obj;
                        b bVar3 = this.f182663c;
                        com.avito.android.lib.design.tooltip.k kVar2 = bVar3.f182718t;
                        if (kVar2 != null) {
                            kVar2.dismiss();
                        }
                        bVar3.f182718t = null;
                        com.avito.android.lib.design.tooltip.k kVar3 = new com.avito.android.lib.design.tooltip.k(bVar3.f182691b.getContext(), 0, 0, 6, null);
                        kVar3.f181224j = new r.a(new i.a(new b.a()));
                        int i13 = kVar3.f181229o;
                        kVar3.f181228n = -2;
                        kVar3.f181229o = i13;
                        com.avito.android.lib.design.tooltip.p.a(kVar3, new b.l(str2));
                        bVar3.f182718t = kVar3.f(bVar3.f182710l.f182756k);
                        return;
                    case 1:
                        vW.j jVar = (vW.j) obj;
                        boolean z16 = jVar instanceof vW.m;
                        int i14 = R.string.lp_network_error;
                        Integer numValueOf = Integer.valueOf(R.string.lp_network_error);
                        Integer numValueOf2 = Integer.valueOf(R.string.lp_repeat);
                        b bVar4 = this.f182663c;
                        boolean z17 = bVar4.f182697e;
                        com.avito.android.location_picker.providers.z zVar2 = bVar4.f182705i;
                        k kVar4 = bVar4.f182710l;
                        if (z16) {
                            if (z17) {
                                Button button3 = kVar4.f182763r;
                                if (button3 != null) {
                                    button3.setText(zVar2.getF182436b());
                                }
                            } else {
                                i14 = R.string.lp_network_error_confirmation;
                            }
                            b.O(bVar4, Integer.valueOf(i14), null, numValueOf2, bVar4.new C5354b(), 2);
                            return;
                        }
                        if (jVar instanceof q) {
                            b.O(bVar4, Integer.valueOf(R.string.location_permission_required), null, Integer.valueOf(R.string.lp_settings), bVar4.new c(), 2);
                            return;
                        }
                        if (jVar instanceof vW.i) {
                            b.O(bVar4, Integer.valueOf(R.string.loc_providers_unavailable_message), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.l) {
                            if (z17 && (button2 = kVar4.f182763r) != null) {
                                button2.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new d(), 2);
                            return;
                        }
                        if (jVar instanceof vW.k) {
                            b.O(bVar4, null, ((vW.k) jVar).f440807a, null, null, 13);
                            return;
                        }
                        if (jVar instanceof vW.r) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_not_suggested_address_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.o) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_suggests_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.h) {
                            if (bVar4.f182717s != null) {
                                return;
                            }
                            com.avito.android.location_picker.job.f fVar3 = bVar4.f182701g;
                            boolean z18 = fVar3 instanceof f.b;
                            Resources resources = bVar4.f182709k;
                            if (z18) {
                                string = resources.getString(R.string.lp_empty_address_error_for_job_assistant);
                            } else {
                                if (!(fVar3 instanceof f.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                string = resources.getString(R.string.lp_empty_address_error);
                            }
                            com.avito.android.lib.design.modal.a aVarC2 = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, bVar4.f182691b.getContext(), new b.e(string, bVar4));
                            bVar4.f182717s = aVarC2;
                            com.avito.android.lib.util.g.a(aVarC2);
                            return;
                        }
                        if (jVar instanceof C49273c) {
                            Button button4 = kVar4.f182763r;
                            if (button4 != null) {
                                button4.setText(zVar2.getF182436b());
                                return;
                            }
                            return;
                        }
                        if (jVar instanceof vW.d) {
                            Button button5 = kVar4.f182763r;
                            if (button5 != null) {
                                button5.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new f(), 2);
                            return;
                        }
                        if (jVar instanceof vW.n) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_coords_error), null, numValueOf2, null, 10);
                            return;
                        }
                        if (!(jVar instanceof vW.p)) {
                            jVar.equals(C49272b.f440797a);
                            return;
                        }
                        com.avito.android.lib.design.toast_bar.k kVar5 = bVar4.f182716r;
                        if (kVar5 != null) {
                            kVar5.f();
                            return;
                        }
                        return;
                    case 2:
                        D6.G(this.f182663c.f182710l.f182753h, ((Boolean) obj).booleanValue());
                        return;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        b bVar5 = this.f182663c;
                        if (bVar5.f182699f) {
                            return;
                        }
                        k kVar6 = bVar5.f182710l;
                        kVar6.f182747b.setLoading(zBooleanValue);
                        boolean z19 = !zBooleanValue;
                        kVar6.f182747b.setEnabled(z19);
                        kVar6.f182758m.setEnabled(z19);
                        return;
                    case 4:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        b bVar6 = this.f182663c;
                        k kVar7 = bVar6.f182710l;
                        D6.G(kVar7.f182756k, zBooleanValue2);
                        kVar7.f182749d.setLayoutParams(new CoordinatorLayout.g(-1, zBooleanValue2 ? -1 : -2));
                        boolean z22 = !zBooleanValue2;
                        D6.G(kVar7.f182757l, z22);
                        D6.G(kVar7.f182752g, z22);
                        D6.G(kVar7.f182755j, z22);
                        PublishSearchLocationInput publishSearchLocationInput3 = kVar7.f182756k;
                        if (zBooleanValue2) {
                            publishSearchLocationInput3.requestFocus();
                            publishSearchLocationInput3.q();
                            publishSearchLocationInput3.v();
                            return;
                        }
                        publishSearchLocationInput3.clearFocus();
                        D6.w(kVar7.f182760o);
                        Fragment fragment2 = bVar6.f182693c;
                        K2.e(fragment2);
                        ActivityC22955m activityC22955mL1 = fragment2.l1();
                        if ((activityC22955mL1 != null ? activityC22955mL1.getCurrentFocus() : null) == null) {
                            ActivityC22955m activityC22955mL12 = fragment2.l1();
                            Object systemService = activityC22955mL12 != null ? activityC22955mL12.getSystemService("input_method") : null;
                            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                            if (inputMethodManager != null) {
                                inputMethodManager.hideSoftInputFromWindow(bVar6.f182691b.getWindowToken(), 0);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        String str3 = (String) obj;
                        k kVar8 = this.f182663c.f182710l;
                        if (str3.equals(String.valueOf(kVar8.f182756k.m53getText()))) {
                            return;
                        }
                        Input.t(kVar8.f182756k, str3, false, 6);
                        Input.t(kVar8.f182758m, str3, false, 6);
                        return;
                    case 6:
                        Editable editableM53getText = this.f182663c.f182710l.f182756k.m53getText();
                        if (editableM53getText != null) {
                            editableM53getText.clear();
                            return;
                        }
                        return;
                    case 7:
                        List<AddressSuggestion> list = (List) obj;
                        boolean zIsEmpty = list.isEmpty();
                        b bVar7 = this.f182663c;
                        k kVar9 = bVar7.f182710l;
                        if (zIsEmpty) {
                            D6.w(kVar9.f182760o);
                            return;
                        }
                        D6.G(kVar9.f182760o, true);
                        X x13 = bVar7.f182715q;
                        x13.f182553f = list;
                        x13.notifyDataSetChanged();
                        return;
                    case 8:
                        AvitoMapCameraPosition avitoMapCameraPosition = (AvitoMapCameraPosition) obj;
                        AvitoMap avitoMap = this.f182663c.f182711m;
                        if (avitoMap != null) {
                            boolean z23 = avitoMapCameraPosition.getZoomLevel() == avitoMap.getMapTarget().getZoomLevel();
                            boolean zAlmostEqual = AvitoMapPointKt.almostEqual(avitoMapCameraPosition.getMapPoint(), avitoMap.getMapTarget().getPoint());
                            if (avitoMapCameraPosition.getViewportBounds() != null) {
                                AvitoMapBounds viewportBounds = avitoMapCameraPosition.getViewportBounds();
                                if (viewportBounds != null) {
                                    avitoMap.moveTo(viewportBounds, true);
                                    return;
                                }
                                return;
                            }
                            if (!z23 && !zAlmostEqual) {
                                avitoMap.moveTo(avitoMapCameraPosition.getMapPoint(), true, Float.valueOf(avitoMapCameraPosition.getZoomLevel()));
                                return;
                            } else if (!z23) {
                                AvitoMap.DefaultImpls.zoomTo$default(avitoMap, avitoMapCameraPosition.getZoomLevel(), false, null, 6, null);
                                return;
                            } else {
                                if (zAlmostEqual) {
                                    return;
                                }
                                AvitoMap.DefaultImpls.moveTo$default(avitoMap, avitoMapCameraPosition.getMapPoint(), true, null, 4, null);
                                return;
                            }
                        }
                        return;
                    case 9:
                        vW.f fVar4 = (vW.f) obj;
                        b bVar8 = this.f182663c;
                        com.avito.android.location_picker.view.radius.f fVar5 = bVar8.f182712n;
                        if (fVar5.f182793c == null) {
                            k kVar10 = bVar8.f182710l;
                            View view2 = kVar10.f182764s;
                            if (view2 != null) {
                                D6.w(view2);
                            }
                            View view3 = kVar10.f182765t;
                            if (view3 != null) {
                                D6.H(view3);
                            }
                            com.avito.android.location_picker.view.radius.i iVar = bVar8.f182713o;
                            if (iVar != null) {
                                List<Radius> list2 = fVar4.f440802a;
                                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                                for (Radius radius : list2) {
                                    String id2 = radius.getId();
                                    String str4 = "";
                                    if (id2 == null) {
                                        id2 = "";
                                    }
                                    String title = radius.getTitle();
                                    if (title != null) {
                                        str4 = title;
                                    }
                                    arrayList.add(new com.avito.android.location_picker.view.radius.a(id2, radius.getDistanceInMeters(), Boolean.valueOf(radius.isActive()), str4));
                                }
                                fVar5.a(iVar, arrayList);
                            }
                        }
                        if (fVar4.f440804c.longValue() == 0 || (avitoMapBounds = fVar4.f440803b) == null) {
                            return;
                        }
                        List listU = C42745f0.U(avitoMapBounds.getTopLeft(), avitoMapBounds.getBottomRight());
                        AvitoMap avitoMap2 = bVar8.f182711m;
                        if (avitoMap2 != null) {
                            AvitoMap.DefaultImpls.moveToPointsWithPadding$default(avitoMap2, listU, Integer.valueOf(bVar8.f182705i.getF182438d()), null, false, null, 28, null);
                            return;
                        }
                        return;
                    case 10:
                        b bVar9 = this.f182663c;
                        float fIntValue = (float) ((((Number) bVar9.f182719u.getValue()).intValue() * r15.f440816b) / ((s) obj).f440815a);
                        RadiusCircleViewImpl radiusCircleViewImpl = bVar9.f182710l.f182766u;
                        if (radiusCircleViewImpl != null) {
                            radiusCircleViewImpl.setRadius(fIntValue);
                            return;
                        }
                        return;
                    case 11:
                        float f12 = ((Boolean) obj).booleanValue() ? 1.0f : 0.0f;
                        RadiusCircleViewImpl radiusCircleViewImpl2 = this.f182663c.f182710l.f182766u;
                        if (radiusCircleViewImpl2 == null || (viewPropertyAnimatorAnimate = radiusCircleViewImpl2.animate()) == null || (duration = viewPropertyAnimatorAnimate.setDuration(180L)) == null || (viewPropertyAnimatorAlpha = duration.alpha(f12)) == null) {
                            return;
                        }
                        viewPropertyAnimatorAlpha.start();
                        return;
                    case 12:
                        vW.e eVar = (vW.e) obj;
                        String str5 = eVar.f440800a;
                        int length = str5.length();
                        b bVar10 = this.f182663c;
                        k kVar11 = bVar10.f182710l;
                        if (length == 0) {
                            Button button6 = kVar11.f182763r;
                            if (button6 != null) {
                                button6.setText(bVar10.f182705i.getF182435a());
                            }
                            Button button7 = kVar11.f182763r;
                            if (button7 == null) {
                                return;
                            }
                            button7.setEnabled(false);
                            return;
                        }
                        Button button8 = kVar11.f182763r;
                        if (button8 != null) {
                            button8.setText(str5);
                        }
                        Button button9 = kVar11.f182763r;
                        if (button9 == null) {
                            return;
                        }
                        button9.setEnabled(eVar.f440801b);
                        return;
                    case 13:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        k kVar12 = this.f182663c.f182710l;
                        kVar12.f182747b.setEnabled(zBooleanValue3);
                        kVar12.f182758m.setEnabled(zBooleanValue3);
                        return;
                    case 14:
                        b bVar11 = this.f182663c;
                        bVar11.f182695d.I1((AddressParameter.Value) obj, bVar11.f182707j);
                        return;
                    default:
                        b bVar12 = this.f182663c;
                        bVar12.f182720v.accept(ScreenCloseFromBlock.f182205d);
                        bVar12.f182695d.E3((Radius) obj);
                        bVar12.f182672I.accept(G0.f406611a);
                        return;
                }
            }
        };
        final int i13 = 13;
        this.f182685V = new l41.g(this) { // from class: com.avito.android.location_picker.view.publish.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f182663c;

            {
                this.f182663c = this;
            }

            @Override // l41.g
            public final void accept(Object obj) throws Resources.NotFoundException {
                String string;
                Button button2;
                AvitoMapBounds avitoMapBounds;
                ViewPropertyAnimator viewPropertyAnimatorAnimate;
                ViewPropertyAnimator duration;
                ViewPropertyAnimator viewPropertyAnimatorAlpha;
                switch (i13) {
                    case 0:
                        String str2 = (String) obj;
                        b bVar3 = this.f182663c;
                        com.avito.android.lib.design.tooltip.k kVar2 = bVar3.f182718t;
                        if (kVar2 != null) {
                            kVar2.dismiss();
                        }
                        bVar3.f182718t = null;
                        com.avito.android.lib.design.tooltip.k kVar3 = new com.avito.android.lib.design.tooltip.k(bVar3.f182691b.getContext(), 0, 0, 6, null);
                        kVar3.f181224j = new r.a(new i.a(new b.a()));
                        int i132 = kVar3.f181229o;
                        kVar3.f181228n = -2;
                        kVar3.f181229o = i132;
                        com.avito.android.lib.design.tooltip.p.a(kVar3, new b.l(str2));
                        bVar3.f182718t = kVar3.f(bVar3.f182710l.f182756k);
                        return;
                    case 1:
                        vW.j jVar = (vW.j) obj;
                        boolean z16 = jVar instanceof vW.m;
                        int i14 = R.string.lp_network_error;
                        Integer numValueOf = Integer.valueOf(R.string.lp_network_error);
                        Integer numValueOf2 = Integer.valueOf(R.string.lp_repeat);
                        b bVar4 = this.f182663c;
                        boolean z17 = bVar4.f182697e;
                        com.avito.android.location_picker.providers.z zVar2 = bVar4.f182705i;
                        k kVar4 = bVar4.f182710l;
                        if (z16) {
                            if (z17) {
                                Button button3 = kVar4.f182763r;
                                if (button3 != null) {
                                    button3.setText(zVar2.getF182436b());
                                }
                            } else {
                                i14 = R.string.lp_network_error_confirmation;
                            }
                            b.O(bVar4, Integer.valueOf(i14), null, numValueOf2, bVar4.new C5354b(), 2);
                            return;
                        }
                        if (jVar instanceof q) {
                            b.O(bVar4, Integer.valueOf(R.string.location_permission_required), null, Integer.valueOf(R.string.lp_settings), bVar4.new c(), 2);
                            return;
                        }
                        if (jVar instanceof vW.i) {
                            b.O(bVar4, Integer.valueOf(R.string.loc_providers_unavailable_message), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.l) {
                            if (z17 && (button2 = kVar4.f182763r) != null) {
                                button2.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new d(), 2);
                            return;
                        }
                        if (jVar instanceof vW.k) {
                            b.O(bVar4, null, ((vW.k) jVar).f440807a, null, null, 13);
                            return;
                        }
                        if (jVar instanceof vW.r) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_not_suggested_address_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.o) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_suggests_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.h) {
                            if (bVar4.f182717s != null) {
                                return;
                            }
                            com.avito.android.location_picker.job.f fVar3 = bVar4.f182701g;
                            boolean z18 = fVar3 instanceof f.b;
                            Resources resources = bVar4.f182709k;
                            if (z18) {
                                string = resources.getString(R.string.lp_empty_address_error_for_job_assistant);
                            } else {
                                if (!(fVar3 instanceof f.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                string = resources.getString(R.string.lp_empty_address_error);
                            }
                            com.avito.android.lib.design.modal.a aVarC2 = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, bVar4.f182691b.getContext(), new b.e(string, bVar4));
                            bVar4.f182717s = aVarC2;
                            com.avito.android.lib.util.g.a(aVarC2);
                            return;
                        }
                        if (jVar instanceof C49273c) {
                            Button button4 = kVar4.f182763r;
                            if (button4 != null) {
                                button4.setText(zVar2.getF182436b());
                                return;
                            }
                            return;
                        }
                        if (jVar instanceof vW.d) {
                            Button button5 = kVar4.f182763r;
                            if (button5 != null) {
                                button5.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new f(), 2);
                            return;
                        }
                        if (jVar instanceof vW.n) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_coords_error), null, numValueOf2, null, 10);
                            return;
                        }
                        if (!(jVar instanceof vW.p)) {
                            jVar.equals(C49272b.f440797a);
                            return;
                        }
                        com.avito.android.lib.design.toast_bar.k kVar5 = bVar4.f182716r;
                        if (kVar5 != null) {
                            kVar5.f();
                            return;
                        }
                        return;
                    case 2:
                        D6.G(this.f182663c.f182710l.f182753h, ((Boolean) obj).booleanValue());
                        return;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        b bVar5 = this.f182663c;
                        if (bVar5.f182699f) {
                            return;
                        }
                        k kVar6 = bVar5.f182710l;
                        kVar6.f182747b.setLoading(zBooleanValue);
                        boolean z19 = !zBooleanValue;
                        kVar6.f182747b.setEnabled(z19);
                        kVar6.f182758m.setEnabled(z19);
                        return;
                    case 4:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        b bVar6 = this.f182663c;
                        k kVar7 = bVar6.f182710l;
                        D6.G(kVar7.f182756k, zBooleanValue2);
                        kVar7.f182749d.setLayoutParams(new CoordinatorLayout.g(-1, zBooleanValue2 ? -1 : -2));
                        boolean z22 = !zBooleanValue2;
                        D6.G(kVar7.f182757l, z22);
                        D6.G(kVar7.f182752g, z22);
                        D6.G(kVar7.f182755j, z22);
                        PublishSearchLocationInput publishSearchLocationInput3 = kVar7.f182756k;
                        if (zBooleanValue2) {
                            publishSearchLocationInput3.requestFocus();
                            publishSearchLocationInput3.q();
                            publishSearchLocationInput3.v();
                            return;
                        }
                        publishSearchLocationInput3.clearFocus();
                        D6.w(kVar7.f182760o);
                        Fragment fragment2 = bVar6.f182693c;
                        K2.e(fragment2);
                        ActivityC22955m activityC22955mL1 = fragment2.l1();
                        if ((activityC22955mL1 != null ? activityC22955mL1.getCurrentFocus() : null) == null) {
                            ActivityC22955m activityC22955mL12 = fragment2.l1();
                            Object systemService = activityC22955mL12 != null ? activityC22955mL12.getSystemService("input_method") : null;
                            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                            if (inputMethodManager != null) {
                                inputMethodManager.hideSoftInputFromWindow(bVar6.f182691b.getWindowToken(), 0);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        String str3 = (String) obj;
                        k kVar8 = this.f182663c.f182710l;
                        if (str3.equals(String.valueOf(kVar8.f182756k.m53getText()))) {
                            return;
                        }
                        Input.t(kVar8.f182756k, str3, false, 6);
                        Input.t(kVar8.f182758m, str3, false, 6);
                        return;
                    case 6:
                        Editable editableM53getText = this.f182663c.f182710l.f182756k.m53getText();
                        if (editableM53getText != null) {
                            editableM53getText.clear();
                            return;
                        }
                        return;
                    case 7:
                        List<AddressSuggestion> list = (List) obj;
                        boolean zIsEmpty = list.isEmpty();
                        b bVar7 = this.f182663c;
                        k kVar9 = bVar7.f182710l;
                        if (zIsEmpty) {
                            D6.w(kVar9.f182760o);
                            return;
                        }
                        D6.G(kVar9.f182760o, true);
                        X x13 = bVar7.f182715q;
                        x13.f182553f = list;
                        x13.notifyDataSetChanged();
                        return;
                    case 8:
                        AvitoMapCameraPosition avitoMapCameraPosition = (AvitoMapCameraPosition) obj;
                        AvitoMap avitoMap = this.f182663c.f182711m;
                        if (avitoMap != null) {
                            boolean z23 = avitoMapCameraPosition.getZoomLevel() == avitoMap.getMapTarget().getZoomLevel();
                            boolean zAlmostEqual = AvitoMapPointKt.almostEqual(avitoMapCameraPosition.getMapPoint(), avitoMap.getMapTarget().getPoint());
                            if (avitoMapCameraPosition.getViewportBounds() != null) {
                                AvitoMapBounds viewportBounds = avitoMapCameraPosition.getViewportBounds();
                                if (viewportBounds != null) {
                                    avitoMap.moveTo(viewportBounds, true);
                                    return;
                                }
                                return;
                            }
                            if (!z23 && !zAlmostEqual) {
                                avitoMap.moveTo(avitoMapCameraPosition.getMapPoint(), true, Float.valueOf(avitoMapCameraPosition.getZoomLevel()));
                                return;
                            } else if (!z23) {
                                AvitoMap.DefaultImpls.zoomTo$default(avitoMap, avitoMapCameraPosition.getZoomLevel(), false, null, 6, null);
                                return;
                            } else {
                                if (zAlmostEqual) {
                                    return;
                                }
                                AvitoMap.DefaultImpls.moveTo$default(avitoMap, avitoMapCameraPosition.getMapPoint(), true, null, 4, null);
                                return;
                            }
                        }
                        return;
                    case 9:
                        vW.f fVar4 = (vW.f) obj;
                        b bVar8 = this.f182663c;
                        com.avito.android.location_picker.view.radius.f fVar5 = bVar8.f182712n;
                        if (fVar5.f182793c == null) {
                            k kVar10 = bVar8.f182710l;
                            View view2 = kVar10.f182764s;
                            if (view2 != null) {
                                D6.w(view2);
                            }
                            View view3 = kVar10.f182765t;
                            if (view3 != null) {
                                D6.H(view3);
                            }
                            com.avito.android.location_picker.view.radius.i iVar = bVar8.f182713o;
                            if (iVar != null) {
                                List<Radius> list2 = fVar4.f440802a;
                                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                                for (Radius radius : list2) {
                                    String id2 = radius.getId();
                                    String str4 = "";
                                    if (id2 == null) {
                                        id2 = "";
                                    }
                                    String title = radius.getTitle();
                                    if (title != null) {
                                        str4 = title;
                                    }
                                    arrayList.add(new com.avito.android.location_picker.view.radius.a(id2, radius.getDistanceInMeters(), Boolean.valueOf(radius.isActive()), str4));
                                }
                                fVar5.a(iVar, arrayList);
                            }
                        }
                        if (fVar4.f440804c.longValue() == 0 || (avitoMapBounds = fVar4.f440803b) == null) {
                            return;
                        }
                        List listU = C42745f0.U(avitoMapBounds.getTopLeft(), avitoMapBounds.getBottomRight());
                        AvitoMap avitoMap2 = bVar8.f182711m;
                        if (avitoMap2 != null) {
                            AvitoMap.DefaultImpls.moveToPointsWithPadding$default(avitoMap2, listU, Integer.valueOf(bVar8.f182705i.getF182438d()), null, false, null, 28, null);
                            return;
                        }
                        return;
                    case 10:
                        b bVar9 = this.f182663c;
                        float fIntValue = (float) ((((Number) bVar9.f182719u.getValue()).intValue() * r15.f440816b) / ((s) obj).f440815a);
                        RadiusCircleViewImpl radiusCircleViewImpl = bVar9.f182710l.f182766u;
                        if (radiusCircleViewImpl != null) {
                            radiusCircleViewImpl.setRadius(fIntValue);
                            return;
                        }
                        return;
                    case 11:
                        float f12 = ((Boolean) obj).booleanValue() ? 1.0f : 0.0f;
                        RadiusCircleViewImpl radiusCircleViewImpl2 = this.f182663c.f182710l.f182766u;
                        if (radiusCircleViewImpl2 == null || (viewPropertyAnimatorAnimate = radiusCircleViewImpl2.animate()) == null || (duration = viewPropertyAnimatorAnimate.setDuration(180L)) == null || (viewPropertyAnimatorAlpha = duration.alpha(f12)) == null) {
                            return;
                        }
                        viewPropertyAnimatorAlpha.start();
                        return;
                    case 12:
                        vW.e eVar = (vW.e) obj;
                        String str5 = eVar.f440800a;
                        int length = str5.length();
                        b bVar10 = this.f182663c;
                        k kVar11 = bVar10.f182710l;
                        if (length == 0) {
                            Button button6 = kVar11.f182763r;
                            if (button6 != null) {
                                button6.setText(bVar10.f182705i.getF182435a());
                            }
                            Button button7 = kVar11.f182763r;
                            if (button7 == null) {
                                return;
                            }
                            button7.setEnabled(false);
                            return;
                        }
                        Button button8 = kVar11.f182763r;
                        if (button8 != null) {
                            button8.setText(str5);
                        }
                        Button button9 = kVar11.f182763r;
                        if (button9 == null) {
                            return;
                        }
                        button9.setEnabled(eVar.f440801b);
                        return;
                    case 13:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        k kVar12 = this.f182663c.f182710l;
                        kVar12.f182747b.setEnabled(zBooleanValue3);
                        kVar12.f182758m.setEnabled(zBooleanValue3);
                        return;
                    case 14:
                        b bVar11 = this.f182663c;
                        bVar11.f182695d.I1((AddressParameter.Value) obj, bVar11.f182707j);
                        return;
                    default:
                        b bVar12 = this.f182663c;
                        bVar12.f182720v.accept(ScreenCloseFromBlock.f182205d);
                        bVar12.f182695d.E3((Radius) obj);
                        bVar12.f182672I.accept(G0.f406611a);
                        return;
                }
            }
        };
        final int i14 = 14;
        this.f182686W = new l41.g(this) { // from class: com.avito.android.location_picker.view.publish.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f182663c;

            {
                this.f182663c = this;
            }

            @Override // l41.g
            public final void accept(Object obj) throws Resources.NotFoundException {
                String string;
                Button button2;
                AvitoMapBounds avitoMapBounds;
                ViewPropertyAnimator viewPropertyAnimatorAnimate;
                ViewPropertyAnimator duration;
                ViewPropertyAnimator viewPropertyAnimatorAlpha;
                switch (i14) {
                    case 0:
                        String str2 = (String) obj;
                        b bVar3 = this.f182663c;
                        com.avito.android.lib.design.tooltip.k kVar2 = bVar3.f182718t;
                        if (kVar2 != null) {
                            kVar2.dismiss();
                        }
                        bVar3.f182718t = null;
                        com.avito.android.lib.design.tooltip.k kVar3 = new com.avito.android.lib.design.tooltip.k(bVar3.f182691b.getContext(), 0, 0, 6, null);
                        kVar3.f181224j = new r.a(new i.a(new b.a()));
                        int i132 = kVar3.f181229o;
                        kVar3.f181228n = -2;
                        kVar3.f181229o = i132;
                        com.avito.android.lib.design.tooltip.p.a(kVar3, new b.l(str2));
                        bVar3.f182718t = kVar3.f(bVar3.f182710l.f182756k);
                        return;
                    case 1:
                        vW.j jVar = (vW.j) obj;
                        boolean z16 = jVar instanceof vW.m;
                        int i142 = R.string.lp_network_error;
                        Integer numValueOf = Integer.valueOf(R.string.lp_network_error);
                        Integer numValueOf2 = Integer.valueOf(R.string.lp_repeat);
                        b bVar4 = this.f182663c;
                        boolean z17 = bVar4.f182697e;
                        com.avito.android.location_picker.providers.z zVar2 = bVar4.f182705i;
                        k kVar4 = bVar4.f182710l;
                        if (z16) {
                            if (z17) {
                                Button button3 = kVar4.f182763r;
                                if (button3 != null) {
                                    button3.setText(zVar2.getF182436b());
                                }
                            } else {
                                i142 = R.string.lp_network_error_confirmation;
                            }
                            b.O(bVar4, Integer.valueOf(i142), null, numValueOf2, bVar4.new C5354b(), 2);
                            return;
                        }
                        if (jVar instanceof q) {
                            b.O(bVar4, Integer.valueOf(R.string.location_permission_required), null, Integer.valueOf(R.string.lp_settings), bVar4.new c(), 2);
                            return;
                        }
                        if (jVar instanceof vW.i) {
                            b.O(bVar4, Integer.valueOf(R.string.loc_providers_unavailable_message), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.l) {
                            if (z17 && (button2 = kVar4.f182763r) != null) {
                                button2.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new d(), 2);
                            return;
                        }
                        if (jVar instanceof vW.k) {
                            b.O(bVar4, null, ((vW.k) jVar).f440807a, null, null, 13);
                            return;
                        }
                        if (jVar instanceof vW.r) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_not_suggested_address_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.o) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_suggests_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.h) {
                            if (bVar4.f182717s != null) {
                                return;
                            }
                            com.avito.android.location_picker.job.f fVar3 = bVar4.f182701g;
                            boolean z18 = fVar3 instanceof f.b;
                            Resources resources = bVar4.f182709k;
                            if (z18) {
                                string = resources.getString(R.string.lp_empty_address_error_for_job_assistant);
                            } else {
                                if (!(fVar3 instanceof f.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                string = resources.getString(R.string.lp_empty_address_error);
                            }
                            com.avito.android.lib.design.modal.a aVarC2 = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, bVar4.f182691b.getContext(), new b.e(string, bVar4));
                            bVar4.f182717s = aVarC2;
                            com.avito.android.lib.util.g.a(aVarC2);
                            return;
                        }
                        if (jVar instanceof C49273c) {
                            Button button4 = kVar4.f182763r;
                            if (button4 != null) {
                                button4.setText(zVar2.getF182436b());
                                return;
                            }
                            return;
                        }
                        if (jVar instanceof vW.d) {
                            Button button5 = kVar4.f182763r;
                            if (button5 != null) {
                                button5.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new f(), 2);
                            return;
                        }
                        if (jVar instanceof vW.n) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_coords_error), null, numValueOf2, null, 10);
                            return;
                        }
                        if (!(jVar instanceof vW.p)) {
                            jVar.equals(C49272b.f440797a);
                            return;
                        }
                        com.avito.android.lib.design.toast_bar.k kVar5 = bVar4.f182716r;
                        if (kVar5 != null) {
                            kVar5.f();
                            return;
                        }
                        return;
                    case 2:
                        D6.G(this.f182663c.f182710l.f182753h, ((Boolean) obj).booleanValue());
                        return;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        b bVar5 = this.f182663c;
                        if (bVar5.f182699f) {
                            return;
                        }
                        k kVar6 = bVar5.f182710l;
                        kVar6.f182747b.setLoading(zBooleanValue);
                        boolean z19 = !zBooleanValue;
                        kVar6.f182747b.setEnabled(z19);
                        kVar6.f182758m.setEnabled(z19);
                        return;
                    case 4:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        b bVar6 = this.f182663c;
                        k kVar7 = bVar6.f182710l;
                        D6.G(kVar7.f182756k, zBooleanValue2);
                        kVar7.f182749d.setLayoutParams(new CoordinatorLayout.g(-1, zBooleanValue2 ? -1 : -2));
                        boolean z22 = !zBooleanValue2;
                        D6.G(kVar7.f182757l, z22);
                        D6.G(kVar7.f182752g, z22);
                        D6.G(kVar7.f182755j, z22);
                        PublishSearchLocationInput publishSearchLocationInput3 = kVar7.f182756k;
                        if (zBooleanValue2) {
                            publishSearchLocationInput3.requestFocus();
                            publishSearchLocationInput3.q();
                            publishSearchLocationInput3.v();
                            return;
                        }
                        publishSearchLocationInput3.clearFocus();
                        D6.w(kVar7.f182760o);
                        Fragment fragment2 = bVar6.f182693c;
                        K2.e(fragment2);
                        ActivityC22955m activityC22955mL1 = fragment2.l1();
                        if ((activityC22955mL1 != null ? activityC22955mL1.getCurrentFocus() : null) == null) {
                            ActivityC22955m activityC22955mL12 = fragment2.l1();
                            Object systemService = activityC22955mL12 != null ? activityC22955mL12.getSystemService("input_method") : null;
                            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                            if (inputMethodManager != null) {
                                inputMethodManager.hideSoftInputFromWindow(bVar6.f182691b.getWindowToken(), 0);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        String str3 = (String) obj;
                        k kVar8 = this.f182663c.f182710l;
                        if (str3.equals(String.valueOf(kVar8.f182756k.m53getText()))) {
                            return;
                        }
                        Input.t(kVar8.f182756k, str3, false, 6);
                        Input.t(kVar8.f182758m, str3, false, 6);
                        return;
                    case 6:
                        Editable editableM53getText = this.f182663c.f182710l.f182756k.m53getText();
                        if (editableM53getText != null) {
                            editableM53getText.clear();
                            return;
                        }
                        return;
                    case 7:
                        List<AddressSuggestion> list = (List) obj;
                        boolean zIsEmpty = list.isEmpty();
                        b bVar7 = this.f182663c;
                        k kVar9 = bVar7.f182710l;
                        if (zIsEmpty) {
                            D6.w(kVar9.f182760o);
                            return;
                        }
                        D6.G(kVar9.f182760o, true);
                        X x13 = bVar7.f182715q;
                        x13.f182553f = list;
                        x13.notifyDataSetChanged();
                        return;
                    case 8:
                        AvitoMapCameraPosition avitoMapCameraPosition = (AvitoMapCameraPosition) obj;
                        AvitoMap avitoMap = this.f182663c.f182711m;
                        if (avitoMap != null) {
                            boolean z23 = avitoMapCameraPosition.getZoomLevel() == avitoMap.getMapTarget().getZoomLevel();
                            boolean zAlmostEqual = AvitoMapPointKt.almostEqual(avitoMapCameraPosition.getMapPoint(), avitoMap.getMapTarget().getPoint());
                            if (avitoMapCameraPosition.getViewportBounds() != null) {
                                AvitoMapBounds viewportBounds = avitoMapCameraPosition.getViewportBounds();
                                if (viewportBounds != null) {
                                    avitoMap.moveTo(viewportBounds, true);
                                    return;
                                }
                                return;
                            }
                            if (!z23 && !zAlmostEqual) {
                                avitoMap.moveTo(avitoMapCameraPosition.getMapPoint(), true, Float.valueOf(avitoMapCameraPosition.getZoomLevel()));
                                return;
                            } else if (!z23) {
                                AvitoMap.DefaultImpls.zoomTo$default(avitoMap, avitoMapCameraPosition.getZoomLevel(), false, null, 6, null);
                                return;
                            } else {
                                if (zAlmostEqual) {
                                    return;
                                }
                                AvitoMap.DefaultImpls.moveTo$default(avitoMap, avitoMapCameraPosition.getMapPoint(), true, null, 4, null);
                                return;
                            }
                        }
                        return;
                    case 9:
                        vW.f fVar4 = (vW.f) obj;
                        b bVar8 = this.f182663c;
                        com.avito.android.location_picker.view.radius.f fVar5 = bVar8.f182712n;
                        if (fVar5.f182793c == null) {
                            k kVar10 = bVar8.f182710l;
                            View view2 = kVar10.f182764s;
                            if (view2 != null) {
                                D6.w(view2);
                            }
                            View view3 = kVar10.f182765t;
                            if (view3 != null) {
                                D6.H(view3);
                            }
                            com.avito.android.location_picker.view.radius.i iVar = bVar8.f182713o;
                            if (iVar != null) {
                                List<Radius> list2 = fVar4.f440802a;
                                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                                for (Radius radius : list2) {
                                    String id2 = radius.getId();
                                    String str4 = "";
                                    if (id2 == null) {
                                        id2 = "";
                                    }
                                    String title = radius.getTitle();
                                    if (title != null) {
                                        str4 = title;
                                    }
                                    arrayList.add(new com.avito.android.location_picker.view.radius.a(id2, radius.getDistanceInMeters(), Boolean.valueOf(radius.isActive()), str4));
                                }
                                fVar5.a(iVar, arrayList);
                            }
                        }
                        if (fVar4.f440804c.longValue() == 0 || (avitoMapBounds = fVar4.f440803b) == null) {
                            return;
                        }
                        List listU = C42745f0.U(avitoMapBounds.getTopLeft(), avitoMapBounds.getBottomRight());
                        AvitoMap avitoMap2 = bVar8.f182711m;
                        if (avitoMap2 != null) {
                            AvitoMap.DefaultImpls.moveToPointsWithPadding$default(avitoMap2, listU, Integer.valueOf(bVar8.f182705i.getF182438d()), null, false, null, 28, null);
                            return;
                        }
                        return;
                    case 10:
                        b bVar9 = this.f182663c;
                        float fIntValue = (float) ((((Number) bVar9.f182719u.getValue()).intValue() * r15.f440816b) / ((s) obj).f440815a);
                        RadiusCircleViewImpl radiusCircleViewImpl = bVar9.f182710l.f182766u;
                        if (radiusCircleViewImpl != null) {
                            radiusCircleViewImpl.setRadius(fIntValue);
                            return;
                        }
                        return;
                    case 11:
                        float f12 = ((Boolean) obj).booleanValue() ? 1.0f : 0.0f;
                        RadiusCircleViewImpl radiusCircleViewImpl2 = this.f182663c.f182710l.f182766u;
                        if (radiusCircleViewImpl2 == null || (viewPropertyAnimatorAnimate = radiusCircleViewImpl2.animate()) == null || (duration = viewPropertyAnimatorAnimate.setDuration(180L)) == null || (viewPropertyAnimatorAlpha = duration.alpha(f12)) == null) {
                            return;
                        }
                        viewPropertyAnimatorAlpha.start();
                        return;
                    case 12:
                        vW.e eVar = (vW.e) obj;
                        String str5 = eVar.f440800a;
                        int length = str5.length();
                        b bVar10 = this.f182663c;
                        k kVar11 = bVar10.f182710l;
                        if (length == 0) {
                            Button button6 = kVar11.f182763r;
                            if (button6 != null) {
                                button6.setText(bVar10.f182705i.getF182435a());
                            }
                            Button button7 = kVar11.f182763r;
                            if (button7 == null) {
                                return;
                            }
                            button7.setEnabled(false);
                            return;
                        }
                        Button button8 = kVar11.f182763r;
                        if (button8 != null) {
                            button8.setText(str5);
                        }
                        Button button9 = kVar11.f182763r;
                        if (button9 == null) {
                            return;
                        }
                        button9.setEnabled(eVar.f440801b);
                        return;
                    case 13:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        k kVar12 = this.f182663c.f182710l;
                        kVar12.f182747b.setEnabled(zBooleanValue3);
                        kVar12.f182758m.setEnabled(zBooleanValue3);
                        return;
                    case 14:
                        b bVar11 = this.f182663c;
                        bVar11.f182695d.I1((AddressParameter.Value) obj, bVar11.f182707j);
                        return;
                    default:
                        b bVar12 = this.f182663c;
                        bVar12.f182720v.accept(ScreenCloseFromBlock.f182205d);
                        bVar12.f182695d.E3((Radius) obj);
                        bVar12.f182672I.accept(G0.f406611a);
                        return;
                }
            }
        };
        final int i15 = 15;
        this.f182687X = new l41.g(this) { // from class: com.avito.android.location_picker.view.publish.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f182663c;

            {
                this.f182663c = this;
            }

            @Override // l41.g
            public final void accept(Object obj) throws Resources.NotFoundException {
                String string;
                Button button2;
                AvitoMapBounds avitoMapBounds;
                ViewPropertyAnimator viewPropertyAnimatorAnimate;
                ViewPropertyAnimator duration;
                ViewPropertyAnimator viewPropertyAnimatorAlpha;
                switch (i15) {
                    case 0:
                        String str2 = (String) obj;
                        b bVar3 = this.f182663c;
                        com.avito.android.lib.design.tooltip.k kVar2 = bVar3.f182718t;
                        if (kVar2 != null) {
                            kVar2.dismiss();
                        }
                        bVar3.f182718t = null;
                        com.avito.android.lib.design.tooltip.k kVar3 = new com.avito.android.lib.design.tooltip.k(bVar3.f182691b.getContext(), 0, 0, 6, null);
                        kVar3.f181224j = new r.a(new i.a(new b.a()));
                        int i132 = kVar3.f181229o;
                        kVar3.f181228n = -2;
                        kVar3.f181229o = i132;
                        com.avito.android.lib.design.tooltip.p.a(kVar3, new b.l(str2));
                        bVar3.f182718t = kVar3.f(bVar3.f182710l.f182756k);
                        return;
                    case 1:
                        vW.j jVar = (vW.j) obj;
                        boolean z16 = jVar instanceof vW.m;
                        int i142 = R.string.lp_network_error;
                        Integer numValueOf = Integer.valueOf(R.string.lp_network_error);
                        Integer numValueOf2 = Integer.valueOf(R.string.lp_repeat);
                        b bVar4 = this.f182663c;
                        boolean z17 = bVar4.f182697e;
                        com.avito.android.location_picker.providers.z zVar2 = bVar4.f182705i;
                        k kVar4 = bVar4.f182710l;
                        if (z16) {
                            if (z17) {
                                Button button3 = kVar4.f182763r;
                                if (button3 != null) {
                                    button3.setText(zVar2.getF182436b());
                                }
                            } else {
                                i142 = R.string.lp_network_error_confirmation;
                            }
                            b.O(bVar4, Integer.valueOf(i142), null, numValueOf2, bVar4.new C5354b(), 2);
                            return;
                        }
                        if (jVar instanceof q) {
                            b.O(bVar4, Integer.valueOf(R.string.location_permission_required), null, Integer.valueOf(R.string.lp_settings), bVar4.new c(), 2);
                            return;
                        }
                        if (jVar instanceof vW.i) {
                            b.O(bVar4, Integer.valueOf(R.string.loc_providers_unavailable_message), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.l) {
                            if (z17 && (button2 = kVar4.f182763r) != null) {
                                button2.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new d(), 2);
                            return;
                        }
                        if (jVar instanceof vW.k) {
                            b.O(bVar4, null, ((vW.k) jVar).f440807a, null, null, 13);
                            return;
                        }
                        if (jVar instanceof vW.r) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_not_suggested_address_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.o) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_suggests_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.h) {
                            if (bVar4.f182717s != null) {
                                return;
                            }
                            com.avito.android.location_picker.job.f fVar3 = bVar4.f182701g;
                            boolean z18 = fVar3 instanceof f.b;
                            Resources resources = bVar4.f182709k;
                            if (z18) {
                                string = resources.getString(R.string.lp_empty_address_error_for_job_assistant);
                            } else {
                                if (!(fVar3 instanceof f.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                string = resources.getString(R.string.lp_empty_address_error);
                            }
                            com.avito.android.lib.design.modal.a aVarC2 = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, bVar4.f182691b.getContext(), new b.e(string, bVar4));
                            bVar4.f182717s = aVarC2;
                            com.avito.android.lib.util.g.a(aVarC2);
                            return;
                        }
                        if (jVar instanceof C49273c) {
                            Button button4 = kVar4.f182763r;
                            if (button4 != null) {
                                button4.setText(zVar2.getF182436b());
                                return;
                            }
                            return;
                        }
                        if (jVar instanceof vW.d) {
                            Button button5 = kVar4.f182763r;
                            if (button5 != null) {
                                button5.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new f(), 2);
                            return;
                        }
                        if (jVar instanceof vW.n) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_coords_error), null, numValueOf2, null, 10);
                            return;
                        }
                        if (!(jVar instanceof vW.p)) {
                            jVar.equals(C49272b.f440797a);
                            return;
                        }
                        com.avito.android.lib.design.toast_bar.k kVar5 = bVar4.f182716r;
                        if (kVar5 != null) {
                            kVar5.f();
                            return;
                        }
                        return;
                    case 2:
                        D6.G(this.f182663c.f182710l.f182753h, ((Boolean) obj).booleanValue());
                        return;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        b bVar5 = this.f182663c;
                        if (bVar5.f182699f) {
                            return;
                        }
                        k kVar6 = bVar5.f182710l;
                        kVar6.f182747b.setLoading(zBooleanValue);
                        boolean z19 = !zBooleanValue;
                        kVar6.f182747b.setEnabled(z19);
                        kVar6.f182758m.setEnabled(z19);
                        return;
                    case 4:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        b bVar6 = this.f182663c;
                        k kVar7 = bVar6.f182710l;
                        D6.G(kVar7.f182756k, zBooleanValue2);
                        kVar7.f182749d.setLayoutParams(new CoordinatorLayout.g(-1, zBooleanValue2 ? -1 : -2));
                        boolean z22 = !zBooleanValue2;
                        D6.G(kVar7.f182757l, z22);
                        D6.G(kVar7.f182752g, z22);
                        D6.G(kVar7.f182755j, z22);
                        PublishSearchLocationInput publishSearchLocationInput3 = kVar7.f182756k;
                        if (zBooleanValue2) {
                            publishSearchLocationInput3.requestFocus();
                            publishSearchLocationInput3.q();
                            publishSearchLocationInput3.v();
                            return;
                        }
                        publishSearchLocationInput3.clearFocus();
                        D6.w(kVar7.f182760o);
                        Fragment fragment2 = bVar6.f182693c;
                        K2.e(fragment2);
                        ActivityC22955m activityC22955mL1 = fragment2.l1();
                        if ((activityC22955mL1 != null ? activityC22955mL1.getCurrentFocus() : null) == null) {
                            ActivityC22955m activityC22955mL12 = fragment2.l1();
                            Object systemService = activityC22955mL12 != null ? activityC22955mL12.getSystemService("input_method") : null;
                            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                            if (inputMethodManager != null) {
                                inputMethodManager.hideSoftInputFromWindow(bVar6.f182691b.getWindowToken(), 0);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        String str3 = (String) obj;
                        k kVar8 = this.f182663c.f182710l;
                        if (str3.equals(String.valueOf(kVar8.f182756k.m53getText()))) {
                            return;
                        }
                        Input.t(kVar8.f182756k, str3, false, 6);
                        Input.t(kVar8.f182758m, str3, false, 6);
                        return;
                    case 6:
                        Editable editableM53getText = this.f182663c.f182710l.f182756k.m53getText();
                        if (editableM53getText != null) {
                            editableM53getText.clear();
                            return;
                        }
                        return;
                    case 7:
                        List<AddressSuggestion> list = (List) obj;
                        boolean zIsEmpty = list.isEmpty();
                        b bVar7 = this.f182663c;
                        k kVar9 = bVar7.f182710l;
                        if (zIsEmpty) {
                            D6.w(kVar9.f182760o);
                            return;
                        }
                        D6.G(kVar9.f182760o, true);
                        X x13 = bVar7.f182715q;
                        x13.f182553f = list;
                        x13.notifyDataSetChanged();
                        return;
                    case 8:
                        AvitoMapCameraPosition avitoMapCameraPosition = (AvitoMapCameraPosition) obj;
                        AvitoMap avitoMap = this.f182663c.f182711m;
                        if (avitoMap != null) {
                            boolean z23 = avitoMapCameraPosition.getZoomLevel() == avitoMap.getMapTarget().getZoomLevel();
                            boolean zAlmostEqual = AvitoMapPointKt.almostEqual(avitoMapCameraPosition.getMapPoint(), avitoMap.getMapTarget().getPoint());
                            if (avitoMapCameraPosition.getViewportBounds() != null) {
                                AvitoMapBounds viewportBounds = avitoMapCameraPosition.getViewportBounds();
                                if (viewportBounds != null) {
                                    avitoMap.moveTo(viewportBounds, true);
                                    return;
                                }
                                return;
                            }
                            if (!z23 && !zAlmostEqual) {
                                avitoMap.moveTo(avitoMapCameraPosition.getMapPoint(), true, Float.valueOf(avitoMapCameraPosition.getZoomLevel()));
                                return;
                            } else if (!z23) {
                                AvitoMap.DefaultImpls.zoomTo$default(avitoMap, avitoMapCameraPosition.getZoomLevel(), false, null, 6, null);
                                return;
                            } else {
                                if (zAlmostEqual) {
                                    return;
                                }
                                AvitoMap.DefaultImpls.moveTo$default(avitoMap, avitoMapCameraPosition.getMapPoint(), true, null, 4, null);
                                return;
                            }
                        }
                        return;
                    case 9:
                        vW.f fVar4 = (vW.f) obj;
                        b bVar8 = this.f182663c;
                        com.avito.android.location_picker.view.radius.f fVar5 = bVar8.f182712n;
                        if (fVar5.f182793c == null) {
                            k kVar10 = bVar8.f182710l;
                            View view2 = kVar10.f182764s;
                            if (view2 != null) {
                                D6.w(view2);
                            }
                            View view3 = kVar10.f182765t;
                            if (view3 != null) {
                                D6.H(view3);
                            }
                            com.avito.android.location_picker.view.radius.i iVar = bVar8.f182713o;
                            if (iVar != null) {
                                List<Radius> list2 = fVar4.f440802a;
                                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                                for (Radius radius : list2) {
                                    String id2 = radius.getId();
                                    String str4 = "";
                                    if (id2 == null) {
                                        id2 = "";
                                    }
                                    String title = radius.getTitle();
                                    if (title != null) {
                                        str4 = title;
                                    }
                                    arrayList.add(new com.avito.android.location_picker.view.radius.a(id2, radius.getDistanceInMeters(), Boolean.valueOf(radius.isActive()), str4));
                                }
                                fVar5.a(iVar, arrayList);
                            }
                        }
                        if (fVar4.f440804c.longValue() == 0 || (avitoMapBounds = fVar4.f440803b) == null) {
                            return;
                        }
                        List listU = C42745f0.U(avitoMapBounds.getTopLeft(), avitoMapBounds.getBottomRight());
                        AvitoMap avitoMap2 = bVar8.f182711m;
                        if (avitoMap2 != null) {
                            AvitoMap.DefaultImpls.moveToPointsWithPadding$default(avitoMap2, listU, Integer.valueOf(bVar8.f182705i.getF182438d()), null, false, null, 28, null);
                            return;
                        }
                        return;
                    case 10:
                        b bVar9 = this.f182663c;
                        float fIntValue = (float) ((((Number) bVar9.f182719u.getValue()).intValue() * r15.f440816b) / ((s) obj).f440815a);
                        RadiusCircleViewImpl radiusCircleViewImpl = bVar9.f182710l.f182766u;
                        if (radiusCircleViewImpl != null) {
                            radiusCircleViewImpl.setRadius(fIntValue);
                            return;
                        }
                        return;
                    case 11:
                        float f12 = ((Boolean) obj).booleanValue() ? 1.0f : 0.0f;
                        RadiusCircleViewImpl radiusCircleViewImpl2 = this.f182663c.f182710l.f182766u;
                        if (radiusCircleViewImpl2 == null || (viewPropertyAnimatorAnimate = radiusCircleViewImpl2.animate()) == null || (duration = viewPropertyAnimatorAnimate.setDuration(180L)) == null || (viewPropertyAnimatorAlpha = duration.alpha(f12)) == null) {
                            return;
                        }
                        viewPropertyAnimatorAlpha.start();
                        return;
                    case 12:
                        vW.e eVar = (vW.e) obj;
                        String str5 = eVar.f440800a;
                        int length = str5.length();
                        b bVar10 = this.f182663c;
                        k kVar11 = bVar10.f182710l;
                        if (length == 0) {
                            Button button6 = kVar11.f182763r;
                            if (button6 != null) {
                                button6.setText(bVar10.f182705i.getF182435a());
                            }
                            Button button7 = kVar11.f182763r;
                            if (button7 == null) {
                                return;
                            }
                            button7.setEnabled(false);
                            return;
                        }
                        Button button8 = kVar11.f182763r;
                        if (button8 != null) {
                            button8.setText(str5);
                        }
                        Button button9 = kVar11.f182763r;
                        if (button9 == null) {
                            return;
                        }
                        button9.setEnabled(eVar.f440801b);
                        return;
                    case 13:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        k kVar12 = this.f182663c.f182710l;
                        kVar12.f182747b.setEnabled(zBooleanValue3);
                        kVar12.f182758m.setEnabled(zBooleanValue3);
                        return;
                    case 14:
                        b bVar11 = this.f182663c;
                        bVar11.f182695d.I1((AddressParameter.Value) obj, bVar11.f182707j);
                        return;
                    default:
                        b bVar12 = this.f182663c;
                        bVar12.f182720v.accept(ScreenCloseFromBlock.f182205d);
                        bVar12.f182695d.E3((Radius) obj);
                        bVar12.f182672I.accept(G0.f406611a);
                        return;
                }
            }
        };
        final int i16 = 3;
        this.f182688Y = new l41.g(this) { // from class: com.avito.android.location_picker.view.publish.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f182663c;

            {
                this.f182663c = this;
            }

            @Override // l41.g
            public final void accept(Object obj) throws Resources.NotFoundException {
                String string;
                Button button2;
                AvitoMapBounds avitoMapBounds;
                ViewPropertyAnimator viewPropertyAnimatorAnimate;
                ViewPropertyAnimator duration;
                ViewPropertyAnimator viewPropertyAnimatorAlpha;
                switch (i16) {
                    case 0:
                        String str2 = (String) obj;
                        b bVar3 = this.f182663c;
                        com.avito.android.lib.design.tooltip.k kVar2 = bVar3.f182718t;
                        if (kVar2 != null) {
                            kVar2.dismiss();
                        }
                        bVar3.f182718t = null;
                        com.avito.android.lib.design.tooltip.k kVar3 = new com.avito.android.lib.design.tooltip.k(bVar3.f182691b.getContext(), 0, 0, 6, null);
                        kVar3.f181224j = new r.a(new i.a(new b.a()));
                        int i132 = kVar3.f181229o;
                        kVar3.f181228n = -2;
                        kVar3.f181229o = i132;
                        com.avito.android.lib.design.tooltip.p.a(kVar3, new b.l(str2));
                        bVar3.f182718t = kVar3.f(bVar3.f182710l.f182756k);
                        return;
                    case 1:
                        vW.j jVar = (vW.j) obj;
                        boolean z16 = jVar instanceof vW.m;
                        int i142 = R.string.lp_network_error;
                        Integer numValueOf = Integer.valueOf(R.string.lp_network_error);
                        Integer numValueOf2 = Integer.valueOf(R.string.lp_repeat);
                        b bVar4 = this.f182663c;
                        boolean z17 = bVar4.f182697e;
                        com.avito.android.location_picker.providers.z zVar2 = bVar4.f182705i;
                        k kVar4 = bVar4.f182710l;
                        if (z16) {
                            if (z17) {
                                Button button3 = kVar4.f182763r;
                                if (button3 != null) {
                                    button3.setText(zVar2.getF182436b());
                                }
                            } else {
                                i142 = R.string.lp_network_error_confirmation;
                            }
                            b.O(bVar4, Integer.valueOf(i142), null, numValueOf2, bVar4.new C5354b(), 2);
                            return;
                        }
                        if (jVar instanceof q) {
                            b.O(bVar4, Integer.valueOf(R.string.location_permission_required), null, Integer.valueOf(R.string.lp_settings), bVar4.new c(), 2);
                            return;
                        }
                        if (jVar instanceof vW.i) {
                            b.O(bVar4, Integer.valueOf(R.string.loc_providers_unavailable_message), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.l) {
                            if (z17 && (button2 = kVar4.f182763r) != null) {
                                button2.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new d(), 2);
                            return;
                        }
                        if (jVar instanceof vW.k) {
                            b.O(bVar4, null, ((vW.k) jVar).f440807a, null, null, 13);
                            return;
                        }
                        if (jVar instanceof vW.r) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_not_suggested_address_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.o) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_suggests_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.h) {
                            if (bVar4.f182717s != null) {
                                return;
                            }
                            com.avito.android.location_picker.job.f fVar3 = bVar4.f182701g;
                            boolean z18 = fVar3 instanceof f.b;
                            Resources resources = bVar4.f182709k;
                            if (z18) {
                                string = resources.getString(R.string.lp_empty_address_error_for_job_assistant);
                            } else {
                                if (!(fVar3 instanceof f.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                string = resources.getString(R.string.lp_empty_address_error);
                            }
                            com.avito.android.lib.design.modal.a aVarC2 = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, bVar4.f182691b.getContext(), new b.e(string, bVar4));
                            bVar4.f182717s = aVarC2;
                            com.avito.android.lib.util.g.a(aVarC2);
                            return;
                        }
                        if (jVar instanceof C49273c) {
                            Button button4 = kVar4.f182763r;
                            if (button4 != null) {
                                button4.setText(zVar2.getF182436b());
                                return;
                            }
                            return;
                        }
                        if (jVar instanceof vW.d) {
                            Button button5 = kVar4.f182763r;
                            if (button5 != null) {
                                button5.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new f(), 2);
                            return;
                        }
                        if (jVar instanceof vW.n) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_coords_error), null, numValueOf2, null, 10);
                            return;
                        }
                        if (!(jVar instanceof vW.p)) {
                            jVar.equals(C49272b.f440797a);
                            return;
                        }
                        com.avito.android.lib.design.toast_bar.k kVar5 = bVar4.f182716r;
                        if (kVar5 != null) {
                            kVar5.f();
                            return;
                        }
                        return;
                    case 2:
                        D6.G(this.f182663c.f182710l.f182753h, ((Boolean) obj).booleanValue());
                        return;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        b bVar5 = this.f182663c;
                        if (bVar5.f182699f) {
                            return;
                        }
                        k kVar6 = bVar5.f182710l;
                        kVar6.f182747b.setLoading(zBooleanValue);
                        boolean z19 = !zBooleanValue;
                        kVar6.f182747b.setEnabled(z19);
                        kVar6.f182758m.setEnabled(z19);
                        return;
                    case 4:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        b bVar6 = this.f182663c;
                        k kVar7 = bVar6.f182710l;
                        D6.G(kVar7.f182756k, zBooleanValue2);
                        kVar7.f182749d.setLayoutParams(new CoordinatorLayout.g(-1, zBooleanValue2 ? -1 : -2));
                        boolean z22 = !zBooleanValue2;
                        D6.G(kVar7.f182757l, z22);
                        D6.G(kVar7.f182752g, z22);
                        D6.G(kVar7.f182755j, z22);
                        PublishSearchLocationInput publishSearchLocationInput3 = kVar7.f182756k;
                        if (zBooleanValue2) {
                            publishSearchLocationInput3.requestFocus();
                            publishSearchLocationInput3.q();
                            publishSearchLocationInput3.v();
                            return;
                        }
                        publishSearchLocationInput3.clearFocus();
                        D6.w(kVar7.f182760o);
                        Fragment fragment2 = bVar6.f182693c;
                        K2.e(fragment2);
                        ActivityC22955m activityC22955mL1 = fragment2.l1();
                        if ((activityC22955mL1 != null ? activityC22955mL1.getCurrentFocus() : null) == null) {
                            ActivityC22955m activityC22955mL12 = fragment2.l1();
                            Object systemService = activityC22955mL12 != null ? activityC22955mL12.getSystemService("input_method") : null;
                            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                            if (inputMethodManager != null) {
                                inputMethodManager.hideSoftInputFromWindow(bVar6.f182691b.getWindowToken(), 0);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        String str3 = (String) obj;
                        k kVar8 = this.f182663c.f182710l;
                        if (str3.equals(String.valueOf(kVar8.f182756k.m53getText()))) {
                            return;
                        }
                        Input.t(kVar8.f182756k, str3, false, 6);
                        Input.t(kVar8.f182758m, str3, false, 6);
                        return;
                    case 6:
                        Editable editableM53getText = this.f182663c.f182710l.f182756k.m53getText();
                        if (editableM53getText != null) {
                            editableM53getText.clear();
                            return;
                        }
                        return;
                    case 7:
                        List<AddressSuggestion> list = (List) obj;
                        boolean zIsEmpty = list.isEmpty();
                        b bVar7 = this.f182663c;
                        k kVar9 = bVar7.f182710l;
                        if (zIsEmpty) {
                            D6.w(kVar9.f182760o);
                            return;
                        }
                        D6.G(kVar9.f182760o, true);
                        X x13 = bVar7.f182715q;
                        x13.f182553f = list;
                        x13.notifyDataSetChanged();
                        return;
                    case 8:
                        AvitoMapCameraPosition avitoMapCameraPosition = (AvitoMapCameraPosition) obj;
                        AvitoMap avitoMap = this.f182663c.f182711m;
                        if (avitoMap != null) {
                            boolean z23 = avitoMapCameraPosition.getZoomLevel() == avitoMap.getMapTarget().getZoomLevel();
                            boolean zAlmostEqual = AvitoMapPointKt.almostEqual(avitoMapCameraPosition.getMapPoint(), avitoMap.getMapTarget().getPoint());
                            if (avitoMapCameraPosition.getViewportBounds() != null) {
                                AvitoMapBounds viewportBounds = avitoMapCameraPosition.getViewportBounds();
                                if (viewportBounds != null) {
                                    avitoMap.moveTo(viewportBounds, true);
                                    return;
                                }
                                return;
                            }
                            if (!z23 && !zAlmostEqual) {
                                avitoMap.moveTo(avitoMapCameraPosition.getMapPoint(), true, Float.valueOf(avitoMapCameraPosition.getZoomLevel()));
                                return;
                            } else if (!z23) {
                                AvitoMap.DefaultImpls.zoomTo$default(avitoMap, avitoMapCameraPosition.getZoomLevel(), false, null, 6, null);
                                return;
                            } else {
                                if (zAlmostEqual) {
                                    return;
                                }
                                AvitoMap.DefaultImpls.moveTo$default(avitoMap, avitoMapCameraPosition.getMapPoint(), true, null, 4, null);
                                return;
                            }
                        }
                        return;
                    case 9:
                        vW.f fVar4 = (vW.f) obj;
                        b bVar8 = this.f182663c;
                        com.avito.android.location_picker.view.radius.f fVar5 = bVar8.f182712n;
                        if (fVar5.f182793c == null) {
                            k kVar10 = bVar8.f182710l;
                            View view2 = kVar10.f182764s;
                            if (view2 != null) {
                                D6.w(view2);
                            }
                            View view3 = kVar10.f182765t;
                            if (view3 != null) {
                                D6.H(view3);
                            }
                            com.avito.android.location_picker.view.radius.i iVar = bVar8.f182713o;
                            if (iVar != null) {
                                List<Radius> list2 = fVar4.f440802a;
                                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                                for (Radius radius : list2) {
                                    String id2 = radius.getId();
                                    String str4 = "";
                                    if (id2 == null) {
                                        id2 = "";
                                    }
                                    String title = radius.getTitle();
                                    if (title != null) {
                                        str4 = title;
                                    }
                                    arrayList.add(new com.avito.android.location_picker.view.radius.a(id2, radius.getDistanceInMeters(), Boolean.valueOf(radius.isActive()), str4));
                                }
                                fVar5.a(iVar, arrayList);
                            }
                        }
                        if (fVar4.f440804c.longValue() == 0 || (avitoMapBounds = fVar4.f440803b) == null) {
                            return;
                        }
                        List listU = C42745f0.U(avitoMapBounds.getTopLeft(), avitoMapBounds.getBottomRight());
                        AvitoMap avitoMap2 = bVar8.f182711m;
                        if (avitoMap2 != null) {
                            AvitoMap.DefaultImpls.moveToPointsWithPadding$default(avitoMap2, listU, Integer.valueOf(bVar8.f182705i.getF182438d()), null, false, null, 28, null);
                            return;
                        }
                        return;
                    case 10:
                        b bVar9 = this.f182663c;
                        float fIntValue = (float) ((((Number) bVar9.f182719u.getValue()).intValue() * r15.f440816b) / ((s) obj).f440815a);
                        RadiusCircleViewImpl radiusCircleViewImpl = bVar9.f182710l.f182766u;
                        if (radiusCircleViewImpl != null) {
                            radiusCircleViewImpl.setRadius(fIntValue);
                            return;
                        }
                        return;
                    case 11:
                        float f12 = ((Boolean) obj).booleanValue() ? 1.0f : 0.0f;
                        RadiusCircleViewImpl radiusCircleViewImpl2 = this.f182663c.f182710l.f182766u;
                        if (radiusCircleViewImpl2 == null || (viewPropertyAnimatorAnimate = radiusCircleViewImpl2.animate()) == null || (duration = viewPropertyAnimatorAnimate.setDuration(180L)) == null || (viewPropertyAnimatorAlpha = duration.alpha(f12)) == null) {
                            return;
                        }
                        viewPropertyAnimatorAlpha.start();
                        return;
                    case 12:
                        vW.e eVar = (vW.e) obj;
                        String str5 = eVar.f440800a;
                        int length = str5.length();
                        b bVar10 = this.f182663c;
                        k kVar11 = bVar10.f182710l;
                        if (length == 0) {
                            Button button6 = kVar11.f182763r;
                            if (button6 != null) {
                                button6.setText(bVar10.f182705i.getF182435a());
                            }
                            Button button7 = kVar11.f182763r;
                            if (button7 == null) {
                                return;
                            }
                            button7.setEnabled(false);
                            return;
                        }
                        Button button8 = kVar11.f182763r;
                        if (button8 != null) {
                            button8.setText(str5);
                        }
                        Button button9 = kVar11.f182763r;
                        if (button9 == null) {
                            return;
                        }
                        button9.setEnabled(eVar.f440801b);
                        return;
                    case 13:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        k kVar12 = this.f182663c.f182710l;
                        kVar12.f182747b.setEnabled(zBooleanValue3);
                        kVar12.f182758m.setEnabled(zBooleanValue3);
                        return;
                    case 14:
                        b bVar11 = this.f182663c;
                        bVar11.f182695d.I1((AddressParameter.Value) obj, bVar11.f182707j);
                        return;
                    default:
                        b bVar12 = this.f182663c;
                        bVar12.f182720v.accept(ScreenCloseFromBlock.f182205d);
                        bVar12.f182695d.E3((Radius) obj);
                        bVar12.f182672I.accept(G0.f406611a);
                        return;
                }
            }
        };
        final int i17 = 0;
        this.f182689Z = new l41.g(this) { // from class: com.avito.android.location_picker.view.publish.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f182663c;

            {
                this.f182663c = this;
            }

            @Override // l41.g
            public final void accept(Object obj) throws Resources.NotFoundException {
                String string;
                Button button2;
                AvitoMapBounds avitoMapBounds;
                ViewPropertyAnimator viewPropertyAnimatorAnimate;
                ViewPropertyAnimator duration;
                ViewPropertyAnimator viewPropertyAnimatorAlpha;
                switch (i17) {
                    case 0:
                        String str2 = (String) obj;
                        b bVar3 = this.f182663c;
                        com.avito.android.lib.design.tooltip.k kVar2 = bVar3.f182718t;
                        if (kVar2 != null) {
                            kVar2.dismiss();
                        }
                        bVar3.f182718t = null;
                        com.avito.android.lib.design.tooltip.k kVar3 = new com.avito.android.lib.design.tooltip.k(bVar3.f182691b.getContext(), 0, 0, 6, null);
                        kVar3.f181224j = new r.a(new i.a(new b.a()));
                        int i132 = kVar3.f181229o;
                        kVar3.f181228n = -2;
                        kVar3.f181229o = i132;
                        com.avito.android.lib.design.tooltip.p.a(kVar3, new b.l(str2));
                        bVar3.f182718t = kVar3.f(bVar3.f182710l.f182756k);
                        return;
                    case 1:
                        vW.j jVar = (vW.j) obj;
                        boolean z16 = jVar instanceof vW.m;
                        int i142 = R.string.lp_network_error;
                        Integer numValueOf = Integer.valueOf(R.string.lp_network_error);
                        Integer numValueOf2 = Integer.valueOf(R.string.lp_repeat);
                        b bVar4 = this.f182663c;
                        boolean z17 = bVar4.f182697e;
                        com.avito.android.location_picker.providers.z zVar2 = bVar4.f182705i;
                        k kVar4 = bVar4.f182710l;
                        if (z16) {
                            if (z17) {
                                Button button3 = kVar4.f182763r;
                                if (button3 != null) {
                                    button3.setText(zVar2.getF182436b());
                                }
                            } else {
                                i142 = R.string.lp_network_error_confirmation;
                            }
                            b.O(bVar4, Integer.valueOf(i142), null, numValueOf2, bVar4.new C5354b(), 2);
                            return;
                        }
                        if (jVar instanceof q) {
                            b.O(bVar4, Integer.valueOf(R.string.location_permission_required), null, Integer.valueOf(R.string.lp_settings), bVar4.new c(), 2);
                            return;
                        }
                        if (jVar instanceof vW.i) {
                            b.O(bVar4, Integer.valueOf(R.string.loc_providers_unavailable_message), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.l) {
                            if (z17 && (button2 = kVar4.f182763r) != null) {
                                button2.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new d(), 2);
                            return;
                        }
                        if (jVar instanceof vW.k) {
                            b.O(bVar4, null, ((vW.k) jVar).f440807a, null, null, 13);
                            return;
                        }
                        if (jVar instanceof vW.r) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_not_suggested_address_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.o) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_suggests_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.h) {
                            if (bVar4.f182717s != null) {
                                return;
                            }
                            com.avito.android.location_picker.job.f fVar3 = bVar4.f182701g;
                            boolean z18 = fVar3 instanceof f.b;
                            Resources resources = bVar4.f182709k;
                            if (z18) {
                                string = resources.getString(R.string.lp_empty_address_error_for_job_assistant);
                            } else {
                                if (!(fVar3 instanceof f.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                string = resources.getString(R.string.lp_empty_address_error);
                            }
                            com.avito.android.lib.design.modal.a aVarC2 = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, bVar4.f182691b.getContext(), new b.e(string, bVar4));
                            bVar4.f182717s = aVarC2;
                            com.avito.android.lib.util.g.a(aVarC2);
                            return;
                        }
                        if (jVar instanceof C49273c) {
                            Button button4 = kVar4.f182763r;
                            if (button4 != null) {
                                button4.setText(zVar2.getF182436b());
                                return;
                            }
                            return;
                        }
                        if (jVar instanceof vW.d) {
                            Button button5 = kVar4.f182763r;
                            if (button5 != null) {
                                button5.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new f(), 2);
                            return;
                        }
                        if (jVar instanceof vW.n) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_coords_error), null, numValueOf2, null, 10);
                            return;
                        }
                        if (!(jVar instanceof vW.p)) {
                            jVar.equals(C49272b.f440797a);
                            return;
                        }
                        com.avito.android.lib.design.toast_bar.k kVar5 = bVar4.f182716r;
                        if (kVar5 != null) {
                            kVar5.f();
                            return;
                        }
                        return;
                    case 2:
                        D6.G(this.f182663c.f182710l.f182753h, ((Boolean) obj).booleanValue());
                        return;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        b bVar5 = this.f182663c;
                        if (bVar5.f182699f) {
                            return;
                        }
                        k kVar6 = bVar5.f182710l;
                        kVar6.f182747b.setLoading(zBooleanValue);
                        boolean z19 = !zBooleanValue;
                        kVar6.f182747b.setEnabled(z19);
                        kVar6.f182758m.setEnabled(z19);
                        return;
                    case 4:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        b bVar6 = this.f182663c;
                        k kVar7 = bVar6.f182710l;
                        D6.G(kVar7.f182756k, zBooleanValue2);
                        kVar7.f182749d.setLayoutParams(new CoordinatorLayout.g(-1, zBooleanValue2 ? -1 : -2));
                        boolean z22 = !zBooleanValue2;
                        D6.G(kVar7.f182757l, z22);
                        D6.G(kVar7.f182752g, z22);
                        D6.G(kVar7.f182755j, z22);
                        PublishSearchLocationInput publishSearchLocationInput3 = kVar7.f182756k;
                        if (zBooleanValue2) {
                            publishSearchLocationInput3.requestFocus();
                            publishSearchLocationInput3.q();
                            publishSearchLocationInput3.v();
                            return;
                        }
                        publishSearchLocationInput3.clearFocus();
                        D6.w(kVar7.f182760o);
                        Fragment fragment2 = bVar6.f182693c;
                        K2.e(fragment2);
                        ActivityC22955m activityC22955mL1 = fragment2.l1();
                        if ((activityC22955mL1 != null ? activityC22955mL1.getCurrentFocus() : null) == null) {
                            ActivityC22955m activityC22955mL12 = fragment2.l1();
                            Object systemService = activityC22955mL12 != null ? activityC22955mL12.getSystemService("input_method") : null;
                            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                            if (inputMethodManager != null) {
                                inputMethodManager.hideSoftInputFromWindow(bVar6.f182691b.getWindowToken(), 0);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        String str3 = (String) obj;
                        k kVar8 = this.f182663c.f182710l;
                        if (str3.equals(String.valueOf(kVar8.f182756k.m53getText()))) {
                            return;
                        }
                        Input.t(kVar8.f182756k, str3, false, 6);
                        Input.t(kVar8.f182758m, str3, false, 6);
                        return;
                    case 6:
                        Editable editableM53getText = this.f182663c.f182710l.f182756k.m53getText();
                        if (editableM53getText != null) {
                            editableM53getText.clear();
                            return;
                        }
                        return;
                    case 7:
                        List<AddressSuggestion> list = (List) obj;
                        boolean zIsEmpty = list.isEmpty();
                        b bVar7 = this.f182663c;
                        k kVar9 = bVar7.f182710l;
                        if (zIsEmpty) {
                            D6.w(kVar9.f182760o);
                            return;
                        }
                        D6.G(kVar9.f182760o, true);
                        X x13 = bVar7.f182715q;
                        x13.f182553f = list;
                        x13.notifyDataSetChanged();
                        return;
                    case 8:
                        AvitoMapCameraPosition avitoMapCameraPosition = (AvitoMapCameraPosition) obj;
                        AvitoMap avitoMap = this.f182663c.f182711m;
                        if (avitoMap != null) {
                            boolean z23 = avitoMapCameraPosition.getZoomLevel() == avitoMap.getMapTarget().getZoomLevel();
                            boolean zAlmostEqual = AvitoMapPointKt.almostEqual(avitoMapCameraPosition.getMapPoint(), avitoMap.getMapTarget().getPoint());
                            if (avitoMapCameraPosition.getViewportBounds() != null) {
                                AvitoMapBounds viewportBounds = avitoMapCameraPosition.getViewportBounds();
                                if (viewportBounds != null) {
                                    avitoMap.moveTo(viewportBounds, true);
                                    return;
                                }
                                return;
                            }
                            if (!z23 && !zAlmostEqual) {
                                avitoMap.moveTo(avitoMapCameraPosition.getMapPoint(), true, Float.valueOf(avitoMapCameraPosition.getZoomLevel()));
                                return;
                            } else if (!z23) {
                                AvitoMap.DefaultImpls.zoomTo$default(avitoMap, avitoMapCameraPosition.getZoomLevel(), false, null, 6, null);
                                return;
                            } else {
                                if (zAlmostEqual) {
                                    return;
                                }
                                AvitoMap.DefaultImpls.moveTo$default(avitoMap, avitoMapCameraPosition.getMapPoint(), true, null, 4, null);
                                return;
                            }
                        }
                        return;
                    case 9:
                        vW.f fVar4 = (vW.f) obj;
                        b bVar8 = this.f182663c;
                        com.avito.android.location_picker.view.radius.f fVar5 = bVar8.f182712n;
                        if (fVar5.f182793c == null) {
                            k kVar10 = bVar8.f182710l;
                            View view2 = kVar10.f182764s;
                            if (view2 != null) {
                                D6.w(view2);
                            }
                            View view3 = kVar10.f182765t;
                            if (view3 != null) {
                                D6.H(view3);
                            }
                            com.avito.android.location_picker.view.radius.i iVar = bVar8.f182713o;
                            if (iVar != null) {
                                List<Radius> list2 = fVar4.f440802a;
                                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                                for (Radius radius : list2) {
                                    String id2 = radius.getId();
                                    String str4 = "";
                                    if (id2 == null) {
                                        id2 = "";
                                    }
                                    String title = radius.getTitle();
                                    if (title != null) {
                                        str4 = title;
                                    }
                                    arrayList.add(new com.avito.android.location_picker.view.radius.a(id2, radius.getDistanceInMeters(), Boolean.valueOf(radius.isActive()), str4));
                                }
                                fVar5.a(iVar, arrayList);
                            }
                        }
                        if (fVar4.f440804c.longValue() == 0 || (avitoMapBounds = fVar4.f440803b) == null) {
                            return;
                        }
                        List listU = C42745f0.U(avitoMapBounds.getTopLeft(), avitoMapBounds.getBottomRight());
                        AvitoMap avitoMap2 = bVar8.f182711m;
                        if (avitoMap2 != null) {
                            AvitoMap.DefaultImpls.moveToPointsWithPadding$default(avitoMap2, listU, Integer.valueOf(bVar8.f182705i.getF182438d()), null, false, null, 28, null);
                            return;
                        }
                        return;
                    case 10:
                        b bVar9 = this.f182663c;
                        float fIntValue = (float) ((((Number) bVar9.f182719u.getValue()).intValue() * r15.f440816b) / ((s) obj).f440815a);
                        RadiusCircleViewImpl radiusCircleViewImpl = bVar9.f182710l.f182766u;
                        if (radiusCircleViewImpl != null) {
                            radiusCircleViewImpl.setRadius(fIntValue);
                            return;
                        }
                        return;
                    case 11:
                        float f12 = ((Boolean) obj).booleanValue() ? 1.0f : 0.0f;
                        RadiusCircleViewImpl radiusCircleViewImpl2 = this.f182663c.f182710l.f182766u;
                        if (radiusCircleViewImpl2 == null || (viewPropertyAnimatorAnimate = radiusCircleViewImpl2.animate()) == null || (duration = viewPropertyAnimatorAnimate.setDuration(180L)) == null || (viewPropertyAnimatorAlpha = duration.alpha(f12)) == null) {
                            return;
                        }
                        viewPropertyAnimatorAlpha.start();
                        return;
                    case 12:
                        vW.e eVar = (vW.e) obj;
                        String str5 = eVar.f440800a;
                        int length = str5.length();
                        b bVar10 = this.f182663c;
                        k kVar11 = bVar10.f182710l;
                        if (length == 0) {
                            Button button6 = kVar11.f182763r;
                            if (button6 != null) {
                                button6.setText(bVar10.f182705i.getF182435a());
                            }
                            Button button7 = kVar11.f182763r;
                            if (button7 == null) {
                                return;
                            }
                            button7.setEnabled(false);
                            return;
                        }
                        Button button8 = kVar11.f182763r;
                        if (button8 != null) {
                            button8.setText(str5);
                        }
                        Button button9 = kVar11.f182763r;
                        if (button9 == null) {
                            return;
                        }
                        button9.setEnabled(eVar.f440801b);
                        return;
                    case 13:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        k kVar12 = this.f182663c.f182710l;
                        kVar12.f182747b.setEnabled(zBooleanValue3);
                        kVar12.f182758m.setEnabled(zBooleanValue3);
                        return;
                    case 14:
                        b bVar11 = this.f182663c;
                        bVar11.f182695d.I1((AddressParameter.Value) obj, bVar11.f182707j);
                        return;
                    default:
                        b bVar12 = this.f182663c;
                        bVar12.f182720v.accept(ScreenCloseFromBlock.f182205d);
                        bVar12.f182695d.E3((Radius) obj);
                        bVar12.f182672I.accept(G0.f406611a);
                        return;
                }
            }
        };
        final int i18 = 4;
        this.f182690a0 = new l41.g(this) { // from class: com.avito.android.location_picker.view.publish.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f182663c;

            {
                this.f182663c = this;
            }

            @Override // l41.g
            public final void accept(Object obj) throws Resources.NotFoundException {
                String string;
                Button button2;
                AvitoMapBounds avitoMapBounds;
                ViewPropertyAnimator viewPropertyAnimatorAnimate;
                ViewPropertyAnimator duration;
                ViewPropertyAnimator viewPropertyAnimatorAlpha;
                switch (i18) {
                    case 0:
                        String str2 = (String) obj;
                        b bVar3 = this.f182663c;
                        com.avito.android.lib.design.tooltip.k kVar2 = bVar3.f182718t;
                        if (kVar2 != null) {
                            kVar2.dismiss();
                        }
                        bVar3.f182718t = null;
                        com.avito.android.lib.design.tooltip.k kVar3 = new com.avito.android.lib.design.tooltip.k(bVar3.f182691b.getContext(), 0, 0, 6, null);
                        kVar3.f181224j = new r.a(new i.a(new b.a()));
                        int i132 = kVar3.f181229o;
                        kVar3.f181228n = -2;
                        kVar3.f181229o = i132;
                        com.avito.android.lib.design.tooltip.p.a(kVar3, new b.l(str2));
                        bVar3.f182718t = kVar3.f(bVar3.f182710l.f182756k);
                        return;
                    case 1:
                        vW.j jVar = (vW.j) obj;
                        boolean z16 = jVar instanceof vW.m;
                        int i142 = R.string.lp_network_error;
                        Integer numValueOf = Integer.valueOf(R.string.lp_network_error);
                        Integer numValueOf2 = Integer.valueOf(R.string.lp_repeat);
                        b bVar4 = this.f182663c;
                        boolean z17 = bVar4.f182697e;
                        com.avito.android.location_picker.providers.z zVar2 = bVar4.f182705i;
                        k kVar4 = bVar4.f182710l;
                        if (z16) {
                            if (z17) {
                                Button button3 = kVar4.f182763r;
                                if (button3 != null) {
                                    button3.setText(zVar2.getF182436b());
                                }
                            } else {
                                i142 = R.string.lp_network_error_confirmation;
                            }
                            b.O(bVar4, Integer.valueOf(i142), null, numValueOf2, bVar4.new C5354b(), 2);
                            return;
                        }
                        if (jVar instanceof q) {
                            b.O(bVar4, Integer.valueOf(R.string.location_permission_required), null, Integer.valueOf(R.string.lp_settings), bVar4.new c(), 2);
                            return;
                        }
                        if (jVar instanceof vW.i) {
                            b.O(bVar4, Integer.valueOf(R.string.loc_providers_unavailable_message), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.l) {
                            if (z17 && (button2 = kVar4.f182763r) != null) {
                                button2.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new d(), 2);
                            return;
                        }
                        if (jVar instanceof vW.k) {
                            b.O(bVar4, null, ((vW.k) jVar).f440807a, null, null, 13);
                            return;
                        }
                        if (jVar instanceof vW.r) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_not_suggested_address_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.o) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_suggests_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.h) {
                            if (bVar4.f182717s != null) {
                                return;
                            }
                            com.avito.android.location_picker.job.f fVar3 = bVar4.f182701g;
                            boolean z18 = fVar3 instanceof f.b;
                            Resources resources = bVar4.f182709k;
                            if (z18) {
                                string = resources.getString(R.string.lp_empty_address_error_for_job_assistant);
                            } else {
                                if (!(fVar3 instanceof f.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                string = resources.getString(R.string.lp_empty_address_error);
                            }
                            com.avito.android.lib.design.modal.a aVarC2 = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, bVar4.f182691b.getContext(), new b.e(string, bVar4));
                            bVar4.f182717s = aVarC2;
                            com.avito.android.lib.util.g.a(aVarC2);
                            return;
                        }
                        if (jVar instanceof C49273c) {
                            Button button4 = kVar4.f182763r;
                            if (button4 != null) {
                                button4.setText(zVar2.getF182436b());
                                return;
                            }
                            return;
                        }
                        if (jVar instanceof vW.d) {
                            Button button5 = kVar4.f182763r;
                            if (button5 != null) {
                                button5.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new f(), 2);
                            return;
                        }
                        if (jVar instanceof vW.n) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_coords_error), null, numValueOf2, null, 10);
                            return;
                        }
                        if (!(jVar instanceof vW.p)) {
                            jVar.equals(C49272b.f440797a);
                            return;
                        }
                        com.avito.android.lib.design.toast_bar.k kVar5 = bVar4.f182716r;
                        if (kVar5 != null) {
                            kVar5.f();
                            return;
                        }
                        return;
                    case 2:
                        D6.G(this.f182663c.f182710l.f182753h, ((Boolean) obj).booleanValue());
                        return;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        b bVar5 = this.f182663c;
                        if (bVar5.f182699f) {
                            return;
                        }
                        k kVar6 = bVar5.f182710l;
                        kVar6.f182747b.setLoading(zBooleanValue);
                        boolean z19 = !zBooleanValue;
                        kVar6.f182747b.setEnabled(z19);
                        kVar6.f182758m.setEnabled(z19);
                        return;
                    case 4:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        b bVar6 = this.f182663c;
                        k kVar7 = bVar6.f182710l;
                        D6.G(kVar7.f182756k, zBooleanValue2);
                        kVar7.f182749d.setLayoutParams(new CoordinatorLayout.g(-1, zBooleanValue2 ? -1 : -2));
                        boolean z22 = !zBooleanValue2;
                        D6.G(kVar7.f182757l, z22);
                        D6.G(kVar7.f182752g, z22);
                        D6.G(kVar7.f182755j, z22);
                        PublishSearchLocationInput publishSearchLocationInput3 = kVar7.f182756k;
                        if (zBooleanValue2) {
                            publishSearchLocationInput3.requestFocus();
                            publishSearchLocationInput3.q();
                            publishSearchLocationInput3.v();
                            return;
                        }
                        publishSearchLocationInput3.clearFocus();
                        D6.w(kVar7.f182760o);
                        Fragment fragment2 = bVar6.f182693c;
                        K2.e(fragment2);
                        ActivityC22955m activityC22955mL1 = fragment2.l1();
                        if ((activityC22955mL1 != null ? activityC22955mL1.getCurrentFocus() : null) == null) {
                            ActivityC22955m activityC22955mL12 = fragment2.l1();
                            Object systemService = activityC22955mL12 != null ? activityC22955mL12.getSystemService("input_method") : null;
                            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                            if (inputMethodManager != null) {
                                inputMethodManager.hideSoftInputFromWindow(bVar6.f182691b.getWindowToken(), 0);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        String str3 = (String) obj;
                        k kVar8 = this.f182663c.f182710l;
                        if (str3.equals(String.valueOf(kVar8.f182756k.m53getText()))) {
                            return;
                        }
                        Input.t(kVar8.f182756k, str3, false, 6);
                        Input.t(kVar8.f182758m, str3, false, 6);
                        return;
                    case 6:
                        Editable editableM53getText = this.f182663c.f182710l.f182756k.m53getText();
                        if (editableM53getText != null) {
                            editableM53getText.clear();
                            return;
                        }
                        return;
                    case 7:
                        List<AddressSuggestion> list = (List) obj;
                        boolean zIsEmpty = list.isEmpty();
                        b bVar7 = this.f182663c;
                        k kVar9 = bVar7.f182710l;
                        if (zIsEmpty) {
                            D6.w(kVar9.f182760o);
                            return;
                        }
                        D6.G(kVar9.f182760o, true);
                        X x13 = bVar7.f182715q;
                        x13.f182553f = list;
                        x13.notifyDataSetChanged();
                        return;
                    case 8:
                        AvitoMapCameraPosition avitoMapCameraPosition = (AvitoMapCameraPosition) obj;
                        AvitoMap avitoMap = this.f182663c.f182711m;
                        if (avitoMap != null) {
                            boolean z23 = avitoMapCameraPosition.getZoomLevel() == avitoMap.getMapTarget().getZoomLevel();
                            boolean zAlmostEqual = AvitoMapPointKt.almostEqual(avitoMapCameraPosition.getMapPoint(), avitoMap.getMapTarget().getPoint());
                            if (avitoMapCameraPosition.getViewportBounds() != null) {
                                AvitoMapBounds viewportBounds = avitoMapCameraPosition.getViewportBounds();
                                if (viewportBounds != null) {
                                    avitoMap.moveTo(viewportBounds, true);
                                    return;
                                }
                                return;
                            }
                            if (!z23 && !zAlmostEqual) {
                                avitoMap.moveTo(avitoMapCameraPosition.getMapPoint(), true, Float.valueOf(avitoMapCameraPosition.getZoomLevel()));
                                return;
                            } else if (!z23) {
                                AvitoMap.DefaultImpls.zoomTo$default(avitoMap, avitoMapCameraPosition.getZoomLevel(), false, null, 6, null);
                                return;
                            } else {
                                if (zAlmostEqual) {
                                    return;
                                }
                                AvitoMap.DefaultImpls.moveTo$default(avitoMap, avitoMapCameraPosition.getMapPoint(), true, null, 4, null);
                                return;
                            }
                        }
                        return;
                    case 9:
                        vW.f fVar4 = (vW.f) obj;
                        b bVar8 = this.f182663c;
                        com.avito.android.location_picker.view.radius.f fVar5 = bVar8.f182712n;
                        if (fVar5.f182793c == null) {
                            k kVar10 = bVar8.f182710l;
                            View view2 = kVar10.f182764s;
                            if (view2 != null) {
                                D6.w(view2);
                            }
                            View view3 = kVar10.f182765t;
                            if (view3 != null) {
                                D6.H(view3);
                            }
                            com.avito.android.location_picker.view.radius.i iVar = bVar8.f182713o;
                            if (iVar != null) {
                                List<Radius> list2 = fVar4.f440802a;
                                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                                for (Radius radius : list2) {
                                    String id2 = radius.getId();
                                    String str4 = "";
                                    if (id2 == null) {
                                        id2 = "";
                                    }
                                    String title = radius.getTitle();
                                    if (title != null) {
                                        str4 = title;
                                    }
                                    arrayList.add(new com.avito.android.location_picker.view.radius.a(id2, radius.getDistanceInMeters(), Boolean.valueOf(radius.isActive()), str4));
                                }
                                fVar5.a(iVar, arrayList);
                            }
                        }
                        if (fVar4.f440804c.longValue() == 0 || (avitoMapBounds = fVar4.f440803b) == null) {
                            return;
                        }
                        List listU = C42745f0.U(avitoMapBounds.getTopLeft(), avitoMapBounds.getBottomRight());
                        AvitoMap avitoMap2 = bVar8.f182711m;
                        if (avitoMap2 != null) {
                            AvitoMap.DefaultImpls.moveToPointsWithPadding$default(avitoMap2, listU, Integer.valueOf(bVar8.f182705i.getF182438d()), null, false, null, 28, null);
                            return;
                        }
                        return;
                    case 10:
                        b bVar9 = this.f182663c;
                        float fIntValue = (float) ((((Number) bVar9.f182719u.getValue()).intValue() * r15.f440816b) / ((s) obj).f440815a);
                        RadiusCircleViewImpl radiusCircleViewImpl = bVar9.f182710l.f182766u;
                        if (radiusCircleViewImpl != null) {
                            radiusCircleViewImpl.setRadius(fIntValue);
                            return;
                        }
                        return;
                    case 11:
                        float f12 = ((Boolean) obj).booleanValue() ? 1.0f : 0.0f;
                        RadiusCircleViewImpl radiusCircleViewImpl2 = this.f182663c.f182710l.f182766u;
                        if (radiusCircleViewImpl2 == null || (viewPropertyAnimatorAnimate = radiusCircleViewImpl2.animate()) == null || (duration = viewPropertyAnimatorAnimate.setDuration(180L)) == null || (viewPropertyAnimatorAlpha = duration.alpha(f12)) == null) {
                            return;
                        }
                        viewPropertyAnimatorAlpha.start();
                        return;
                    case 12:
                        vW.e eVar = (vW.e) obj;
                        String str5 = eVar.f440800a;
                        int length = str5.length();
                        b bVar10 = this.f182663c;
                        k kVar11 = bVar10.f182710l;
                        if (length == 0) {
                            Button button6 = kVar11.f182763r;
                            if (button6 != null) {
                                button6.setText(bVar10.f182705i.getF182435a());
                            }
                            Button button7 = kVar11.f182763r;
                            if (button7 == null) {
                                return;
                            }
                            button7.setEnabled(false);
                            return;
                        }
                        Button button8 = kVar11.f182763r;
                        if (button8 != null) {
                            button8.setText(str5);
                        }
                        Button button9 = kVar11.f182763r;
                        if (button9 == null) {
                            return;
                        }
                        button9.setEnabled(eVar.f440801b);
                        return;
                    case 13:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        k kVar12 = this.f182663c.f182710l;
                        kVar12.f182747b.setEnabled(zBooleanValue3);
                        kVar12.f182758m.setEnabled(zBooleanValue3);
                        return;
                    case 14:
                        b bVar11 = this.f182663c;
                        bVar11.f182695d.I1((AddressParameter.Value) obj, bVar11.f182707j);
                        return;
                    default:
                        b bVar12 = this.f182663c;
                        bVar12.f182720v.accept(ScreenCloseFromBlock.f182205d);
                        bVar12.f182695d.E3((Radius) obj);
                        bVar12.f182672I.accept(G0.f406611a);
                        return;
                }
            }
        };
        final int i19 = 5;
        this.f182692b0 = new l41.g(this) { // from class: com.avito.android.location_picker.view.publish.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f182663c;

            {
                this.f182663c = this;
            }

            @Override // l41.g
            public final void accept(Object obj) throws Resources.NotFoundException {
                String string;
                Button button2;
                AvitoMapBounds avitoMapBounds;
                ViewPropertyAnimator viewPropertyAnimatorAnimate;
                ViewPropertyAnimator duration;
                ViewPropertyAnimator viewPropertyAnimatorAlpha;
                switch (i19) {
                    case 0:
                        String str2 = (String) obj;
                        b bVar3 = this.f182663c;
                        com.avito.android.lib.design.tooltip.k kVar2 = bVar3.f182718t;
                        if (kVar2 != null) {
                            kVar2.dismiss();
                        }
                        bVar3.f182718t = null;
                        com.avito.android.lib.design.tooltip.k kVar3 = new com.avito.android.lib.design.tooltip.k(bVar3.f182691b.getContext(), 0, 0, 6, null);
                        kVar3.f181224j = new r.a(new i.a(new b.a()));
                        int i132 = kVar3.f181229o;
                        kVar3.f181228n = -2;
                        kVar3.f181229o = i132;
                        com.avito.android.lib.design.tooltip.p.a(kVar3, new b.l(str2));
                        bVar3.f182718t = kVar3.f(bVar3.f182710l.f182756k);
                        return;
                    case 1:
                        vW.j jVar = (vW.j) obj;
                        boolean z16 = jVar instanceof vW.m;
                        int i142 = R.string.lp_network_error;
                        Integer numValueOf = Integer.valueOf(R.string.lp_network_error);
                        Integer numValueOf2 = Integer.valueOf(R.string.lp_repeat);
                        b bVar4 = this.f182663c;
                        boolean z17 = bVar4.f182697e;
                        com.avito.android.location_picker.providers.z zVar2 = bVar4.f182705i;
                        k kVar4 = bVar4.f182710l;
                        if (z16) {
                            if (z17) {
                                Button button3 = kVar4.f182763r;
                                if (button3 != null) {
                                    button3.setText(zVar2.getF182436b());
                                }
                            } else {
                                i142 = R.string.lp_network_error_confirmation;
                            }
                            b.O(bVar4, Integer.valueOf(i142), null, numValueOf2, bVar4.new C5354b(), 2);
                            return;
                        }
                        if (jVar instanceof q) {
                            b.O(bVar4, Integer.valueOf(R.string.location_permission_required), null, Integer.valueOf(R.string.lp_settings), bVar4.new c(), 2);
                            return;
                        }
                        if (jVar instanceof vW.i) {
                            b.O(bVar4, Integer.valueOf(R.string.loc_providers_unavailable_message), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.l) {
                            if (z17 && (button2 = kVar4.f182763r) != null) {
                                button2.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new d(), 2);
                            return;
                        }
                        if (jVar instanceof vW.k) {
                            b.O(bVar4, null, ((vW.k) jVar).f440807a, null, null, 13);
                            return;
                        }
                        if (jVar instanceof vW.r) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_not_suggested_address_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.o) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_suggests_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.h) {
                            if (bVar4.f182717s != null) {
                                return;
                            }
                            com.avito.android.location_picker.job.f fVar3 = bVar4.f182701g;
                            boolean z18 = fVar3 instanceof f.b;
                            Resources resources = bVar4.f182709k;
                            if (z18) {
                                string = resources.getString(R.string.lp_empty_address_error_for_job_assistant);
                            } else {
                                if (!(fVar3 instanceof f.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                string = resources.getString(R.string.lp_empty_address_error);
                            }
                            com.avito.android.lib.design.modal.a aVarC2 = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, bVar4.f182691b.getContext(), new b.e(string, bVar4));
                            bVar4.f182717s = aVarC2;
                            com.avito.android.lib.util.g.a(aVarC2);
                            return;
                        }
                        if (jVar instanceof C49273c) {
                            Button button4 = kVar4.f182763r;
                            if (button4 != null) {
                                button4.setText(zVar2.getF182436b());
                                return;
                            }
                            return;
                        }
                        if (jVar instanceof vW.d) {
                            Button button5 = kVar4.f182763r;
                            if (button5 != null) {
                                button5.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new f(), 2);
                            return;
                        }
                        if (jVar instanceof vW.n) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_coords_error), null, numValueOf2, null, 10);
                            return;
                        }
                        if (!(jVar instanceof vW.p)) {
                            jVar.equals(C49272b.f440797a);
                            return;
                        }
                        com.avito.android.lib.design.toast_bar.k kVar5 = bVar4.f182716r;
                        if (kVar5 != null) {
                            kVar5.f();
                            return;
                        }
                        return;
                    case 2:
                        D6.G(this.f182663c.f182710l.f182753h, ((Boolean) obj).booleanValue());
                        return;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        b bVar5 = this.f182663c;
                        if (bVar5.f182699f) {
                            return;
                        }
                        k kVar6 = bVar5.f182710l;
                        kVar6.f182747b.setLoading(zBooleanValue);
                        boolean z19 = !zBooleanValue;
                        kVar6.f182747b.setEnabled(z19);
                        kVar6.f182758m.setEnabled(z19);
                        return;
                    case 4:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        b bVar6 = this.f182663c;
                        k kVar7 = bVar6.f182710l;
                        D6.G(kVar7.f182756k, zBooleanValue2);
                        kVar7.f182749d.setLayoutParams(new CoordinatorLayout.g(-1, zBooleanValue2 ? -1 : -2));
                        boolean z22 = !zBooleanValue2;
                        D6.G(kVar7.f182757l, z22);
                        D6.G(kVar7.f182752g, z22);
                        D6.G(kVar7.f182755j, z22);
                        PublishSearchLocationInput publishSearchLocationInput3 = kVar7.f182756k;
                        if (zBooleanValue2) {
                            publishSearchLocationInput3.requestFocus();
                            publishSearchLocationInput3.q();
                            publishSearchLocationInput3.v();
                            return;
                        }
                        publishSearchLocationInput3.clearFocus();
                        D6.w(kVar7.f182760o);
                        Fragment fragment2 = bVar6.f182693c;
                        K2.e(fragment2);
                        ActivityC22955m activityC22955mL1 = fragment2.l1();
                        if ((activityC22955mL1 != null ? activityC22955mL1.getCurrentFocus() : null) == null) {
                            ActivityC22955m activityC22955mL12 = fragment2.l1();
                            Object systemService = activityC22955mL12 != null ? activityC22955mL12.getSystemService("input_method") : null;
                            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                            if (inputMethodManager != null) {
                                inputMethodManager.hideSoftInputFromWindow(bVar6.f182691b.getWindowToken(), 0);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        String str3 = (String) obj;
                        k kVar8 = this.f182663c.f182710l;
                        if (str3.equals(String.valueOf(kVar8.f182756k.m53getText()))) {
                            return;
                        }
                        Input.t(kVar8.f182756k, str3, false, 6);
                        Input.t(kVar8.f182758m, str3, false, 6);
                        return;
                    case 6:
                        Editable editableM53getText = this.f182663c.f182710l.f182756k.m53getText();
                        if (editableM53getText != null) {
                            editableM53getText.clear();
                            return;
                        }
                        return;
                    case 7:
                        List<AddressSuggestion> list = (List) obj;
                        boolean zIsEmpty = list.isEmpty();
                        b bVar7 = this.f182663c;
                        k kVar9 = bVar7.f182710l;
                        if (zIsEmpty) {
                            D6.w(kVar9.f182760o);
                            return;
                        }
                        D6.G(kVar9.f182760o, true);
                        X x13 = bVar7.f182715q;
                        x13.f182553f = list;
                        x13.notifyDataSetChanged();
                        return;
                    case 8:
                        AvitoMapCameraPosition avitoMapCameraPosition = (AvitoMapCameraPosition) obj;
                        AvitoMap avitoMap = this.f182663c.f182711m;
                        if (avitoMap != null) {
                            boolean z23 = avitoMapCameraPosition.getZoomLevel() == avitoMap.getMapTarget().getZoomLevel();
                            boolean zAlmostEqual = AvitoMapPointKt.almostEqual(avitoMapCameraPosition.getMapPoint(), avitoMap.getMapTarget().getPoint());
                            if (avitoMapCameraPosition.getViewportBounds() != null) {
                                AvitoMapBounds viewportBounds = avitoMapCameraPosition.getViewportBounds();
                                if (viewportBounds != null) {
                                    avitoMap.moveTo(viewportBounds, true);
                                    return;
                                }
                                return;
                            }
                            if (!z23 && !zAlmostEqual) {
                                avitoMap.moveTo(avitoMapCameraPosition.getMapPoint(), true, Float.valueOf(avitoMapCameraPosition.getZoomLevel()));
                                return;
                            } else if (!z23) {
                                AvitoMap.DefaultImpls.zoomTo$default(avitoMap, avitoMapCameraPosition.getZoomLevel(), false, null, 6, null);
                                return;
                            } else {
                                if (zAlmostEqual) {
                                    return;
                                }
                                AvitoMap.DefaultImpls.moveTo$default(avitoMap, avitoMapCameraPosition.getMapPoint(), true, null, 4, null);
                                return;
                            }
                        }
                        return;
                    case 9:
                        vW.f fVar4 = (vW.f) obj;
                        b bVar8 = this.f182663c;
                        com.avito.android.location_picker.view.radius.f fVar5 = bVar8.f182712n;
                        if (fVar5.f182793c == null) {
                            k kVar10 = bVar8.f182710l;
                            View view2 = kVar10.f182764s;
                            if (view2 != null) {
                                D6.w(view2);
                            }
                            View view3 = kVar10.f182765t;
                            if (view3 != null) {
                                D6.H(view3);
                            }
                            com.avito.android.location_picker.view.radius.i iVar = bVar8.f182713o;
                            if (iVar != null) {
                                List<Radius> list2 = fVar4.f440802a;
                                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                                for (Radius radius : list2) {
                                    String id2 = radius.getId();
                                    String str4 = "";
                                    if (id2 == null) {
                                        id2 = "";
                                    }
                                    String title = radius.getTitle();
                                    if (title != null) {
                                        str4 = title;
                                    }
                                    arrayList.add(new com.avito.android.location_picker.view.radius.a(id2, radius.getDistanceInMeters(), Boolean.valueOf(radius.isActive()), str4));
                                }
                                fVar5.a(iVar, arrayList);
                            }
                        }
                        if (fVar4.f440804c.longValue() == 0 || (avitoMapBounds = fVar4.f440803b) == null) {
                            return;
                        }
                        List listU = C42745f0.U(avitoMapBounds.getTopLeft(), avitoMapBounds.getBottomRight());
                        AvitoMap avitoMap2 = bVar8.f182711m;
                        if (avitoMap2 != null) {
                            AvitoMap.DefaultImpls.moveToPointsWithPadding$default(avitoMap2, listU, Integer.valueOf(bVar8.f182705i.getF182438d()), null, false, null, 28, null);
                            return;
                        }
                        return;
                    case 10:
                        b bVar9 = this.f182663c;
                        float fIntValue = (float) ((((Number) bVar9.f182719u.getValue()).intValue() * r15.f440816b) / ((s) obj).f440815a);
                        RadiusCircleViewImpl radiusCircleViewImpl = bVar9.f182710l.f182766u;
                        if (radiusCircleViewImpl != null) {
                            radiusCircleViewImpl.setRadius(fIntValue);
                            return;
                        }
                        return;
                    case 11:
                        float f12 = ((Boolean) obj).booleanValue() ? 1.0f : 0.0f;
                        RadiusCircleViewImpl radiusCircleViewImpl2 = this.f182663c.f182710l.f182766u;
                        if (radiusCircleViewImpl2 == null || (viewPropertyAnimatorAnimate = radiusCircleViewImpl2.animate()) == null || (duration = viewPropertyAnimatorAnimate.setDuration(180L)) == null || (viewPropertyAnimatorAlpha = duration.alpha(f12)) == null) {
                            return;
                        }
                        viewPropertyAnimatorAlpha.start();
                        return;
                    case 12:
                        vW.e eVar = (vW.e) obj;
                        String str5 = eVar.f440800a;
                        int length = str5.length();
                        b bVar10 = this.f182663c;
                        k kVar11 = bVar10.f182710l;
                        if (length == 0) {
                            Button button6 = kVar11.f182763r;
                            if (button6 != null) {
                                button6.setText(bVar10.f182705i.getF182435a());
                            }
                            Button button7 = kVar11.f182763r;
                            if (button7 == null) {
                                return;
                            }
                            button7.setEnabled(false);
                            return;
                        }
                        Button button8 = kVar11.f182763r;
                        if (button8 != null) {
                            button8.setText(str5);
                        }
                        Button button9 = kVar11.f182763r;
                        if (button9 == null) {
                            return;
                        }
                        button9.setEnabled(eVar.f440801b);
                        return;
                    case 13:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        k kVar12 = this.f182663c.f182710l;
                        kVar12.f182747b.setEnabled(zBooleanValue3);
                        kVar12.f182758m.setEnabled(zBooleanValue3);
                        return;
                    case 14:
                        b bVar11 = this.f182663c;
                        bVar11.f182695d.I1((AddressParameter.Value) obj, bVar11.f182707j);
                        return;
                    default:
                        b bVar12 = this.f182663c;
                        bVar12.f182720v.accept(ScreenCloseFromBlock.f182205d);
                        bVar12.f182695d.E3((Radius) obj);
                        bVar12.f182672I.accept(G0.f406611a);
                        return;
                }
            }
        };
        final int i22 = 6;
        this.f182694c0 = new l41.g(this) { // from class: com.avito.android.location_picker.view.publish.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f182663c;

            {
                this.f182663c = this;
            }

            @Override // l41.g
            public final void accept(Object obj) throws Resources.NotFoundException {
                String string;
                Button button2;
                AvitoMapBounds avitoMapBounds;
                ViewPropertyAnimator viewPropertyAnimatorAnimate;
                ViewPropertyAnimator duration;
                ViewPropertyAnimator viewPropertyAnimatorAlpha;
                switch (i22) {
                    case 0:
                        String str2 = (String) obj;
                        b bVar3 = this.f182663c;
                        com.avito.android.lib.design.tooltip.k kVar2 = bVar3.f182718t;
                        if (kVar2 != null) {
                            kVar2.dismiss();
                        }
                        bVar3.f182718t = null;
                        com.avito.android.lib.design.tooltip.k kVar3 = new com.avito.android.lib.design.tooltip.k(bVar3.f182691b.getContext(), 0, 0, 6, null);
                        kVar3.f181224j = new r.a(new i.a(new b.a()));
                        int i132 = kVar3.f181229o;
                        kVar3.f181228n = -2;
                        kVar3.f181229o = i132;
                        com.avito.android.lib.design.tooltip.p.a(kVar3, new b.l(str2));
                        bVar3.f182718t = kVar3.f(bVar3.f182710l.f182756k);
                        return;
                    case 1:
                        vW.j jVar = (vW.j) obj;
                        boolean z16 = jVar instanceof vW.m;
                        int i142 = R.string.lp_network_error;
                        Integer numValueOf = Integer.valueOf(R.string.lp_network_error);
                        Integer numValueOf2 = Integer.valueOf(R.string.lp_repeat);
                        b bVar4 = this.f182663c;
                        boolean z17 = bVar4.f182697e;
                        com.avito.android.location_picker.providers.z zVar2 = bVar4.f182705i;
                        k kVar4 = bVar4.f182710l;
                        if (z16) {
                            if (z17) {
                                Button button3 = kVar4.f182763r;
                                if (button3 != null) {
                                    button3.setText(zVar2.getF182436b());
                                }
                            } else {
                                i142 = R.string.lp_network_error_confirmation;
                            }
                            b.O(bVar4, Integer.valueOf(i142), null, numValueOf2, bVar4.new C5354b(), 2);
                            return;
                        }
                        if (jVar instanceof q) {
                            b.O(bVar4, Integer.valueOf(R.string.location_permission_required), null, Integer.valueOf(R.string.lp_settings), bVar4.new c(), 2);
                            return;
                        }
                        if (jVar instanceof vW.i) {
                            b.O(bVar4, Integer.valueOf(R.string.loc_providers_unavailable_message), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.l) {
                            if (z17 && (button2 = kVar4.f182763r) != null) {
                                button2.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new d(), 2);
                            return;
                        }
                        if (jVar instanceof vW.k) {
                            b.O(bVar4, null, ((vW.k) jVar).f440807a, null, null, 13);
                            return;
                        }
                        if (jVar instanceof vW.r) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_not_suggested_address_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.o) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_suggests_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.h) {
                            if (bVar4.f182717s != null) {
                                return;
                            }
                            com.avito.android.location_picker.job.f fVar3 = bVar4.f182701g;
                            boolean z18 = fVar3 instanceof f.b;
                            Resources resources = bVar4.f182709k;
                            if (z18) {
                                string = resources.getString(R.string.lp_empty_address_error_for_job_assistant);
                            } else {
                                if (!(fVar3 instanceof f.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                string = resources.getString(R.string.lp_empty_address_error);
                            }
                            com.avito.android.lib.design.modal.a aVarC2 = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, bVar4.f182691b.getContext(), new b.e(string, bVar4));
                            bVar4.f182717s = aVarC2;
                            com.avito.android.lib.util.g.a(aVarC2);
                            return;
                        }
                        if (jVar instanceof C49273c) {
                            Button button4 = kVar4.f182763r;
                            if (button4 != null) {
                                button4.setText(zVar2.getF182436b());
                                return;
                            }
                            return;
                        }
                        if (jVar instanceof vW.d) {
                            Button button5 = kVar4.f182763r;
                            if (button5 != null) {
                                button5.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new f(), 2);
                            return;
                        }
                        if (jVar instanceof vW.n) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_coords_error), null, numValueOf2, null, 10);
                            return;
                        }
                        if (!(jVar instanceof vW.p)) {
                            jVar.equals(C49272b.f440797a);
                            return;
                        }
                        com.avito.android.lib.design.toast_bar.k kVar5 = bVar4.f182716r;
                        if (kVar5 != null) {
                            kVar5.f();
                            return;
                        }
                        return;
                    case 2:
                        D6.G(this.f182663c.f182710l.f182753h, ((Boolean) obj).booleanValue());
                        return;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        b bVar5 = this.f182663c;
                        if (bVar5.f182699f) {
                            return;
                        }
                        k kVar6 = bVar5.f182710l;
                        kVar6.f182747b.setLoading(zBooleanValue);
                        boolean z19 = !zBooleanValue;
                        kVar6.f182747b.setEnabled(z19);
                        kVar6.f182758m.setEnabled(z19);
                        return;
                    case 4:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        b bVar6 = this.f182663c;
                        k kVar7 = bVar6.f182710l;
                        D6.G(kVar7.f182756k, zBooleanValue2);
                        kVar7.f182749d.setLayoutParams(new CoordinatorLayout.g(-1, zBooleanValue2 ? -1 : -2));
                        boolean z22 = !zBooleanValue2;
                        D6.G(kVar7.f182757l, z22);
                        D6.G(kVar7.f182752g, z22);
                        D6.G(kVar7.f182755j, z22);
                        PublishSearchLocationInput publishSearchLocationInput3 = kVar7.f182756k;
                        if (zBooleanValue2) {
                            publishSearchLocationInput3.requestFocus();
                            publishSearchLocationInput3.q();
                            publishSearchLocationInput3.v();
                            return;
                        }
                        publishSearchLocationInput3.clearFocus();
                        D6.w(kVar7.f182760o);
                        Fragment fragment2 = bVar6.f182693c;
                        K2.e(fragment2);
                        ActivityC22955m activityC22955mL1 = fragment2.l1();
                        if ((activityC22955mL1 != null ? activityC22955mL1.getCurrentFocus() : null) == null) {
                            ActivityC22955m activityC22955mL12 = fragment2.l1();
                            Object systemService = activityC22955mL12 != null ? activityC22955mL12.getSystemService("input_method") : null;
                            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                            if (inputMethodManager != null) {
                                inputMethodManager.hideSoftInputFromWindow(bVar6.f182691b.getWindowToken(), 0);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        String str3 = (String) obj;
                        k kVar8 = this.f182663c.f182710l;
                        if (str3.equals(String.valueOf(kVar8.f182756k.m53getText()))) {
                            return;
                        }
                        Input.t(kVar8.f182756k, str3, false, 6);
                        Input.t(kVar8.f182758m, str3, false, 6);
                        return;
                    case 6:
                        Editable editableM53getText = this.f182663c.f182710l.f182756k.m53getText();
                        if (editableM53getText != null) {
                            editableM53getText.clear();
                            return;
                        }
                        return;
                    case 7:
                        List<AddressSuggestion> list = (List) obj;
                        boolean zIsEmpty = list.isEmpty();
                        b bVar7 = this.f182663c;
                        k kVar9 = bVar7.f182710l;
                        if (zIsEmpty) {
                            D6.w(kVar9.f182760o);
                            return;
                        }
                        D6.G(kVar9.f182760o, true);
                        X x13 = bVar7.f182715q;
                        x13.f182553f = list;
                        x13.notifyDataSetChanged();
                        return;
                    case 8:
                        AvitoMapCameraPosition avitoMapCameraPosition = (AvitoMapCameraPosition) obj;
                        AvitoMap avitoMap = this.f182663c.f182711m;
                        if (avitoMap != null) {
                            boolean z23 = avitoMapCameraPosition.getZoomLevel() == avitoMap.getMapTarget().getZoomLevel();
                            boolean zAlmostEqual = AvitoMapPointKt.almostEqual(avitoMapCameraPosition.getMapPoint(), avitoMap.getMapTarget().getPoint());
                            if (avitoMapCameraPosition.getViewportBounds() != null) {
                                AvitoMapBounds viewportBounds = avitoMapCameraPosition.getViewportBounds();
                                if (viewportBounds != null) {
                                    avitoMap.moveTo(viewportBounds, true);
                                    return;
                                }
                                return;
                            }
                            if (!z23 && !zAlmostEqual) {
                                avitoMap.moveTo(avitoMapCameraPosition.getMapPoint(), true, Float.valueOf(avitoMapCameraPosition.getZoomLevel()));
                                return;
                            } else if (!z23) {
                                AvitoMap.DefaultImpls.zoomTo$default(avitoMap, avitoMapCameraPosition.getZoomLevel(), false, null, 6, null);
                                return;
                            } else {
                                if (zAlmostEqual) {
                                    return;
                                }
                                AvitoMap.DefaultImpls.moveTo$default(avitoMap, avitoMapCameraPosition.getMapPoint(), true, null, 4, null);
                                return;
                            }
                        }
                        return;
                    case 9:
                        vW.f fVar4 = (vW.f) obj;
                        b bVar8 = this.f182663c;
                        com.avito.android.location_picker.view.radius.f fVar5 = bVar8.f182712n;
                        if (fVar5.f182793c == null) {
                            k kVar10 = bVar8.f182710l;
                            View view2 = kVar10.f182764s;
                            if (view2 != null) {
                                D6.w(view2);
                            }
                            View view3 = kVar10.f182765t;
                            if (view3 != null) {
                                D6.H(view3);
                            }
                            com.avito.android.location_picker.view.radius.i iVar = bVar8.f182713o;
                            if (iVar != null) {
                                List<Radius> list2 = fVar4.f440802a;
                                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                                for (Radius radius : list2) {
                                    String id2 = radius.getId();
                                    String str4 = "";
                                    if (id2 == null) {
                                        id2 = "";
                                    }
                                    String title = radius.getTitle();
                                    if (title != null) {
                                        str4 = title;
                                    }
                                    arrayList.add(new com.avito.android.location_picker.view.radius.a(id2, radius.getDistanceInMeters(), Boolean.valueOf(radius.isActive()), str4));
                                }
                                fVar5.a(iVar, arrayList);
                            }
                        }
                        if (fVar4.f440804c.longValue() == 0 || (avitoMapBounds = fVar4.f440803b) == null) {
                            return;
                        }
                        List listU = C42745f0.U(avitoMapBounds.getTopLeft(), avitoMapBounds.getBottomRight());
                        AvitoMap avitoMap2 = bVar8.f182711m;
                        if (avitoMap2 != null) {
                            AvitoMap.DefaultImpls.moveToPointsWithPadding$default(avitoMap2, listU, Integer.valueOf(bVar8.f182705i.getF182438d()), null, false, null, 28, null);
                            return;
                        }
                        return;
                    case 10:
                        b bVar9 = this.f182663c;
                        float fIntValue = (float) ((((Number) bVar9.f182719u.getValue()).intValue() * r15.f440816b) / ((s) obj).f440815a);
                        RadiusCircleViewImpl radiusCircleViewImpl = bVar9.f182710l.f182766u;
                        if (radiusCircleViewImpl != null) {
                            radiusCircleViewImpl.setRadius(fIntValue);
                            return;
                        }
                        return;
                    case 11:
                        float f12 = ((Boolean) obj).booleanValue() ? 1.0f : 0.0f;
                        RadiusCircleViewImpl radiusCircleViewImpl2 = this.f182663c.f182710l.f182766u;
                        if (radiusCircleViewImpl2 == null || (viewPropertyAnimatorAnimate = radiusCircleViewImpl2.animate()) == null || (duration = viewPropertyAnimatorAnimate.setDuration(180L)) == null || (viewPropertyAnimatorAlpha = duration.alpha(f12)) == null) {
                            return;
                        }
                        viewPropertyAnimatorAlpha.start();
                        return;
                    case 12:
                        vW.e eVar = (vW.e) obj;
                        String str5 = eVar.f440800a;
                        int length = str5.length();
                        b bVar10 = this.f182663c;
                        k kVar11 = bVar10.f182710l;
                        if (length == 0) {
                            Button button6 = kVar11.f182763r;
                            if (button6 != null) {
                                button6.setText(bVar10.f182705i.getF182435a());
                            }
                            Button button7 = kVar11.f182763r;
                            if (button7 == null) {
                                return;
                            }
                            button7.setEnabled(false);
                            return;
                        }
                        Button button8 = kVar11.f182763r;
                        if (button8 != null) {
                            button8.setText(str5);
                        }
                        Button button9 = kVar11.f182763r;
                        if (button9 == null) {
                            return;
                        }
                        button9.setEnabled(eVar.f440801b);
                        return;
                    case 13:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        k kVar12 = this.f182663c.f182710l;
                        kVar12.f182747b.setEnabled(zBooleanValue3);
                        kVar12.f182758m.setEnabled(zBooleanValue3);
                        return;
                    case 14:
                        b bVar11 = this.f182663c;
                        bVar11.f182695d.I1((AddressParameter.Value) obj, bVar11.f182707j);
                        return;
                    default:
                        b bVar12 = this.f182663c;
                        bVar12.f182720v.accept(ScreenCloseFromBlock.f182205d);
                        bVar12.f182695d.E3((Radius) obj);
                        bVar12.f182672I.accept(G0.f406611a);
                        return;
                }
            }
        };
        final int i23 = 7;
        this.f182696d0 = new l41.g(this) { // from class: com.avito.android.location_picker.view.publish.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f182663c;

            {
                this.f182663c = this;
            }

            @Override // l41.g
            public final void accept(Object obj) throws Resources.NotFoundException {
                String string;
                Button button2;
                AvitoMapBounds avitoMapBounds;
                ViewPropertyAnimator viewPropertyAnimatorAnimate;
                ViewPropertyAnimator duration;
                ViewPropertyAnimator viewPropertyAnimatorAlpha;
                switch (i23) {
                    case 0:
                        String str2 = (String) obj;
                        b bVar3 = this.f182663c;
                        com.avito.android.lib.design.tooltip.k kVar2 = bVar3.f182718t;
                        if (kVar2 != null) {
                            kVar2.dismiss();
                        }
                        bVar3.f182718t = null;
                        com.avito.android.lib.design.tooltip.k kVar3 = new com.avito.android.lib.design.tooltip.k(bVar3.f182691b.getContext(), 0, 0, 6, null);
                        kVar3.f181224j = new r.a(new i.a(new b.a()));
                        int i132 = kVar3.f181229o;
                        kVar3.f181228n = -2;
                        kVar3.f181229o = i132;
                        com.avito.android.lib.design.tooltip.p.a(kVar3, new b.l(str2));
                        bVar3.f182718t = kVar3.f(bVar3.f182710l.f182756k);
                        return;
                    case 1:
                        vW.j jVar = (vW.j) obj;
                        boolean z16 = jVar instanceof vW.m;
                        int i142 = R.string.lp_network_error;
                        Integer numValueOf = Integer.valueOf(R.string.lp_network_error);
                        Integer numValueOf2 = Integer.valueOf(R.string.lp_repeat);
                        b bVar4 = this.f182663c;
                        boolean z17 = bVar4.f182697e;
                        com.avito.android.location_picker.providers.z zVar2 = bVar4.f182705i;
                        k kVar4 = bVar4.f182710l;
                        if (z16) {
                            if (z17) {
                                Button button3 = kVar4.f182763r;
                                if (button3 != null) {
                                    button3.setText(zVar2.getF182436b());
                                }
                            } else {
                                i142 = R.string.lp_network_error_confirmation;
                            }
                            b.O(bVar4, Integer.valueOf(i142), null, numValueOf2, bVar4.new C5354b(), 2);
                            return;
                        }
                        if (jVar instanceof q) {
                            b.O(bVar4, Integer.valueOf(R.string.location_permission_required), null, Integer.valueOf(R.string.lp_settings), bVar4.new c(), 2);
                            return;
                        }
                        if (jVar instanceof vW.i) {
                            b.O(bVar4, Integer.valueOf(R.string.loc_providers_unavailable_message), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.l) {
                            if (z17 && (button2 = kVar4.f182763r) != null) {
                                button2.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new d(), 2);
                            return;
                        }
                        if (jVar instanceof vW.k) {
                            b.O(bVar4, null, ((vW.k) jVar).f440807a, null, null, 13);
                            return;
                        }
                        if (jVar instanceof vW.r) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_not_suggested_address_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.o) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_suggests_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.h) {
                            if (bVar4.f182717s != null) {
                                return;
                            }
                            com.avito.android.location_picker.job.f fVar3 = bVar4.f182701g;
                            boolean z18 = fVar3 instanceof f.b;
                            Resources resources = bVar4.f182709k;
                            if (z18) {
                                string = resources.getString(R.string.lp_empty_address_error_for_job_assistant);
                            } else {
                                if (!(fVar3 instanceof f.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                string = resources.getString(R.string.lp_empty_address_error);
                            }
                            com.avito.android.lib.design.modal.a aVarC2 = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, bVar4.f182691b.getContext(), new b.e(string, bVar4));
                            bVar4.f182717s = aVarC2;
                            com.avito.android.lib.util.g.a(aVarC2);
                            return;
                        }
                        if (jVar instanceof C49273c) {
                            Button button4 = kVar4.f182763r;
                            if (button4 != null) {
                                button4.setText(zVar2.getF182436b());
                                return;
                            }
                            return;
                        }
                        if (jVar instanceof vW.d) {
                            Button button5 = kVar4.f182763r;
                            if (button5 != null) {
                                button5.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new f(), 2);
                            return;
                        }
                        if (jVar instanceof vW.n) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_coords_error), null, numValueOf2, null, 10);
                            return;
                        }
                        if (!(jVar instanceof vW.p)) {
                            jVar.equals(C49272b.f440797a);
                            return;
                        }
                        com.avito.android.lib.design.toast_bar.k kVar5 = bVar4.f182716r;
                        if (kVar5 != null) {
                            kVar5.f();
                            return;
                        }
                        return;
                    case 2:
                        D6.G(this.f182663c.f182710l.f182753h, ((Boolean) obj).booleanValue());
                        return;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        b bVar5 = this.f182663c;
                        if (bVar5.f182699f) {
                            return;
                        }
                        k kVar6 = bVar5.f182710l;
                        kVar6.f182747b.setLoading(zBooleanValue);
                        boolean z19 = !zBooleanValue;
                        kVar6.f182747b.setEnabled(z19);
                        kVar6.f182758m.setEnabled(z19);
                        return;
                    case 4:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        b bVar6 = this.f182663c;
                        k kVar7 = bVar6.f182710l;
                        D6.G(kVar7.f182756k, zBooleanValue2);
                        kVar7.f182749d.setLayoutParams(new CoordinatorLayout.g(-1, zBooleanValue2 ? -1 : -2));
                        boolean z22 = !zBooleanValue2;
                        D6.G(kVar7.f182757l, z22);
                        D6.G(kVar7.f182752g, z22);
                        D6.G(kVar7.f182755j, z22);
                        PublishSearchLocationInput publishSearchLocationInput3 = kVar7.f182756k;
                        if (zBooleanValue2) {
                            publishSearchLocationInput3.requestFocus();
                            publishSearchLocationInput3.q();
                            publishSearchLocationInput3.v();
                            return;
                        }
                        publishSearchLocationInput3.clearFocus();
                        D6.w(kVar7.f182760o);
                        Fragment fragment2 = bVar6.f182693c;
                        K2.e(fragment2);
                        ActivityC22955m activityC22955mL1 = fragment2.l1();
                        if ((activityC22955mL1 != null ? activityC22955mL1.getCurrentFocus() : null) == null) {
                            ActivityC22955m activityC22955mL12 = fragment2.l1();
                            Object systemService = activityC22955mL12 != null ? activityC22955mL12.getSystemService("input_method") : null;
                            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                            if (inputMethodManager != null) {
                                inputMethodManager.hideSoftInputFromWindow(bVar6.f182691b.getWindowToken(), 0);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        String str3 = (String) obj;
                        k kVar8 = this.f182663c.f182710l;
                        if (str3.equals(String.valueOf(kVar8.f182756k.m53getText()))) {
                            return;
                        }
                        Input.t(kVar8.f182756k, str3, false, 6);
                        Input.t(kVar8.f182758m, str3, false, 6);
                        return;
                    case 6:
                        Editable editableM53getText = this.f182663c.f182710l.f182756k.m53getText();
                        if (editableM53getText != null) {
                            editableM53getText.clear();
                            return;
                        }
                        return;
                    case 7:
                        List<AddressSuggestion> list = (List) obj;
                        boolean zIsEmpty = list.isEmpty();
                        b bVar7 = this.f182663c;
                        k kVar9 = bVar7.f182710l;
                        if (zIsEmpty) {
                            D6.w(kVar9.f182760o);
                            return;
                        }
                        D6.G(kVar9.f182760o, true);
                        X x13 = bVar7.f182715q;
                        x13.f182553f = list;
                        x13.notifyDataSetChanged();
                        return;
                    case 8:
                        AvitoMapCameraPosition avitoMapCameraPosition = (AvitoMapCameraPosition) obj;
                        AvitoMap avitoMap = this.f182663c.f182711m;
                        if (avitoMap != null) {
                            boolean z23 = avitoMapCameraPosition.getZoomLevel() == avitoMap.getMapTarget().getZoomLevel();
                            boolean zAlmostEqual = AvitoMapPointKt.almostEqual(avitoMapCameraPosition.getMapPoint(), avitoMap.getMapTarget().getPoint());
                            if (avitoMapCameraPosition.getViewportBounds() != null) {
                                AvitoMapBounds viewportBounds = avitoMapCameraPosition.getViewportBounds();
                                if (viewportBounds != null) {
                                    avitoMap.moveTo(viewportBounds, true);
                                    return;
                                }
                                return;
                            }
                            if (!z23 && !zAlmostEqual) {
                                avitoMap.moveTo(avitoMapCameraPosition.getMapPoint(), true, Float.valueOf(avitoMapCameraPosition.getZoomLevel()));
                                return;
                            } else if (!z23) {
                                AvitoMap.DefaultImpls.zoomTo$default(avitoMap, avitoMapCameraPosition.getZoomLevel(), false, null, 6, null);
                                return;
                            } else {
                                if (zAlmostEqual) {
                                    return;
                                }
                                AvitoMap.DefaultImpls.moveTo$default(avitoMap, avitoMapCameraPosition.getMapPoint(), true, null, 4, null);
                                return;
                            }
                        }
                        return;
                    case 9:
                        vW.f fVar4 = (vW.f) obj;
                        b bVar8 = this.f182663c;
                        com.avito.android.location_picker.view.radius.f fVar5 = bVar8.f182712n;
                        if (fVar5.f182793c == null) {
                            k kVar10 = bVar8.f182710l;
                            View view2 = kVar10.f182764s;
                            if (view2 != null) {
                                D6.w(view2);
                            }
                            View view3 = kVar10.f182765t;
                            if (view3 != null) {
                                D6.H(view3);
                            }
                            com.avito.android.location_picker.view.radius.i iVar = bVar8.f182713o;
                            if (iVar != null) {
                                List<Radius> list2 = fVar4.f440802a;
                                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                                for (Radius radius : list2) {
                                    String id2 = radius.getId();
                                    String str4 = "";
                                    if (id2 == null) {
                                        id2 = "";
                                    }
                                    String title = radius.getTitle();
                                    if (title != null) {
                                        str4 = title;
                                    }
                                    arrayList.add(new com.avito.android.location_picker.view.radius.a(id2, radius.getDistanceInMeters(), Boolean.valueOf(radius.isActive()), str4));
                                }
                                fVar5.a(iVar, arrayList);
                            }
                        }
                        if (fVar4.f440804c.longValue() == 0 || (avitoMapBounds = fVar4.f440803b) == null) {
                            return;
                        }
                        List listU = C42745f0.U(avitoMapBounds.getTopLeft(), avitoMapBounds.getBottomRight());
                        AvitoMap avitoMap2 = bVar8.f182711m;
                        if (avitoMap2 != null) {
                            AvitoMap.DefaultImpls.moveToPointsWithPadding$default(avitoMap2, listU, Integer.valueOf(bVar8.f182705i.getF182438d()), null, false, null, 28, null);
                            return;
                        }
                        return;
                    case 10:
                        b bVar9 = this.f182663c;
                        float fIntValue = (float) ((((Number) bVar9.f182719u.getValue()).intValue() * r15.f440816b) / ((s) obj).f440815a);
                        RadiusCircleViewImpl radiusCircleViewImpl = bVar9.f182710l.f182766u;
                        if (radiusCircleViewImpl != null) {
                            radiusCircleViewImpl.setRadius(fIntValue);
                            return;
                        }
                        return;
                    case 11:
                        float f12 = ((Boolean) obj).booleanValue() ? 1.0f : 0.0f;
                        RadiusCircleViewImpl radiusCircleViewImpl2 = this.f182663c.f182710l.f182766u;
                        if (radiusCircleViewImpl2 == null || (viewPropertyAnimatorAnimate = radiusCircleViewImpl2.animate()) == null || (duration = viewPropertyAnimatorAnimate.setDuration(180L)) == null || (viewPropertyAnimatorAlpha = duration.alpha(f12)) == null) {
                            return;
                        }
                        viewPropertyAnimatorAlpha.start();
                        return;
                    case 12:
                        vW.e eVar = (vW.e) obj;
                        String str5 = eVar.f440800a;
                        int length = str5.length();
                        b bVar10 = this.f182663c;
                        k kVar11 = bVar10.f182710l;
                        if (length == 0) {
                            Button button6 = kVar11.f182763r;
                            if (button6 != null) {
                                button6.setText(bVar10.f182705i.getF182435a());
                            }
                            Button button7 = kVar11.f182763r;
                            if (button7 == null) {
                                return;
                            }
                            button7.setEnabled(false);
                            return;
                        }
                        Button button8 = kVar11.f182763r;
                        if (button8 != null) {
                            button8.setText(str5);
                        }
                        Button button9 = kVar11.f182763r;
                        if (button9 == null) {
                            return;
                        }
                        button9.setEnabled(eVar.f440801b);
                        return;
                    case 13:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        k kVar12 = this.f182663c.f182710l;
                        kVar12.f182747b.setEnabled(zBooleanValue3);
                        kVar12.f182758m.setEnabled(zBooleanValue3);
                        return;
                    case 14:
                        b bVar11 = this.f182663c;
                        bVar11.f182695d.I1((AddressParameter.Value) obj, bVar11.f182707j);
                        return;
                    default:
                        b bVar12 = this.f182663c;
                        bVar12.f182720v.accept(ScreenCloseFromBlock.f182205d);
                        bVar12.f182695d.E3((Radius) obj);
                        bVar12.f182672I.accept(G0.f406611a);
                        return;
                }
            }
        };
        final int i24 = 8;
        this.f182698e0 = new l41.g(this) { // from class: com.avito.android.location_picker.view.publish.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f182663c;

            {
                this.f182663c = this;
            }

            @Override // l41.g
            public final void accept(Object obj) throws Resources.NotFoundException {
                String string;
                Button button2;
                AvitoMapBounds avitoMapBounds;
                ViewPropertyAnimator viewPropertyAnimatorAnimate;
                ViewPropertyAnimator duration;
                ViewPropertyAnimator viewPropertyAnimatorAlpha;
                switch (i24) {
                    case 0:
                        String str2 = (String) obj;
                        b bVar3 = this.f182663c;
                        com.avito.android.lib.design.tooltip.k kVar2 = bVar3.f182718t;
                        if (kVar2 != null) {
                            kVar2.dismiss();
                        }
                        bVar3.f182718t = null;
                        com.avito.android.lib.design.tooltip.k kVar3 = new com.avito.android.lib.design.tooltip.k(bVar3.f182691b.getContext(), 0, 0, 6, null);
                        kVar3.f181224j = new r.a(new i.a(new b.a()));
                        int i132 = kVar3.f181229o;
                        kVar3.f181228n = -2;
                        kVar3.f181229o = i132;
                        com.avito.android.lib.design.tooltip.p.a(kVar3, new b.l(str2));
                        bVar3.f182718t = kVar3.f(bVar3.f182710l.f182756k);
                        return;
                    case 1:
                        vW.j jVar = (vW.j) obj;
                        boolean z16 = jVar instanceof vW.m;
                        int i142 = R.string.lp_network_error;
                        Integer numValueOf = Integer.valueOf(R.string.lp_network_error);
                        Integer numValueOf2 = Integer.valueOf(R.string.lp_repeat);
                        b bVar4 = this.f182663c;
                        boolean z17 = bVar4.f182697e;
                        com.avito.android.location_picker.providers.z zVar2 = bVar4.f182705i;
                        k kVar4 = bVar4.f182710l;
                        if (z16) {
                            if (z17) {
                                Button button3 = kVar4.f182763r;
                                if (button3 != null) {
                                    button3.setText(zVar2.getF182436b());
                                }
                            } else {
                                i142 = R.string.lp_network_error_confirmation;
                            }
                            b.O(bVar4, Integer.valueOf(i142), null, numValueOf2, bVar4.new C5354b(), 2);
                            return;
                        }
                        if (jVar instanceof q) {
                            b.O(bVar4, Integer.valueOf(R.string.location_permission_required), null, Integer.valueOf(R.string.lp_settings), bVar4.new c(), 2);
                            return;
                        }
                        if (jVar instanceof vW.i) {
                            b.O(bVar4, Integer.valueOf(R.string.loc_providers_unavailable_message), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.l) {
                            if (z17 && (button2 = kVar4.f182763r) != null) {
                                button2.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new d(), 2);
                            return;
                        }
                        if (jVar instanceof vW.k) {
                            b.O(bVar4, null, ((vW.k) jVar).f440807a, null, null, 13);
                            return;
                        }
                        if (jVar instanceof vW.r) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_not_suggested_address_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.o) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_suggests_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.h) {
                            if (bVar4.f182717s != null) {
                                return;
                            }
                            com.avito.android.location_picker.job.f fVar3 = bVar4.f182701g;
                            boolean z18 = fVar3 instanceof f.b;
                            Resources resources = bVar4.f182709k;
                            if (z18) {
                                string = resources.getString(R.string.lp_empty_address_error_for_job_assistant);
                            } else {
                                if (!(fVar3 instanceof f.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                string = resources.getString(R.string.lp_empty_address_error);
                            }
                            com.avito.android.lib.design.modal.a aVarC2 = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, bVar4.f182691b.getContext(), new b.e(string, bVar4));
                            bVar4.f182717s = aVarC2;
                            com.avito.android.lib.util.g.a(aVarC2);
                            return;
                        }
                        if (jVar instanceof C49273c) {
                            Button button4 = kVar4.f182763r;
                            if (button4 != null) {
                                button4.setText(zVar2.getF182436b());
                                return;
                            }
                            return;
                        }
                        if (jVar instanceof vW.d) {
                            Button button5 = kVar4.f182763r;
                            if (button5 != null) {
                                button5.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new f(), 2);
                            return;
                        }
                        if (jVar instanceof vW.n) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_coords_error), null, numValueOf2, null, 10);
                            return;
                        }
                        if (!(jVar instanceof vW.p)) {
                            jVar.equals(C49272b.f440797a);
                            return;
                        }
                        com.avito.android.lib.design.toast_bar.k kVar5 = bVar4.f182716r;
                        if (kVar5 != null) {
                            kVar5.f();
                            return;
                        }
                        return;
                    case 2:
                        D6.G(this.f182663c.f182710l.f182753h, ((Boolean) obj).booleanValue());
                        return;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        b bVar5 = this.f182663c;
                        if (bVar5.f182699f) {
                            return;
                        }
                        k kVar6 = bVar5.f182710l;
                        kVar6.f182747b.setLoading(zBooleanValue);
                        boolean z19 = !zBooleanValue;
                        kVar6.f182747b.setEnabled(z19);
                        kVar6.f182758m.setEnabled(z19);
                        return;
                    case 4:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        b bVar6 = this.f182663c;
                        k kVar7 = bVar6.f182710l;
                        D6.G(kVar7.f182756k, zBooleanValue2);
                        kVar7.f182749d.setLayoutParams(new CoordinatorLayout.g(-1, zBooleanValue2 ? -1 : -2));
                        boolean z22 = !zBooleanValue2;
                        D6.G(kVar7.f182757l, z22);
                        D6.G(kVar7.f182752g, z22);
                        D6.G(kVar7.f182755j, z22);
                        PublishSearchLocationInput publishSearchLocationInput3 = kVar7.f182756k;
                        if (zBooleanValue2) {
                            publishSearchLocationInput3.requestFocus();
                            publishSearchLocationInput3.q();
                            publishSearchLocationInput3.v();
                            return;
                        }
                        publishSearchLocationInput3.clearFocus();
                        D6.w(kVar7.f182760o);
                        Fragment fragment2 = bVar6.f182693c;
                        K2.e(fragment2);
                        ActivityC22955m activityC22955mL1 = fragment2.l1();
                        if ((activityC22955mL1 != null ? activityC22955mL1.getCurrentFocus() : null) == null) {
                            ActivityC22955m activityC22955mL12 = fragment2.l1();
                            Object systemService = activityC22955mL12 != null ? activityC22955mL12.getSystemService("input_method") : null;
                            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                            if (inputMethodManager != null) {
                                inputMethodManager.hideSoftInputFromWindow(bVar6.f182691b.getWindowToken(), 0);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        String str3 = (String) obj;
                        k kVar8 = this.f182663c.f182710l;
                        if (str3.equals(String.valueOf(kVar8.f182756k.m53getText()))) {
                            return;
                        }
                        Input.t(kVar8.f182756k, str3, false, 6);
                        Input.t(kVar8.f182758m, str3, false, 6);
                        return;
                    case 6:
                        Editable editableM53getText = this.f182663c.f182710l.f182756k.m53getText();
                        if (editableM53getText != null) {
                            editableM53getText.clear();
                            return;
                        }
                        return;
                    case 7:
                        List<AddressSuggestion> list = (List) obj;
                        boolean zIsEmpty = list.isEmpty();
                        b bVar7 = this.f182663c;
                        k kVar9 = bVar7.f182710l;
                        if (zIsEmpty) {
                            D6.w(kVar9.f182760o);
                            return;
                        }
                        D6.G(kVar9.f182760o, true);
                        X x13 = bVar7.f182715q;
                        x13.f182553f = list;
                        x13.notifyDataSetChanged();
                        return;
                    case 8:
                        AvitoMapCameraPosition avitoMapCameraPosition = (AvitoMapCameraPosition) obj;
                        AvitoMap avitoMap = this.f182663c.f182711m;
                        if (avitoMap != null) {
                            boolean z23 = avitoMapCameraPosition.getZoomLevel() == avitoMap.getMapTarget().getZoomLevel();
                            boolean zAlmostEqual = AvitoMapPointKt.almostEqual(avitoMapCameraPosition.getMapPoint(), avitoMap.getMapTarget().getPoint());
                            if (avitoMapCameraPosition.getViewportBounds() != null) {
                                AvitoMapBounds viewportBounds = avitoMapCameraPosition.getViewportBounds();
                                if (viewportBounds != null) {
                                    avitoMap.moveTo(viewportBounds, true);
                                    return;
                                }
                                return;
                            }
                            if (!z23 && !zAlmostEqual) {
                                avitoMap.moveTo(avitoMapCameraPosition.getMapPoint(), true, Float.valueOf(avitoMapCameraPosition.getZoomLevel()));
                                return;
                            } else if (!z23) {
                                AvitoMap.DefaultImpls.zoomTo$default(avitoMap, avitoMapCameraPosition.getZoomLevel(), false, null, 6, null);
                                return;
                            } else {
                                if (zAlmostEqual) {
                                    return;
                                }
                                AvitoMap.DefaultImpls.moveTo$default(avitoMap, avitoMapCameraPosition.getMapPoint(), true, null, 4, null);
                                return;
                            }
                        }
                        return;
                    case 9:
                        vW.f fVar4 = (vW.f) obj;
                        b bVar8 = this.f182663c;
                        com.avito.android.location_picker.view.radius.f fVar5 = bVar8.f182712n;
                        if (fVar5.f182793c == null) {
                            k kVar10 = bVar8.f182710l;
                            View view2 = kVar10.f182764s;
                            if (view2 != null) {
                                D6.w(view2);
                            }
                            View view3 = kVar10.f182765t;
                            if (view3 != null) {
                                D6.H(view3);
                            }
                            com.avito.android.location_picker.view.radius.i iVar = bVar8.f182713o;
                            if (iVar != null) {
                                List<Radius> list2 = fVar4.f440802a;
                                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                                for (Radius radius : list2) {
                                    String id2 = radius.getId();
                                    String str4 = "";
                                    if (id2 == null) {
                                        id2 = "";
                                    }
                                    String title = radius.getTitle();
                                    if (title != null) {
                                        str4 = title;
                                    }
                                    arrayList.add(new com.avito.android.location_picker.view.radius.a(id2, radius.getDistanceInMeters(), Boolean.valueOf(radius.isActive()), str4));
                                }
                                fVar5.a(iVar, arrayList);
                            }
                        }
                        if (fVar4.f440804c.longValue() == 0 || (avitoMapBounds = fVar4.f440803b) == null) {
                            return;
                        }
                        List listU = C42745f0.U(avitoMapBounds.getTopLeft(), avitoMapBounds.getBottomRight());
                        AvitoMap avitoMap2 = bVar8.f182711m;
                        if (avitoMap2 != null) {
                            AvitoMap.DefaultImpls.moveToPointsWithPadding$default(avitoMap2, listU, Integer.valueOf(bVar8.f182705i.getF182438d()), null, false, null, 28, null);
                            return;
                        }
                        return;
                    case 10:
                        b bVar9 = this.f182663c;
                        float fIntValue = (float) ((((Number) bVar9.f182719u.getValue()).intValue() * r15.f440816b) / ((s) obj).f440815a);
                        RadiusCircleViewImpl radiusCircleViewImpl = bVar9.f182710l.f182766u;
                        if (radiusCircleViewImpl != null) {
                            radiusCircleViewImpl.setRadius(fIntValue);
                            return;
                        }
                        return;
                    case 11:
                        float f12 = ((Boolean) obj).booleanValue() ? 1.0f : 0.0f;
                        RadiusCircleViewImpl radiusCircleViewImpl2 = this.f182663c.f182710l.f182766u;
                        if (radiusCircleViewImpl2 == null || (viewPropertyAnimatorAnimate = radiusCircleViewImpl2.animate()) == null || (duration = viewPropertyAnimatorAnimate.setDuration(180L)) == null || (viewPropertyAnimatorAlpha = duration.alpha(f12)) == null) {
                            return;
                        }
                        viewPropertyAnimatorAlpha.start();
                        return;
                    case 12:
                        vW.e eVar = (vW.e) obj;
                        String str5 = eVar.f440800a;
                        int length = str5.length();
                        b bVar10 = this.f182663c;
                        k kVar11 = bVar10.f182710l;
                        if (length == 0) {
                            Button button6 = kVar11.f182763r;
                            if (button6 != null) {
                                button6.setText(bVar10.f182705i.getF182435a());
                            }
                            Button button7 = kVar11.f182763r;
                            if (button7 == null) {
                                return;
                            }
                            button7.setEnabled(false);
                            return;
                        }
                        Button button8 = kVar11.f182763r;
                        if (button8 != null) {
                            button8.setText(str5);
                        }
                        Button button9 = kVar11.f182763r;
                        if (button9 == null) {
                            return;
                        }
                        button9.setEnabled(eVar.f440801b);
                        return;
                    case 13:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        k kVar12 = this.f182663c.f182710l;
                        kVar12.f182747b.setEnabled(zBooleanValue3);
                        kVar12.f182758m.setEnabled(zBooleanValue3);
                        return;
                    case 14:
                        b bVar11 = this.f182663c;
                        bVar11.f182695d.I1((AddressParameter.Value) obj, bVar11.f182707j);
                        return;
                    default:
                        b bVar12 = this.f182663c;
                        bVar12.f182720v.accept(ScreenCloseFromBlock.f182205d);
                        bVar12.f182695d.E3((Radius) obj);
                        bVar12.f182672I.accept(G0.f406611a);
                        return;
                }
            }
        };
        final int i25 = 9;
        this.f182700f0 = new l41.g(this) { // from class: com.avito.android.location_picker.view.publish.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f182663c;

            {
                this.f182663c = this;
            }

            @Override // l41.g
            public final void accept(Object obj) throws Resources.NotFoundException {
                String string;
                Button button2;
                AvitoMapBounds avitoMapBounds;
                ViewPropertyAnimator viewPropertyAnimatorAnimate;
                ViewPropertyAnimator duration;
                ViewPropertyAnimator viewPropertyAnimatorAlpha;
                switch (i25) {
                    case 0:
                        String str2 = (String) obj;
                        b bVar3 = this.f182663c;
                        com.avito.android.lib.design.tooltip.k kVar2 = bVar3.f182718t;
                        if (kVar2 != null) {
                            kVar2.dismiss();
                        }
                        bVar3.f182718t = null;
                        com.avito.android.lib.design.tooltip.k kVar3 = new com.avito.android.lib.design.tooltip.k(bVar3.f182691b.getContext(), 0, 0, 6, null);
                        kVar3.f181224j = new r.a(new i.a(new b.a()));
                        int i132 = kVar3.f181229o;
                        kVar3.f181228n = -2;
                        kVar3.f181229o = i132;
                        com.avito.android.lib.design.tooltip.p.a(kVar3, new b.l(str2));
                        bVar3.f182718t = kVar3.f(bVar3.f182710l.f182756k);
                        return;
                    case 1:
                        vW.j jVar = (vW.j) obj;
                        boolean z16 = jVar instanceof vW.m;
                        int i142 = R.string.lp_network_error;
                        Integer numValueOf = Integer.valueOf(R.string.lp_network_error);
                        Integer numValueOf2 = Integer.valueOf(R.string.lp_repeat);
                        b bVar4 = this.f182663c;
                        boolean z17 = bVar4.f182697e;
                        com.avito.android.location_picker.providers.z zVar2 = bVar4.f182705i;
                        k kVar4 = bVar4.f182710l;
                        if (z16) {
                            if (z17) {
                                Button button3 = kVar4.f182763r;
                                if (button3 != null) {
                                    button3.setText(zVar2.getF182436b());
                                }
                            } else {
                                i142 = R.string.lp_network_error_confirmation;
                            }
                            b.O(bVar4, Integer.valueOf(i142), null, numValueOf2, bVar4.new C5354b(), 2);
                            return;
                        }
                        if (jVar instanceof q) {
                            b.O(bVar4, Integer.valueOf(R.string.location_permission_required), null, Integer.valueOf(R.string.lp_settings), bVar4.new c(), 2);
                            return;
                        }
                        if (jVar instanceof vW.i) {
                            b.O(bVar4, Integer.valueOf(R.string.loc_providers_unavailable_message), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.l) {
                            if (z17 && (button2 = kVar4.f182763r) != null) {
                                button2.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new d(), 2);
                            return;
                        }
                        if (jVar instanceof vW.k) {
                            b.O(bVar4, null, ((vW.k) jVar).f440807a, null, null, 13);
                            return;
                        }
                        if (jVar instanceof vW.r) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_not_suggested_address_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.o) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_suggests_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.h) {
                            if (bVar4.f182717s != null) {
                                return;
                            }
                            com.avito.android.location_picker.job.f fVar3 = bVar4.f182701g;
                            boolean z18 = fVar3 instanceof f.b;
                            Resources resources = bVar4.f182709k;
                            if (z18) {
                                string = resources.getString(R.string.lp_empty_address_error_for_job_assistant);
                            } else {
                                if (!(fVar3 instanceof f.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                string = resources.getString(R.string.lp_empty_address_error);
                            }
                            com.avito.android.lib.design.modal.a aVarC2 = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, bVar4.f182691b.getContext(), new b.e(string, bVar4));
                            bVar4.f182717s = aVarC2;
                            com.avito.android.lib.util.g.a(aVarC2);
                            return;
                        }
                        if (jVar instanceof C49273c) {
                            Button button4 = kVar4.f182763r;
                            if (button4 != null) {
                                button4.setText(zVar2.getF182436b());
                                return;
                            }
                            return;
                        }
                        if (jVar instanceof vW.d) {
                            Button button5 = kVar4.f182763r;
                            if (button5 != null) {
                                button5.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new f(), 2);
                            return;
                        }
                        if (jVar instanceof vW.n) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_coords_error), null, numValueOf2, null, 10);
                            return;
                        }
                        if (!(jVar instanceof vW.p)) {
                            jVar.equals(C49272b.f440797a);
                            return;
                        }
                        com.avito.android.lib.design.toast_bar.k kVar5 = bVar4.f182716r;
                        if (kVar5 != null) {
                            kVar5.f();
                            return;
                        }
                        return;
                    case 2:
                        D6.G(this.f182663c.f182710l.f182753h, ((Boolean) obj).booleanValue());
                        return;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        b bVar5 = this.f182663c;
                        if (bVar5.f182699f) {
                            return;
                        }
                        k kVar6 = bVar5.f182710l;
                        kVar6.f182747b.setLoading(zBooleanValue);
                        boolean z19 = !zBooleanValue;
                        kVar6.f182747b.setEnabled(z19);
                        kVar6.f182758m.setEnabled(z19);
                        return;
                    case 4:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        b bVar6 = this.f182663c;
                        k kVar7 = bVar6.f182710l;
                        D6.G(kVar7.f182756k, zBooleanValue2);
                        kVar7.f182749d.setLayoutParams(new CoordinatorLayout.g(-1, zBooleanValue2 ? -1 : -2));
                        boolean z22 = !zBooleanValue2;
                        D6.G(kVar7.f182757l, z22);
                        D6.G(kVar7.f182752g, z22);
                        D6.G(kVar7.f182755j, z22);
                        PublishSearchLocationInput publishSearchLocationInput3 = kVar7.f182756k;
                        if (zBooleanValue2) {
                            publishSearchLocationInput3.requestFocus();
                            publishSearchLocationInput3.q();
                            publishSearchLocationInput3.v();
                            return;
                        }
                        publishSearchLocationInput3.clearFocus();
                        D6.w(kVar7.f182760o);
                        Fragment fragment2 = bVar6.f182693c;
                        K2.e(fragment2);
                        ActivityC22955m activityC22955mL1 = fragment2.l1();
                        if ((activityC22955mL1 != null ? activityC22955mL1.getCurrentFocus() : null) == null) {
                            ActivityC22955m activityC22955mL12 = fragment2.l1();
                            Object systemService = activityC22955mL12 != null ? activityC22955mL12.getSystemService("input_method") : null;
                            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                            if (inputMethodManager != null) {
                                inputMethodManager.hideSoftInputFromWindow(bVar6.f182691b.getWindowToken(), 0);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        String str3 = (String) obj;
                        k kVar8 = this.f182663c.f182710l;
                        if (str3.equals(String.valueOf(kVar8.f182756k.m53getText()))) {
                            return;
                        }
                        Input.t(kVar8.f182756k, str3, false, 6);
                        Input.t(kVar8.f182758m, str3, false, 6);
                        return;
                    case 6:
                        Editable editableM53getText = this.f182663c.f182710l.f182756k.m53getText();
                        if (editableM53getText != null) {
                            editableM53getText.clear();
                            return;
                        }
                        return;
                    case 7:
                        List<AddressSuggestion> list = (List) obj;
                        boolean zIsEmpty = list.isEmpty();
                        b bVar7 = this.f182663c;
                        k kVar9 = bVar7.f182710l;
                        if (zIsEmpty) {
                            D6.w(kVar9.f182760o);
                            return;
                        }
                        D6.G(kVar9.f182760o, true);
                        X x13 = bVar7.f182715q;
                        x13.f182553f = list;
                        x13.notifyDataSetChanged();
                        return;
                    case 8:
                        AvitoMapCameraPosition avitoMapCameraPosition = (AvitoMapCameraPosition) obj;
                        AvitoMap avitoMap = this.f182663c.f182711m;
                        if (avitoMap != null) {
                            boolean z23 = avitoMapCameraPosition.getZoomLevel() == avitoMap.getMapTarget().getZoomLevel();
                            boolean zAlmostEqual = AvitoMapPointKt.almostEqual(avitoMapCameraPosition.getMapPoint(), avitoMap.getMapTarget().getPoint());
                            if (avitoMapCameraPosition.getViewportBounds() != null) {
                                AvitoMapBounds viewportBounds = avitoMapCameraPosition.getViewportBounds();
                                if (viewportBounds != null) {
                                    avitoMap.moveTo(viewportBounds, true);
                                    return;
                                }
                                return;
                            }
                            if (!z23 && !zAlmostEqual) {
                                avitoMap.moveTo(avitoMapCameraPosition.getMapPoint(), true, Float.valueOf(avitoMapCameraPosition.getZoomLevel()));
                                return;
                            } else if (!z23) {
                                AvitoMap.DefaultImpls.zoomTo$default(avitoMap, avitoMapCameraPosition.getZoomLevel(), false, null, 6, null);
                                return;
                            } else {
                                if (zAlmostEqual) {
                                    return;
                                }
                                AvitoMap.DefaultImpls.moveTo$default(avitoMap, avitoMapCameraPosition.getMapPoint(), true, null, 4, null);
                                return;
                            }
                        }
                        return;
                    case 9:
                        vW.f fVar4 = (vW.f) obj;
                        b bVar8 = this.f182663c;
                        com.avito.android.location_picker.view.radius.f fVar5 = bVar8.f182712n;
                        if (fVar5.f182793c == null) {
                            k kVar10 = bVar8.f182710l;
                            View view2 = kVar10.f182764s;
                            if (view2 != null) {
                                D6.w(view2);
                            }
                            View view3 = kVar10.f182765t;
                            if (view3 != null) {
                                D6.H(view3);
                            }
                            com.avito.android.location_picker.view.radius.i iVar = bVar8.f182713o;
                            if (iVar != null) {
                                List<Radius> list2 = fVar4.f440802a;
                                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                                for (Radius radius : list2) {
                                    String id2 = radius.getId();
                                    String str4 = "";
                                    if (id2 == null) {
                                        id2 = "";
                                    }
                                    String title = radius.getTitle();
                                    if (title != null) {
                                        str4 = title;
                                    }
                                    arrayList.add(new com.avito.android.location_picker.view.radius.a(id2, radius.getDistanceInMeters(), Boolean.valueOf(radius.isActive()), str4));
                                }
                                fVar5.a(iVar, arrayList);
                            }
                        }
                        if (fVar4.f440804c.longValue() == 0 || (avitoMapBounds = fVar4.f440803b) == null) {
                            return;
                        }
                        List listU = C42745f0.U(avitoMapBounds.getTopLeft(), avitoMapBounds.getBottomRight());
                        AvitoMap avitoMap2 = bVar8.f182711m;
                        if (avitoMap2 != null) {
                            AvitoMap.DefaultImpls.moveToPointsWithPadding$default(avitoMap2, listU, Integer.valueOf(bVar8.f182705i.getF182438d()), null, false, null, 28, null);
                            return;
                        }
                        return;
                    case 10:
                        b bVar9 = this.f182663c;
                        float fIntValue = (float) ((((Number) bVar9.f182719u.getValue()).intValue() * r15.f440816b) / ((s) obj).f440815a);
                        RadiusCircleViewImpl radiusCircleViewImpl = bVar9.f182710l.f182766u;
                        if (radiusCircleViewImpl != null) {
                            radiusCircleViewImpl.setRadius(fIntValue);
                            return;
                        }
                        return;
                    case 11:
                        float f12 = ((Boolean) obj).booleanValue() ? 1.0f : 0.0f;
                        RadiusCircleViewImpl radiusCircleViewImpl2 = this.f182663c.f182710l.f182766u;
                        if (radiusCircleViewImpl2 == null || (viewPropertyAnimatorAnimate = radiusCircleViewImpl2.animate()) == null || (duration = viewPropertyAnimatorAnimate.setDuration(180L)) == null || (viewPropertyAnimatorAlpha = duration.alpha(f12)) == null) {
                            return;
                        }
                        viewPropertyAnimatorAlpha.start();
                        return;
                    case 12:
                        vW.e eVar = (vW.e) obj;
                        String str5 = eVar.f440800a;
                        int length = str5.length();
                        b bVar10 = this.f182663c;
                        k kVar11 = bVar10.f182710l;
                        if (length == 0) {
                            Button button6 = kVar11.f182763r;
                            if (button6 != null) {
                                button6.setText(bVar10.f182705i.getF182435a());
                            }
                            Button button7 = kVar11.f182763r;
                            if (button7 == null) {
                                return;
                            }
                            button7.setEnabled(false);
                            return;
                        }
                        Button button8 = kVar11.f182763r;
                        if (button8 != null) {
                            button8.setText(str5);
                        }
                        Button button9 = kVar11.f182763r;
                        if (button9 == null) {
                            return;
                        }
                        button9.setEnabled(eVar.f440801b);
                        return;
                    case 13:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        k kVar12 = this.f182663c.f182710l;
                        kVar12.f182747b.setEnabled(zBooleanValue3);
                        kVar12.f182758m.setEnabled(zBooleanValue3);
                        return;
                    case 14:
                        b bVar11 = this.f182663c;
                        bVar11.f182695d.I1((AddressParameter.Value) obj, bVar11.f182707j);
                        return;
                    default:
                        b bVar12 = this.f182663c;
                        bVar12.f182720v.accept(ScreenCloseFromBlock.f182205d);
                        bVar12.f182695d.E3((Radius) obj);
                        bVar12.f182672I.accept(G0.f406611a);
                        return;
                }
            }
        };
        final int i26 = 10;
        this.f182702g0 = new l41.g(this) { // from class: com.avito.android.location_picker.view.publish.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f182663c;

            {
                this.f182663c = this;
            }

            @Override // l41.g
            public final void accept(Object obj) throws Resources.NotFoundException {
                String string;
                Button button2;
                AvitoMapBounds avitoMapBounds;
                ViewPropertyAnimator viewPropertyAnimatorAnimate;
                ViewPropertyAnimator duration;
                ViewPropertyAnimator viewPropertyAnimatorAlpha;
                switch (i26) {
                    case 0:
                        String str2 = (String) obj;
                        b bVar3 = this.f182663c;
                        com.avito.android.lib.design.tooltip.k kVar2 = bVar3.f182718t;
                        if (kVar2 != null) {
                            kVar2.dismiss();
                        }
                        bVar3.f182718t = null;
                        com.avito.android.lib.design.tooltip.k kVar3 = new com.avito.android.lib.design.tooltip.k(bVar3.f182691b.getContext(), 0, 0, 6, null);
                        kVar3.f181224j = new r.a(new i.a(new b.a()));
                        int i132 = kVar3.f181229o;
                        kVar3.f181228n = -2;
                        kVar3.f181229o = i132;
                        com.avito.android.lib.design.tooltip.p.a(kVar3, new b.l(str2));
                        bVar3.f182718t = kVar3.f(bVar3.f182710l.f182756k);
                        return;
                    case 1:
                        vW.j jVar = (vW.j) obj;
                        boolean z16 = jVar instanceof vW.m;
                        int i142 = R.string.lp_network_error;
                        Integer numValueOf = Integer.valueOf(R.string.lp_network_error);
                        Integer numValueOf2 = Integer.valueOf(R.string.lp_repeat);
                        b bVar4 = this.f182663c;
                        boolean z17 = bVar4.f182697e;
                        com.avito.android.location_picker.providers.z zVar2 = bVar4.f182705i;
                        k kVar4 = bVar4.f182710l;
                        if (z16) {
                            if (z17) {
                                Button button3 = kVar4.f182763r;
                                if (button3 != null) {
                                    button3.setText(zVar2.getF182436b());
                                }
                            } else {
                                i142 = R.string.lp_network_error_confirmation;
                            }
                            b.O(bVar4, Integer.valueOf(i142), null, numValueOf2, bVar4.new C5354b(), 2);
                            return;
                        }
                        if (jVar instanceof q) {
                            b.O(bVar4, Integer.valueOf(R.string.location_permission_required), null, Integer.valueOf(R.string.lp_settings), bVar4.new c(), 2);
                            return;
                        }
                        if (jVar instanceof vW.i) {
                            b.O(bVar4, Integer.valueOf(R.string.loc_providers_unavailable_message), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.l) {
                            if (z17 && (button2 = kVar4.f182763r) != null) {
                                button2.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new d(), 2);
                            return;
                        }
                        if (jVar instanceof vW.k) {
                            b.O(bVar4, null, ((vW.k) jVar).f440807a, null, null, 13);
                            return;
                        }
                        if (jVar instanceof vW.r) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_not_suggested_address_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.o) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_suggests_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.h) {
                            if (bVar4.f182717s != null) {
                                return;
                            }
                            com.avito.android.location_picker.job.f fVar3 = bVar4.f182701g;
                            boolean z18 = fVar3 instanceof f.b;
                            Resources resources = bVar4.f182709k;
                            if (z18) {
                                string = resources.getString(R.string.lp_empty_address_error_for_job_assistant);
                            } else {
                                if (!(fVar3 instanceof f.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                string = resources.getString(R.string.lp_empty_address_error);
                            }
                            com.avito.android.lib.design.modal.a aVarC2 = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, bVar4.f182691b.getContext(), new b.e(string, bVar4));
                            bVar4.f182717s = aVarC2;
                            com.avito.android.lib.util.g.a(aVarC2);
                            return;
                        }
                        if (jVar instanceof C49273c) {
                            Button button4 = kVar4.f182763r;
                            if (button4 != null) {
                                button4.setText(zVar2.getF182436b());
                                return;
                            }
                            return;
                        }
                        if (jVar instanceof vW.d) {
                            Button button5 = kVar4.f182763r;
                            if (button5 != null) {
                                button5.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new f(), 2);
                            return;
                        }
                        if (jVar instanceof vW.n) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_coords_error), null, numValueOf2, null, 10);
                            return;
                        }
                        if (!(jVar instanceof vW.p)) {
                            jVar.equals(C49272b.f440797a);
                            return;
                        }
                        com.avito.android.lib.design.toast_bar.k kVar5 = bVar4.f182716r;
                        if (kVar5 != null) {
                            kVar5.f();
                            return;
                        }
                        return;
                    case 2:
                        D6.G(this.f182663c.f182710l.f182753h, ((Boolean) obj).booleanValue());
                        return;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        b bVar5 = this.f182663c;
                        if (bVar5.f182699f) {
                            return;
                        }
                        k kVar6 = bVar5.f182710l;
                        kVar6.f182747b.setLoading(zBooleanValue);
                        boolean z19 = !zBooleanValue;
                        kVar6.f182747b.setEnabled(z19);
                        kVar6.f182758m.setEnabled(z19);
                        return;
                    case 4:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        b bVar6 = this.f182663c;
                        k kVar7 = bVar6.f182710l;
                        D6.G(kVar7.f182756k, zBooleanValue2);
                        kVar7.f182749d.setLayoutParams(new CoordinatorLayout.g(-1, zBooleanValue2 ? -1 : -2));
                        boolean z22 = !zBooleanValue2;
                        D6.G(kVar7.f182757l, z22);
                        D6.G(kVar7.f182752g, z22);
                        D6.G(kVar7.f182755j, z22);
                        PublishSearchLocationInput publishSearchLocationInput3 = kVar7.f182756k;
                        if (zBooleanValue2) {
                            publishSearchLocationInput3.requestFocus();
                            publishSearchLocationInput3.q();
                            publishSearchLocationInput3.v();
                            return;
                        }
                        publishSearchLocationInput3.clearFocus();
                        D6.w(kVar7.f182760o);
                        Fragment fragment2 = bVar6.f182693c;
                        K2.e(fragment2);
                        ActivityC22955m activityC22955mL1 = fragment2.l1();
                        if ((activityC22955mL1 != null ? activityC22955mL1.getCurrentFocus() : null) == null) {
                            ActivityC22955m activityC22955mL12 = fragment2.l1();
                            Object systemService = activityC22955mL12 != null ? activityC22955mL12.getSystemService("input_method") : null;
                            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                            if (inputMethodManager != null) {
                                inputMethodManager.hideSoftInputFromWindow(bVar6.f182691b.getWindowToken(), 0);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        String str3 = (String) obj;
                        k kVar8 = this.f182663c.f182710l;
                        if (str3.equals(String.valueOf(kVar8.f182756k.m53getText()))) {
                            return;
                        }
                        Input.t(kVar8.f182756k, str3, false, 6);
                        Input.t(kVar8.f182758m, str3, false, 6);
                        return;
                    case 6:
                        Editable editableM53getText = this.f182663c.f182710l.f182756k.m53getText();
                        if (editableM53getText != null) {
                            editableM53getText.clear();
                            return;
                        }
                        return;
                    case 7:
                        List<AddressSuggestion> list = (List) obj;
                        boolean zIsEmpty = list.isEmpty();
                        b bVar7 = this.f182663c;
                        k kVar9 = bVar7.f182710l;
                        if (zIsEmpty) {
                            D6.w(kVar9.f182760o);
                            return;
                        }
                        D6.G(kVar9.f182760o, true);
                        X x13 = bVar7.f182715q;
                        x13.f182553f = list;
                        x13.notifyDataSetChanged();
                        return;
                    case 8:
                        AvitoMapCameraPosition avitoMapCameraPosition = (AvitoMapCameraPosition) obj;
                        AvitoMap avitoMap = this.f182663c.f182711m;
                        if (avitoMap != null) {
                            boolean z23 = avitoMapCameraPosition.getZoomLevel() == avitoMap.getMapTarget().getZoomLevel();
                            boolean zAlmostEqual = AvitoMapPointKt.almostEqual(avitoMapCameraPosition.getMapPoint(), avitoMap.getMapTarget().getPoint());
                            if (avitoMapCameraPosition.getViewportBounds() != null) {
                                AvitoMapBounds viewportBounds = avitoMapCameraPosition.getViewportBounds();
                                if (viewportBounds != null) {
                                    avitoMap.moveTo(viewportBounds, true);
                                    return;
                                }
                                return;
                            }
                            if (!z23 && !zAlmostEqual) {
                                avitoMap.moveTo(avitoMapCameraPosition.getMapPoint(), true, Float.valueOf(avitoMapCameraPosition.getZoomLevel()));
                                return;
                            } else if (!z23) {
                                AvitoMap.DefaultImpls.zoomTo$default(avitoMap, avitoMapCameraPosition.getZoomLevel(), false, null, 6, null);
                                return;
                            } else {
                                if (zAlmostEqual) {
                                    return;
                                }
                                AvitoMap.DefaultImpls.moveTo$default(avitoMap, avitoMapCameraPosition.getMapPoint(), true, null, 4, null);
                                return;
                            }
                        }
                        return;
                    case 9:
                        vW.f fVar4 = (vW.f) obj;
                        b bVar8 = this.f182663c;
                        com.avito.android.location_picker.view.radius.f fVar5 = bVar8.f182712n;
                        if (fVar5.f182793c == null) {
                            k kVar10 = bVar8.f182710l;
                            View view2 = kVar10.f182764s;
                            if (view2 != null) {
                                D6.w(view2);
                            }
                            View view3 = kVar10.f182765t;
                            if (view3 != null) {
                                D6.H(view3);
                            }
                            com.avito.android.location_picker.view.radius.i iVar = bVar8.f182713o;
                            if (iVar != null) {
                                List<Radius> list2 = fVar4.f440802a;
                                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                                for (Radius radius : list2) {
                                    String id2 = radius.getId();
                                    String str4 = "";
                                    if (id2 == null) {
                                        id2 = "";
                                    }
                                    String title = radius.getTitle();
                                    if (title != null) {
                                        str4 = title;
                                    }
                                    arrayList.add(new com.avito.android.location_picker.view.radius.a(id2, radius.getDistanceInMeters(), Boolean.valueOf(radius.isActive()), str4));
                                }
                                fVar5.a(iVar, arrayList);
                            }
                        }
                        if (fVar4.f440804c.longValue() == 0 || (avitoMapBounds = fVar4.f440803b) == null) {
                            return;
                        }
                        List listU = C42745f0.U(avitoMapBounds.getTopLeft(), avitoMapBounds.getBottomRight());
                        AvitoMap avitoMap2 = bVar8.f182711m;
                        if (avitoMap2 != null) {
                            AvitoMap.DefaultImpls.moveToPointsWithPadding$default(avitoMap2, listU, Integer.valueOf(bVar8.f182705i.getF182438d()), null, false, null, 28, null);
                            return;
                        }
                        return;
                    case 10:
                        b bVar9 = this.f182663c;
                        float fIntValue = (float) ((((Number) bVar9.f182719u.getValue()).intValue() * r15.f440816b) / ((s) obj).f440815a);
                        RadiusCircleViewImpl radiusCircleViewImpl = bVar9.f182710l.f182766u;
                        if (radiusCircleViewImpl != null) {
                            radiusCircleViewImpl.setRadius(fIntValue);
                            return;
                        }
                        return;
                    case 11:
                        float f12 = ((Boolean) obj).booleanValue() ? 1.0f : 0.0f;
                        RadiusCircleViewImpl radiusCircleViewImpl2 = this.f182663c.f182710l.f182766u;
                        if (radiusCircleViewImpl2 == null || (viewPropertyAnimatorAnimate = radiusCircleViewImpl2.animate()) == null || (duration = viewPropertyAnimatorAnimate.setDuration(180L)) == null || (viewPropertyAnimatorAlpha = duration.alpha(f12)) == null) {
                            return;
                        }
                        viewPropertyAnimatorAlpha.start();
                        return;
                    case 12:
                        vW.e eVar = (vW.e) obj;
                        String str5 = eVar.f440800a;
                        int length = str5.length();
                        b bVar10 = this.f182663c;
                        k kVar11 = bVar10.f182710l;
                        if (length == 0) {
                            Button button6 = kVar11.f182763r;
                            if (button6 != null) {
                                button6.setText(bVar10.f182705i.getF182435a());
                            }
                            Button button7 = kVar11.f182763r;
                            if (button7 == null) {
                                return;
                            }
                            button7.setEnabled(false);
                            return;
                        }
                        Button button8 = kVar11.f182763r;
                        if (button8 != null) {
                            button8.setText(str5);
                        }
                        Button button9 = kVar11.f182763r;
                        if (button9 == null) {
                            return;
                        }
                        button9.setEnabled(eVar.f440801b);
                        return;
                    case 13:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        k kVar12 = this.f182663c.f182710l;
                        kVar12.f182747b.setEnabled(zBooleanValue3);
                        kVar12.f182758m.setEnabled(zBooleanValue3);
                        return;
                    case 14:
                        b bVar11 = this.f182663c;
                        bVar11.f182695d.I1((AddressParameter.Value) obj, bVar11.f182707j);
                        return;
                    default:
                        b bVar12 = this.f182663c;
                        bVar12.f182720v.accept(ScreenCloseFromBlock.f182205d);
                        bVar12.f182695d.E3((Radius) obj);
                        bVar12.f182672I.accept(G0.f406611a);
                        return;
                }
            }
        };
        final int i27 = 11;
        this.f182704h0 = new l41.g(this) { // from class: com.avito.android.location_picker.view.publish.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f182663c;

            {
                this.f182663c = this;
            }

            @Override // l41.g
            public final void accept(Object obj) throws Resources.NotFoundException {
                String string;
                Button button2;
                AvitoMapBounds avitoMapBounds;
                ViewPropertyAnimator viewPropertyAnimatorAnimate;
                ViewPropertyAnimator duration;
                ViewPropertyAnimator viewPropertyAnimatorAlpha;
                switch (i27) {
                    case 0:
                        String str2 = (String) obj;
                        b bVar3 = this.f182663c;
                        com.avito.android.lib.design.tooltip.k kVar2 = bVar3.f182718t;
                        if (kVar2 != null) {
                            kVar2.dismiss();
                        }
                        bVar3.f182718t = null;
                        com.avito.android.lib.design.tooltip.k kVar3 = new com.avito.android.lib.design.tooltip.k(bVar3.f182691b.getContext(), 0, 0, 6, null);
                        kVar3.f181224j = new r.a(new i.a(new b.a()));
                        int i132 = kVar3.f181229o;
                        kVar3.f181228n = -2;
                        kVar3.f181229o = i132;
                        com.avito.android.lib.design.tooltip.p.a(kVar3, new b.l(str2));
                        bVar3.f182718t = kVar3.f(bVar3.f182710l.f182756k);
                        return;
                    case 1:
                        vW.j jVar = (vW.j) obj;
                        boolean z16 = jVar instanceof vW.m;
                        int i142 = R.string.lp_network_error;
                        Integer numValueOf = Integer.valueOf(R.string.lp_network_error);
                        Integer numValueOf2 = Integer.valueOf(R.string.lp_repeat);
                        b bVar4 = this.f182663c;
                        boolean z17 = bVar4.f182697e;
                        com.avito.android.location_picker.providers.z zVar2 = bVar4.f182705i;
                        k kVar4 = bVar4.f182710l;
                        if (z16) {
                            if (z17) {
                                Button button3 = kVar4.f182763r;
                                if (button3 != null) {
                                    button3.setText(zVar2.getF182436b());
                                }
                            } else {
                                i142 = R.string.lp_network_error_confirmation;
                            }
                            b.O(bVar4, Integer.valueOf(i142), null, numValueOf2, bVar4.new C5354b(), 2);
                            return;
                        }
                        if (jVar instanceof q) {
                            b.O(bVar4, Integer.valueOf(R.string.location_permission_required), null, Integer.valueOf(R.string.lp_settings), bVar4.new c(), 2);
                            return;
                        }
                        if (jVar instanceof vW.i) {
                            b.O(bVar4, Integer.valueOf(R.string.loc_providers_unavailable_message), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.l) {
                            if (z17 && (button2 = kVar4.f182763r) != null) {
                                button2.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new d(), 2);
                            return;
                        }
                        if (jVar instanceof vW.k) {
                            b.O(bVar4, null, ((vW.k) jVar).f440807a, null, null, 13);
                            return;
                        }
                        if (jVar instanceof vW.r) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_not_suggested_address_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.o) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_suggests_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.h) {
                            if (bVar4.f182717s != null) {
                                return;
                            }
                            com.avito.android.location_picker.job.f fVar3 = bVar4.f182701g;
                            boolean z18 = fVar3 instanceof f.b;
                            Resources resources = bVar4.f182709k;
                            if (z18) {
                                string = resources.getString(R.string.lp_empty_address_error_for_job_assistant);
                            } else {
                                if (!(fVar3 instanceof f.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                string = resources.getString(R.string.lp_empty_address_error);
                            }
                            com.avito.android.lib.design.modal.a aVarC2 = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, bVar4.f182691b.getContext(), new b.e(string, bVar4));
                            bVar4.f182717s = aVarC2;
                            com.avito.android.lib.util.g.a(aVarC2);
                            return;
                        }
                        if (jVar instanceof C49273c) {
                            Button button4 = kVar4.f182763r;
                            if (button4 != null) {
                                button4.setText(zVar2.getF182436b());
                                return;
                            }
                            return;
                        }
                        if (jVar instanceof vW.d) {
                            Button button5 = kVar4.f182763r;
                            if (button5 != null) {
                                button5.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new f(), 2);
                            return;
                        }
                        if (jVar instanceof vW.n) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_coords_error), null, numValueOf2, null, 10);
                            return;
                        }
                        if (!(jVar instanceof vW.p)) {
                            jVar.equals(C49272b.f440797a);
                            return;
                        }
                        com.avito.android.lib.design.toast_bar.k kVar5 = bVar4.f182716r;
                        if (kVar5 != null) {
                            kVar5.f();
                            return;
                        }
                        return;
                    case 2:
                        D6.G(this.f182663c.f182710l.f182753h, ((Boolean) obj).booleanValue());
                        return;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        b bVar5 = this.f182663c;
                        if (bVar5.f182699f) {
                            return;
                        }
                        k kVar6 = bVar5.f182710l;
                        kVar6.f182747b.setLoading(zBooleanValue);
                        boolean z19 = !zBooleanValue;
                        kVar6.f182747b.setEnabled(z19);
                        kVar6.f182758m.setEnabled(z19);
                        return;
                    case 4:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        b bVar6 = this.f182663c;
                        k kVar7 = bVar6.f182710l;
                        D6.G(kVar7.f182756k, zBooleanValue2);
                        kVar7.f182749d.setLayoutParams(new CoordinatorLayout.g(-1, zBooleanValue2 ? -1 : -2));
                        boolean z22 = !zBooleanValue2;
                        D6.G(kVar7.f182757l, z22);
                        D6.G(kVar7.f182752g, z22);
                        D6.G(kVar7.f182755j, z22);
                        PublishSearchLocationInput publishSearchLocationInput3 = kVar7.f182756k;
                        if (zBooleanValue2) {
                            publishSearchLocationInput3.requestFocus();
                            publishSearchLocationInput3.q();
                            publishSearchLocationInput3.v();
                            return;
                        }
                        publishSearchLocationInput3.clearFocus();
                        D6.w(kVar7.f182760o);
                        Fragment fragment2 = bVar6.f182693c;
                        K2.e(fragment2);
                        ActivityC22955m activityC22955mL1 = fragment2.l1();
                        if ((activityC22955mL1 != null ? activityC22955mL1.getCurrentFocus() : null) == null) {
                            ActivityC22955m activityC22955mL12 = fragment2.l1();
                            Object systemService = activityC22955mL12 != null ? activityC22955mL12.getSystemService("input_method") : null;
                            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                            if (inputMethodManager != null) {
                                inputMethodManager.hideSoftInputFromWindow(bVar6.f182691b.getWindowToken(), 0);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        String str3 = (String) obj;
                        k kVar8 = this.f182663c.f182710l;
                        if (str3.equals(String.valueOf(kVar8.f182756k.m53getText()))) {
                            return;
                        }
                        Input.t(kVar8.f182756k, str3, false, 6);
                        Input.t(kVar8.f182758m, str3, false, 6);
                        return;
                    case 6:
                        Editable editableM53getText = this.f182663c.f182710l.f182756k.m53getText();
                        if (editableM53getText != null) {
                            editableM53getText.clear();
                            return;
                        }
                        return;
                    case 7:
                        List<AddressSuggestion> list = (List) obj;
                        boolean zIsEmpty = list.isEmpty();
                        b bVar7 = this.f182663c;
                        k kVar9 = bVar7.f182710l;
                        if (zIsEmpty) {
                            D6.w(kVar9.f182760o);
                            return;
                        }
                        D6.G(kVar9.f182760o, true);
                        X x13 = bVar7.f182715q;
                        x13.f182553f = list;
                        x13.notifyDataSetChanged();
                        return;
                    case 8:
                        AvitoMapCameraPosition avitoMapCameraPosition = (AvitoMapCameraPosition) obj;
                        AvitoMap avitoMap = this.f182663c.f182711m;
                        if (avitoMap != null) {
                            boolean z23 = avitoMapCameraPosition.getZoomLevel() == avitoMap.getMapTarget().getZoomLevel();
                            boolean zAlmostEqual = AvitoMapPointKt.almostEqual(avitoMapCameraPosition.getMapPoint(), avitoMap.getMapTarget().getPoint());
                            if (avitoMapCameraPosition.getViewportBounds() != null) {
                                AvitoMapBounds viewportBounds = avitoMapCameraPosition.getViewportBounds();
                                if (viewportBounds != null) {
                                    avitoMap.moveTo(viewportBounds, true);
                                    return;
                                }
                                return;
                            }
                            if (!z23 && !zAlmostEqual) {
                                avitoMap.moveTo(avitoMapCameraPosition.getMapPoint(), true, Float.valueOf(avitoMapCameraPosition.getZoomLevel()));
                                return;
                            } else if (!z23) {
                                AvitoMap.DefaultImpls.zoomTo$default(avitoMap, avitoMapCameraPosition.getZoomLevel(), false, null, 6, null);
                                return;
                            } else {
                                if (zAlmostEqual) {
                                    return;
                                }
                                AvitoMap.DefaultImpls.moveTo$default(avitoMap, avitoMapCameraPosition.getMapPoint(), true, null, 4, null);
                                return;
                            }
                        }
                        return;
                    case 9:
                        vW.f fVar4 = (vW.f) obj;
                        b bVar8 = this.f182663c;
                        com.avito.android.location_picker.view.radius.f fVar5 = bVar8.f182712n;
                        if (fVar5.f182793c == null) {
                            k kVar10 = bVar8.f182710l;
                            View view2 = kVar10.f182764s;
                            if (view2 != null) {
                                D6.w(view2);
                            }
                            View view3 = kVar10.f182765t;
                            if (view3 != null) {
                                D6.H(view3);
                            }
                            com.avito.android.location_picker.view.radius.i iVar = bVar8.f182713o;
                            if (iVar != null) {
                                List<Radius> list2 = fVar4.f440802a;
                                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                                for (Radius radius : list2) {
                                    String id2 = radius.getId();
                                    String str4 = "";
                                    if (id2 == null) {
                                        id2 = "";
                                    }
                                    String title = radius.getTitle();
                                    if (title != null) {
                                        str4 = title;
                                    }
                                    arrayList.add(new com.avito.android.location_picker.view.radius.a(id2, radius.getDistanceInMeters(), Boolean.valueOf(radius.isActive()), str4));
                                }
                                fVar5.a(iVar, arrayList);
                            }
                        }
                        if (fVar4.f440804c.longValue() == 0 || (avitoMapBounds = fVar4.f440803b) == null) {
                            return;
                        }
                        List listU = C42745f0.U(avitoMapBounds.getTopLeft(), avitoMapBounds.getBottomRight());
                        AvitoMap avitoMap2 = bVar8.f182711m;
                        if (avitoMap2 != null) {
                            AvitoMap.DefaultImpls.moveToPointsWithPadding$default(avitoMap2, listU, Integer.valueOf(bVar8.f182705i.getF182438d()), null, false, null, 28, null);
                            return;
                        }
                        return;
                    case 10:
                        b bVar9 = this.f182663c;
                        float fIntValue = (float) ((((Number) bVar9.f182719u.getValue()).intValue() * r15.f440816b) / ((s) obj).f440815a);
                        RadiusCircleViewImpl radiusCircleViewImpl = bVar9.f182710l.f182766u;
                        if (radiusCircleViewImpl != null) {
                            radiusCircleViewImpl.setRadius(fIntValue);
                            return;
                        }
                        return;
                    case 11:
                        float f12 = ((Boolean) obj).booleanValue() ? 1.0f : 0.0f;
                        RadiusCircleViewImpl radiusCircleViewImpl2 = this.f182663c.f182710l.f182766u;
                        if (radiusCircleViewImpl2 == null || (viewPropertyAnimatorAnimate = radiusCircleViewImpl2.animate()) == null || (duration = viewPropertyAnimatorAnimate.setDuration(180L)) == null || (viewPropertyAnimatorAlpha = duration.alpha(f12)) == null) {
                            return;
                        }
                        viewPropertyAnimatorAlpha.start();
                        return;
                    case 12:
                        vW.e eVar = (vW.e) obj;
                        String str5 = eVar.f440800a;
                        int length = str5.length();
                        b bVar10 = this.f182663c;
                        k kVar11 = bVar10.f182710l;
                        if (length == 0) {
                            Button button6 = kVar11.f182763r;
                            if (button6 != null) {
                                button6.setText(bVar10.f182705i.getF182435a());
                            }
                            Button button7 = kVar11.f182763r;
                            if (button7 == null) {
                                return;
                            }
                            button7.setEnabled(false);
                            return;
                        }
                        Button button8 = kVar11.f182763r;
                        if (button8 != null) {
                            button8.setText(str5);
                        }
                        Button button9 = kVar11.f182763r;
                        if (button9 == null) {
                            return;
                        }
                        button9.setEnabled(eVar.f440801b);
                        return;
                    case 13:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        k kVar12 = this.f182663c.f182710l;
                        kVar12.f182747b.setEnabled(zBooleanValue3);
                        kVar12.f182758m.setEnabled(zBooleanValue3);
                        return;
                    case 14:
                        b bVar11 = this.f182663c;
                        bVar11.f182695d.I1((AddressParameter.Value) obj, bVar11.f182707j);
                        return;
                    default:
                        b bVar12 = this.f182663c;
                        bVar12.f182720v.accept(ScreenCloseFromBlock.f182205d);
                        bVar12.f182695d.E3((Radius) obj);
                        bVar12.f182672I.accept(G0.f406611a);
                        return;
                }
            }
        };
        final int i28 = 12;
        this.f182706i0 = new l41.g(this) { // from class: com.avito.android.location_picker.view.publish.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f182663c;

            {
                this.f182663c = this;
            }

            @Override // l41.g
            public final void accept(Object obj) throws Resources.NotFoundException {
                String string;
                Button button2;
                AvitoMapBounds avitoMapBounds;
                ViewPropertyAnimator viewPropertyAnimatorAnimate;
                ViewPropertyAnimator duration;
                ViewPropertyAnimator viewPropertyAnimatorAlpha;
                switch (i28) {
                    case 0:
                        String str2 = (String) obj;
                        b bVar3 = this.f182663c;
                        com.avito.android.lib.design.tooltip.k kVar2 = bVar3.f182718t;
                        if (kVar2 != null) {
                            kVar2.dismiss();
                        }
                        bVar3.f182718t = null;
                        com.avito.android.lib.design.tooltip.k kVar3 = new com.avito.android.lib.design.tooltip.k(bVar3.f182691b.getContext(), 0, 0, 6, null);
                        kVar3.f181224j = new r.a(new i.a(new b.a()));
                        int i132 = kVar3.f181229o;
                        kVar3.f181228n = -2;
                        kVar3.f181229o = i132;
                        com.avito.android.lib.design.tooltip.p.a(kVar3, new b.l(str2));
                        bVar3.f182718t = kVar3.f(bVar3.f182710l.f182756k);
                        return;
                    case 1:
                        vW.j jVar = (vW.j) obj;
                        boolean z16 = jVar instanceof vW.m;
                        int i142 = R.string.lp_network_error;
                        Integer numValueOf = Integer.valueOf(R.string.lp_network_error);
                        Integer numValueOf2 = Integer.valueOf(R.string.lp_repeat);
                        b bVar4 = this.f182663c;
                        boolean z17 = bVar4.f182697e;
                        com.avito.android.location_picker.providers.z zVar2 = bVar4.f182705i;
                        k kVar4 = bVar4.f182710l;
                        if (z16) {
                            if (z17) {
                                Button button3 = kVar4.f182763r;
                                if (button3 != null) {
                                    button3.setText(zVar2.getF182436b());
                                }
                            } else {
                                i142 = R.string.lp_network_error_confirmation;
                            }
                            b.O(bVar4, Integer.valueOf(i142), null, numValueOf2, bVar4.new C5354b(), 2);
                            return;
                        }
                        if (jVar instanceof q) {
                            b.O(bVar4, Integer.valueOf(R.string.location_permission_required), null, Integer.valueOf(R.string.lp_settings), bVar4.new c(), 2);
                            return;
                        }
                        if (jVar instanceof vW.i) {
                            b.O(bVar4, Integer.valueOf(R.string.loc_providers_unavailable_message), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.l) {
                            if (z17 && (button2 = kVar4.f182763r) != null) {
                                button2.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new d(), 2);
                            return;
                        }
                        if (jVar instanceof vW.k) {
                            b.O(bVar4, null, ((vW.k) jVar).f440807a, null, null, 13);
                            return;
                        }
                        if (jVar instanceof vW.r) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_not_suggested_address_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.o) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_suggests_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.h) {
                            if (bVar4.f182717s != null) {
                                return;
                            }
                            com.avito.android.location_picker.job.f fVar3 = bVar4.f182701g;
                            boolean z18 = fVar3 instanceof f.b;
                            Resources resources = bVar4.f182709k;
                            if (z18) {
                                string = resources.getString(R.string.lp_empty_address_error_for_job_assistant);
                            } else {
                                if (!(fVar3 instanceof f.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                string = resources.getString(R.string.lp_empty_address_error);
                            }
                            com.avito.android.lib.design.modal.a aVarC2 = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, bVar4.f182691b.getContext(), new b.e(string, bVar4));
                            bVar4.f182717s = aVarC2;
                            com.avito.android.lib.util.g.a(aVarC2);
                            return;
                        }
                        if (jVar instanceof C49273c) {
                            Button button4 = kVar4.f182763r;
                            if (button4 != null) {
                                button4.setText(zVar2.getF182436b());
                                return;
                            }
                            return;
                        }
                        if (jVar instanceof vW.d) {
                            Button button5 = kVar4.f182763r;
                            if (button5 != null) {
                                button5.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new f(), 2);
                            return;
                        }
                        if (jVar instanceof vW.n) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_coords_error), null, numValueOf2, null, 10);
                            return;
                        }
                        if (!(jVar instanceof vW.p)) {
                            jVar.equals(C49272b.f440797a);
                            return;
                        }
                        com.avito.android.lib.design.toast_bar.k kVar5 = bVar4.f182716r;
                        if (kVar5 != null) {
                            kVar5.f();
                            return;
                        }
                        return;
                    case 2:
                        D6.G(this.f182663c.f182710l.f182753h, ((Boolean) obj).booleanValue());
                        return;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        b bVar5 = this.f182663c;
                        if (bVar5.f182699f) {
                            return;
                        }
                        k kVar6 = bVar5.f182710l;
                        kVar6.f182747b.setLoading(zBooleanValue);
                        boolean z19 = !zBooleanValue;
                        kVar6.f182747b.setEnabled(z19);
                        kVar6.f182758m.setEnabled(z19);
                        return;
                    case 4:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        b bVar6 = this.f182663c;
                        k kVar7 = bVar6.f182710l;
                        D6.G(kVar7.f182756k, zBooleanValue2);
                        kVar7.f182749d.setLayoutParams(new CoordinatorLayout.g(-1, zBooleanValue2 ? -1 : -2));
                        boolean z22 = !zBooleanValue2;
                        D6.G(kVar7.f182757l, z22);
                        D6.G(kVar7.f182752g, z22);
                        D6.G(kVar7.f182755j, z22);
                        PublishSearchLocationInput publishSearchLocationInput3 = kVar7.f182756k;
                        if (zBooleanValue2) {
                            publishSearchLocationInput3.requestFocus();
                            publishSearchLocationInput3.q();
                            publishSearchLocationInput3.v();
                            return;
                        }
                        publishSearchLocationInput3.clearFocus();
                        D6.w(kVar7.f182760o);
                        Fragment fragment2 = bVar6.f182693c;
                        K2.e(fragment2);
                        ActivityC22955m activityC22955mL1 = fragment2.l1();
                        if ((activityC22955mL1 != null ? activityC22955mL1.getCurrentFocus() : null) == null) {
                            ActivityC22955m activityC22955mL12 = fragment2.l1();
                            Object systemService = activityC22955mL12 != null ? activityC22955mL12.getSystemService("input_method") : null;
                            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                            if (inputMethodManager != null) {
                                inputMethodManager.hideSoftInputFromWindow(bVar6.f182691b.getWindowToken(), 0);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        String str3 = (String) obj;
                        k kVar8 = this.f182663c.f182710l;
                        if (str3.equals(String.valueOf(kVar8.f182756k.m53getText()))) {
                            return;
                        }
                        Input.t(kVar8.f182756k, str3, false, 6);
                        Input.t(kVar8.f182758m, str3, false, 6);
                        return;
                    case 6:
                        Editable editableM53getText = this.f182663c.f182710l.f182756k.m53getText();
                        if (editableM53getText != null) {
                            editableM53getText.clear();
                            return;
                        }
                        return;
                    case 7:
                        List<AddressSuggestion> list = (List) obj;
                        boolean zIsEmpty = list.isEmpty();
                        b bVar7 = this.f182663c;
                        k kVar9 = bVar7.f182710l;
                        if (zIsEmpty) {
                            D6.w(kVar9.f182760o);
                            return;
                        }
                        D6.G(kVar9.f182760o, true);
                        X x13 = bVar7.f182715q;
                        x13.f182553f = list;
                        x13.notifyDataSetChanged();
                        return;
                    case 8:
                        AvitoMapCameraPosition avitoMapCameraPosition = (AvitoMapCameraPosition) obj;
                        AvitoMap avitoMap = this.f182663c.f182711m;
                        if (avitoMap != null) {
                            boolean z23 = avitoMapCameraPosition.getZoomLevel() == avitoMap.getMapTarget().getZoomLevel();
                            boolean zAlmostEqual = AvitoMapPointKt.almostEqual(avitoMapCameraPosition.getMapPoint(), avitoMap.getMapTarget().getPoint());
                            if (avitoMapCameraPosition.getViewportBounds() != null) {
                                AvitoMapBounds viewportBounds = avitoMapCameraPosition.getViewportBounds();
                                if (viewportBounds != null) {
                                    avitoMap.moveTo(viewportBounds, true);
                                    return;
                                }
                                return;
                            }
                            if (!z23 && !zAlmostEqual) {
                                avitoMap.moveTo(avitoMapCameraPosition.getMapPoint(), true, Float.valueOf(avitoMapCameraPosition.getZoomLevel()));
                                return;
                            } else if (!z23) {
                                AvitoMap.DefaultImpls.zoomTo$default(avitoMap, avitoMapCameraPosition.getZoomLevel(), false, null, 6, null);
                                return;
                            } else {
                                if (zAlmostEqual) {
                                    return;
                                }
                                AvitoMap.DefaultImpls.moveTo$default(avitoMap, avitoMapCameraPosition.getMapPoint(), true, null, 4, null);
                                return;
                            }
                        }
                        return;
                    case 9:
                        vW.f fVar4 = (vW.f) obj;
                        b bVar8 = this.f182663c;
                        com.avito.android.location_picker.view.radius.f fVar5 = bVar8.f182712n;
                        if (fVar5.f182793c == null) {
                            k kVar10 = bVar8.f182710l;
                            View view2 = kVar10.f182764s;
                            if (view2 != null) {
                                D6.w(view2);
                            }
                            View view3 = kVar10.f182765t;
                            if (view3 != null) {
                                D6.H(view3);
                            }
                            com.avito.android.location_picker.view.radius.i iVar = bVar8.f182713o;
                            if (iVar != null) {
                                List<Radius> list2 = fVar4.f440802a;
                                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                                for (Radius radius : list2) {
                                    String id2 = radius.getId();
                                    String str4 = "";
                                    if (id2 == null) {
                                        id2 = "";
                                    }
                                    String title = radius.getTitle();
                                    if (title != null) {
                                        str4 = title;
                                    }
                                    arrayList.add(new com.avito.android.location_picker.view.radius.a(id2, radius.getDistanceInMeters(), Boolean.valueOf(radius.isActive()), str4));
                                }
                                fVar5.a(iVar, arrayList);
                            }
                        }
                        if (fVar4.f440804c.longValue() == 0 || (avitoMapBounds = fVar4.f440803b) == null) {
                            return;
                        }
                        List listU = C42745f0.U(avitoMapBounds.getTopLeft(), avitoMapBounds.getBottomRight());
                        AvitoMap avitoMap2 = bVar8.f182711m;
                        if (avitoMap2 != null) {
                            AvitoMap.DefaultImpls.moveToPointsWithPadding$default(avitoMap2, listU, Integer.valueOf(bVar8.f182705i.getF182438d()), null, false, null, 28, null);
                            return;
                        }
                        return;
                    case 10:
                        b bVar9 = this.f182663c;
                        float fIntValue = (float) ((((Number) bVar9.f182719u.getValue()).intValue() * r15.f440816b) / ((s) obj).f440815a);
                        RadiusCircleViewImpl radiusCircleViewImpl = bVar9.f182710l.f182766u;
                        if (radiusCircleViewImpl != null) {
                            radiusCircleViewImpl.setRadius(fIntValue);
                            return;
                        }
                        return;
                    case 11:
                        float f12 = ((Boolean) obj).booleanValue() ? 1.0f : 0.0f;
                        RadiusCircleViewImpl radiusCircleViewImpl2 = this.f182663c.f182710l.f182766u;
                        if (radiusCircleViewImpl2 == null || (viewPropertyAnimatorAnimate = radiusCircleViewImpl2.animate()) == null || (duration = viewPropertyAnimatorAnimate.setDuration(180L)) == null || (viewPropertyAnimatorAlpha = duration.alpha(f12)) == null) {
                            return;
                        }
                        viewPropertyAnimatorAlpha.start();
                        return;
                    case 12:
                        vW.e eVar = (vW.e) obj;
                        String str5 = eVar.f440800a;
                        int length = str5.length();
                        b bVar10 = this.f182663c;
                        k kVar11 = bVar10.f182710l;
                        if (length == 0) {
                            Button button6 = kVar11.f182763r;
                            if (button6 != null) {
                                button6.setText(bVar10.f182705i.getF182435a());
                            }
                            Button button7 = kVar11.f182763r;
                            if (button7 == null) {
                                return;
                            }
                            button7.setEnabled(false);
                            return;
                        }
                        Button button8 = kVar11.f182763r;
                        if (button8 != null) {
                            button8.setText(str5);
                        }
                        Button button9 = kVar11.f182763r;
                        if (button9 == null) {
                            return;
                        }
                        button9.setEnabled(eVar.f440801b);
                        return;
                    case 13:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        k kVar12 = this.f182663c.f182710l;
                        kVar12.f182747b.setEnabled(zBooleanValue3);
                        kVar12.f182758m.setEnabled(zBooleanValue3);
                        return;
                    case 14:
                        b bVar11 = this.f182663c;
                        bVar11.f182695d.I1((AddressParameter.Value) obj, bVar11.f182707j);
                        return;
                    default:
                        b bVar12 = this.f182663c;
                        bVar12.f182720v.accept(ScreenCloseFromBlock.f182205d);
                        bVar12.f182695d.E3((Radius) obj);
                        bVar12.f182672I.accept(G0.f406611a);
                        return;
                }
            }
        };
        final int i29 = 1;
        this.f182708j0 = new l41.g(this) { // from class: com.avito.android.location_picker.view.publish.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f182663c;

            {
                this.f182663c = this;
            }

            @Override // l41.g
            public final void accept(Object obj) throws Resources.NotFoundException {
                String string;
                Button button2;
                AvitoMapBounds avitoMapBounds;
                ViewPropertyAnimator viewPropertyAnimatorAnimate;
                ViewPropertyAnimator duration;
                ViewPropertyAnimator viewPropertyAnimatorAlpha;
                switch (i29) {
                    case 0:
                        String str2 = (String) obj;
                        b bVar3 = this.f182663c;
                        com.avito.android.lib.design.tooltip.k kVar2 = bVar3.f182718t;
                        if (kVar2 != null) {
                            kVar2.dismiss();
                        }
                        bVar3.f182718t = null;
                        com.avito.android.lib.design.tooltip.k kVar3 = new com.avito.android.lib.design.tooltip.k(bVar3.f182691b.getContext(), 0, 0, 6, null);
                        kVar3.f181224j = new r.a(new i.a(new b.a()));
                        int i132 = kVar3.f181229o;
                        kVar3.f181228n = -2;
                        kVar3.f181229o = i132;
                        com.avito.android.lib.design.tooltip.p.a(kVar3, new b.l(str2));
                        bVar3.f182718t = kVar3.f(bVar3.f182710l.f182756k);
                        return;
                    case 1:
                        vW.j jVar = (vW.j) obj;
                        boolean z16 = jVar instanceof vW.m;
                        int i142 = R.string.lp_network_error;
                        Integer numValueOf = Integer.valueOf(R.string.lp_network_error);
                        Integer numValueOf2 = Integer.valueOf(R.string.lp_repeat);
                        b bVar4 = this.f182663c;
                        boolean z17 = bVar4.f182697e;
                        com.avito.android.location_picker.providers.z zVar2 = bVar4.f182705i;
                        k kVar4 = bVar4.f182710l;
                        if (z16) {
                            if (z17) {
                                Button button3 = kVar4.f182763r;
                                if (button3 != null) {
                                    button3.setText(zVar2.getF182436b());
                                }
                            } else {
                                i142 = R.string.lp_network_error_confirmation;
                            }
                            b.O(bVar4, Integer.valueOf(i142), null, numValueOf2, bVar4.new C5354b(), 2);
                            return;
                        }
                        if (jVar instanceof q) {
                            b.O(bVar4, Integer.valueOf(R.string.location_permission_required), null, Integer.valueOf(R.string.lp_settings), bVar4.new c(), 2);
                            return;
                        }
                        if (jVar instanceof vW.i) {
                            b.O(bVar4, Integer.valueOf(R.string.loc_providers_unavailable_message), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.l) {
                            if (z17 && (button2 = kVar4.f182763r) != null) {
                                button2.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new d(), 2);
                            return;
                        }
                        if (jVar instanceof vW.k) {
                            b.O(bVar4, null, ((vW.k) jVar).f440807a, null, null, 13);
                            return;
                        }
                        if (jVar instanceof vW.r) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_not_suggested_address_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.o) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_suggests_error), null, null, null, 14);
                            return;
                        }
                        if (jVar instanceof vW.h) {
                            if (bVar4.f182717s != null) {
                                return;
                            }
                            com.avito.android.location_picker.job.f fVar3 = bVar4.f182701g;
                            boolean z18 = fVar3 instanceof f.b;
                            Resources resources = bVar4.f182709k;
                            if (z18) {
                                string = resources.getString(R.string.lp_empty_address_error_for_job_assistant);
                            } else {
                                if (!(fVar3 instanceof f.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                string = resources.getString(R.string.lp_empty_address_error);
                            }
                            com.avito.android.lib.design.modal.a aVarC2 = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, bVar4.f182691b.getContext(), new b.e(string, bVar4));
                            bVar4.f182717s = aVarC2;
                            com.avito.android.lib.util.g.a(aVarC2);
                            return;
                        }
                        if (jVar instanceof C49273c) {
                            Button button4 = kVar4.f182763r;
                            if (button4 != null) {
                                button4.setText(zVar2.getF182436b());
                                return;
                            }
                            return;
                        }
                        if (jVar instanceof vW.d) {
                            Button button5 = kVar4.f182763r;
                            if (button5 != null) {
                                button5.setText(zVar2.getF182436b());
                            }
                            b.O(bVar4, numValueOf, null, numValueOf2, bVar4.new f(), 2);
                            return;
                        }
                        if (jVar instanceof vW.n) {
                            b.O(bVar4, Integer.valueOf(R.string.lp_no_coords_error), null, numValueOf2, null, 10);
                            return;
                        }
                        if (!(jVar instanceof vW.p)) {
                            jVar.equals(C49272b.f440797a);
                            return;
                        }
                        com.avito.android.lib.design.toast_bar.k kVar5 = bVar4.f182716r;
                        if (kVar5 != null) {
                            kVar5.f();
                            return;
                        }
                        return;
                    case 2:
                        D6.G(this.f182663c.f182710l.f182753h, ((Boolean) obj).booleanValue());
                        return;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        b bVar5 = this.f182663c;
                        if (bVar5.f182699f) {
                            return;
                        }
                        k kVar6 = bVar5.f182710l;
                        kVar6.f182747b.setLoading(zBooleanValue);
                        boolean z19 = !zBooleanValue;
                        kVar6.f182747b.setEnabled(z19);
                        kVar6.f182758m.setEnabled(z19);
                        return;
                    case 4:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        b bVar6 = this.f182663c;
                        k kVar7 = bVar6.f182710l;
                        D6.G(kVar7.f182756k, zBooleanValue2);
                        kVar7.f182749d.setLayoutParams(new CoordinatorLayout.g(-1, zBooleanValue2 ? -1 : -2));
                        boolean z22 = !zBooleanValue2;
                        D6.G(kVar7.f182757l, z22);
                        D6.G(kVar7.f182752g, z22);
                        D6.G(kVar7.f182755j, z22);
                        PublishSearchLocationInput publishSearchLocationInput3 = kVar7.f182756k;
                        if (zBooleanValue2) {
                            publishSearchLocationInput3.requestFocus();
                            publishSearchLocationInput3.q();
                            publishSearchLocationInput3.v();
                            return;
                        }
                        publishSearchLocationInput3.clearFocus();
                        D6.w(kVar7.f182760o);
                        Fragment fragment2 = bVar6.f182693c;
                        K2.e(fragment2);
                        ActivityC22955m activityC22955mL1 = fragment2.l1();
                        if ((activityC22955mL1 != null ? activityC22955mL1.getCurrentFocus() : null) == null) {
                            ActivityC22955m activityC22955mL12 = fragment2.l1();
                            Object systemService = activityC22955mL12 != null ? activityC22955mL12.getSystemService("input_method") : null;
                            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                            if (inputMethodManager != null) {
                                inputMethodManager.hideSoftInputFromWindow(bVar6.f182691b.getWindowToken(), 0);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        String str3 = (String) obj;
                        k kVar8 = this.f182663c.f182710l;
                        if (str3.equals(String.valueOf(kVar8.f182756k.m53getText()))) {
                            return;
                        }
                        Input.t(kVar8.f182756k, str3, false, 6);
                        Input.t(kVar8.f182758m, str3, false, 6);
                        return;
                    case 6:
                        Editable editableM53getText = this.f182663c.f182710l.f182756k.m53getText();
                        if (editableM53getText != null) {
                            editableM53getText.clear();
                            return;
                        }
                        return;
                    case 7:
                        List<AddressSuggestion> list = (List) obj;
                        boolean zIsEmpty = list.isEmpty();
                        b bVar7 = this.f182663c;
                        k kVar9 = bVar7.f182710l;
                        if (zIsEmpty) {
                            D6.w(kVar9.f182760o);
                            return;
                        }
                        D6.G(kVar9.f182760o, true);
                        X x13 = bVar7.f182715q;
                        x13.f182553f = list;
                        x13.notifyDataSetChanged();
                        return;
                    case 8:
                        AvitoMapCameraPosition avitoMapCameraPosition = (AvitoMapCameraPosition) obj;
                        AvitoMap avitoMap = this.f182663c.f182711m;
                        if (avitoMap != null) {
                            boolean z23 = avitoMapCameraPosition.getZoomLevel() == avitoMap.getMapTarget().getZoomLevel();
                            boolean zAlmostEqual = AvitoMapPointKt.almostEqual(avitoMapCameraPosition.getMapPoint(), avitoMap.getMapTarget().getPoint());
                            if (avitoMapCameraPosition.getViewportBounds() != null) {
                                AvitoMapBounds viewportBounds = avitoMapCameraPosition.getViewportBounds();
                                if (viewportBounds != null) {
                                    avitoMap.moveTo(viewportBounds, true);
                                    return;
                                }
                                return;
                            }
                            if (!z23 && !zAlmostEqual) {
                                avitoMap.moveTo(avitoMapCameraPosition.getMapPoint(), true, Float.valueOf(avitoMapCameraPosition.getZoomLevel()));
                                return;
                            } else if (!z23) {
                                AvitoMap.DefaultImpls.zoomTo$default(avitoMap, avitoMapCameraPosition.getZoomLevel(), false, null, 6, null);
                                return;
                            } else {
                                if (zAlmostEqual) {
                                    return;
                                }
                                AvitoMap.DefaultImpls.moveTo$default(avitoMap, avitoMapCameraPosition.getMapPoint(), true, null, 4, null);
                                return;
                            }
                        }
                        return;
                    case 9:
                        vW.f fVar4 = (vW.f) obj;
                        b bVar8 = this.f182663c;
                        com.avito.android.location_picker.view.radius.f fVar5 = bVar8.f182712n;
                        if (fVar5.f182793c == null) {
                            k kVar10 = bVar8.f182710l;
                            View view2 = kVar10.f182764s;
                            if (view2 != null) {
                                D6.w(view2);
                            }
                            View view3 = kVar10.f182765t;
                            if (view3 != null) {
                                D6.H(view3);
                            }
                            com.avito.android.location_picker.view.radius.i iVar = bVar8.f182713o;
                            if (iVar != null) {
                                List<Radius> list2 = fVar4.f440802a;
                                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                                for (Radius radius : list2) {
                                    String id2 = radius.getId();
                                    String str4 = "";
                                    if (id2 == null) {
                                        id2 = "";
                                    }
                                    String title = radius.getTitle();
                                    if (title != null) {
                                        str4 = title;
                                    }
                                    arrayList.add(new com.avito.android.location_picker.view.radius.a(id2, radius.getDistanceInMeters(), Boolean.valueOf(radius.isActive()), str4));
                                }
                                fVar5.a(iVar, arrayList);
                            }
                        }
                        if (fVar4.f440804c.longValue() == 0 || (avitoMapBounds = fVar4.f440803b) == null) {
                            return;
                        }
                        List listU = C42745f0.U(avitoMapBounds.getTopLeft(), avitoMapBounds.getBottomRight());
                        AvitoMap avitoMap2 = bVar8.f182711m;
                        if (avitoMap2 != null) {
                            AvitoMap.DefaultImpls.moveToPointsWithPadding$default(avitoMap2, listU, Integer.valueOf(bVar8.f182705i.getF182438d()), null, false, null, 28, null);
                            return;
                        }
                        return;
                    case 10:
                        b bVar9 = this.f182663c;
                        float fIntValue = (float) ((((Number) bVar9.f182719u.getValue()).intValue() * r15.f440816b) / ((s) obj).f440815a);
                        RadiusCircleViewImpl radiusCircleViewImpl = bVar9.f182710l.f182766u;
                        if (radiusCircleViewImpl != null) {
                            radiusCircleViewImpl.setRadius(fIntValue);
                            return;
                        }
                        return;
                    case 11:
                        float f12 = ((Boolean) obj).booleanValue() ? 1.0f : 0.0f;
                        RadiusCircleViewImpl radiusCircleViewImpl2 = this.f182663c.f182710l.f182766u;
                        if (radiusCircleViewImpl2 == null || (viewPropertyAnimatorAnimate = radiusCircleViewImpl2.animate()) == null || (duration = viewPropertyAnimatorAnimate.setDuration(180L)) == null || (viewPropertyAnimatorAlpha = duration.alpha(f12)) == null) {
                            return;
                        }
                        viewPropertyAnimatorAlpha.start();
                        return;
                    case 12:
                        vW.e eVar = (vW.e) obj;
                        String str5 = eVar.f440800a;
                        int length = str5.length();
                        b bVar10 = this.f182663c;
                        k kVar11 = bVar10.f182710l;
                        if (length == 0) {
                            Button button6 = kVar11.f182763r;
                            if (button6 != null) {
                                button6.setText(bVar10.f182705i.getF182435a());
                            }
                            Button button7 = kVar11.f182763r;
                            if (button7 == null) {
                                return;
                            }
                            button7.setEnabled(false);
                            return;
                        }
                        Button button8 = kVar11.f182763r;
                        if (button8 != null) {
                            button8.setText(str5);
                        }
                        Button button9 = kVar11.f182763r;
                        if (button9 == null) {
                            return;
                        }
                        button9.setEnabled(eVar.f440801b);
                        return;
                    case 13:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        k kVar12 = this.f182663c.f182710l;
                        kVar12.f182747b.setEnabled(zBooleanValue3);
                        kVar12.f182758m.setEnabled(zBooleanValue3);
                        return;
                    case 14:
                        b bVar11 = this.f182663c;
                        bVar11.f182695d.I1((AddressParameter.Value) obj, bVar11.f182707j);
                        return;
                    default:
                        b bVar12 = this.f182663c;
                        bVar12.f182720v.accept(ScreenCloseFromBlock.f182205d);
                        bVar12.f182695d.E3((Radius) obj);
                        bVar12.f182672I.accept(G0.f406611a);
                        return;
                }
            }
        };
        k02.f();
        NavBar navBar = kVar.f182748c;
        if (z14) {
            D6.w(navBar);
            z15 = z12;
        } else {
            z15 = z12;
            NavBar.e(navBar, context.getString(z15 ? R.string.lp_search_radius : R.string.lp_address), 0, 6);
            navBar.c(R.attr.ic_arrowBack24, new com.avito.android.location_picker.view.publish.i(this));
        }
        kVar.f182759n.setAdapter(x12);
        if (button != null) {
            button.setText(zVar.getF182436b());
        }
        D6.G(kVar.f182761p, z15);
        if (z15) {
            C42670a.d(c42670a);
            RadiusCircleViewImpl radiusCircleViewImpl = kVar.f182766u;
            if (radiusCircleViewImpl != null) {
                D6.H(radiusCircleViewImpl);
            }
            aVar.a();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) floatingActionButton.getLayoutParams();
            marginLayoutParams.bottomMargin = zVar.getF182437c();
            floatingActionButton.setLayoutParams(marginLayoutParams);
        }
        if (button != null) {
            button.setAppearance(R.style.Re23_Button_PrimaryLarge);
        }
        publishSearchLocationInput.r();
        publishSearchLocationInput.setClearButtonListener(new com.avito.android.location_picker.view.publish.g(this));
        publishSearchLocationInput2.setComponentType(ComponentType.f179284e);
        publishSearchLocationInput2.r();
        publishSearchLocationInput2.setClearButtonListener(new com.avito.android.location_picker.view.publish.h(this));
        if (z13) {
            aVar.N();
        }
        avitoMapAttachHelper.setMapAttachedListener(this);
        avitoMapAttachHelper.attachView(R.id.map, kVar.f182746a, fragment.getChildFragmentManager());
        k02.b();
        AvitoMap avitoMap = this.f182711m;
        if (avitoMap != null) {
            BlackPinView blackPinView = kVar.f182752g;
            blackPinView.getClass();
            avitoMap.addMoveStartListener(blackPinView);
            avitoMap.addMoveEndListener(blackPinView);
        }
    }

    public static void O(b bVar, Integer num, String str, Integer num2, Y41.a aVar, int i12) {
        Integer num3 = (i12 & 1) != 0 ? null : num;
        String string = (i12 & 2) != 0 ? null : str;
        Integer num4 = (i12 & 4) != 0 ? null : num2;
        Y41.a aVar2 = (i12 & 8) != 0 ? com.avito.android.location_picker.view.publish.j.f182745l : aVar;
        Resources resources = bVar.f182709k;
        if (string == null) {
            string = num3 != null ? resources.getString(num3.intValue()) : null;
            if (string == null) {
                return;
            }
        }
        String string2 = num4 != null ? resources.getString(num4.intValue()) : null;
        com.avito.android.lib.design.toast_bar.k kVarB = com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, bVar.f182710l.f182757l, com.avito.android.printable_text.b.f(string), null, string2 != null ? Collections.singletonList(new c.a.C3719a(string2, false, null, aVar2, 4, null)) : null, null, null, -1, ToastBarPosition.f181044b, null, false, false, null, null, 3994);
        bVar.f182716r = kVarB;
        D6.H(kVarB);
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<Boolean> A() {
        return this.f182684U;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<Boolean> B() {
        return this.f182690a0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    @Y61.k
    /* renamed from: B4, reason: from getter */
    public final com.jakewharton.rxrelay3.b getF182678O() {
        return this.f182678O;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<vW.f> C() {
        return this.f182700f0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    @Y61.k
    /* renamed from: D, reason: from getter */
    public final io.reactivex.rxjava3.subjects.e getF182673J() {
        return this.f182673J;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    /* renamed from: E, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF182668E() {
        return this.f182668E;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    @Y61.k
    public final z<G0> F() {
        return this.f182669F;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    /* renamed from: H, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF182723y() {
        return this.f182723y;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<AvitoMapCameraPosition> I() {
        return this.f182698e0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<Boolean> J() {
        return this.f182688Y;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<Radius> K() {
        return this.f182687X;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<List<AddressSuggestion>> L() {
        return this.f182696d0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<Boolean> M() {
        return this.f182704h0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    /* renamed from: N, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF182721w() {
        return this.f182721w;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    /* renamed from: a, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF182720v() {
        return this.f182720v;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    /* renamed from: b, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF182724z() {
        return this.f182724z;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<AddressParameter.Value> d() {
        return this.f182686W;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31580b
    public final void e() {
        AvitoMap avitoMap = this.f182711m;
        if (avitoMap != null) {
            avitoMap.onStop(true);
        }
        this.f182711m = null;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<vW.j> f() {
        return this.f182708j0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    @Y61.k
    public final z<Boolean> g() {
        return this.f182681R;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    /* renamed from: h, reason: from getter */
    public final com.jakewharton.rxrelay3.b getF182664A() {
        return this.f182664A;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    @Y61.k
    /* renamed from: i, reason: from getter */
    public final T0 getF182680Q() {
        return this.f182680Q;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    /* renamed from: j, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF182672I() {
        return this.f182672I;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<Boolean> k() {
        return this.f182685V;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    @Y61.k
    public final z<G0> l() {
        return this.f182683T;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    @Y61.k
    /* renamed from: m, reason: from getter */
    public final B0 getF182679P() {
        return this.f182679P;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<String> n() {
        return this.f182692b0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<String> o() {
        return this.f182689Z;
    }

    @Override // com.avito.android.avito_map.AvitoMapAttachHelper.MapAttachListener
    public final void onMapAttach(@Y61.k AvitoMap avitoMap) {
        AvitoMapTarget avitoMapTarget = this.f182703h;
        if (avitoMapTarget != null) {
            avitoMap.restoreTarget(avitoMapTarget);
            C42670a c42670a = this.f182714p;
            if (!D6.y(this.f182710l.f182751f)) {
                c42670a.b();
            }
        }
        this.f182711m = avitoMap;
        AvitoMapUiSettings uiSettings = avitoMap.getUiSettings();
        uiSettings.isMyLocationButtonEnabled(true);
        uiSettings.isZoomControlsEnabled(false);
        uiSettings.isCompassEnabled(false);
        uiSettings.isRotateGesturesEnabled(false);
        uiSettings.isFastTapEnabled(true);
        avitoMap.addMoveStartListener(new com.avito.android.location_picker.view.publish.d(this));
        avitoMap.addMoveEndListener(new com.avito.android.location_picker.view.publish.e(this));
        this.f182677N.accept(G0.f406611a);
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31580b
    public final void onStart() {
        AvitoMap avitoMap = this.f182711m;
        if (avitoMap != null) {
            avitoMap.onStart();
        }
        Fragment fragment = this.f182693c;
        C19918B.a(fragment.requireActivity().getF21241d(), fragment.getViewLifecycleOwner(), new com.avito.android.location_picker.view.publish.f(this), 2);
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31580b
    public final void onStop() {
        AvitoMap avitoMap = this.f182711m;
        if (avitoMap != null) {
            avitoMap.onStop(false);
        }
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    /* renamed from: p, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF182666C() {
        return this.f182666C;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<s> q() {
        return this.f182702g0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<vW.e> r() {
        return this.f182706i0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    @Y61.l
    public final z<G0> s() {
        return this.f182671H;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    @Y61.k
    public final z<com.avito.android.location_picker.view.radius.a> t() {
        return this.f182674K;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    /* renamed from: u, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF182722x() {
        return this.f182722x;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    @Y61.k
    public final z<G0> v() {
        return this.f182665B;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    @Y61.k
    public final z<G0> w() {
        return this.f182676M;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<G0> x() {
        return this.f182694c0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    /* renamed from: y, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF182667D() {
        return this.f182667D;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    @Y61.k
    /* renamed from: z, reason: from getter */
    public final T0 getF182670G() {
        return this.f182670G;
    }

    public /* synthetic */ b(View view, Fragment fragment, N0 n02, boolean z12, boolean z13, com.avito.android.location_picker.job.f fVar, LocationPickerChooseButtonLocation locationPickerChooseButtonLocation, AvitoMapAttachHelper avitoMapAttachHelper, AvitoMapTarget avitoMapTarget, com.avito.android.location_picker.providers.z zVar, boolean z14, K0 k02, String str, int i12, C42822w c42822w) {
        this(view, fragment, n02, z12, z13, fVar, locationPickerChooseButtonLocation, avitoMapAttachHelper, avitoMapTarget, zVar, (i12 & 1024) != 0 ? false : z14, k02, str);
    }
}
