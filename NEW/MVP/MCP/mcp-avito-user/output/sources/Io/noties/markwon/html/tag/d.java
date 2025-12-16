package io.noties.markwon.html.tag;

import Q61.p;
import android.text.TextUtils;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import io.noties.markwon.B;
import io.noties.markwon.image.i;
import io.noties.markwon.y;
import j.N;
import j.P;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* compiled from: ImageHandler.java */
/* loaded from: classes8.dex */
public class d extends h {

    /* renamed from: a, reason: collision with root package name */
    public final e f401895a;

    /* compiled from: ImageHandler.java */
    public interface a {
    }

    public d(@N e eVar) {
        this.f401895a = eVar;
    }

    @N
    public static d e() {
        return new d(new e(io.noties.markwon.html.b.a()));
    }

    @Override // io.noties.markwon.html.p
    @N
    public final Collection<String> b() {
        return Collections.singleton("img");
    }

    @Override // io.noties.markwon.html.tag.h
    @P
    public final Object d(@N io.noties.markwon.g gVar, @N y yVar, @N io.noties.markwon.html.f fVar) {
        B bA2;
        i.a aVarA;
        i.a aVarA2;
        String str = fVar.b().get("src");
        io.noties.markwon.image.i iVar = null;
        if (TextUtils.isEmpty(str) || (bA2 = gVar.f401717g.a(p.class)) == null) {
            return null;
        }
        gVar.f401715e.getClass();
        e eVar = this.f401895a;
        Map<String, String> mapB = fVar.b();
        eVar.getClass();
        String str2 = mapB.get(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE);
        if (!TextUtils.isEmpty(str2)) {
            aVarA = null;
            aVarA2 = null;
            for (io.noties.markwon.html.c cVar : eVar.f401896a.b(str2)) {
                String str3 = cVar.f401731a;
                if ("width".equals(str3)) {
                    aVarA = e.a(cVar.f401732b);
                } else if ("height".equals(str3)) {
                    aVarA2 = e.a(cVar.f401732b);
                }
                if (aVarA != null && aVarA2 != null) {
                    break;
                }
            }
        } else {
            aVarA = null;
            aVarA2 = null;
        }
        if (aVarA == null || aVarA2 == null) {
            if (aVarA == null) {
                aVarA = e.a(mapB.get("width"));
            }
            if (aVarA2 == null) {
                aVarA2 = e.a(mapB.get("height"));
            }
            if (aVarA != null || aVarA2 != null) {
                iVar = new io.noties.markwon.image.i(aVarA, aVarA2);
            }
        } else {
            iVar = new io.noties.markwon.image.i(aVarA, aVarA2);
        }
        yVar.a(io.noties.markwon.image.h.f401911a, str);
        yVar.a(io.noties.markwon.image.h.f401913c, iVar);
        yVar.a(io.noties.markwon.image.h.f401912b, Boolean.FALSE);
        return bA2.a(gVar, yVar);
    }
}
