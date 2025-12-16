package Tv0;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.util.C;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l90.n;

/* compiled from: SupportEmailResourceProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTv0/b;", "LTv0/a;", "_avito_resource-providers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Tv0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15416b implements InterfaceC15415a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Resources f16015a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final n f16016b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C f16017c;

    @Inject
    public C15416b(@k Resources resources, @k n nVar, @k C c12) {
        this.f16015a = resources;
        this.f16016b = nVar;
        this.f16017c = c12;
    }

    @Override // Tv0.InterfaceC15415a
    @k
    public final String i() {
        StringBuilder sb2 = new StringBuilder("\n_______\n");
        Resources resources = this.f16015a;
        sb2.append(resources.getString(R.string.support_email_disclaimer));
        sb2.append('\n');
        C c12 = this.f16017c;
        sb2.append(resources.getString(R.string.support_email_device_model, c12.S()));
        sb2.append('\n');
        sb2.append(resources.getString(R.string.support_email_os_version, c12.getVersion()));
        sb2.append('\n');
        sb2.append(resources.getString(R.string.support_email_app_version, c12.b()));
        sb2.append('\n');
        n nVar = this.f16016b;
        if (nVar.e().getEmail() != null) {
            sb2.append(resources.getString(R.string.support_email_user, nVar.e().getEmail()));
            sb2.append('\n');
        }
        sb2.append("_______\n");
        return sb2.toString();
    }
}
