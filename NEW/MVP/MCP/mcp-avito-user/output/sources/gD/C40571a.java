package gD;

import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: ApiFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LgD/a;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito-discouraged_avito-feature_api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gD.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C40571a extends A0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f396381e;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final A0.a f396382b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final A0.a f396383c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final A0.a f396384d;

    static {
        h0 h0Var = new h0(C40571a.class, "userAgentAndFingerprintHeadersInFresco", "getUserAgentAndFingerprintHeadersInFresco()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f396381e = new n[]{n0Var.i(h0Var), C0.k(C40571a.class, "fingerprintTokenHeaderInFresco", "getFingerprintTokenHeaderInFresco()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C40571a.class, "xDeviceIdHeaderInFresco", "getXDeviceIdHeaderInFresco()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public C40571a() {
        Owners owners = Owners.f210440R0;
        Boolean bool = Boolean.TRUE;
        this.f396382b = A0.u(this, "Добавляем хедеры user-agent и f в запросы Fresco", "userAgentAndFingerprintHeadersInFresco", bool, false, 0, owners, 56);
        this.f396383c = A0.u(this, "Добавляем хедер FT (fingerprint token) в запросы Fresco", "fingerprintTokenHeaderInFresco", bool, false, 0, owners, 56);
        this.f396384d = A0.u(this, "Добавляем хедер x-deviceid в запросы Fresco", "xDeviceIdHeaderInFresco", bool, false, 0, owners, 56);
    }
}
