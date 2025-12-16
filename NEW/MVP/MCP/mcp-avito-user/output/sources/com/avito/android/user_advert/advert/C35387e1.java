package com.avito.android.user_advert.advert;

import Tv0.InterfaceC15415a;
import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import ur.InterfaceC49101b;

/* compiled from: MyAdvertDetailsResourceProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/e1;", "Lcom/avito/android/user_advert/advert/d1;", "LTv0/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.advert.e1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35387e1 implements InterfaceC35384d1, InterfaceC15415a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f308893a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final nt.f f308894b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49101b f308895c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15415a f308896d;

    @Inject
    public C35387e1(@Y61.k Resources resources, @Y61.k nt.f fVar, @Y61.k InterfaceC49101b interfaceC49101b, @Y61.k InterfaceC15415a interfaceC15415a) {
        this.f308893a = resources;
        this.f308894b = fVar;
        this.f308895c = interfaceC49101b;
        this.f308896d = interfaceC15415a;
    }

    @Override // Tv0.InterfaceC15415a
    @Y61.k
    public final String i() {
        return this.f308896d.i();
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35384d1
    @Y61.k
    public final String u() {
        return this.f308893a.getString(R.string.draft_delete_confirmation);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35384d1
    @Y61.k
    public final String w() {
        return this.f308895c.d() ? this.f308893a.getString(R.string.price_ruble_postfix) : " ".concat(this.f308894b.g0());
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35384d1
    @Y61.k
    public final String x() {
        return this.f308893a.getString(R.string.price_update_error);
    }
}
