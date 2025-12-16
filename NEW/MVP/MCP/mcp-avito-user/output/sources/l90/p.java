package l90;

import android.app.Application;
import android.content.Intent;
import android.os.Parcelable;
import com.avito.android.L;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.profile.edit.C33313b;
import com.avito.android.profile.edit.EditProfileActivity;
import com.avito.android.profile.remove.ProfileRemoveActivity;
import com.avito.android.profile.user_profile.UserProfileArguments;
import com.avito.android.profile.user_profile.UserProfileFragmentData;
import com.avito.android.social.M;
import com.avito.android.social.SocialActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ProfileIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll90/p;", "Ll90/o;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public class p implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f413560a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final M f413561b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final L f413562c;

    @Inject
    public p(@Y61.k Application application, @Y61.k M m12, @Y61.k L l12) {
        this.f413560a = application;
        this.f413561b = m12;
        this.f413562c = l12;
    }

    @Override // l90.o
    @Y61.k
    public final Intent a(@Y61.k String str) {
        return new Intent(this.f413560a, (Class<?>) SocialActivity.class).putExtra("social_type", (Parcelable) this.f413561b.c(str)).putExtra("social_action", "login");
    }

    @Override // l90.o
    @Y61.k
    public final Intent b() {
        return this.f413562c.d(new UserProfileFragmentData(new UserProfileArguments(null, 1, null)));
    }

    @Override // l90.o
    @Y61.k
    public final Intent c() {
        PhotoPickerIntentFactory.CropType cropType = C33313b.f222065a;
        return new Intent(this.f413560a, (Class<?>) EditProfileActivity.class);
    }

    @Override // l90.o
    @Y61.k
    public final Intent d() {
        return c();
    }

    @Override // l90.o
    @Y61.k
    public final Intent e() {
        return new Intent(this.f413560a, (Class<?>) ProfileRemoveActivity.class);
    }
}
