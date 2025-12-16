package com.avito.android.auto_reseller_contacts.generated.api.get_messenger_by_item_id_for_apiv_3;

import Y61.k;
import Y61.l;
import com.avito.android.auto_reseller_contacts.generated.api.get_messenger_by_item_id_for_apiv_3.EaModal;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EaModalPopupTypeV2TypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/auto_reseller_contacts/generated/api/get_messenger_by_item_id_for_apiv_3/EaModalPopupTypeV2TypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "EaModalPopupTypeV2TypeAdapter", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EaModalPopupTypeV2TypeAdapterFactory implements r {

    /* compiled from: EaModalPopupTypeV2TypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_reseller_contacts/generated/api/get_messenger_by_item_id_for_apiv_3/EaModalPopupTypeV2TypeAdapterFactory$EaModalPopupTypeV2TypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/auto_reseller_contacts/generated/api/get_messenger_by_item_id_for_apiv_3/EaModal$PopupTypeV2;", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EaModalPopupTypeV2TypeAdapter extends TypeAdapter<EaModal.PopupTypeV2> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<EaModal.PopupTypeV2> f95791a;

        public EaModalPopupTypeV2TypeAdapter(@k TypeAdapter<EaModal.PopupTypeV2> typeAdapter) {
            this.f95791a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final EaModal.PopupTypeV2 read(a aVar) {
            EaModal.PopupTypeV2 popupTypeV2 = this.f95791a.read(aVar);
            return popupTypeV2 == null ? EaModal.PopupTypeV2.PopupPurchaseNew : popupTypeV2;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, EaModal.PopupTypeV2 popupTypeV2) {
            this.f95791a.write(cVar, popupTypeV2);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), EaModal.PopupTypeV2.class)) {
            return new EaModalPopupTypeV2TypeAdapter(gson.h(this, com.google.gson.reflect.a.get(EaModal.PopupTypeV2.class)));
        }
        return null;
    }
}
