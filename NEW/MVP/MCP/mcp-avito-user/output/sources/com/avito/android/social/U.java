package com.avito.android.social;

import android.content.Intent;
import com.avito.android.social.D;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import com.vk.id.AccessToken;
import com.vk.id.VKID;
import com.vk.id.VKIDUser;
import com.vk.id.auth.VKIDAuthParams;
import com.vk.id.logout.VKIDLogoutCallback;
import com.vk.id.logout.VKIDLogoutFail;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: VkIdSocialManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social/U;", "Lcom/avito/android/social/S;", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class U implements S {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43238h f284293a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public AccessToken f284294b;

    /* compiled from: VkIdSocialManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.social.VkIdSocialManagerImpl$logout$1", f = "VkIdSocialManager.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f284295q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ b f284297s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f284297s = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return U.this.new a(this.f284297s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            VKID companion;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f284295q;
            if (i12 == 0) {
                C42729a0.b(obj);
                U.this.getClass();
                try {
                    companion = VKID.INSTANCE.getInstance();
                } catch (IllegalStateException e12) {
                    V2.f318762a.a("DEFAULT_TAG", "Unable to get VKID instance at VkIdSocialManagerImpl", e12);
                    companion = null;
                }
                VKID vkid = companion;
                if (vkid != null) {
                    this.f284295q = 1;
                    if (VKID.logout$default(vkid, this.f284297s, null, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public U(@Y61.k R0 r02) {
        this.f284293a = kotlinx.coroutines.U.a(r02.c());
    }

    @Override // com.avito.android.social.D
    public final void a() {
        C43259k.d(this.f284293a, null, null, new a(new b(), null), 3);
    }

    @Override // com.avito.android.social.D
    @Y61.l
    /* renamed from: c */
    public final String getF284422c() {
        AccessToken accessToken = this.f284294b;
        if (accessToken != null) {
            return accessToken.getToken();
        }
        return null;
    }

    @Override // com.avito.android.social.D
    @Y61.l
    public final String d() {
        VKIDUser userData;
        AccessToken accessToken = this.f284294b;
        if (accessToken == null || (userData = accessToken.getUserData()) == null) {
            return null;
        }
        return userData.getEmail();
    }

    @Override // com.avito.android.social.D
    public final void e(@Y61.k SocialActivity socialActivity, @Y61.l Y41.l lVar) {
        VKID companion;
        T t12 = new T(this, lVar);
        a();
        VKIDAuthParams.Builder builder = new VKIDAuthParams.Builder();
        builder.setScopes(C42756l.l0(new String[]{"email", "groups"}));
        VKIDAuthParams vKIDAuthParamsBuild = builder.build();
        try {
            companion = VKID.INSTANCE.getInstance();
        } catch (IllegalStateException e12) {
            V2.f318762a.a("DEFAULT_TAG", "Unable to get VKID instance at VkIdSocialManagerImpl", e12);
            companion = null;
        }
        if (companion != null) {
            companion.authorize(socialActivity, t12, vKIDAuthParamsBuild);
        } else {
            ((J) lVar).invoke(D.b.C8495b.f284270a);
        }
    }

    @Override // com.avito.android.social.D
    public final boolean g(int i12, int i13, @Y61.l Intent intent, @Y61.l Y41.l<? super D.b, G0> lVar) {
        return false;
    }

    @Override // com.avito.android.social.InterfaceC35021m
    @Y61.k
    public final SocialType getType() {
        return SocialType.f284285h;
    }

    /* compiled from: VkIdSocialManager.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/social/U$b", "Lcom/vk/id/logout/VKIDLogoutCallback;", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements VKIDLogoutCallback {
        @Override // com.vk.id.logout.VKIDLogoutCallback
        public final void onSuccess() {
        }

        @Override // com.vk.id.logout.VKIDLogoutCallback
        public final void onFail(@Y61.k VKIDLogoutFail vKIDLogoutFail) {
        }
    }
}
