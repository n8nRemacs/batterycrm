package qn0;

import Y61.k;
import com.avito.android.reward_program.ab_tests.configs.OctoberRewardTestGroup;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import on0.C44829c;
import on0.InterfaceC44827a;

/* compiled from: MotivationProgramAbTestsModule_ProvideOctoberRewardTestGroupFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lqn0/b;", "Ldagger/internal/h;", "Lu3/h;", "Lcom/avito/android/reward_program/ab_tests/configs/OctoberRewardTestGroup;", "LX41/o;", "a", "_avito-discouraged_avito-feature_reward-program"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qn0.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C47419b implements h<u3.h<OctoberRewardTestGroup>> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f429355b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C44829c f429356a;

    /* compiled from: MotivationProgramAbTestsModule_ProvideOctoberRewardTestGroupFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqn0/b$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_reward-program"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qn0.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C47419b(@k C44829c c44829c) {
        this.f429356a = c44829c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC44827a interfaceC44827a = (InterfaceC44827a) this.f429356a.get();
        f429355b.getClass();
        C47418a.f429354a.getClass();
        return interfaceC44827a.b();
    }
}
