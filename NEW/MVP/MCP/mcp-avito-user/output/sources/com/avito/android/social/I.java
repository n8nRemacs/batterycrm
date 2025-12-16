package com.avito.android.social;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.social.D;
import com.avito.android.social.H;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: SocialActivityPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social/I;", "Lcom/avito/android/social/H;", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class I implements H {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final D f284272a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public SocialActivity f284273b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public SocialType f284274c;

    /* compiled from: SocialActivityPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/social/D$b;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/social/D$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<D.b, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(D.b bVar) {
            I i12 = I.this;
            i12.e(bVar, i12.f284272a);
            return G0.f406611a;
        }
    }

    public I(@Y61.k D d12, @Y61.l Bundle bundle) {
        this.f284272a = d12;
        Serializable serializable = bundle != null ? bundle.getSerializable("social_type") : null;
        this.f284274c = serializable instanceof SocialType ? (SocialType) serializable : null;
    }

    @Override // com.avito.android.social.H
    @Y61.k
    public final Bundle H() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("social_type", this.f284274c);
        return bundle;
    }

    @Override // com.avito.android.social.H
    public final void a() {
        this.f284272a.a();
    }

    @Override // com.avito.android.social.H
    public final void b(@Y61.k SocialActivity socialActivity) {
        this.f284273b = socialActivity;
    }

    @Override // com.avito.android.social.H
    public final void c() {
        D d12 = this.f284272a;
        this.f284274c = d12.getType();
        SocialActivity socialActivity = this.f284273b;
        if (socialActivity != null) {
            d12.e(socialActivity, new J(this, d12));
        }
    }

    @Override // com.avito.android.social.H
    public final void c0() throws IOException {
        this.f284273b = null;
        D d12 = this.f284272a;
        Closeable closeable = d12 instanceof Closeable ? (Closeable) d12 : null;
        if (closeable != null) {
            closeable.close();
        }
    }

    @Override // com.avito.android.social.H
    public final boolean d(int i12, int i13, @Y61.l Intent intent) {
        return this.f284272a.g(i12, i13, intent, new a());
    }

    public final G0 e(D.b bVar, D d12) {
        if (!(bVar instanceof D.b.c)) {
            if (bVar instanceof D.b.C8495b) {
                SocialActivity socialActivity = this.f284273b;
                if (socialActivity != null) {
                    socialActivity.setResult(1, new Intent().putExtra("extra_social_type", (Parcelable) d12.getType()));
                    socialActivity.finish();
                    return G0.f406611a;
                }
            } else {
                if (!(bVar instanceof D.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                SocialActivity socialActivity2 = this.f284273b;
                if (socialActivity2 != null) {
                    socialActivity2.setResult(0, new Intent().putExtra("extra_social_type", (Parcelable) d12.getType()));
                    socialActivity2.finish();
                    return G0.f406611a;
                }
            }
            return null;
        }
        String f284432c = d12.getF284415b();
        String strD = d12.d();
        if ((f284432c == null || f284432c.length() == 0) && !(d12 instanceof InterfaceC35014f)) {
            e(D.b.C8495b.f284270a, d12);
        } else if (d12 instanceof InterfaceC35009a) {
            SocialActivity socialActivity3 = this.f284273b;
            if (socialActivity3 != null) {
                H.a.C8496a.a(socialActivity3, d12.getType(), f284432c == null ? "" : f284432c, strD, ((InterfaceC35009a) d12).getF284322a(), null, null, null, null, 240);
            }
        } else if (d12 instanceof InterfaceC35014f) {
            SocialActivity socialActivity4 = this.f284273b;
            if (socialActivity4 != null) {
                InterfaceC35014f interfaceC35014f = (InterfaceC35014f) d12;
                H.a.C8496a.a(socialActivity4, d12.getType(), "", strD, null, f284432c, interfaceC35014f.getF284416c(), interfaceC35014f.getF284417d(), interfaceC35014f.getF284418e(), 8);
            }
        } else {
            SocialActivity socialActivity5 = this.f284273b;
            if (socialActivity5 != null) {
                H.a.C8496a.a(socialActivity5, d12.getType(), f284432c == null ? "" : f284432c, strD, null, null, null, null, null, 248);
            }
        }
        return G0.f406611a;
    }
}
