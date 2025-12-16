package bj0;

import Y61.k;
import Y61.l;
import com.avito.android.related_products.generated.api.favorites_complementary_on_app.UseCase;
import com.squareup.anvil.annotations.ContributesBinding;
import ej0.InterfaceC40118a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: RelatedProductsInteractor.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbj0/h;", "Lbj0/g;", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bj0.h, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C25668h implements InterfaceC25667g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC40118a f57404a;

    @Inject
    public C25668h(@k InterfaceC40118a interfaceC40118a) {
        this.f57404a = interfaceC40118a;
    }

    @Override // bj0.InterfaceC25667g
    @l
    public final Object a(long j12, @k String str, @l String str2, @k Continuation continuation) {
        return this.f57404a.a(str, "contract=Avito; platform=Android; version=26.0", j12, str2, UseCase.ConstructionFavoritesComplementary, continuation);
    }
}
