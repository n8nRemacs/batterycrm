package com.avito.android.evidence_request.details;

import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: EvidenceDetailsViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class o<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public static final o<T> f148540b = new o<>();

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        V2 v22 = V2.f318762a;
        String message = th2.getMessage();
        if (message == null) {
            message = "";
        }
        v22.a("error in loading constraints", message, th2);
    }
}
