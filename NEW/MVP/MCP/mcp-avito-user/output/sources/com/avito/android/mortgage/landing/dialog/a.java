package com.avito.android.mortgage.landing.dialog;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AlreadyHaveApplicationDialog.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/dialog/a;", "LTZ/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends TZ.b {

    /* compiled from: AlreadyHaveApplicationDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.mortgage.landing.dialog.a$a, reason: collision with other inner class name */
    public static final class C5895a extends N implements l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C5895a f199619l = new C5895a();

        public C5895a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(View view) {
            return G0.f406611a;
        }
    }

    /* compiled from: AlreadyHaveApplicationDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f199620l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f199621m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f199622n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a<G0> aVar, a aVar2, Y41.a<G0> aVar3) {
            super(1);
            this.f199620l = aVar;
            this.f199621m = aVar2;
            this.f199622n = aVar3;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            View viewFindViewById = view2.findViewById(R.id.footer_button);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            Button button = (Button) viewFindViewById;
            button.setText(R.string.landing_already_have_application_button);
            final Y41.a<G0> aVar = this.f199620l;
            final a aVar2 = this.f199621m;
            final int i12 = 0;
            button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.mortgage.landing.dialog.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i12) {
                        case 0:
                            aVar.invoke();
                            aVar2.dismiss();
                            break;
                        default:
                            aVar.invoke();
                            aVar2.dismiss();
                            break;
                    }
                }
            });
            View viewFindViewById2 = view2.findViewById(R.id.footer_secondary_button);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            Button button2 = (Button) viewFindViewById2;
            button2.setText(R.string.landing_already_have_application_second_button);
            D6.H(button2);
            final Y41.a<G0> aVar3 = this.f199622n;
            final int i13 = 1;
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.mortgage.landing.dialog.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i13) {
                        case 0:
                            aVar3.invoke();
                            aVar2.dismiss();
                            break;
                        default:
                            aVar3.invoke();
                            aVar2.dismiss();
                            break;
                    }
                }
            });
            return G0.f406611a;
        }
    }

    public a(@k Context context, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2) {
        super(context, null, 2, null);
        setTitle(R.string.landing_already_have_application_header);
        B(R.layout.mortgage_have_application_layout, R.layout.button_footer_layout, C5895a.f199619l, new b(aVar2, this, aVar), false);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }
}
