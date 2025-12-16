package com.avito.android.dialog;

import android.content.DialogInterface;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DialogPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class k extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f144778l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.s<DeepLink> f144779m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Action f144780n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(DialogInterface dialogInterface, io.reactivex.rxjava3.core.s<DeepLink> sVar, Action action) {
        super(0);
        this.f144778l = dialogInterface;
        this.f144779m = sVar;
        this.f144780n = action;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f144778l.dismiss();
        this.f144779m.onSuccess(this.f144780n.getDeepLink());
        return G0.f406611a;
    }
}
