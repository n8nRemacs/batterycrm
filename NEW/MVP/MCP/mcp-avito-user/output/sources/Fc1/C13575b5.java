package Fc1;

import Fc1.AbstractC13567a6;
import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.C22620n;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: Fc1.b5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13575b5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final D2 f5414a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N7 f5415b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final N7 f5416c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13779y3 f5417d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final kotlin.jvm.internal.N f5418e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ArrayList f5419f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a f5420g = new a();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public xyz.n.a.o4 f5421h = xyz.n.a.o4.f442791b;

    /* renamed from: i, reason: collision with root package name */
    public float f5422i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Typeface f5423j;

    @kotlin.jvm.internal.s0
    /* renamed from: Fc1.b5$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Integer, kotlin.G0> {
        public a() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r3v2, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final kotlin.G0 invoke(Integer num) {
            ?? r32;
            int iIntValue = num.intValue();
            C13575b5 c13575b5 = C13575b5.this;
            Iterator it = c13575b5.f5419f.iterator();
            while (it.hasNext()) {
                AbstractC13567a6.a aVar = (AbstractC13567a6.a) it.next();
                if (aVar.f5392a <= iIntValue && aVar.f5393b >= iIntValue && (r32 = c13575b5.f5418e) != 0) {
                    r32.invoke(aVar.f5394c);
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13575b5(@Y61.k D2 d22, @Y61.k N7 n72, @Y61.k N7 n73, @Y61.k InterfaceC13779y3 interfaceC13779y3, @Y61.l Y41.l<? super String, kotlin.G0> lVar) {
        this.f5414a = d22;
        this.f5415b = n72;
        this.f5416c = n73;
        this.f5417d = interfaceC13779y3;
        this.f5418e = (kotlin.jvm.internal.N) lVar;
    }

    public final D2 a() {
        int iOrdinal = this.f5421h.ordinal();
        if (iOrdinal == 0) {
            return this.f5414a;
        }
        InterfaceC13779y3 interfaceC13779y3 = this.f5417d;
        if (iOrdinal == 1) {
            return interfaceC13779y3.c();
        }
        if (iOrdinal == 2) {
            return interfaceC13779y3.g();
        }
        if (iOrdinal == 3) {
            return interfaceC13779y3.j();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0206  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.text.e0 b(@Y61.k Fc1.AbstractC13567a6 r30) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fc1.C13575b5.b(Fc1.a6):androidx.compose.ui.text.e0");
    }

    public final androidx.compose.ui.text.font.j0 c() {
        Typeface typefaceA = this.f5423j;
        if (typefaceA == null) {
            typefaceA = a().a(Typeface.DEFAULT);
        }
        return C22620n.a(typefaceA);
    }

    public final long d() {
        return androidx.compose.ui.unit.z.e((int) ((a().b().b() * this.f5422i) / Resources.getSystem().getDisplayMetrics().density));
    }
}
