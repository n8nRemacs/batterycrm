package com.avito.android.advert_item_actions.actions;

import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.LinkedHashSet;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: HiddenAdvertsStorageImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_item_actions/actions/f;", "LLa/d;", "<init>", "()V", "_avito_advert-item-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements La.d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashSet f85834a = new LinkedHashSet();

    @Inject
    public f() {
    }

    @Override // La.d
    public final boolean b(@k String str) {
        return this.f85834a.contains(str);
    }

    @Override // La.d
    public final void c(@k String str) {
        this.f85834a.add(str);
    }
}
