package com.avito.android.profile_settings_basic;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.profile_settings_basic.K;
import com.avito.android.remote.model.AvatarShape;
import i.AbstractC41201a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BasicProfileSettingsRouter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_basic/B;", "Li/a;", "Lcom/avito/android/profile_settings_basic/K$a;", "Lcom/avito/android/profile_settings_basic/K$b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class B extends AbstractC41201a<K.a, K.b> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f228513b;

    /* compiled from: BasicProfileSettingsRouter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f228514a;

        static {
            int[] iArr = new int[AvatarShape.values().length];
            try {
                iArr[AvatarShape.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarShape.SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f228514a = iArr;
        }
    }

    public B(C c12) {
        this.f228513b = c12;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, K.a aVar) {
        PhotoPickerIntentFactory.CropType cropType;
        int i12 = a.f228514a[aVar.f228570a.ordinal()];
        if (i12 == 1) {
            cropType = PhotoPickerIntentFactory.CropType.f218802b;
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            cropType = PhotoPickerIntentFactory.CropType.f218803c;
        }
        C c12 = this.f228513b;
        Intent intentA = PhotoPickerIntentFactory.a.a(c12.f228534b, c12.f228533a.requireContext(), UUID.randomUUID().toString(), c12.f228535c, 1, 1, null, null, new PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar(cropType), false, 352);
        intentA.setFlags(603979776);
        return intentA;
    }

    @Override // i.AbstractC41201a
    public final K.b parseResult(int i12, Intent intent) {
        if (i12 != -1) {
            return null;
        }
        Uri data = intent != null ? intent.getData() : null;
        if (data != null) {
            return new K.b(data);
        }
        return null;
    }
}
