package com.avito.android.recall_me_v2.presentation.recallme.mvi;

import Di0.AbstractC13405c;
import Di0.InterfaceC13403a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.recall_me_v2.presentation.recallme.mvi.entity.RecallMeInternalAction;
import com.avito.android.util.R0;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.X;

/* compiled from: RecallMeActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LDi0/a;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction;", "LDi0/c;", "a", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC13403a, RecallMeInternalAction, AbstractC13405c> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final Set<Integer> f252119e;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recall_me.domain.n f252120a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recall_me_v2.presentation.recallme.g f252121b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f252122c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f252123d;

    /* compiled from: RecallMeActor.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/a$a;", "", "<init>", "()V", "", "", "PHONE_ALREADY_VERIFIED_CODE", "Ljava/util/Set;", "", "RU_COUNTRY_CODE", "Ljava/lang/String;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.recall_me_v2.presentation.recallme.mvi.a$a, reason: collision with other inner class name */
    public static final class C7566a {
        public /* synthetic */ C7566a(C42822w c42822w) {
            this();
        }

        public C7566a() {
        }
    }

    static {
        new C7566a(null);
        f252119e = C42756l.l0(new Integer[]{6, 100});
    }

    @Inject
    public a(@Y61.k com.avito.android.recall_me.domain.n nVar, @Y61.k com.avito.android.recall_me_v2.presentation.recallme.g gVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k R0 r02) {
        this.f252120a = nVar;
        this.f252121b = gVar;
        this.f252122c = aVar;
        this.f252123d = r02;
    }

    public static final String c(a aVar, String str) {
        aVar.getClass();
        return C43066x.h0(str, "7", false) ? str : "7".concat(str);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<RecallMeInternalAction> b(InterfaceC13403a interfaceC13403a, AbstractC13405c abstractC13405c) {
        InterfaceC43160i<RecallMeInternalAction> x12;
        InterfaceC13403a interfaceC13403a2 = interfaceC13403a;
        AbstractC13405c abstractC13405c2 = abstractC13405c;
        if ((interfaceC13403a2 instanceof InterfaceC13403a.c) || (interfaceC13403a2 instanceof InterfaceC13403a.h)) {
            x12 = new C43152f0(C43175k.G(new b(this, abstractC13405c2, null)), new c(3, null));
        } else if (interfaceC13403a2 instanceof InterfaceC13403a.b) {
            x12 = new C43210w(RecallMeInternalAction.OnCloseButtonClicked.f252142b);
        } else if (interfaceC13403a2 instanceof InterfaceC13403a.d) {
            x12 = new C43210w(new RecallMeInternalAction.OnNameInputChanged(((InterfaceC13403a.d) interfaceC13403a2).f3392a));
        } else if (interfaceC13403a2 instanceof InterfaceC13403a.e) {
            x12 = new C43210w(RecallMeInternalAction.OnNameInputResetClicked.f252153b);
        } else if (interfaceC13403a2 instanceof InterfaceC13403a.f) {
            x12 = new C43210w(new RecallMeInternalAction.OnPhoneInputChanged(((InterfaceC13403a.f) interfaceC13403a2).f3394a));
        } else if (interfaceC13403a2 instanceof InterfaceC13403a.g) {
            x12 = new C43210w(RecallMeInternalAction.OnPhoneInputResetClicked.f252155b);
        } else {
            if (!(interfaceC13403a2 instanceof InterfaceC13403a.C0186a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(abstractC13405c2 instanceof AbstractC13405c.a)) {
                abstractC13405c2 = null;
            }
            AbstractC13405c.a aVar = (AbstractC13405c.a) abstractC13405c2;
            if (aVar == null) {
                return C43175k.w();
            }
            x12 = new X(new C43152f0(C43175k.G(new d(aVar, this, null)), new e(3, null)), new f(3, null));
        }
        return x12;
    }
}
