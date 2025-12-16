package NY;

import NY.f;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MessageListPrivateState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LNY/h;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class h {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final a f11574g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final h f11575h = new h(new f.c(null, null, null, null, false), f.a.C0737a.f11547a, new f.b.d.a(false), new f.b.AbstractC0740b.c(C42784z0.f406748b), f.b.a.C0738a.f11555a, new f.b.c(null));

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f.c f11576a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f.a f11577b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final f.b.d f11578c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final f.b.AbstractC0740b f11579d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final f.b.a f11580e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final f.b.c f11581f;

    /* compiled from: MessageListPrivateState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNY/h$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public h(@Y61.k f.c cVar, @Y61.k f.a aVar, @Y61.k f.b.d dVar, @Y61.k f.b.AbstractC0740b abstractC0740b, @Y61.k f.b.a aVar2, @Y61.k f.b.c cVar2) {
        this.f11576a = cVar;
        this.f11577b = aVar;
        this.f11578c = dVar;
        this.f11579d = abstractC0740b;
        this.f11580e = aVar2;
        this.f11581f = cVar2;
    }

    public static h a(h hVar, f.c cVar, f.a aVar, f.b.d dVar, f.b.AbstractC0740b abstractC0740b, f.b.a aVar2, f.b.c cVar2, int i12) {
        if ((i12 & 1) != 0) {
            cVar = hVar.f11576a;
        }
        f.c cVar3 = cVar;
        if ((i12 & 2) != 0) {
            aVar = hVar.f11577b;
        }
        f.a aVar3 = aVar;
        if ((i12 & 4) != 0) {
            dVar = hVar.f11578c;
        }
        f.b.d dVar2 = dVar;
        if ((i12 & 8) != 0) {
            abstractC0740b = hVar.f11579d;
        }
        f.b.AbstractC0740b abstractC0740b2 = abstractC0740b;
        if ((i12 & 16) != 0) {
            aVar2 = hVar.f11580e;
        }
        f.b.a aVar4 = aVar2;
        if ((i12 & 32) != 0) {
            cVar2 = hVar.f11581f;
        }
        hVar.getClass();
        return new h(cVar3, aVar3, dVar2, abstractC0740b2, aVar4, cVar2);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f11576a, hVar.f11576a) && L.f(this.f11577b, hVar.f11577b) && L.f(this.f11578c, hVar.f11578c) && L.f(this.f11579d, hVar.f11579d) && L.f(this.f11580e, hVar.f11580e) && L.f(this.f11581f, hVar.f11581f);
    }

    public final int hashCode() {
        return this.f11581f.hashCode() + ((this.f11580e.hashCode() + ((this.f11579d.hashCode() + ((this.f11578c.hashCode() + ((this.f11577b.hashCode() + (this.f11576a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "MessageListPrivateState(metaState=" + this.f11576a + ", contextState=" + this.f11577b + ", listTopState=" + this.f11578c + ", listMiddleState=" + this.f11579d + ", listBottomState=" + this.f11580e + ", listSpamActionsState=" + this.f11581f + ')';
    }
}
