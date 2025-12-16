package com.avito.android.gig_apply.ui.dialogs.item_dialog;

import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.os.Bundle;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.ComposeView;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35968w3;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: GigSlotItemsDialogFragment.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/gig_apply/ui/dialogs/item_dialog/GigSlotItemsDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigSlotItemsDialogFragment extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: h0, reason: collision with root package name */
    @k
    public final C35968w3 f160001h0;

    /* renamed from: i0, reason: collision with root package name */
    @k
    public final InterfaceC22204y1<d> f160002i0;

    /* renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f160000k0 = {m0.f406844a.e(new Y(GigSlotItemsDialogFragment.class, "openParams", "getOpenParams()Lcom/avito/android/gig_apply/ui/dialogs/item_dialog/GigSlotItemsOpenParams;", 0))};

    /* renamed from: j0, reason: collision with root package name */
    @k
    public static final a f159999j0 = new a(null);

    /* compiled from: GigSlotItemsDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_apply/ui/dialogs/item_dialog/GigSlotItemsDialogFragment$a;", "", "<init>", "()V", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: GigSlotItemsDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<A, Integer, G0> {
        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.c.a(false, r.c(1679382569, new com.avito.android.gig_apply.ui.dialogs.item_dialog.a(GigSlotItemsDialogFragment.this), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    public GigSlotItemsDialogFragment() {
        super(0, 1, null);
        this.f160001h0 = new C35968w3(this);
        this.f160002i0 = C22126m3.g(new d(null, null, 3, null));
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setContent(new C22096n(1493475982, new b(), true));
        dVar.setContentView(composeView);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        InterfaceC22204y1<d> interfaceC22204y1 = this.f160002i0;
        n<Object>[] nVarArr = f160000k0;
        n<Object> nVar = nVarArr[0];
        C35968w3 c35968w3 = this.f160001h0;
        C22082i3 c22082i3 = (C22082i3) interfaceC22204y1;
        c22082i3.setValue(new d(((GigSlotItemsOpenParams) c35968w3.getValue(this, nVar)).f160004b, ((GigSlotItemsOpenParams) c35968w3.getValue(this, nVarArr[0])).f160005c));
        return dVar;
    }
}
