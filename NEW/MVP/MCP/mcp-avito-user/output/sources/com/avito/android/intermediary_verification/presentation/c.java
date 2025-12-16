package com.avito.android.intermediary_verification.presentation;

import LV.c;
import VU.b;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.intermediary_verification.data.model.IntermediaryVerificationData;
import com.avito.android.intermediary_verification.presentation.mvi.entity.IntermediaryVerificationAction;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.f;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ru.avito.component.toolbar.CollapsingTitleAppBarLayout;

/* compiled from: IntermediaryVerificationView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/intermediary_verification/presentation/c;", "", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<IntermediaryVerificationAction, G0> f173152a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f173153b;

    /* renamed from: c, reason: collision with root package name */
    public final CollapsingTitleAppBarLayout f173154c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f173155d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f173156e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f173157f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f173158g;

    /* renamed from: h, reason: collision with root package name */
    public final Button f173159h;

    /* renamed from: i, reason: collision with root package name */
    public final Button f173160i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f173161j;

    /* compiled from: IntermediaryVerificationView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ IntermediaryVerificationData f173163l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ c f173164m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(IntermediaryVerificationData intermediaryVerificationData, c cVar) {
            super(0);
            this.f173163l = intermediaryVerificationData;
            this.f173164m = cVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink deepLink = this.f173163l.f173094f.f173106c;
            if (deepLink != null) {
                this.f173164m.f173152a.invoke(new IntermediaryVerificationAction.b(deepLink));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: IntermediaryVerificationView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.intermediary_verification.presentation.c$c, reason: collision with other inner class name */
    public static final class C5107c extends N implements Y41.a<G0> {
        public C5107c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            c.this.f173152a.invoke(new IntermediaryVerificationAction.a(IntermediaryVerificationAction.LeaveAction.f173185c));
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k View view, @k l<? super IntermediaryVerificationAction, G0> lVar) {
        this.f173152a = lVar;
        this.f173153b = view.getContext();
        this.f173154c = (CollapsingTitleAppBarLayout) view.findViewById(R.id.app_bar);
        this.f173155d = (TextView) view.findViewById(R.id.title);
        this.f173156e = (TextView) view.findViewById(R.id.description);
        this.f173157f = (TextView) view.findViewById(R.id.benefits_header);
        this.f173158g = (LinearLayout) view.findViewById(R.id.benefits);
        this.f173159h = (Button) view.findViewById(R.id.submit_button);
        this.f173160i = (Button) view.findViewById(R.id.leave_button);
        this.f173161j = (TextView) view.findViewById(R.id.bottom_text);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(@k IntermediaryVerificationData intermediaryVerificationData) {
        Q q12;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f173153b);
        this.f173154c.setClickListener(new a());
        this.f173155d.setText(intermediaryVerificationData.f173090b);
        j.c(this.f173156e, intermediaryVerificationData.f173091c, null);
        I5.a(this.f173157f, intermediaryVerificationData.f173092d, false);
        LinearLayout linearLayout = this.f173158g;
        linearLayout.removeAllViews();
        Object obj = intermediaryVerificationData.f173093e;
        if (obj != null) {
            for (IntermediaryVerificationData.Benefit benefit : (Iterable) obj) {
                View viewInflate = layoutInflaterFrom.inflate(R.layout.verification_benefit_item, (ViewGroup) linearLayout, false);
                com.avito.android.intermediary_verification.presentation.b bVar = new com.avito.android.intermediary_verification.presentation.b(viewInflate);
                bVar.f173149c.setText(benefit.f173098b);
                bVar.f173150d.setText(benefit.f173099c);
                int iOrdinal = benefit.f173100d.ordinal();
                if (iOrdinal == 0) {
                    q12 = new Q(Integer.valueOf(com.avito.android.intermediary_verification.presentation.b.f173143f), Integer.valueOf(com.avito.android.intermediary_verification.presentation.b.f173144g));
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    q12 = new Q(Integer.valueOf(com.avito.android.intermediary_verification.presentation.b.f173145h), Integer.valueOf(com.avito.android.intermediary_verification.presentation.b.f173146i));
                }
                int iIntValue = ((Number) q12.f406619b).intValue();
                int iIntValue2 = ((Number) q12.f406620c).intValue();
                ImageView imageView = bVar.f173151e;
                imageView.setBackgroundResource(iIntValue);
                imageView.setImageDrawable(C35835l0.h(iIntValue2, bVar.f173148b));
                linearLayout.addView(viewInflate);
            }
        }
        IntermediaryVerificationData.Button button = intermediaryVerificationData.f173094f;
        UU.a aVar = new UU.a(button.f173105b, null, button.f173108e, false, false, new b(intermediaryVerificationData, this), null, null, null, false, 986, null);
        Button button2 = this.f173159h;
        button2.setState(aVar);
        b.a aVar2 = VU.b.f17147t;
        Context context = button2.getContext();
        int iD2 = f.d(button.f173107d);
        aVar2.getClass();
        button2.setStyle((VU.b) c.a.a(aVar2, context, iD2));
        IntermediaryVerificationData.Button button3 = intermediaryVerificationData.f173095g;
        UU.a aVar3 = new UU.a(button3.f173105b, null, false, false, false, new C5107c(), null, null, null, false, 990, null);
        Button button4 = this.f173160i;
        button4.setState(aVar3);
        Context context2 = button4.getContext();
        int iD3 = f.d(button3.f173107d);
        aVar2.getClass();
        button4.setStyle((VU.b) c.a.a(aVar2, context2, iD3));
        I5.a(this.f173161j, intermediaryVerificationData.f173096h, false);
    }

    /* compiled from: IntermediaryVerificationView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/intermediary_verification/presentation/c$a", "Lru/avito/component/toolbar/a;", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ru.avito.component.toolbar.a {
        public a() {
        }

        @Override // ru.avito.component.toolbar.a
        public final void R() {
            c.this.f173152a.invoke(new IntermediaryVerificationAction.a(IntermediaryVerificationAction.LeaveAction.f173184b));
        }

        @Override // ru.avito.component.toolbar.a
        public final void u() {
        }
    }
}
