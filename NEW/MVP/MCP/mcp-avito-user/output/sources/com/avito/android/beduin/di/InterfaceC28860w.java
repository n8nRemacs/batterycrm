package com.avito.android.beduin.di;

import Hr.InterfaceC14024a;
import com.avito.android.AbstractC35201t;
import com.avito.android.C36135w2;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.google.android.exoplayer2.source.C36548k;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
import java.util.Map;
import kotlin.InterfaceC49066a;
import kotlin.Metadata;
import nU.InterfaceC44331a;
import ni.InterfaceC44428a;
import oi.InterfaceC44779a;

/* compiled from: BeduinFragmentDependencies.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/di/w;", "LnU/a;", "Lcom/avito/android/beduin/di/Y;", "Lcom/avito/android/beduin/common/component/payment_webview/r;", "Lcom/avito/android/util/text/utils/c;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.di.w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC28860w extends InterfaceC44331a, Y, com.avito.android.beduin.common.component.payment_webview.r, com.avito.android.util.text.utils.c {
    @Y61.k
    com.avito.android.advert.viewed.a D0();

    @Y61.k
    com.avito.android.photo_cache.b F();

    @Y61.k
    InterfaceC14024a L();

    @Y61.k
    com.avito.android.beduin.common.storage.d Lk();

    @Y61.k
    com.avito.android.beduin.common.component.photo_picker.data.a Oi();

    @Y61.k
    PhotoPickerIntentFactory X();

    @a0
    @Y61.k
    C36548k Y7();

    @Y61.k
    com.avito.android.deeplink_events.registry.d a6();

    @Y61.k
    com.avito.android.ui.status_bar.e b0();

    @Y61.k
    com.avito.android.calendar_select.c b3();

    @Y61.k
    C36135w2 e0();

    @InterfaceC44428a
    @Y61.k
    Map<Class<? extends BeduinModel>, InterfaceC40113b<? extends BeduinModel, ? extends AbstractC40112a<? extends BeduinModel, ? extends InterfaceC40116e>>> fg();

    @Y61.k
    InterfaceC44779a l5();

    @Y61.k
    Hh.e o9();

    @Y61.k
    com.avito.android.player_holder.a r0();

    @Y61.k
    com.avito.android.deep_linking.x t();

    @Y61.k
    InterfaceC49066a tb();

    @Y61.k
    com.avito.android.beduin.common.component.file_uploader.data.a vi();

    @Y61.k
    com.avito.android.lib.beduin_v2.repository.domain.cart_items.h w1();

    @Y61.k
    AbstractC35201t z4();
}
