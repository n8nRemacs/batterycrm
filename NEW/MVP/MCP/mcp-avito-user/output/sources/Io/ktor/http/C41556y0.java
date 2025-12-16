package io.ktor.http;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Parameters.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/http/y0;", "Lio/ktor/http/v0;", "Lio/ktor/util/D0;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.http.y0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41556y0 extends io.ktor.util.D0 implements InterfaceC41550v0 {
    public C41556y0() {
        this(null, 1, null);
    }

    @Override // io.ktor.util.D0
    @Y61.k
    public final String toString() {
        return "Parameters " + b();
    }

    public C41556y0(Map map, int i12, C42822w c42822w) {
        super(true, (i12 & 1) != 0 ? kotlin.collections.P0.c() : map);
    }
}
