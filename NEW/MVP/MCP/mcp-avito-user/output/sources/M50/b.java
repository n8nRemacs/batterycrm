package M50;

import android.os.Parcelable;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.analytics.AnalyticScreen;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;

/* compiled from: AnalyticInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LM50/b;", "LM50/a;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements M50.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f10393a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Z1<AnalyticScreen> f10394b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Z1<String> f10395c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ProfileCreateExtendedFlow f10396d;

    /* compiled from: AnalyticInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[AnalyticScreen.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<AnalyticScreen> creator = AnalyticScreen.CREATOR;
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Parcelable.Creator<AnalyticScreen> creator2 = AnalyticScreen.CREATOR;
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Parcelable.Creator<AnalyticScreen> creator3 = AnalyticScreen.CREATOR;
                iArr[6] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Inject
    public b(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k Z1<AnalyticScreen> z12, @Y61.k Z1<String> z13, @Y61.k ProfileCreateExtendedFlow profileCreateExtendedFlow) {
        this.f10393a = interfaceC28373a;
        this.f10394b = z12;
        this.f10395c = z13;
        this.f10396d = profileCreateExtendedFlow;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    @Override // M50.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.l java.lang.Integer r11, @Y61.l java.lang.Integer r12, @Y61.l java.lang.String r13, @Y61.l java.lang.String r14, @Y61.k com.avito.android.passport.profile_add.analytics.AnalyticScreen r15) {
        /*
            r10 = this;
            kotlinx.coroutines.flow.Z1<com.avito.android.passport.profile_add.analytics.AnalyticScreen> r0 = r10.f10394b
            java.lang.Object r1 = r0.getValue()
            r7 = r1
            com.avito.android.passport.profile_add.analytics.AnalyticScreen r7 = (com.avito.android.passport.profile_add.analytics.AnalyticScreen) r7
            if (r7 != r15) goto Lc
            return
        Lc:
            kotlinx.coroutines.flow.Z1<java.lang.String> r1 = r10.f10395c
            java.lang.Object r1 = r1.getValue()
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            int r1 = r15.ordinal()
            r2 = 3
            if (r1 == r2) goto L54
            r2 = 4
            r3 = 0
            if (r1 == r2) goto L42
            r2 = 5
            if (r1 == r2) goto L35
            r2 = 6
            if (r1 == r2) goto L27
            goto L61
        L27:
            M50.j r1 = new M50.j
            com.avito.android.passport.profile_add.ProfileCreateExtendedFlow r8 = r10.f10396d
            r2 = r1
            r3 = r11
            r4 = r12
            r6 = r13
            r9 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
        L33:
            r3 = r1
            goto L61
        L35:
            M50.l r1 = new M50.l
            com.avito.android.passport.profile_add.ProfileCreateExtendedFlow r8 = r10.f10396d
            r2 = r1
            r3 = r11
            r4 = r12
            r6 = r13
            r9 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            goto L33
        L42:
            com.avito.android.passport.profile_add.analytics.AnalyticScreen r1 = com.avito.android.passport.profile_add.analytics.AnalyticScreen.f211216i
            if (r7 != r1) goto L47
            goto L61
        L47:
            M50.i r1 = new M50.i
            com.avito.android.passport.profile_add.ProfileCreateExtendedFlow r8 = r10.f10396d
            r2 = r1
            r3 = r11
            r4 = r12
            r6 = r13
            r9 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            goto L33
        L54:
            M50.k r1 = new M50.k
            com.avito.android.passport.profile_add.ProfileCreateExtendedFlow r8 = r10.f10396d
            r2 = r1
            r3 = r11
            r4 = r12
            r6 = r13
            r9 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            goto L33
        L61:
            if (r3 == 0) goto L68
            com.avito.android.analytics.a r11 = r10.f10393a
            r11.c(r3)
        L68:
            r0.setValue(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M50.b.a(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, com.avito.android.passport.profile_add.analytics.AnalyticScreen):void");
    }

    @Override // M50.a
    public final void b(@Y61.l Integer num, @Y61.l Integer num2, @Y61.l String str, @Y61.l String str2) {
        this.f10393a.c(new g(num, num2, this.f10395c.getValue(), str, this.f10396d, str2));
    }

    @Override // M50.a
    public final void c(@Y61.l Integer num, @Y61.l Integer num2, @Y61.l String str, @Y61.l String str2, @Y61.k AnalyticScreen analyticScreen) {
        this.f10393a.c(new f(num, num2, this.f10395c.getValue(), str, analyticScreen, this.f10396d, str2));
    }

    @Override // M50.a
    public final void d(@Y61.l String str, @Y61.l String str2, @Y61.k AnalyticScreen analyticScreen) {
        this.f10393a.c(new h(str, analyticScreen, this.f10396d, str2));
        this.f10394b.setValue(AnalyticScreen.f211212e);
    }
}
