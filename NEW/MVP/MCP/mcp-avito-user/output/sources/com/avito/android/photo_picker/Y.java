package com.avito.android.photo_picker;

import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UploadListenerProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/Y;", "Lcom/avito/android/photo_picker/X;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Y implements X {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<String, n80.b> f218879a;

    @Inject
    public Y(@Y61.k Map<String, n80.b> map) {
        this.f218879a = map;
    }

    @Override // com.avito.android.photo_picker.X
    @Y61.l
    public final n80.b a(@Y61.k String str) {
        return this.f218879a.get(str);
    }
}
