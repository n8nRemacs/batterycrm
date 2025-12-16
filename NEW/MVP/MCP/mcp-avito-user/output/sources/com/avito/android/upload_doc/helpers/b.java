package com.avito.android.upload_doc.helpers;

import android.content.Context;
import android.content.Intent;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.upload_doc.helpers.h;
import i.AbstractC41201a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GigUploadDocPhotoPicker.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/upload_doc/helpers/b;", "Li/a;", "Lcom/avito/android/upload_doc/helpers/h$a;", "Lkotlin/G0;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends AbstractC41201a<h.a, G0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f306791b;

    public b(c cVar) {
        this.f306791b = cVar;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, h.a aVar) {
        h.a aVar2 = aVar;
        c cVar = this.f306791b;
        PhotoPickerIntentFactory photoPickerIntentFactory = cVar.f306793b;
        Context contextRequireContext = cVar.f306792a.requireContext();
        PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd modeAdd = new PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd(new PhotoPickerIntentFactory.AddType.GigDocuments(aVar2.f306809b));
        Intent intentA = PhotoPickerIntentFactory.a.a(photoPickerIntentFactory, contextRequireContext, aVar2.f306808a, "gig upload doc", 0, 1, null, PhotoPickerIntentFactory.CameraType.f218799b, modeAdd, false, 256);
        intentA.setFlags(603979776);
        return intentA;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // i.AbstractC41201a
    public final G0 parseResult(int i12, Intent intent) {
        String stringExtra;
        if (i12 == -1 && intent != null && (stringExtra = intent.getStringExtra("operation_id")) != null) {
            this.f306791b.f306795d.invoke(stringExtra);
        }
        return G0.f406611a;
    }
}
