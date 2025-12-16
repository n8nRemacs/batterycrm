package com.avito.android.oauth.presentation;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.oauth.presentation.mvi.y;
import com.avito.android.oauth.presentation.mvi.z;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OAuthViewModel_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/oauth/presentation/d;", "Ldagger/internal/h;", "Lcom/avito/android/oauth/presentation/c;", "a", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements h<c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f208246b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final z f208247a;

    /* compiled from: OAuthViewModel_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/oauth/presentation/d$a;", "", "<init>", "()V", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k z zVar) {
        this.f208247a = zVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        y yVar = (y) this.f208247a.get();
        f208246b.getClass();
        return new c(yVar, null, 2, null);
    }
}
