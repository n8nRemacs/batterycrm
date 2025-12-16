package com.avito.android.sx_address.address_video_verification.view;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SxAddressVideoVerificationFileView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/view/c;", "Lcom/avito/android/sx_address/address_video_verification/view/a;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f292723a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Button f292724b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f292725c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f292726d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f292727e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f292728f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ProgressBarRe23 f292729g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f292730h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f292731i;

    public c(@Y61.k View view) {
        this.f292723a = view;
        View viewFindViewById = view.findViewById(R.id.sx_address_video_verification_upload_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById;
        this.f292724b = button;
        View viewFindViewById2 = view.findViewById(R.id.sx_address_video_verification_file);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f292725c = (ConstraintLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.sx_address_video_verification_file_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f292726d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.sx_address_video_verification_file_subtitle);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f292727e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.sx_address_video_verification_file_percent);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f292728f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.sx_address_video_verification_file_progress_bar);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23");
        }
        this.f292729g = (ProgressBarRe23) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.sx_address_video_verification_file_delete_icon);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById7;
        this.f292730h = textView;
        View viewFindViewById8 = view.findViewById(R.id.sx_address_video_verification_file_icon);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView2 = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.sx_address_video_verification_error);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f292731i = (TextView) viewFindViewById9;
        String text = button.getText();
        button.setState(new UU.a(text == null ? "" : text, null, false, false, false, null, C35835l0.h(R.attr.ic_upload20, view.getContext()), null, null, false, 958, null));
        FV.a.f4720a.getClass();
        FV.a.c(textView, R.attr.textIconDelete);
        FV.a.c(textView2, R.attr.textIconFile);
    }
}
