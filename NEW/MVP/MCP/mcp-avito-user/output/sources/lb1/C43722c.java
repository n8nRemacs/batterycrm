package lb1;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Bundle;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.jvm.internal.N;

/* renamed from: lb1.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C43722c implements InterfaceC43721b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f413912a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f413913b = C42727D.c(new b());

    /* renamed from: lb1.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Integer f413914a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f413915b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f413916c;

        public a(@l String str, @l Integer num, @l Integer num2) {
            this.f413914a = num;
            this.f413915b = num2;
            this.f413916c = str;
        }
    }

    /* renamed from: lb1.c$b */
    public static final class b extends N implements Y41.a<a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final a invoke() {
            C43722c c43722c = C43722c.this;
            Bundle bundle = c43722c.f413912a.getPackageManager().getApplicationInfo(c43722c.f413912a.getPackageName(), 128).metaData;
            return new a(bundle != null ? bundle.getString("ru.rustore.sdk.pushclient.default_notification_channel_id") : null, (bundle != null && bundle.containsKey("ru.rustore.sdk.pushclient.default_notification_icon")) ? Integer.valueOf(bundle.getInt("ru.rustore.sdk.pushclient.default_notification_icon")) : null, (bundle != null && bundle.containsKey("ru.rustore.sdk.pushclient.default_notification_color")) ? Integer.valueOf(bundle.getInt("ru.rustore.sdk.pushclient.default_notification_color")) : null);
        }
    }

    public C43722c(@k Context context) {
        this.f413912a = context;
    }
}
