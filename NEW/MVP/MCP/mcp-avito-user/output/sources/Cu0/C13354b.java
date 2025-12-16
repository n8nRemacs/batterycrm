package Cu0;

import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: ServiceOrderSenderStorageImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCu0/b;", "LCu0/a;", "<init>", "()V", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* renamed from: Cu0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13354b implements InterfaceC13353a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Z1<Map<String, Map<String, Boolean>>> f2732a = p2.a(new LinkedHashMap());

    @Inject
    public C13354b() {
    }

    @Override // Cu0.InterfaceC13353a
    @k
    public final InterfaceC43160i<Map<String, Map<String, Boolean>>> a() {
        return this.f2732a;
    }

    @Override // Cu0.InterfaceC13353a
    public final void b(@k String str, @k String str2) {
        Map<String, Map<String, Boolean>> value;
        LinkedHashMap linkedHashMap;
        Z1<Map<String, Map<String, Boolean>>> z12 = this.f2732a;
        do {
            value = z12.getValue();
            linkedHashMap = new LinkedHashMap(value);
            if (linkedHashMap.get(str) != null) {
                Map map = (Map) linkedHashMap.get(str);
                if (map != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
                    linkedHashMap2.put(str2, Boolean.TRUE);
                    linkedHashMap.put(str, linkedHashMap2);
                }
            } else {
                linkedHashMap.put(str, Collections.singletonMap(str2, Boolean.TRUE));
            }
        } while (!z12.N3(value, linkedHashMap));
    }
}
