package com.avito.android.publish.premoderation;

import androidx.compose.runtime.internal.P;
import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.InterfaceC23487e;
import androidx.view.M0;
import com.avito.android.remote.model.adverts.AdvertProactiveModerationResult;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: WrongCategoryViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/premoderation/t;", "Landroidx/lifecycle/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class t extends AbstractC22993a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AdvertProactiveModerationResult.WrongCategorySuggest f238340d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f238341e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final r f238342f;

    @Inject
    public t(@Y61.k InterfaceC23487e interfaceC23487e, @Y61.k AdvertProactiveModerationResult.WrongCategorySuggest wrongCategorySuggest, @Y61.k @com.avito.android.publish.premoderation.di.b String str, @Y61.k r rVar) {
        super(interfaceC23487e, null);
        this.f238340d = wrongCategorySuggest;
        this.f238341e = str;
        this.f238342f = rVar;
    }

    @Override // androidx.view.AbstractC22993a
    @Y61.k
    public final <T extends M0> T create(@Y61.k String str, @Y61.k Class<T> cls, @Y61.k C23060r0 c23060r0) {
        if (!cls.isAssignableFrom(s.class)) {
            throw new IllegalArgumentException(cls.toString());
        }
        return new s(this.f238340d, this.f238341e, this.f238342f, c23060r0);
    }
}
