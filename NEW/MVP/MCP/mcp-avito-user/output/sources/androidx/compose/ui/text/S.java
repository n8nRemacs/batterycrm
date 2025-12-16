package androidx.compose.ui.text;

import androidx.compose.runtime.F3;
import androidx.compose.runtime.H0;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.style.e;
import androidx.compose.ui.text.style.f;
import androidx.compose.ui.text.style.i;
import androidx.compose.ui.text.style.k;
import androidx.compose.ui.unit.y;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import y0.C50028a;

/* compiled from: ParagraphStyle.kt */
@H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015Bs\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0016B7\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0014\u0010\u0017BO\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0014\u0010\u0018Bg\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/S;", "Landroidx/compose/ui/text/e$a;", "Landroidx/compose/ui/text/style/i;", "textAlign", "Landroidx/compose/ui/text/style/k;", "textDirection", "Landroidx/compose/ui/unit/y;", "lineHeight", "Landroidx/compose/ui/text/style/p;", "textIndent", "Landroidx/compose/ui/text/W;", "platformStyle", "Landroidx/compose/ui/text/style/h;", "lineHeightStyle", "Landroidx/compose/ui/text/style/f;", "lineBreak", "Landroidx/compose/ui/text/style/e;", "hyphens", "Landroidx/compose/ui/text/style/r;", "textMotion", "<init>", "(IIJLandroidx/compose/ui/text/style/p;Landroidx/compose/ui/text/W;Landroidx/compose/ui/text/style/h;IILandroidx/compose/ui/text/style/r;Lkotlin/jvm/internal/w;)V", "(Landroidx/compose/ui/text/style/i;Landroidx/compose/ui/text/style/k;JLandroidx/compose/ui/text/style/p;Landroidx/compose/ui/text/W;Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/f;Landroidx/compose/ui/text/style/e;Landroidx/compose/ui/text/style/r;Lkotlin/jvm/internal/w;)V", "(Landroidx/compose/ui/text/style/i;Landroidx/compose/ui/text/style/k;JLandroidx/compose/ui/text/style/p;Lkotlin/jvm/internal/w;)V", "(Landroidx/compose/ui/text/style/i;Landroidx/compose/ui/text/style/k;JLandroidx/compose/ui/text/style/p;Landroidx/compose/ui/text/W;Landroidx/compose/ui/text/style/h;Lkotlin/jvm/internal/w;)V", "(Landroidx/compose/ui/text/style/i;Landroidx/compose/ui/text/style/k;JLandroidx/compose/ui/text/style/p;Landroidx/compose/ui/text/W;Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/f;Landroidx/compose/ui/text/style/e;Lkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class S implements C22602e.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f41942a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41943b;

    /* renamed from: c, reason: collision with root package name */
    public final long f41944c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.ui.text.style.p f41945d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final W f41946e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.ui.text.style.h f41947f;

    /* renamed from: g, reason: collision with root package name */
    public final int f41948g;

    /* renamed from: h, reason: collision with root package name */
    public final int f41949h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.ui.text.style.r f41950i;

    public S(int i12, int i13, long j12, androidx.compose.ui.text.style.p pVar, W w12, androidx.compose.ui.text.style.h hVar, int i14, int i15, androidx.compose.ui.text.style.r rVar, C42822w c42822w) {
        this.f41942a = i12;
        this.f41943b = i13;
        this.f41944c = j12;
        this.f41945d = pVar;
        this.f41946e = w12;
        this.f41947f = hVar;
        this.f41948g = i14;
        this.f41949h = i15;
        this.f41950i = rVar;
        androidx.compose.ui.unit.y.f42874b.getClass();
        if (androidx.compose.ui.unit.y.b(j12, androidx.compose.ui.unit.y.f42876d) || androidx.compose.ui.unit.y.d(j12) >= 0.0f) {
            return;
        }
        C50028a.c("lineHeight can't be negative (" + androidx.compose.ui.unit.y.d(j12) + ')');
    }

    @F3
    @Y61.k
    public final S a(@Y61.l S s5) {
        if (s5 == null) {
            return this;
        }
        return T.a(this, s5.f41942a, s5.f41943b, s5.f41944c, s5.f41945d, s5.f41946e, s5.f41947f, s5.f41948g, s5.f41949h, s5.f41950i);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s5 = (S) obj;
        if (!androidx.compose.ui.text.style.i.b(this.f41942a, s5.f41942a) || !androidx.compose.ui.text.style.k.b(this.f41943b, s5.f41943b) || !androidx.compose.ui.unit.y.b(this.f41944c, s5.f41944c) || !kotlin.jvm.internal.L.f(this.f41945d, s5.f41945d) || !kotlin.jvm.internal.L.f(this.f41946e, s5.f41946e) || !kotlin.jvm.internal.L.f(this.f41947f, s5.f41947f)) {
            return false;
        }
        f.a aVar = androidx.compose.ui.text.style.f.f42639b;
        return this.f41948g == s5.f41948g && androidx.compose.ui.text.style.e.b(this.f41949h, s5.f41949h) && kotlin.jvm.internal.L.f(this.f41950i, s5.f41950i);
    }

    public final int hashCode() {
        i.a aVar = androidx.compose.ui.text.style.i.f42675b;
        int iHashCode = Integer.hashCode(this.f41942a) * 31;
        k.a aVar2 = androidx.compose.ui.text.style.k.f42689b;
        int iE2 = androidx.appcompat.app.r.e(this.f41943b, iHashCode, 31);
        y.a aVar3 = androidx.compose.ui.unit.y.f42874b;
        int iG2 = androidx.appcompat.app.r.g(iE2, 31, this.f41944c);
        androidx.compose.ui.text.style.p pVar = this.f41945d;
        int iHashCode2 = (iG2 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        W w12 = this.f41946e;
        int iHashCode3 = (iHashCode2 + (w12 != null ? w12.hashCode() : 0)) * 31;
        androidx.compose.ui.text.style.h hVar = this.f41947f;
        int iHashCode4 = (iHashCode3 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        f.a aVar4 = androidx.compose.ui.text.style.f.f42639b;
        int iE3 = androidx.appcompat.app.r.e(this.f41948g, iHashCode4, 31);
        e.a aVar5 = androidx.compose.ui.text.style.e.f42634b;
        int iE4 = androidx.appcompat.app.r.e(this.f41949h, iE3, 31);
        androidx.compose.ui.text.style.r rVar = this.f41950i;
        return iE4 + (rVar != null ? rVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) androidx.compose.ui.text.style.i.c(this.f41942a)) + ", textDirection=" + ((Object) androidx.compose.ui.text.style.k.c(this.f41943b)) + ", lineHeight=" + ((Object) androidx.compose.ui.unit.y.f(this.f41944c)) + ", textIndent=" + this.f41945d + ", platformStyle=" + this.f41946e + ", lineHeightStyle=" + this.f41947f + ", lineBreak=" + ((Object) androidx.compose.ui.text.style.f.b(this.f41948g)) + ", hyphens=" + ((Object) androidx.compose.ui.text.style.e.c(this.f41949h)) + ", textMotion=" + this.f41950i + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public S(int i12, int i13, long j12, androidx.compose.ui.text.style.p pVar, W w12, androidx.compose.ui.text.style.h hVar, int i14, int i15, androidx.compose.ui.text.style.r rVar, int i16, C42822w c42822w) {
        int i17;
        int i18;
        long j13;
        int i19;
        int i22;
        if ((i16 & 1) != 0) {
            androidx.compose.ui.text.style.i.f42675b.getClass();
            i17 = androidx.compose.ui.text.style.i.f42682i;
        } else {
            i17 = i12;
        }
        if ((i16 & 2) != 0) {
            androidx.compose.ui.text.style.k.f42689b.getClass();
            i18 = androidx.compose.ui.text.style.k.f42695h;
        } else {
            i18 = i13;
        }
        if ((i16 & 4) != 0) {
            androidx.compose.ui.unit.y.f42874b.getClass();
            j13 = androidx.compose.ui.unit.y.f42876d;
        } else {
            j13 = j12;
        }
        androidx.compose.ui.text.style.p pVar2 = (i16 & 8) != 0 ? null : pVar;
        W w13 = (i16 & 16) != 0 ? null : w12;
        androidx.compose.ui.text.style.h hVar2 = (i16 & 32) != 0 ? null : hVar;
        if ((i16 & 64) != 0) {
            androidx.compose.ui.text.style.f.f42639b.getClass();
            i19 = 0;
        } else {
            i19 = i14;
        }
        if ((i16 & 128) != 0) {
            androidx.compose.ui.text.style.e.f42634b.getClass();
            i22 = androidx.compose.ui.text.style.e.f42637e;
        } else {
            i22 = i15;
        }
        this(i17, i18, j13, pVar2, w13, hVar2, i19, i22, (i16 & 256) == 0 ? rVar : null, (C42822w) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public S(androidx.compose.ui.text.style.i iVar, androidx.compose.ui.text.style.k kVar, long j12, androidx.compose.ui.text.style.p pVar, W w12, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar, androidx.compose.ui.text.style.e eVar, androidx.compose.ui.text.style.r rVar, int i12, C42822w c42822w) {
        long j13;
        androidx.compose.ui.text.style.i iVar2 = (i12 & 1) != 0 ? null : iVar;
        androidx.compose.ui.text.style.k kVar2 = (i12 & 2) != 0 ? null : kVar;
        if ((i12 & 4) != 0) {
            androidx.compose.ui.unit.y.f42874b.getClass();
            j13 = androidx.compose.ui.unit.y.f42876d;
        } else {
            j13 = j12;
        }
        this(iVar2, kVar2, j13, (i12 & 8) != 0 ? null : pVar, (i12 & 16) != 0 ? null : w12, (i12 & 32) != 0 ? null : hVar, (i12 & 64) != 0 ? null : fVar, (i12 & 128) != 0 ? null : eVar, (i12 & 256) == 0 ? rVar : null, (C42822w) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @InterfaceC42830m
    public S(androidx.compose.ui.text.style.i iVar, androidx.compose.ui.text.style.k kVar, long j12, androidx.compose.ui.text.style.p pVar, W w12, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar, androidx.compose.ui.text.style.e eVar, androidx.compose.ui.text.style.r rVar, C42822w c42822w) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (iVar != null) {
            i12 = iVar.f42683a;
        } else {
            androidx.compose.ui.text.style.i.f42675b.getClass();
            i12 = androidx.compose.ui.text.style.i.f42682i;
        }
        if (kVar != null) {
            i13 = kVar.f42696a;
        } else {
            androidx.compose.ui.text.style.k.f42689b.getClass();
            i13 = androidx.compose.ui.text.style.k.f42695h;
        }
        int i16 = i13;
        if (fVar != null) {
            i14 = fVar.f42641a;
        } else {
            androidx.compose.ui.text.style.f.f42639b.getClass();
            i14 = 0;
        }
        int i17 = i14;
        if (eVar != null) {
            i15 = eVar.f42638a;
        } else {
            androidx.compose.ui.text.style.e.f42634b.getClass();
            i15 = androidx.compose.ui.text.style.e.f42637e;
        }
        this(i12, i16, j12, pVar, w12, hVar, i17, i15, rVar, (C42822w) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public S(androidx.compose.ui.text.style.i iVar, androidx.compose.ui.text.style.k kVar, long j12, androidx.compose.ui.text.style.p pVar, int i12, C42822w c42822w) {
        androidx.compose.ui.text.style.i iVar2 = (i12 & 1) != 0 ? null : iVar;
        androidx.compose.ui.text.style.k kVar2 = (i12 & 2) != 0 ? null : kVar;
        if ((i12 & 4) != 0) {
            androidx.compose.ui.unit.y.f42874b.getClass();
            j12 = androidx.compose.ui.unit.y.f42876d;
        }
        this(iVar2, kVar2, j12, (i12 & 8) != 0 ? null : pVar, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @InterfaceC42830m
    public S(androidx.compose.ui.text.style.i iVar, androidx.compose.ui.text.style.k kVar, long j12, androidx.compose.ui.text.style.p pVar, C42822w c42822w) {
        int i12;
        int i13;
        if (iVar != null) {
            i12 = iVar.f42683a;
        } else {
            androidx.compose.ui.text.style.i.f42675b.getClass();
            i12 = androidx.compose.ui.text.style.i.f42682i;
        }
        int i14 = i12;
        if (kVar != null) {
            i13 = kVar.f42696a;
        } else {
            androidx.compose.ui.text.style.k.f42689b.getClass();
            i13 = androidx.compose.ui.text.style.k.f42695h;
        }
        int i15 = i13;
        androidx.compose.ui.text.style.f.f42639b.getClass();
        androidx.compose.ui.text.style.e.f42634b.getClass();
        this(i14, i15, j12, pVar, (W) null, (androidx.compose.ui.text.style.h) null, 0, androidx.compose.ui.text.style.e.f42637e, (androidx.compose.ui.text.style.r) null, (C42822w) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public S(androidx.compose.ui.text.style.i iVar, androidx.compose.ui.text.style.k kVar, long j12, androidx.compose.ui.text.style.p pVar, W w12, androidx.compose.ui.text.style.h hVar, int i12, C42822w c42822w) {
        long j13;
        androidx.compose.ui.text.style.i iVar2 = (i12 & 1) != 0 ? null : iVar;
        androidx.compose.ui.text.style.k kVar2 = (i12 & 2) != 0 ? null : kVar;
        if ((i12 & 4) != 0) {
            androidx.compose.ui.unit.y.f42874b.getClass();
            j13 = androidx.compose.ui.unit.y.f42876d;
        } else {
            j13 = j12;
        }
        this(iVar2, kVar2, j13, (i12 & 8) != 0 ? null : pVar, (i12 & 16) != 0 ? null : w12, (i12 & 32) == 0 ? hVar : null, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @InterfaceC42830m
    public S(androidx.compose.ui.text.style.i iVar, androidx.compose.ui.text.style.k kVar, long j12, androidx.compose.ui.text.style.p pVar, W w12, androidx.compose.ui.text.style.h hVar, C42822w c42822w) {
        int i12;
        int i13;
        if (iVar != null) {
            i12 = iVar.f42683a;
        } else {
            androidx.compose.ui.text.style.i.f42675b.getClass();
            i12 = androidx.compose.ui.text.style.i.f42682i;
        }
        int i14 = i12;
        if (kVar != null) {
            i13 = kVar.f42696a;
        } else {
            androidx.compose.ui.text.style.k.f42689b.getClass();
            i13 = androidx.compose.ui.text.style.k.f42695h;
        }
        int i15 = i13;
        androidx.compose.ui.text.style.f.f42639b.getClass();
        androidx.compose.ui.text.style.e.f42634b.getClass();
        this(i14, i15, j12, pVar, w12, hVar, 0, androidx.compose.ui.text.style.e.f42637e, (androidx.compose.ui.text.style.r) null, (C42822w) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public S(androidx.compose.ui.text.style.i iVar, androidx.compose.ui.text.style.k kVar, long j12, androidx.compose.ui.text.style.p pVar, W w12, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar, androidx.compose.ui.text.style.e eVar, int i12, C42822w c42822w) {
        long j13;
        androidx.compose.ui.text.style.i iVar2 = (i12 & 1) != 0 ? null : iVar;
        androidx.compose.ui.text.style.k kVar2 = (i12 & 2) != 0 ? null : kVar;
        if ((i12 & 4) != 0) {
            androidx.compose.ui.unit.y.f42874b.getClass();
            j13 = androidx.compose.ui.unit.y.f42876d;
        } else {
            j13 = j12;
        }
        this(iVar2, kVar2, j13, (i12 & 8) != 0 ? null : pVar, (i12 & 16) != 0 ? null : w12, (i12 & 32) != 0 ? null : hVar, (i12 & 64) != 0 ? null : fVar, (i12 & 128) == 0 ? eVar : null, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @InterfaceC42830m
    public S(androidx.compose.ui.text.style.i iVar, androidx.compose.ui.text.style.k kVar, long j12, androidx.compose.ui.text.style.p pVar, W w12, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar, androidx.compose.ui.text.style.e eVar, C42822w c42822w) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (iVar != null) {
            i12 = iVar.f42683a;
        } else {
            androidx.compose.ui.text.style.i.f42675b.getClass();
            i12 = androidx.compose.ui.text.style.i.f42682i;
        }
        if (kVar != null) {
            i13 = kVar.f42696a;
        } else {
            androidx.compose.ui.text.style.k.f42689b.getClass();
            i13 = androidx.compose.ui.text.style.k.f42695h;
        }
        int i16 = i13;
        if (fVar != null) {
            i14 = fVar.f42641a;
        } else {
            androidx.compose.ui.text.style.f.f42639b.getClass();
            i14 = 0;
        }
        int i17 = i14;
        if (eVar != null) {
            i15 = eVar.f42638a;
        } else {
            androidx.compose.ui.text.style.e.f42634b.getClass();
            i15 = androidx.compose.ui.text.style.e.f42637e;
        }
        this(i12, i16, j12, pVar, w12, hVar, i17, i15, (androidx.compose.ui.text.style.r) null, (C42822w) null);
    }
}
