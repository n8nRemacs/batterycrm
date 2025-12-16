package com.avito.android.authorization.select_social;

import Sm0.InterfaceC15202a;
import com.avito.android.R;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.account.X;
import com.avito.android.authorization.select_social.adapter.SelectSocialField;
import com.avito.android.remote.model.SocialAuthResult;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.registration.ProfileSocial;
import com.avito.android.social.M;
import com.avito.android.util.C35936s;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41998x0;
import io.reactivex.rxjava3.internal.operators.observable.H0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SelectSocialInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/select_social/d;", "Lcom/avito/android/authorization/select_social/c;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<ProfileSocial> f94495a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27663a f94496b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15202a f94497c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final M f94498d;

    /* compiled from: TypedResults.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "Lcom/avito/android/util/P2;", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/util/P2;)Lio/reactivex/rxjava3/core/E;", "com/avito/android/util/a6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f94499b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            P2 p22 = (P2) obj;
            if (p22 instanceof P2.c) {
                return H0.f403644b;
            }
            if (p22 instanceof P2.b) {
                return z.c0(((P2.b) p22).f318720a);
            }
            if (p22 instanceof P2.a) {
                return z.M(C35936s.a(((P2.a) p22).f318719a, null));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: TypedResults.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "Lcom/avito/android/util/P2;", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/util/P2;)Lio/reactivex/rxjava3/core/E;", "com/avito/android/util/a6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f94500b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            P2 p22 = (P2) obj;
            if (p22 instanceof P2.c) {
                return H0.f403644b;
            }
            if (p22 instanceof P2.b) {
                return z.c0(((P2.b) p22).f318720a);
            }
            if (p22 instanceof P2.a) {
                return z.M(C35936s.a(((P2.a) p22).f318719a, null));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Inject
    public d(@Y61.k List<ProfileSocial> list, @Y61.k InterfaceC27663a interfaceC27663a, @Y61.k InterfaceC15202a interfaceC15202a, @Y61.k M m12) {
        this.f94495a = list;
        this.f94496b = interfaceC27663a;
        this.f94497c = interfaceC15202a;
        this.f94498d = m12;
    }

    @Override // com.avito.android.authorization.select_social.c
    @Y61.k
    public final C41998x0 a() {
        List<ProfileSocial> list = this.f94495a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (this.f94498d.b(((ProfileSocial) obj).getType()) != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList2.add(new SelectSocialField.Social(i12, (ProfileSocial) next));
            i12 = i13;
        }
        return z.c0(C42745f0.h0(arrayList2, Collections.singletonList(new SelectSocialField.Text(Long.MAX_VALUE, this.f94497c.getF15141a().getString(R.string.registration_select_social_message)))));
    }

    @Override // com.avito.android.authorization.select_social.c
    @Y61.k
    public final z<SocialAuthResult> b(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4) {
        return this.f94496b.e(new X.b.C2130b(str2, str3, str), null, (124 & 4) != 0 ? null : str4, (124 & 8) != 0 ? null : null, (124 & 16) != 0 ? null : null, (124 & 32) != 0 ? null : null, (124 & 64) != 0 ? null : null).T(a.f94499b, Integer.MAX_VALUE).S().F();
    }

    @Override // com.avito.android.authorization.select_social.c
    @Y61.k
    public final z<SocialAuthResult> c(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        return this.f94496b.e(new X.b.a(str, str2), null, (124 & 4) != 0 ? null : str3, (124 & 8) != 0 ? null : null, (124 & 16) != 0 ? null : null, (124 & 32) != 0 ? null : null, (124 & 64) != 0 ? null : null).T(b.f94500b, Integer.MAX_VALUE).S().F();
    }
}
