package com.avito.android.publish.screen.step.params.di;

import Je0.C14190a;
import android.content.res.Resources;
import com.avito.android.di.B;
import com.avito.android.publish.details.di.C33735p;
import com.avito.android.publish.di.W;
import com.avito.android.publish.objects.di.C33921d;
import com.avito.android.publish.screen.step.params.PublishDetailsFragment;
import com.avito.android.publish.screen.step.params.y;
import cv.InterfaceC39417a;
import h31.d;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: PublishDetailsComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/step/params/di/b;", "", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes16.dex */
public interface b {

    /* compiled from: PublishDetailsComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/di/b$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        b a(@h31.b @Y61.k Resources resources, @W @h31.b int i12, @h31.b @Y61.l String str, @h31.b @Named("publish_details_is_editing") boolean z12, @h31.b @Y61.k PublishDetailsFragment publishDetailsFragment, @h31.b @Y61.k C14190a c14190a, @Y61.k C33921d c33921d, @Y61.k C33735p c33735p, @Y61.k c cVar, @Y61.k InterfaceC39417a interfaceC39417a);
    }

    void a(@Y61.k PublishDetailsFragment publishDetailsFragment);

    void b(@Y61.k com.avito.android.publish.screen.step.params.view.b bVar);

    void c(@Y61.k y yVar);
}
