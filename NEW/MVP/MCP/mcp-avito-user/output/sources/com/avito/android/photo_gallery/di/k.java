package com.avito.android.photo_gallery.di;

import android.content.res.Resources;
import androidx.view.C22977J;
import androidx.view.S0;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.photo_gallery.LegacyPhotoGalleryActivity;
import com.avito.android.util.Kundle;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: LegacyPhotoGalleryActivityComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_gallery/di/k;", "", "a", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes14.dex */
public interface k {

    /* compiled from: LegacyPhotoGalleryActivityComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/di/k$a;", "", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        a a(@Y61.k InterfaceC39417a interfaceC39417a);

        @Y61.k
        a b(@Y61.k C c12);

        @Y61.k
        k build();

        @h31.b
        @Y61.k
        a c(@Y61.k com.avito.android.analytics.screens.r rVar);

        @h31.b
        @Y61.k
        a d(@Y61.k LegacyPhotoGalleryActivity legacyPhotoGalleryActivity);

        @h31.b
        @Y61.k
        a e(@Y61.k Resources resources);

        @h31.b
        @Y61.k
        a f(@Y61.k C22977J c22977j);

        @h31.b
        @Y61.k
        a g(@Y61.k S0 s02);

        @h31.b
        @Y61.k
        a h(@Y61.l TreeClickStreamParent treeClickStreamParent);

        @h31.b
        @Y61.k
        a i(@com.avito.android.deal_confirmation.di.b @Y61.l Kundle kundle);

        @h31.b
        @Y61.k
        a s();
    }

    void a(@Y61.k LegacyPhotoGalleryActivity legacyPhotoGalleryActivity);
}
