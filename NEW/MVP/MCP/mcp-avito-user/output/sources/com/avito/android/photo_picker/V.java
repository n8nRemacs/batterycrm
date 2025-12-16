package com.avito.android.photo_picker;

import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import n80.InterfaceC44212a;

/* compiled from: UploadInteractorProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/V;", "Lcom/avito/android/photo_picker/U;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class V implements U {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<String, InterfaceC44212a> f218877a;

    @Inject
    public V(@Y61.k Map<String, InterfaceC44212a> map) {
        this.f218877a = map;
    }

    @Override // com.avito.android.photo_picker.U
    @Y61.k
    public final InterfaceC44212a a(@Y61.k String str) {
        InterfaceC44212a interfaceC44212a = this.f218877a.get(str);
        if (interfaceC44212a != null) {
            return interfaceC44212a;
        }
        throw new IllegalArgumentException(str);
    }
}
