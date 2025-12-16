package com.avito.android.ux.feedback.impl;

import com.avito.android.util.V2;
import com.avito.android.ux.feedback.impl.x;
import kotlin.Metadata;

/* compiled from: AvitoUxFeedbackRxDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/avito/android/ux/feedback/impl/x$a;", "apply", "(J)Lcom/avito/android/ux/feedback/impl/x$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class i<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SK0.c f319157b;

    public i(SK0.c cVar) {
        this.f319157b = cVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ((Number) obj).longValue();
        V2.f318762a.c("UXFeedback", "Failed to start: " + this.f319157b.getF10162a(), null);
        return x.a.f319183a;
    }
}
