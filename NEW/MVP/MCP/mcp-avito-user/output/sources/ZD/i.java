package Zd;

import android.content.Intent;
import android.os.Parcelable;
import com.avito.android.authorization.AuthScreenMode;
import com.avito.android.authorization.SocialRegistrationSuggestsParams;
import com.avito.android.authorization.confirm_3fa.ConfirmEmailList;
import com.avito.android.deep_linking.links.auth.AutoRecoveryLink;
import com.avito.android.remote.model.TfaSource;
import com.avito.android.remote.model.registration.ProfileSocial;
import java.util.List;
import kotlin.Metadata;

/* compiled from: InternalAuthIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZd/i;", "", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface i {

    /* compiled from: InternalAuthIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    Intent a(@Y61.k Intent intent, @Y61.k String str, @Y61.k String str2, boolean z12);

    @Y61.k
    Intent b(@Y61.k String str, @Y61.k String str2, @Y61.l String str3);

    @Y61.k
    Intent c(@Y61.k String str);

    @Y61.k
    Intent d(@Y61.k AutoRecoveryLink.Source source);

    @Y61.k
    Intent e(boolean z12);

    @Y61.k
    Intent f(@Y61.k Intent intent, @Y61.k List<ProfileSocial> list, @Y61.l String str);

    @Y61.k
    Intent g(@Y61.k TfaSource tfaSource);

    @Y61.k
    Intent h(@Y61.k ConfirmEmailList confirmEmailList);

    @Y61.k
    Intent i(@Y61.l Intent intent, @Y61.l String str, @Y61.l Parcelable parcelable, @Y61.k AuthScreenMode authScreenMode);

    @Y61.k
    Intent j(@Y61.k Intent intent, @Y61.l String str, @Y61.l String str2, boolean z12, @Y61.l String str3, boolean z13, @Y61.l String str4, @Y61.l String str5);

    @Y61.k
    Intent k(@Y61.l String str, @Y61.l String str2, @Y61.l String str3);

    @Y61.k
    Intent l(@Y61.k Intent intent, @Y61.k String str, @Y61.k String str2);

    @Y61.k
    Intent m(@Y61.k Intent intent, @Y61.k SocialRegistrationSuggestsParams socialRegistrationSuggestsParams);
}
