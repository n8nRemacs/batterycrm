package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.error.Status;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: DefaultErrorsMapping.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/u;", "", "<init>", "()V", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.parse.adapter.u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C34377u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C34377u f254314a = new C34377u();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Object f254315b;

    static {
        Status.c cVar = Status.f253396c;
        f254315b = P0.g(new kotlin.Q("incorrect-data", ApiError.IncorrectData.class), new kotlin.Q("error-dialog", ApiError.ErrorDialog.class), new kotlin.Q("unauthenticated", ApiError.Unauthorized.class), new kotlin.Q("unauthorized", ApiError.Unauthorized.class), new kotlin.Q("forbidden", ApiError.Forbidden.class), new kotlin.Q("failure", ApiError.Failure.class), new kotlin.Q("bad-request", ApiError.BadRequest.class), new kotlin.Q("internal-error", ApiError.InternalError.class), new kotlin.Q("not-found", ApiError.NotFound.class), new kotlin.Q("action", ApiError.ErrorAction.class), new kotlin.Q("too-many-requests", ApiError.TooManyRequests.class));
    }
}
