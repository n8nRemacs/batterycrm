package com.avito.android;

import Mg0.InterfaceC14487a;
import android.net.Uri;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: RatingDetailsGalleryInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/Y1;", "Lcom/avito/android/W1;", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Y1 implements W1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14487a f67588a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.R0 f67589b;

    @Inject
    public Y1(@Y61.k InterfaceC14487a interfaceC14487a, @Y61.k com.avito.android.util.R0 r02) {
        this.f67588a = interfaceC14487a;
        this.f67589b = r02;
    }

    @Override // com.avito.android.W1
    @Y61.l
    public final Object a(@Y61.k Uri uri, @Y61.k SuspendLambda suspendLambda) {
        return C43259k.g(this.f67589b.a(), new X1(this, uri, null), suspendLambda);
    }
}
