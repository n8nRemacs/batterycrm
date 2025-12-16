package eU0;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InteractionGroup.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LeU0/a;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eU0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C40052a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f395221a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final dU0.d f395222b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AbstractC40054c f395223c;

    /* compiled from: InteractionGroup.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LeU0/a$a;", "", "<init>", "()V", "", "KEY_GROUP", "Ljava/lang/String;", "KEY_GROUP_ID", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eU0.a$a, reason: collision with other inner class name */
    public static final class C11085a {
        public /* synthetic */ C11085a(C42822w c42822w) {
            this();
        }

        public C11085a() {
        }
    }

    static {
        new C11085a(null);
    }

    public C40052a(@k String str, @l dU0.d dVar, @k AbstractC40054c abstractC40054c) {
        this.f395221a = str;
        this.f395222b = dVar;
        this.f395223c = abstractC40054c;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40052a)) {
            return false;
        }
        C40052a c40052a = (C40052a) obj;
        return L.f(this.f395221a, c40052a.f395221a) && L.f(this.f395222b, c40052a.f395222b) && L.f(this.f395223c, c40052a.f395223c);
    }

    public final int hashCode() {
        int iHashCode = this.f395221a.hashCode() * 31;
        dU0.d dVar = this.f395222b;
        return this.f395223c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.f393888a.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "InteractionGroup(id=" + this.f395221a + ", scope=" + this.f395222b + ", strategy=" + this.f395223c + ')';
    }
}
