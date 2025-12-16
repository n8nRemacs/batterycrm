package Lo;

import Y61.k;
import Y61.l;
import android.app.Application;
import android.content.Intent;
import com.avito.android.code_check.CodeCheckActivity;
import com.avito.android.code_check_public.CodeCheckLink;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CodeCheckIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLo/b;", "LLo/a;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Lo.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14421b implements InterfaceC14420a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f10121a;

    @Inject
    public C14421b(@k Application application) {
        this.f10121a = application;
    }

    @Override // Lo.InterfaceC14420a
    @k
    public final Intent a(@k CodeCheckLink.Flow flow, @l CodeCheckLink.Arguments arguments) {
        return new Intent(this.f10121a, (Class<?>) CodeCheckActivity.class).putExtra("codeFlow", flow).putExtra("codeDeeplinkArgs", arguments);
    }
}
