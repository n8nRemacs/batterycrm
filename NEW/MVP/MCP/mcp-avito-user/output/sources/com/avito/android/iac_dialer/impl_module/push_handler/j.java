package com.avito.android.iac_dialer.impl_module.push_handler;

import Y61.k;
import Y61.l;
import com.google.gson.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ParsingUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j {
    @l
    public static final com.google.gson.i a(@k com.google.gson.i iVar, @k String str, @k Y41.l<? super String, G0> lVar) {
        try {
            if (!(iVar instanceof com.google.gson.k)) {
                lVar.invoke(str);
                return null;
            }
            if (iVar.i().f362194b.containsKey(str)) {
                return iVar.i().D(str);
            }
            lVar.invoke(str);
            return null;
        } catch (Exception unused) {
            lVar.invoke(str);
            return null;
        }
    }

    @l
    public static final String c(@k com.google.gson.i iVar, @k String str, @k Y41.l<? super String, G0> lVar) {
        try {
            if (!(iVar instanceof com.google.gson.k)) {
                lVar.invoke(str);
                return null;
            }
            if (!iVar.i().f362194b.containsKey(str)) {
                lVar.invoke(str);
                return null;
            }
            com.google.gson.i iVarD = iVar.i().D(str);
            iVarD.getClass();
            if ((iVarD instanceof m) && (iVar.i().D(str).j().f362195b instanceof String)) {
                return iVar.i().D(str).j().s();
            }
            lVar.invoke(str);
            return null;
        } catch (Exception unused) {
            lVar.invoke(str);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final ArrayList d(@k com.google.gson.i iVar, @k Y41.l lVar) {
        try {
            if (!(iVar instanceof com.google.gson.k)) {
                lVar.invoke("tags");
                return null;
            }
            if (!iVar.i().f362194b.containsKey("tags")) {
                return null;
            }
            com.google.gson.i iVarD = iVar.i().D("tags");
            iVarD.getClass();
            if (!(iVarD instanceof com.google.gson.f)) {
                lVar.invoke("tags");
                return null;
            }
            com.google.gson.f fVarH = iVar.i().D("tags").h();
            if (!(fVarH instanceof Collection) || !((Collection) fVarH).isEmpty()) {
                Iterator it = fVarH.f362000b.iterator();
                while (it.hasNext()) {
                    com.google.gson.i iVar2 = (com.google.gson.i) it.next();
                    iVar2.getClass();
                    if (!(iVar2 instanceof m) || !(iVar2.j().f362195b instanceof String)) {
                        lVar.invoke("tags");
                        return null;
                    }
                }
            }
            com.google.gson.f fVarH2 = iVar.i().D("tags").h();
            ArrayList arrayList = new ArrayList(C42745f0.q(fVarH2, 10));
            Iterator it2 = fVarH2.f362000b.iterator();
            while (it2.hasNext()) {
                arrayList.add(((com.google.gson.i) it2.next()).j().s());
            }
            return arrayList;
        } catch (Exception unused) {
            lVar.invoke("tags");
            return null;
        }
    }
}
