package com.avito.android.quic;

import android.app.Application;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: QuicModule.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class g extends N implements Y41.l<String, SharedPreferences> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Application f246257l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Application application) {
        super(1);
        this.f246257l = application;
    }

    @Override // Y41.l
    public final SharedPreferences invoke(String str) {
        return this.f246257l.getSharedPreferences(str, 0);
    }
}
