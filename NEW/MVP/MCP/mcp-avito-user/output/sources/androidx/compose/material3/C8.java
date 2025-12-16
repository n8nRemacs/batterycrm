package androidx.compose.material3;

import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IconButton.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/C8;", "", "Landroidx/compose/ui/graphics/T;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "checkedContainerColor", "checkedContentColor", "<init>", "(JJJJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class C8 {

    /* renamed from: a, reason: collision with root package name */
    public final long f34593a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34594b;

    /* renamed from: c, reason: collision with root package name */
    public final long f34595c;

    /* renamed from: d, reason: collision with root package name */
    public final long f34596d;

    /* renamed from: e, reason: collision with root package name */
    public final long f34597e;

    /* renamed from: f, reason: collision with root package name */
    public final long f34598f;

    public C8(long j12, long j13, long j14, long j15, long j16, long j17, C42822w c42822w) {
        this.f34593a = j12;
        this.f34594b = j13;
        this.f34595c = j14;
        this.f34596d = j15;
        this.f34597e = j16;
        this.f34598f = j17;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C8)) {
            return false;
        }
        C8 c82 = (C8) obj;
        return androidx.compose.ui.graphics.T.d(this.f34593a, c82.f34593a) && androidx.compose.ui.graphics.T.d(this.f34594b, c82.f34594b) && androidx.compose.ui.graphics.T.d(this.f34595c, c82.f34595c) && androidx.compose.ui.graphics.T.d(this.f34596d, c82.f34596d) && androidx.compose.ui.graphics.T.d(this.f34597e, c82.f34597e) && androidx.compose.ui.graphics.T.d(this.f34598f, c82.f34598f);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f34598f) + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(Long.hashCode(this.f34593a) * 31, 31, this.f34594b), 31, this.f34595c), 31, this.f34596d), 31, this.f34597e);
    }
}
