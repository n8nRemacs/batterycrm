package com.avito.android.messenger.channels.mvi.data;

import android.os.Parcelable;
import androidx.work.L;
import androidx.work.WorkManager;
import androidx.work.impl.utils.C23593c;
import com.avito.android.messenger.conversation.mvi.file_download.C32042f;
import com.avito.android.messenger.conversation.mvi.file_download.FileDownloadWorker;
import com.avito.android.persistence.messenger.P0;
import com.avito.android.publish.C33883n0;
import com.avito.android.publish.T0;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.google.common.util.concurrent.D0;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.G0;
import kotlin.collections.C42784z0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.messenger.channels.mvi.data.t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class CallableC31711t implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f187249b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Parcelable f187250c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f187251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f187252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Serializable f187253f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f187254g;

    public /* synthetic */ CallableC31711t(C33883n0 c33883n0, Navigation navigation2, CategoryParameters categoryParameters, Boolean bool, String str) {
        this.f187249b = 3;
        this.f187251d = c33883n0;
        this.f187250c = navigation2;
        this.f187252e = categoryParameters;
        this.f187254g = bool;
        this.f187253f = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        List<ParameterSlot> parametersExceptOwnedBySlots;
        switch (this.f187249b) {
            case 0:
                C31714w c31714w = (C31714w) this.f187251d;
                InterfaceC31697e interfaceC31697e = c31714w.f187260f;
                ArrayList arrayList = (ArrayList) this.f187252e;
                MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) this.f187250c;
                O oC2 = interfaceC31697e.c(messengerUserHashInfo, arrayList);
                c31714w.f187255a.f(messengerUserHashInfo.f430682d, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c), (ArrayList) this.f187253f, oC2.f187184a, oC2.f187185b, oC2.f187186c, oC2.f187187d, C31714w.t((Boolean) this.f187254g));
                return G0.f406611a;
            case 1:
                MessengerUserHashInfo messengerUserHashInfo2 = (MessengerUserHashInfo) this.f187250c;
                return Long.valueOf(((V) this.f187251d).f187198a.a(new P0(messengerUserHashInfo2.f430682d, (String) this.f187252e, (String) this.f187253f, (String) this.f187254g, com.avito.android.messenger.util.i.g(messengerUserHashInfo2.f430681c))));
            case 2:
                FileDownloadWorker.f190805d.getClass();
                WorkManager.f55428a.getClass();
                androidx.work.impl.Y yF2 = androidx.work.impl.Y.f(((C32042f) this.f187251d).f190919a);
                MessengerUserHashInfo messengerUserHashInfo3 = (MessengerUserHashInfo) this.f187250c;
                String strH = com.avito.android.messenger.util.i.h(messengerUserHashInfo3.f430681c);
                Integer num = (Integer) this.f187254g;
                if (num == null) {
                    str = "";
                } else {
                    str = "||" + num;
                }
                D0<L.b.c> d0A = C23593c.d(yF2, messengerUserHashInfo3.f430682d + "||" + ((String) this.f187252e) + "||" + ((String) this.f187253f) + strH + str).a();
                Objects.requireNonNull(d0A, "future is null");
                return new C41826q(io.reactivex.rxjava3.internal.functions.a.e(d0A));
            default:
                C33883n0 c33883n0 = (C33883n0) this.f187251d;
                Map<String, String> mapConvertToFieldMap = c33883n0.f237446e.convertToFieldMap((Navigation) this.f187250c);
                CategoryParameters categoryParameters = (CategoryParameters) this.f187252e;
                if (categoryParameters == null || (parametersExceptOwnedBySlots = categoryParameters.getParametersExceptOwnedBySlots()) == null) {
                    parametersExceptOwnedBySlots = C42784z0.f406748b;
                }
                List<ParameterSlot> list = parametersExceptOwnedBySlots;
                AttributesTreeConverter attributesTreeConverter = c33883n0.f237448g;
                Map<String, String> mapConvertToSlotFieldMap = attributesTreeConverter.convertToSlotFieldMap(attributesTreeConverter.convertToSlotAttributesTree(list));
                Map<String, String> mapConvertToParameterFieldMap = attributesTreeConverter.convertToParameterFieldMap(attributesTreeConverter.convertToParameterAttributesTree(list));
                boolean zBooleanValue = c33883n0.f237449h.z().invoke().booleanValue();
                Y41.a<String> aVar = c33883n0.f237445d;
                Boolean bool = (Boolean) this.f187254g;
                String str2 = (String) this.f187253f;
                T0 t02 = c33883n0.f237451j;
                return zBooleanValue ? c33883n0.f237443b.v((String) ((kotlin.jvm.internal.V) aVar).get(), mapConvertToFieldMap, mapConvertToParameterFieldMap, mapConvertToSlotFieldMap, bool, t02.j(false), str2) : c33883n0.f237443b.s((String) ((kotlin.jvm.internal.V) aVar).get(), mapConvertToFieldMap, mapConvertToParameterFieldMap, mapConvertToSlotFieldMap, bool, t02.j(false), str2);
        }
    }

    public /* synthetic */ CallableC31711t(Object obj, MessengerUserHashInfo messengerUserHashInfo, Serializable serializable, Serializable serializable2, Object obj2, int i12) {
        this.f187249b = i12;
        this.f187251d = obj;
        this.f187250c = messengerUserHashInfo;
        this.f187252e = serializable;
        this.f187253f = serializable2;
        this.f187254g = obj2;
    }
}
