package shark;

import androidx.compose.ui.platform.C22491k0;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.C42822w;
import kotlin.sequences.C43033p;
import kotlin.text.C43066x;
import okhttp3.HttpUrl;
import okio.C44805o;
import shark.LeakTraceObject;
import shark.LeakTraceReference;

/* compiled from: LeakTrace.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lshark/LeakTrace;", "Ljava/io/Serializable;", "a", "GcRootType", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final /* data */ class LeakTrace implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f438099e = new a(null);
    private static final long serialVersionUID = -6315725584154386429L;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GcRootType f438100b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f438101c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LeakTraceObject f438102d;

    /* compiled from: LeakTrace.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lshark/LeakTrace$GcRootType;", "", "a", "shark"}, k = 1, mv = {1, 4, 1})
    public enum GcRootType {
        JNI_GLOBAL("Global variable in native code"),
        JNI_LOCAL("Local variable in native code"),
        JAVA_FRAME("Java local variable"),
        NATIVE_STACK("Input or output parameters in native code"),
        STICKY_CLASS("System class"),
        THREAD_BLOCK("Thread block"),
        MONITOR_USED("Monitor (anything that called the wait() or notify() methods, or that is synchronized.)"),
        THREAD_OBJECT("Thread object"),
        JNI_MONITOR("Root JNI monitor");


        /* renamed from: m, reason: collision with root package name */
        @Y61.k
        public static final a f438113m = new a(null);

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f438114b;

        /* compiled from: LeakTrace.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lshark/LeakTrace$GcRootType$a;", "", "<init>", "()V", "shark"}, k = 1, mv = {1, 4, 1})
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(C42822w c42822w) {
                this();
            }
        }

        GcRootType(String str) {
            this.f438114b = str;
        }
    }

    /* compiled from: LeakTrace.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lshark/LeakTrace$a;", "", "<init>", "()V", "", "ZERO_WIDTH_SPACE", "C", "", "serialVersionUID", "J", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    /* compiled from: LeakTrace.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "element", "Lshark/LeakTraceReference;", "invoke"}, k = 3, mv = {1, 4, 1})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<LeakTraceReference, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f438115l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(LeakTraceReference leakTraceReference) {
            String str;
            LeakTraceReference leakTraceReference2 = leakTraceReference;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(leakTraceReference2.f438132b.f438118c);
            int iOrdinal = leakTraceReference2.f438133c.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                str = leakTraceReference2.f438135e;
            } else if (iOrdinal == 2) {
                str = "<Java Local>";
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "[x]";
            }
            sb2.append(str);
            return sb2.toString();
        }
    }

    public LeakTrace(@Y61.k GcRootType gcRootType, @Y61.k ArrayList arrayList, @Y61.k LeakTraceObject leakTraceObject) {
        this.f438100b = gcRootType;
        this.f438101c = arrayList;
        this.f438102d = leakTraceObject;
    }

    @Y61.l
    public final Integer a() {
        List listSingletonList = Collections.singletonList(this.f438102d);
        ArrayList arrayList = this.f438101c;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((LeakTraceReference) it.next()).f438132b);
        }
        ArrayList arrayListH0 = C42745f0.h0(arrayList2, listSingletonList);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayListH0) {
            if (((LeakTraceObject) obj).f438120e == LeakTraceObject.LeakingStatus.f438125c) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Integer num = ((LeakTraceObject) it2.next()).f438122g;
            if (num != null) {
                arrayList4.add(num);
            }
        }
        return (Integer) C42745f0.W(arrayList4);
    }

    @Y61.l
    public final Integer b() {
        List listSingletonList = Collections.singletonList(this.f438102d);
        ArrayList arrayList = this.f438101c;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((LeakTraceReference) it.next()).f438132b);
        }
        ArrayList arrayListH0 = C42745f0.h0(arrayList2, listSingletonList);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayListH0) {
            if (((LeakTraceObject) obj).f438120e == LeakTraceObject.LeakingStatus.f438125c) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Integer num = ((LeakTraceObject) it2.next()).f438123h;
            if (num != null) {
                arrayList4.add(num);
            }
        }
        return (Integer) C42745f0.W(arrayList4);
    }

    @Y61.k
    public final String c() throws IOException {
        String strW = C43033p.w(C43033p.j(new C42770s0(this.f438101c), new H2(this)), "", b.f438115l, 30);
        C44805o.f420139e.getClass();
        return C44805o.a.c(strW).c("SHA-1").e();
    }

    public final boolean d(int i12) {
        ArrayList arrayList = this.f438101c;
        int iOrdinal = ((LeakTraceReference) arrayList.get(i12)).f438132b.f438120e.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 2) {
                return true;
            }
        } else if (i12 == arrayList.size() - 1 || ((LeakTraceReference) arrayList.get(i12 + 1)).f438132b.f438120e != LeakTraceObject.LeakingStatus.f438124b) {
            return true;
        }
        return false;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeakTrace)) {
            return false;
        }
        LeakTrace leakTrace = (LeakTrace) obj;
        return this.f438100b.equals(leakTrace.f438100b) && this.f438101c.equals(leakTrace.f438101c) && kotlin.jvm.internal.L.f(this.f438102d, leakTrace.f438102d);
    }

    public final int hashCode() {
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f438101c, this.f438100b.hashCode() * 31, 31);
        LeakTraceObject leakTraceObject = this.f438102d;
        return iG2 + (leakTraceObject != null ? leakTraceObject.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        String strE0 = C43066x.E0("\n        ┬───\n        │ GC Root: " + this.f438100b.f438114b + "\n        │\n      ");
        int i12 = 0;
        for (Object obj : this.f438101c) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            LeakTraceReference leakTraceReference = (LeakTraceReference) obj;
            LeakTraceObject leakTraceObject = leakTraceReference.f438132b;
            StringBuilder sbR = androidx.compose.foundation.H.r(androidx.appcompat.app.r.q(strE0, "\n"));
            String strName = leakTraceObject.f438117b.name();
            Locale locale = Locale.US;
            if (strName == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            sbR.append(leakTraceObject.a("├─ ", "│    ", strName.toLowerCase(locale)));
            StringBuilder sbR2 = androidx.compose.foundation.H.r(sbR.toString());
            f438099e.getClass();
            LeakTraceReference.ReferenceType referenceType = LeakTraceReference.ReferenceType.f438137c;
            LeakTraceReference.ReferenceType referenceType2 = leakTraceReference.f438133c;
            String str = referenceType2 == referenceType ? " static" : "";
            StringBuilder sb2 = new StringBuilder("    ↓");
            sb2.append(str);
            sb2.append(' ');
            String strSubstring = leakTraceReference.f438134d;
            int iM2 = C43066x.M('.', 0, 6, strSubstring);
            if (iM2 != -1) {
                strSubstring = strSubstring.substring(iM2 + 1);
            }
            sb2.append(C43066x.X(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, strSubstring));
            int iOrdinal = referenceType2.ordinal();
            sb2.append((iOrdinal == 0 || iOrdinal == 1) ? "." : "");
            String string = sb2.toString();
            int iOrdinal2 = referenceType2.ordinal();
            String strA = leakTraceReference.f438135e;
            if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                if (iOrdinal2 == 2) {
                    strA = "<Java Local>";
                } else {
                    if (iOrdinal2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    strA = C22491k0.a(']', "[", strA);
                }
            }
            String strQ = androidx.appcompat.app.r.q(string, strA);
            sbR2.append(d(i12) ? androidx.camera.core.Q.a("\n│", strQ, "\n│", C43066x.Z(string.length(), " "), C43066x.Z(strA.length(), "~")) : androidx.camera.camera2.internal.G.f("\n│", strQ));
            strE0 = sbR2.toString();
            i12 = i13;
        }
        StringBuilder sbR3 = androidx.compose.foundation.H.r(androidx.appcompat.app.r.q(strE0, "\n"));
        LeakTraceObject leakTraceObject2 = this.f438102d;
        String strName2 = leakTraceObject2.f438117b.name();
        Locale locale2 = Locale.US;
        if (strName2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        sbR3.append(leakTraceObject2.a("╰→ ", "\u200b     ", strName2.toLowerCase(locale2)));
        return sbR3.toString();
    }
}
