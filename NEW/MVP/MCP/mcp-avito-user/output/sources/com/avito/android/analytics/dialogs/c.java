package com.avito.android.analytics.dialogs;

import Y41.l;
import arrow.core.AbstractC23662a;
import com.avito.android.remote.analytics.C34244a;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ErrorDialogsAnalytics.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/error/ApiError;", "typedError", "Lcom/avito/android/remote/analytics/a;", "invoke", "(Lcom/avito/android/remote/error/ApiError;)Lcom/avito/android/remote/analytics/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements l<ApiError, C34244a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f89887l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(1);
        this.f89887l = dVar;
    }

    @Override // Y41.l
    public final C34244a invoke(ApiError apiError) {
        return this.f89887l.f89888a.b(new AbstractC23662a.c(apiError));
    }
}
