package do0;

import AK0.i;
import AK0.l;
import Y61.k;
import android.app.Application;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SafeDealShowDialogPreferences.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldo0/b;", "Ldo0/a;", "_avito_safedeal-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: do0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39768b implements InterfaceC39767a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f394061a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l f394062b;

    @Inject
    public C39768b(@k Application application, @k i iVar, @k l lVar) {
        this.f394061a = lVar;
        this.f394062b = iVar.a(application, "safe_deal_show_dialog_time");
    }
}
