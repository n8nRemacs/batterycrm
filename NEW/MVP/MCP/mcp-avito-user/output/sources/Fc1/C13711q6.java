package Fc1;

import feedback.shared.sdk.api.network.entities.Privacy;
import feedback.shared.sdk.api.network.entities.PrivacyType;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;

/* renamed from: Fc1.q6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13711q6 implements I6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Privacy f5769a;

    /* renamed from: Fc1.q6$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5770a;

        static {
            int[] iArr = new int[PrivacyType.values().length];
            try {
                iArr[PrivacyType.CHECKBOX_ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrivacyType.CHECKBOX_DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrivacyType.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5770a = iArr;
        }
    }

    public C13711q6(Privacy privacy) {
        this.f5769a = privacy;
    }

    @Override // Fc1.I6
    @Y61.l
    public final C13614g a() {
        return null;
    }

    @Override // Fc1.I6
    @Y61.k
    public final Y0 b() {
        Privacy privacy = this.f5769a;
        return new Y0(privacy.getWarningMessage(), privacy.getEnabled() && privacy.getType() != PrivacyType.TEXT);
    }

    @Override // Fc1.I6
    @Y61.k
    public final C13696p0 c() {
        return new C13696p0(5, new K0("Negative Message", "Positive message"));
    }

    @Override // Fc1.I6
    @Y61.k
    public final xyz.n.a.i4 d() {
        return xyz.n.a.i4.f442741m;
    }

    @Override // Fc1.I6
    @Y61.l
    public final C13765w7 e() {
        return null;
    }

    @Override // Fc1.I6
    @Y61.k
    public final I1 f() {
        return new I1("Создать скриншот", "Прикрепить скриншот");
    }

    @Override // Fc1.I6
    @Y61.k
    public final List<C13623h> g() {
        return C42784z0.f406748b;
    }

    @Override // Fc1.I6
    @Y61.k
    public final String getId() {
        kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
        return "";
    }

    @Override // Fc1.I6
    @Y61.k
    public final String getValue() {
        return "TextValue";
    }

    @Override // Fc1.I6
    @Y61.l
    public final B h() {
        xyz.n.a.c4 c4Var;
        Privacy privacy = this.f5769a;
        if (!privacy.getEnabled()) {
            return null;
        }
        int i12 = a.f5770a[privacy.getType().ordinal()];
        if (i12 == 1) {
            c4Var = xyz.n.a.c4.f442724b;
        } else if (i12 == 2) {
            c4Var = xyz.n.a.c4.f442725c;
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            c4Var = xyz.n.a.c4.f442726d;
        }
        return new B(privacy.getDeclaration(), privacy.getPrivacyPages(), c4Var);
    }
}
