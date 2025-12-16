package com.avito.android.notification.parameters_factory;

import Qf0.C14891a;
import Y61.k;
import com.avito.android.deep_linking.x;
import com.avito.android.notification.parameters_factory.e;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.remote.notification.PushNotification;
import com.avito.android.remote.notification.PushParameters;
import com.avito.android.util.R1;
import com.avito.android.util.V2;
import com.google.gson.Gson;
import com.squareup.anvil.annotations.ContributesBinding;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: PushParametersFactory.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notification/parameters_factory/g;", "Lcom/avito/android/notification/parameters_factory/e;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes15.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final x f207468a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<Gson> f207469b;

    @Inject
    public g(@k x xVar, @k h31.e<Gson> eVar) {
        this.f207468a = xVar;
        this.f207469b = eVar;
    }

    @Override // com.avito.android.notification.parameters_factory.e
    @k
    public final e.a a(@k C14891a c14891a) {
        PushNotification pushNotification;
        Map<String, String> mapC = c14891a.f13963a;
        if (mapC == null) {
            mapC = P0.c();
        }
        String str = mapC.get(TooltipAttribute.PARAM_DEEP_LINK);
        if (str == null) {
            return e.a.InterfaceC6185a.b.f207465a;
        }
        String str2 = mapC.get(NotificationsSettings.Section.SECTION_PAID_SERVICES);
        if (str2 == null) {
            return e.a.InterfaceC6185a.C6186a.f207464a;
        }
        try {
            Gson gson = this.f207469b.get();
            Type type = new f().getType();
            pushNotification = (PushNotification) gson.e(str2, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type));
        } catch (Exception e12) {
            V2.f318762a.f(e12);
            pushNotification = null;
        }
        return pushNotification == null ? new e.a.InterfaceC6185a.c(str2) : new e.a.b(new PushParameters(this.f207468a.b(str), pushNotification, c14891a.f13969g));
    }
}
