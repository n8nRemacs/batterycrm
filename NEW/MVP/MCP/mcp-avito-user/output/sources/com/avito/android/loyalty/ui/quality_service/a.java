package com.avito.android.loyalty.ui.quality_service;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AlertBottomSheet.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/a;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f183790J = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f183791E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final dX.g f183792F;

    /* renamed from: G, reason: collision with root package name */
    public TextView f183793G;

    /* renamed from: H, reason: collision with root package name */
    public TextView f183794H;

    /* renamed from: I, reason: collision with root package name */
    public Button f183795I;

    /* compiled from: AlertBottomSheet.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.loyalty.ui.quality_service.a$a, reason: collision with other inner class name */
    public static final class C5392a extends N implements Y41.l<View, G0> {
        public C5392a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            View viewFindViewById = view2.findViewById(R.id.alert_title);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            a aVar = a.this;
            aVar.f183793G = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.alert_description);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            aVar.f183794H = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.alert_button);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            aVar.f183795I = (Button) viewFindViewById3;
            TextView textView = aVar.f183793G;
            if (textView == null) {
                textView = null;
            }
            dX.g gVar = aVar.f183792F;
            textView.setText(gVar.getTitle());
            TextView textView2 = aVar.f183794H;
            if (textView2 == null) {
                textView2 = null;
            }
            com.avito.android.util.text.j.a(textView2, gVar.getDescription(), null);
            dX.f action = gVar.getAction();
            if (action == null) {
                Button button = aVar.f183795I;
                D6.w(button != null ? button : null);
            } else {
                String title = action.getTitle();
                if (title == null) {
                    Button button2 = aVar.f183795I;
                    D6.w(button2 != null ? button2 : null);
                } else {
                    Button button3 = aVar.f183795I;
                    if (button3 == null) {
                        button3 = null;
                    }
                    D6.H(button3);
                    Button button4 = aVar.f183795I;
                    if (button4 == null) {
                        button4 = null;
                    }
                    button4.setText(title);
                    Button button5 = aVar.f183795I;
                    (button5 != null ? button5 : null).setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.h(9, action, aVar));
                }
            }
            return G0.f406611a;
        }
    }

    public a(@Y61.k androidx.appcompat.app.m mVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k dX.g gVar) {
        super(mVar, 0, 2, null);
        this.f183791E = aVar;
        this.f183792F = gVar;
        C(R.layout.bottom_sheet_alert, new C5392a());
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
    }
}
