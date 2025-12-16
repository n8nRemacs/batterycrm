package com.avito.android.remote;

import com.avito.android.remote.model.StrBookingPromoCodeApplyResponse;
import com.avito.android.util.C35866p0;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: ShortTermRentJsonModule_ProvideCustomTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/h1;", "Ldagger/internal/h;", "", "Lcom/avito/android/util/p0;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class h1 implements dagger.internal.h<Set<C35866p0>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final h1 f253479a = new h1();

    @Override // javax.inject.Provider
    public final Object get() {
        g1.f253478a.getClass();
        return kotlin.collections.b1.g(new C35866p0(StrBookingPromoCodeApplyResponse.class, kotlin.collections.P0.g(new kotlin.Q("ok", StrBookingPromoCodeApplyResponse.Ok.class), new kotlin.Q("validation-error", StrBookingPromoCodeApplyResponse.ValidationError.class))));
    }
}
