package com.akita.compose.component.bottom_sheet.internal;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.ui.platform.C2;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.window.H;
import androidx.core.view.F0;
import androidx.view.C19918B;
import androidx.view.C23489g;
import androidx.view.V0;
import androidx.view.X0;
import androidx.view.r;
import androidx.view.x;
import com.avito.android.R;
import java.util.UUID;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BottomSheetDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/akita/compose/component/bottom_sheet/internal/m;", "Landroidx/activity/r;", "Landroidx/compose/ui/platform/C2;", "bottom-sheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class m extends r implements C2 {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public Y41.a<G0> f60635e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public H f60636f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final View f60637g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final l f60638h;

    /* compiled from: BottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/akita/compose/component/bottom_sheet/internal/m$a", "Landroid/view/ViewOutlineProvider;", "bottom-sheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(@Y61.k View view, @Y61.k Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    /* compiled from: BottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/x;", "Lkotlin/G0;", "invoke", "(Landroidx/activity/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<x, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(x xVar) {
            m.this.f60635e.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: BottomSheetDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LayoutDirection layoutDirection = LayoutDirection.f42838b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(@Y61.k Y41.a<G0> aVar, @Y61.k H h12, @Y61.k View view, @Y61.k LayoutDirection layoutDirection, @Y61.k androidx.compose.ui.unit.d dVar, @Y61.k UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0, 2, 0 == true ? 1 : 0);
        this.f60635e = aVar;
        this.f60636f = h12;
        this.f60637g = view;
        float f12 = 8;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        F0.a(window, this.f60636f.f43027e);
        l lVar = new l(getContext(), window);
        lVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        lVar.setClipChildren(false);
        lVar.setElevation(dVar.M0(f12));
        lVar.setOutlineProvider(new a());
        this.f60638h = lVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            n(viewGroup);
        }
        setContentView(lVar);
        V0.b(lVar, V0.a(view));
        X0.b(lVar, X0.a(view));
        C23489g.b(lVar, C23489g.a(view));
        o(this.f60635e, this.f60636f, layoutDirection);
        C19918B.a(this.f21241d, this, new b(), 2);
    }

    public static final void n(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof l) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = viewGroup.getChildAt(i12);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                n(viewGroup2);
            }
        }
    }

    public final void o(@Y61.k Y41.a<G0> aVar, @Y61.k H h12, @Y61.k LayoutDirection layoutDirection) {
        this.f60635e = aVar;
        this.f60636f = h12;
        ViewGroup.LayoutParams layoutParams = this.f60637g.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i12 = 0;
        boolean z12 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int iOrdinal = h12.f43025c.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                z12 = true;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                z12 = false;
            }
        }
        getWindow().setFlags(z12 ? 8192 : -8193, 8192);
        int iOrdinal2 = layoutDirection.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = 1;
        }
        this.f60638h.setLayoutDirection(i12);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(@Y61.k MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent && this.f60636f.f43024b) {
            this.f60635e.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
