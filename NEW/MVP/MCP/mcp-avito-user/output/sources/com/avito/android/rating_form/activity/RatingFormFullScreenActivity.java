package com.avito.android.rating_form.activity;

import Y41.l;
import Y61.k;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.H;
import androidx.preference.q;
import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.rating_form.info.RatingFormInfoFragment;
import com.avito.android.rating_form.mvi.entity.RatingFormState;
import com.avito.android.util.D6;
import com.avito.android.util.P5;
import dh0.InterfaceC39727a;
import java.io.Serializable;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RatingFormFullScreenActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_form/activity/RatingFormFullScreenActivity;", "Lcom/avito/android/rating_form/activity/c;", "<init>", "()V", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RatingFormFullScreenActivity extends c {

    /* renamed from: x, reason: collision with root package name */
    @k
    public static final a f247942x = new a(null);

    /* renamed from: v, reason: collision with root package name */
    public TextView f247943v;

    /* renamed from: w, reason: collision with root package name */
    public ProgressBar f247944w;

    /* compiled from: RatingFormFullScreenActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/activity/RatingFormFullScreenActivity$a;", "", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RatingFormFullScreenActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<ContentPlaceholder, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(ContentPlaceholder contentPlaceholder) {
            contentPlaceholder.setState(new WU.a(Integer.valueOf(R.drawable.placeholders_img_unknown_error), com.avito.android.printable_text.b.c(R.string.rating_form_error_title, new Serializable[0]), null, com.avito.android.printable_text.b.c(R.string.rating_form_error_button_text, new Serializable[0]), new e(RatingFormFullScreenActivity.this, 1)));
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_rating_form;
    }

    @Override // com.avito.android.ui.activity.a
    public final void X1() {
        setTheme(this.f247960s ? R.style.RatingFormSellerRedesignTheme : R.style.RatingFormTheme);
        super.X1();
    }

    @Override // com.avito.android.rating_form.activity.c
    public final void b2(@Y61.l Integer num, @Y61.l Intent intent) {
        super.b2(num, intent);
        finish();
    }

    @Override // com.avito.android.rating_form.activity.c
    @k
    public final String c2() {
        return "fullScreen";
    }

    @Override // com.avito.android.rating_form.activity.c
    public final void e2() {
        C42670a c42670a = this.f247956o;
        if (c42670a == null) {
            c42670a = null;
        }
        c42670a.c(null, new b());
    }

    @Override // com.avito.android.rating_form.activity.c
    public final void f2() {
        Toolbar toolbar = this.f304539d;
        if (toolbar != null) {
            toolbar.setNavigationIcon((Drawable) null);
        }
        Toolbar toolbar2 = this.f304539d;
        if (toolbar2 != null) {
            toolbar2.setNavigationOnClickListener(new e(this, 0));
        }
        this.f247943v = (TextView) findViewById(R.id.toolbar_title);
        this.f247944w = (ProgressBar) findViewById(R.id.toolbar_progress_bar);
        k2();
        getSupportFragmentManager().b(new q(this, 2));
    }

    @Override // com.avito.android.rating_form.activity.c
    /* renamed from: g2 */
    public final boolean getF247949v() {
        return false;
    }

    @Override // com.avito.android.rating_form.activity.c
    public final void h2(@k RatingFormState ratingFormState) {
        TextView textView = this.f247943v;
        if (textView == null) {
            textView = null;
        }
        RatingFormState.RatingFormStepProgress ratingFormStepProgress = ratingFormState.f248755m;
        boolean z12 = ratingFormStepProgress instanceof RatingFormState.RatingFormStepProgress.Title;
        D6.G(textView, z12);
        ProgressBar progressBar = this.f247944w;
        if (progressBar == null) {
            progressBar = null;
        }
        boolean z13 = ratingFormStepProgress instanceof RatingFormState.RatingFormStepProgress.Progress;
        D6.G(progressBar, z13);
        if (z12) {
            TextView textView2 = this.f247943v;
            (textView2 != null ? textView2 : null).setText(((RatingFormState.RatingFormStepProgress.Title) ratingFormStepProgress).f248759b);
        } else if (!z13) {
            L.f(ratingFormStepProgress, RatingFormState.RatingFormStepProgress.Empty.f248757b);
        } else {
            ProgressBar progressBar2 = this.f247944w;
            (progressBar2 != null ? progressBar2 : null).setProgress(((RatingFormState.RatingFormStepProgress.Progress) ratingFormStepProgress).f248758b);
        }
    }

    public final void k2() {
        Toolbar toolbar = this.f304539d;
        if (toolbar != null) {
            d2().accept(new InterfaceC39727a.d(C42745f0.S(getSupportFragmentManager().P()) instanceof RatingFormInfoFragment));
            if (getSupportFragmentManager().L() <= 1 || (C42745f0.S(getSupportFragmentManager().P()) instanceof RatingFormInfoFragment)) {
                P5.d(toolbar);
            } else if (getSupportFragmentManager().L() > 1) {
                P5.b(toolbar);
            } else {
                toolbar.setNavigationIcon((Drawable) null);
            }
            G0 g02 = G0.f406611a;
        }
    }

    @Override // com.avito.android.rating_form.activity.c
    public final void a2(@k H h12) {
    }
}
