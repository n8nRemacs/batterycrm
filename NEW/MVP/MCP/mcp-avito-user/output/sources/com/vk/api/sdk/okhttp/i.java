package com.vk.api.sdk.okhttp;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.text.C43059p;
import kotlin.text.RegexOption;

/* compiled from: LoggingInterceptor.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/text/p;", "<anonymous>", "()Lkotlin/text/p;"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class i extends N implements Y41.a<C43059p> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f366651l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c cVar) {
        super(0);
        this.f366651l = cVar;
    }

    @Override // Y41.a
    public final C43059p invoke() {
        return new C43059p(AK.c.s(new StringBuilder("\"("), C42745f0.O(this.f366651l.f366639c, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, null, 62), ")\":\"[a-z0-9]+\""), RegexOption.f410582c);
    }
}
