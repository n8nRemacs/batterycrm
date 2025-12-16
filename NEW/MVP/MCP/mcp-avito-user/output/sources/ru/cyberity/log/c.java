package ru.cyberity.log;

import Y61.k;
import kotlin.Metadata;

/* compiled from: TAG.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"", "", "a", "(Ljava/lang/Object;)Ljava/lang/String;", "TAG", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class c {
    @k
    public static final String a(@k Object obj) {
        if (obj.getClass().isAnonymousClass()) {
            String name = obj.getClass().getName();
            return name.length() <= 23 ? name : name.substring(name.length() - 23, name.length());
        }
        String simpleName = obj.getClass().getSimpleName();
        return simpleName.length() <= 23 ? simpleName : simpleName.substring(0, 23);
    }
}
