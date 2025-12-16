package y10;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.F3;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InputItem.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ly10/b;", "", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: y10.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C50037b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PrintableText f442842a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final d f442843b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f442844c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final f f442845d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final e f442846e;

    public C50037b(@k PrintableText printableText, @l d dVar, @l String str, @k f fVar, @k e eVar) {
        this.f442842a = printableText;
        this.f442843b = dVar;
        this.f442844c = str;
        this.f442845d = fVar;
        this.f442846e = eVar;
    }

    public static C50037b a(C50037b c50037b, d dVar, String str, f fVar, e eVar, int i12) {
        PrintableText printableText = c50037b.f442842a;
        if ((i12 & 2) != 0) {
            dVar = c50037b.f442843b;
        }
        d dVar2 = dVar;
        if ((i12 & 4) != 0) {
            str = c50037b.f442844c;
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            fVar = c50037b.f442845d;
        }
        f fVar2 = fVar;
        if ((i12 & 16) != 0) {
            eVar = c50037b.f442846e;
        }
        c50037b.getClass();
        return new C50037b(printableText, dVar2, str2, fVar2, eVar);
    }

    @k
    public final C50037b b(float f12) {
        d dVar = this.f442843b;
        return a(this, dVar != null ? new d(dVar.f442849a, dVar.f442850b, f12) : null, null, null, null, 29);
    }

    @k
    public final C50037b c(@k String str) {
        return a(this, null, null, null, new e(str, this.f442846e.f442853b), 15);
    }

    @k
    public final C50037b d(long j12) {
        return a(this, null, null, null, new e(String.valueOf(j12), j12), 15);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50037b)) {
            return false;
        }
        C50037b c50037b = (C50037b) obj;
        return L.f(this.f442842a, c50037b.f442842a) && L.f(this.f442843b, c50037b.f442843b) && L.f(this.f442844c, c50037b.f442844c) && L.f(this.f442845d, c50037b.f442845d) && L.f(this.f442846e, c50037b.f442846e);
    }

    public final int hashCode() {
        int iHashCode = this.f442842a.hashCode() * 31;
        d dVar = this.f442843b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f442844c;
        return this.f442846e.hashCode() + ((this.f442845d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "InputItem(title=" + this.f442842a + ", slider=" + this.f442843b + ", fieldEndText=" + this.f442844c + ", limits=" + this.f442845d + ", value=" + this.f442846e + ')';
    }
}
