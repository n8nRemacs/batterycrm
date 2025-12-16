package com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.limits_info;

import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.limits_info.FeesMethodsV2LimitsInfoItem;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: FeesMethodsV2LimitsInfoItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/limits_info/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/limits_info/f;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f158430b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f158431c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f158432d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ProgressBarRe23 f158433e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f158434f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f158435g;

    /* compiled from: FeesMethodsV2LimitsInfoItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f158436a;

        static {
            int[] iArr = new int[FeesMethodsV2LimitsInfoItem.State.values().length];
            try {
                FeesMethodsV2LimitsInfoItem.State state = FeesMethodsV2LimitsInfoItem.State.f158417b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f158436a = iArr;
        }
    }

    public g(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f158430b = aVar;
        View viewFindViewById = view.findViewById(R.id.fees_methods_v2_limits_info_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f158431c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.fees_methods_v2_limits_info_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f158432d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.fees_methods_v2_limits_info_progress);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23");
        }
        this.f158433e = (ProgressBarRe23) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.fees_methods_v2_limits_info_progress_hint);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f158434f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.fees_methods_v2_limits_info_extra_info);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById5;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f158435g = textView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.limits_info.f
    public final void AX(@l Float f12, @l FeesMethodsV2LimitsInfoItem.State state) {
        ProgressBarRe23 progressBarRe23 = this.f158433e;
        if (f12 == null) {
            D6.w(progressBarRe23);
            return;
        }
        progressBarRe23.setProgress(f12.floatValue());
        Q q12 = a.f158436a[state.ordinal()] == 1 ? new Q(Integer.valueOf(R.attr.green700), Integer.valueOf(R.attr.green200)) : new Q(Integer.valueOf(R.attr.warmGray16), Integer.valueOf(R.attr.warmGray16));
        int iIntValue = ((Number) q12.f406619b).intValue();
        int iIntValue2 = ((Number) q12.f406620c).intValue();
        progressBarRe23.setProgressColor(C35835l0.d(iIntValue, this.itemView.getContext()));
        progressBarRe23.setTrackColor(C35835l0.d(iIntValue2, this.itemView.getContext()));
        D6.H(progressBarRe23);
    }

    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.limits_info.f
    public final void U4(@l AttributedText attributedText) {
        j.a(this.f158435g, attributedText, this.f158430b);
    }

    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.limits_info.f
    public final void e(@k AttributedText attributedText) {
        j.c(this.f158431c, attributedText, this.f158430b);
    }

    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.limits_info.f
    public final void h(@l String str) {
        I5.a(this.f158432d, str, false);
    }

    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.limits_info.f
    public final void mR(@l String str) {
        I5.a(this.f158434f, str, false);
    }
}
