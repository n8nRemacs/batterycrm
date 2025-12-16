package com.avito.android.analytics_adjust;

import androidx.compose.foundation.H;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdjustEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics_adjust/E;", "", "a", "_common_analytics-adjust_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f91194a;

    /* renamed from: b, reason: collision with root package name */
    public final float f91195b;

    /* renamed from: c, reason: collision with root package name */
    public final int f91196c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f91197d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f91198e;

    /* compiled from: AdjustEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics_adjust/E$a;", "", "<init>", "()V", "_common_analytics-adjust_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public E(String str, float f12, int i12, String str2, String str3, int i13, C42822w c42822w) {
        f12 = (i13 & 2) != 0 ? 1.0f : f12;
        i12 = (i13 & 4) != 0 ? 1 : i12;
        str2 = (i13 & 8) != 0 ? UUID.randomUUID().toString() : str2;
        str3 = (i13 & 16) != 0 ? "1" : str3;
        this.f91194a = str;
        this.f91195b = f12;
        this.f91196c = i12;
        this.f91197d = str2;
        this.f91198e = str3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e12 = (E) obj;
        return L.f(this.f91194a, e12.f91194a) && Float.compare(this.f91195b, e12.f91195b) == 0 && this.f91196c == e12.f91196c && L.f(this.f91197d, e12.f91197d) && L.f(this.f91198e, e12.f91198e);
    }

    public final int hashCode() {
        return this.f91198e.hashCode() + H.d(androidx.appcompat.app.r.e(this.f91196c, androidx.appcompat.app.r.d(this.f91195b, this.f91194a.hashCode() * 31, 31), 31), 31, this.f91197d);
    }

    @Y61.k
    public final String toString() {
        return this.f91194a + ';' + this.f91195b + ';' + this.f91196c + ';' + this.f91197d + ';' + this.f91198e;
    }
}
