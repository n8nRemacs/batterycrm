package ru.avito.messenger.internal.gson.adapter;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.C30277e1;
import com.avito.android.socketEvents.SocketEventParser;
import com.avito.android.util.C2;
import com.google.gson.JsonParseException;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import k91.AbstractC42547e;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlin.text.C43066x;
import mx0.InterfaceC44149a;
import mx0.c;

/* compiled from: SocketEventMessageTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/gson/adapter/SocketEventMessageTypeAdapter;", "Lcom/google/gson/h;", "Lk91/e$s;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SocketEventMessageTypeAdapter implements h<AbstractC42547e.s> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Set<c> f431706a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C30277e1 f431707b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f431708c;

    public SocketEventMessageTypeAdapter(@k Set<c> set, @l C30277e1 c30277e1) {
        this.f431706a = set;
        this.f431707b = c30277e1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String str = ((c) obj).f414831b.f414833a;
            Object objR = linkedHashMap.get(str);
            if (objR == null) {
                objR = e.r(linkedHashMap, str);
            }
            ((List) objR).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), ((c) C42745f0.E((List) entry.getValue())).f414832c);
        }
        this.f431708c = linkedHashMap2;
    }

    @Override // com.google.gson.h
    public final AbstractC42547e.s deserialize(i iVar, Type type, g gVar) {
        Object next;
        com.google.gson.k kVarI = iVar.i();
        Long lB2 = C2.b(kVarI, "id");
        String strS = kVarI.i().D("type").s();
        i iVarD = kVarI.D("subType");
        SocketEventParser socketEventParser = null;
        String strS2 = (iVarD == null || (iVarD instanceof j)) ? null : iVarD.s();
        SocketEventParser socketEventParser2 = (SocketEventParser) this.f431708c.get(strS);
        if (socketEventParser2 == null) {
            C30277e1 c30277e1 = this.f431707b;
            if (c30277e1 != null) {
                n<Object> nVar = C30277e1.f144946d1[87];
                if (((Boolean) c30277e1.f144962H0.a().invoke()).booleanValue()) {
                    String strN0 = C43066x.n0('.', strS, strS);
                    Iterator<T> it = this.f431706a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        c cVar = (c) next;
                        mx0.e eVar = cVar.f414831b;
                        Locale locale = Locale.ROOT;
                        if (eVar.f414833a.toLowerCase(locale).equals(strN0.toLowerCase(locale)) && cVar.f414831b.f414835c) {
                            break;
                        }
                    }
                    c cVar2 = (c) next;
                    if (cVar2 != null) {
                        socketEventParser = cVar2.f414832c;
                    }
                }
            }
            if (socketEventParser == null) {
                throw new JsonParseException("Parser for type not found");
            }
            socketEventParser2 = socketEventParser;
        }
        return new AbstractC42547e.s(lB2, socketEventParser2.deserialize(kVarI.D("value"), InterfaceC44149a.class, gVar), new mx0.e(strS, strS2, false, 4, null));
    }
}
