package P;

import Y61.k;
import androidx.compose.foundation.text.input.internal.undo.TextDeleteType;
import androidx.compose.foundation.text.input.internal.undo.TextEditType;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.saveable.u;
import androidx.compose.runtime.saveable.x;
import androidx.compose.ui.text.v0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextUndoOperation.kt */
@P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LP/a;", "", "", "index", "", "preText", "postText", "Landroidx/compose/ui/text/v0;", "preSelection", "postSelection", "", "timeInMillis", "", "canMerge", "<init>", "(ILjava/lang/String;Ljava/lang/String;JJJZLkotlin/jvm/internal/w;)V", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final b f12748i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final C0825a f12749j = new C0825a();

    /* renamed from: a, reason: collision with root package name */
    public final int f12750a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f12751b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f12752c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12753d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12754e;

    /* renamed from: f, reason: collision with root package name */
    public final long f12755f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12756g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextEditType f12757h;

    /* compiled from: TextUndoOperation.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"P/a$a", "Landroidx/compose/runtime/saveable/u;", "LP/a;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: P.a$a, reason: collision with other inner class name */
    public static final class C0825a implements u<a, Object> {
        @Override // androidx.compose.runtime.saveable.u
        public final Object a(x xVar, a aVar) {
            a aVar2 = aVar;
            Integer numValueOf = Integer.valueOf(aVar2.f12750a);
            v0.a aVar3 = v0.f42734b;
            long j12 = aVar2.f12753d;
            Integer numValueOf2 = Integer.valueOf((int) (j12 >> 32));
            Integer numValueOf3 = Integer.valueOf((int) (j12 & 4294967295L));
            long j13 = aVar2.f12754e;
            return C42745f0.U(numValueOf, aVar2.f12751b, aVar2.f12752c, numValueOf2, numValueOf3, Integer.valueOf((int) (j13 >> 32)), Integer.valueOf((int) (j13 & 4294967295L)), Long.valueOf(aVar2.f12755f));
        }
    }

    /* compiled from: TextUndoOperation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LP/a$b;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public a(int i12, String str, String str2, long j12, long j13, long j14, boolean z12, int i13, C42822w c42822w) {
        this(i12, str, str2, j12, j13, (i13 & 32) != 0 ? System.currentTimeMillis() : j14, (i13 & 64) != 0 ? true : z12, null);
    }

    @k
    public final TextDeleteType a() {
        if (this.f12757h != TextEditType.f31473c) {
            return TextDeleteType.f31469e;
        }
        long j12 = this.f12754e;
        if (!v0.d(j12)) {
            return TextDeleteType.f31469e;
        }
        long j13 = this.f12753d;
        return v0.d(j13) ? ((int) (j13 >> 32)) > ((int) (j12 >> 32)) ? TextDeleteType.f31466b : TextDeleteType.f31467c : (((int) (j13 >> 32)) == ((int) (j12 >> 32)) && ((int) (j13 >> 32)) == this.f12750a) ? TextDeleteType.f31468d : TextDeleteType.f31469e;
    }

    public a(int i12, String str, String str2, long j12, long j13, long j14, boolean z12, C42822w c42822w) {
        TextEditType textEditType;
        this.f12750a = i12;
        this.f12751b = str;
        this.f12752c = str2;
        this.f12753d = j12;
        this.f12754e = j13;
        this.f12755f = j14;
        this.f12756g = z12;
        if (str.length() == 0 && str2.length() == 0) {
            throw new IllegalArgumentException("Either pre or post text must not be empty");
        }
        if (str.length() != 0 || str2.length() <= 0) {
            textEditType = (str.length() <= 0 || str2.length() != 0) ? TextEditType.f31474d : TextEditType.f31473c;
        } else {
            textEditType = TextEditType.f31472b;
        }
        this.f12757h = textEditType;
    }
}
