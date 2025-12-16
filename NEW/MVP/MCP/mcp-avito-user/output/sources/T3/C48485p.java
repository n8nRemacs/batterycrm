package t3;

import com.avito.android.ab_tests.C27660x;
import com.avito.android.ab_tests.InterfaceC27658v;
import com.avito.android.ab_tests.configs.ForceUpdateProposalTestGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import u3.InterfaceC48779c;

/* compiled from: CoreAbTestsModule_ProvideForceUpdateProposalTestGroupFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lt3/p;", "Ldagger/internal/h;", "Lu3/c;", "Lcom/avito/android/ab_tests/configs/ForceUpdateProposalTestGroup;", "LX41/o;", "a", "_avito-discouraged_avito-feature_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: t3.p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C48485p implements dagger.internal.h<InterfaceC48779c<ForceUpdateProposalTestGroup>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f439112b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C27660x f439113a;

    /* compiled from: CoreAbTestsModule_ProvideForceUpdateProposalTestGroupFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt3/p$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: t3.p$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C48485p(@Y61.k C27660x c27660x) {
        this.f439113a = c27660x;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC27658v interfaceC27658v = (InterfaceC27658v) this.f439113a.get();
        f439112b.getClass();
        C48484o.f439109a.getClass();
        return interfaceC27658v.b();
    }
}
