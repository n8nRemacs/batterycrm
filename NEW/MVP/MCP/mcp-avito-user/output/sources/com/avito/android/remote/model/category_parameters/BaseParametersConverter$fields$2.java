package com.avito.android.remote.model.category_parameters;

import Y41.l;
import Y61.k;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import nj0.InterfaceC44435b;

/* compiled from: BaseParametersConverter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/reflect/Method;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BaseParametersConverter$fields$2 extends N implements l<Method, Boolean> {
    public static final BaseParametersConverter$fields$2 INSTANCE = new BaseParametersConverter$fields$2();

    public BaseParametersConverter$fields$2() {
        super(1);
    }

    @Override // Y41.l
    @k
    public final Boolean invoke(Method method) {
        return Boolean.valueOf(method.isAnnotationPresent(InterfaceC44435b.class));
    }
}
