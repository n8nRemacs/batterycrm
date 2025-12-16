package com.avito.android.gig.shift_list.generated.api.get_giger_slots_v_1;

import Y61.k;
import Y61.l;
import com.avito.android.gig.shift_list.generated.api.get_giger_slots_v_1.Header;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HeaderTitleColorTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gig/shift_list/generated/api/get_giger_slots_v_1/HeaderTitleColorTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "HeaderTitleColorTypeAdapter", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HeaderTitleColorTypeAdapterFactory implements r {

    /* compiled from: HeaderTitleColorTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig/shift_list/generated/api/get_giger_slots_v_1/HeaderTitleColorTypeAdapterFactory$HeaderTitleColorTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/gig/shift_list/generated/api/get_giger_slots_v_1/Header$TitleColor;", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HeaderTitleColorTypeAdapter extends TypeAdapter<Header.TitleColor> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<Header.TitleColor> f159471a;

        public HeaderTitleColorTypeAdapter(@k TypeAdapter<Header.TitleColor> typeAdapter) {
            this.f159471a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final Header.TitleColor read(a aVar) {
            Header.TitleColor titleColor = this.f159471a.read(aVar);
            return titleColor == null ? Header.TitleColor.Black : titleColor;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, Header.TitleColor titleColor) {
            this.f159471a.write(cVar, titleColor);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), Header.TitleColor.class)) {
            return new HeaderTitleColorTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(Header.TitleColor.class)));
        }
        return null;
    }
}
