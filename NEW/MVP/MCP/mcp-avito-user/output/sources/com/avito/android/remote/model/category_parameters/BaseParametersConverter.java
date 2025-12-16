package com.avito.android.remote.model.category_parameters;

import Y61.k;
import com.avito.android.publish.drafts.LocalPublishState;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: BaseParametersConverter.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R*\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00070\u0006*\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000f\u0010\f\u001a\u00020\u0002*\u00020\u000b8BX\u0082\u0004¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/BaseParametersConverter;", "", "", "", "toFormValue", "(Z)Ljava/lang/String;", "Lkotlin/sequences/m;", "Lkotlin/Q;", "getFields", "(Ljava/lang/Object;)Lkotlin/sequences/m;", LocalPublishState.FIELDS, "Ljava/lang/reflect/Method;", "isPublicGetter", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface BaseParametersConverter {

    /* compiled from: BaseParametersConverter.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @k
        public static InterfaceC43030m<Q<String, Object>> getFields(@k BaseParametersConverter baseParametersConverter, @k Object obj) {
            return C43033p.y(C43033p.i(C43033p.i(C42756l.f(obj.getClass().getDeclaredMethods()), new BaseParametersConverter$fields$1(baseParametersConverter)), BaseParametersConverter$fields$2.INSTANCE), new BaseParametersConverter$fields$3(obj));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isPublicGetter(BaseParametersConverter baseParametersConverter, Method method) {
            return Modifier.isPublic(method.getModifiers()) && method.getParameterTypes().length == 0;
        }

        @k
        public static String toFormValue(@k BaseParametersConverter baseParametersConverter, boolean z12) {
            return z12 ? "1" : "";
        }
    }

    @k
    InterfaceC43030m<Q<String, Object>> getFields(@k Object obj);

    @k
    String toFormValue(boolean z12);
}
