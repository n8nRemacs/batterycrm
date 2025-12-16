package androidx.compose.material3;

import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TimePicker.kt */
@InterfaceC21537e7
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/Aj;", "", "Landroidx/compose/ui/graphics/T;", "clockDialColor", "selectorColor", "containerColor", "periodSelectorBorderColor", "clockDialSelectedContentColor", "clockDialUnselectedContentColor", "periodSelectorSelectedContainerColor", "periodSelectorUnselectedContainerColor", "periodSelectorSelectedContentColor", "periodSelectorUnselectedContentColor", "timeSelectorSelectedContainerColor", "timeSelectorUnselectedContainerColor", "timeSelectorSelectedContentColor", "timeSelectorUnselectedContentColor", "<init>", "(JJJJJJJJJJJJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Aj {

    /* renamed from: a, reason: collision with root package name */
    public final long f34518a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34519b;

    /* renamed from: c, reason: collision with root package name */
    public final long f34520c;

    /* renamed from: d, reason: collision with root package name */
    public final long f34521d;

    /* renamed from: e, reason: collision with root package name */
    public final long f34522e;

    /* renamed from: f, reason: collision with root package name */
    public final long f34523f;

    /* renamed from: g, reason: collision with root package name */
    public final long f34524g;

    /* renamed from: h, reason: collision with root package name */
    public final long f34525h;

    /* renamed from: i, reason: collision with root package name */
    public final long f34526i;

    /* renamed from: j, reason: collision with root package name */
    public final long f34527j;

    /* renamed from: k, reason: collision with root package name */
    public final long f34528k;

    /* renamed from: l, reason: collision with root package name */
    public final long f34529l;

    public Aj(long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j22, long j23, long j24, long j25, long j26, long j27, C42822w c42822w) {
        this.f34518a = j12;
        this.f34519b = j13;
        this.f34520c = j14;
        this.f34521d = j15;
        this.f34522e = j18;
        this.f34523f = j19;
        this.f34524g = j22;
        this.f34525h = j23;
        this.f34526i = j24;
        this.f34527j = j25;
        this.f34528k = j26;
        this.f34529l = j27;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Aj.class != obj.getClass()) {
            return false;
        }
        Aj aj2 = (Aj) obj;
        return androidx.compose.ui.graphics.T.d(this.f34518a, aj2.f34518a) && androidx.compose.ui.graphics.T.d(this.f34519b, aj2.f34519b) && androidx.compose.ui.graphics.T.d(this.f34520c, aj2.f34520c) && androidx.compose.ui.graphics.T.d(this.f34521d, aj2.f34521d) && androidx.compose.ui.graphics.T.d(this.f34522e, aj2.f34522e) && androidx.compose.ui.graphics.T.d(this.f34523f, aj2.f34523f) && androidx.compose.ui.graphics.T.d(this.f34524g, aj2.f34524g) && androidx.compose.ui.graphics.T.d(this.f34525h, aj2.f34525h) && androidx.compose.ui.graphics.T.d(this.f34526i, aj2.f34526i) && androidx.compose.ui.graphics.T.d(this.f34527j, aj2.f34527j) && androidx.compose.ui.graphics.T.d(this.f34528k, aj2.f34528k) && androidx.compose.ui.graphics.T.d(this.f34529l, aj2.f34529l);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f34529l) + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(Long.hashCode(this.f34518a) * 31, 31, this.f34519b), 31, this.f34520c), 31, this.f34521d), 31, this.f34522e), 31, this.f34523f), 31, this.f34524g), 31, this.f34525h), 31, this.f34526i), 31, this.f34527j), 31, this.f34528k);
    }
}
