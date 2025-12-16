package z91;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.mts.biometry.api.SDKEnvironment;
import ru.mts.biometry.sdk.OnboardingSettings;
import ru.mts.biometry.sdk.PassportValidationScreenDesign;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz91/b;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z91.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* data */ class C50426b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f443886a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f443887b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f443888c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f443889d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SDKEnvironment f443890e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final PassportValidationScreenDesign f443891f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final OnboardingSettings f443892g;

    public C50426b(String str, boolean z12, boolean z13, Integer num, SDKEnvironment sDKEnvironment, PassportValidationScreenDesign passportValidationScreenDesign, OnboardingSettings onboardingSettings, int i12, C42822w c42822w) {
        passportValidationScreenDesign = (i12 & 32) != 0 ? PassportValidationScreenDesign.f436372c : passportValidationScreenDesign;
        onboardingSettings = (i12 & 64) != 0 ? new OnboardingSettings(false, 1, null) : onboardingSettings;
        this.f443886a = str;
        this.f443887b = z12;
        this.f443888c = z13;
        this.f443889d = num;
        this.f443890e = sDKEnvironment;
        this.f443891f = passportValidationScreenDesign;
        this.f443892g = onboardingSettings;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50426b)) {
            return false;
        }
        C50426b c50426b = (C50426b) obj;
        return L.f(this.f443886a, c50426b.f443886a) && this.f443887b == c50426b.f443887b && this.f443888c == c50426b.f443888c && L.f(this.f443889d, c50426b.f443889d) && this.f443890e == c50426b.f443890e && this.f443891f == c50426b.f443891f && L.f(this.f443892g, c50426b.f443892g);
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(this.f443886a.hashCode() * 31, 31, this.f443887b), 31, this.f443888c);
        Integer num = this.f443889d;
        return Boolean.hashCode(this.f443892g.f436370b) + ((this.f443891f.hashCode() + ((this.f443890e.hashCode() + ((i12 + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "BioSettings(clientToken=" + this.f443886a + ", onBoarding=" + this.f443887b + ", useInn=" + this.f443888c + ", theme=" + this.f443889d + ", backend=" + this.f443890e + ", passportValidationScreenDesign=" + this.f443891f + ", onboardingSettings=" + this.f443892g + ')';
    }
}
