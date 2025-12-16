package com.avito.android.photo_picker;

import android.content.Context;
import android.content.Intent;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.legacy.service.ImageUploadService;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PhotoPickerIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/x;", "Lcom/avito/android/photo_picker/PhotoPickerIntentFactory;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_picker.x, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C33272x implements PhotoPickerIntentFactory {
    @Inject
    public C33272x() {
    }

    @Override // com.avito.android.photo_picker.PhotoPickerIntentFactory
    @Y61.k
    public final Intent a(@Y61.k Context context, @Y61.k String str, @Y61.k String str2, int i12, int i13, @Y61.l String str3, @Y61.k PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode, boolean z12) {
        Intent intentPutExtra = new Intent(context, (Class<?>) PhotoPickerActivity.class).putExtra("operation_id", str).putExtra("type_id", str2).putExtra("min_photo_count", i12).putExtra("max_photo_count", i13).putExtra("photo_picker_mode", photoPickerMode).putExtra("use_re23_style", z12);
        if (str3 != null) {
            intentPutExtra.putExtra("selected_photo_id", str3);
        }
        return intentPutExtra;
    }

    @Override // com.avito.android.photo_picker.PhotoPickerIntentFactory
    @Y61.k
    public final Intent b(@Y61.k Context context, @Y61.k String str, @Y61.l String str2, boolean z12) {
        Intent intent = new Intent(context, (Class<?>) ImageUploadService.class);
        intent.putExtra("operation_id", str);
        if (str2 != null) {
            intent.putExtra("photo_id", str2);
        }
        intent.putExtra("upload_after_non_restorable_error", z12);
        return intent;
    }
}
