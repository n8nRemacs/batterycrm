package l90;

import android.app.Application;
import android.content.Intent;
import com.avito.android.L;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.profile.edit.C33313b;
import com.avito.android.profile.user_profile.CardToOpenFromProfile;
import com.avito.android.profile.user_profile.UserProfileArguments;
import com.avito.android.profile.user_profile.UserProfileFragmentData;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InternalProfileIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll90/d;", "Ll90/c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f413548a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final L f413549b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PhotoPickerIntentFactory f413550c;

    @Inject
    public d(@Y61.k Application application, @Y61.k L l12, @Y61.k PhotoPickerIntentFactory photoPickerIntentFactory) {
        this.f413548a = application;
        this.f413549b = l12;
        this.f413550c = photoPickerIntentFactory;
    }

    @Override // l90.c
    @Y61.k
    public final Intent a(@Y61.k String str) {
        return PhotoPickerIntentFactory.a.a(this.f413550c, this.f413548a, str, "profile", 1, 1, null, null, new PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar(C33313b.f222065a), false, 352);
    }

    @Override // l90.c
    @Y61.k
    public final Intent b() {
        return this.f413549b.d(new UserProfileFragmentData(new UserProfileArguments(CardToOpenFromProfile.f224195c)));
    }

    @Override // l90.c
    @Y61.k
    public final Intent c(@Y61.k String str) {
        return PhotoPickerIntentFactory.a.a(this.f413550c, this.f413548a, str, "profile", 1, 1, null, null, new PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar(C33313b.f222066b), false, 352);
    }
}
