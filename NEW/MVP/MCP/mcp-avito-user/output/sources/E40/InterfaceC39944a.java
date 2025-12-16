package e40;

import C11.b;
import Y61.k;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.oauth.presentation.OAuthActivity;
import com.avito.android.oauth.presentation.OAuthDetails;
import kotlin.Metadata;

/* compiled from: OAuthComponent.kt */
@C11.b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Le40/a;", "", "a", "b", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* renamed from: e40.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC39944a {

    /* compiled from: OAuthComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le40/a$a;", "Lcom/avito/android/di/h;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @C11.c
    /* renamed from: e40.a$a, reason: collision with other inner class name */
    public interface InterfaceC11052a extends InterfaceC29971h {
        @k
        b i8();
    }

    /* compiled from: OAuthComponent.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le40/a$b;", "", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: e40.a$b */
    public interface b {
        @k
        InterfaceC39944a a(@h31.b @k C28478k c28478k, @h31.b @k OAuthDetails oAuthDetails, @k cv.d dVar);
    }

    void a(@k OAuthActivity oAuthActivity);
}
