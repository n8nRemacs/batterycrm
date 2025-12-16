package com.avito.android.publish;

import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import kotlin.Metadata;

/* compiled from: FeesParamsInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/l;", "", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.l, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC33878l {

    /* compiled from: FeesParamsInteractor.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/l$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.l$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f237373a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f237374b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f237375c;

        public a(@Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
            this.f237373a = str;
            this.f237374b = str2;
            this.f237375c = str3;
        }
    }

    @Y61.k
    io.reactivex.rxjava3.core.z<a> H8();

    void W8(@Y61.k EditableParameter<?> editableParameter, @Y61.l String str, @Y61.l Integer num, @Y61.l CategoryParameters categoryParameters);

    void n6();
}
