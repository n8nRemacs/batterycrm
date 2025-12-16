package com.avito.android.profile.pro.impl.screen;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile.pro.ProfileProArguments;
import com.avito.android.profile.pro.impl.screen.item.avito_finance.item.d;
import com.avito.android.profile.pro.impl.screen.item.service_booking_block.c;
import com.avito.android.profile.pro.impl.screen.item.service_booking_block.m;
import com.avito.android.util.C35966w1;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ProfileProFragment.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_profile-pro_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class y {

    /* compiled from: ProfileProFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Bundle, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ProfileProArguments f223753l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ProfileProArguments profileProArguments) {
            super(1);
            this.f223753l = profileProArguments;
        }

        @Override // Y41.l
        public final G0 invoke(Bundle bundle) {
            ProfileProArguments.a aVar = ProfileProArguments.f222422d;
            ProfileProArguments profileProArguments = this.f223753l;
            aVar.getClass();
            bundle.putParcelable("com.avito.android.profile.pro.ProfileProArguments", profileProArguments);
            return G0.f406611a;
        }
    }

    /* compiled from: ProfileProFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements d.a, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f223754b;

        public b(Y41.l lVar) {
            this.f223754b = lVar;
        }

        @Override // com.avito.android.profile.pro.impl.screen.item.avito_finance.item.d.a
        public final /* synthetic */ void a(com.avito.android.avito_finance_user_profile.view.item.g gVar) {
            this.f223754b.invoke(gVar);
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof d.a) && (obj instanceof kotlin.jvm.internal.D)) {
                return L.f(this.f223754b, ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f223754b;
        }

        public final int hashCode() {
            return this.f223754b.hashCode();
        }
    }

    /* compiled from: ProfileProFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements c.a, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f223755b;

        public c(Y41.l lVar) {
            this.f223755b = lVar;
        }

        @Override // com.avito.android.profile.pro.impl.screen.item.service_booking_block.c.a
        public final /* synthetic */ void a(DeepLink deepLink) {
            this.f223755b.invoke(deepLink);
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof c.a) && (obj instanceof kotlin.jvm.internal.D)) {
                return L.f(this.f223755b, ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f223755b;
        }

        public final int hashCode() {
            return this.f223755b.hashCode();
        }
    }

    /* compiled from: ProfileProFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d implements m.a, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f223756b;

        public d(Y41.l lVar) {
            this.f223756b = lVar;
        }

        @Override // com.avito.android.profile.pro.impl.screen.item.service_booking_block.m.a
        public final /* synthetic */ void a(DeepLink deepLink) {
            this.f223756b.invoke(deepLink);
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof m.a) && (obj instanceof kotlin.jvm.internal.D)) {
                return L.f(this.f223756b, ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f223756b;
        }

        public final int hashCode() {
            return this.f223756b.hashCode();
        }
    }

    @Y61.k
    public static final ProfileProFragment a(@Y61.k ProfileProArguments profileProArguments) {
        ProfileProFragment profileProFragment = new ProfileProFragment();
        C35966w1.a(profileProFragment, -1, new a(profileProArguments));
        return profileProFragment;
    }
}
