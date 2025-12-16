package C21;

import Y41.l;
import Y61.k;
import android.net.Uri;
import androidx.compose.ui.platform.C22491k0;
import com.yandex.div.core.q0;
import com.yandex.div.data.VariableMutationException;
import com.yandex.div.evaluable.types.a;
import com.yandex.div.internal.parser.y;
import j.K;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Variable.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LC21/h;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "LC21/h$f;", "LC21/h$e;", "LC21/h$a;", "LC21/h$d;", "LC21/h$b;", "LC21/h$g;", "LC21/h$c;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final q0<l<h, G0>> f1884a;

    /* compiled from: Variable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LC21/h$a;", "LC21/h;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class a extends h {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f1885b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1886c;

        public a(@k String str, boolean z12) {
            super(null);
            this.f1885b = str;
            this.f1886c = z12;
        }

        @Override // C21.h
        @k
        /* renamed from: a, reason: from getter */
        public final String getF1897b() {
            return this.f1885b;
        }
    }

    /* compiled from: Variable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LC21/h$b;", "LC21/h;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class b extends h {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f1887b;

        /* renamed from: c, reason: collision with root package name */
        public int f1888c;

        public b(@k String str, int i12) {
            super(null);
            this.f1887b = str;
            a.C10920a c10920a = com.yandex.div.evaluable.types.a.f369990b;
            this.f1888c = i12;
        }

        @Override // C21.h
        @k
        /* renamed from: a, reason: from getter */
        public final String getF1897b() {
            return this.f1887b;
        }
    }

    /* compiled from: Variable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LC21/h$c;", "LC21/h;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class c extends h {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f1889b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public JSONObject f1890c;

        public c(@k String str, @k JSONObject jSONObject) {
            super(null);
            this.f1889b = str;
            this.f1890c = jSONObject;
        }

        @Override // C21.h
        @k
        /* renamed from: a, reason: from getter */
        public final String getF1897b() {
            return this.f1889b;
        }
    }

    /* compiled from: Variable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LC21/h$d;", "LC21/h;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class d extends h {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f1891b;

        /* renamed from: c, reason: collision with root package name */
        public double f1892c;

        public d(@k String str, double d12) {
            super(null);
            this.f1891b = str;
            this.f1892c = d12;
        }

        @Override // C21.h
        @k
        /* renamed from: a, reason: from getter */
        public final String getF1897b() {
            return this.f1891b;
        }
    }

    /* compiled from: Variable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LC21/h$e;", "LC21/h;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class e extends h {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f1893b;

        /* renamed from: c, reason: collision with root package name */
        public long f1894c;

        public e(@k String str, long j12) {
            super(null);
            this.f1893b = str;
            this.f1894c = j12;
        }

        @Override // C21.h
        @k
        /* renamed from: a, reason: from getter */
        public final String getF1897b() {
            return this.f1893b;
        }
    }

    /* compiled from: Variable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LC21/h$f;", "LC21/h;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class f extends h {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f1895b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public String f1896c;

        public f(@k String str, @k String str2) {
            super(null);
            this.f1895b = str;
            this.f1896c = str2;
        }

        @Override // C21.h
        @k
        /* renamed from: a, reason: from getter */
        public final String getF1897b() {
            return this.f1895b;
        }
    }

    /* compiled from: Variable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LC21/h$g;", "LC21/h;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class g extends h {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f1897b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public Uri f1898c;

        public g(@k String str, @k Uri uri) {
            super(null);
            this.f1897b = str;
            this.f1898c = uri;
        }

        @Override // C21.h
        @k
        /* renamed from: a, reason: from getter */
        public final String getF1897b() {
            return this.f1897b;
        }
    }

    public /* synthetic */ h(C42822w c42822w) {
        this();
    }

    @k
    /* renamed from: a */
    public abstract String getF1897b();

    @k
    public final Object b() {
        if (this instanceof f) {
            return ((f) this).f1896c;
        }
        if (this instanceof e) {
            return Long.valueOf(((e) this).f1894c);
        }
        if (this instanceof a) {
            return Boolean.valueOf(((a) this).f1886c);
        }
        if (this instanceof d) {
            return Double.valueOf(((d) this).f1892c);
        }
        if (this instanceof b) {
            return com.yandex.div.evaluable.types.a.a(((b) this).f1888c);
        }
        if (this instanceof g) {
            return ((g) this).f1898c;
        }
        if (this instanceof c) {
            return ((c) this).f1890c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void c(@k h hVar) {
        com.yandex.div.internal.a.a();
        Iterator<l<h, G0>> it = this.f1884a.iterator();
        while (it.hasNext()) {
            it.next().invoke(hVar);
        }
    }

    @K
    public final void d(@k String str) {
        if (this instanceof f) {
            f fVar = (f) this;
            if (L.f(fVar.f1896c, str)) {
                return;
            }
            fVar.f1896c = str;
            fVar.c(fVar);
            return;
        }
        boolean zBooleanValue = true;
        if (this instanceof e) {
            e eVar = (e) this;
            try {
                long j12 = Long.parseLong(str);
                if (eVar.f1894c == j12) {
                    return;
                }
                eVar.f1894c = j12;
                eVar.c(eVar);
                return;
            } catch (NumberFormatException e12) {
                throw new VariableMutationException(null, e12, 1, null);
            }
        }
        if (this instanceof a) {
            a aVar = (a) this;
            try {
                Boolean boolV0 = C43066x.v0(str);
                if (boolV0 == null) {
                    try {
                        int i12 = Integer.parseInt(str);
                        l<Object, Integer> lVar = y.f370147a;
                        if (i12 == 0) {
                            zBooleanValue = false;
                        } else if (i12 != 1) {
                            throw new IllegalArgumentException("Unable to convert " + i12 + " to boolean");
                        }
                    } catch (NumberFormatException e13) {
                        throw new VariableMutationException(null, e13, 1, null);
                    }
                } else {
                    zBooleanValue = boolV0.booleanValue();
                }
                if (aVar.f1886c == zBooleanValue) {
                    return;
                }
                aVar.f1886c = zBooleanValue;
                aVar.c(aVar);
                return;
            } catch (IllegalArgumentException e14) {
                throw new VariableMutationException(null, e14, 1, null);
            }
        }
        if (this instanceof d) {
            d dVar = (d) this;
            try {
                double d12 = Double.parseDouble(str);
                if (dVar.f1892c == d12) {
                    return;
                }
                dVar.f1892c = d12;
                dVar.c(dVar);
                return;
            } catch (NumberFormatException e15) {
                throw new VariableMutationException(null, e15, 1, null);
            }
        }
        if (this instanceof b) {
            Integer numInvoke = y.f370147a.invoke(str);
            if (numInvoke == null) {
                throw new VariableMutationException(C22491k0.a('\'', "Wrong value format for color variable: '", str), null, 2, null);
            }
            int iIntValue = numInvoke.intValue();
            b bVar = (b) this;
            a.C10920a c10920a = com.yandex.div.evaluable.types.a.f369990b;
            if (bVar.f1888c == iIntValue) {
                return;
            }
            bVar.f1888c = iIntValue;
            bVar.c(bVar);
            return;
        }
        if (this instanceof g) {
            g gVar = (g) this;
            try {
                Uri uri = Uri.parse(str);
                if (L.f(gVar.f1898c, uri)) {
                    return;
                }
                gVar.f1898c = uri;
                gVar.c(gVar);
                return;
            } catch (IllegalArgumentException e16) {
                throw new VariableMutationException(null, e16, 1, null);
            }
        }
        if (!(this instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        c cVar = (c) this;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (L.f(cVar.f1890c, jSONObject)) {
                return;
            }
            cVar.f1890c = jSONObject;
            cVar.c(cVar);
        } catch (JSONException e17) {
            throw new VariableMutationException(null, e17, 1, null);
        }
    }

    public h() {
        this.f1884a = new q0<>();
    }
}
