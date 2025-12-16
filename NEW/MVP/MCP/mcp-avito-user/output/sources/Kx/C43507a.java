package kx;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: DevelopmentsCatalogFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkx/a;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito_developments-catalog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kx.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C43507a extends A0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f413292d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f413293b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f413294c;

    static {
        h0 h0Var = new h0(C43507a.class, "developmentBeduinV2Redirect", "getDevelopmentBeduinV2Redirect()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f413292d = new n[]{n0Var.i(h0Var), C0.k(C43507a.class, "developmentBeduinV2RedirectScrollOnKeyboardShown", "getDevelopmentBeduinV2RedirectScrollOnKeyboardShown()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public C43507a() {
        Owners owners = Owners.f210510l1;
        this.f413293b = A0.u(this, "Добавить под АБ в диплинке карточки ЖК редирект на Beduin V2", "developmentBeduinV2Redirect", Boolean.TRUE, false, 0, owners, 56);
        this.f413294c = A0.u(this, "Значение ScrollOnKeyboardShown в редиректе диплинка карточки ЖК на Beduin V2", "developmentBeduinV2RedirectScrollOnKeyboardShown", Boolean.FALSE, false, 0, owners, 56);
    }
}
