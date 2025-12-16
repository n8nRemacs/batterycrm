package gh0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.rating_form.api.remote.model.ButtonStyle;
import com.avito.android.remote.model.text.AttributedText;
import gh0.InterfaceC40682a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DialogState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lgh0/c;", "", "a", "b", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gh0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C40684c {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final b f396716e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final C40684c f396717f;

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f396718a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f396719b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<a> f396720c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC40682a f396721d;

    /* compiled from: DialogState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgh0/c$b;", "", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gh0.c$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f396717f = new C40684c(null, new AttributedText("", c42784z0, 0, 4, null), c42784z0, new InterfaceC40682a.b(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
    }

    public C40684c(@l String str, @k AttributedText attributedText, @k List<a> list, @k InterfaceC40682a interfaceC40682a) {
        this.f396718a = str;
        this.f396719b = attributedText;
        this.f396720c = list;
        this.f396721d = interfaceC40682a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40684c)) {
            return false;
        }
        C40684c c40684c = (C40684c) obj;
        return L.f(this.f396718a, c40684c.f396718a) && L.f(this.f396719b, c40684c.f396719b) && L.f(this.f396720c, c40684c.f396720c) && L.f(this.f396721d, c40684c.f396721d);
    }

    public final int hashCode() {
        String str = this.f396718a;
        return this.f396721d.hashCode() + H.e(com.avito.android.actions_sheet.a.b((str == null ? 0 : str.hashCode()) * 31, 31, this.f396719b), 31, this.f396720c);
    }

    @k
    public final String toString() {
        return "DialogState(title=" + this.f396718a + ", content=" + this.f396719b + ", actionButtons=" + this.f396720c + ", closeAction=" + this.f396721d + ')';
    }

    /* compiled from: DialogState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgh0/c$a;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gh0.c$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f396722a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ButtonStyle f396723b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final InterfaceC40682a f396724c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f396725d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f396726e;

        public a(@k String str, @k ButtonStyle buttonStyle, @k InterfaceC40682a interfaceC40682a, boolean z12, boolean z13) {
            this.f396722a = str;
            this.f396723b = buttonStyle;
            this.f396724c = interfaceC40682a;
            this.f396725d = z12;
            this.f396726e = z13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f396722a, aVar.f396722a) && this.f396723b == aVar.f396723b && L.f(this.f396724c, aVar.f396724c) && this.f396725d == aVar.f396725d && this.f396726e == aVar.f396726e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f396726e) + r.i((this.f396724c.hashCode() + ((this.f396723b.hashCode() + (this.f396722a.hashCode() * 31)) * 31)) * 31, 31, this.f396725d);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActionButton(title=");
            sb2.append(this.f396722a);
            sb2.append(", style=");
            sb2.append(this.f396723b);
            sb2.append(", action=");
            sb2.append(this.f396724c);
            sb2.append(", loading=");
            sb2.append(this.f396725d);
            sb2.append(", canShowLoading=");
            return r.x(sb2, this.f396726e, ')');
        }

        public /* synthetic */ a(String str, ButtonStyle buttonStyle, InterfaceC40682a interfaceC40682a, boolean z12, boolean z13, int i12, C42822w c42822w) {
            this(str, buttonStyle, interfaceC40682a, (i12 & 8) != 0 ? false : z12, z13);
        }
    }
}
