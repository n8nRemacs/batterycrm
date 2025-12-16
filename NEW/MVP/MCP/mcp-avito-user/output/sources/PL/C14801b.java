package Pl;

import Nl.InterfaceC14584a;
import Ol.C14707a;
import Y61.k;
import Y61.l;
import com.avito.android.c2c_trx.deepLinks.AddAutoToC2CTrxLink;
import com.avito.android.remote.model.TypedResult;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: SendDraftToAutoC2CTrxInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPl/b;", "LPl/a;", "_avito_c2c-trx_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pl.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14801b implements InterfaceC14800a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC14584a f13265a;

    @Inject
    public C14801b(@k InterfaceC14584a interfaceC14584a) {
        this.f13265a = interfaceC14584a;
    }

    @Override // Pl.InterfaceC14800a
    @l
    public final Object a(@k AddAutoToC2CTrxLink.Arguments arguments, @k Continuation<? super TypedResult<C14707a>> continuation) {
        return this.f13265a.a(arguments.f113285c, arguments.f113284b, arguments.f113286d, continuation);
    }
}
