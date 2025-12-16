package com.avito.android.extended_profile_selection_create.image;

import JA.a;
import android.content.Context;
import android.content.Intent;
import com.avito.android.extended_profile_selection_create.image.o;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import i.AbstractC41201a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSetSelectionImageRouter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/image/i;", "Li/a;", "Lcom/avito/android/extended_profile_selection_create/image/o$a;", "Lkotlin/G0;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends AbstractC41201a<o.a, G0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f151740b;

    public i(j jVar) {
        this.f151740b = jVar;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, o.a aVar) {
        j jVar = this.f151740b;
        PhotoPickerIntentFactory photoPickerIntentFactory = jVar.f151742b;
        Context contextRequireContext = jVar.f151741a.requireContext();
        PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd modeAdd = new PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd(null, 1, null);
        Intent intentA = PhotoPickerIntentFactory.a.a(photoPickerIntentFactory, contextRequireContext, aVar.f151802a, jVar.f151744d, 0, 1, null, PhotoPickerIntentFactory.CameraType.f218799b, modeAdd, false, 256);
        intentA.setFlags(603979776);
        return intentA;
    }

    @Override // i.AbstractC41201a
    public final G0 parseResult(int i12, Intent intent) {
        String stringExtra;
        if (i12 == -1 && intent != null && (stringExtra = intent.getStringExtra("operation_id")) != null) {
            this.f151740b.f151745e.invoke(new a.d(stringExtra));
        }
        return G0.f406611a;
    }
}
