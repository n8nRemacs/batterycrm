package com.avito.android.authorization.auth;

import kotlin.Metadata;

/* compiled from: AuthInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "count", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.authorization.auth.p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28637p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f93046b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f93047c;

    public C28637p(r rVar, String str) {
        this.f93046b = rVar;
        this.f93047c = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue > 0) {
            this.f93046b.f93053e.c(new GW.a(iIntValue, this.f93047c));
        }
    }
}
