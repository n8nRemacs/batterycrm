package com.fasterxml.jackson.databind.deser.impl;

import androidx.camera.camera2.internal.G;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: JavaUtilCollectionsDeserializers.java */
/* loaded from: classes4.dex */
public abstract class l {

    /* compiled from: JavaUtilCollectionsDeserializers.java */
    public static class a implements com.fasterxml.jackson.databind.util.i<Object, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.h f341652a;

        /* renamed from: b, reason: collision with root package name */
        public final int f341653b;

        public a(int i12, com.fasterxml.jackson.databind.h hVar) {
            this.f341652a = hVar;
            this.f341653b = i12;
        }

        public static void c(int i12) {
            if (i12 != 1) {
                throw new IllegalArgumentException(G.e(i12, "Can not deserialize Singleton container from ", " entries"));
            }
        }

        @Override // com.fasterxml.jackson.databind.util.i
        public final com.fasterxml.jackson.databind.h a(com.fasterxml.jackson.databind.type.n nVar) {
            return this.f341652a;
        }

        @Override // com.fasterxml.jackson.databind.util.i
        public final com.fasterxml.jackson.databind.h b(com.fasterxml.jackson.databind.type.n nVar) {
            return this.f341652a;
        }

        @Override // com.fasterxml.jackson.databind.util.i
        public final Object convert(Object obj) {
            if (obj == null) {
                return null;
            }
            switch (this.f341653b) {
                case 1:
                    Set set = (Set) obj;
                    c(set.size());
                    return Collections.singleton(set.iterator().next());
                case 2:
                    List list = (List) obj;
                    c(list.size());
                    return Collections.singletonList(list.get(0));
                case 3:
                    Map map = (Map) obj;
                    c(map.size());
                    Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                    return Collections.singletonMap(entry.getKey(), entry.getValue());
                case 4:
                    return Collections.unmodifiableSet((Set) obj);
                case 5:
                    return Collections.unmodifiableList((List) obj);
                case 6:
                    return Collections.unmodifiableMap((Map) obj);
                case 7:
                    return Collections.synchronizedSet((Set) obj);
                case 8:
                    return Collections.synchronizedCollection((Collection) obj);
                case 9:
                    return Collections.synchronizedList((List) obj);
                case 10:
                    return Collections.synchronizedMap((Map) obj);
                default:
                    return obj;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fasterxml.jackson.databind.deser.std.B a(com.fasterxml.jackson.databind.type.e r10) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.l.a(com.fasterxml.jackson.databind.type.e):com.fasterxml.jackson.databind.deser.std.B");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fasterxml.jackson.databind.deser.std.B b(com.fasterxml.jackson.databind.type.g r7) {
        /*
            java.lang.Class<?> r0 = r7.f341930b
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "java.util.Collections$"
            boolean r1 = r0.startsWith(r1)
            r2 = 0
            if (r1 == 0) goto L16
            r1 = 22
            java.lang.String r1 = r0.substring(r1)
            goto L17
        L16:
            r1 = r2
        L17:
            r3 = 6
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            java.lang.String r5 = "Map"
            if (r1 == 0) goto L86
            java.lang.String r0 = "Unmodifiable"
            boolean r0 = r1.startsWith(r0)
            r6 = 12
            if (r0 == 0) goto L2d
            java.lang.String r0 = r1.substring(r6)
            goto L2e
        L2d:
            r0 = r2
        L2e:
            if (r0 == 0) goto L41
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto La8
            com.fasterxml.jackson.databind.deser.impl.l$a r0 = new com.fasterxml.jackson.databind.deser.impl.l$a
            com.fasterxml.jackson.databind.h r7 = r7.l(r4)
            r0.<init>(r3, r7)
            goto La9
        L41:
            java.lang.String r0 = "Singleton"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L50
            r0 = 9
            java.lang.String r0 = r1.substring(r0)
            goto L51
        L50:
            r0 = r2
        L51:
            if (r0 == 0) goto L64
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto La8
            com.fasterxml.jackson.databind.deser.impl.l$a r0 = new com.fasterxml.jackson.databind.deser.impl.l$a
            com.fasterxml.jackson.databind.h r7 = r7.l(r4)
            r1 = 3
            r0.<init>(r1, r7)
            goto La9
        L64:
            java.lang.String r0 = "Synchronized"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L71
            java.lang.String r0 = r1.substring(r6)
            goto L72
        L71:
            r0 = r2
        L72:
            if (r0 == 0) goto La8
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto La8
            com.fasterxml.jackson.databind.deser.impl.l$a r0 = new com.fasterxml.jackson.databind.deser.impl.l$a
            com.fasterxml.jackson.databind.h r7 = r7.l(r4)
            r1 = 10
            r0.<init>(r1, r7)
            goto La9
        L86:
            java.lang.String r1 = "java.util.ImmutableCollections$"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L95
            r1 = 31
            java.lang.String r0 = r0.substring(r1)
            goto L96
        L95:
            r0 = r2
        L96:
            if (r0 == 0) goto La8
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto La8
            com.fasterxml.jackson.databind.deser.impl.l$a r0 = new com.fasterxml.jackson.databind.deser.impl.l$a
            com.fasterxml.jackson.databind.h r7 = r7.l(r4)
            r0.<init>(r3, r7)
            goto La9
        La8:
            r0 = r2
        La9:
            if (r0 != 0) goto Lac
            goto Lb1
        Lac:
            com.fasterxml.jackson.databind.deser.std.B r2 = new com.fasterxml.jackson.databind.deser.std.B
            r2.<init>(r0)
        Lb1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.l.b(com.fasterxml.jackson.databind.type.g):com.fasterxml.jackson.databind.deser.std.B");
    }
}
