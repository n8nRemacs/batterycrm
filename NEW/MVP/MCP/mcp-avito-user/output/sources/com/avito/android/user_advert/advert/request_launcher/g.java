package com.avito.android.user_advert.advert.request_launcher;

import android.content.Context;
import android.content.Intent;
import com.avito.android.photo_gallery.PhotoGalleryIntentFactory;
import com.avito.android.user_advert.advert.B;
import com.avito.android.user_advert.advert.request_launcher.i;
import i.AbstractC41201a;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;

/* compiled from: MyAdvertPhotoGalleryRequestLauncher.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/request_launcher/g;", "Li/a;", "Lcom/avito/android/user_advert/advert/request_launcher/e;", "Lcom/avito/android/user_advert/advert/request_launcher/i;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends AbstractC41201a<e, i> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f310606b;

    public g(B b12) {
        this.f310606b = b12;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, e eVar) {
        e eVar2 = eVar;
        return ((PhotoGalleryIntentFactory) this.f310606b.get()).a(null, null, null, null, null, eVar2.f310599a, eVar2.f310600b, eVar2.f310601c, eVar2.f310602d, null, (16773151 & 1024) != 0 ? null : null, (16773151 & 2048) != 0 ? null : null, (16773151 & 4096) != 0 ? null : null, (16773151 & 8192) != 0 ? null : null, (16773151 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : null, (32768 & 16773151) != 0 ? null : null, null, null, (262144 & 16773151) != 0 ? null : null, null, false, (16773151 & 2097152) != 0 ? null : eVar2.f310603e, null, null).setFlags(603979776);
    }

    @Override // i.AbstractC41201a
    public final i parseResult(int i12, Intent intent) {
        return intent != null ? new i.b(intent.getIntExtra("image_position", 0)) : i.a.f310607a;
    }
}
