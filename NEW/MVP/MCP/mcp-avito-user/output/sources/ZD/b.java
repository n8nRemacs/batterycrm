package Zd;

import android.app.Application;
import android.content.Intent;
import android.os.Parcelable;
import com.avito.android.authorization.AuthScreenMode;
import com.avito.android.authorization.AuthSource;
import com.avito.android.authorization.reset_password.ResetPasswordActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: AuthIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZd/b;", "LZd/a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements InterfaceC19542a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f20310a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final i f20311b;

    @Inject
    public b(@Y61.k Application application, @Y61.k i iVar) {
        this.f20310a = application;
        this.f20311b = iVar;
    }

    @Override // Zd.InterfaceC19542a
    @Y61.k
    public final Intent a(@Y61.k AuthSource authSource) {
        AuthScreenMode authScreenMode = AuthScreenMode.f92662b;
        return this.f20311b.i(null, authSource.f92737b, null, authScreenMode);
    }

    @Override // Zd.InterfaceC19542a
    @Y61.k
    @InterfaceC42830m
    public final Intent b(@Y61.l Parcelable parcelable, @Y61.l String str) {
        return this.f20311b.i(null, str, parcelable, AuthScreenMode.f92662b);
    }

    @Override // Zd.InterfaceC19542a
    @Y61.k
    public final Intent c(@Y61.l String str, @Y61.l String str2, boolean z12) {
        return new Intent(this.f20310a, (Class<?>) ResetPasswordActivity.class).putExtra("login", str).putExtra("src", str2).putExtra("skipLoginEntry", z12);
    }

    @Override // Zd.InterfaceC19542a
    @Y61.k
    public final Intent d() {
        AuthSource authSource = AuthSource.f92694c;
        return this.f20311b.i(null, "main_start_onboarding", null, AuthScreenMode.f92663c);
    }

    @Override // Zd.InterfaceC19542a
    @Y61.k
    @InterfaceC42830m
    public final Intent e(@Y61.l AuthSource authSource, @Y61.l Intent intent) {
        return this.f20311b.i(intent, authSource != null ? authSource.f92737b : null, null, AuthScreenMode.f92662b);
    }
}
