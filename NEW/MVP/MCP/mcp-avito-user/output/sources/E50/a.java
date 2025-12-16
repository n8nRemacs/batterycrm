package E50;

import Y61.k;
import Y61.l;
import android.content.Intent;
import com.avito.android.deep_linking.links.PrintableTextUserDialog;
import com.avito.android.passport.deeplinks.PassportSelectBusinessVrfLink;
import com.avito.android.passport.network.model.PassportUserDialogWithProfile;
import com.avito.android.passport.profile_add.merge.domain.MergeFlow;
import kotlin.Metadata;

/* compiled from: PassportIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE50/a;", "", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: PassportIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: E50.a$a, reason: collision with other inner class name */
    public static final class C0213a {
    }

    @k
    Intent a(@k PrintableTextUserDialog printableTextUserDialog);

    @k
    Intent b(@k String str);

    @k
    Intent c();

    @k
    Intent d(@k String str, @l String str2, @k String str3);

    @k
    Intent e(@k PassportUserDialogWithProfile passportUserDialogWithProfile);

    @k
    Intent f(@k PassportSelectBusinessVrfLink.Flow flow, @l String str);

    @k
    Intent g(@k MergeFlow mergeFlow);

    @k
    Intent h(boolean z12);

    @k
    Intent i();

    @k
    Intent j(boolean z12);
}
