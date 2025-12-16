package com.avito.android.contact_access.di.service;

import Fr.InterfaceC13828a;
import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.os.Bundle;
import com.avito.android.analytics.screens.r;
import com.avito.android.contact_access.contact_access_service.view.ContactAccessServiceArguments;
import com.avito.android.contact_access.contact_access_service.view.ContactAccessServiceFragment;
import com.avito.android.di.B;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: ContactAccessServiceComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/contact_access/di/service/a;", "", "a", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: ContactAccessServiceComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/contact_access/di/service/a$a;", "", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.contact_access.di.service.a$a, reason: collision with other inner class name */
    public interface InterfaceC3744a {
        @k
        InterfaceC3744a a(@k InterfaceC39417a interfaceC39417a);

        @h31.b
        @k
        InterfaceC3744a b(@k Resources resources);

        @k
        a build();

        @h31.b
        @k
        InterfaceC3744a c(@l Bundle bundle);

        @k
        InterfaceC3744a d(@k InterfaceC13828a interfaceC13828a);

        @h31.b
        @k
        InterfaceC3744a e(@k r rVar);

        @h31.b
        @k
        InterfaceC3744a f(@k ContactAccessServiceArguments contactAccessServiceArguments);
    }

    void a(@k ContactAccessServiceFragment contactAccessServiceFragment);
}
