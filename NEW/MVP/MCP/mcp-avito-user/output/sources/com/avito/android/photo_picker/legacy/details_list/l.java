package com.avito.android.photo_picker.legacy.details_list;

import android.net.Uri;
import androidx.collection.C20199a;
import com.avito.android.util.C35809h6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PreviewItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/device_orientation/c;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/device_orientation/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class l extends N implements Y41.l<com.avito.android.device_orientation.c, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f219656l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar) {
        super(1);
        this.f219656l = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.device_orientation.c cVar) {
        m mVar = this.f219656l;
        mVar.f219660e = cVar;
        C20199a<n, com.avito.android.photo_picker.legacy.thumbnail_list.a> c20199a = mVar.f219659d;
        for (n nVar : c20199a.keySet()) {
            com.avito.android.photo_picker.legacy.thumbnail_list.a aVar = c20199a.get(nVar);
            if (aVar != null && (aVar instanceof com.avito.android.photo_picker.legacy.thumbnail_list.l)) {
                Uri uri = ((com.avito.android.photo_picker.legacy.thumbnail_list.l) aVar).f219905e;
                if (C35809h6.a(uri)) {
                    nVar.p0();
                } else {
                    nVar.Km(uri, mVar.f219660e);
                }
            }
        }
        return G0.f406611a;
    }
}
