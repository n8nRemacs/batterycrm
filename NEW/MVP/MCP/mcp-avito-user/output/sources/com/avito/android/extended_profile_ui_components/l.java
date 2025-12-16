package com.avito.android.extended_profile_ui_components;

import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import arrow.core.AbstractC23662a;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.C28493o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.K5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ErrorAndProgressViewRedesign.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/l;", "", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f153353a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N f153354b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f153355c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f153356d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f153357e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f153358f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f153359g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Button f153360h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final View f153361i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ImageView f153362j;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@Y61.k Y41.a aVar, @Y61.k View view) {
        this.f153353a = view;
        this.f153354b = (N) aVar;
        View viewFindViewById = view.findViewById(R.id.info_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f153355c = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.error_and_progress_status_content);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f153356d = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.info_message);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f153357e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.info_hint);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f153358f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.error_id_text);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f153359g = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.info_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById6;
        this.f153360h = button;
        View viewFindViewById7 = view.findViewById(R.id.progress_container);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f153361i = viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.error_image);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f153362j = (ImageView) viewFindViewById8;
        button.setOnClickListener(new k(this, 1));
    }

    public final void a() {
        D6.w(this.f153361i);
        D6.w(this.f153355c);
    }

    public final void b(@Y61.k String str, @Y61.l AttributedText attributedText, @Y61.l Drawable drawable, @Y61.l String str2, @Y61.l Y41.a<G0> aVar) {
        D6.w(this.f153361i);
        D6.H(this.f153355c);
        ImageView imageView = this.f153362j;
        imageView.setImageDrawable(drawable);
        D6.G(imageView, drawable != null);
        I5.a(this.f153357e, str, false);
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f153358f;
        textView.setMovementMethod(linkMovementMethod);
        com.avito.android.util.text.j.a(textView, attributedText, null);
        Button button = this.f153360h;
        com.avito.android.lib.design.button.b.a(button, str2, false);
        button.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(17, aVar));
        D6.w(this.f153359g);
    }

    public final void c(@Y61.l Throwable th2, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        String string;
        D6.w(this.f153361i);
        D6.H(this.f153355c);
        k kVar = new k(this, 0);
        Button button = this.f153360h;
        button.setOnClickListener(kVar);
        View view = this.f153353a;
        com.avito.android.lib.design.button.b.a(button, view.getResources().getString(R.string.error_and_progress_retry_button), false);
        C28493o c28493oO = screenPerformanceTracker.o(th2 != null ? new AbstractC23662a.b(th2) : null);
        boolean zE2 = K5.e(th2);
        ImageView imageView = this.f153362j;
        TextView textView = this.f153358f;
        TextView textView2 = this.f153357e;
        TextView textView3 = this.f153359g;
        if (zE2) {
            string = view.getContext().getString(R.string.error_and_progress_connection_error_title);
            I5.a(textView2, string, false);
            I5.a(textView, view.getContext().getString(R.string.error_and_progress_connection_error_subtitle), false);
            imageView.setImageResource(R.drawable.ic_connection_error);
            D6.w(textView3);
        } else {
            imageView.setImageResource(R.drawable.ic_error_with_id);
            String string2 = view.getContext().getString(R.string.error_and_progress_error_with_id_title);
            I5.a(textView2, string2, false);
            I5.a(textView, view.getContext().getString(R.string.error_and_progress_error_with_id_subtitle), false);
            I5.a(textView3, view.getResources().getString(R.string.error_and_progress_error_id, C42745f0.O(C42756l.B(new String[]{c28493oO.f90898b, c28493oO.f90897a}), ", ", null, null, null, 62)), false);
            D6.H(textView3);
            string = string2;
        }
        screenPerformanceTracker.F(string, th2 != null ? new AbstractC23662a.b(th2) : null, true);
    }

    public final void d() {
        D6.H(this.f153361i);
        D6.w(this.f153355c);
    }
}
