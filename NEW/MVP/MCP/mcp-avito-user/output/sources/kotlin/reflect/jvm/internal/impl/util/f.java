package kotlin.reflect.jvm.internal.impl.util;

/* compiled from: modifierChecks.kt */
/* loaded from: classes8.dex */
public interface f {

    /* compiled from: modifierChecks.kt */
    public static final class a {
        @Y61.l
        public static String a(@Y61.k f fVar, @Y61.k kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar) {
            if (fVar.a(eVar)) {
                return null;
            }
            return fVar.getDescription();
        }
    }

    boolean a(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar);

    @Y61.l
    String b(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar);

    @Y61.k
    String getDescription();
}
