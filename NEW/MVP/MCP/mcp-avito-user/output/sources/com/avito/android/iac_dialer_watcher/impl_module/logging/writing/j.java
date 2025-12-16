package com.avito.android.iac_dialer_watcher.impl_module.logging.writing;

import androidx.compose.foundation.H;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: IacLogEntry.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/writing/j;", "", "a", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class j {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final SimpleDateFormat f168079g;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f168080a;

    /* renamed from: b, reason: collision with root package name */
    public final long f168081b;

    /* renamed from: c, reason: collision with root package name */
    public final int f168082c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f168083d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f168084e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Throwable f168085f;

    /* compiled from: IacLogEntry.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/writing/j$a;", "", "<init>", "()V", "", "PREFIX_LENGTH", "I", "Ljava/text/SimpleDateFormat;", "timeFormat", "Ljava/text/SimpleDateFormat;", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f168079g = new SimpleDateFormat("HH:mm:ss.SSS", Locale.US);
    }

    public j(@Y61.k String str, long j12, int i12, @Y61.k String str2, @Y61.k String str3, @Y61.l Throwable th2) {
        this.f168080a = str;
        this.f168081b = j12;
        this.f168082c = i12;
        this.f168083d = str2;
        this.f168084e = str3;
        this.f168085f = th2;
    }

    public static void a(int i12, String str, StringBuilder sb2) {
        if (str.length() > i12) {
            sb2.append(C43066x.t0(i12 - 5, str));
            sb2.append("..");
            sb2.append(C43066x.u0(3, str));
        } else {
            sb2.append(str);
            int length = i12 - str.length();
            if (length > 0) {
                sb2.append(C43066x.Z(length, " "));
            }
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f168080a.equals(jVar.f168080a) && this.f168081b == jVar.f168081b && this.f168082c == jVar.f168082c && this.f168083d.equals(jVar.f168083d) && L.f(this.f168084e, jVar.f168084e) && L.f(this.f168085f, jVar.f168085f);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(androidx.appcompat.app.r.e(this.f168082c, androidx.appcompat.app.r.g(this.f168080a.hashCode() * 31, 31, this.f168081b), 31), 31, this.f168083d), 31, this.f168084e);
        Throwable th2 = this.f168085f;
        return iD2 + (th2 == null ? 0 : th2.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacLogEntry(thread=");
        sb2.append(this.f168080a);
        sb2.append(", timestamp=");
        sb2.append(this.f168081b);
        sb2.append(", priority=");
        sb2.append(this.f168082c);
        sb2.append(", tag=");
        sb2.append(this.f168083d);
        sb2.append(", message=");
        sb2.append(this.f168084e);
        sb2.append(", error=");
        return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f168085f, ')');
    }
}
