package sberid.sdk.global.models;

import N41.l;
import Y61.k;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlinx.serialization.w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lsberid/sdk/global/models/StandName;", "", "k1/l", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
@w
/* loaded from: classes9.dex */
public final class StandName {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final l f437762c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final Object f437763d;

    /* renamed from: e, reason: collision with root package name */
    public static final StandName f437764e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ StandName[] f437765f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f437766g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f437767b;

    static {
        StandName standName = new StandName("CLOUD_IFT", 0, "https://id-ift.sber.ru/CSAFront/oidc/sberbank_id/authorize.do");
        StandName standName2 = new StandName("CLOUD_PSI", 1, "https://id-psi.sber.ru/CSAFront/oidc/sberbank_id/authorize.do");
        StandName standName3 = new StandName("ESA_IFT", 2, "https://ift-csa.testonline.sberbank.ru:4456/CSAFront/oidc/authorize.do");
        StandName standName4 = new StandName("ESA_PSI", 3, "https://psi-csa.testonline.sberbank.ru/CSAFront/oidc/authorize.do");
        StandName standName5 = new StandName("PROM", 4, "https://online.sberbank.ru/CSAFront/oidc/authorize.do");
        f437764e = standName5;
        StandName[] standNameArr = {standName, standName2, standName3, standName4, standName5};
        f437765f = standNameArr;
        f437766g = c.a(standNameArr);
        f437762c = new l();
        f437763d = C42727D.b(LazyThreadSafetyMode.f406615c, N41.k.f11200l);
    }

    public StandName(String str, int i12, String str2) {
        this.f437767b = str2;
    }

    public static StandName valueOf(String str) {
        return (StandName) Enum.valueOf(StandName.class, str);
    }

    public static StandName[] values() {
        return (StandName[]) f437765f.clone();
    }
}
