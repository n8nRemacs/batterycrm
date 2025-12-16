package kotlin.reflect;

import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: TypesJVM.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class z extends H implements Y41.l<Class<?>, Class<?>> {

    /* renamed from: b, reason: collision with root package name */
    public static final z f410474b = new z();

    public z() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    @Override // Y41.l
    public final Class<?> invoke(Class<?> cls) {
        return cls.getComponentType();
    }
}
