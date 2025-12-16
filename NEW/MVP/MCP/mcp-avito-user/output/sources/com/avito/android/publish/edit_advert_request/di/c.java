package com.avito.android.publish.edit_advert_request.di;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.di.B;
import com.avito.android.publish.edit_advert_request.EditAdvertRequestFragment;
import com.avito.android.publish.edit_advert_request_mvi.EditRequestFragment;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: EditAdvertRequestComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/edit_advert_request/di/c;", "", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes16.dex */
public interface c {

    /* compiled from: EditAdvertRequestComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/edit_advert_request/di/c$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        a a(@k InterfaceC39417a interfaceC39417a);

        @h31.b
        @k
        a b(@k Resources resources);

        @k
        c build();

        @k
        a c(@k b bVar);
    }

    void a(@k EditAdvertRequestFragment editAdvertRequestFragment);

    void b(@k EditRequestFragment editRequestFragment);
}
