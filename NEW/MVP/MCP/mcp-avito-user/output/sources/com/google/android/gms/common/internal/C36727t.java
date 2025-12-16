package com.google.android.gms.common.internal;

import aZ0.InterfaceC19845a;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* renamed from: com.google.android.gms.common.internal.t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36727t {

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @RX0.a
    /* renamed from: com.google.android.gms.common.internal.t$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f349463a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f349464b;

        public /* synthetic */ a(Object obj, C36724q0 c36724q0) {
            C36729v.j(obj);
            this.f349464b = obj;
            this.f349463a = new ArrayList();
        }

        @InterfaceC19845a
        @j.N
        @RX0.a
        public final void a(@j.P Object obj, @j.N String str) {
            this.f349463a.add(androidx.appcompat.app.r.r(str, ContainerUtils.KEY_VALUE_DELIMITER, String.valueOf(obj)));
        }

        @j.N
        @RX0.a
        public final String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f349464b.getClass().getSimpleName());
            sb2.append('{');
            ArrayList arrayList = this.f349463a;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                sb2.append((String) arrayList.get(i12));
                if (i12 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public C36727t() {
        throw new AssertionError("Uninstantiable");
    }

    @RX0.a
    public static boolean a(@j.P Object obj, @j.P Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @j.N
    @RX0.a
    public static a b(@j.N Object obj) {
        return new a(obj, null);
    }
}
