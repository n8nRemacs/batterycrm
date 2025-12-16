package com.avito.android.publish.details;

import com.avito.android.photo_cache.q;
import com.avito.android.photo_picker.b0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;

/* compiled from: PublishDetailsPhotoSyncInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/photo_cache/q;", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(Lcom/avito/android/photo_cache/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.details.h1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33756h1<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33765k1 f234640b;

    public C33756h1(C33765k1 c33765k1) {
        this.f234640b = c33765k1;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        if (((com.avito.android.photo_cache.q) obj) instanceof q.a) {
            b0.a.a(this.f234640b.f234811d, null, 3);
        }
    }
}
