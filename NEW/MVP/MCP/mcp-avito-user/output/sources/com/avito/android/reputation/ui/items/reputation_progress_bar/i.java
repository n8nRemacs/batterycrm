package com.avito.android.reputation.ui.items.reputation_progress_bar;

import android.content.Context;
import android.graphics.Paint;
import androidx.appcompat.widget.AppCompatTextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReputationProgressBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class i extends N implements Y41.a<Paint> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f254966l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(0);
        this.f254966l = context;
    }

    @Override // Y41.a
    public final Paint invoke() {
        Paint paint = new Paint(1);
        Context context = this.f254966l;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setTextAppearance(C35835l0.j(R.attr.textH60, context));
        paint.setTextSize(appCompatTextView.getTextSize());
        paint.setTypeface(appCompatTextView.getTypeface());
        return paint;
    }
}
