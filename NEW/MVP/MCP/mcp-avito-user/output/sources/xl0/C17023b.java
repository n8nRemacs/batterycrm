package Xl0;

import Y61.k;
import Yl0.InterfaceC18289l;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.avito.android.remote.user_adverts.generated.api.profile_items_api_v_13.UserAdvertItemRightAction;
import com.avito.android.remote.user_adverts.generated.api.profile_items_api_v_13.UserAdvertItemRightActionV2;
import com.google.gson.r;
import com.yandex.div2.D8;
import dagger.internal.h;
import dagger.internal.t;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: UserAdvertsJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LXl0/b;", "Ldagger/internal/h;", "", "Lcom/google/gson/r;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xl0.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C17023b implements h<Set<r>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C17023b f19055a = new C17023b();

    @Override // javax.inject.Provider
    public final Object get() {
        C17022a.f19054a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, InterfaceC18289l.class);
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC18289l.a.class, "disclaimer_item");
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC18289l.b.class, "user_item");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK = D8.k(UserAdvertItemRightAction.class, UserAdvertItemRightAction.UserAdvertItemRightActionButton.class, "button", UserAdvertItemRightAction.a.class, "icon");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK2 = D8.k(UserAdvertItemRightActionV2.class, UserAdvertItemRightActionV2.UserAdvertItemRightActionV2Button.class, "button", UserAdvertItemRightActionV2.a.class, "icon");
        optimalRuntimeTypeAdapterFactoryK2.b(UserAdvertItemRightActionV2.b.class, "more");
        Set setL0 = C42756l.l0(new OptimalRuntimeTypeAdapterFactory[]{optimalRuntimeTypeAdapterFactoryA, optimalRuntimeTypeAdapterFactoryK, optimalRuntimeTypeAdapterFactoryK2});
        t.b(setL0, "Cannot return null from a non-@Nullable @Provides method");
        return setL0;
    }
}
