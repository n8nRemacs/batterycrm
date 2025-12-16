package s3;

import com.avito.android.ab_tests.configs.ForceUpdateProposalTestGroup;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import u3.AbstractC48780d;

/* compiled from: ForceUpdateProposalConfig.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ls3/q;", "Lu3/d;", "Lcom/avito/android/ab_tests/configs/ForceUpdateProposalTestGroup;", "<init>", "()V", "_avito-discouraged_avito-feature_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: s3.q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C47982q extends AbstractC48780d<ForceUpdateProposalTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f437426a = "force_update_proposal";

    /* renamed from: b, reason: collision with root package name */
    public final boolean f437427b = true;

    public C47982q() {
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437427b() {
        return this.f437427b;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437426a() {
        return this.f437426a;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        return ForceUpdateProposalTestGroup.f67816c;
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return ForceUpdateProposalTestGroup.values();
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return ForceUpdateProposalTestGroup.f67816c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        return true;
    }
}
