package com.avito.android.details;

import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.select.p;
import java.util.List;
import kl0.C42711b;
import kotlin.Metadata;

/* compiled from: ItemDetailsSelectResultHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/details/b;", "Lcom/avito/android/select/p;", "Lcom/avito/android/category_parameters/h;", "b", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface b extends p, com.avito.android.category_parameters.h {

    /* compiled from: ItemDetailsSelectResultHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: ItemDetailsSelectResultHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/details/b$b;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.details.b$b, reason: collision with other inner class name */
    public interface InterfaceC4110b {

        /* compiled from: ItemDetailsSelectResultHandler.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.details.b$b$a */
        public static final class a {
            public static /* synthetic */ void a(InterfaceC4110b interfaceC4110b, String str, int i12) {
                if ((i12 & 1) != 0) {
                    str = null;
                }
                interfaceC4110b.c3(null, str);
            }
        }

        void C5(@Y61.k AddressParameter addressParameter);

        void I9(@Y61.k String str);

        void N7(@Y61.k PublishMethodWithAllSelectedValueParameter publishMethodWithAllSelectedValueParameter);

        void Nc();

        void c3(@Y61.l ParameterSlot parameterSlot, @Y61.l String str);

        void h5(@Y61.l String str);

        void n9();

        void vd();
    }

    void D4();

    void E(@Y61.l AddressParameter.Value value, @Y61.l String str);

    void F4(@Y61.l AddressParameter.Value value);

    void I(@Y61.k e eVar);

    void J(@Y61.l String str);

    void L(@Y61.l String str);

    void L3(@Y61.k InterfaceC4110b interfaceC4110b);

    void S(@Y61.k AddressParameter.Value value);

    void a0(@Y61.k String str, @Y61.l String str2);

    void j2(@Y61.k C42711b c42711b);

    void m3(@Y61.k Ij.b bVar, @Y61.k ParameterSlot parameterSlot, boolean z12);

    void u4(int i12, @Y61.l Integer num);

    void v(@Y61.k AddressParameter.Value value);

    void v3(@Y61.k ParameterSlot parameterSlot, @Y61.k List list);

    void x4(@Y61.l String str);
}
