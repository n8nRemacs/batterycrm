package com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.header;

import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.header.FeesMethodsV2HeaderItem;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: FeesMethodsV2HeaderItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/header/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/header/g;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f158402b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f158403c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f158404d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f158405e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ProgressBarRe23 f158406f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f158407g;

    /* compiled from: FeesMethodsV2HeaderItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f158408a;

        static {
            int[] iArr = new int[FeesMethodsV2HeaderItem.State.values().length];
            try {
                FeesMethodsV2HeaderItem.State state = FeesMethodsV2HeaderItem.State.f158390b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FeesMethodsV2HeaderItem.State state2 = FeesMethodsV2HeaderItem.State.f158390b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f158408a = iArr;
        }
    }

    public h(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f158402b = aVar;
        View viewFindViewById = view.findViewById(R.id.fees_methods_v2_header_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f158403c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.fees_methods_v2_header_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f158404d = textView;
        View viewFindViewById3 = view.findViewById(R.id.fees_methods_v2_header_bar_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f158405e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.fees_methods_v2_header_bar_progress);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23");
        }
        this.f158406f = (ProgressBarRe23) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.fees_methods_v2_header_bar_description);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f158407g = (TextView) viewFindViewById5;
    }

    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.header.g
    public final void W70(@l String str, @l FeesMethodsV2HeaderItem.State state) {
        TextView textView = this.f158407g;
        I5.a(textView, str, false);
        textView.setTextColor(C35835l0.d(a.f158408a[state.ordinal()] == 2 ? R.attr.orange700 : R.attr.black, this.itemView.getContext()));
    }

    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.header.g
    public final void e(@k AttributedText attributedText) {
        j.c(this.f158403c, attributedText, this.f158402b);
    }

    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.header.g
    public final void g(@l AttributedText attributedText) {
        j.a(this.f158404d, attributedText, this.f158402b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.header.g
    public final void j20(@l Float f12, @l FeesMethodsV2HeaderItem.State state) {
        ProgressBarRe23 progressBarRe23 = this.f158406f;
        if (f12 == null) {
            D6.w(progressBarRe23);
            return;
        }
        progressBarRe23.setProgress(f12.floatValue());
        Q q12 = a.f158408a[state.ordinal()] == 1 ? new Q(Integer.valueOf(R.attr.green700), Integer.valueOf(R.attr.green200)) : new Q(Integer.valueOf(R.attr.warmGray16), Integer.valueOf(R.attr.warmGray16));
        int iIntValue = ((Number) q12.f406619b).intValue();
        int iIntValue2 = ((Number) q12.f406620c).intValue();
        progressBarRe23.setProgressColor(C35835l0.d(iIntValue, this.itemView.getContext()));
        progressBarRe23.setTrackColor(C35835l0.d(iIntValue2, this.itemView.getContext()));
        D6.H(progressBarRe23);
    }

    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.header.g
    public final void ud(@l String str) {
        I5.a(this.f158405e, str, false);
    }
}
