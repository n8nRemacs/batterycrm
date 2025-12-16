package com.avito.android.authorization.social_registration.code_check;

import To.InterfaceC15383a;
import com.avito.android.code_check_public.model.Phone;
import com.avito.android.code_check_public.screen.c;
import com.squareup.anvil.annotations.ContributesBinding;
import ie.InterfaceC41389a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SocRegCodeConfirmInteractor.kt */
@com.avito.android.code_check_public.g
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/social_registration/code_check/f;", "Lcom/avito/android/code_check_public/screen/c$b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends c.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41389a f94601a;

    @Inject
    public f(@Y61.k InterfaceC41389a interfaceC41389a) {
        this.f94601a = interfaceC41389a;
    }

    @Override // com.avito.android.code_check_public.screen.c.b
    @Y61.k
    public final InterfaceC43160i<InterfaceC15383a> a(@Y61.k String str, @Y61.l String str2) {
        if ((str2 != null ? Phone.a(str2) : null) != null) {
            return C43175k.G(new e(this, str2, str, null));
        }
        throw new IllegalArgumentException("Phone must be set for SocRegCodeConfirmInteractor");
    }
}
