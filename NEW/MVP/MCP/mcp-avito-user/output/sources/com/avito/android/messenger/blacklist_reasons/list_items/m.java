package com.avito.android.messenger.blacklist_reasons.list_items;

import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.messenger.blacklist_reasons.list_items.a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ReasonItemBlueprint.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/list_items/m;", "LTV0/e;", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface m extends TV0.e {

    /* compiled from: ReasonItemBlueprint.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: ReasonItemBlueprint.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/list_items/m$b;", "Lcom/avito/android/messenger/blacklist_reasons/list_items/m;", "Lcom/avito/konveyor/adapter/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.konveyor.adapter.b implements m {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ListItemRadio f186633b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public Y41.a<G0> f186634c;

        public b(@Y61.k View view) {
            super(view);
            ListItemRadio listItemRadio = (ListItemRadio) view.findViewById(R.id.messenger_blacklist_reasons_item);
            this.f186633b = listItemRadio;
            listItemRadio.setOnClickListener(new com.avito.android.imv_similiar_adverts.h(this, 28));
        }

        @Override // com.avito.android.messenger.blacklist_reasons.list_items.m
        public final void DS(@Y61.k a.C5476a c5476a, @Y61.k Y41.a<G0> aVar) {
            String str = c5476a.f186615c;
            ListItemRadio listItemRadio = this.f186633b;
            listItemRadio.setTitle(str);
            listItemRadio.setChecked(c5476a.f186616d);
            this.f186634c = aVar;
        }
    }

    void DS(@Y61.k a.C5476a c5476a, @Y61.k Y41.a<G0> aVar);
}
