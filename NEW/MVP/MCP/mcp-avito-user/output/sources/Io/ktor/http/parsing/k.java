package io.ktor.http.parsing;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ParserDsl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/http/parsing/k;", "Lio/ktor/http/parsing/e;", "Lio/ktor/http/parsing/c;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class k extends e implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f400105a;

    public k(@Y61.k List<? extends e> list) {
        super(null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof k) {
                C42745f0.h(((c) obj).b(), arrayList);
            } else {
                arrayList.add(obj);
            }
        }
        this.f400105a = arrayList;
    }

    @Override // io.ktor.http.parsing.c
    @Y61.k
    public final List<e> b() {
        return this.f400105a;
    }
}
