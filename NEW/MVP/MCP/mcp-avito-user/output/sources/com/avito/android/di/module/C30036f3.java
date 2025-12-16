package com.avito.android.di.module;

import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.category_parameters.AdditionalAreaParameter;
import com.avito.android.remote.model.category_parameters.AdditionalBooleanParameter;
import com.avito.android.remote.model.category_parameters.AdditionalCategoryParameter;
import com.avito.android.remote.model.category_parameters.AdditionalCharParameter;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.UnknownAdditionalParameter;
import com.avito.android.remote.parse.adapter.C34359b;
import com.avito.android.remote.parse.adapter.C34382z;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapterFactory;
import com.avito.android.remote.parse.adapter.stream_gson.ApiErrorTypeAdapterFactory;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.avito.android.remote.parse.adapter.stream_gson.UserDialogTypeAdapterFactory;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;

/* compiled from: CoreJsonModule_ProvideCommonTypeAdapterFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/di/module/f3;", "Ldagger/internal/h;", "", "Lcom/google/gson/r;", "LX41/o;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.f3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30036f3 implements dagger.internal.h<Set<com.google.gson.r>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f144286b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.P2 f144287a;

    /* compiled from: CoreJsonModule_ProvideCommonTypeAdapterFactoriesFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/f3$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.module.f3$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30036f3(@Y61.k com.avito.android.P2 p22) {
        this.f144287a = p22;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f144287a.get();
        f144286b.getClass();
        int i12 = C30025e3.f144277a;
        new C34382z();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryA = C34382z.a();
        new C34359b();
        RuntimeTypeAdapterFactory.f254218g.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = new RuntimeTypeAdapterFactory(AdditionalCategoryParameter.class);
        runtimeTypeAdapterFactory.b(AdditionalBooleanParameter.class, BooleanParameter.TYPE, null);
        runtimeTypeAdapterFactory.b(AdditionalCharParameter.class, CharParameter.TYPE, null);
        runtimeTypeAdapterFactory.b(AdditionalAreaParameter.class, "area", null);
        runtimeTypeAdapterFactory.f254223f = UnknownAdditionalParameter.class;
        ApiErrorTypeAdapterFactory apiErrorTypeAdapterFactory = new ApiErrorTypeAdapterFactory();
        UserDialogTypeAdapterFactory userDialogTypeAdapterFactory = new UserDialogTypeAdapterFactory();
        com.avito.android.remote.parse.adapter.G.f254182a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, NavigationBarStyle.DisplayType.class);
        optimalRuntimeTypeAdapterFactoryA.b(NavigationBarStyle.DisplayType.LogoWithSearchInput.class, "logoWithSearchInput");
        optimalRuntimeTypeAdapterFactoryA.b(NavigationBarStyle.DisplayType.SearchInput.class, "searchInput");
        optimalRuntimeTypeAdapterFactoryA.b(NavigationBarStyle.DisplayType.SearchWithActionTitle.class, "searchWithActionTitle");
        Set setL0 = C42756l.l0(new com.google.gson.r[]{runtimeTypeAdapterFactoryA, runtimeTypeAdapterFactory, apiErrorTypeAdapterFactory, userDialogTypeAdapterFactory, optimalRuntimeTypeAdapterFactoryA});
        dagger.internal.t.b(setL0, "Cannot return null from a non-@Nullable @Provides method");
        return setL0;
    }
}
