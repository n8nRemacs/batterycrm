package Pj;

import Rj.C15047a;
import Y61.k;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import u3.AbstractC48780d;
import u3.j;

/* compiled from: AiAssistantNavbarTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LPj/a;", "Lu3/d;", "Lcom/avito/android/ab_tests/groups/SimpleTestGroupWithNone;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pj.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14791a extends AbstractC48780d<SimpleTestGroupWithNone> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C15047a f13251a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f13252b = "ai-assistant-buyer-FnF";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13253c = true;

    /* compiled from: AiAssistantNavbarTestConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pj.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0861a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<SimpleTestGroupWithNone> f13254a = kotlin.enums.c.a(SimpleTestGroupWithNone.values());
    }

    public C14791a(@k C15047a c15047a) {
        this.f13251a = c15047a;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF13253c() {
        return this.f13253c;
    }

    @Override // u3.InterfaceC48778b
    @k
    /* renamed from: b, reason: from getter */
    public final String getF13259b() {
        return this.f13252b;
    }

    @Override // u3.AbstractC48780d
    public final j c() {
        C15047a c15047a = this.f13251a;
        c15047a.getClass();
        n<Object> nVar = C15047a.f14573m[3];
        return d(((OptionSet) c15047a.f14577e.a().invoke()).f318873b);
    }

    @Override // u3.AbstractC48780d
    public final j[] e() {
        return (SimpleTestGroupWithNone[]) ((AbstractC42734a) C0861a.f13254a).toArray(new SimpleTestGroupWithNone[0]);
    }

    @Override // u3.AbstractC48780d
    public final j f() {
        return SimpleTestGroupWithNone.f67969c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        C15047a c15047a = this.f13251a;
        c15047a.getClass();
        n<Object> nVar = C15047a.f14573m[2];
        return ((Boolean) c15047a.f14576d.a().invoke()).booleanValue();
    }
}
