package com.avito.android.beduin.v2.page;

import Ni.C14578a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.N0;
import com.avito.android.util.V2;
import com.avito.beduin.v2.avito.component.button.state.C36216a;
import com.avito.beduin.v2.engine.D;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetContentPaddings;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetHeight;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetModalSize;
import com.avito.beduin.v2.interaction.detached.flow.modal.ModalButtonsOrientation;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.BeduinView;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BaseBeduinHostFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/beduin/v2/page/BaseBeduinHostFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "LFV0/c;", "Lcom/avito/beduin/v2/interaction/detached/flow/b;", "Lcom/avito/beduin/v2/interaction/flow/keyboard/f;", "<init>", "()V", "DetachedBottomSheet", "_design-modules_beduin-v2-page_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BaseBeduinHostFragment extends BaseFragment implements FV0.c, com.avito.beduin.v2.interaction.detached.flow.b, com.avito.beduin.v2.interaction.flow.keyboard.f {

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f104751n0;

    /* compiled from: BaseBeduinHostFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/v2/page/BaseBeduinHostFragment$DetachedBottomSheet;", "Lcom/avito/android/beduin/v2/page/BaseDetachedBottomSheet;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_design-modules_beduin-v2-page_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DetachedBottomSheet extends BaseDetachedBottomSheet implements InterfaceC28477j.a {

        /* renamed from: l0, reason: collision with root package name */
        @Y61.k
        public static final a f104752l0 = new a(null);

        /* renamed from: i0, reason: collision with root package name */
        public cU.s f104753i0;

        /* renamed from: j0, reason: collision with root package name */
        public D f104754j0;

        /* renamed from: k0, reason: collision with root package name */
        @Y61.l
        public LinkedHashMap f104755k0;

        /* compiled from: BaseBeduinHostFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/page/BaseBeduinHostFragment$DetachedBottomSheet$a;", "", "<init>", "()V", "_design-modules_beduin-v2-page_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            @Y61.k
            public static DetachedBottomSheet a(@Y61.k cU.s sVar, @Y61.k D d12, @Y61.k BottomSheetHeight bottomSheetHeight, @Y61.k BottomSheetContentPaddings bottomSheetContentPaddings, @Y61.l LinkedHashMap linkedHashMap, @Y61.k Y41.a aVar) {
                DetachedBottomSheet detachedBottomSheet = new DetachedBottomSheet();
                detachedBottomSheet.f104753i0 = sVar;
                detachedBottomSheet.f104754j0 = d12;
                detachedBottomSheet.f104758g0 = bottomSheetHeight;
                detachedBottomSheet.f104759h0 = bottomSheetContentPaddings;
                detachedBottomSheet.f104755k0 = linkedHashMap;
                detachedBottomSheet.f104757f0 = aVar;
                return detachedBottomSheet;
            }

            public a() {
            }
        }

        @Override // com.avito.android.beduin.v2.page.BaseDetachedBottomSheet
        @Y61.k
        public final BeduinView b5() {
            LinkedHashMap linkedHashMap = this.f104755k0;
            String str = linkedHashMap != null ? (String) linkedHashMap.get("contentType") : null;
            LinkedHashMap linkedHashMap2 = this.f104755k0;
            J jA2 = C14578a.a(linkedHashMap2 != null ? (String) linkedHashMap2.get("trackerResult") : null);
            if (str != null) {
                cU.s sVar = this.f104753i0;
                if (sVar == null) {
                    sVar = null;
                }
                sVar.getPerformanceTracker().m(str);
            }
            BeduinView beduinView = new BeduinView(requireContext(), null, 0, 0, 14, null);
            cU.s sVar2 = this.f104753i0;
            if (sVar2 == null) {
                sVar2 = null;
            }
            A aB2 = sVar2.b();
            cU.s sVar3 = this.f104753i0;
            if (sVar3 == null) {
                sVar3 = null;
            }
            com.avito.beduin.v2.theme.k kVarA = sVar3.a();
            beduinView.f337913c = aB2;
            beduinView.f337914d = kVarA;
            D d12 = this.f104754j0;
            if (d12 == null) {
                d12 = null;
            }
            beduinView.b(d12);
            if (str != null) {
                cU.s sVar4 = this.f104753i0;
                if (sVar4 == null) {
                    sVar4 = null;
                }
                ScreenPerformanceTracker.a.c(sVar4.getPerformanceTracker(), str, jA2, null, 4);
            }
            return beduinView;
        }

        @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
        public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
            super.onDismiss(dialogInterface);
            D d12 = this.f104754j0;
            if (d12 == null) {
                d12 = null;
            }
            d12.destroy();
        }
    }

    /* compiled from: BaseBeduinHostFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f104756l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Failed to dismiss detached Modal";
        }
    }

    public BaseBeduinHostFragment() {
        super(0, 1, null);
        this.f104751n0 = new LinkedHashSet();
    }

    @Override // FV0.a
    @Y61.k
    public FV0.f A1() {
        return FV0.g.f4722a;
    }

    @Override // com.avito.beduin.v2.interaction.flow.keyboard.f
    public void L4(boolean z12) {
        View viewFindFocus;
        Dialog dialog;
        Window window;
        View decorView;
        View viewFindFocus2;
        DetachedBottomSheet detachedBottomSheet = (DetachedBottomSheet) C42745f0.R(this.f104751n0);
        if (detachedBottomSheet != null && (dialog = detachedBottomSheet.getDialog()) != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) androidx.core.content.d.getSystemService(dialog.getContext(), InputMethodManager.class);
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(decorView.getWindowToken(), 0);
            }
            if (z12 && (viewFindFocus2 = decorView.findFocus()) != null) {
                viewFindFocus2.clearFocus();
            }
        }
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            View decorView2 = activityC22955mL1.getWindow().getDecorView();
            InputMethodManager inputMethodManager2 = (InputMethodManager) androidx.core.content.d.getSystemService(activityC22955mL1, InputMethodManager.class);
            if (inputMethodManager2 != null) {
                inputMethodManager2.hideSoftInputFromWindow(decorView2.getWindowToken(), 0);
            }
            if (!z12 || (viewFindFocus = decorView2.findFocus()) == null) {
                return;
            }
            viewFindFocus.clearFocus();
        }
    }

    @Override // com.avito.beduin.v2.interaction.detached.flow.b
    @Y61.k
    public final HV0.b Y2(@Y61.l String str, @Y61.l String str2, @Y61.l C36216a[] c36216aArr, @Y61.l ModalButtonsOrientation modalButtonsOrientation, boolean z12, @Y61.l Y41.a<G0> aVar, @Y61.l com.avito.beduin.v2.interaction.detached.flow.modal.a aVar2, boolean z13, @Y61.k Y41.a<G0> aVar3) {
        com.avito.android.beduin.v2.page.modal.a aVar4 = com.avito.android.beduin.v2.page.modal.a.f105171a;
        Context contextRequireContext = requireContext();
        com.avito.beduin.v2.theme.k kVarA = q5().a();
        aVar4.getClass();
        final com.avito.android.lib.design.modal.a aVarA = com.avito.android.beduin.v2.page.modal.a.a(contextRequireContext, kVarA, str, str2, c36216aArr, modalButtonsOrientation, z12, aVar, aVar2, z13, aVar3);
        com.avito.android.lib.util.g.a(aVarA);
        return new HV0.b() { // from class: com.avito.android.beduin.v2.page.b
            @Override // HV0.b
            public final void close() {
                try {
                    N0.a(aVarA);
                } catch (Throwable th2) {
                    V2.f318762a.h("BeduinV2", th2, BaseBeduinHostFragment.a.f104756l);
                }
            }
        };
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        FV0.i.a(r5(), this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        FV0.i.b(r5());
        super.onDestroy();
    }

    @Y61.k
    public abstract cU.s q5();

    @Y61.k
    public abstract Collection<FV0.h> r5();

    @Override // com.avito.beduin.v2.interaction.detached.flow.b
    @Y61.k
    public final HV0.b y2(@Y61.k Y41.a aVar, @Y61.k D d12, @Y61.k BottomSheetContentPaddings bottomSheetContentPaddings, @Y61.k BottomSheetHeight bottomSheetHeight, @Y61.k BottomSheetModalSize bottomSheetModalSize, @Y61.l LinkedHashMap linkedHashMap) {
        DetachedBottomSheet.a aVar2 = DetachedBottomSheet.f104752l0;
        cU.s sVarQ5 = q5();
        aVar2.getClass();
        final DetachedBottomSheet detachedBottomSheetA = DetachedBottomSheet.a.a(sVarQ5, d12, bottomSheetHeight, bottomSheetContentPaddings, linkedHashMap, aVar);
        detachedBottomSheetA.show(getParentFragmentManager(), "bottom-sheet");
        this.f104751n0.add(detachedBottomSheetA);
        return new HV0.b() { // from class: com.avito.android.beduin.v2.page.c
            @Override // HV0.b
            public final void close() {
                BaseBeduinHostFragment.DetachedBottomSheet detachedBottomSheet = detachedBottomSheetA;
                BaseBeduinHostFragment baseBeduinHostFragment = this;
                try {
                    detachedBottomSheet.dismissAllowingStateLoss();
                    baseBeduinHostFragment.f104751n0.remove(detachedBottomSheet);
                } catch (Throwable th2) {
                    V2.f318762a.h("BeduinV2", th2, d.f104809l);
                }
            }
        };
    }

    @Override // FV0.c
    public final Fragment j1() {
        return this;
    }
}
