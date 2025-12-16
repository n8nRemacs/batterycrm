package com.avito.android.deep_linking;

import Mu.InterfaceC14529b;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Y5;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AppLinkInteractor.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/h;", "Lcom/avito/android/deep_linking/g;", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deep_linking.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29670h implements InterfaceC29669g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14529b f132911a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f132912b;

    @Inject
    public C29670h(@Y61.k InterfaceC14529b interfaceC14529b, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f132911a = interfaceC14529b;
        this.f132912b = interfaceC35745a5;
    }

    @Override // com.avito.android.deep_linking.InterfaceC29669g
    @Y61.k
    public final C41982q1 a(@Y61.k String str, @Y61.l String str2) {
        return Y5.a(this.f132911a.a(str, str2)).x0(this.f132912b.a());
    }
}
