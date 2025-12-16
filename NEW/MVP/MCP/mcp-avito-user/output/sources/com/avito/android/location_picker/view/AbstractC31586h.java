package com.avito.android.location_picker.view;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapTarget;
import com.avito.android.component.snackbar.d;
import com.avito.android.component.toast.c;
import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.location_picker.K0;
import com.avito.android.location_picker.N0;
import com.avito.android.location_picker.job.f;
import com.avito.android.location_picker.view.AbstractC31586h;
import com.avito.android.location_picker.view.AbstractC31586h.f;
import com.avito.android.location_picker.view.AbstractC31586h.g;
import com.avito.android.location_picker.view.AbstractC31586h.i;
import com.avito.android.location_picker.view.AbstractC31586h.n;
import com.avito.android.location_picker.view.radius.RadiusCircleViewImpl;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.ui.view.BackPressedNotifyingEditText;
import com.avito.android.util.D6;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.jakewharton.rxbinding4.view.C37722i;
import com.jakewharton.rxbinding4.widget.C37750f0;
import com.jakewharton.rxbinding4.widget.y0;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.T0;
import java.util.Collections;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import vW.C49272b;
import vW.C49273c;

/* compiled from: LocationPickerView.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/location_picker/view/h;", "Lcom/avito/android/location_picker/view/a;", "Lcom/avito/android/location_picker/view/c;", "Lcom/avito/android/avito_map/AvitoMapAttachHelper$MapAttachListener;", "Lcom/avito/android/location_picker/view/b;", "a", "b", "c", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.location_picker.view.h, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC31586h implements InterfaceC31579a, InterfaceC31581c, AvitoMapAttachHelper.MapAttachListener, InterfaceC31580b {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.view.radius.f f182561A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.location_picker.view.radius.i f182562B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f182563C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final X f182564D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.component.snackbar.d f182565E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.k f182566F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.modal.a f182567G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f182568H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b f182569I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.tooltip.k f182570J;

    /* renamed from: K, reason: collision with root package name */
    public final long f182571K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f182572L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f182573M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f182574N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f182575O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b f182576P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> f182577Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f182578R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f182579S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f182580T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b f182581U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final B0 f182582V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final T0 f182583W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Boolean> f182584X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> f182585Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> f182586Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final T0 f182587a0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f182588b;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> f182589b0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Fragment f182590c;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.l
    public final io.reactivex.rxjava3.core.z<G0> f182591c0;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final N0 f182592d;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f182593d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f182594e;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e f182595e0;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f182596f;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<com.avito.android.location_picker.view.radius.a> f182597f0;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.job.f f182598g;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final C31585g f182599g0;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final AvitoMapTarget f182600h;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final C31585g f182601h0;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.providers.z f182602i;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final C31585g f182603i0;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f182604j;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final C31585g f182605j0;

    /* renamed from: k, reason: collision with root package name */
    public final Resources f182606k;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final C31585g f182607k0;

    /* renamed from: l, reason: collision with root package name */
    public final FrameLayout f182608l;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public final C31585g f182609l0;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public AvitoMap f182610m;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final C31585g f182611m0;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final View f182612n;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final C31585g f182613n0;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final View f182614o;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final C31585g f182615o0;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final a f182616p;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final C31585g f182617p0;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final View f182618q;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final C31585g f182619q0;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final View f182620r;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final C31585g f182621r0;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final BackPressedNotifyingEditText f182622s;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C31585g f182623s0;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final HorizontalScrollView f182624t;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C31585g f182625t0;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final View f182626u;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C31584f f182627u0;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final Button f182628v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final View f182629w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final View f182630x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public final RadiusCircleViewImpl f182631y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f182632z;

    /* compiled from: LocationPickerView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/view/h$a;", "", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.location_picker.view.h$a */
    public interface a {

        /* compiled from: LocationPickerView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.location_picker.view.h$a$a, reason: collision with other inner class name */
        public static final class C5352a {
        }

        void N();

        @Y61.k
        io.reactivex.rxjava3.core.z<G0> R0();

        void a();

        void setEnabled(boolean z12);

        void setLoading(boolean z12);
    }

    /* compiled from: LocationPickerView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/view/h$c;", "Lcom/avito/android/location_picker/view/h$a;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.location_picker.view.h$c */
    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Button f182635a;

        public c(@Y61.k View view) {
            Button button = (Button) view.findViewById(R.id.main_button);
            this.f182635a = button;
            button.setText(button.getContext().getString(R.string.lp_choose_footer));
            D6.H(button);
        }

        @Override // com.avito.android.location_picker.view.AbstractC31586h.a
        public final void N() {
            D6.h(this.f182635a);
        }

        @Override // com.avito.android.location_picker.view.AbstractC31586h.a
        @Y61.k
        public final io.reactivex.rxjava3.core.z<G0> R0() {
            return C37722i.a(this.f182635a);
        }

        @Override // com.avito.android.location_picker.view.AbstractC31586h.a
        public final void a() {
            D6.w(this.f182635a);
        }

        @Override // com.avito.android.location_picker.view.AbstractC31586h.a
        public final void setEnabled(boolean z12) {
            if (z12) {
                D6.k(this.f182635a);
            } else {
                N();
            }
        }

        @Override // com.avito.android.location_picker.view.AbstractC31586h.a
        public final void setLoading(boolean z12) {
            this.f182635a.setLoading(z12);
        }
    }

    /* compiled from: LocationPickerView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.location_picker.view.h$d */
    public /* synthetic */ class d {
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

    /* compiled from: LocationPickerView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.location_picker.view.h$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f182636l = new e();

        public e() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: LocationPickerView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.location_picker.view.h$f */
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c cVar = AbstractC31586h.this.f182572L;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    /* compiled from: LocationPickerView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.location_picker.view.h$g */
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            AbstractC31586h abstractC31586h = AbstractC31586h.this;
            com.jakewharton.rxrelay3.c cVar = abstractC31586h.f182573M;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            abstractC31586h.f182592d.T3();
            return g02;
        }
    }

    /* compiled from: LocationPickerView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.location_picker.view.h$h, reason: collision with other inner class name */
    public static final class C5353h extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C5353h f182639l = new C5353h();

        public C5353h() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: LocationPickerView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.location_picker.view.h$i */
    public static final class i extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c cVar = AbstractC31586h.this.f182572L;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    /* compiled from: LocationPickerView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.location_picker.view.h$j */
    public static final class j extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final j f182641l = new j();

        public j() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: LocationPickerView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.location_picker.view.h$k */
    public static final class k extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final k f182642l = new k();

        public k() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: LocationPickerView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.location_picker.view.h$l */
    public static final class l extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final l f182643l = new l();

        public l() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: LocationPickerView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.location_picker.view.h$m */
    public static final class m extends kotlin.jvm.internal.N implements Y41.p<a.b, DialogInterface, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f182644l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AbstractC31586h f182645m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, AbstractC31586h abstractC31586h) {
            super(2);
            this.f182644l = str;
            this.f182645m = abstractC31586h;
        }

        @Override // Y41.p
        public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
            a.b bVar2 = bVar;
            bVar2.setSubtitle(this.f182644l);
            AbstractC31586h abstractC31586h = this.f182645m;
            bVar2.L3(abstractC31586h.f182606k.getString(R.string.lp_error_dialog_ok_button_text), new C31587i(abstractC31586h));
            return G0.f406611a;
        }
    }

    /* compiled from: LocationPickerView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.location_picker.view.h$n */
    public static final class n extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c cVar = AbstractC31586h.this.f182572L;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    /* compiled from: LocationPickerView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.location_picker.view.h$o */
    public static final class o extends kotlin.jvm.internal.N implements Y41.a<Integer> {
        public o() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            FrameLayout frameLayout = AbstractC31586h.this.f182608l;
            int width = frameLayout.getWidth();
            if (frameLayout.getWidth() == 0) {
                width = frameLayout.getResources().getDisplayMetrics().widthPixels;
            }
            return Integer.valueOf(width);
        }
    }

    /* compiled from: LocationPickerView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.location_picker.view.h$p */
    public static final class p<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final p<T> f182648b = new p<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((Number) obj).intValue() == 3;
        }
    }

    /* compiled from: LocationPickerView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.location_picker.view.h$q */
    public static final class q<T, R> implements l41.o {
        public q() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            ((Number) obj).intValue();
            return String.valueOf(AbstractC31586h.this.f182622s.getText());
        }
    }

    /* compiled from: LocationPickerView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.location_picker.view.h$r */
    public static final class r extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.lib.design.tooltip.o, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f182650l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str) {
            super(1);
            this.f182650l = str;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.lib.design.tooltip.o oVar) {
            oVar.b(this.f182650l);
            return G0.f406611a;
        }
    }

    /* compiled from: LocationPickerView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/y0;", "it", "", "apply", "(Lcom/jakewharton/rxbinding4/widget/y0;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.location_picker.view.h$s */
    public static final class s<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final s<T, R> f182651b = new s<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            String string;
            Editable editable = ((y0) obj).f364257b;
            return (editable == null || (string = editable.toString()) == null) ? "" : string;
        }
    }

    /* JADX WARN: Type inference failed for: r1v22, types: [com.avito.android.location_picker.view.f] */
    public AbstractC31586h(@Y61.k View view, @Y61.k Fragment fragment, @Y61.k N0 n02, boolean z12, boolean z13, @Y61.k com.avito.android.location_picker.job.f fVar, @Y61.k LocationPickerChooseButtonLocation locationPickerChooseButtonLocation, @Y61.k AvitoMapAttachHelper avitoMapAttachHelper, @Y61.l AvitoMapTarget avitoMapTarget, @Y61.k com.avito.android.location_picker.providers.z zVar, boolean z14, @Y61.k K0 k02, final boolean z15, @Y61.l String str) throws Resources.NotFoundException {
        a bVar;
        View view2;
        io.reactivex.rxjava3.core.z<G0> zVar2;
        this.f182588b = view;
        this.f182590c = fragment;
        this.f182592d = n02;
        this.f182594e = z12;
        this.f182596f = z13;
        this.f182598g = fVar;
        this.f182600h = avitoMapTarget;
        this.f182602i = zVar;
        this.f182604j = str;
        this.f182606k = view.getResources();
        this.f182608l = (FrameLayout) view.findViewById(R.id.map);
        View viewFindViewById = view.findViewById(R.id.location_picker_screen_root);
        this.f182612n = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.map_concealer);
        this.f182614o = viewFindViewById2;
        FloatingActionButton floatingActionButton = (FloatingActionButton) view.findViewById(R.id.find_me_button);
        int iOrdinal = locationPickerChooseButtonLocation.ordinal();
        if (iOrdinal == 0) {
            bVar = new b(view);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new c(view);
        }
        a aVar = bVar;
        this.f182616p = aVar;
        View viewFindViewById3 = view.findViewById(R.id.clear_button);
        this.f182618q = viewFindViewById3;
        this.f182620r = view.findViewById(R.id.drop_down_suggestions_container);
        BackPressedNotifyingEditText backPressedNotifyingEditText = (BackPressedNotifyingEditText) view.findViewById(R.id.edit_query);
        this.f182622s = backPressedNotifyingEditText;
        this.f182624t = (HorizontalScrollView) view.findViewById(R.id.edit_scroll);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        View viewFindViewById4 = view.findViewById(R.id.linear_radius_list_container);
        this.f182626u = viewFindViewById4;
        Chips chips = viewFindViewById4 != null ? (Chips) viewFindViewById4.findViewById(R.id.chips) : null;
        Button button = (Button) view.findViewById(R.id.select_radius_button);
        this.f182628v = button;
        this.f182629w = view.findViewById(R.id.search_radius_view_skeleton);
        this.f182630x = view.findViewById(R.id.search_radius_bottom);
        RadiusCircleViewImpl radiusCircleViewImpl = (RadiusCircleViewImpl) view.findViewById(R.id.search_radius_view);
        this.f182631y = radiusCircleViewImpl;
        this.f182632z = new com.jakewharton.rxrelay3.c();
        com.avito.android.location_picker.view.radius.f fVar2 = new com.avito.android.location_picker.view.radius.f();
        this.f182561A = fVar2;
        this.f182562B = chips != null ? new com.avito.android.location_picker.view.radius.i(chips) : null;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.progress_overlay_container), R.id.container, null, 0, 0, 24, null);
        this.f182563C = lVar;
        X x12 = new X(z15);
        this.f182564D = x12;
        this.f182565E = d.a.b(com.avito.android.component.snackbar.d.f125235c, viewFindViewById, "", -2, null, null, 0, null, null, 0, 0, 2040);
        this.f182568H = C42727D.c(new o());
        com.jakewharton.rxrelay3.b bVar2 = new com.jakewharton.rxrelay3.b();
        this.f182569I = bVar2;
        k02.f();
        if (z14) {
            View viewFindViewById5 = view.findViewById(R.id.navbar);
            if (viewFindViewById5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            D6.w(viewFindViewById5);
        } else {
            String string = view.getContext().getString(z12 ? R.string.lp_search_radius : R.string.lp_address);
            NavBar navBar = (NavBar) view.findViewById(R.id.navbar);
            if (navBar != null) {
                NavBar.e(navBar, string, 0, 6);
                navBar.c(R.attr.ic_arrowBack24, new C31588j(this));
            }
        }
        if (button != null) {
            button.setText(zVar.getF182436b());
        }
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(x12);
        D6.G(viewFindViewById4, z12);
        if (z12) {
            zVar2 = null;
            lVar.k(null);
            if (radiusCircleViewImpl != null) {
                radiusCircleViewImpl.setVisibility(0);
            }
            aVar.a();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) floatingActionButton.getLayoutParams();
            marginLayoutParams.bottomMargin = zVar.getF182437c();
            view2 = floatingActionButton;
            view2.setLayoutParams(marginLayoutParams);
        } else {
            view2 = floatingActionButton;
            zVar2 = null;
        }
        if (z13) {
            aVar.N();
        }
        avitoMapAttachHelper.setMapAttachedListener(this);
        avitoMapAttachHelper.attachView(R.id.map, viewFindViewById, fragment.getChildFragmentManager());
        k02.b();
        if (button != null) {
            button.setAppearance(R.style.Re23_Button_PrimaryLarge);
        }
        this.f182571K = 180L;
        this.f182572L = new com.jakewharton.rxrelay3.c();
        this.f182573M = new com.jakewharton.rxrelay3.c();
        this.f182574N = new com.jakewharton.rxrelay3.c();
        this.f182575O = new com.jakewharton.rxrelay3.c();
        this.f182576P = new com.jakewharton.rxrelay3.b();
        this.f182577Q = backPressedNotifyingEditText.getBackPressedEvents();
        this.f182578R = new com.jakewharton.rxrelay3.c();
        this.f182579S = new com.jakewharton.rxrelay3.c();
        this.f182580T = new com.jakewharton.rxrelay3.c();
        this.f182581U = bVar2;
        this.f182582V = C37750f0.b(backPressedNotifyingEditText).N(p.f182648b).d0(new q());
        this.f182583W = C37750f0.a(backPressedNotifyingEditText).d0(s.f182651b).p0();
        this.f182584X = C37722i.c(backPressedNotifyingEditText);
        this.f182585Y = C37722i.a(viewFindViewById3);
        this.f182586Z = aVar.R0();
        this.f182587a0 = C37722i.a(view2).p0();
        this.f182589b0 = C37722i.a(viewFindViewById2);
        this.f182591c0 = button != null ? C37722i.a(button) : zVar2;
        this.f182593d0 = new com.jakewharton.rxrelay3.c();
        this.f182595e0 = x12.f182554g;
        this.f182597f0 = fVar2.f182792b;
        this.f182599g0 = new C31585g(this, 1);
        this.f182601h0 = new C31585g(this, 11);
        this.f182603i0 = new C31585g(this, 12);
        this.f182605j0 = new C31585g(this, 13);
        this.f182607k0 = new C31585g(this, 0);
        this.f182609l0 = new C31585g(this, 2);
        this.f182611m0 = new C31585g(this, 3);
        this.f182613n0 = new C31585g(this, 4);
        this.f182615o0 = new C31585g(this, 5);
        this.f182617p0 = new C31585g(this, 6);
        this.f182619q0 = new C31585g(this, 7);
        this.f182621r0 = new C31585g(this, 8);
        this.f182623s0 = new C31585g(this, 9);
        this.f182625t0 = new C31585g(this, 10);
        this.f182627u0 = new l41.g() { // from class: com.avito.android.location_picker.view.f
            @Override // l41.g
            public final void accept(Object obj) throws Resources.NotFoundException {
                String string2;
                vW.j jVar = (vW.j) obj;
                boolean z16 = jVar instanceof vW.m;
                int i12 = R.string.lp_network_error;
                Integer numValueOf = Integer.valueOf(R.string.lp_network_error);
                Integer numValueOf2 = Integer.valueOf(R.string.lp_repeat);
                AbstractC31586h abstractC31586h = this.f182557b;
                boolean z17 = abstractC31586h.f182594e;
                boolean z18 = z15;
                com.avito.android.location_picker.providers.z zVar3 = abstractC31586h.f182602i;
                Button button2 = abstractC31586h.f182628v;
                if (z16) {
                    if (!z17) {
                        i12 = R.string.lp_network_error_confirmation;
                    } else if (button2 != null) {
                        button2.setText(zVar3.getF182436b());
                    }
                    AbstractC31586h.O(abstractC31586h, z18, Integer.valueOf(i12), null, numValueOf2, abstractC31586h.new f(), 20);
                    return;
                }
                if (jVar instanceof vW.q) {
                    AbstractC31586h.O(abstractC31586h, z18, Integer.valueOf(R.string.location_permission_required), null, Integer.valueOf(R.string.lp_settings), abstractC31586h.new g(), 4);
                    return;
                }
                if (jVar instanceof vW.i) {
                    AbstractC31586h.O(abstractC31586h, z18, Integer.valueOf(R.string.loc_providers_unavailable_message), null, null, AbstractC31586h.C5353h.f182639l, 12);
                    return;
                }
                if (jVar instanceof vW.l) {
                    if (z17 && button2 != null) {
                        button2.setText(zVar3.getF182436b());
                    }
                    AbstractC31586h.O(abstractC31586h, z18, numValueOf, null, numValueOf2, abstractC31586h.new i(), 20);
                    return;
                }
                if (jVar instanceof vW.k) {
                    AbstractC31586h.O(abstractC31586h, z18, null, ((vW.k) jVar).f440807a, null, AbstractC31586h.j.f182641l, 26);
                    return;
                }
                if (jVar instanceof vW.r) {
                    AbstractC31586h.O(abstractC31586h, z18, Integer.valueOf(R.string.lp_not_suggested_address_error), null, null, AbstractC31586h.k.f182642l, 28);
                    return;
                }
                if (jVar instanceof vW.o) {
                    AbstractC31586h.O(abstractC31586h, z18, Integer.valueOf(R.string.lp_no_suggests_error), null, null, AbstractC31586h.l.f182643l, 28);
                    return;
                }
                if (jVar instanceof vW.h) {
                    if (abstractC31586h.f182567G != null) {
                        return;
                    }
                    com.avito.android.location_picker.job.f fVar3 = abstractC31586h.f182598g;
                    boolean z19 = fVar3 instanceof f.b;
                    Resources resources = abstractC31586h.f182606k;
                    if (z19) {
                        string2 = resources.getString(R.string.lp_empty_address_error_for_job_assistant);
                    } else {
                        if (!(fVar3 instanceof f.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        string2 = resources.getString(R.string.lp_empty_address_error);
                    }
                    com.avito.android.lib.design.modal.a aVarC = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, abstractC31586h.f182588b.getContext(), new AbstractC31586h.m(string2, abstractC31586h));
                    abstractC31586h.f182567G = aVarC;
                    com.avito.android.lib.util.g.a(aVarC);
                    return;
                }
                if (jVar instanceof C49273c) {
                    if (button2 != null) {
                        button2.setText(zVar3.getF182436b());
                        return;
                    }
                    return;
                }
                if (jVar instanceof vW.d) {
                    if (button2 != null) {
                        button2.setText(zVar3.getF182436b());
                    }
                    AbstractC31586h.O(abstractC31586h, z18, numValueOf, null, numValueOf2, abstractC31586h.new n(), 20);
                } else {
                    if (jVar instanceof vW.n) {
                        AbstractC31586h.O(abstractC31586h, z18, Integer.valueOf(R.string.lp_no_coords_error), null, numValueOf2, AbstractC31586h.e.f182636l, 20);
                        return;
                    }
                    if (!(jVar instanceof vW.p)) {
                        jVar.equals(C49272b.f440797a);
                        return;
                    }
                    abstractC31586h.f182565E.a();
                    com.avito.android.lib.design.toast_bar.k kVar = abstractC31586h.f182566F;
                    if (kVar != null) {
                        kVar.f();
                    }
                }
            }
        };
    }

    public static void O(AbstractC31586h abstractC31586h, boolean z12, Integer num, String str, Integer num2, final Y41.a aVar, int i12) {
        Integer num3 = (i12 & 2) != 0 ? null : num;
        String string = (i12 & 4) != 0 ? null : str;
        Integer num4 = (i12 & 8) != 0 ? null : num2;
        Integer num5 = (i12 & 16) != 0 ? null : 3;
        Resources resources = abstractC31586h.f182606k;
        if (string == null) {
            string = num3 != null ? resources.getString(num3.intValue()) : null;
            if (string == null) {
                return;
            }
        }
        String string2 = num4 != null ? resources.getString(num4.intValue()) : null;
        if (z12) {
            com.avito.android.lib.design.toast_bar.k kVarB = com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, abstractC31586h.f182588b, com.avito.android.printable_text.b.f(string), null, string2 != null ? Collections.singletonList(new c.a.C3719a(string2, false, null, aVar, 4, null)) : null, null, null, -1, null, null, false, false, null, null, 4058);
            abstractC31586h.f182566F = kVarB;
            D6.H(kVarB);
            return;
        }
        com.avito.android.component.snackbar.d dVar = abstractC31586h.f182565E;
        if (num5 != null) {
            com.avito.android.component.snackbar.h.a(dVar).setMaxLines(num5.intValue());
        }
        ((SnackbarContentLayout) dVar.f125236a.f357285i.getChildAt(0)).getMessageView().setText(string);
        Snackbar snackbar = dVar.f125236a;
        if (string2 != null) {
            snackbar.k(string2, new View.OnClickListener(aVar) { // from class: com.avito.android.location_picker.view.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ kotlin.jvm.internal.N f182555b;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f182555b = (kotlin.jvm.internal.N) aVar;
                }

                /* JADX WARN: Type inference failed for: r1v1, types: [Y41.a, kotlin.jvm.internal.N] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f182555b.invoke();
                }
            });
        }
        if (snackbar.i()) {
            return;
        }
        dVar.b();
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<Boolean> B() {
        return this.f182609l0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    @Y61.k
    /* renamed from: B4, reason: from getter */
    public final com.jakewharton.rxrelay3.b getF182581U() {
        return this.f182581U;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<vW.f> C() {
        return this.f182619q0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    @Y61.k
    /* renamed from: D, reason: from getter */
    public final io.reactivex.rxjava3.subjects.e getF182595e0() {
        return this.f182595e0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    /* renamed from: E, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF182580T() {
        return this.f182580T;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> F() {
        return this.f182586Z;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    /* renamed from: H, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF182574N() {
        return this.f182574N;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<AvitoMapCameraPosition> I() {
        return this.f182617p0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<Boolean> J() {
        return this.f182605j0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<Radius> K() {
        return this.f182603i0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<List<AddressSuggestion>> L() {
        return this.f182615o0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<Boolean> M() {
        return this.f182623s0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    /* renamed from: N, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF182572L() {
        return this.f182572L;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    /* renamed from: a, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF182632z() {
        return this.f182632z;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    /* renamed from: b, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF182575O() {
        return this.f182575O;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<AddressParameter.Value> d() {
        return this.f182601h0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31580b
    public final void e() {
        AvitoMap avitoMap = this.f182610m;
        if (avitoMap != null) {
            avitoMap.onStop(true);
        }
        this.f182610m = null;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<vW.j> f() {
        return this.f182627u0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Boolean> g() {
        return this.f182584X;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    /* renamed from: h, reason: from getter */
    public final com.jakewharton.rxrelay3.b getF182576P() {
        return this.f182576P;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    @Y61.k
    /* renamed from: i, reason: from getter */
    public final T0 getF182583W() {
        return this.f182583W;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    /* renamed from: j, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF182593d0() {
        return this.f182593d0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<Boolean> k() {
        return this.f182599g0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> l() {
        return this.f182585Y;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    @Y61.k
    /* renamed from: m, reason: from getter */
    public final B0 getF182582V() {
        return this.f182582V;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<String> n() {
        return this.f182611m0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<String> o() {
        return this.f182607k0;
    }

    public void onMapAttach(@Y61.k AvitoMap avitoMap) {
        AvitoMapTarget avitoMapTarget = this.f182600h;
        if (avitoMapTarget != null) {
            avitoMap.restoreTarget(avitoMapTarget);
            com.avito.android.progress_overlay.l lVar = this.f182563C;
            if (!lVar.d()) {
                lVar.j();
            }
        }
        this.f182610m = avitoMap;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31580b
    public final void onStart() {
        AvitoMap avitoMap = this.f182610m;
        if (avitoMap != null) {
            avitoMap.onStart();
        }
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31580b
    public final void onStop() {
        AvitoMap avitoMap = this.f182610m;
        if (avitoMap != null) {
            avitoMap.onStop(false);
        }
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    /* renamed from: p, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF182578R() {
        return this.f182578R;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<vW.s> q() {
        return this.f182621r0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<vW.e> r() {
        return this.f182625t0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    @Y61.l
    public final io.reactivex.rxjava3.core.z<G0> s() {
        return this.f182591c0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    @Y61.k
    public final io.reactivex.rxjava3.core.z<com.avito.android.location_picker.view.radius.a> t() {
        return this.f182597f0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    /* renamed from: u, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF182573M() {
        return this.f182573M;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> v() {
        return this.f182577Q;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> w() {
        return this.f182589b0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<G0> x() {
        return this.f182613n0;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    /* renamed from: y, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF182579S() {
        return this.f182579S;
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31581c
    @Y61.k
    /* renamed from: z, reason: from getter */
    public final T0 getF182587a0() {
        return this.f182587a0;
    }

    /* compiled from: LocationPickerView.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/view/h$b;", "Lcom/avito/android/location_picker/view/h$a;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.location_picker.view.h$b */
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final View f182633a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.lib.design.text_view.a f182634b;

        public b(@Y61.k View view) {
            this.f182633a = view;
            NavBar navBar = (NavBar) view.findViewById(R.id.navbar);
            String string = view.getContext().getString(R.string.lp_choose);
            if (string.length() > 0) {
                string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
            }
            com.avito.android.lib.design.text_view.a aVarB = navBar.b(com.avito.android.printable_text.b.f(string));
            navBar.setActions(aVarB);
            this.f182634b = aVarB;
            D6.H(aVarB);
        }

        @Override // com.avito.android.location_picker.view.AbstractC31586h.a
        public final void N() {
            D6.h(this.f182634b);
        }

        @Override // com.avito.android.location_picker.view.AbstractC31586h.a
        @Y61.k
        public final io.reactivex.rxjava3.core.z<G0> R0() {
            return C37722i.a(this.f182634b);
        }

        @Override // com.avito.android.location_picker.view.AbstractC31586h.a
        public final void a() {
            D6.w(this.f182634b);
        }

        @Override // com.avito.android.location_picker.view.AbstractC31586h.a
        public final void setEnabled(boolean z12) {
            if (z12) {
                D6.k(this.f182634b);
            } else {
                N();
            }
        }

        @Override // com.avito.android.location_picker.view.AbstractC31586h.a
        public final void setLoading(boolean z12) {
        }
    }

    public /* synthetic */ AbstractC31586h(View view, Fragment fragment, N0 n02, boolean z12, boolean z13, com.avito.android.location_picker.job.f fVar, LocationPickerChooseButtonLocation locationPickerChooseButtonLocation, AvitoMapAttachHelper avitoMapAttachHelper, AvitoMapTarget avitoMapTarget, com.avito.android.location_picker.providers.z zVar, boolean z14, K0 k02, boolean z15, String str, int i12, C42822w c42822w) {
        this(view, fragment, n02, z12, z13, fVar, locationPickerChooseButtonLocation, avitoMapAttachHelper, avitoMapTarget, zVar, (i12 & 1024) != 0 ? false : z14, k02, z15, str);
    }
}
