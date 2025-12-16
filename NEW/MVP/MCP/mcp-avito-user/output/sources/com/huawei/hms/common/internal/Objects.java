package com.huawei.hms.common.internal;

import androidx.camera.camera2.internal.G;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public final class Objects {

    public static final class ToStringHelper {

        /* renamed from: a, reason: collision with root package name */
        public final List<String> f363443a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f363444b;

        public final ToStringHelper add(String str, Object obj) {
            String str2 = (String) Preconditions.checkNotNull(str);
            String strValueOf = String.valueOf(obj);
            this.f363443a.add(G.g(new StringBuilder(strValueOf.length() + str2.length() + 1), str2, ContainerUtils.KEY_VALUE_DELIMITER, strValueOf));
            return this;
        }

        public final String toString() {
            String simpleName = this.f363444b.getClass().getSimpleName();
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(simpleName);
            sb2.append('{');
            int size = this.f363443a.size();
            for (int i12 = 0; i12 < size; i12++) {
                sb2.append(this.f363443a.get(i12));
                if (i12 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }

        public ToStringHelper(Object obj) {
            this.f363444b = Preconditions.checkNotNull(obj);
            this.f363443a = new ArrayList();
        }
    }

    public Objects() {
        throw new AssertionError("Uninstantiable");
    }

    public static boolean equal(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return obj != null && obj.equals(obj2);
    }

    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj);
    }
}
