package com.avito.android.advert.notes.di;

import Y61.k;
import Y61.l;
import com.avito.android.advert.notes.EditAdvertNoteActivity;
import com.avito.android.advert.notes.di.c;
import com.avito.android.di.B;
import com.avito.android.remote.model.advert_details.ContactBarData;
import h31.d;
import kotlin.Metadata;

/* compiled from: AdvertDetailsNoteComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/notes/di/a;", "", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes10.dex */
public interface a {

    /* compiled from: AdvertDetailsNoteComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/notes/di/a$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.notes.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC2396a {
        @h31.b
        @k
        InterfaceC2396a a(@c.b @k String str);

        @h31.b
        @k
        InterfaceC2396a b(@c.d boolean z12);

        @k
        a build();

        @h31.b
        @k
        InterfaceC2396a c(@c.InterfaceC2397c @l ContactBarData contactBarData);

        @h31.b
        @k
        InterfaceC2396a d(@c.e boolean z12);

        @k
        InterfaceC2396a e(@k b bVar);

        @h31.b
        @k
        InterfaceC2396a n(@c.f @l String str);

        @h31.b
        @k
        InterfaceC2396a r(@c.a @k String str);
    }

    void a(@k EditAdvertNoteActivity editAdvertNoteActivity);
}
