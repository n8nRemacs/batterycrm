package iL;

import Y61.k;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.avito.android.iac_dialer.impl_module.screens.call_screen.IacCallScreenArgument;
import com.avito.android.iac_dialer_root.impl_module.activity.argumet_ver_241206.IacCallActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import lL.InterfaceC43652a;

/* compiled from: IacCallActivityIntentFactoryImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LiL/a;", "LlL/a;", "_avito_iac-dialer-root_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iL.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C41313a implements InterfaceC43652a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f398504a;

    @Inject
    public C41313a(@k Context context) {
        this.f398504a = context;
    }

    @Override // lL.InterfaceC43652a
    @k
    public final Intent a(@k IacCallScreenArgument iacCallScreenArgument) {
        IacCallActivity.f166874q.getClass();
        return new Intent(this.f398504a, (Class<?>) IacCallActivity.class).putExtra("iac_argument", iacCallScreenArgument).addFlags(268435456).addFlags(32768);
    }

    @Override // lL.InterfaceC43652a
    public final boolean b(@k Activity activity) {
        return activity instanceof IacCallActivity;
    }
}
