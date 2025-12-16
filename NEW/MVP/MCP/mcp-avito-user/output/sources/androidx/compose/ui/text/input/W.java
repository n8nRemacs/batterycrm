package androidx.compose.ui.text.input;

import androidx.compose.runtime.H0;
import androidx.compose.ui.text.C22579b0;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.v0;
import androidx.compose.ui.text.w0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: TextFieldValue.kt */
@H0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB)\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/input/W;", "", "Landroidx/compose/ui/text/e;", "annotatedString", "Landroidx/compose/ui/text/v0;", "selection", "composition", "<init>", "(Landroidx/compose/ui/text/e;JLandroidx/compose/ui/text/v0;Lkotlin/jvm/internal/w;)V", "", "text", "(Ljava/lang/String;JLandroidx/compose/ui/text/v0;Lkotlin/jvm/internal/w;)V", "c", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class W {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final c f42381d = new c(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.runtime.saveable.w f42382e;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C22602e f42383a;

    /* renamed from: b, reason: collision with root package name */
    public final long f42384b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final v0 f42385c;

    /* compiled from: TextFieldValue.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/x;", "Landroidx/compose/ui/text/input/W;", "it", "", "invoke", "(Landroidx/compose/runtime/saveable/x;Landroidx/compose/ui/text/input/W;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.saveable.x, W, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f42386l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Object invoke(androidx.compose.runtime.saveable.x xVar, W w12) {
            androidx.compose.runtime.saveable.x xVar2 = xVar;
            W w13 = w12;
            return C42745f0.j(C22579b0.a(w13.f42383a, C22579b0.f42046a, xVar2), C22579b0.a(v0.a(w13.f42384b), C22579b0.f42061p, xVar2));
        }
    }

    /* compiled from: TextFieldValue.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/input/W;", "invoke", "(Ljava/lang/Object;)Landroidx/compose/ui/text/input/W;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, W> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f42387l = new b();

        public b() {
            super(1);
        }

        public static W a(Object obj) {
            List list = (List) obj;
            Object obj2 = list.get(0);
            androidx.compose.runtime.saveable.w wVar = C22579b0.f42046a;
            Boolean bool = Boolean.FALSE;
            v0 v0Var = null;
            C22602e c22602e = ((!kotlin.jvm.internal.L.f(obj2, bool) || (wVar instanceof androidx.compose.ui.text.K)) && obj2 != null) ? (C22602e) wVar.f38610b.invoke(obj2) : null;
            Object obj3 = list.get(1);
            v0.a aVar = v0.f42734b;
            androidx.compose.runtime.saveable.w wVar2 = C22579b0.f42061p;
            if ((!kotlin.jvm.internal.L.f(obj3, bool) || (wVar2 instanceof androidx.compose.ui.text.K)) && obj3 != null) {
                v0Var = (v0) wVar2.f38610b.invoke(obj3);
            }
            return new W(c22602e, v0Var.f42736a, (v0) null, 4, (C42822w) null);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ W invoke(Object obj) {
            return a(obj);
        }
    }

    /* compiled from: TextFieldValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/input/W$c;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    static {
        a aVar = a.f42386l;
        b bVar = b.f42387l;
        androidx.compose.runtime.saveable.w wVar = androidx.compose.runtime.saveable.v.f38606a;
        f42382e = new androidx.compose.runtime.saveable.w(bVar, aVar);
    }

    public W(C22602e c22602e, long j12, v0 v0Var, C42822w c42822w) {
        this.f42383a = c22602e;
        this.f42384b = w0.b(c22602e.f42127c.length(), j12);
        this.f42385c = v0Var != null ? v0.a(w0.b(c22602e.f42127c.length(), v0Var.f42736a)) : null;
    }

    public static W a(W w12, C22602e c22602e, long j12, int i12) {
        if ((i12 & 1) != 0) {
            c22602e = w12.f42383a;
        }
        C22602e c22602e2 = c22602e;
        if ((i12 & 2) != 0) {
            j12 = w12.f42384b;
        }
        long j13 = j12;
        v0 v0Var = (i12 & 4) != 0 ? w12.f42385c : null;
        w12.getClass();
        return new W(c22602e2, j13, v0Var, (C42822w) null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w12 = (W) obj;
        return v0.c(this.f42384b, w12.f42384b) && kotlin.jvm.internal.L.f(this.f42385c, w12.f42385c) && kotlin.jvm.internal.L.f(this.f42383a, w12.f42383a);
    }

    public final int hashCode() {
        int iHashCode = this.f42383a.hashCode() * 31;
        v0.a aVar = v0.f42734b;
        int iG2 = androidx.appcompat.app.r.g(iHashCode, 31, this.f42384b);
        v0 v0Var = this.f42385c;
        return iG2 + (v0Var != null ? Long.hashCode(v0Var.f42736a) : 0);
    }

    @Y61.k
    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f42383a) + "', selection=" + ((Object) v0.i(this.f42384b)) + ", composition=" + this.f42385c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public W(C22602e c22602e, long j12, v0 v0Var, int i12, C42822w c42822w) {
        if ((i12 & 2) != 0) {
            v0.f42734b.getClass();
            j12 = v0.f42735c;
        }
        this(c22602e, j12, (i12 & 4) != 0 ? null : v0Var, (C42822w) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public W(String str, long j12, v0 v0Var, int i12, C42822w c42822w) {
        String str2 = (i12 & 1) != 0 ? "" : str;
        if ((i12 & 2) != 0) {
            v0.f42734b.getClass();
            j12 = v0.f42735c;
        }
        this(str2, j12, (i12 & 4) != 0 ? null : v0Var, (C42822w) null);
    }

    public W(String str, long j12, v0 v0Var, C42822w c42822w) {
        this(new C22602e(str, null, 2, null), j12, v0Var, (C42822w) null);
    }
}
