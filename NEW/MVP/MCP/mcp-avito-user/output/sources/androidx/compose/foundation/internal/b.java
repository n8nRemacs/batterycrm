package androidx.compose.foundation.internal;

import Y61.k;
import Y61.l;
import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.X;
import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.font.Z;
import androidx.compose.ui.text.font.e0;
import androidx.compose.ui.text.style.j;
import androidx.compose.ui.text.style.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.w0;
import l0.g;

/* compiled from: ClipboardUtils.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {
    public static final boolean a(@l K0 k02) {
        int i12 = a.f28156a;
        return k02.f41152a.getDescription().hasMimeType("text/*");
    }

    @l
    public static final C22602e b(@k K0 k02) {
        CharSequence text;
        CharSequence charSequence;
        C22602e c22602e;
        Spanned spanned;
        Annotation[] annotationArr;
        int i12;
        byte b12;
        int i13;
        byte b13 = 1;
        int i14 = a.f28156a;
        ClipData.Item itemAt = k02.f41152a.getItemAt(0);
        if (itemAt == null || (text = itemAt.getText()) == null) {
            return null;
        }
        byte b14 = 2;
        if (text instanceof Spanned) {
            Spanned spanned2 = (Spanned) text;
            Annotation[] annotationArr2 = (Annotation[]) spanned2.getSpans(0, text.length(), Annotation.class);
            ArrayList arrayList = new ArrayList();
            int length = annotationArr2.length - 1;
            if (length >= 0) {
                int i15 = 0;
                while (true) {
                    Annotation annotation = annotationArr2[i15];
                    if (L.f(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                        int spanStart = spanned2.getSpanStart(annotation);
                        int spanEnd = spanned2.getSpanEnd(annotation);
                        c cVar = new c(annotation.getValue());
                        g gVar = new g(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
                        while (true) {
                            Parcel parcel = cVar.f28157a;
                            if (parcel.dataAvail() <= b13) {
                                break;
                            }
                            byte b15 = parcel.readByte();
                            if (b15 == b13) {
                                if (parcel.dataAvail() < 8) {
                                    break;
                                }
                                long j12 = parcel.readLong();
                                int i16 = w0.f410662c;
                                T.a aVar = T.f39320b;
                                gVar.f28159a = j12;
                            } else if (b15 == b14) {
                                if (parcel.dataAvail() < 5) {
                                    break;
                                }
                                gVar.f28160b = cVar.a();
                            } else if (b15 == 3) {
                                if (parcel.dataAvail() < 4) {
                                    break;
                                }
                                gVar.f28161c = new e0(parcel.readInt());
                                b14 = 2;
                            } else if (b15 == 4) {
                                if (parcel.dataAvail() < b13) {
                                    break;
                                }
                                byte b16 = parcel.readByte();
                                if (b16 != 0 && b16 == b13) {
                                    Z.f42217b.getClass();
                                    i12 = Z.f42218c;
                                    gVar.f28162d = Z.a(i12);
                                    b14 = 2;
                                } else {
                                    Z.f42217b.getClass();
                                    i12 = 0;
                                    gVar.f28162d = Z.a(i12);
                                    b14 = 2;
                                }
                            } else if (b15 != 5) {
                                if (b15 == 6) {
                                    gVar.f28165g = parcel.readString();
                                } else if (b15 == 7) {
                                    if (parcel.dataAvail() < 5) {
                                        break;
                                    }
                                    gVar.f28166h = cVar.a();
                                } else if (b15 == 8) {
                                    if (parcel.dataAvail() < 4) {
                                        break;
                                    }
                                    gVar.f28167i = androidx.compose.ui.text.style.a.a(parcel.readFloat());
                                } else if (b15 == 9) {
                                    if (parcel.dataAvail() < 8) {
                                        break;
                                    }
                                    gVar.f28168j = new n(parcel.readFloat(), parcel.readFloat());
                                } else if (b15 == 10) {
                                    if (parcel.dataAvail() < 8) {
                                        break;
                                    }
                                    long j13 = parcel.readLong();
                                    int i17 = w0.f410662c;
                                    T.a aVar2 = T.f39320b;
                                    gVar.f28170l = j13;
                                } else if (b15 == 11) {
                                    if (parcel.dataAvail() < 4) {
                                        break;
                                    }
                                    int i18 = parcel.readInt();
                                    j.f42684b.getClass();
                                    j jVar = j.f42687e;
                                    byte b17 = (jVar.f42688a & i18) != 0 ? b13 : (byte) 0;
                                    j jVar2 = j.f42686d;
                                    byte b18 = (i18 & jVar2.f42688a) != 0 ? b13 : (byte) 0;
                                    if (b17 != 0 && b18 != 0) {
                                        List listU = C42745f0.U(jVar, jVar2);
                                        Integer numValueOf = 0;
                                        int size = listU.size();
                                        for (int i19 = 0; i19 < size; i19 += b13) {
                                            numValueOf = Integer.valueOf(numValueOf.intValue() | ((j) listU.get(i19)).f42688a);
                                        }
                                        jVar = new j(numValueOf.intValue());
                                    } else if (b17 == 0) {
                                        jVar = b18 != 0 ? jVar2 : j.f42685c;
                                    }
                                    gVar.f28171m = jVar;
                                } else if (b15 == 12) {
                                    if (parcel.dataAvail() < 20) {
                                        break;
                                    }
                                    long j14 = parcel.readLong();
                                    int i22 = w0.f410662c;
                                    T.a aVar3 = T.f39320b;
                                    g.a aVar4 = l0.g.f413384b;
                                    gVar.f28172n = new f1(j14, (Float.floatToRawIntBits(parcel.readFloat()) << 32) | (Float.floatToRawIntBits(parcel.readFloat()) & 4294967295L), parcel.readFloat(), null);
                                    spanned2 = spanned2;
                                    text = text;
                                    annotationArr2 = annotationArr2;
                                    b13 = 1;
                                }
                                b14 = 2;
                            } else {
                                if (parcel.dataAvail() < b13) {
                                    break;
                                }
                                byte b19 = parcel.readByte();
                                if (b19 == 0) {
                                    C22605a0.f42223b.getClass();
                                    i13 = 0;
                                } else if (b19 == b13) {
                                    C22605a0.f42223b.getClass();
                                    i13 = C22605a0.f42226e;
                                } else if (b19 == 3) {
                                    C22605a0.f42223b.getClass();
                                    i13 = C22605a0.f42225d;
                                } else {
                                    b12 = 2;
                                    if (b19 == 2) {
                                        C22605a0.f42223b.getClass();
                                        i13 = C22605a0.f42224c;
                                    } else {
                                        C22605a0.f42223b.getClass();
                                        i13 = 0;
                                    }
                                    gVar.f28163e = C22605a0.a(i13);
                                    b14 = b12;
                                }
                                b12 = 2;
                                gVar.f28163e = C22605a0.a(i13);
                                b14 = b12;
                            }
                        }
                        charSequence = text;
                        spanned = spanned2;
                        annotationArr = annotationArr2;
                        arrayList.add(new C22602e.C1684e(spanStart, spanEnd, new androidx.compose.ui.text.e0(gVar.f28159a, gVar.f28160b, gVar.f28161c, gVar.f28162d, gVar.f28163e, gVar.f28164f, gVar.f28165g, gVar.f28166h, gVar.f28167i, gVar.f28168j, gVar.f28169k, gVar.f28170l, gVar.f28171m, gVar.f28172n, (X) null, (androidx.compose.ui.graphics.drawscope.j) null, 49152, (C42822w) null)));
                    } else {
                        charSequence = text;
                        spanned = spanned2;
                        annotationArr = annotationArr2;
                    }
                    if (i15 == length) {
                        break;
                    }
                    b13 = 1;
                    i15++;
                    spanned2 = spanned;
                    text = charSequence;
                    annotationArr2 = annotationArr;
                    b14 = 2;
                }
            } else {
                charSequence = text;
            }
            c22602e = new C22602e(charSequence.toString(), arrayList, null, 4, null);
        } else {
            c22602e = new C22602e(text.toString(), null, 2, null);
        }
        return c22602e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.platform.K0 c(@Y61.l androidx.compose.ui.text.C22602e r17) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.internal.b.c(androidx.compose.ui.text.e):androidx.compose.ui.platform.K0");
    }
}
