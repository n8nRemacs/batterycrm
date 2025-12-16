package com.avito.android.profile.edit.avatar;

import Y41.p;
import Y61.k;
import Y61.l;
import android.net.Uri;
import com.avito.android.profile.edit.refactoring.avatar.ImageAvatar;
import com.avito.android.profile.edit.refactoring.avatar.ProfileAvatar;
import com.avito.android.profile.edit.refactoring.avatar.UriAvatar;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.model.Avatar;
import com.avito.android.remote.model.AvatarStatus;
import com.avito.android.remote.model.Image;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.I;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.rx3.Q;
import l41.o;

/* compiled from: AvatarInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/avatar/d;", "Lcom/avito/android/profile/edit/avatar/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements com.avito.android.profile.edit.avatar.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC34401z0 f222052a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.photo_picker.converter.f f222053b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f222054c;

    /* compiled from: AvatarInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/Avatar;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/Avatar;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.edit.avatar.AvatarInteractorImpl$loadAvatar$1", f = "AvatarInteractor.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super Avatar>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f222055q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return d.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super Avatar> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f222055q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC34401z0 interfaceC34401z0 = d.this.f222052a;
                this.f222055q = 1;
                obj = interfaceC34401z0.e(false, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* compiled from: AvatarInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/Avatar;", "it", "Lorg/funktionale/option/a;", "Lcom/avito/android/profile/edit/refactoring/avatar/ProfileAvatar;", "apply", "(Lcom/avito/android/remote/model/Avatar;)Lorg/funktionale/option/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {
        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            Image image;
            Avatar avatar = (Avatar) obj;
            d.this.getClass();
            ImageAvatar imageAvatar = null;
            if (!L.f(avatar.getStatus(), AvatarStatus.MISSING) && (image = avatar.getImage()) != null) {
                imageAvatar = new ImageAvatar(image);
            }
            return org.funktionale.option.e.a(imageAvatar);
        }
    }

    /* compiled from: AvatarInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/profile/edit/refactoring/avatar/ProfileAvatar;", "it", "Ljava/io/File;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Uri f222058b;

        public c(Uri uri) {
            this.f222058b = uri;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return new UriAvatar(this.f222058b);
        }
    }

    public d(@k InterfaceC34401z0 interfaceC34401z0, @k com.avito.android.photo_picker.converter.f fVar, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f222052a = interfaceC34401z0;
        this.f222053b = fVar;
        this.f222054c = interfaceC35745a5;
    }

    @Override // com.avito.android.profile.edit.avatar.a
    @k
    public final I<ProfileAvatar> b(@k Uri uri) {
        io.reactivex.rxjava3.internal.operators.observable.T tS2 = this.f222053b.a(uri).S();
        InterfaceC35745a5 interfaceC35745a5 = this.f222054c;
        return tS2.z(interfaceC35745a5.a()).r(new c(uri)).z(interfaceC35745a5.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    @Override // com.avito.android.profile.edit.avatar.a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.reactivex.rxjava3.core.I<kotlin.G0> e(@Y61.l com.avito.android.profile.edit.refactoring.avatar.ProfileAvatar r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L10
            boolean r1 = r3 instanceof com.avito.android.profile.edit.refactoring.avatar.UriAvatar
            if (r1 == 0) goto La
            com.avito.android.profile.edit.refactoring.avatar.UriAvatar r3 = (com.avito.android.profile.edit.refactoring.avatar.UriAvatar) r3
            goto Lb
        La:
            r3 = r0
        Lb:
            if (r3 == 0) goto L10
            android.net.Uri r3 = r3.f222289b
            goto L11
        L10:
            r3 = r0
        L11:
            com.avito.android.util.a5 r1 = r2.f222054c
            if (r3 == 0) goto L3d
            com.avito.android.photo_picker.converter.f r0 = r2.f222053b
            io.reactivex.rxjava3.core.z r3 = r0.a(r3)
            io.reactivex.rxjava3.internal.operators.observable.T r3 = r3.S()
            io.reactivex.rxjava3.core.H r0 = r1.a()
            io.reactivex.rxjava3.internal.operators.single.W r3 = r3.z(r0)
            com.avito.android.profile.edit.avatar.e<T, R> r0 = com.avito.android.profile.edit.avatar.e.f222059b
            io.reactivex.rxjava3.internal.operators.single.O r3 = r3.r(r0)
            com.avito.android.profile.edit.avatar.g r0 = new com.avito.android.profile.edit.avatar.g
            r0.<init>(r2)
            io.reactivex.rxjava3.internal.operators.single.y r3 = r3.n(r0)
            com.avito.android.profile.edit.avatar.h<T, R> r0 = com.avito.android.profile.edit.avatar.h.f222064b
            io.reactivex.rxjava3.internal.operators.single.O r3 = r3.r(r0)
            goto L56
        L3d:
            com.avito.android.profile.edit.avatar.b r3 = new com.avito.android.profile.edit.avatar.b
            r3.<init>(r2, r0)
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            io.reactivex.rxjava3.internal.operators.single.d r3 = kotlinx.coroutines.rx3.Q.a(r0, r3)
            io.reactivex.rxjava3.core.H r0 = r1.a()
            io.reactivex.rxjava3.internal.operators.single.W r3 = r3.z(r0)
            com.avito.android.profile.edit.avatar.c<T, R> r0 = com.avito.android.profile.edit.avatar.c.f222051b
            io.reactivex.rxjava3.internal.operators.single.O r3 = r3.r(r0)
        L56:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.edit.avatar.d.e(com.avito.android.profile.edit.refactoring.avatar.ProfileAvatar):io.reactivex.rxjava3.core.I");
    }

    @Override // com.avito.android.profile.edit.avatar.a
    @k
    public final I<org.funktionale.option.a<ProfileAvatar>> f() {
        return Q.a(EmptyCoroutineContext.INSTANCE, new a(null)).z(this.f222054c.a()).r(new b());
    }
}
