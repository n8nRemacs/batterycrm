package com.avito.android.bxcontent.serp;

import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: FilterHintToastSessionStorage.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/serp/b;", "Lcom/avito/android/bxcontent/serp/a;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f112912a;

    @Inject
    public b() {
    }

    @Override // com.avito.android.bxcontent.serp.a
    /* renamed from: a, reason: from getter */
    public final boolean getF112912a() {
        return this.f112912a;
    }

    @Override // com.avito.android.bxcontent.serp.a
    public final void b() {
        this.f112912a = true;
    }
}
