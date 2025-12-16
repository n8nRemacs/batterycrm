package Zf0;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: PushFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZf0/a;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito_push_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zf0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C19552a extends A0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f20368e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f20369b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f20370c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final A0.a f20371d;

    static {
        h0 h0Var = new h0(C19552a.class, "notificationGroupIdSetting", "getNotificationGroupIdSetting()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f20368e = new n[]{n0Var.i(h0Var), C0.k(C19552a.class, "saveOpenAppAtTabFromNotificationAb", "getSaveOpenAppAtTabFromNotificationAb()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C19552a.class, "messengerPushRedesign", "getMessengerPushRedesign()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public C19552a() {
        Owners owners = Owners.f210390A3;
        Boolean bool = Boolean.TRUE;
        this.f20369b = A0.u(this, "Простановка параметра group для уведомления", "tac_notificationGroupIdSetting", bool, false, 0, owners, 56);
        this.f20370c = A0.u(this, "Сохраняем параметр из пуша для открытия вкладки", "saveOpenAppAtTabFromNotificationAb", bool, false, 0, owners, 56);
        this.f20371d = A0.u(this, "Редизайн пушей мессенджера", "messengerPushRedesign", bool, false, 0, owners, 56);
    }
}
