package com.avito.android.ab_tests.configs;

import Y61.k;
import com.my.tracker.ads.AdFormat;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ForceUpdateProposalTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/ForceUpdateProposalTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ForceUpdateProposalTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final ForceUpdateProposalTestGroup f67816c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ForceUpdateProposalTestGroup[] f67817d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f67818e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67819b;

    static {
        ForceUpdateProposalTestGroup forceUpdateProposalTestGroup = new ForceUpdateProposalTestGroup("BANNER", 0, AdFormat.BANNER);
        ForceUpdateProposalTestGroup forceUpdateProposalTestGroup2 = new ForceUpdateProposalTestGroup("DIALOG", 1, "dialog");
        f67816c = forceUpdateProposalTestGroup2;
        ForceUpdateProposalTestGroup[] forceUpdateProposalTestGroupArr = {forceUpdateProposalTestGroup, forceUpdateProposalTestGroup2, new ForceUpdateProposalTestGroup("NOTHING", 2, "nothing")};
        f67817d = forceUpdateProposalTestGroupArr;
        f67818e = c.a(forceUpdateProposalTestGroupArr);
    }

    public ForceUpdateProposalTestGroup(String str, int i12, String str2) {
        this.f67819b = str2;
    }

    public static ForceUpdateProposalTestGroup valueOf(String str) {
        return (ForceUpdateProposalTestGroup) Enum.valueOf(ForceUpdateProposalTestGroup.class, str);
    }

    public static ForceUpdateProposalTestGroup[] values() {
        return (ForceUpdateProposalTestGroup[]) f67817d.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67824b() {
        return this.f67819b;
    }
}
