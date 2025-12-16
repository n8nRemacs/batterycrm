package com.avito.android.beduin.common.analytics;

import Y41.q;
import com.avito.android.analytics.statsd.y;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinPerformanceTrackerImpl.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "type", "", "duration", "", "withPayload", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;JZ)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements q<String, Long, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f100596l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(3);
        this.f100596l = cVar;
    }

    @Override // Y41.q
    public final G0 invoke(String str, Long l12, Boolean bool) {
        String str2 = str;
        long jLongValue = l12.longValue();
        String str3 = bool.booleanValue() ? "item-payload-binding" : "item-binding";
        StringBuilder sb2 = new StringBuilder();
        c cVar = this.f100596l;
        sb2.append(cVar.f100600d);
        sb2.append('.');
        sb2.append(str3);
        sb2.append('.');
        sb2.append(str2);
        cVar.f100597a.c(new y.c(sb2.toString(), Long.valueOf(jLongValue), null));
        return G0.f406611a;
    }
}
