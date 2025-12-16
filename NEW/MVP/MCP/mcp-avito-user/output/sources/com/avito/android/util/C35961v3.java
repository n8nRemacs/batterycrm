package com.avito.android.util;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* compiled from: OpenParams.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.v3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35961v3 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: OpenParams.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "Lcom/avito/android/util/OpenParams;", "invoke", "()Lcom/avito/android/util/OpenParams;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.v3$a */
    public static final class a<T> extends kotlin.jvm.internal.N implements Y41.a<T> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Activity f319098l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity) {
            super(0);
            this.f319098l = activity;
        }

        @Override // Y41.a
        public final Object invoke() {
            Activity activity = this.f319098l;
            Bundle extras = activity.getIntent().getExtras();
            OpenParams openParams = extras != null ? (OpenParams) extras.getParcelable("open_params") : null;
            if (openParams != null) {
                return openParams;
            }
            throw new IllegalStateException("No open params provided for ".concat(activity.getClass().getName()).toString());
        }
    }

    @Y61.k
    public static final <T extends OpenParams> InterfaceC42726C<T> a(@Y61.k Activity activity) {
        return C42727D.b(LazyThreadSafetyMode.f406616d, new a(activity));
    }

    @Y61.k
    public static final void b(@Y61.k Intent intent, @Y61.k OpenParams openParams) {
        intent.putExtra("open_params", openParams);
    }
}
