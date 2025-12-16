package d20;

import Y61.k;
import com.avito.android.C34161r;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MortgageInviteFeaturesModule_ProvideMortgageInviteFeaturesFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Ld20/c;", "Ldagger/internal/h;", "Ld20/a;", "a", "_avito_mortgage-invite_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: d20.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C39489c implements h<C39487a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f393628b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<C34161r> f393629a;

    /* compiled from: MortgageInviteFeaturesModule_ProvideMortgageInviteFeaturesFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld20/c$a;", "", "<init>", "()V", "_avito_mortgage-invite_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: d20.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C39489c(@k Provider<C34161r> provider) {
        this.f393629a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f393629a.get();
        f393628b.getClass();
        C39488b.f393627a.getClass();
        return (C39487a) c34161r.f246393a.b(C39487a.class);
    }
}
