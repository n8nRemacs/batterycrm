package com.avito.android.publish;

import com.avito.android.publish.drafts.PublishDraftRepository;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import javax.inject.Inject;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: DraftSyncDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/j;", "Lcom/avito/android/publish/g;", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.j, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33874j implements InterfaceC33861g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PublishDraftRepository f237364a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C50213a f237365b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f237366c;

    @Inject
    public C33874j(@Y61.k PublishDraftRepository publishDraftRepository, @Y61.k C50213a c50213a, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f237364a = publishDraftRepository;
        this.f237365b = c50213a;
        this.f237366c = interfaceC35745a5;
    }

    @Override // com.avito.android.publish.InterfaceC33861g
    @Y61.k
    public final C42026y a() {
        return this.f237364a.e().s(this.f237366c.e()).n(new C33865i(this));
    }
}
