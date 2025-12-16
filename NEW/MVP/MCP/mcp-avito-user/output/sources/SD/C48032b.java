package sD;

import Y61.k;
import com.avito.android.features.autoteka.ab_tests.configs.ChoosingPurchaseTestGroup;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import qD.InterfaceC47282a;
import u3.f;

/* compiled from: AutotekaAbTestsModule_ProvideChoosingPurchaseTestGroupFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"LsD/b;", "Ldagger/internal/h;", "Lu3/f;", "Lcom/avito/android/features/autoteka/ab_tests/configs/ChoosingPurchaseTestGroup;", "LX41/o;", "a", "_avito-discouraged_avito-feature_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sD.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C48032b implements h<f<ChoosingPurchaseTestGroup>> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f437544b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final qD.c f437545a;

    /* compiled from: AutotekaAbTestsModule_ProvideChoosingPurchaseTestGroupFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LsD/b$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sD.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C48032b(@k C48031a c48031a, @k qD.c cVar) {
        this.f437545a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC47282a interfaceC47282a = (InterfaceC47282a) this.f437545a.get();
        f437544b.getClass();
        return interfaceC47282a.a();
    }
}
