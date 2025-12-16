package com.avito.android.onboarding.dialog.view.quiz;

import C40.a;
import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.remote.model.onboarding.AnswersType;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OnboardingQuizView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/dialog/view/quiz/f;", "Lcom/avito/android/onboarding/dialog/view/quiz/d;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f209054a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f209055b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<C40.a, G0> f209056c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f209057d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f209058e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f209059f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f209060g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Chips f209061h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Button f209062i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final SimpleDraweeView f209063j;

    /* compiled from: OnboardingQuizView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f209064a;

        static {
            int[] iArr = new int[AnswersType.values().length];
            try {
                iArr[AnswersType.Select.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnswersType.Multiselect.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f209064a = iArr;
        }
    }

    public f(@k l lVar, @k View view, @k com.avito.android.util.text.a aVar) {
        this.f209054a = view;
        this.f209055b = aVar;
        this.f209056c = lVar;
        ImageView imageView = (ImageView) view.findViewById(R.id.close_button);
        this.f209057d = imageView;
        ImageView imageView2 = (ImageView) view.findViewById(R.id.back_button);
        this.f209058e = imageView2;
        this.f209059f = (TextView) view.findViewById(R.id.page_number);
        this.f209060g = (TextView) view.findViewById(R.id.question);
        this.f209061h = (Chips) view.findViewById(R.id.answers);
        this.f209062i = (Button) view.findViewById(R.id.action_button);
        this.f209063j = (SimpleDraweeView) view.findViewById(R.id.title_image);
        final int i12 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.onboarding.dialog.view.quiz.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f209053c;

            {
                this.f209053c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f209053c.f209056c.invoke(a.g.f1916a);
                        break;
                    default:
                        this.f209053c.f209056c.invoke(a.d.f1912a);
                        break;
                }
            }
        });
        final int i13 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.onboarding.dialog.view.quiz.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f209053c;

            {
                this.f209053c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f209053c.f209056c.invoke(a.g.f1916a);
                        break;
                    default:
                        this.f209053c.f209056c.invoke(a.d.f1912a);
                        break;
                }
            }
        });
    }

    public final void a(boolean z12) {
        D6.G(this.f209057d, z12);
        D6.G(this.f209058e, !z12);
    }
}
