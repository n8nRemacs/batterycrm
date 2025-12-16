package com.avito.android.mortgage.document_upload;

import com.avito.android.lib.design.progress_bar.ProgressBar;
import e00.C39840a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DocumentUploadScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/design/progress_bar/ProgressBar;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/progress_bar/ProgressBar;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class W extends kotlin.jvm.internal.N implements Y41.l<ProgressBar, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.progress_bar.e f199100l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C39840a f199101m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(com.avito.android.lib.design.progress_bar.e eVar, C39840a c39840a) {
        super(1);
        this.f199100l = eVar;
        this.f199101m = c39840a;
    }

    @Override // Y41.l
    public final G0 invoke(ProgressBar progressBar) {
        ProgressBar progressBar2 = progressBar;
        com.avito.android.lib.design.progress_bar.e eVar = this.f199100l;
        eVar.f180106f.end();
        eVar.f180102b = null;
        C39840a c39840a = this.f199101m;
        if (c39840a.f394248f == null) {
            progressBar2.setVisibility(4);
            progressBar2.setProgress(0.0f);
        } else {
            progressBar2.setVisibility(0);
            float fFloatValue = c39840a.f394248f.floatValue();
            int fillColor = progressBar2.getFillColor();
            int emptyColor = progressBar2.getEmptyColor();
            this.f199100l.b(progressBar2, progressBar2.getProgress(), fFloatValue, progressBar2.getFillColor(), fillColor, progressBar2.getEmptyColor(), emptyColor);
        }
        return G0.f406611a;
    }
}
