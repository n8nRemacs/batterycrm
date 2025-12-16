package DZ;

import Y61.k;
import Y61.l;
import com.avito.android.model_card.screen.domain.d;
import com.avito.android.model_card.screen.domain.e;
import com.avito.android.model_card.screen.ui.ModelCardArguments;
import com.avito.android.remote.model.TypedResult;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ModelCardContentRepositoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDZ/a;", "Lcom/avito/android/model_card/screen/domain/e;", "_avito_model-card_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<GZ.a> f3237a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ModelCardArguments f3238b;

    @Inject
    public a(@k h31.e<GZ.a> eVar, @k ModelCardArguments modelCardArguments) {
        this.f3237a = eVar;
        this.f3238b = modelCardArguments;
    }

    @Override // com.avito.android.model_card.screen.domain.e
    @l
    public final Object a(@k Continuation<? super TypedResult<d>> continuation) {
        return this.f3237a.get().a(this.f3238b.f198115b, continuation);
    }
}
