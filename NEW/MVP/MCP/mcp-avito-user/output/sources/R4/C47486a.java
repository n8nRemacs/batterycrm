package r4;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TopBarAnchorsContainerState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lr4/a;", "", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: r4.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* data */ class C47486a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<C12352a> f429574a;

    /* compiled from: TopBarAnchorsContainerState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lr4/a$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: r4.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12352a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f429575a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AttributedText f429576b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f429577c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Y41.l<C12352a, G0> f429578d;

        /* JADX WARN: Multi-variable type inference failed */
        public C12352a(@l String str, @k AttributedText attributedText, boolean z12, @k Y41.l<? super C12352a, G0> lVar) {
            this.f429575a = str;
            this.f429576b = attributedText;
            this.f429577c = z12;
            this.f429578d = lVar;
        }

        public static C12352a a(C12352a c12352a, boolean z12) {
            return new C12352a(c12352a.f429575a, c12352a.f429576b, z12, c12352a.f429578d);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12352a)) {
                return false;
            }
            C12352a c12352a = (C12352a) obj;
            return L.f(this.f429575a, c12352a.f429575a) && L.f(this.f429576b, c12352a.f429576b) && this.f429577c == c12352a.f429577c && L.f(this.f429578d, c12352a.f429578d);
        }

        public final int hashCode() {
            String str = this.f429575a;
            return this.f429578d.hashCode() + r.i(com.avito.android.actions_sheet.a.b((str == null ? 0 : str.hashCode()) * 31, 31, this.f429576b), 31, this.f429577c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ButtonExtendedState(blockId=");
            sb2.append(this.f429575a);
            sb2.append(", title=");
            sb2.append(this.f429576b);
            sb2.append(", isHighlighted=");
            sb2.append(this.f429577c);
            sb2.append(", onButtonClickListener=");
            return H.l(sb2, this.f429578d, ')');
        }
    }

    public C47486a() {
        this(null, 1, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C47486a) && L.f(this.f429574a, ((C47486a) obj).f429574a);
    }

    public final int hashCode() {
        return this.f429574a.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("TopBarAnchorsContainerState(buttons="), this.f429574a, ')');
    }

    public C47486a(@k List<C12352a> list) {
        this.f429574a = list;
    }

    public C47486a(List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list);
    }
}
