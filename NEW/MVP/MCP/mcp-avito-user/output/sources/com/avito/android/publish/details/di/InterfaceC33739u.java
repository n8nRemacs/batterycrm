package com.avito.android.publish.details.di;

import android.content.res.Resources;
import com.avito.android.publish.details.PublishDetailsFragment;
import com.avito.android.publish.objects.di.C33921d;
import cv.InterfaceC39417a;
import h31.d;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: PublishDetailsComponent.kt */
@com.avito.android.di.B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/details/di/u;", "", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* renamed from: com.avito.android.publish.details.di.u, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC33739u {

    /* compiled from: PublishDetailsComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/di/u$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.details.di.u$a */
    public interface a {
        @Y61.k
        a a(@Y61.k InterfaceC39417a interfaceC39417a);

        @h31.b
        @Y61.k
        a b(@Y61.k Resources resources);

        @Y61.k
        InterfaceC33739u build();

        @h31.b
        @Y61.k
        a d(@com.avito.android.publish.di.W int i12);

        @h31.b
        @Y61.k
        a e(@Y61.k PublishDetailsFragment publishDetailsFragment);

        @h31.b
        @Y61.k
        a f(@Named("publish_details_is_editing") boolean z12);

        @Y61.k
        a g(@Y61.k InterfaceC33742x interfaceC33742x);

        @h31.b
        @Y61.k
        a h();

        @Y61.k
        a i(@Y61.k C33921d c33921d);

        @Y61.k
        a j(@Y61.k C33735p c33735p);

        @h31.b
        @Y61.k
        a k(@Y61.l String str);
    }

    void a(@Y61.k PublishDetailsFragment publishDetailsFragment);
}
