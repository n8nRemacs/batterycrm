package com.avito.android.analytics.statsd;

import com.avito.android.InterfaceC32900o;
import com.avito.android.analytics.statsd.F;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: StatsdKeyFactory.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/statsd/G;", "Lcom/avito/android/analytics/statsd/F;", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes11.dex */
public final class G implements F {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.C f91031a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32900o f91032b;

    /* compiled from: StatsdKeyFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f91033l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(String str) {
            return D.a(str);
        }
    }

    @Inject
    public G(@Y61.k com.avito.android.util.C c12, @Y61.k InterfaceC32900o interfaceC32900o) {
        this.f91031a = c12;
        this.f91032b = interfaceC32900o;
    }

    @Override // com.avito.android.analytics.statsd.F
    @Y61.k
    public final F.b a(@Y61.k String... strArr) {
        ArrayList arrayListB = C42756l.B(strArr);
        ArrayList arrayList = new ArrayList(C42745f0.q(arrayListB, 10));
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            String strA0 = C43066x.a0((String) it.next(), "{{%app_ver%}}", D.a(this.f91032b.f().getValue()), false);
            com.avito.android.util.C c12 = this.f91031a;
            arrayList.add(C43066x.f0(C43066x.a0(C43066x.a0(C43066x.a0(strA0, "{{%sdk_ver%}}", D.a(String.valueOf(c12.j())), false), "{{%device_model%}}", D.a(c12.S()), false), "{{%device_manufacturer%}}", D.a(c12.e()), false), new String[]{"."}, 0, 6));
        }
        return new F.b(C42745f0.O(C42745f0.H(arrayList), ".", null, null, a.f91033l, 30));
    }
}
