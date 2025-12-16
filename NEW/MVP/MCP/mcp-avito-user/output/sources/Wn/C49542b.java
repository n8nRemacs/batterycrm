package wN;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.R;
import com.avito.android.info.ui.InfoActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InfoIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LwN/b;", "LwN/a;", "_avito_info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wN.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49542b implements InterfaceC49541a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f441422a;

    @Inject
    public C49542b(@k Context context) {
        this.f441422a = context;
    }

    @Override // wN.InterfaceC49541a
    @k
    public final Intent a() {
        return c("data_policy", this.f441422a.getString(R.string.read_data_policy));
    }

    @Override // wN.InterfaceC49541a
    @k
    public final Intent b() {
        return c("oferta", this.f441422a.getString(R.string.read_offer));
    }

    @Override // wN.InterfaceC49541a
    @k
    public final Intent c(@k String str, @k String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("path", str);
        bundle.putString("title", str2);
        return new Intent(this.f441422a, (Class<?>) InfoActivity.class).putExtras(bundle);
    }

    @Override // wN.InterfaceC49541a
    @k
    public final Intent d() {
        return c("apps-license-agreement", this.f441422a.getString(R.string.read_apps_licence));
    }

    @Override // wN.InterfaceC49541a
    @k
    public final Intent e() {
        return c("user_agreement", this.f441422a.getString(R.string.rules_of_avito));
    }
}
