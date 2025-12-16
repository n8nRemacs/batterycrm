package com.yandex.div.evaluable.types;

import Y61.k;
import Y61.l;
import java.util.Calendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: DateTime.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/evaluable/types/b;", "", "a", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class b implements Comparable<b> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f369992f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final SimpleTimeZone f369993g = new SimpleTimeZone(0, "UTC");

    /* renamed from: b, reason: collision with root package name */
    public final long f369994b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TimeZone f369995c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Object f369996d = C42727D.b(LazyThreadSafetyMode.f406616d, new C10921b());

    /* renamed from: e, reason: collision with root package name */
    public final long f369997e;

    /* compiled from: DateTime.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yandex/div/evaluable/types/b$a;", "", "<init>", "()V", "", "DEFAULT_FORMAT_PATTERN", "Ljava/lang/String;", "Ljava/util/SimpleTimeZone;", "utcTimezone", "Ljava/util/SimpleTimeZone;", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DateTime.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.evaluable.types.b$b, reason: collision with other inner class name */
    public static final class C10921b extends N implements Y41.a<Calendar> {
        public C10921b() {
            super(0);
        }

        @Override // Y41.a
        public final Calendar invoke() {
            Calendar calendar = Calendar.getInstance(b.f369993g);
            calendar.setTimeInMillis(b.this.f369994b);
            return calendar;
        }
    }

    public b(long j12, @k TimeZone timeZone) {
        this.f369994b = j12;
        this.f369995c = timeZone;
        this.f369997e = j12 - ((timeZone.getRawOffset() / 60) * 60000);
    }

    @Override // java.lang.Comparable
    public final int compareTo(b bVar) {
        return L.h(this.f369997e, bVar.f369997e);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f369997e == ((b) obj).f369997e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f369997e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @k
    public final String toString() {
        Calendar calendar = (Calendar) this.f369996d.getValue();
        f369992f.getClass();
        return String.valueOf(calendar.get(1)) + '-' + C43066x.R(2, String.valueOf(calendar.get(2) + 1)) + '-' + C43066x.R(2, String.valueOf(calendar.get(5))) + ' ' + C43066x.R(2, String.valueOf(calendar.get(11))) + ':' + C43066x.R(2, String.valueOf(calendar.get(12))) + ':' + C43066x.R(2, String.valueOf(calendar.get(13)));
    }
}
