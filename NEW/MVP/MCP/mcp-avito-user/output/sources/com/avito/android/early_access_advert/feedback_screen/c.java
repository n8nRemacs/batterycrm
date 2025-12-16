package com.avito.android.early_access_advert.feedback_screen;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EarlyAccessAdvertFeedbackViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access_advert/feedback_screen/c;", "", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final NestedScrollView f145644a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f145645b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f145646c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f145647d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Input f145648e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Button f145649f;

    public c(@k View view) {
        View viewFindViewById = view.findViewById(R.id.content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.core.widget.NestedScrollView");
        }
        this.f145644a = (NestedScrollView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f145645b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f145646c = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.input_header);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f145647d = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.input);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f145648e = (Input) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.accept);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f145649f = (Button) viewFindViewById6;
    }
}
