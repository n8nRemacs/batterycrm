package com.avito.android.messenger.blacklist.mvi.adapter.blocked_user;

import EY.a;
import TV0.g;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BlockedUserBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/adapter/blocked_user/b;", "LTV0/b;", "Lcom/avito/android/messenger/blacklist/mvi/adapter/blocked_user/g;", "LEY/a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements TV0.b<g, a.C0238a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f186397a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<h> f186398b = new g.a<>(R.layout.messenger_blacklist_blocked_user, a.f186396l);

    @Inject
    public b(@k e eVar) {
        this.f186397a = eVar;
    }

    @Override // TV0.b
    @k
    public final TV0.d<g, a.C0238a> a() {
        return this.f186397a;
    }

    @Override // TV0.b
    @k
    public final g.a<h> b() {
        return this.f186398b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof a.C0238a;
    }
}
