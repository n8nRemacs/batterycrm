package com.avito.android.advert.item.job_cv_info;

import Y41.p;
import Y61.k;
import Y61.l;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.accordion.Accordion;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.R0;
import com.avito.android.util.p6;
import com.avito.android.util.y6;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: AdvertCvInfoView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/job_cv_info/j;", "Lcom/avito/android/advert/item/job_cv_info/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f77211b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f77212c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Accordion f77213d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C43238h f77214e;

    /* compiled from: AdvertCvInfoView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.job_cv_info.AdvertCvInfoViewImpl$setContent$vacancyView$1$1", f = "AdvertCvInfoView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<DeepLink, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f77215q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = j.this.new a(continuation);
            aVar.f77215q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(DeepLink deepLink, Continuation<? super G0> continuation) {
            return ((a) create(deepLink, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            b.a.a(j.this.f77212c, (DeepLink) this.f77215q, null, null, 6);
            return G0.f406611a;
        }
    }

    public j(@k View view, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k R0 r02) {
        super(view);
        this.f77211b = view;
        this.f77212c = aVar;
        View viewFindViewById = view.findViewById(R.id.job_cv_info);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.accordion.Accordion");
        }
        this.f77213d = (Accordion) viewFindViewById;
        this.f77214e = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
    }

    @Override // com.avito.android.advert.item.job_cv_info.i
    public final void h50(@l AttributedText attributedText, @k String str, @k String str2, @k String str3) {
        View view = this.f77211b;
        TextView textView = new TextView(view.getContext());
        textView.setText(str2);
        TextView textView2 = new TextView(view.getContext());
        textView2.setText(str3);
        TextView textView3 = null;
        if (attributedText != null) {
            C43175k.K(new C43197r1(new a(null), attributedText.linkClicks()), this.f77214e);
            TextView textView4 = new TextView(view.getContext());
            com.avito.android.util.text.j.c(textView4, attributedText, null);
            textView3 = textView4;
        }
        LinearLayout linearLayout = new LinearLayout(view.getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(textView);
        View view2 = new View(view.getContext());
        view2.setLayoutParams(new ViewGroup.LayoutParams(-2, y6.b(12)));
        linearLayout.addView(view2);
        linearLayout.addView(textView2);
        if (textView3 != null) {
            linearLayout.addView(textView3);
        }
        p6 p6Var = new p6(linearLayout);
        while (p6Var.hasNext()) {
            View view3 = (View) p6Var.next();
            if (view3 instanceof TextView) {
                TextView textView5 = (TextView) view3;
                textView5.setMaxLines(2);
                textView5.setEllipsize(TextUtils.TruncateAt.END);
                textView5.setTextAppearance(C35835l0.j(R.attr.textM20, linearLayout.getContext()));
            }
        }
        this.f77213d.setState(new QU.d(str, null, true, false, false, linearLayout, null, null, false, null, 986, null));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        U.b(this.f77214e, null);
    }
}
