package okio.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import okio.AbstractC44811v;
import okio.S;

/* compiled from: ResourceFileSystem.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lkotlin/Q;", "Lokio/v;", "Lokio/S;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class o extends N implements Y41.a<List<? extends Q<? extends AbstractC44811v, ? extends S>>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f420100l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar) {
        super(0);
        this.f420100l = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x024f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0250, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0252, code lost:
    
        kotlin.io.c.a(r11, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0255, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x025d, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d1, code lost:
    
        r8 = r7.f() & 65535;
        r13 = r7.f() & 65535;
        r14 = r7.f() & 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e8, code lost:
    
        r24 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f3, code lost:
    
        if (r14 != (r7.f() & 65535)) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f5, code lost:
    
        if (r8 != 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f7, code lost:
    
        if (r13 != 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fb, code lost:
    
        r7.skip(4);
        r0 = r7.f() & 65535;
        r1 = new okio.internal.l(r14, r7.c() & 4294967295L, r0);
        r7.d4(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0121, code lost:
    
        r7.close();
        r10 = r10 - 20;
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x012c, code lost:
    
        if (r10 <= 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012e, code lost:
    
        r8 = new okio.Y(r9.d(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013e, code lost:
    
        if (r8.c() != 117853008) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0140, code lost:
    
        r1 = r8.c();
        r10 = r8.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014d, code lost:
    
        if (r8.c() != 1) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014f, code lost:
    
        if (r1 != 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0151, code lost:
    
        r7 = new okio.Y(r9.d(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015a, code lost:
    
        r1 = r7.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0161, code lost:
    
        if (r1 != 101075792) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0163, code lost:
    
        r7.skip(12);
        r1 = r7.c();
        r10 = r7.c();
        r26 = r7.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x017a, code lost:
    
        if (r26 != r7.d()) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x017c, code lost:
    
        if (r1 != 0) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x017e, code lost:
    
        if (r10 != 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0180, code lost:
    
        r7.skip(8);
        r1 = new okio.internal.l(r26, r7.d(), r0);
        r0 = kotlin.G0.f406611a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0195, code lost:
    
        kotlin.io.c.a(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0199, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x019c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01a4, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01cb, code lost:
    
        throw new java.io.IOException("bad zip: expected " + okio.internal.v.b(101075792) + " but was " + okio.internal.v.b(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d8, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d9, code lost:
    
        r0 = kotlin.G0.f406611a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01dc, code lost:
    
        kotlin.io.c.a(r8, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01eb, code lost:
    
        r7 = r1.f420091b;
        r0 = new java.util.ArrayList();
        r11 = new okio.Y(r9.d(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01fb, code lost:
    
        r12 = r1.f420090a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ff, code lost:
    
        if (r16 >= r12) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0201, code lost:
    
        r1 = okio.internal.v.c(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0209, code lost:
    
        if (r1.f420108g >= r7) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0215, code lost:
    
        if (((java.lang.Boolean) r5.invoke(r1)).booleanValue() == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0217, code lost:
    
        r0.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x021b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x021e, code lost:
    
        r16 = r16 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x022a, code lost:
    
        throw new java.io.IOException("bad zip: local file header offset >= central directory offset");
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x022b, code lost:
    
        r1 = kotlin.G0.f406611a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x022e, code lost:
    
        kotlin.io.c.a(r11, null);
        r5 = new okio.l0(r3, r6, okio.internal.v.a(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x023a, code lost:
    
        kotlin.io.c.a(r9, null);
        r0 = new kotlin.Q(r5, okio.internal.n.f420096f);
     */
    /* JADX WARN: Finally extract failed */
    @Override // Y41.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<? extends kotlin.Q<? extends okio.AbstractC44811v, ? extends okio.S>> invoke() {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.o.invoke():java.lang.Object");
    }
}
