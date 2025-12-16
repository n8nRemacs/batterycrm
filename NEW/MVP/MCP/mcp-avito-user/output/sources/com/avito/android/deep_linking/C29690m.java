package com.avito.android.deep_linking;

import android.net.Uri;
import kotlin.Metadata;

/* compiled from: AppLinkPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.deep_linking.m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29690m<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C29674l f134024b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f134025c;

    public C29690m(C29674l c29674l, Uri uri) {
        this.f134024b = c29674l;
        this.f134025c = uri;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C29674l c29674l = this.f134024b;
        c29674l.d(this.f134025c, c29674l.f132926k);
    }
}
