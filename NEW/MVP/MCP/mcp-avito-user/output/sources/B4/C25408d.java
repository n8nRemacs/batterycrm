package b4;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IcebreakersEditorState.kt */
@H0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lb4/d;", "", "a", "b", "c", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: b4.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* data */ class C25408d {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f56890g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<c> f56891a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f56892b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f56893c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f56894d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f56895e;

    /* renamed from: f, reason: collision with root package name */
    public final int f56896f;

    /* compiled from: IcebreakersEditorState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb4/d$a;", "", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b4.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IcebreakersEditorState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb4/d$b;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b4.d$b */
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f56897a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Long f56898b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f56899c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f56900d;

        public b(int i12, @l Long l12, @l String str, boolean z12) {
            this.f56897a = i12;
            this.f56898b = l12;
            this.f56899c = str;
            this.f56900d = z12;
        }

        public static b a(b bVar, String str, int i12) {
            int i13 = bVar.f56897a;
            Long l12 = bVar.f56898b;
            if ((i12 & 4) != 0) {
                str = bVar.f56899c;
            }
            boolean z12 = (i12 & 8) != 0 ? bVar.f56900d : false;
            bVar.getClass();
            return new b(i13, l12, str, z12);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f56897a == bVar.f56897a && L.f(this.f56898b, bVar.f56898b) && L.f(this.f56899c, bVar.f56899c) && this.f56900d == bVar.f56900d;
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f56897a) * 31;
            Long l12 = this.f56898b;
            int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
            String str = this.f56899c;
            return Boolean.hashCode(this.f56900d) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("EditorBottomSheet(title=");
            sb2.append(this.f56897a);
            sb2.append(", icebreakerId=");
            sb2.append(this.f56898b);
            sb2.append(", icebreakerText=");
            sb2.append(this.f56899c);
            sb2.append(", isVisible=");
            return r.x(sb2, this.f56900d, ')');
        }
    }

    /* compiled from: IcebreakersEditorState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb4/d$c;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b4.d$c */
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f56901a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f56902b;

        public c(long j12, @k String str) {
            this.f56901a = j12;
            this.f56902b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f56901a == cVar.f56901a && L.f(this.f56902b, cVar.f56902b);
        }

        public final int hashCode() {
            return this.f56902b.hashCode() + (Long.hashCode(this.f56901a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("IcebreakerItem(id=");
            sb2.append(this.f56901a);
            sb2.append(", text=");
            return C22026a.c(sb2, this.f56902b, ')');
        }
    }

    public C25408d(@k List<c> list, @k b bVar, boolean z12, boolean z13, @l Integer num, int i12) {
        this.f56891a = list;
        this.f56892b = bVar;
        this.f56893c = z12;
        this.f56894d = z13;
        this.f56895e = num;
        this.f56896f = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C25408d a(C25408d c25408d, ArrayList arrayList, b bVar, boolean z12, boolean z13, int i12) {
        List list = arrayList;
        if ((i12 & 1) != 0) {
            list = c25408d.f56891a;
        }
        List list2 = list;
        if ((i12 & 2) != 0) {
            bVar = c25408d.f56892b;
        }
        b bVar2 = bVar;
        if ((i12 & 4) != 0) {
            z12 = c25408d.f56893c;
        }
        boolean z14 = z12;
        if ((i12 & 8) != 0) {
            z13 = c25408d.f56894d;
        }
        Integer num = c25408d.f56895e;
        int i13 = c25408d.f56896f;
        c25408d.getClass();
        return new C25408d(list2, bVar2, z14, z13, num, i13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25408d)) {
            return false;
        }
        C25408d c25408d = (C25408d) obj;
        return L.f(this.f56891a, c25408d.f56891a) && L.f(this.f56892b, c25408d.f56892b) && this.f56893c == c25408d.f56893c && this.f56894d == c25408d.f56894d && L.f(this.f56895e, c25408d.f56895e) && this.f56896f == c25408d.f56896f;
    }

    public final int hashCode() {
        int i12 = r.i(r.i((this.f56892b.hashCode() + (this.f56891a.hashCode() * 31)) * 31, 31, this.f56893c), 31, this.f56894d);
        Integer num = this.f56895e;
        return Integer.hashCode(this.f56896f) + ((i12 + (num == null ? 0 : num.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IcebreakersEditorState(icebreakers=");
        sb2.append(this.f56891a);
        sb2.append(", bottomSheetEditorState=");
        sb2.append(this.f56892b);
        sb2.append(", canAddMore=");
        sb2.append(this.f56893c);
        sb2.append(", canDeleteItem=");
        sb2.append(this.f56894d);
        sb2.append(", draggingItemId=");
        sb2.append(this.f56895e);
        sb2.append(", icebreakersLimit=");
        return r.t(sb2, this.f56896f, ')');
    }

    public /* synthetic */ C25408d(List list, b bVar, boolean z12, boolean z13, Integer num, int i12, int i13, C42822w c42822w) {
        this(list, bVar, (i13 & 4) != 0 ? true : z12, (i13 & 8) != 0 ? true : z13, (i13 & 16) != 0 ? null : num, i12);
    }
}
