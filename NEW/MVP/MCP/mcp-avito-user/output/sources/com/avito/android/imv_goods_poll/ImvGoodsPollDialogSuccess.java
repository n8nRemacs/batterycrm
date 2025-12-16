package com.avito.android.imv_goods_poll;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35968w3;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import qK0.C47313c;

/* compiled from: ImvGoodsPollDialogSuccess.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/imv_goods_poll/ImvGoodsPollDialogSuccess;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImvGoodsPollDialogSuccess extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public static final a f170603l0;

    /* renamed from: m0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f170604m0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f170605h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final C47313c f170606i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final C47313c f170607j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final C47313c f170608k0;

    /* compiled from: ImvGoodsPollDialogSuccess.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_goods_poll/ImvGoodsPollDialogSuccess$a;", "", "<init>", "()V", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ImvGoodsPollDialogSuccess.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/imv_goods_poll/ImvGoodsPollDialogSuccess$b", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.lib.design.bottom_sheet.d {
        public b(Context context) {
            super(context, 0, 2, null);
            com.avito.android.lib.design.bottom_sheet.j.c(this, null, false, 0, 0, 0, 121);
            T();
            setCanceledOnTouchOutside(true);
            com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        }

        @Override // androidx.view.r, android.app.Dialog
        @SuppressLint({"MissingSuperCall"})
        @InterfaceC42830m
        public final void onBackPressed() {
            a aVar = ImvGoodsPollDialogSuccess.f170603l0;
            ImvGoodsPollDialogSuccess.this.f5();
        }
    }

    static {
        Y y12 = new Y(ImvGoodsPollDialogSuccess.class, "openParams", "getOpenParams()Lcom/avito/android/imv_goods_poll/ImvGoodsPollParams;", 0);
        n0 n0Var = m0.f406844a;
        f170604m0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(ImvGoodsPollDialogSuccess.class, "title", "getTitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ImvGoodsPollDialogSuccess.class, "text", "getText()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ImvGoodsPollDialogSuccess.class, "closeButton", "getCloseButton()Landroid/widget/ImageView;", 0, n0Var)};
        f170603l0 = new a(null);
    }

    public ImvGoodsPollDialogSuccess() {
        super(0, 1, null);
        this.f170605h0 = new C35968w3(this);
        this.f170606i0 = new C47313c(null, 1, null);
        this.f170607j0 = new C47313c(null, 1, null);
        this.f170608k0 = new C47313c(null, 1, null);
    }

    public final void f5() {
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 == null || activityC22955mL1.isFinishing() || activityC22955mL1.isChangingConfigurations()) {
            return;
        }
        activityC22955mL1.finish();
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        return new b(requireContext());
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.dialog_imv_goods_poll_done, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        f5();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.imv_goods_poll_done_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        C47313c c47313c = this.f170606i0;
        kotlin.reflect.n<Object>[] nVarArr = f170604m0;
        kotlin.reflect.n<Object> nVar = nVarArr[1];
        c47313c.b(this, (TextView) viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.imv_goods_poll_done_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        C47313c c47313c2 = this.f170607j0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[2];
        c47313c2.b(this, (TextView) viewFindViewById2);
        View viewFindViewById3 = view.findViewById(R.id.imv_goods_poll_done_close_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        C47313c c47313c3 = this.f170608k0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[3];
        c47313c3.b(this, (ImageView) viewFindViewById3);
        kotlin.reflect.n<Object> nVar4 = nVarArr[1];
        TextView textView = (TextView) c47313c.a();
        kotlin.reflect.n<Object> nVar5 = nVarArr[0];
        C35968w3 c35968w3 = this.f170605h0;
        textView.setText(((ImvGoodsPollParams) c35968w3.getValue(this, nVar5)).f170610b.getSuccessTitle());
        kotlin.reflect.n<Object> nVar6 = nVarArr[2];
        ((TextView) c47313c2.a()).setText(((ImvGoodsPollParams) c35968w3.getValue(this, nVarArr[0])).f170610b.getSuccessDescription());
        kotlin.reflect.n<Object> nVar7 = nVarArr[3];
        ((ImageView) c47313c3.a()).setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 28));
    }
}
