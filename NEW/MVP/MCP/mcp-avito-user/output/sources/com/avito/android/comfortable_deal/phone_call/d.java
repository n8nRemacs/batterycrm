package com.avito.android.comfortable_deal.phone_call;

import Y41.l;
import Y61.k;
import Zp.InterfaceC19583a;
import Zp.d;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PhoneCallDialogView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/phone_call/d;", "Lcom/avito/android/comfortable_deal/phone_call/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<InterfaceC19583a, G0> f122446a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public View f122447b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public View f122448c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC19583a, G0> lVar) {
        this.f122446a = lVar;
    }

    @Override // com.avito.android.comfortable_deal.phone_call.b
    public final void I() {
        this.f122447b = null;
        this.f122448c = null;
    }

    @Override // com.avito.android.comfortable_deal.phone_call.b
    public final void a(@k View view) {
        this.f122447b = view;
    }

    @Override // com.avito.android.comfortable_deal.phone_call.b
    public final void b(@k View view) {
        this.f122448c = view;
        View viewFindViewById = view.findViewById(R.id.success_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        final int i12 = 0;
        ((Button) viewFindViewById).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.comfortable_deal.phone_call.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f122445c;

            {
                this.f122445c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f122445c.f122446a.invoke(InterfaceC19583a.C1464a.f20492a);
                        break;
                    default:
                        this.f122445c.f122446a.invoke(InterfaceC19583a.b.f20493a);
                        break;
                }
            }
        });
        View view2 = this.f122448c;
        if (view2 != null) {
            View viewFindViewById2 = view2.findViewById(R.id.refresh_button);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            final int i13 = 1;
            ((Button) viewFindViewById2).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.comfortable_deal.phone_call.c

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f122445c;

                {
                    this.f122445c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    switch (i13) {
                        case 0:
                            this.f122445c.f122446a.invoke(InterfaceC19583a.C1464a.f20492a);
                            break;
                        default:
                            this.f122445c.f122446a.invoke(InterfaceC19583a.b.f20493a);
                            break;
                    }
                }
            });
        }
    }

    @Override // com.avito.android.comfortable_deal.phone_call.b
    public final void c(@k Zp.d dVar) {
        if (dVar instanceof d.a) {
            d.a aVar = (d.a) dVar;
            View view = this.f122447b;
            if (view != null) {
                View viewFindViewById = view.findViewById(R.id.phone_content);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                D6.H((ViewGroup) viewFindViewById);
                View viewFindViewById2 = view.findViewById(R.id.phone_error);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                D6.w((ViewGroup) viewFindViewById2);
                View viewFindViewById3 = view.findViewById(R.id.phone_placeholders);
                if (viewFindViewById3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                D6.w((ViewGroup) viewFindViewById3);
                View viewFindViewById4 = view.findViewById(R.id.phone);
                if (viewFindViewById4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                ((TextView) viewFindViewById4).setText(aVar.f20503a);
                View viewFindViewById5 = view.findViewById(R.id.temporary_number_container);
                if (viewFindViewById5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                D6.G((ViewGroup) viewFindViewById5, aVar.f20504b);
            }
            View view2 = this.f122448c;
            if (view2 != null) {
                View viewFindViewById6 = view2.findViewById(R.id.success_button);
                if (viewFindViewById6 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
                }
                D6.H((Button) viewFindViewById6);
                View viewFindViewById7 = view2.findViewById(R.id.refresh_button);
                if (viewFindViewById7 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
                }
                D6.w((Button) viewFindViewById7);
                return;
            }
            return;
        }
        if (dVar.equals(d.b.f20505a)) {
            View view3 = this.f122447b;
            if (view3 != null) {
                View viewFindViewById8 = view3.findViewById(R.id.phone_content);
                if (viewFindViewById8 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                D6.w((ViewGroup) viewFindViewById8);
                View viewFindViewById9 = view3.findViewById(R.id.phone_error);
                if (viewFindViewById9 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                D6.H((ViewGroup) viewFindViewById9);
                View viewFindViewById10 = view3.findViewById(R.id.phone_placeholders);
                if (viewFindViewById10 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                D6.w((ViewGroup) viewFindViewById10);
            }
            View view4 = this.f122448c;
            if (view4 != null) {
                View viewFindViewById11 = view4.findViewById(R.id.success_button);
                if (viewFindViewById11 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
                }
                D6.w((Button) viewFindViewById11);
                View viewFindViewById12 = view4.findViewById(R.id.refresh_button);
                if (viewFindViewById12 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
                }
                D6.H((Button) viewFindViewById12);
                return;
            }
            return;
        }
        if (dVar.equals(d.c.f20506a)) {
            View view5 = this.f122447b;
            if (view5 != null) {
                View viewFindViewById13 = view5.findViewById(R.id.phone_content);
                if (viewFindViewById13 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                D6.w((ViewGroup) viewFindViewById13);
                View viewFindViewById14 = view5.findViewById(R.id.phone_error);
                if (viewFindViewById14 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                D6.w((ViewGroup) viewFindViewById14);
                View viewFindViewById15 = view5.findViewById(R.id.phone_placeholders);
                if (viewFindViewById15 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                D6.H((ViewGroup) viewFindViewById15);
            }
            View view6 = this.f122448c;
            if (view6 != null) {
                View viewFindViewById16 = view6.findViewById(R.id.success_button);
                if (viewFindViewById16 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
                }
                D6.w((Button) viewFindViewById16);
                View viewFindViewById17 = view6.findViewById(R.id.refresh_button);
                if (viewFindViewById17 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
                }
                D6.w((Button) viewFindViewById17);
            }
        }
    }
}
