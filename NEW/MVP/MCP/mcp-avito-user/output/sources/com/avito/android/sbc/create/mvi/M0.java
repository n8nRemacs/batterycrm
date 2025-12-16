package com.avito.android.sbc.create.mvi;

import Uo0.C15545b;
import Uo0.InterfaceC15544a;
import Uo0.InterfaceC15546c;
import Uo0.e;
import Uo0.h;
import Vo0.C15700a;
import Vo0.C15703d;
import Vo0.InterfaceC15701b;
import Vo0.InterfaceC15702c;
import android.content.res.Resources;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.SelectStrategy;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.mnz_common.data.MnzFloatingFooterContacts;
import com.avito.android.mnz_common.ui.MnzFloatingFooter;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState;
import com.avito.android.sbc.create.mvi.util.FieldsWithValidation;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.C35971x;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;

/* compiled from: CreateDiscountDispatchView.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/M0;", "Lcom/avito/android/sbc/create/mvi/J0;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class M0 implements J0 {

    /* renamed from: R0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f259331R0 = {kotlin.jvm.internal.m0.f406844a.f(new kotlin.jvm.internal.a0("lastRenderedState", "getLastRenderedState(Lcom/avito/android/mvi/Renderer;)Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState;", M0.class))};

    /* renamed from: A, reason: collision with root package name */
    public final ComponentContainer f259332A;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<String> f259333A0;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f259334B;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f259335B0;

    /* renamed from: C, reason: collision with root package name */
    public final View f259336C;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Boolean, kotlin.G0> f259337C0;

    /* renamed from: D, reason: collision with root package name */
    public final TextView f259338D;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Boolean, kotlin.G0> f259339D0;

    /* renamed from: E, reason: collision with root package name */
    public final DescriptionParameterItem f259340E;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, kotlin.G0> f259341E0;

    /* renamed from: F, reason: collision with root package name */
    public final DescriptionParameterItem f259342F;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, kotlin.G0> f259343F0;

    /* renamed from: G, reason: collision with root package name */
    public final DescriptionParameterItem f259344G;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, kotlin.G0> f259345G0;

    /* renamed from: H, reason: collision with root package name */
    public final DescriptionParameterItem f259346H;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, kotlin.G0> f259347H0;

    /* renamed from: I, reason: collision with root package name */
    public final TextView f259348I;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, kotlin.G0> f259349I0;

    /* renamed from: J, reason: collision with root package name */
    public final ProgressBar f259350J;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, kotlin.G0> f259351J0;

    /* renamed from: K, reason: collision with root package name */
    public final TextView f259352K;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, kotlin.G0> f259353K0;

    /* renamed from: L, reason: collision with root package name */
    public final TextView f259354L;

    /* renamed from: L0, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, kotlin.G0> f259355L0;

    /* renamed from: M, reason: collision with root package name */
    public final TextView f259356M;

    /* renamed from: M0, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, kotlin.G0> f259357M0;

    /* renamed from: N, reason: collision with root package name */
    public final TextView f259358N;

    /* renamed from: N0, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, kotlin.G0> f259359N0;

    /* renamed from: O, reason: collision with root package name */
    public final TextView f259360O;

    /* renamed from: O0, reason: collision with root package name */
    @Y61.l
    public final Y41.l<C15545b, kotlin.G0> f259361O0;

    /* renamed from: P, reason: collision with root package name */
    public final TextView f259362P;

    /* renamed from: P0, reason: collision with root package name */
    @Y61.l
    public final Y41.l<? super C15545b, kotlin.G0> f259363P0;

    /* renamed from: Q, reason: collision with root package name */
    public final TextView f259364Q;

    /* renamed from: Q0, reason: collision with root package name */
    @Y61.k
    public final C35971x f259365Q0;

    /* renamed from: R, reason: collision with root package name */
    public final SimpleDraweeView f259366R;

    /* renamed from: S, reason: collision with root package name */
    public final ComponentContainer f259367S;

    /* renamed from: T, reason: collision with root package name */
    public final Input f259368T;

    /* renamed from: U, reason: collision with root package name */
    public final ComponentContainer f259369U;

    /* renamed from: V, reason: collision with root package name */
    public final Input f259370V;

    /* renamed from: W, reason: collision with root package name */
    public final ViewGroup f259371W;

    /* renamed from: X, reason: collision with root package name */
    public final Button f259372X;

    /* renamed from: Y, reason: collision with root package name */
    public final MnzFloatingFooter f259373Y;

    /* renamed from: Z, reason: collision with root package name */
    public final View f259374Z;

    /* renamed from: a0, reason: collision with root package name */
    public final TextView f259375a0;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f259376b;

    /* renamed from: b0, reason: collision with root package name */
    public final Switcher f259377b0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sbc.utils.a f259378c;

    /* renamed from: c0, reason: collision with root package name */
    public final ViewGroup f259379c0;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f259380d;

    /* renamed from: d0, reason: collision with root package name */
    public final ImageView f259381d0;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Resources f259382e;

    /* renamed from: e0, reason: collision with root package name */
    public final Chips f259383e0;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f259384f;

    /* renamed from: f0, reason: collision with root package name */
    public final ComponentContainer f259385f0;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final NestedScrollView f259386g;

    /* renamed from: g0, reason: collision with root package name */
    public final ComponentContainer f259387g0;

    /* renamed from: h, reason: collision with root package name */
    public final Button f259388h;

    /* renamed from: h0, reason: collision with root package name */
    public final ComponentContainer f259389h0;

    /* renamed from: i, reason: collision with root package name */
    public final NavBar f259390i;

    /* renamed from: i0, reason: collision with root package name */
    public final Input f259391i0;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f259392j;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f259393j0;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f259394k;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f259395k0;

    /* renamed from: l, reason: collision with root package name */
    public final Input f259396l;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f259397l0;

    /* renamed from: m, reason: collision with root package name */
    public final Input f259398m;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f259399m0;

    /* renamed from: n, reason: collision with root package name */
    public final Input f259400n;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f259401n0;

    /* renamed from: o, reason: collision with root package name */
    public final ComponentContainer f259402o;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f259403o0;

    /* renamed from: p, reason: collision with root package name */
    public final ComponentContainer f259404p;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f259405p0;

    /* renamed from: q, reason: collision with root package name */
    public final View f259406q;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f259407q0;

    /* renamed from: r, reason: collision with root package name */
    public final Input f259408r;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f259409r0;

    /* renamed from: s, reason: collision with root package name */
    public final ComponentContainer f259410s;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f259411s0;

    /* renamed from: t, reason: collision with root package name */
    public final ComponentContainer f259412t;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f259413t0;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final Vo0.h f259414u;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f259415u0;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final C15700a f259416v;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f259417v0;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final Vo0.i<Uo0.h, InterfaceC15702c<Uo0.h>> f259418w;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f259419w0;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final Vo0.i<InterfaceC15546c, InterfaceC15702c<InterfaceC15546c>> f259420x;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f259421x0;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Integer, kotlin.G0> f259422y;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f259423y0;

    /* renamed from: z, reason: collision with root package name */
    public final ComponentContainer f259424z;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f259425z0;

    /* compiled from: CreateDiscountDispatchView.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            M0.this.f259397l0.accept(Boolean.TRUE);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CreateDiscountDispatchView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LUo0/e;", "invoke", "()LUo0/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<Uo0.e> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f259428l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Uo0.e invoke() {
            return e.C15552g.f16626a;
        }
    }

    /* compiled from: CreateDiscountDispatchView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LUo0/e;", "invoke", "()LUo0/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<Uo0.e> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f259429l = new d();

        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Uo0.e invoke() {
            return e.C15551f.f16625a;
        }
    }

    /* compiled from: CreateDiscountDispatchView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LUo0/e;", "invoke", "()LUo0/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<Uo0.e> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f259430l = new e();

        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Uo0.e invoke() {
            return e.C15549c.f16622a;
        }
    }

    /* compiled from: CreateDiscountDispatchView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LUo0/e;", "invoke", "()LUo0/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<Uo0.e> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f259431l = new f();

        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Uo0.e invoke() {
            return e.I.f16618a;
        }
    }

    /* compiled from: CreateDiscountDispatchView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LUo0/e;", "invoke", "()LUo0/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<Uo0.e> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f259432l = new g();

        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Uo0.e invoke() {
            return e.C15550d.f16623a;
        }
    }

    /* compiled from: CreateDiscountDispatchView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h {
        static {
            int[] iArr = new int[FieldsWithValidation.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FieldsWithValidation fieldsWithValidation = FieldsWithValidation.f259889b;
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                FieldsWithValidation fieldsWithValidation2 = FieldsWithValidation.f259889b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                FieldsWithValidation fieldsWithValidation3 = FieldsWithValidation.f259889b;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                FieldsWithValidation fieldsWithValidation4 = FieldsWithValidation.f259889b;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[CreateDiscountDispatchState.DiscountDispatchDataLoaded.AutoDispatchToggleState.values().length];
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.AutoDispatchToggleState autoDispatchToggleState = CreateDiscountDispatchState.DiscountDispatchDataLoaded.AutoDispatchToggleState.f259647b;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.AutoDispatchToggleState autoDispatchToggleState2 = CreateDiscountDispatchState.DiscountDispatchDataLoaded.AutoDispatchToggleState.f259647b;
                iArr2[1] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: CreateDiscountDispatchView.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isChecked", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.getClass();
            M0.this.f259415u0.accept(bool2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CreateDiscountDispatchView.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUo0/b;", "item", "Lkotlin/G0;", "invoke", "(LUo0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends kotlin.jvm.internal.N implements Y41.l<C15545b, kotlin.G0> {
        public j() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(C15545b c15545b) {
            M0.this.f259417v0.accept(Long.valueOf(c15545b.f16598b));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CreateDiscountDispatchView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends kotlin.jvm.internal.N implements Y41.l<String, kotlin.G0> {
        public p() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(String str) {
            M0.this.f259333A0.accept(str);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CreateDiscountDispatchView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends kotlin.jvm.internal.N implements Y41.l<String, kotlin.G0> {
        public q() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(String str) {
            M0.this.f259421x0.accept(str);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CreateDiscountDispatchView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends kotlin.jvm.internal.N implements Y41.l<String, kotlin.G0> {
        public r() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(String str) {
            M0.this.f259407q0.accept(str);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CreateDiscountDispatchView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class s extends kotlin.jvm.internal.N implements Y41.l<String, kotlin.G0> {
        public s() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(String str) {
            M0.this.f259405p0.accept(str);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CreateDiscountDispatchView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class t extends kotlin.jvm.internal.N implements Y41.l<String, kotlin.G0> {
        public t() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(String str) {
            M0.this.f259409r0.accept(str);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CreateDiscountDispatchView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LVo0/b;", "it", "Lkotlin/G0;", "invoke", "(LVo0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class u extends kotlin.jvm.internal.N implements Y41.l<InterfaceC15701b, kotlin.G0> {
        public u() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(InterfaceC15701b interfaceC15701b) {
            ((y) M0.this.f259422y).invoke(Integer.valueOf(interfaceC15701b.getF16685b()));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CreateDiscountDispatchView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LUo0/h;", "item", "Landroid/view/ViewGroup;", "viewGroup", "LVo0/c;", "invoke", "(LUo0/h;Landroid/view/ViewGroup;)LVo0/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class v extends kotlin.jvm.internal.N implements Y41.p<Uo0.h, ViewGroup, InterfaceC15702c<Uo0.h>> {
        public v() {
            super(2);
        }

        @Override // Y41.p
        public final InterfaceC15702c<Uo0.h> invoke(Uo0.h hVar, ViewGroup viewGroup) {
            Uo0.h hVar2 = hVar;
            ViewGroup viewGroup2 = viewGroup;
            M0.this.f259414u.getClass();
            if (hVar2 instanceof h.b) {
                return new C15703d(com.akita.compose.theme.re23.style.C0.b(viewGroup2, R.layout.sbc_configurator_fast_chip_common_preset, viewGroup2, false));
            }
            if (hVar2 instanceof h.a) {
                return new Vo0.g(com.akita.compose.theme.re23.style.C0.b(viewGroup2, R.layout.sbc_configurator_fast_chip_custom_preset, viewGroup2, false));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: CreateDiscountDispatchView.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LVo0/b;", "it", "Lkotlin/G0;", "invoke", "(LVo0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class w extends kotlin.jvm.internal.N implements Y41.l<InterfaceC15701b, kotlin.G0> {
        public w() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(InterfaceC15701b interfaceC15701b) {
            M0.this.f259419w0.accept(Integer.valueOf(interfaceC15701b.getF16685b()));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CreateDiscountDispatchView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LUo0/c;", "item", "Landroid/view/ViewGroup;", "viewGroup", "LVo0/c;", "invoke", "(LUo0/c;Landroid/view/ViewGroup;)LVo0/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class x extends kotlin.jvm.internal.N implements Y41.p<InterfaceC15546c, ViewGroup, InterfaceC15702c<InterfaceC15546c>> {
        public x() {
            super(2);
        }

        @Override // Y41.p
        public final InterfaceC15702c<InterfaceC15546c> invoke(InterfaceC15546c interfaceC15546c, ViewGroup viewGroup) {
            InterfaceC15546c interfaceC15546c2 = interfaceC15546c;
            ViewGroup viewGroup2 = viewGroup;
            C15700a c15700a = M0.this.f259416v;
            c15700a.getClass();
            if (interfaceC15546c2 instanceof InterfaceC15546c.b) {
                return new Vo0.e(com.akita.compose.theme.re23.style.C0.b(viewGroup2, R.layout.sbc_configurator_autodispatch_common_preset, viewGroup2, false), c15700a.f17385a);
            }
            if (interfaceC15546c2 instanceof InterfaceC15546c.a) {
                return new Vo0.f(com.akita.compose.theme.re23.style.C0.b(viewGroup2, R.layout.sbc_configurator_autodispatch_another_preset, viewGroup2, false));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: CreateDiscountDispatchView.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "id", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class y extends kotlin.jvm.internal.N implements Y41.l<Integer, kotlin.G0> {
        public y() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Integer num) {
            M0.this.f259423y0.accept(Integer.valueOf(num.intValue()));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CreateDiscountDispatchView.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUo0/e;", "action", "Lkotlin/G0;", "invoke", "(LUo0/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class z extends kotlin.jvm.internal.N implements Y41.l<Uo0.e, kotlin.G0> {
        public z() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Uo0.e eVar) {
            M0.this.f259411s0.accept(eVar);
            return kotlin.G0.f406611a;
        }
    }

    public M0(@Y61.k View view, @Y61.k InterfaceC28373a interfaceC28373a, boolean z12, boolean z13, @Y61.k com.avito.android.sbc.utils.a aVar, @Y61.k com.avito.android.util.text.a aVar2, @Y61.k Resources resources, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f259376b = z12;
        this.f259378c = aVar;
        this.f259380d = aVar2;
        this.f259382e = resources;
        this.f259384f = screenPerformanceTracker;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.create_discount_dispatch_content);
        this.f259386g = (NestedScrollView) view.findViewById(R.id.create_discount_dispatch_content_list);
        this.f259388h = (Button) view.findViewById(R.id.create_discount_dispatch_error_retry_button);
        NavBar navBar = (NavBar) view.findViewById(R.id.sbc_configurator_toolbar);
        this.f259390i = navBar;
        this.f259392j = (TextView) view.findViewById(R.id.create_discount_dispatch_title);
        TextView textView = (TextView) view.findViewById(R.id.create_discount_dispatch_description);
        this.f259394k = textView;
        Input input = (Input) view.findViewById(R.id.create_discount_dispatch_discount_roubles_input);
        this.f259396l = input;
        Input input2 = (Input) view.findViewById(R.id.create_discount_dispatch_discount_percent_input);
        this.f259398m = input2;
        Input input3 = (Input) view.findViewById(R.id.create_discount_dispatch_type_selector);
        this.f259400n = input3;
        this.f259402o = (ComponentContainer) view.findViewById(R.id.create_discount_dispatch_discount_container);
        ComponentContainer componentContainer = (ComponentContainer) view.findViewById(R.id.create_discount_dispatch_type_selector_container);
        this.f259404p = componentContainer;
        ViewGroup viewGroup2 = (ViewGroup) componentContainer.findViewById(R.id.design_container_content);
        this.f259406q = view.findViewById(R.id.type_selector_onboarding);
        Input input4 = (Input) view.findViewById(R.id.create_discount_dispatch_recipient_input);
        this.f259408r = input4;
        ComponentContainer componentContainer2 = (ComponentContainer) view.findViewById(R.id.create_discount_dispatch_recipient_container);
        this.f259410s = componentContainer2;
        ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R.id.sbc_configurator_fast_chips_container);
        ViewGroup viewGroup4 = (ViewGroup) view.findViewById(R.id.sbc_configurator_auto_dispatch_forecast_preset_container);
        this.f259412t = (ComponentContainer) view.findViewById(R.id.sbc_configurator_fast_chips_component_container);
        this.f259414u = new Vo0.h();
        this.f259416v = new C15700a(aVar);
        this.f259418w = new Vo0.i<>(viewGroup3, new u(), new v(), null, 8, null);
        this.f259420x = new Vo0.i<>(viewGroup4, new w(), new x(), new Vo0.j(y6.b(12)));
        this.f259422y = new y();
        this.f259424z = (ComponentContainer) view.findViewById(R.id.create_discount_dispatch_message_price_container);
        this.f259332A = (ComponentContainer) view.findViewById(R.id.create_discount_dispatch_tariff_balance_container);
        this.f259334B = (TextView) view.findViewById(R.id.create_discount_dispatch_price_unavailable_message);
        this.f259336C = view.findViewById(R.id.sbc_configurator_dispatch_total_price_banner);
        TextView textView2 = (TextView) view.findViewById(R.id.sbc_configurator_offer_title_view);
        this.f259338D = textView2;
        this.f259340E = (DescriptionParameterItem) view.findViewById(R.id.sbc_configurator_total_price_max_recipients);
        this.f259342F = (DescriptionParameterItem) view.findViewById(R.id.sbc_configurator_total_price_days_of_auto_dispatch);
        this.f259344G = (DescriptionParameterItem) view.findViewById(R.id.sbc_configurator_item_message_price);
        this.f259346H = (DescriptionParameterItem) view.findViewById(R.id.sbc_configurator_total_message_price);
        this.f259348I = (TextView) view.findViewById(R.id.create_discount_dispatch_card_description);
        this.f259350J = (ProgressBar) view.findViewById(R.id.create_discount_dispatch_tariff_balance_progress);
        this.f259352K = (TextView) view.findViewById(R.id.create_discount_dispatch_item_title);
        this.f259354L = (TextView) view.findViewById(R.id.create_discount_dispatch_card_title);
        this.f259356M = (TextView) view.findViewById(R.id.create_discount_dispatch_item_price_old);
        this.f259358N = (TextView) view.findViewById(R.id.create_discount_dispatch_item_price_new);
        this.f259360O = (TextView) view.findViewById(R.id.sbc_fast_chip_recommendation_title_view);
        this.f259362P = (TextView) view.findViewById(R.id.sbc_fast_chip_recommendation_subtitle_view);
        this.f259364Q = (TextView) view.findViewById(R.id.create_discount_dispatch_item_place);
        this.f259366R = (SimpleDraweeView) view.findViewById(R.id.create_discount_dispatch_item_image);
        this.f259367S = (ComponentContainer) view.findViewById(R.id.create_discount_dispatch_validity_container);
        this.f259368T = (Input) view.findViewById(R.id.create_discount_dispatch_validity_input);
        this.f259369U = (ComponentContainer) view.findViewById(R.id.create_discount_dispatch_validity_container_new);
        Input input5 = (Input) view.findViewById(R.id.create_discount_dispatch_validity_input_new);
        this.f259370V = input5;
        this.f259371W = (ViewGroup) view.findViewById(R.id.create_discount_dispatch_preview_message_container);
        this.f259372X = (Button) view.findViewById(R.id.create_discount_dispatch_action_button);
        this.f259373Y = (MnzFloatingFooter) view.findViewById(R.id.create_discount_dispatch_vas_flow_floating_footer);
        this.f259374Z = view.findViewById(R.id.sbc_configurator_auto_dispatch_switch_list_item_container);
        this.f259375a0 = (TextView) view.findViewById(R.id.sbc_configurator_auto_dispatch_switch_list_item_subtitle);
        Switcher switcher = (Switcher) view.findViewById(R.id.sbc_configurator_auto_dispatch_switcher);
        this.f259377b0 = switcher;
        this.f259379c0 = (ViewGroup) view.findViewById(R.id.sbc_configurator_auto_dispatch_switcher_overlay);
        this.f259381d0 = (ImageView) view.findViewById(R.id.sbc_configurator_auto_dispatch_switch_question_mark);
        Chips chips = (Chips) view.findViewById(R.id.sbc_configurator_autodispatch_duration_chips);
        this.f259383e0 = chips;
        this.f259385f0 = (ComponentContainer) view.findViewById(R.id.sbc_configurator_autodispatch_duration_chips_container);
        this.f259387g0 = (ComponentContainer) view.findViewById(R.id.sbc_configurator_auto_dispatch_preset_container);
        this.f259389h0 = (ComponentContainer) view.findViewById(R.id.sbc_configurator_budget_container);
        Input input6 = (Input) view.findViewById(R.id.sbc_configurator_budget_input);
        this.f259391i0 = input6;
        this.f259393j0 = new com.avito.android.progress_overlay.l(viewGroup, R.id.create_discount_dispatch_content_list, interfaceC28373a, z12 ? R.layout.sbc_create_discount_dispatch_vas_flow_error_overlay : R.layout.part_network_problem, 0, 16, null);
        this.f259395k0 = new com.jakewharton.rxrelay3.c();
        this.f259397l0 = new com.jakewharton.rxrelay3.c();
        this.f259399m0 = new com.jakewharton.rxrelay3.c();
        this.f259401n0 = new com.jakewharton.rxrelay3.c();
        this.f259403o0 = new com.jakewharton.rxrelay3.c();
        this.f259405p0 = new com.jakewharton.rxrelay3.c();
        this.f259407q0 = new com.jakewharton.rxrelay3.c();
        this.f259409r0 = new com.jakewharton.rxrelay3.c();
        this.f259411s0 = new com.jakewharton.rxrelay3.c();
        this.f259413t0 = new com.jakewharton.rxrelay3.c();
        this.f259415u0 = new com.jakewharton.rxrelay3.c();
        this.f259417v0 = new com.jakewharton.rxrelay3.c();
        this.f259419w0 = new com.jakewharton.rxrelay3.c();
        this.f259421x0 = new com.jakewharton.rxrelay3.c();
        new com.jakewharton.rxrelay3.c();
        this.f259423y0 = new com.jakewharton.rxrelay3.c();
        this.f259425z0 = new com.jakewharton.rxrelay3.c();
        com.jakewharton.rxrelay3.c<String> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f259333A0 = cVar;
        this.f259335B0 = cVar;
        i iVar = new i();
        this.f259337C0 = iVar;
        this.f259339D0 = iVar;
        p pVar = new p();
        this.f259341E0 = pVar;
        this.f259343F0 = pVar;
        t tVar = new t();
        this.f259345G0 = tVar;
        this.f259347H0 = tVar;
        s sVar = new s();
        this.f259349I0 = sVar;
        this.f259351J0 = sVar;
        r rVar = new r();
        this.f259353K0 = rVar;
        this.f259355L0 = rVar;
        q qVar = new q();
        this.f259357M0 = qVar;
        this.f259359N0 = qVar;
        this.f259363P0 = new j();
        if (!z12 || z13) {
            navBar.c(R.attr.ic_close24, new P0(this));
        } else {
            navBar.c(R.attr.ic_arrowBack24, new O0(this));
        }
        navBar.c(R.attr.ic_close24, new b());
        input3.setOnClickListener(new K0(this, 4));
        input.setMaxLength(9);
        input.setOnFocusChangeListener(new com.avito.android.beduin.common.component.input.single_line.e(this, c.f259428l));
        input.b(new l(input, this));
        input2.setMaxLength(2);
        input2.setOnFocusChangeListener(new com.avito.android.beduin.common.component.input.single_line.e(this, d.f259429l));
        input2.b(new m(input2, this));
        input4.setMaxLength(9);
        input4.setOnFocusChangeListener(new com.avito.android.beduin.common.component.input.single_line.e(this, e.f259430l));
        input4.b(new n(input4, this));
        input5.setOnFocusChangeListener(new com.avito.android.beduin.common.component.input.single_line.e(this, f.f259431l));
        input5.b(new o(input5, this));
        input6.setMaxLength(7);
        input6.setOnFocusChangeListener(new com.avito.android.beduin.common.component.input.single_line.e(this, g.f259432l));
        input6.b(new k(input6, this));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        componentContainer2.setSubtitleMovementMethod(LinkMovementMethod.getInstance());
        if (viewGroup2 != null) {
            viewGroup2.setClipToPadding(false);
            viewGroup2.setClipChildren(false);
        }
        switcher.setOnCheckedChangeListener(new com.avito.android.advert.item.short_term_rent.payment_toggles.toggle.h(this, 6));
        chips.setKeepSelected(true);
        chips.setSelectStrategy(SelectStrategy.f178716b);
        chips.setChipsSelectedListener(new a());
        this.f259365Q0 = new C35971x();
    }

    @Override // com.avito.android.mvi.e
    public final CreateDiscountDispatchState a(com.avito.android.mvi.e<CreateDiscountDispatchState> eVar) {
        kotlin.reflect.n<Object> nVar = f259331R0[0];
        return (CreateDiscountDispatchState) this.f259365Q0.f319122b;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState] */
    @Override // com.avito.android.mvi.e
    public final void b(Object obj) {
        kotlin.reflect.n<Object> nVar = f259331R0[0];
        this.f259365Q0.f319122b = (CreateDiscountDispatchState) obj;
    }

    public final void c() {
        D6.w(this.f259404p);
        D6.w(this.f259402o);
        D6.w(this.f259410s);
        D6.w(this.f259424z);
        D6.w(this.f259332A);
        D6.w(this.f259371W);
        D6.w(this.f259367S);
        D6.w(this.f259369U);
        D6.w(this.f259374Z);
        D6.w(this.f259385f0);
        D6.w(this.f259389h0);
        D6.w(this.f259336C);
        D6.w(this.f259338D);
        D6.w(this.f259387g0);
        D6.w(this.f259412t);
        D6.w(this.f259360O);
        D6.w(this.f259362P);
    }

    /* JADX WARN: Type inference failed for: r1v104, types: [com.avito.android.analytics.screens.J, java.lang.Integer, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v105 */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // com.avito.android.mvi.e
    public final void d(com.avito.android.mvi.e<CreateDiscountDispatchState> eVar, CreateDiscountDispatchState createDiscountDispatchState, CreateDiscountDispatchState createDiscountDispatchState2) throws Resources.NotFoundException {
        ?? r12;
        ComponentContainer componentContainer;
        int i12;
        boolean z12;
        Y41.l<? super String, kotlin.G0> lVar;
        int i13;
        boolean z13;
        CreateDiscountDispatchState.DiscountDispatchDataLoaded.f fVar;
        ComponentContainer componentContainer2;
        ComponentContainer componentContainer3;
        ComponentContainer componentContainer4;
        Button button;
        final int i14 = 1;
        final int i15 = 0;
        CreateDiscountDispatchState createDiscountDispatchState3 = createDiscountDispatchState2;
        boolean z14 = createDiscountDispatchState3 instanceof CreateDiscountDispatchState.e;
        com.avito.android.progress_overlay.l lVar2 = this.f259393j0;
        NavBar navBar = this.f259390i;
        Button button2 = this.f259372X;
        Button button3 = this.f259388h;
        MnzFloatingFooter mnzFloatingFooter = this.f259373Y;
        if (z14) {
            D6.H(mnzFloatingFooter);
            com.avito.android.mnz_common.data.MnzFloatingFooter mnzFloatingFooter2 = ((CreateDiscountDispatchState.e) createDiscountDispatchState3).f259786b;
            MnzFloatingFooterContacts contacts = mnzFloatingFooter2.getContacts();
            this.f259373Y.c(mnzFloatingFooter2, contacts != null ? contacts.getCurrent() : null, this.f259380d, new S0(this), new T0(this));
            NavBar.e(navBar, "", 0, 6);
            lVar2.a(this.f259382e.getString(R.string.messenger_create_discount_unknown_error_description));
            c();
            D6.w(button3);
            D6.w(button2);
        } else {
            boolean z15 = createDiscountDispatchState3 instanceof CreateDiscountDispatchState.d;
            TextView textView = this.f259394k;
            TextView textView2 = this.f259392j;
            if (z15) {
                final CreateDiscountDispatchState.d dVar = (CreateDiscountDispatchState.d) createDiscountDispatchState3;
                D6.w(mnzFloatingFooter);
                lVar2.j();
                c();
                D6.H(textView2);
                textView2.setText(dVar.f259780b);
                NavBar.e(navBar, "", 0, 6);
                textView.setText(g(dVar.f259781c));
                boolean z16 = dVar.f259784f;
                String str = dVar.f259782d;
                if (z16) {
                    D6.w(button3);
                    D6.H(button2);
                    button2.setText(str);
                    button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.sbc.create.mvi.L0

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ M0 f259323c;

                        {
                            this.f259323c = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i15) {
                                case 0:
                                    this.f259323c.f259411s0.accept(dVar.f259783e);
                                    break;
                                default:
                                    this.f259323c.f259411s0.accept(dVar.f259783e);
                                    break;
                            }
                        }
                    });
                } else {
                    D6.w(button2);
                    D6.H(button3);
                    button3.setText(str);
                    button3.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.sbc.create.mvi.L0

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ M0 f259323c;

                        {
                            this.f259323c = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i14) {
                                case 0:
                                    this.f259323c.f259411s0.accept(dVar.f259783e);
                                    break;
                                default:
                                    this.f259323c.f259411s0.accept(dVar.f259783e);
                                    break;
                            }
                        }
                    });
                }
            } else {
                if (!(createDiscountDispatchState3 instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded)) {
                    if (!(createDiscountDispatchState3 instanceof CreateDiscountDispatchState.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r12 = 0;
                    lVar2.k(null);
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                    ScreenPerformanceTracker.a.c(this.f259384f, r12, r12, r12, 7);
                }
                CreateDiscountDispatchState.DiscountDispatchDataLoaded discountDispatchDataLoaded = (CreateDiscountDispatchState.DiscountDispatchDataLoaded) createDiscountDispatchState3;
                lVar2.j();
                ComponentContainer componentContainer5 = this.f259404p;
                D6.H(componentContainer5);
                ComponentContainer componentContainer6 = this.f259402o;
                D6.H(componentContainer6);
                ComponentContainer componentContainer7 = this.f259410s;
                D6.H(componentContainer7);
                ViewGroup viewGroup = this.f259371W;
                D6.H(viewGroup);
                D6.w(button3);
                boolean z17 = this.f259376b;
                if (z17) {
                    D6.w(button2);
                    D6.w(viewGroup);
                    com.avito.android.mnz_common.data.MnzFloatingFooter mnzFloatingFooter3 = discountDispatchDataLoaded.f259616A;
                    if (mnzFloatingFooter3 != null) {
                        D6.H(mnzFloatingFooter);
                        MnzFloatingFooterContacts contacts2 = mnzFloatingFooter3.getContacts();
                        componentContainer = componentContainer7;
                        this.f259373Y.c(mnzFloatingFooter3, contacts2 != null ? contacts2.getCurrent() : null, this.f259380d, new Q0(this), new R0(this));
                        mnzFloatingFooter.getViewTreeObserver().addOnGlobalLayoutListener(new N0(this));
                        i12 = 0;
                    } else {
                        componentContainer = componentContainer7;
                        i12 = 0;
                    }
                } else {
                    componentContainer = componentContainer7;
                    D6.w(mnzFloatingFooter);
                    D6.H(viewGroup);
                    D6.H(button2);
                    i12 = 0;
                    button2.setOnClickListener(new K0(this, 0));
                }
                CharSequence charSequence = discountDispatchDataLoaded.f259645y;
                if (z17) {
                    D6.H(textView2);
                    textView2.setText(charSequence);
                    NavBar.e(navBar, "", i12, 6);
                } else {
                    D6.w(textView2);
                    NavBar.e(navBar, charSequence, i12, 6);
                }
                componentContainer5.setSubtitle(discountDispatchDataLoaded.f259646z);
                textView.setText(g(discountDispatchDataLoaded.f259624d));
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.e eVar2 = discountDispatchDataLoaded.f259620E;
                ArrayList arrayList = eVar2 != null ? eVar2.f259672a : null;
                ComponentContainer componentContainer8 = this.f259412t;
                if (arrayList != null) {
                    D6.G(componentContainer8, true);
                    componentContainer8.setTitle(eVar2.f259676e);
                    componentContainer8.setSubtitle(eVar2.f259675d);
                    componentContainer8.setMessage(eVar2.f259677f);
                    this.f259418w.b(eVar2.f259672a);
                    I5.a(this.f259360O, eVar2.f259674c, false);
                    I5.a(this.f259362P, eVar2.f259673b, false);
                } else {
                    D6.w(componentContainer8);
                }
                boolean z18 = discountDispatchDataLoaded.f259626f;
                Input input = this.f259408r;
                if (z18) {
                    this.f259343F0 = null;
                    Input.t(input, discountDispatchDataLoaded.f259625e, false, 6);
                    this.f259343F0 = this.f259341E0;
                }
                boolean z19 = discountDispatchDataLoaded.f259639s;
                boolean z22 = !z19;
                input.setEnabled(z22);
                componentContainer6.setEnabled(z22);
                ComponentContainer componentContainer9 = this.f259389h0;
                componentContainer9.setEnabled(z22);
                Chips chips = this.f259383e0;
                chips.setEnabled(z22);
                this.f259377b0.setEnabled(z22);
                ComponentContainer componentContainer10 = this.f259369U;
                componentContainer10.setEnabled(z22);
                Input input2 = this.f259400n;
                input2.setEnabled(z22);
                button2.setLoading(z19);
                Integer num = discountDispatchDataLoaded.f259617B;
                if (num != null && (button = (Button) mnzFloatingFooter.findViewById(num.intValue())) != null) {
                    button.setLoading(z19);
                }
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.f fVar2 = discountDispatchDataLoaded.f259621F;
                ComponentContainer componentContainer11 = componentContainer;
                D6.G(componentContainer11, fVar2.f259682d);
                if (discountDispatchDataLoaded.f259630j) {
                    ComponentContainer.n(componentContainer11, discountDispatchDataLoaded.f259631k, 2);
                    Input.f179303W.getClass();
                    input.setState(Input.f179305b0);
                } else {
                    componentContainer11.q(componentContainer11.f178848i);
                    componentContainer11.setSubtitle(g(discountDispatchDataLoaded.f259629i));
                    Input.f179303W.getClass();
                    input.setState(Input.f179304a0);
                }
                CreateDiscountDispatchState.c cVar = discountDispatchDataLoaded.f259638r;
                boolean z23 = cVar instanceof CreateDiscountDispatchState.c.b;
                TextView textView3 = this.f259338D;
                View view = this.f259336C;
                ComponentContainer componentContainer12 = this.f259332A;
                ComponentContainer componentContainer13 = this.f259424z;
                if (z23) {
                    CreateDiscountDispatchState.c.b bVar = (CreateDiscountDispatchState.c.b) cVar;
                    boolean z24 = bVar.f259776h;
                    z12 = z22;
                    TextView textView4 = this.f259334B;
                    if (z24) {
                        D6.w(textView4);
                        D6.w(componentContainer13);
                        D6.H(view);
                        com.avito.android.sbc.create.mvi.util.d dVar2 = bVar.f259774f;
                        I5.a(textView3, dVar2 != null ? g(dVar2) : null, false);
                        DescriptionParameterItem descriptionParameterItem = this.f259344G;
                        descriptionParameterItem.getLeftTextView().setText(bVar.f259770b);
                        descriptionParameterItem.getRightTextView().setText(bVar.f259771c);
                        DescriptionParameterItem descriptionParameterItem2 = this.f259346H;
                        descriptionParameterItem2.getLeftTextView().setText(bVar.f259773e);
                        descriptionParameterItem2.getRightTextView().setText(bVar.f259772d);
                        kotlin.Q<String, String> q12 = bVar.f259777i;
                        DescriptionParameterItem descriptionParameterItem3 = this.f259340E;
                        if (q12 != null) {
                            D6.H(descriptionParameterItem3);
                            descriptionParameterItem3.getLeftTextView().setText(q12.f406619b);
                            descriptionParameterItem3.getRightTextView().setText(q12.f406620c);
                        } else {
                            D6.w(descriptionParameterItem3);
                        }
                        D6.w(this.f259342F);
                        if (bVar.f259778j) {
                            descriptionParameterItem2.setLeftTextIconDrawable(androidx.core.content.d.getDrawable(descriptionParameterItem2.getContext(), R.drawable.sbc_configurator_question_mark));
                            descriptionParameterItem2.setIconTint(C35835l0.d(R.attr.gray54, descriptionParameterItem2.getContext()));
                            descriptionParameterItem2.setLeftTextIconClickListener(new K0(this, 2));
                        } else {
                            descriptionParameterItem2.setLeftTextIconDrawable(null);
                            descriptionParameterItem2.setLeftTextIconClickListener(null);
                        }
                    } else {
                        D6.H(componentContainer13);
                        componentContainer13.setMessage((CharSequence) null);
                        D6.H(textView4);
                        D6.w(view);
                        D6.w(textView3);
                    }
                    D6.w(componentContainer12);
                    button2.setText(R.string.messenger_create_discount_choose_vas);
                } else {
                    z12 = z22;
                    if (!(cVar instanceof CreateDiscountDispatchState.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    D6.w(componentContainer13);
                    D6.w(textView3);
                    D6.w(view);
                    D6.H(componentContainer12);
                    CreateDiscountDispatchState.c.a aVar = (CreateDiscountDispatchState.c.a) cVar;
                    componentContainer12.setTitle(aVar.f259763c);
                    String str2 = aVar.f259764d;
                    if (aVar.f259767g) {
                        componentContainer12.setMessage(str2);
                    } else {
                        ComponentContainer.n(componentContainer12, str2, 2);
                    }
                    ProgressBar progressBar = this.f259350J;
                    progressBar.setProgress(aVar.f259766f);
                    boolean z25 = aVar.f259765e;
                    int i16 = z25 ? R.attr.green : R.attr.red700;
                    int i17 = z25 ? R.attr.green200 : R.attr.red200;
                    progressBar.setFillColor(C35835l0.d(i16, progressBar.getContext()));
                    progressBar.setEmptyColor(C35835l0.d(i17, progressBar.getContext()));
                    button2.setText(R.string.messenger_create_discount_tariff_done_action);
                }
                kotlin.G0 g03 = kotlin.G0.f406611a;
                this.f259348I.setText(discountDispatchDataLoaded.f259636p);
                this.f259354L.setText(discountDispatchDataLoaded.f259637q);
                this.f259352K.setText(discountDispatchDataLoaded.f259632l);
                D6.G(componentContainer6, fVar2.f259680b);
                D6.G(componentContainer5, fVar2.f259679a);
                boolean z26 = discountDispatchDataLoaded.f259643w;
                Input input3 = this.f259398m;
                if (z26) {
                    lVar = null;
                    this.f259355L0 = null;
                    i13 = 6;
                    z13 = false;
                    Input.t(input3, discountDispatchDataLoaded.f259641u, false, 6);
                    this.f259355L0 = this.f259353K0;
                } else {
                    lVar = null;
                    i13 = 6;
                    z13 = false;
                }
                boolean z27 = discountDispatchDataLoaded.f259642v;
                Input input4 = this.f259396l;
                if (z27) {
                    this.f259351J0 = lVar;
                    Input.t(input4, discountDispatchDataLoaded.f259640t, z13, i13);
                    this.f259351J0 = this.f259349I0;
                }
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.i iVar = discountDispatchDataLoaded.f259623c;
                boolean z28 = iVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.b;
                TextView textView5 = this.f259358N;
                com.avito.android.sbc.utils.a aVar2 = this.f259378c;
                TextView textView6 = this.f259356M;
                if (z28) {
                    D6.w(input3);
                    D6.H(input4);
                    CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.b bVar2 = (CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.b) iVar;
                    SpannableString spannableString = new SpannableString(aVar2.a(bVar2.f259720k));
                    componentContainer2 = componentContainer9;
                    fVar = fVar2;
                    componentContainer3 = componentContainer10;
                    spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
                    textView6.setText(spannableString);
                    textView5.setText(aVar2.a(bVar2.f259721l));
                    D6.H(textView6);
                    e();
                    Input.t(input2, ((CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.b) iVar).f259710a, false, 6);
                    if (bVar2.f259715f) {
                        ComponentContainer.n(componentContainer6, bVar2.f259716g, 2);
                        Input.f179303W.getClass();
                        input4.setState(Input.f179305b0);
                    } else {
                        componentContainer6.q(componentContainer6.f178848i);
                        componentContainer6.setSubtitle(bVar2.f259719j);
                        Input.f179303W.getClass();
                        input4.setState(Input.f179304a0);
                    }
                } else {
                    fVar = fVar2;
                    componentContainer2 = componentContainer9;
                    componentContainer3 = componentContainer10;
                    if (iVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.a) {
                        D6.w(input4);
                        D6.H(input3);
                        CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.a aVar3 = (CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.a) iVar;
                        SpannableString spannableString2 = new SpannableString(aVar2.a(aVar3.f259708k));
                        spannableString2.setSpan(new StrikethroughSpan(), 0, spannableString2.length(), 33);
                        textView6.setText(spannableString2);
                        textView5.setText(aVar2.a(aVar3.f259709l));
                        D6.H(textView6);
                        e();
                        Input.t(input2, ((CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.a) iVar).f259698a, false, 6);
                        if (aVar3.f259703f) {
                            ComponentContainer.n(componentContainer6, aVar3.f259704g, 2);
                            Input.f179303W.getClass();
                            input3.setState(Input.f179305b0);
                        } else {
                            componentContainer6.q(componentContainer6.f178848i);
                            componentContainer6.setSubtitle(aVar3.f259707j);
                            Input.f179303W.getClass();
                            input3.setState(Input.f179304a0);
                        }
                    } else if (iVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.c) {
                        CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.c cVar2 = (CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.c) iVar;
                        textView5.setText(cVar2.f259727f);
                        D6.w(textView6);
                        Input.t(input2, ((CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.c) iVar).f259722a, false, 6);
                        String str3 = cVar2.f259728g;
                        if (str3 != null) {
                            ComponentContainer.n(componentContainer5, str3, 2);
                            Input.f179303W.getClass();
                            input2.setState(Input.f179305b0);
                        } else {
                            e();
                        }
                    } else {
                        if (!(iVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        e();
                        textView5.setText(((CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.e) iVar).f259738f);
                        D6.w(textView6);
                        Input.t(input2, ((CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.e) iVar).f259733a, false, 6);
                    }
                }
                this.f259364Q.setText(discountDispatchDataLoaded.f259633m);
                C35949t5.c(this.f259366R, com.avito.android.image_loader.b.b(discountDispatchDataLoaded.f259634n), null, null, null, 14);
                ComponentContainer componentContainer14 = this.f259367S;
                boolean z29 = fVar.f259681c;
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.j jVar = discountDispatchDataLoaded.f259644x;
                if (!z29) {
                    D6.w(componentContainer14);
                    D6.w(componentContainer3);
                } else if (jVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.c) {
                    D6.w(componentContainer3);
                    D6.H(componentContainer14);
                } else if (jVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d) {
                    D6.H(componentContainer3);
                    D6.w(componentContainer14);
                }
                if (jVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.a) {
                    componentContainer5.setMessage((CharSequence) null);
                } else if (jVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.b) {
                    componentContainer5.setMessage(((CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.b) jVar).f259741b);
                } else if (jVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.c) {
                    componentContainer5.setMessage((CharSequence) null);
                    CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.c cVar3 = (CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.c) jVar;
                    String str4 = cVar3.f259743b;
                    Input input5 = this.f259368T;
                    Input.t(input5, str4, false, 6);
                    componentContainer14.q(cVar3.f259747f);
                    input5.setOnClickListener(new K0(this, 3));
                    input5.setRightIcon(C35835l0.h(R.attr.ic_calendar20, input5.getContext()));
                } else if (jVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d) {
                    componentContainer5.setMessage((CharSequence) null);
                    CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d dVar3 = (CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d) jVar;
                    ComponentContainer componentContainer15 = componentContainer3;
                    componentContainer15.q(dVar3.f259753f);
                    Input input6 = this.f259370V;
                    String str5 = dVar3.f259756i;
                    if (str5 != null) {
                        ComponentContainer.n(componentContainer15, str5, 2);
                        Input.f179303W.getClass();
                        input6.setState(Input.f179305b0);
                    } else {
                        componentContainer15.q(dVar3.f259753f);
                        Input.f179303W.getClass();
                        input6.setState(Input.f179304a0);
                    }
                    if (dVar3.f259757j) {
                        this.f259347H0 = null;
                        Input.t(input6, String.valueOf(dVar3.f259754g), false, 6);
                        this.f259347H0 = this.f259345G0;
                    }
                }
                ComponentContainer componentContainer16 = this.f259387g0;
                ComponentContainer componentContainer17 = this.f259385f0;
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.d dVar4 = discountDispatchDataLoaded.f259618C;
                if (dVar4 == null) {
                    D6.w(this.f259374Z);
                    D6.w(componentContainer17);
                    D6.w(componentContainer2);
                    D6.w(componentContainer16);
                } else {
                    int iOrdinal = dVar4.f259664a.ordinal();
                    CreateDiscountDispatchState.DiscountDispatchDataLoaded.a aVar4 = dVar4.f259667d;
                    CreateDiscountDispatchState.DiscountDispatchDataLoaded.b bVar3 = dVar4.f259666c;
                    if (iOrdinal == 0) {
                        componentContainer4 = componentContainer2;
                        f(true, z12);
                        D6.G(componentContainer17, bVar3.f259661a);
                        D6.G(componentContainer4, aVar4.f259652a);
                        D6.H(componentContainer16);
                    } else if (iOrdinal == 1) {
                        componentContainer4 = componentContainer2;
                        f(false, z12);
                        D6.w(componentContainer17);
                        D6.w(componentContainer4);
                        D6.w(componentContainer16);
                    } else if (iOrdinal != 2) {
                        componentContainer4 = componentContainer2;
                    } else {
                        f(true, false);
                        D6.G(componentContainer17, bVar3.f259661a);
                        componentContainer4 = componentContainer2;
                        D6.G(componentContainer4, aVar4.f259652a);
                        D6.H(componentContainer16);
                    }
                    this.f259375a0.setText(dVar4.f259670g);
                    this.f259381d0.setOnClickListener(new K0(this, 5));
                    this.f259420x.b(dVar4.f259665b.f259663a);
                    chips.setData(bVar3.f259662b);
                    List<C15545b> list = bVar3.f259662b;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list) {
                        if (((C15545b) obj).f16599c) {
                            arrayList2.add(obj);
                        }
                    }
                    List<com.avito.android.lib.design.chips.h> listS = chips.s();
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(listS, 10));
                    Iterator it = ((ArrayList) listS).iterator();
                    while (it.hasNext()) {
                        arrayList3.add(Long.valueOf(((InterfaceC15544a) ((com.avito.android.lib.design.chips.h) it.next())).getF16601e()));
                    }
                    ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(Boolean.valueOf(((InterfaceC15544a) it2.next()).getF16599c()));
                    }
                    if (!arrayList3.equals(arrayList4)) {
                        Chips.c chipsSelectedListener = chips.getChipsSelectedListener();
                        chips.setChipsSelectedListener(null);
                        chips.j();
                        chips.r(arrayList2);
                        chips.setChipsSelectedListener(chipsSelectedListener);
                    }
                    componentContainer4.setTitle(aVar4.f259653b);
                    String str6 = aVar4.f259659h;
                    boolean z32 = aVar4.f259658g;
                    Input input7 = this.f259391i0;
                    if (z32) {
                        ComponentContainer.n(componentContainer4, str6, 2);
                        Input.f179303W.getClass();
                        input7.setState(Input.f179305b0);
                    } else {
                        componentContainer4.q(componentContainer4.f178848i);
                        Input.f179303W.getClass();
                        input7.setState(Input.f179304a0);
                        componentContainer4.setMessage(str6);
                    }
                    if (aVar4.f259654c) {
                        this.f259359N0 = null;
                        Input.t(input7, String.valueOf(aVar4.f259655d), false, 6);
                        this.f259359N0 = this.f259357M0;
                    }
                }
                if (eVar2 != null && eVar2.f259678g) {
                    this.f259386g.post(new com.avito.android.publish.screen.objects.view.actions.h(this, 9));
                    this.f259425z0.accept(kotlin.G0.f406611a);
                }
            }
        }
        r12 = 0;
        kotlin.G0 g022 = kotlin.G0.f406611a;
        ScreenPerformanceTracker.a.c(this.f259384f, r12, r12, r12, 7);
    }

    public final void e() {
        ComponentContainer componentContainer = this.f259404p;
        componentContainer.q(componentContainer.f178848i);
        Input.f179303W.getClass();
        this.f259400n.setState(Input.f179304a0);
    }

    public final void f(boolean z12, boolean z13) throws Resources.NotFoundException {
        D6.H(this.f259374Z);
        this.f259339D0 = null;
        Switcher switcher = this.f259377b0;
        if (switcher.isChecked() != z12) {
            switcher.setChecked(z12);
        }
        if (switcher.isEnabled() != z13) {
            switcher.setEnabled(z13);
        }
        boolean z14 = !z13;
        ViewGroup viewGroup = this.f259379c0;
        viewGroup.setFocusable(z14);
        viewGroup.setClickable(z14);
        switcher.setFocusable(z13);
        switcher.setClickable(z13);
        if (z13) {
            viewGroup.setOnClickListener(null);
        } else {
            viewGroup.setOnClickListener(new K0(this, 1));
        }
        this.f259339D0 = this.f259337C0;
    }

    @Y61.k
    public final CharSequence g(@Y61.k com.avito.android.sbc.create.mvi.util.d dVar) {
        z zVar = new z();
        CharSequence charSequence = dVar.f259910a;
        com.avito.android.sbc.create.mvi.util.c cVar = dVar.f259911b;
        if (cVar == null) {
            return charSequence;
        }
        com.avito.android.sbc.create.mvi.util.e eVar = new com.avito.android.sbc.create.mvi.util.e(zVar, dVar);
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(eVar, cVar.f259905a, cVar.f259906b, 33);
        return spannableString;
    }

    /* compiled from: CreateDiscountDispatchView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/sbc/create/mvi/M0$a", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Chips.c {
        public a() {
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            Y41.l<? super C15545b, kotlin.G0> lVar;
            if (!(hVar instanceof C15545b) || (lVar = M0.this.f259363P0) == null) {
                return;
            }
            ((j) lVar).invoke(hVar);
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        }
    }

    /* compiled from: InputExtensions.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class k implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f259435b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f259436c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ M0 f259437d;

        public k(Input input, M0 m02) {
            this.f259436c = input;
            this.f259437d = m02;
            this.f259435b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f259436c.getDeformattedText();
            if (kotlin.jvm.internal.L.f(deformattedText, this.f259435b)) {
                return;
            }
            Y41.l<? super String, kotlin.G0> lVar = this.f259437d.f259359N0;
            if (lVar != null) {
                lVar.invoke(deformattedText);
            }
            this.f259435b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }

    /* compiled from: InputExtensions.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class l implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f259438b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f259439c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ M0 f259440d;

        public l(Input input, M0 m02) {
            this.f259439c = input;
            this.f259440d = m02;
            this.f259438b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f259439c.getDeformattedText();
            if (kotlin.jvm.internal.L.f(deformattedText, this.f259438b)) {
                return;
            }
            Y41.l<? super String, kotlin.G0> lVar = this.f259440d.f259351J0;
            if (lVar != null) {
                lVar.invoke(deformattedText);
            }
            this.f259438b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }

    /* compiled from: InputExtensions.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class m implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f259441b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f259442c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ M0 f259443d;

        public m(Input input, M0 m02) {
            this.f259442c = input;
            this.f259443d = m02;
            this.f259441b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f259442c.getDeformattedText();
            if (kotlin.jvm.internal.L.f(deformattedText, this.f259441b)) {
                return;
            }
            Y41.l<? super String, kotlin.G0> lVar = this.f259443d.f259355L0;
            if (lVar != null) {
                lVar.invoke(deformattedText);
            }
            this.f259441b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }

    /* compiled from: InputExtensions.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class n implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f259444b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f259445c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ M0 f259446d;

        public n(Input input, M0 m02) {
            this.f259445c = input;
            this.f259446d = m02;
            this.f259444b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f259445c.getDeformattedText();
            if (kotlin.jvm.internal.L.f(deformattedText, this.f259444b)) {
                return;
            }
            Y41.l<? super String, kotlin.G0> lVar = this.f259446d.f259343F0;
            if (lVar != null) {
                lVar.invoke(deformattedText);
            }
            this.f259444b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }

    /* compiled from: InputExtensions.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class o implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f259447b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f259448c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ M0 f259449d;

        public o(Input input, M0 m02) {
            this.f259448c = input;
            this.f259449d = m02;
            this.f259447b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f259448c.getDeformattedText();
            if (kotlin.jvm.internal.L.f(deformattedText, this.f259447b)) {
                return;
            }
            Y41.l<? super String, kotlin.G0> lVar = this.f259449d.f259347H0;
            if (lVar != null) {
                lVar.invoke(deformattedText);
            }
            this.f259447b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
