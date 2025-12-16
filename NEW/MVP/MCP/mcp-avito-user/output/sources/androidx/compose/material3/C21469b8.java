package androidx.compose.material3;

import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IconButton.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/material3/b8;", "", "Landroidx/compose/ui/graphics/T;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "<init>", "(JJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.b8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21469b8 {

    /* renamed from: a, reason: collision with root package name */
    public final long f36086a;

    /* renamed from: b, reason: collision with root package name */
    public final long f36087b;

    /* renamed from: c, reason: collision with root package name */
    public final long f36088c;

    /* renamed from: d, reason: collision with root package name */
    public final long f36089d;

    public C21469b8(long j12, long j13, long j14, long j15, C42822w c42822w) {
        this.f36086a = j12;
        this.f36087b = j13;
        this.f36088c = j14;
        this.f36089d = j15;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C21469b8)) {
            return false;
        }
        C21469b8 c21469b8 = (C21469b8) obj;
        return androidx.compose.ui.graphics.T.d(this.f36086a, c21469b8.f36086a) && androidx.compose.ui.graphics.T.d(this.f36087b, c21469b8.f36087b) && androidx.compose.ui.graphics.T.d(this.f36088c, c21469b8.f36088c) && androidx.compose.ui.graphics.T.d(this.f36089d, c21469b8.f36089d);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f36089d) + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(Long.hashCode(this.f36086a) * 31, 31, this.f36087b), 31, this.f36088c);
    }
}
