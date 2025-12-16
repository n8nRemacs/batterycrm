package com.avito.android.saved_searches.presentation.core;

import Y41.l;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.bottom_sheet.q;
import com.avito.android.lib.design.input.Input;
import com.avito.android.libs.saved_searches.domain.SavedSearchParams;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35968w3;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import md.InterfaceC44055a;

/* compiled from: SavedSearchDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/saved_searches/presentation/core/SavedSearchDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lmd/a;", "Lcom/avito/android/saved_searches/di/core/b;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavedSearchDialogFragment extends BaseDialogFragment implements InterfaceC44055a<com.avito.android.saved_searches.di.core.b>, InterfaceC28477j.a {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public h f258386h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public TV.c f258387i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public f f258388j0;

    /* renamed from: k0, reason: collision with root package name */
    public com.avito.android.saved_searches.di.core.b f258389k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f258390l0;

    /* renamed from: n0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f258385n0 = {m0.f406844a.e(new Y(SavedSearchDialogFragment.class, "openParams", "getOpenParams()Lcom/avito/android/libs/saved_searches/domain/SavedSearchParams;", 0))};

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public static final a f258384m0 = new a(null);

    /* compiled from: SavedSearchDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/core/SavedSearchDialogFragment$a;", "", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SavedSearchDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/saved_searches/presentation/core/SavedSearchDialogFragment$b", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.lib.design.bottom_sheet.d {
        public b(Context context) {
            super(context, R.style.Re23_BottomSheet_Default);
        }

        @Override // com.avito.android.lib.design.bottom_sheet.d, android.app.Dialog, android.view.Window.Callback
        public final boolean dispatchTouchEvent(@Y61.k MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                Input input = (Input) findViewById(R.id.name_input);
                if (input != null && input.f179340l.isFocused()) {
                    Rect rect = new Rect();
                    input.getGlobalVisibleRect(rect);
                    if (!rect.contains(rawX, rawY)) {
                        K2.d(input, false);
                    }
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override // androidx.view.r, android.app.Dialog
        @SuppressLint({"MissingSuperCall"})
        public final void onBackPressed() {
            h hVar = SavedSearchDialogFragment.this.f258386h0;
            if (hVar == null) {
                hVar = null;
            }
            hVar.b();
        }
    }

    /* compiled from: SavedSearchDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Bundle f258392l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ SavedSearchDialogFragment f258393m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Bundle bundle, SavedSearchDialogFragment savedSearchDialogFragment) {
            super(1);
            this.f258392l = bundle;
            this.f258393m = savedSearchDialogFragment;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            if (this.f258392l == null) {
                h hVar = this.f258393m.f258386h0;
                if (hVar == null) {
                    hVar = null;
                }
                hVar.f();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SavedSearchDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f258394l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(View view) {
            return G0.f406611a;
        }
    }

    /* compiled from: SavedSearchDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            h hVar = SavedSearchDialogFragment.this.f258386h0;
            if (hVar == null) {
                hVar = null;
            }
            hVar.c();
            return G0.f406611a;
        }
    }

    public SavedSearchDialogFragment() {
        super(0, 1, null);
        this.f258390l0 = new C35968w3(this);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.saved_searches.di.core.b bVarA = com.avito.android.saved_searches.di.core.a.a().a((SavedSearchParams) this.f258390l0.getValue(this, f258385n0[0]), this, (com.avito.android.saved_searches.di.core.i) C29972i.a(C29972i.b(this), com.avito.android.saved_searches.di.core.i.class), cv.c.b(this));
        this.f258389k0 = bVarA;
        bVarA.b(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        b bVar = new b(requireContext());
        f fVar = this.f258388j0;
        if (fVar == null) {
            fVar = null;
        }
        bVar.S(fVar.f258407e);
        bVar.B(R.layout.fragment_container, R.layout.saved_search_dialog_footer, new c(bundle, this), d.f258394l, true);
        View viewInflate = bVar.getLayoutInflater().inflate(R.layout.saved_search_overlay_header, (ViewGroup) null);
        bVar.f178524r = viewInflate;
        q qVar = bVar.f178530x;
        if (qVar != null) {
            qVar.B(viewInflate);
        }
        View viewFindViewById = viewInflate.findViewById(R.id.thumb);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        D6.G((ImageView) viewFindViewById, !bVar.getContext().getResources().getBoolean(R.bool.is_tablet));
        View viewFindViewById2 = viewInflate.findViewById(R.id.close_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById2;
        D6.G(imageView, true);
        imageView.setOnClickListener(new com.avito.android.review_gallery.g(bVar, 5));
        bVar.R(new e());
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        TV.c cVar = this.f258387i0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.h(TV.d.f15683a);
        super.onDestroy();
    }

    @Override // md.InterfaceC44055a
    public final com.avito.android.saved_searches.di.core.b r0() {
        com.avito.android.saved_searches.di.core.b bVar = this.f258389k0;
        if (bVar == null) {
            return null;
        }
        return bVar;
    }
}
