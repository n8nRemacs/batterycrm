package Fc1;

import java.util.LinkedHashMap;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
@kotlin.jvm.internal.s0
/* renamed from: Fc1.p1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13697p1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f5742a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f5743b = new LinkedHashMap();

    @Inject
    public C13697p1() {
    }

    public final <T> void a(@Y61.k String str, @Y61.k Y41.l<Object, ? extends T> lVar) {
        LinkedHashMap linkedHashMap = this.f5742a;
        linkedHashMap.put(str, lVar);
        LinkedHashMap linkedHashMap2 = this.f5743b;
        Object obj = linkedHashMap2.get(str);
        if (obj != null) {
            try {
                Y41.l lVar2 = (Y41.l) linkedHashMap.get(str);
                if (lVar2 != null) {
                    lVar2.invoke(obj);
                }
            } catch (Exception unused) {
            }
            linkedHashMap2.remove(str);
        }
    }
}
