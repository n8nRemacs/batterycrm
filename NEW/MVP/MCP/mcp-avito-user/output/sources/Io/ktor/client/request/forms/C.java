package io.ktor.client.request.forms;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.client.request.forms.D;
import io.ktor.http.C41519f0;
import io.ktor.http.C41524i;
import io.ktor.http.content.p;
import io.ktor.http.content.t;
import io.ktor.utils.io.InterfaceC41649d1;
import io.ktor.utils.io.core.C41640m;
import io.ktor.utils.io.core.G;
import io.ktor.utils.io.core.S;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43044a;
import kotlin.text.C43047d;
import kotlin.text.C43066x;

/* compiled from: FormDataContent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/request/forms/C;", "Lio/ktor/http/content/p$e;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class C extends p.e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C41524i f399722a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final byte[] f399723b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final byte[] f399724c;

    /* renamed from: d, reason: collision with root package name */
    public final int f399725d;

    /* renamed from: e, reason: collision with root package name */
    public final int f399726e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ArrayList f399727f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Long f399728g;

    /* compiled from: FormDataContent.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.request.forms.MultiPartFormDataContent", f = "FormDataContent.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 6}, l = {116, 117, 118, 123, 127, 131, 134}, m = "writeTo", n = {"this", "channel", "part", "this", "channel", "part", "this", "channel", "part", "this", "channel", "$this$use$iv", "closed$iv", "this", "channel", "this", "channel", "channel"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "I$0", "L$0", "L$1", "L$0", "L$1", "L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public Object f399729q;

        /* renamed from: r, reason: collision with root package name */
        public InterfaceC41649d1 f399730r;

        /* renamed from: s, reason: collision with root package name */
        public Iterator f399731s;

        /* renamed from: t, reason: collision with root package name */
        public Object f399732t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f399733u;

        /* renamed from: w, reason: collision with root package name */
        public int f399735w;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f399733u = obj;
            this.f399735w |= BeduinInputModel.MIN_TEXT_VERSION;
            return C.this.e(null, this);
        }
    }

    public C() {
        throw null;
    }

    public C(List list, String str, C41524i c41524i, int i12, C42822w c42822w) {
        Object aVar;
        if ((i12 & 2) != 0) {
            byte[] bArr = n.f399745a;
            StringBuilder sb2 = new StringBuilder();
            for (int i13 = 0; i13 < 32; i13++) {
                kotlin.random.f.f406882b.getClass();
                int i14 = kotlin.random.f.f406883c.i();
                C43044a.a(16);
                sb2.append(Integer.toString(i14, 16));
            }
            str = C43066x.t0(70, sb2.toString());
        }
        if ((i12 & 4) != 0) {
            C41524i.g.f400038a.getClass();
            c41524i = C41524i.g.f400039b.c("boundary", str);
        }
        this.f399722a = c41524i;
        String strK = AK.c.k("--", str, "\r\n");
        Charset charset = C43047d.f410589b;
        byte[] bytes = L.f(charset, charset) ? strK.getBytes(charset) : W31.a.c(charset.newEncoder(), strK, strK.length());
        this.f399723b = bytes;
        String strK2 = AK.c.k("--", str, "--\r\n");
        byte[] bytes2 = L.f(charset, charset) ? strK2.getBytes(charset) : W31.a.c(charset.newEncoder(), strK2, strK2.length());
        this.f399724c = bytes2;
        this.f399725d = bytes2.length;
        this.f399726e = (n.f399745a.length * 2) + bytes.length;
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            Long l12 = null;
            if (!it.hasNext()) {
                this.f399727f = arrayList;
                Long lValueOf = 0L;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        l12 = lValueOf;
                        break;
                    }
                    Long l13 = ((D) it2.next()).f399737b;
                    if (l13 == null) {
                        break;
                    } else {
                        lValueOf = lValueOf != null ? Long.valueOf(l13.longValue() + lValueOf.longValue()) : null;
                    }
                }
                this.f399728g = l12 != null ? Long.valueOf(l12.longValue() + this.f399725d) : l12;
                return;
            }
            io.ktor.http.content.t tVar = (io.ktor.http.content.t) it.next();
            C41640m c41640m = new C41640m(null, 1, null);
            for (Map.Entry<String, List<String>> entry : tVar.f399986b.b()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                StringBuilder sbZ = androidx.appcompat.app.r.z(key, ": ");
                sbZ.append(C42745f0.O(value, "; ", null, null, null, 62));
                S.d(c41640m, sbZ.toString());
                byte[] bArr2 = n.f399745a;
                G.b(c41640m, bArr2, 0, bArr2.length);
            }
            C41519f0.f400005a.getClass();
            String str2 = tVar.f399986b.get(C41519f0.f400013i);
            Long lValueOf2 = str2 != null ? Long.valueOf(Long.parseLong(str2)) : null;
            if (tVar instanceof t.c) {
                aVar = new D.b(S.b(c41640m.y()), null, lValueOf2 != null ? Long.valueOf(lValueOf2.longValue() + this.f399726e + r0.length) : null);
            } else if (tVar instanceof t.b) {
                aVar = new D.b(S.b(c41640m.y()), null, lValueOf2 != null ? Long.valueOf(lValueOf2.longValue() + this.f399726e + r0.length) : null);
            } else {
                if (tVar instanceof t.d) {
                    C41640m c41640m2 = new C41640m(null, 1, null);
                    try {
                        S.d(c41640m2, null);
                        throw null;
                    } catch (Throwable th2) {
                        c41640m2.close();
                        throw th2;
                    }
                }
                if (!(tVar instanceof t.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new D.a(S.b(c41640m.y()), lValueOf2 != null ? Long.valueOf(lValueOf2.longValue() + this.f399726e + r0.length) : null, null);
            }
            arrayList.add(aVar);
        }
    }

    @Override // io.ktor.http.content.p
    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Long getF399728g() {
        return this.f399728g;
    }

    @Override // io.ktor.http.content.p
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final C41524i getF399722a() {
        return this.f399722a;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0032, B:44:0x00b7, B:46:0x00bd, B:50:0x00d9, B:53:0x00ed, B:80:0x0145, B:86:0x0162, B:43:0x00b0), top: B:97:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0108 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:57:0x0104, B:59:0x0108, B:61:0x0112, B:66:0x012b, B:77:0x0140, B:84:0x015c, B:85:0x0161, B:74:0x013b, B:32:0x007e, B:37:0x0093, B:40:0x00a6, B:68:0x0131, B:72:0x0139, B:71:0x0136, B:62:0x0114, B:65:0x0129, B:27:0x006a), top: B:97:0x0023, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0140 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:57:0x0104, B:59:0x0108, B:61:0x0112, B:66:0x012b, B:77:0x0140, B:84:0x015c, B:85:0x0161, B:74:0x013b, B:32:0x007e, B:37:0x0093, B:40:0x00a6, B:68:0x0131, B:72:0x0139, B:71:0x0136, B:62:0x0114, B:65:0x0129, B:27:0x006a), top: B:97:0x0023, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0158 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0162 A[Catch: all -> 0x0037, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0032, B:44:0x00b7, B:46:0x00bd, B:50:0x00d9, B:53:0x00ed, B:80:0x0145, B:86:0x0162, B:43:0x00b0), top: B:97:0x0023 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0159 -> B:20:0x0047). Please report as a decompilation issue!!! */
    @Override // io.ktor.http.content.p.e
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@Y61.k io.ktor.utils.io.InterfaceC41649d1 r9, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r10) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.request.forms.C.e(io.ktor.utils.io.d1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
