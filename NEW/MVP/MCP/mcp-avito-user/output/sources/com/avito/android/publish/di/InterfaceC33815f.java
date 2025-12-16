package com.avito.android.publish.di;

import android.content.res.Resources;
import androidx.fragment.app.FragmentManager;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.publish.PublishActivity;
import com.avito.android.publish.details.di.InterfaceC33742x;
import com.avito.android.publish.objects.di.InterfaceC33935s;
import com.avito.android.publish.screen.objects.di.InterfaceC34013d;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;
import oW.InterfaceC44697a;

/* compiled from: PublishComponent.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u00112\u00020\u00122\u00020\u00132\u00020\u00142\u00020\u00152\u00020\u00162\u00020\u00172\u00020\u00182\u00020\u00192\u00020\u001a2\u00020\u001b:\u0001\u001c¨\u0006\u001d"}, d2 = {"Lcom/avito/android/publish/di/f;", "Lcom/avito/android/publish/input_vin/di/c;", "Lcom/avito/android/publish/input_imei/di/c;", "Lcom/avito/android/publish/scanner_v2/di/c;", "Lcom/avito/android/publish/details/di/x;", "Lcom/avito/android/publish/screen/step/params/di/c;", "Lcom/avito/android/publish/screen/step/suggest/category/di/c;", "Lcom/avito/android/publish/merge_pretend_premoderation/di/c;", "Lcom/avito/android/publish/publish_advert_request/di/b;", "Lcom/avito/android/publish/pretend/di/c;", "Lcom/avito/android/publish/edit_advert_request/di/b;", "Lcom/avito/android/publish/select/di/l;", "Lcom/avito/android/publish/screen/step/select/di/c;", "Lcom/avito/android/publish/objects/di/s;", "Lcom/avito/android/publish/screen/objects/di/d;", "Lcom/avito/android/publish/category_edit/di/b;", "Lcom/avito/android/publish/screen/step/wizard/di/c;", "Lcom/avito/android/publish/infomodel_request/di/c;", "Lcom/avito/android/publish/params_suggest/di/d;", "Lcom/avito/android/publish/price_list/di/d;", "Lcom/avito/android/photo_permission/di/c;", "Lcom/avito/android/publish/screen/step/request/steps/di/c;", "Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/di/c;", "Lcom/avito/android/publish/scanner/di/e;", "Lcom/avito/android/publish/screen/step/request/publish/di/c;", "Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/di/l;", "Lcom/avito/android/publish/free_delivery/di/c;", "Lcom/avito/android/publish/vinsuggest/di/c;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* renamed from: com.avito.android.publish.di.f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC33815f extends com.avito.android.publish.input_vin.di.c, com.avito.android.publish.input_imei.di.c, com.avito.android.publish.scanner_v2.di.c, InterfaceC33742x, com.avito.android.publish.screen.step.params.di.c, com.avito.android.publish.screen.step.suggest.category.di.c, com.avito.android.publish.merge_pretend_premoderation.di.c, com.avito.android.publish.publish_advert_request.di.b, com.avito.android.publish.pretend.di.c, com.avito.android.publish.edit_advert_request.di.b, com.avito.android.publish.select.di.l, com.avito.android.publish.screen.step.select.di.c, InterfaceC33935s, InterfaceC34013d, com.avito.android.publish.category_edit.di.b, com.avito.android.publish.screen.step.wizard.di.c, com.avito.android.publish.infomodel_request.di.c, com.avito.android.publish.params_suggest.di.d, com.avito.android.publish.price_list.di.d, com.avito.android.photo_permission.di.c, com.avito.android.publish.screen.step.request.steps.di.c, com.avito.android.publish.screen.step.request.mergedpretendpremoderation.di.c, com.avito.android.publish.scanner.di.e, com.avito.android.publish.screen.step.request.publish.di.c, com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.di.l, com.avito.android.publish.free_delivery.di.c, com.avito.android.publish.vinsuggest.di.c {

    /* compiled from: PublishComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/di/f$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.di.f$a */
    public interface a {
        @Y61.k
        a a(@Y61.k InterfaceC39417a interfaceC39417a);

        @h31.b
        @Y61.k
        a b(@Y61.k Resources resources);

        @Y61.k
        InterfaceC33815f build();

        @h31.b
        @Y61.k
        a c(@Y61.k com.avito.android.analytics.screens.r rVar);

        @Y61.k
        a d(@Y61.k InterfaceC33816g interfaceC33816g);

        @h31.b
        @Y61.k
        a e(@Y61.k FragmentManager fragmentManager);

        @Y61.k
        a f(@Y61.k InterfaceC44697a interfaceC44697a);

        @h31.b
        @Y61.k
        a g(@Y61.k PublishActivity publishActivity);

        @Y61.k
        a h(@Y61.k C33824o c33824o);

        @h31.b
        @Y61.k
        a i(@Y61.k PublishActivity publishActivity);
    }

    void Fj(@Y61.k PublishActivity publishActivity);
}
