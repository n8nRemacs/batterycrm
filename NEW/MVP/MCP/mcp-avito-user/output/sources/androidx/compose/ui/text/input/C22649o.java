package androidx.compose.ui.text.input;

import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.v0;
import androidx.compose.ui.text.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import y0.C50028a;

/* compiled from: EditingBuffer.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/input/o;", "", "Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/text/v0;", "selection", "<init>", "(Landroidx/compose/ui/text/e;JLkotlin/jvm/internal/w;)V", "", "(Ljava/lang/String;JLkotlin/jvm/internal/w;)V", "a", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.input.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22649o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final M f42458a;

    /* renamed from: b, reason: collision with root package name */
    public int f42459b;

    /* renamed from: c, reason: collision with root package name */
    public int f42460c;

    /* renamed from: d, reason: collision with root package name */
    public int f42461d;

    /* renamed from: e, reason: collision with root package name */
    public int f42462e;

    /* compiled from: EditingBuffer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/input/o$a;", "", "<init>", "()V", "", "NOWHERE", "I", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.input.o$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public C22649o(C22602e c22602e, long j12, C42822w c42822w) {
        String str = c22602e.f42127c;
        M m12 = new M();
        m12.f42361a = str;
        m12.f42363c = -1;
        m12.f42364d = -1;
        this.f42458a = m12;
        this.f42459b = v0.g(j12);
        this.f42460c = v0.f(j12);
        this.f42461d = -1;
        this.f42462e = -1;
        int iG2 = v0.g(j12);
        int iF2 = v0.f(j12);
        String str2 = c22602e.f42127c;
        if (iG2 < 0 || iG2 > str2.length()) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(iG2, "start (", ") offset is outside of text region ");
            sbJ.append(str2.length());
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        if (iF2 < 0 || iF2 > str2.length()) {
            StringBuilder sbJ2 = androidx.camera.camera2.internal.G.j(iF2, "end (", ") offset is outside of text region ");
            sbJ2.append(str2.length());
            throw new IndexOutOfBoundsException(sbJ2.toString());
        }
        if (iG2 > iF2) {
            throw new IllegalArgumentException(androidx.compose.foundation.H.j(iG2, iF2, "Do not set reversed range: ", " > "));
        }
    }

    public final void a(int i12, int i13) {
        long jA2 = w0.a(i12, i13);
        this.f42458a.b(i12, i13, "");
        long jA3 = C22650p.a(w0.a(this.f42459b, this.f42460c), jA2);
        j(v0.g(jA3));
        i(v0.f(jA3));
        if (e()) {
            long jA4 = C22650p.a(w0.a(this.f42461d, this.f42462e), jA2);
            if (v0.d(jA4)) {
                this.f42461d = -1;
                this.f42462e = -1;
            } else {
                this.f42461d = v0.g(jA4);
                this.f42462e = v0.f(jA4);
            }
        }
    }

    public final char b(int i12) {
        M m12 = this.f42458a;
        r rVar = m12.f42362b;
        if (rVar == null) {
            return m12.f42361a.charAt(i12);
        }
        if (i12 < m12.f42363c) {
            return m12.f42361a.charAt(i12);
        }
        int iA2 = rVar.f42463a - rVar.a();
        int i13 = m12.f42363c;
        if (i12 >= iA2 + i13) {
            return m12.f42361a.charAt(i12 - ((iA2 - m12.f42364d) + i13));
        }
        int i14 = i12 - i13;
        int i15 = rVar.f42465c;
        return i14 < i15 ? rVar.f42464b[i14] : rVar.f42464b[(i14 - i15) + rVar.f42466d];
    }

    @Y61.l
    public final v0 c() {
        if (e()) {
            return v0.a(w0.a(this.f42461d, this.f42462e));
        }
        return null;
    }

    public final int d() {
        int i12 = this.f42459b;
        int i13 = this.f42460c;
        if (i12 == i13) {
            return i13;
        }
        return -1;
    }

    public final boolean e() {
        return this.f42461d != -1;
    }

    public final void f(int i12, int i13, @Y61.k String str) {
        M m12 = this.f42458a;
        if (i12 < 0 || i12 > m12.a()) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "start (", ") offset is outside of text region ");
            sbJ.append(m12.a());
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        if (i13 < 0 || i13 > m12.a()) {
            StringBuilder sbJ2 = androidx.camera.camera2.internal.G.j(i13, "end (", ") offset is outside of text region ");
            sbJ2.append(m12.a());
            throw new IndexOutOfBoundsException(sbJ2.toString());
        }
        if (i12 > i13) {
            throw new IllegalArgumentException(androidx.compose.foundation.H.j(i12, i13, "Do not set reversed range: ", " > "));
        }
        m12.b(i12, i13, str);
        j(str.length() + i12);
        i(str.length() + i12);
        this.f42461d = -1;
        this.f42462e = -1;
    }

    public final void g(int i12, int i13) {
        M m12 = this.f42458a;
        if (i12 < 0 || i12 > m12.a()) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "start (", ") offset is outside of text region ");
            sbJ.append(m12.a());
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        if (i13 < 0 || i13 > m12.a()) {
            StringBuilder sbJ2 = androidx.camera.camera2.internal.G.j(i13, "end (", ") offset is outside of text region ");
            sbJ2.append(m12.a());
            throw new IndexOutOfBoundsException(sbJ2.toString());
        }
        if (i12 >= i13) {
            throw new IllegalArgumentException(androidx.compose.foundation.H.j(i12, i13, "Do not set reversed or empty range: ", " > "));
        }
        this.f42461d = i12;
        this.f42462e = i13;
    }

    public final void h(int i12, int i13) {
        M m12 = this.f42458a;
        if (i12 < 0 || i12 > m12.a()) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "start (", ") offset is outside of text region ");
            sbJ.append(m12.a());
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        if (i13 < 0 || i13 > m12.a()) {
            StringBuilder sbJ2 = androidx.camera.camera2.internal.G.j(i13, "end (", ") offset is outside of text region ");
            sbJ2.append(m12.a());
            throw new IndexOutOfBoundsException(sbJ2.toString());
        }
        if (i12 > i13) {
            throw new IllegalArgumentException(androidx.compose.foundation.H.j(i12, i13, "Do not set reversed range: ", " > "));
        }
        j(i12);
        i(i13);
    }

    public final void i(int i12) {
        if (!(i12 >= 0)) {
            C50028a.a("Cannot set selectionEnd to a negative value: " + i12);
        }
        this.f42460c = i12;
    }

    public final void j(int i12) {
        if (!(i12 >= 0)) {
            C50028a.a("Cannot set selectionStart to a negative value: " + i12);
        }
        this.f42459b = i12;
    }

    @Y61.k
    public final String toString() {
        return this.f42458a.toString();
    }

    public C22649o(String str, long j12, C42822w c42822w) {
        this(new C22602e(str, null, 2, null), j12, (C42822w) null);
    }
}
