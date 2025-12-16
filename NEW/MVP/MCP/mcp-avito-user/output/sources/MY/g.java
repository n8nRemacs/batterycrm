package MY;

import NY.f;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.mvi.messages.g0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: ChannelState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LMY/g;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class g {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final a f10751h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final g f10752i;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f.c f10753a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f.a f10754b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final f.b.d f10755c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final f.b.AbstractC0740b f10756d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final f.b.a f10757e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final f.b.c f10758f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final g0.c f10759g;

    /* compiled from: ChannelState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMY/g$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        f.c cVar = new f.c(null, null, null, null, false);
        f.a.C0737a c0737a = f.a.C0737a.f11547a;
        f.b.d.a aVar = new f.b.d.a(false);
        f.b.AbstractC0740b.c cVar2 = new f.b.AbstractC0740b.c(C42784z0.f406748b);
        f.b.a.C0738a c0738a = f.b.a.C0738a.f11555a;
        f.b.c cVar3 = new f.b.c(null);
        g0.c.f192968d.getClass();
        f10752i = new g(cVar, c0737a, aVar, cVar2, c0738a, cVar3, g0.c.f192969e);
    }

    public g(@Y61.k f.c cVar, @Y61.k f.a aVar, @Y61.k f.b.d dVar, @Y61.k f.b.AbstractC0740b abstractC0740b, @Y61.k f.b.a aVar2, @Y61.k f.b.c cVar2, @Y61.k g0.c cVar3) {
        this.f10753a = cVar;
        this.f10754b = aVar;
        this.f10755c = dVar;
        this.f10756d = abstractC0740b;
        this.f10757e = aVar2;
        this.f10758f = cVar2;
        this.f10759g = cVar3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f10753a, gVar.f10753a) && L.f(this.f10754b, gVar.f10754b) && L.f(this.f10755c, gVar.f10755c) && L.f(this.f10756d, gVar.f10756d) && L.f(this.f10757e, gVar.f10757e) && L.f(this.f10758f, gVar.f10758f) && L.f(this.f10759g, gVar.f10759g);
    }

    public final int hashCode() {
        return this.f10759g.hashCode() + ((this.f10758f.hashCode() + ((this.f10757e.hashCode() + ((this.f10756d.hashCode() + ((this.f10755c.hashCode() + ((this.f10754b.hashCode() + (this.f10753a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return C43066x.F0("ChannelState(\n            |   metaState=" + this.f10753a + ", \n            |   contextState=" + this.f10754b + ", \n            |   listTopState=" + this.f10755c + ", \n            |   listMiddleState=" + this.f10756d + ", \n            |   listBottomState=" + this.f10757e + ", \n            |   listSpamActionsState=" + this.f10758f + ", \n            |   messageListViewState=" + this.f10759g + "\n            |)");
    }
}
