package com.avito.android.upload_doc.di;

import Y61.k;
import android.app.Application;
import android.content.Context;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.deep_linking.x;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.remote.H;
import com.avito.android.remote.R0;
import com.avito.android.util.C;
import com.google.gson.Gson;
import iH.InterfaceC41285a;
import kotlin.Metadata;

/* compiled from: GigUploadDocComponent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/upload_doc/di/d;", "Lcom/avito/android/di/h;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface d extends InterfaceC29971h {
    @k
    com.avito.android.photo_cache.b F();

    @k
    H K();

    @k
    PhotoPickerIntentFactory X();

    @k
    InterfaceC28373a a();

    @k
    InterfaceC28481c f();

    @k
    R0 f2();

    @k
    Context g();

    @k
    E i();

    @k
    C j();

    @k
    Application k();

    @k
    x q();

    @k
    com.avito.android.util.text.a rm();

    @k
    Gson s();

    @k
    InterfaceC41285a uh();
}
