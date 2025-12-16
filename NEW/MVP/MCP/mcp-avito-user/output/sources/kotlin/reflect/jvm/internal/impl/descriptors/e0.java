package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;

/* compiled from: SupertypeLoopChecker.kt */
/* loaded from: classes8.dex */
public interface e0 {
    @Y61.k
    Collection a(@Y61.k Collection collection);

    /* compiled from: SupertypeLoopChecker.kt */
    public static final class a implements e0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f407541a = new a();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e0
        @Y61.k
        public final Collection a(@Y61.k Collection collection) {
            return collection;
        }
    }
}
