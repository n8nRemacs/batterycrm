package com.avito.android.social;

import android.content.Intent;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.social.D;
import com.avito.android.social.I;
import com.avito.android.social.apple.AppleAuthActivity;
import com.avito.android.util.C35974x2;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AppleSignInManager.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/social/b;", "Lcom/avito/android/social/a;", "<init>", "()V", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.social.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35010b implements InterfaceC35009a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public String f284322a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public String f284323b;

    @Inject
    public C35010b() {
    }

    @Override // com.avito.android.social.D
    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getF284323b() {
        return this.f284323b;
    }

    @Override // com.avito.android.social.D
    @Y61.l
    public final String d() {
        return null;
    }

    @Override // com.avito.android.social.D
    public final void e(@Y61.k SocialActivity socialActivity, @Y61.l Y41.l lVar) {
        AppleAuthActivity.f284303b.getClass();
        Intent intent = new Intent(socialActivity, (Class<?>) AppleAuthActivity.class);
        try {
            C35974x2.d(intent);
            socialActivity.startActivityForResult(intent, 1008);
        } catch (Exception e12) {
            V2.f318762a.a("APPLE_SIGN_IN_MANAGER", "", e12);
        }
    }

    @Override // com.avito.android.social.InterfaceC35009a
    @Y61.l
    /* renamed from: f, reason: from getter */
    public final String getF284322a() {
        return this.f284322a;
    }

    @Override // com.avito.android.social.D
    public final boolean g(int i12, int i13, @Y61.l Intent intent, @Y61.l Y41.l<? super D.b, G0> lVar) {
        if (i12 != 1008) {
            return false;
        }
        if (i13 != -1) {
            if (i13 != 0) {
                ((I.a) lVar).invoke(D.b.C8495b.f284270a);
                return true;
            }
            ((I.a) lVar).invoke(D.b.a.f284269a);
            return true;
        }
        this.f284323b = intent != null ? intent.getStringExtra("token") : null;
        this.f284322a = intent != null ? intent.getStringExtra(ChannelContext.UserToUser.TYPE) : null;
        String str = this.f284323b;
        if (str == null || str.length() == 0) {
            ((I.a) lVar).invoke(D.b.C8495b.f284270a);
            return true;
        }
        ((I.a) lVar).invoke(D.b.c.f284271a);
        return true;
    }

    @Override // com.avito.android.social.InterfaceC35021m
    @Y61.k
    public final SocialType getType() {
        return SocialType.f284287j;
    }

    @Override // com.avito.android.social.D
    public final void a() {
    }
}
