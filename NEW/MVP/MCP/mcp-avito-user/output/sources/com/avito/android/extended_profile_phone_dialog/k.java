package com.avito.android.extended_profile_phone_dialog;

import com.avito.android.remote.N;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ExtendedProfilePhoneInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_phone_dialog/k;", "Ldagger/internal/h;", "Lcom/avito/android/extended_profile_phone_dialog/j;", "a", "_avito_extended-profile-phone-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f151608b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<N> f151609a;

    /* compiled from: ExtendedProfilePhoneInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_phone_dialog/k$a;", "", "<init>", "()V", "_avito_extended-profile-phone-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k Provider<N> provider) {
        this.f151609a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f151609a);
        f151608b.getClass();
        return new j(eVarB);
    }
}
