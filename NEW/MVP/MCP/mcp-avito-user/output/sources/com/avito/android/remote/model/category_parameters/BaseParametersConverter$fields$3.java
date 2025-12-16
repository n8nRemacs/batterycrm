package com.avito.android.remote.model.category_parameters;

import Y41.l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import nj0.InterfaceC44435b;

/* compiled from: BaseParametersConverter.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "it", "Lkotlin/Q;", "", "", "invoke", "(Ljava/lang/reflect/Method;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes17.dex */
public final class BaseParametersConverter$fields$3 extends N implements l<Method, Q<? extends String, ? extends Object>> {
    final /* synthetic */ Object $this_fields;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseParametersConverter$fields$3(Object obj) {
        super(1);
        this.$this_fields = obj;
    }

    @Override // Y41.l
    @Y61.l
    public final Q<String, Object> invoke(Method method) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke = method.invoke(this.$this_fields, new Object[0]);
        if (objInvoke == null) {
            return null;
        }
        InterfaceC44435b interfaceC44435b = (InterfaceC44435b) method.getAnnotation(InterfaceC44435b.class);
        String strName = interfaceC44435b != null ? interfaceC44435b.name() : null;
        if (strName == null) {
            strName = "";
        }
        return new Q<>(strName, objInvoke);
    }
}
