package com.avito.android.autoteka.items.reportGenerationResponse;

import Dj0.C13407a;
import Y41.l;
import Y61.k;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C1;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ReportGenerationResponseView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/items/reportGenerationResponse/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/autoteka/items/reportGenerationResponse/h;", "a", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f96999f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f97000b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f97001c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f97002d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f97003e;

    /* compiled from: ReportGenerationResponseView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/autoteka/items/reportGenerationResponse/i$a;", "", "<init>", "()V", "", "LINE_ANIMATION_DURATION", "J", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ReportGenerationResponseView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<DeepLink, G0> f97004b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super DeepLink, G0> lVar) {
            this.f97004b = lVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f97004b.invoke((DeepLink) obj);
        }
    }

    static {
        new a(null);
    }

    public i(@k View view) {
        super(view);
        this.f97000b = this.itemView.findViewById(R.id.autoteka_car_animate_line);
        this.f97001c = (TextView) this.itemView.findViewById(R.id.autoteka_report_generation_response_title);
        this.f97002d = (TextView) this.itemView.findViewById(R.id.autoteka_report_generation_response_description);
        this.f97003e = (Button) this.itemView.findViewById(R.id.autoteka_report_generation_response_ok);
    }

    @Override // com.avito.android.autoteka.items.reportGenerationResponse.h
    public final void b(@Y61.l String str) {
        this.f97001c.setText(str);
    }

    @Override // com.avito.android.autoteka.items.reportGenerationResponse.h
    public final void l7(@k l lVar, @Y61.l AttributedText attributedText) {
        int i12 = attributedText != null ? 0 : 8;
        TextView textView = this.f97002d;
        textView.setVisibility(i12);
        if (attributedText != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            j.c(textView, attributedText, null);
            attributedText.linkClicksV3().t0(new b(lVar));
        }
    }

    @Override // com.avito.android.autoteka.items.reportGenerationResponse.h
    public final void lk(@Y61.l C13407a c13407a, @k Y41.a<G0> aVar) {
        int i12 = c13407a != null ? 0 : 8;
        Button button = this.f97003e;
        button.setVisibility(i12);
        if (c13407a != null) {
            button.setText(c13407a.getText());
            button.setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(13, aVar));
        }
    }

    @Override // com.avito.android.autoteka.items.reportGenerationResponse.h
    public final void w6() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.1f, 2, 0.9f);
        translateAnimation.setDuration(2000L);
        C1.f318564a.getClass();
        translateAnimation.setRepeatCount(C1.a() ? -1 : 0);
        translateAnimation.setRepeatMode(2);
        this.f97000b.startAnimation(translateAnimation);
    }
}
