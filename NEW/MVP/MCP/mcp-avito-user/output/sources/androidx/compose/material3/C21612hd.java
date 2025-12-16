package androidx.compose.material3;

import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Tooltip.kt */
@InterfaceC21537e7
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/material3/hd;", "", "Landroidx/compose/ui/graphics/T;", "containerColor", "contentColor", "titleContentColor", "actionContentColor", "<init>", "(JJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.F3
/* renamed from: androidx.compose.material3.hd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21612hd {

    /* renamed from: a, reason: collision with root package name */
    public final long f36501a;

    /* renamed from: b, reason: collision with root package name */
    public final long f36502b;

    /* renamed from: c, reason: collision with root package name */
    public final long f36503c;

    /* renamed from: d, reason: collision with root package name */
    public final long f36504d;

    public C21612hd(long j12, long j13, long j14, long j15, C42822w c42822w) {
        this.f36501a = j12;
        this.f36502b = j13;
        this.f36503c = j14;
        this.f36504d = j15;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21612hd)) {
            return false;
        }
        C21612hd c21612hd = (C21612hd) obj;
        return androidx.compose.ui.graphics.T.d(this.f36501a, c21612hd.f36501a) && androidx.compose.ui.graphics.T.d(this.f36502b, c21612hd.f36502b) && androidx.compose.ui.graphics.T.d(this.f36503c, c21612hd.f36503c) && androidx.compose.ui.graphics.T.d(this.f36504d, c21612hd.f36504d);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f36504d) + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(Long.hashCode(this.f36501a) * 31, 31, this.f36502b), 31, this.f36503c);
    }
}
