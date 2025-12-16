package com.avito.android.messenger.conversation.mvi.send;

import com.avito.android.messenger.conversation.mvi.send.InterfaceC32208e;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.util.InterfaceC35745a5;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.C42745f0;

/* compiled from: OnboardingsInteractor.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/f;", "Lcom/avito/android/messenger/conversation/mvi/send/e;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/conversation/mvi/send/e$a;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.send.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32210f extends AbstractC32892c<InterfaceC32208e.a> implements InterfaceC32208e {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final AK0.l f194502V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final JY.a f194503W;

    /* compiled from: OnboardingsInteractor.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/f$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/send/e$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.send.f$a */
    public final class a extends com.avito.android.mvi.rx3.with_monolithic_state.o<InterfaceC32208e.a> {
        public a() {
            super(null, null, 3, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final InterfaceC32208e.a d(InterfaceC32208e.a aVar) {
            OnboardingState onboardingState;
            List list = Onboarding.f194333l;
            int iF2 = kotlin.collections.P0.f(C42745f0.q(list, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            Iterator it = ((AbstractC42738c) list).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Onboarding onboarding = (Onboarding) next;
                C32210f c32210f = C32210f.this;
                if (C32210f.me(c32210f, onboarding)) {
                    onboardingState = (OnboardingState) OnboardingState.f194345e.get(c32210f.f194502V.getInt(onboarding.getF194341m(), 0));
                } else {
                    onboardingState = OnboardingState.f194343c;
                }
                linkedHashMap.put(next, onboardingState);
            }
            return new InterfaceC32208e.a(linkedHashMap);
        }
    }

    /* compiled from: OnboardingsInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/f$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/send/e$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.send.f$b */
    public final class b extends com.avito.android.mvi.rx3.with_monolithic_state.o<InterfaceC32208e.a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Onboarding f194505d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final OnboardingState f194506e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ C32210f f194507f;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(@Y61.k C32210f c32210f, Onboarding onboarding) {
            OnboardingState onboardingState = OnboardingState.f194343c;
            this.f194507f = c32210f;
            super(null, "onboarding = " + onboarding + ", newOnboardingState = " + onboardingState, 1, null);
            this.f194505d = onboarding;
            this.f194506e = onboardingState;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final InterfaceC32208e.a d(InterfaceC32208e.a aVar) {
            InterfaceC32208e.a aVar2 = aVar;
            C32210f c32210f = this.f194507f;
            Onboarding onboarding = this.f194505d;
            if (!C32210f.me(c32210f, onboarding)) {
                return aVar2;
            }
            Map<Onboarding, OnboardingState> map = aVar2.f194496a;
            OnboardingState onboardingState = map.get(onboarding);
            OnboardingState onboardingState2 = this.f194506e;
            if (onboardingState != null && onboardingState == onboardingState2) {
                return aVar2;
            }
            String f194341m = onboarding.getF194341m();
            c32210f.f194502V.a(onboardingState2.ordinal(), f194341m);
            return new InterfaceC32208e.a(kotlin.collections.P0.l(map, new kotlin.Q(onboarding, onboardingState2)));
        }
    }

    /* compiled from: OnboardingsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.send.f$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f194508a;

        static {
            int[] iArr = new int[Onboarding.values().length];
            try {
                iArr[Onboarding.f194323b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Onboarding.f194324c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Onboarding.f194325d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Onboarding.f194326e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Onboarding.f194327f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Onboarding.f194328g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Onboarding.f194329h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Onboarding.f194330i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Onboarding.f194331j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f194508a = iArr;
        }
    }

    public C32210f() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public C32210f(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k AK0.l lVar, @Y61.k JY.a aVar) {
        com.avito.android.mvi.rx3.with_monolithic_state.F f12 = new com.avito.android.mvi.rx3.with_monolithic_state.F(interfaceC35745a5.a(), null, 2, 0 == true ? 1 : 0);
        InterfaceC32208e.a.f194494b.getClass();
        super("OnboardingsInteractor", InterfaceC32208e.a.f194495c, interfaceC35745a5, null, f12, null, null, null, 232, null);
        this.f194502V = lVar;
        this.f194503W = aVar;
        le().s(new a());
    }

    public static final boolean me(C32210f c32210f, Onboarding onboarding) {
        c32210f.getClass();
        int i12 = c.f194508a[onboarding.ordinal()];
        JY.a aVar = c32210f.f194503W;
        switch (i12) {
            case 1:
                return aVar.b();
            case 2:
                return aVar.b();
            case 3:
                return aVar.p();
            case 4:
                return aVar.p();
            case 5:
                return aVar.p();
            case 6:
                return aVar.l();
            case 7:
                return aVar.f();
            case 8:
                return aVar.f();
            case 9:
                return aVar.a();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.InterfaceC32208e
    public final void D4(@Y61.k Onboarding onboarding) {
        com.avito.android.mvi.rx3.with_monolithic_state.t<InterfaceC32208e.a> tVarLe = le();
        OnboardingState onboardingState = OnboardingState.f194342b;
        tVarLe.s(new b(this, onboarding));
    }
}
