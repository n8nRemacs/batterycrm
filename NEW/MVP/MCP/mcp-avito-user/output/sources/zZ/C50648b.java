package zz;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.ApiException;
import com.avito.android.util.InterfaceC35741a1;
import com.squareup.anvil.annotations.ContributesBinding;
import h31.j;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ErrorHelper.kt */
@j
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzz/b;", "Lzz/a;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zz.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C50648b implements InterfaceC50647a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35741a1 f444399a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Resources f444400b;

    @Inject
    public C50648b(@k InterfaceC35741a1 interfaceC35741a1, @k Resources resources) {
        this.f444399a = interfaceC35741a1;
        this.f444400b = resources;
    }

    @Override // zz.InterfaceC50647a
    @k
    public final ApiError a(@k Throwable th2) {
        return th2 instanceof ApiException ? ((ApiException) th2).f318522b : com.avito.android.remote.error.j.a(2, com.avito.android.printable_text.b.g(InterfaceC35741a1.a.a(this.f444399a, th2, null, null, 6), this.f444400b), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zz.InterfaceC50647a
    @k
    public final String b(@k ApiError apiError) {
        return c(new ApiException(apiError, null, 2, 0 == true ? 1 : 0));
    }

    @Override // zz.InterfaceC50647a
    @k
    public final String c(@k Throwable th2) {
        return com.avito.android.printable_text.b.g(InterfaceC35741a1.a.a(this.f444399a, th2, null, null, 6), this.f444400b);
    }
}
