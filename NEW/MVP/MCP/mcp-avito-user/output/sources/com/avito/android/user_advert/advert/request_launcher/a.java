package com.avito.android.user_advert.advert.request_launcher;

import Zd.InterfaceC19542a;
import android.content.Context;
import android.content.Intent;
import com.avito.android.authorization.AuthSource;
import com.avito.android.user_advert.advert.B;
import i.AbstractC41201a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MyAdvertAuthRequestLauncher.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/request_launcher/a;", "Li/a;", "Lkotlin/G0;", "", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends AbstractC41201a<G0, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f310598b;

    public a(B b12) {
        this.f310598b = b12;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, G0 g02) {
        return ((InterfaceC19542a) this.f310598b.get()).a(AuthSource.f92700f);
    }

    @Override // i.AbstractC41201a
    public final Boolean parseResult(int i12, Intent intent) {
        return Boolean.valueOf(i12 == -1);
    }
}
