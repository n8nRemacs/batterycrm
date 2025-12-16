package com.avito.android.user_advert.advert.items.machinery_rental_banner;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.R0;
import com.jakewharton.rxbinding4.view.C37722i;
import java.util.concurrent.TimeUnit;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import kotlinx.coroutines.t1;
import sK0.C48063a;

/* compiled from: MachineryRentalBannerView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/machinery_rental_banner/p;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/machinery_rental_banner/o;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class p extends com.avito.konveyor.adapter.b implements o {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f309602b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f309603c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageView f309604d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f309605e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ProgressBarRe23 f309606f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f309607g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Button f309608h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f309609i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f309610j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public N0 f309611k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C43238h f309612l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final androidx.appcompat.view.d f309613m;

    /* compiled from: MachineryRentalBannerView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_advert.advert.items.machinery_rental_banner.MachineryRentalBannerViewHolder$bindActionButton$2", f = "MachineryRentalBannerView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<G0, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f309614q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f309614q = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f309614q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(G0 g02, Continuation<? super G0> continuation) {
            return ((a) create(g02, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            this.f309614q.invoke();
            return G0.f406611a;
        }
    }

    public p(@Y61.k View view, @Y61.k R0 r02) {
        super(view);
        this.f309602b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f309603c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.close_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f309604d = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.progress_bar_counter);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f309605e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.progress_bar);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23");
        }
        this.f309606f = (ProgressBarRe23) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.description);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById5;
        this.f309607g = textView;
        View viewFindViewById6 = view.findViewById(R.id.action_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f309608h = (Button) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.footer);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView2 = (TextView) viewFindViewById7;
        this.f309609i = textView2;
        this.f309612l = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
        this.f309613m = new androidx.appcompat.view.d(this.itemView.getContext(), R.style.Theme_DesignSystem_Re23);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.user_advert.advert.items.machinery_rental_banner.o
    public final void MA(@Y61.k String str, float f12, @Y61.k UniversalColor universalColor, @Y61.k UniversalColor universalColor2) {
        this.f309605e.setText(str);
        ProgressBarRe23 progressBarRe23 = this.f309606f;
        progressBarRe23.setProgress(f12);
        androidx.appcompat.view.d dVar = this.f309613m;
        C48063a c48063a = C48063a.f437606a;
        progressBarRe23.setProgressColor(c48063a.a(dVar, universalColor));
        progressBarRe23.setTrackColor(c48063a.a(dVar, universalColor2));
    }

    @Override // com.avito.android.user_advert.advert.items.machinery_rental_banner.o
    public final void Qe(@Y61.l CharSequence charSequence) {
        I5.a(this.f309609i, charSequence, false);
    }

    @Override // com.avito.android.user_advert.advert.items.machinery_rental_banner.o
    public final void W00(@Y61.k Y41.a aVar, @Y61.k String str, @Y61.l String str2) throws Resources.NotFoundException {
        Button button = this.f309608h;
        com.avito.android.lib.design.button.b.a(button, str, false);
        if (str2 != null) {
            button.setAppearance(C35835l0.j(com.avito.android.lib.util.f.d(str2), this.f309613m));
        }
        this.f309611k = C43175k.K(new C43197r1(new a(aVar, null), y.a(C37722i.a(button).C0(300L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b))), this.f309612l);
    }

    @Override // com.avito.android.user_advert.advert.items.machinery_rental_banner.o
    public final void ck(boolean z12) {
        Button button = this.f309608h;
        button.setClickable(!z12);
        button.setLoading(z12);
    }

    @Override // com.avito.android.user_advert.advert.items.machinery_rental_banner.o
    @Y61.k
    public final Context getContext() {
        return this.f309613m;
    }

    @Override // com.avito.android.user_advert.advert.items.machinery_rental_banner.o
    public final void ha(@Y61.l Y41.a<G0> aVar) {
        boolean z12 = aVar != null;
        ImageView imageView = this.f309604d;
        D6.G(imageView, z12);
        D6.a(aVar, imageView);
    }

    @Override // com.avito.android.user_advert.advert.items.machinery_rental_banner.o
    public final void i70() {
        D6.w(this.f309608h);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f309610j;
        if (aVar != null) {
            ((i) aVar).invoke();
        }
        N0 n02 = this.f309611k;
        if (n02 != null) {
            n02.c(null);
        }
    }

    @Override // com.avito.android.user_advert.advert.items.machinery_rental_banner.o
    public final void r5(@Y61.l CharSequence charSequence) {
        I5.a(this.f309607g, charSequence, false);
    }

    @Override // com.avito.android.user_advert.advert.items.machinery_rental_banner.o
    public final void setTitle(@Y61.k String str) {
        this.f309603c.setText(str);
    }

    @Override // com.avito.android.user_advert.advert.items.machinery_rental_banner.o
    public final void t(@Y61.k Y41.a<G0> aVar) {
        this.f309610j = aVar;
    }

    @Override // com.avito.android.user_advert.advert.items.machinery_rental_banner.o
    public final void tO(boolean z12) {
        D6.G(this.f309605e, z12);
        D6.G(this.f309606f, z12);
    }

    @Override // com.avito.android.user_advert.advert.items.machinery_rental_banner.o
    public final void v(@Y61.k UniversalColor universalColor) {
        View view = this.f309602b;
        if (view.getBackground() instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) view.getBackground().mutate();
            gradientDrawable.setColor(C48063a.f437606a.a(this.f309613m, universalColor));
            view.setBackground(gradientDrawable);
        }
    }
}
