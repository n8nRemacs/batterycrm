package com.avito.android.blueprints.auto_early_access;

import Y61.k;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AutoEarlyAccessView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/auto_early_access/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/blueprints/auto_early_access/g;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f105824b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Context f105825c;

    /* compiled from: AutoEarlyAccessView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/blueprints/auto_early_access/h$a", "Landroid/text/style/ClickableSpan;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ClickableSpan {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f105826b;

        public a(Y41.a<G0> aVar) {
            this.f105826b = aVar;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(@k View view) {
            this.f105826b.invoke();
        }
    }

    public h(@k View view) {
        super(view);
        this.f105824b = (TextView) view.findViewById(R.id.select_text_view);
        this.f105825c = view.getContext();
    }

    @Override // com.avito.android.blueprints.auto_early_access.g
    public final void r00(@k Y41.a aVar, @k String str, @k String str2) {
        a aVar2 = new a(aVar);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.concat(str2));
        int I12 = C43066x.I(spannableStringBuilder, str2, 0, false, 6);
        int length = str2.length() + I12;
        Object[] objArr = {aVar2, new UnderlineSpan(), new ForegroundColorSpan(C35835l0.d(R.attr.gray54, this.f105825c))};
        for (int i12 = 0; i12 < 3; i12++) {
            spannableStringBuilder.setSpan(objArr[i12], I12, length, 33);
        }
        TextView textView = this.f105824b;
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
