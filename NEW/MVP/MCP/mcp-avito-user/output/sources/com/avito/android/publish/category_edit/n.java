package com.avito.android.publish.category_edit;

import androidx.compose.runtime.internal.P;
import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.InterfaceC23487e;
import androidx.view.M0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.remote.model.Navigation;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CategoryEditViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/category_edit/n;", "Landroidx/lifecycle/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n extends AbstractC22993a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a f232406d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f232407e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f232408f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Navigation f232409g;

    @Inject
    public n(@Y61.k InterfaceC23487e interfaceC23487e, @Y61.k a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k Navigation navigation2) {
        super(interfaceC23487e, null);
        this.f232406d = aVar;
        this.f232407e = interfaceC35745a5;
        this.f232408f = interfaceC33535v;
        this.f232409g = navigation2;
    }

    @Override // androidx.view.AbstractC22993a
    @Y61.k
    public final <T extends M0> T create(@Y61.k String str, @Y61.k Class<T> cls, @Y61.k C23060r0 c23060r0) {
        if (cls.isAssignableFrom(k.class)) {
            return new k(this.f232406d, this.f232409g, this.f232407e, this.f232408f);
        }
        throw new IllegalArgumentException(cls.toString());
    }
}
