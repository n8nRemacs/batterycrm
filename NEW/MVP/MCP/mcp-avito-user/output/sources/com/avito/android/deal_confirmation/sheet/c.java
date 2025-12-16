package com.avito.android.deal_confirmation.sheet;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deal_confirmation.sheet.DealConfirmationSheetActivity;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.DealConfirmationSheet;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DealConfirmationBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deal_confirmation/sheet/c;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "a", "b", "_avito_deal-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f132783L = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final DealConfirmationSheet f132784E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Boolean, G0> f132785F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f132786G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public DealConfirmationSheetActivity f132787H;

    /* renamed from: I, reason: collision with root package name */
    public final int f132788I;

    /* renamed from: J, reason: collision with root package name */
    public final int f132789J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final ArrayList f132790K;

    /* compiled from: DealConfirmationBottomSheet.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deal_confirmation/sheet/c$a;", "", "_avito_deal-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final DealConfirmationSheet.Button f132791a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public DealConfirmationSheet.Button f132792b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f132793c;

        /* compiled from: DealConfirmationBottomSheet.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deal_confirmation.sheet.c$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C3979a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f132794a;

            static {
                int[] iArr = new int[DealConfirmationSheet.Button.Type.values().length];
                try {
                    iArr[DealConfirmationSheet.Button.Type.Secondary.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f132794a = iArr;
            }
        }

        public a() {
            throw null;
        }

        public a(c cVar, DealConfirmationSheet.Button button, DealConfirmationSheet.Button button2, int i12, C42822w c42822w) {
            button = (i12 & 1) != 0 ? null : button;
            button2 = (i12 & 2) != 0 ? null : button2;
            this.f132793c = cVar;
            this.f132791a = button;
            this.f132792b = button2;
        }

        public final Button a(DealConfirmationSheet.Button button, Context context, Y41.l lVar) {
            DealConfirmationSheet.Button.Type type = button.getType();
            Button button2 = new Button(context, null, (type == null ? -1 : C3979a.f132794a[type.ordinal()]) == 1 ? R.attr.buttonSecondaryLarge : R.attr.buttonPrimaryLarge, 0, 8, null);
            button2.setText(button.getTitle());
            button2.setOnClickListener(new com.avito.android.crm_candidates.view.dialogs.f(lVar, button));
            this.f132793c.f132790K.add(button2);
            return button2;
        }
    }

    /* compiled from: DealConfirmationBottomSheet.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deal_confirmation/sheet/c$b;", "", "_avito_deal-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
    }

    public c(@Y61.k DealConfirmationSheetActivity dealConfirmationSheetActivity, @Y61.k DealConfirmationSheet dealConfirmationSheet, @Y61.k Y41.l lVar, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        super(dealConfirmationSheetActivity, R.style.DealConfirmationDialog);
        this.f132784E = dealConfirmationSheet;
        this.f132785F = lVar;
        this.f132788I = dealConfirmationSheetActivity.getResources().getDimensionPixelSize(R.dimen.dc_button_vertical_margin);
        this.f132789J = dealConfirmationSheetActivity.getResources().getDimensionPixelSize(R.dimen.dc_button_horizontal_margin) / 2;
        this.f132790K = new ArrayList();
        screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
        C(R.layout.deal_confirmation_bottom_sheet, new com.avito.android.deal_confirmation.sheet.b(1, this, c.class, "setupContentView", "setupContentView(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.j.c(this, dealConfirmationSheet.getTitle(), true, 0, 0, 0, 120);
        y(R.drawable.ic_close_24_bottom_sheet);
        setCancelable(true);
        T();
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        setCanceledOnTouchOutside(true);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.avito.android.deal_confirmation.sheet.a
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                c cVar = this.f132782b;
                cVar.f132787H = null;
                ((DealConfirmationSheetActivity.b) cVar.f132785F).invoke(Boolean.valueOf(cVar.f132786G));
            }
        });
        ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, null, null, 7);
    }

    public final void V(boolean z12) {
        ArrayList arrayList = this.f132790K;
        if (z12) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                D6.k((Button) it.next());
            }
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                D6.h((Button) it2.next());
            }
        }
    }

    @Override // com.avito.android.lib.design.bottom_sheet.d, androidx.appcompat.app.A, androidx.view.r, android.app.Dialog
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f132786G = bundle.getBoolean("key.force_close");
        }
    }

    @Override // androidx.view.r, android.app.Dialog
    @Y61.k
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.putBoolean("key.force_close", this.f132786G);
        return bundleOnSaveInstanceState;
    }
}
