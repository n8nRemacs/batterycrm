package yX;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: LoyaltyProgramFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LyX/a;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito_loyalty-program_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yX.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C50195a extends A0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f443165e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f443166b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f443167c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final A0.a f443168d;

    static {
        h0 h0Var = new h0(C50195a.class, "showLoyaltyProgramParanjaOnboarding", "getShowLoyaltyProgramParanjaOnboarding()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f443165e = new n[]{n0Var.i(h0Var), C0.k(C50195a.class, "loyaltyProgramAbTestMode", "getLoyaltyProgramAbTestMode()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C50195a.class, "isLoyaltyProgramEntryPointOnMainEnabled", "isLoyaltyProgramEntryPointOnMainEnabled()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public C50195a() {
        Owners owners = Owners.f210481e0;
        Boolean bool = Boolean.FALSE;
        this.f443166b = A0.u(this, "Показывать онбординг-паранжу для бонусов программы лояльности при каждом заходе на главную.", "alwaysShowLoyaltyProgramParanjaOnboarding", bool, false, 0, owners, 40);
        this.f443167c = A0.u(this, "АБ тест программы лояльности. Переключатель групп", "loyaltyProgramAbTestMode", new OptionSet("none", C42745f0.U("none", "control", "bonus")), false, 0, owners, 40);
        this.f443168d = A0.u(this, "Точка входа в программу лояльности доступна", "isLoyaltyProgramEntryPointOnMainEnabled", bool, false, 0, owners, 56);
    }
}
