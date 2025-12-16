package d20;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: MortgageInviteFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld20/a;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito_mortgage-invite_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: d20.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C39487a extends A0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f393624d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f393625b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f393626c;

    static {
        h0 h0Var = new h0(C39487a.class, "useMortgageInviteEntryPoint", "getUseMortgageInviteEntryPoint()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f393624d = new n[]{n0Var.i(h0Var), C0.k(C39487a.class, "useNativeProfessionalLanding", "getUseNativeProfessionalLanding()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public C39487a() {
        Owners owners = Owners.f210526p1;
        Boolean bool = Boolean.FALSE;
        this.f393625b = A0.u(this, "Использование точек входа в ипотечную заявку через ролевую модель", "useMortgageInviteEntryPoint", bool, false, 0, owners, 56);
        this.f393626c = A0.u(this, "Использование нативного профессионального лендинга для создания профессиональной анкеты", "mortgage_lead_use_native_landing", bool, false, 0, owners, 56);
    }
}
