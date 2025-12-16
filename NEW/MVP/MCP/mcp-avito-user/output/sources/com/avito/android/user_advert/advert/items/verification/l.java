package com.avito.android.user_advert.advert.items.verification;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Badge;
import com.avito.android.remote.model.Note;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationBlockView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/verification/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/verification/k;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f310398k = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f310399b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f310400c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f310401d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Button f310402e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final TextView f310403f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final View f310404g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f310405h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f310406i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Button f310407j;

    /* compiled from: VerificationBlockView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<TextView> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            View view = l.this.f310404g;
            if (view != null) {
                return (TextView) view.findViewById(R.id.verification_subtitle);
            }
            return null;
        }
    }

    /* compiled from: VerificationBlockView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<TextView> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            View view = l.this.f310404g;
            if (view != null) {
                return (TextView) view.findViewById(R.id.verification_title);
            }
            return null;
        }
    }

    public l(@Y61.k View view) {
        super(view);
        this.f310399b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f310400c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f310401d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.verification_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f310402e = (Button) viewFindViewById3;
        this.f310403f = (TextView) view.findViewById(R.id.additional_description);
        this.f310404g = view.findViewById(R.id.verification_badge);
        this.f310405h = C42727D.c(new b());
        this.f310406i = C42727D.c(new a());
        this.f310407j = (Button) view.findViewById(R.id.support_button);
    }

    @Override // com.avito.android.user_advert.advert.items.verification.k
    public final void Hj(@Y61.k String str, @Y61.k Y41.a<G0> aVar) {
        Button button = this.f310407j;
        if (button != null) {
            D6.G(button, true);
        }
        if (button != null) {
            button.setText(str);
        }
        if (button != null) {
            button.setOnClickListener(new com.avito.android.user_advert.advert.items.service_booking.i(5, aVar));
        }
    }

    @Override // com.avito.android.user_advert.advert.items.verification.k
    public final void L1() {
        D6.w(this.f310402e);
    }

    @Override // com.avito.android.user_advert.advert.items.verification.k
    public final void LA(@Y61.k String str, @Y61.k Y41.a<G0> aVar) {
        Button button = this.f310402e;
        button.setText(str);
        button.setOnClickListener(new com.avito.android.user_advert.advert.items.service_booking.i(4, aVar));
        D6.G(button, true);
    }

    @Override // com.avito.android.user_advert.advert.items.verification.k
    public final void Op(@Y61.l Note note) {
        TextView textView = this.f310403f;
        if (textView != null) {
            I5.a(textView, note != null ? note.getTitle() : null, false);
        }
    }

    @Override // com.avito.android.user_advert.advert.items.verification.k
    public final void P30() {
        Button button = this.f310407j;
        if (button != null) {
            D6.w(button);
        }
    }

    @Override // com.avito.android.user_advert.advert.items.verification.k
    public final void R1(@Y61.k String str) {
        this.f310400c.setText(str);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Button button = this.f310407j;
        if (button != null) {
            button.setOnClickListener(null);
        }
        this.f310402e.setOnClickListener(null);
    }

    @Override // com.avito.android.user_advert.advert.items.verification.k
    public final void lN(@Y61.l Badge badge) {
        View view = this.f310404g;
        if (badge == null) {
            if (view != null) {
                D6.w(view);
                return;
            }
            return;
        }
        D6.G(view, true);
        TextView textView = (TextView) this.f310405h.getValue();
        if (textView != null) {
            textView.setText(badge.getTitle());
        }
        TextView textView2 = (TextView) this.f310406i.getValue();
        if (textView2 == null) {
            return;
        }
        textView2.setText(badge.getSubtitle());
    }

    @Override // com.avito.android.user_advert.advert.items.verification.k
    public final void r2(@Y61.k String str) {
        this.f310401d.setText(str);
    }

    @Override // com.avito.android.user_advert.advert.items.verification.k
    public final void setVisible(boolean z12) {
        D6.G(this.f310399b, true);
    }
}
