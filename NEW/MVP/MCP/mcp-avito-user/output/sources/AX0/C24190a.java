package ax0;

import Y61.k;
import Y61.l;
import android.content.Intent;
import com.avito.android.social.D;
import com.avito.android.social.InterfaceC35013e;
import com.avito.android.social.SocialActivity;
import com.avito.android.social.SocialType;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AvitoFakeSocialManagerStub.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lax0/a;", "Lcom/avito/android/social/e;", "<init>", "()V", "_common_social-avitofake-release_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ax0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C24190a implements InterfaceC35013e {
    @Inject
    public C24190a() {
    }

    @Override // com.avito.android.social.D
    @l
    /* renamed from: c */
    public final String getF284422c() {
        return null;
    }

    @Override // com.avito.android.social.D
    @l
    public final String d() {
        return null;
    }

    @Override // com.avito.android.social.D
    public final void e(@k SocialActivity socialActivity, @l Y41.l lVar) {
        throw new IllegalStateException("AvitoFake should not be available in release build");
    }

    @Override // com.avito.android.social.D
    public final boolean g(int i12, int i13, @l Intent intent, @l Y41.l<? super D.b, G0> lVar) {
        return true;
    }

    @Override // com.avito.android.social.InterfaceC35021m
    @k
    public final SocialType getType() {
        return SocialType.f284288k;
    }

    @Override // com.avito.android.social.D
    public final void a() {
    }
}
