package ru.avito.messenger.internal.util;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.C30277e1;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.reflect.n;
import kotlin.text.C43066x;
import l91.C43607c;
import m91.InterfaceC43936c;

/* compiled from: RuntimeTypeAdapter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/util/RuntimeTypeAdapter;", "T", "Lcom/google/gson/h;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class RuntimeTypeAdapter<T> implements h<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f431796a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f431797b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final p<C43607c, com.google.gson.k, T> f431798c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final InterfaceC43936c f431799d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final C30277e1 f431800e;

    public RuntimeTypeAdapter() {
        this(null, null, null, null, null, 31, null);
    }

    public abstract T a(@k com.google.gson.k kVar, @k Type type, @k g gVar);

    @k
    public abstract Map<C43607c, Type> b();

    @Override // com.google.gson.h
    @l
    public final T deserialize(@k i iVar, @k Type type, @k g gVar) throws Exception {
        C30277e1 c30277e1;
        com.google.gson.k kVarI = iVar.i();
        i iVarD = kVarI.D(this.f431796a);
        String strS = iVarD != null ? iVarD.s() : null;
        if (strS == null) {
            strS = "";
        }
        i iVarD2 = kVarI.D(this.f431797b);
        C43607c c43607c = new C43607c(strS, iVarD2 != null ? iVarD2.s() : null);
        Type type2 = b().get(c43607c);
        p<C43607c, com.google.gson.k, T> pVar = this.f431798c;
        try {
            if (type2 != null) {
                return a(kVarI, type2, gVar);
            }
            Type type3 = b().get(new C43607c(strS, null, 2, null));
            if (type3 == null && (c30277e1 = this.f431800e) != null) {
                n<Object> nVar = C30277e1.f144946d1[87];
                if (((Boolean) c30277e1.f144962H0.a().invoke()).booleanValue()) {
                    type3 = b().get(new C43607c(C43066x.o0(strS, ".", strS), null, 2, null));
                }
            }
            if (type3 != null) {
                return a(kVarI, type3, gVar);
            }
            if (pVar != null) {
                return pVar.invoke(c43607c, kVarI);
            }
            return null;
        } catch (Exception e12) {
            InterfaceC43936c interfaceC43936c = this.f431799d;
            if (interfaceC43936c != null) {
                interfaceC43936c.a("RuntimeTypeAdapter", "Failed to parse json", e12);
            }
            if (pVar != null) {
                return pVar.invoke(c43607c, kVarI);
            }
            throw e12;
        }
    }

    public RuntimeTypeAdapter(String str, String str2, p pVar, InterfaceC43936c interfaceC43936c, C30277e1 c30277e1, int i12, C42822w c42822w) {
        str = (i12 & 1) != 0 ? "type" : str;
        str2 = (i12 & 2) != 0 ? "subtype" : str2;
        pVar = (i12 & 4) != 0 ? null : pVar;
        interfaceC43936c = (i12 & 8) != 0 ? null : interfaceC43936c;
        c30277e1 = (i12 & 16) != 0 ? null : c30277e1;
        this.f431796a = str;
        this.f431797b = str2;
        this.f431798c = pVar;
        this.f431799d = interfaceC43936c;
        this.f431800e = c30277e1;
    }
}
