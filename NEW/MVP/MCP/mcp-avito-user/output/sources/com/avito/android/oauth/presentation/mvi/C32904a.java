package com.avito.android.oauth.presentation.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.arch.mvi.a;
import com.avito.android.oauth.presentation.mvi.entity.OAuthInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import l40.InterfaceC43542a;

/* compiled from: OAuthActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Ll40/a;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "Ll40/c;", "a", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.oauth.presentation.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32904a implements com.avito.android.arch.mvi.a<InterfaceC43542a, OAuthInternalAction, l40.c> {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f208277d = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f208278a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27663a f208279b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final A f208280c;

    /* compiled from: OAuthActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/a$a;", "", "<init>", "()V", "", "AGREEMENT_ARTICLE_ID", "Ljava/lang/String;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.oauth.presentation.mvi.a$a, reason: collision with other inner class name */
    public static final class C6216a {
        public /* synthetic */ C6216a(C42822w c42822w) {
            this();
        }

        public C6216a() {
        }
    }

    static {
        new C6216a(null);
    }

    @Inject
    public C32904a(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC27663a interfaceC27663a, @Y61.k A a12) {
        this.f208278a = aVar;
        this.f208279b = interfaceC27663a;
        this.f208280c = a12;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<OAuthInternalAction> b(InterfaceC43542a interfaceC43542a, l40.c cVar) {
        InterfaceC43542a interfaceC43542a2 = interfaceC43542a;
        l40.c cVar2 = cVar;
        if (interfaceC43542a2 instanceof InterfaceC43542a.i) {
            return C43175k.G(new l(this, interfaceC43542a2, null));
        }
        if (interfaceC43542a2.equals(InterfaceC43542a.g.f413455a)) {
            return C43175k.G(new m(this, null));
        }
        if (interfaceC43542a2.equals(InterfaceC43542a.f.f413454a)) {
            return C43175k.G(new n(this, null));
        }
        if (interfaceC43542a2.equals(InterfaceC43542a.s.f413468a)) {
            return C43175k.G(new o(2, null));
        }
        if (interfaceC43542a2.equals(InterfaceC43542a.c.f413451a)) {
            return C43175k.G(new p(2, null));
        }
        if (interfaceC43542a2.equals(InterfaceC43542a.d.f413452a)) {
            return C43175k.G(new q(2, null));
        }
        if (interfaceC43542a2.equals(InterfaceC43542a.k.f413459a)) {
            return C43175k.G(new r(2, null));
        }
        if (interfaceC43542a2.equals(InterfaceC43542a.j.f413458a)) {
            return C43175k.G(new s(2, null));
        }
        if (interfaceC43542a2.equals(InterfaceC43542a.h.f413456a)) {
            return C43175k.G(new t(2, null));
        }
        if (interfaceC43542a2 instanceof InterfaceC43542a.p) {
            return C43175k.G(new C32905b(interfaceC43542a2, null));
        }
        if (interfaceC43542a2 instanceof InterfaceC43542a.q) {
            return C43175k.G(new C32906c(interfaceC43542a2, null));
        }
        if (interfaceC43542a2 instanceof InterfaceC43542a.r) {
            return C43175k.G(new C32907d(interfaceC43542a2, null));
        }
        if (interfaceC43542a2 instanceof InterfaceC43542a.e) {
            return C43175k.G(new C32908e(2, null));
        }
        if (interfaceC43542a2.equals(InterfaceC43542a.C11770a.f413449a)) {
            return C43175k.G(new C32909f(cVar2, this, null));
        }
        if (interfaceC43542a2 instanceof InterfaceC43542a.b) {
            return C43175k.G(new C32910g(interfaceC43542a2, null));
        }
        if (interfaceC43542a2.equals(InterfaceC43542a.l.f413460a)) {
            return C43175k.G(new C32911h(this, null));
        }
        if (interfaceC43542a2.equals(InterfaceC43542a.m.f413461a)) {
            return C43175k.G(new C32912i(this, null));
        }
        if (interfaceC43542a2.equals(InterfaceC43542a.n.f413462a)) {
            return C43175k.G(new j(this, null));
        }
        if (interfaceC43542a2 instanceof InterfaceC43542a.o) {
            return C43175k.G(new k(this, interfaceC43542a2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
