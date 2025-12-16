package com.avito.android.publish.items.file_uploader;

import android.view.View;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;

/* compiled from: FileUploaderItemView.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class k<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f236818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProgressBar f236819c;

    public k(View view, ProgressBar progressBar) {
        this.f236818b = view;
        this.f236819c = progressBar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        Q q12 = (Q) obj;
        String str = (String) q12.f406619b;
        float fFloatValue = ((Number) q12.f406620c).floatValue();
        if (L.f(this.f236818b.getTag(), str)) {
            this.f236819c.setProgress(fFloatValue);
        }
    }
}
