package org.mockito.internal.configuration.injection;

import com.avito.android.publish.drafts.LocalPublishState;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: MockInjection.java */
/* loaded from: classes7.dex */
public final class b {

    /* compiled from: MockInjection.java */
    /* renamed from: org.mockito.internal.configuration.injection.b$b, reason: collision with other inner class name */
    public static class C12227b {

        /* renamed from: a, reason: collision with root package name */
        public final HashSet f421495a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f421496b;

        public C12227b(Field field, Object obj, a aVar) {
            this(Collections.singleton(field), obj);
        }

        public C12227b(Set<Field> set, Object obj) {
            this.f421495a = new HashSet();
            List listAsList = Arrays.asList(new Object[0]);
            org.mockito.internal.util.collections.b bVar = new org.mockito.internal.util.collections.b();
            if (listAsList != null) {
                Iterator it = listAsList.iterator();
                while (it.hasNext()) {
                    bVar.add(it.next());
                }
            }
            new c();
            new c();
            Y71.a.a(obj, "fieldOwner");
            this.f421496b = obj;
            HashSet hashSet = this.f421495a;
            Y71.a.a(set, LocalPublishState.FIELDS);
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                Y71.a.a(it2.next(), "item in fields");
            }
            hashSet.addAll(set);
        }
    }
}
