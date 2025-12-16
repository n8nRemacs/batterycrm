package com.avito.android.rating.user_contacts.di;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.C;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.rating.user_contacts.UserContactsActivity;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;
import yh0.InterfaceC50253b;

/* compiled from: UserContactsComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/user_contacts/di/b;", "", "a", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
@C
@InterfaceC30272y
/* loaded from: classes16.dex */
public interface b {

    /* compiled from: UserContactsComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/user_contacts/di/b$a;", "", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k d dVar, @k InterfaceC39417a interfaceC39417a, @h31.b boolean z12, @h31.b @k Resources resources, @h31.b @l @c String str, @h31.b @k C28478k c28478k, @h31.b @k Y41.l lVar, @h31.b @k @InterfaceC50253b Y41.a aVar);
    }

    void a(@k UserContactsActivity userContactsActivity);
}
