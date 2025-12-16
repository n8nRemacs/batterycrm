package com.avito.android.messenger.channels.adapter.konveyor.notifications_banner;

import androidx.compose.runtime.internal.C22096n;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChannelsNotificationsBannerRedesign.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final A f186975a = new A();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f186976b = new C22096n(1158135924, a.f186977l, false);

    /* compiled from: ChannelsNotificationsBannerRedesign.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f186977l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                u.a(u0.i.c(a13, R.string.messenger_notifications_banner_message), u0.i.c(a13, R.string.messenger_notifications_banner_action), null, y.f187035l, z.f187036l, a13, 28032);
            }
            return G0.f406611a;
        }
    }
}
