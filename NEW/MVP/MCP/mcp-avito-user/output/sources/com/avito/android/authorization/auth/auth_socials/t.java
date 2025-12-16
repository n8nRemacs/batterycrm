package com.avito.android.authorization.auth.auth_socials;

import be.C25637d;
import be.InterfaceC25634a;
import com.avito.android.authorization.auth.auth_socials.entity.AuthSocialsInternalAction;
import com.avito.android.remote.model.AuthSocialInteractionStatus;
import com.avito.android.remote.model.AuthSocialStatus;
import com.avito.android.social.D;
import com.avito.android.social.M;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AuthSocialsReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/auth/auth_socials/t;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/authorization/auth/auth_socials/entity/AuthSocialsInternalAction;", "Lbe/d;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class t implements com.avito.android.arch.mvi.u<AuthSocialsInternalAction, C25637d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final M f92919b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.social.button.g f92920c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Map<String, D> f92921d;

    /* compiled from: AuthSocialsReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92922a;

        static {
            int[] iArr = new int[AuthSocialInteractionStatus.values().length];
            try {
                iArr[AuthSocialInteractionStatus.VISIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AuthSocialInteractionStatus.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f92922a = iArr;
        }
    }

    @Inject
    public t(@Y61.k M m12, @Y61.k com.avito.android.social.button.g gVar, @Y61.k Map<String, D> map) {
        this.f92919b = m12;
        this.f92920c = gVar;
        this.f92921d = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.u
    public final C25637d a(AuthSocialsInternalAction authSocialsInternalAction, C25637d c25637d) {
        InterfaceC25634a.InterfaceC2007a dVar;
        AuthSocialsInternalAction authSocialsInternalAction2 = authSocialsInternalAction;
        C25637d c25637d2 = c25637d;
        if (authSocialsInternalAction2 instanceof AuthSocialsInternalAction.StartAuthSocialsLoading) {
            ArrayList arrayList = new ArrayList(4);
            for (int i12 = 0; i12 < 4; i12++) {
                arrayList.add(InterfaceC25634a.c.f57302a);
            }
            return new C25637d(new C25637d.c(arrayList));
        }
        if (!(authSocialsInternalAction2 instanceof AuthSocialsInternalAction.AuthSocialsLoaded)) {
            if (authSocialsInternalAction2 instanceof AuthSocialsInternalAction.OpenSocial ? true : authSocialsInternalAction2 instanceof AuthSocialsInternalAction.ShowUserDialog) {
                return c25637d2;
            }
            throw new NoWhenBranchMatchedException();
        }
        List<AuthSocialStatus> list = ((AuthSocialsInternalAction.AuthSocialsLoaded) authSocialsInternalAction2).f92895b;
        ArrayList arrayList2 = new ArrayList();
        for (AuthSocialStatus authSocialStatus : list) {
            D d12 = this.f92921d.get(authSocialStatus.getProvider());
            Q q12 = d12 != null ? new Q(authSocialStatus, d12) : null;
            if (q12 != null) {
                arrayList2.add(q12);
            }
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Q q13 = (Q) it.next();
            AuthSocialStatus authSocialStatus2 = (AuthSocialStatus) q13.f406619b;
            D d13 = (D) q13.f406620c;
            int i13 = a.f92922a[authSocialStatus2.getStatus().ordinal()];
            com.avito.android.social.button.g gVar = this.f92920c;
            M m12 = this.f92919b;
            if (i13 == 1) {
                dVar = new InterfaceC25634a.d(m12.d(d13.getType()), gVar.a(d13), authSocialStatus2.getProvider());
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = new InterfaceC25634a.b(m12.d(d13.getType()), gVar.a(d13), authSocialStatus2.getDisabledUserDialog(), !r9.f92896c);
            }
            arrayList3.add(dVar);
        }
        return new C25637d(new C25637d.b(arrayList3));
    }
}
