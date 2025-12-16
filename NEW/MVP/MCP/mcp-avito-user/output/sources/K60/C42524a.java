package k60;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: PassportFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk60/a;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: k60.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C42524a extends A0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f406098e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f406099b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f406100c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final A0.a f406101d;

    static {
        h0 h0Var = new h0(C42524a.class, "passportShowAllProfilesButtonDev", "getPassportShowAllProfilesButtonDev()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f406098e = new n[]{n0Var.i(h0Var), C0.k(C42524a.class, "passportOnboardingProBeduin", "getPassportOnboardingProBeduin()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C42524a.class, "passportToasts", "getPassportToasts()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public C42524a() {
        Owners owners = Owners.f210532r;
        this.f406099b = A0.u(this, "Всегда показывать кнопку Все в списке профилей в профиле", "passportShowAllProfilesButtonDev", Boolean.FALSE, false, 0, owners, 40);
        Boolean bool = Boolean.TRUE;
        this.f406100c = A0.u(this, "Перевод онбординга профессионализации в мерже на BeduinV2", "passportOnboardingProBeduin", bool, true, 0, owners, 40);
        this.f406101d = A0.u(this, "Включает новый подход к отображению тостов в сценариях паспорта", "passportToasts", bool, true, 0, owners, 40);
    }
}
