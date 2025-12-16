package com.avito.android.authorization.select_profile;

import com.avito.android.R;
import com.avito.android.authorization.select_profile.adapter.AttributeParams;
import com.avito.android.authorization.select_profile.adapter.SelectProfileField;
import com.avito.android.deep_linking.links.HelpCenterUrlShowLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.registration.ProfileSocial;
import com.avito.android.remote.model.registration.RegisteredProfile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import le.C43737b;
import le.C43739d;
import le.InterfaceC43738c;
import oe.C44763a;

/* compiled from: SelectProfileInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lle/c$b;", "result", "Loe/a;", "apply", "(Lle/c$b;)Loe/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f94291b;

    public d(g gVar) {
        this.f94291b = gVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        InterfaceC43738c.b bVar = (InterfaceC43738c.b) obj;
        boolean isPassport = bVar.getProfile().getIsPassport();
        this.f94291b.getClass();
        SelectProfileField.Title title = new SelectProfileField.Title(9223372036854775805L, com.avito.android.printable_text.b.c(R.string.registration_select_passport_profile_title, new Serializable[0]));
        ArrayList arrayList = null;
        SelectProfileField.Text text = new SelectProfileField.Text(Long.MAX_VALUE, com.avito.android.printable_text.b.c(R.string.registration_select_passport_profile_message, new Serializable[0]), isPassport ? new AttributeParams(null, R.string.registration_passport_suggests_create_link_text, new HelpCenterUrlShowLink("sections/349?articleId=2806"), 1, null) : null);
        C43737b profile = bVar.getProfile();
        String name = profile.getName();
        boolean isPassport2 = profile.getIsPassport();
        String description = profile.getDescription();
        Image avatar = profile.getAvatar();
        String login = profile.getLogin();
        List<C43739d> listF = profile.f();
        if (listF != null) {
            List<C43739d> list = listF;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (C43739d c43739d : list) {
                arrayList.add(new ProfileSocial(c43739d.getType(), c43739d.getTitle()));
            }
        }
        return new C44763a(C42745f0.i0(new SelectProfileField.Profile(0L, new RegisteredProfile(name, description, avatar, login, arrayList, Boolean.valueOf(profile.getNeedWarning()), Boolean.valueOf(isPassport2))), C42745f0.U(title, text)), bVar.getWarning());
    }
}
