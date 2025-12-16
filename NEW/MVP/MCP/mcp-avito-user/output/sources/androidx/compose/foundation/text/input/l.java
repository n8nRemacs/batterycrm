package androidx.compose.foundation.text.input;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.v0;
import androidx.compose.ui.text.w0;
import com.avito.android.remote.model.ServiceTypeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: TextFieldCharSequence.kt */
@P
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/text/input/l;", "", "text", "Landroidx/compose/ui/text/v0;", "selection", "composition", "Lkotlin/Q;", "Landroidx/compose/foundation/text/input/s;", ServiceTypeKt.SERVICE_HIGHLIGHT, "", "Landroidx/compose/ui/text/e$e;", "Landroidx/compose/ui/text/e$a;", "Landroidx/compose/foundation/text/input/PlacedAnnotation;", "composingAnnotations", "<init>", "(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/v0;Lkotlin/Q;Ljava/util/List;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l implements CharSequence {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final List<C22602e.C1684e<C22602e.a>> f31510b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CharSequence f31511c;

    /* renamed from: d, reason: collision with root package name */
    public final long f31512d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final v0 f31513e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Q<s, v0> f31514f;

    public l() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(CharSequence charSequence, long j12, v0 v0Var, Q q12, List list, C42822w c42822w) {
        this.f31510b = list;
        this.f31511c = charSequence instanceof l ? ((l) charSequence).f31511c : charSequence;
        this.f31512d = w0.b(charSequence.length(), j12);
        this.f31513e = v0Var != null ? v0.a(w0.b(charSequence.length(), v0Var.f42736a)) : null;
        this.f31514f = q12 != null ? new Q<>(q12.f406619b, v0.a(w0.b(charSequence.length(), ((v0) q12.f406620c).f42736a))) : null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i12) {
        return this.f31511c.charAt(i12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return v0.c(this.f31512d, lVar.f31512d) && L.f(this.f31513e, lVar.f31513e) && L.f(this.f31514f, lVar.f31514f) && L.f(this.f31510b, lVar.f31510b) && C43066x.t(this.f31511c, lVar.f31511c);
    }

    public final int hashCode() {
        int iHashCode = this.f31511c.hashCode() * 31;
        v0.a aVar = v0.f42734b;
        int iG2 = androidx.appcompat.app.r.g(iHashCode, 31, this.f31512d);
        v0 v0Var = this.f31513e;
        int iHashCode2 = (iG2 + (v0Var != null ? Long.hashCode(v0Var.f42736a) : 0)) * 31;
        Q<s, v0> q12 = this.f31514f;
        int iHashCode3 = (iHashCode2 + (q12 != null ? q12.hashCode() : 0)) * 31;
        List<C22602e.C1684e<C22602e.a>> list = this.f31510b;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f31511c.length();
    }

    @Override // java.lang.CharSequence
    @Y61.k
    public final CharSequence subSequence(int i12, int i13) {
        return this.f31511c.subSequence(i12, i13);
    }

    @Override // java.lang.CharSequence
    @Y61.k
    public final String toString() {
        return this.f31511c.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l(CharSequence charSequence, long j12, v0 v0Var, Q q12, List list, int i12, C42822w c42822w) {
        long j13;
        CharSequence charSequence2 = (i12 & 1) != 0 ? "" : charSequence;
        if ((i12 & 2) != 0) {
            v0.f42734b.getClass();
            j13 = v0.f42735c;
        } else {
            j13 = j12;
        }
        this(charSequence2, j13, (i12 & 4) != 0 ? null : v0Var, (i12 & 8) != 0 ? null : q12, (i12 & 16) == 0 ? list : null, null);
    }
}
