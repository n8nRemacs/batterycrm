package s3;

import com.avito.android.I1;
import com.avito.android.ab_tests.configs.QuicTuningTestGroup;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import u3.AbstractC48780d;

/* compiled from: QuicTuningConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/P;", "Lu3/d;", "Lcom/avito/android/ab_tests/configs/QuicTuningTestGroup;", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class P extends AbstractC48780d<QuicTuningTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final I1 f437354a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437355b = "quic_tuning_1";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437356c = true;

    public P(@Y61.k I1 i12) {
        this.f437354a = i12;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437356c() {
        return this.f437356c;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437355b() {
        return this.f437355b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        I1 i12 = this.f437354a;
        i12.getClass();
        kotlin.reflect.n<Object> nVar = I1.f67278k0[24];
        return d(((OptionSet) i12.f67338y.a().invoke()).f318873b);
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return QuicTuningTestGroup.values();
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return QuicTuningTestGroup.f67913c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        I1 i12 = this.f437354a;
        i12.getClass();
        kotlin.reflect.n<Object> nVar = I1.f67278k0[23];
        return ((Boolean) i12.f67337x.a().invoke()).booleanValue();
    }
}
