package androidx.compose.ui.text.input;

import androidx.annotation.RestrictTo;
import androidx.compose.ui.text.InterfaceC22677y;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import y0.C50028a;

/* compiled from: GapBuffer.kt */
@androidx.compose.runtime.internal.P
@InterfaceC22677y
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/input/M;", "", "a", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RestrictTo
/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public String f42361a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public r f42362b;

    /* renamed from: c, reason: collision with root package name */
    public int f42363c;

    /* renamed from: d, reason: collision with root package name */
    public int f42364d;

    /* compiled from: GapBuffer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/input/M$a;", "", "<init>", "()V", "", "BUF_SIZE", "I", "NOWHERE", "SURROUNDING_SIZE", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public final int a() {
        r rVar = this.f42362b;
        if (rVar == null) {
            return this.f42361a.length();
        }
        return (rVar.f42463a - rVar.a()) + (this.f42361a.length() - (this.f42364d - this.f42363c));
    }

    public final void b(int i12, int i13, @Y61.k String str) {
        if (i12 > i13) {
            C50028a.a("start index must be less than or equal to end index: " + i12 + " > " + i13);
        }
        if (i12 < 0) {
            C50028a.a("start must be non-negative, but was " + i12);
        }
        r rVar = this.f42362b;
        if (rVar == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i12, 64);
            int iMin2 = Math.min(this.f42361a.length() - i13, 64);
            int i14 = i12 - iMin;
            this.f42361a.getChars(i14, i12, cArr, 0);
            int i15 = iMax - iMin2;
            int i16 = iMin2 + i13;
            this.f42361a.getChars(i13, i16, cArr, i15);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            r rVar2 = new r();
            rVar2.f42463a = iMax;
            rVar2.f42464b = cArr;
            rVar2.f42465c = length;
            rVar2.f42466d = i15;
            this.f42362b = rVar2;
            this.f42363c = i14;
            this.f42364d = i16;
            return;
        }
        int i17 = this.f42363c;
        int i18 = i12 - i17;
        int i19 = i13 - i17;
        if (i18 < 0 || i19 > rVar.f42463a - rVar.a()) {
            this.f42361a = toString();
            this.f42362b = null;
            this.f42363c = -1;
            this.f42364d = -1;
            b(i12, i13, str);
            return;
        }
        int length2 = str.length() - (i19 - i18);
        if (length2 > rVar.a()) {
            int iA2 = length2 - rVar.a();
            int i22 = rVar.f42463a;
            do {
                i22 *= 2;
            } while (i22 - rVar.f42463a < iA2);
            char[] cArr2 = new char[i22];
            C42756l.m(rVar.f42464b, cArr2, 0, 0, rVar.f42465c);
            int i23 = rVar.f42463a;
            int i24 = rVar.f42466d;
            int i25 = i23 - i24;
            int i26 = i22 - i25;
            C42756l.m(rVar.f42464b, cArr2, i26, i24, i25 + i24);
            rVar.f42464b = cArr2;
            rVar.f42463a = i22;
            rVar.f42466d = i26;
        }
        int i27 = rVar.f42465c;
        if (i18 < i27 && i19 <= i27) {
            int i28 = i27 - i19;
            char[] cArr3 = rVar.f42464b;
            C42756l.m(cArr3, cArr3, rVar.f42466d - i28, i19, i27);
            rVar.f42465c = i18;
            rVar.f42466d -= i28;
        } else if (i18 >= i27 || i19 < i27) {
            int iA3 = i18 + rVar.a();
            int iA4 = i19 + rVar.a();
            int i29 = rVar.f42466d;
            char[] cArr4 = rVar.f42464b;
            C42756l.m(cArr4, cArr4, rVar.f42465c, i29, iA3);
            rVar.f42465c += iA3 - i29;
            rVar.f42466d = iA4;
        } else {
            rVar.f42466d = i19 + rVar.a();
            rVar.f42465c = i18;
        }
        str.getChars(0, str.length(), rVar.f42464b, rVar.f42465c);
        rVar.f42465c = str.length() + rVar.f42465c;
    }

    @Y61.k
    public final String toString() {
        r rVar = this.f42362b;
        if (rVar == null) {
            return this.f42361a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) this.f42361a, 0, this.f42363c);
        sb2.append(rVar.f42464b, 0, rVar.f42465c);
        char[] cArr = rVar.f42464b;
        int i12 = rVar.f42466d;
        sb2.append(cArr, i12, rVar.f42463a - i12);
        String str = this.f42361a;
        sb2.append((CharSequence) str, this.f42364d, str.length());
        return sb2.toString();
    }
}
