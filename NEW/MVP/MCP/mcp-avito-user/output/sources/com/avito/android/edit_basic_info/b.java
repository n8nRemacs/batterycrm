package com.avito.android.edit_basic_info;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.avito.android.edit_basic_info.u;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import i.AbstractC41201a;
import java.util.UUID;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: EditBasicInfoAvatarPickerRouter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_basic_info/b;", "Li/a;", "Lkotlin/G0;", "Lcom/avito/android/edit_basic_info/u$a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends AbstractC41201a<G0, u.a> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f146034b;

    public b(c cVar) {
        this.f146034b = cVar;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, G0 g02) {
        c cVar = this.f146034b;
        Intent intentA = PhotoPickerIntentFactory.a.a(cVar.f146036b, cVar.f146035a.requireContext(), UUID.randomUUID().toString(), cVar.f146038d, 1, 1, null, null, new PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar(PhotoPickerIntentFactory.CropType.f218802b), false, 352);
        intentA.setFlags(603979776);
        return intentA;
    }

    @Override // i.AbstractC41201a
    public final u.a parseResult(int i12, Intent intent) {
        if (i12 != -1) {
            return null;
        }
        Uri data = intent != null ? intent.getData() : null;
        if (data != null) {
            return new u.a(data);
        }
        return null;
    }
}
