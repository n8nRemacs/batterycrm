package com.avito.android.mortgage.document_upload;

import android.content.Context;
import com.avito.android.R;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;

/* compiled from: DocumentUploadScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/progress_bar/ProgressBar;", "it", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class V extends kotlin.jvm.internal.N implements Y41.l<Context, ProgressBar> {

    /* renamed from: l, reason: collision with root package name */
    public static final V f199099l = new V();

    public V() {
        super(1);
    }

    @Override // Y41.l
    public final ProgressBar invoke(Context context) {
        Context context2 = context;
        ProgressBar progressBar = new ProgressBar(context2, null, 0, 0, 14, null);
        progressBar.setFillColor(C35835l0.d(R.attr.black, context2));
        progressBar.setEmptyColor(C35835l0.d(R.attr.warmGray16, context2));
        return progressBar;
    }
}
